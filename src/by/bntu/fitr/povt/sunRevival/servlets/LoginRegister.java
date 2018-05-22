package by.bntu.fitr.povt.sunRevival.servlets;

import by.bntu.fitr.povt.sunRevival.Logic.Counter;
import by.bntu.fitr.povt.sunRevival.Logic.Logic;
import by.bntu.fitr.povt.sunRevival.Logic.Rounder;
import by.bntu.fitr.povt.sunRevival.login.ConnectionProvider;
import by.bntu.fitr.povt.sunRevival.login.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/LoginRegister")
public class LoginRegister extends HttpServlet {
    public static Customer customer;
    public static Logic logic = new Logic();
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ConnectionProvider cd = new ConnectionProvider();
        
        String password = "";
        String password1 = "";
        String password2 = "";
        String submitType = "";
        String submitType1 = "";
        String userName = request.getParameter("username");
        password = request.getParameter("password");
        password1 = request.getParameter("password1");
        password2 = request.getParameter("password2");
        submitType = request.getParameter("login");
        submitType1 = request.getParameter("register");
        Logic.reInsert();
        Logic.clearDictionary();
        Logic.setCount(1);
        
        
        if ("Login".equals(submitType) && !userName.equals("") && !password.equals("")) {
            try {
                customer = new Customer(userName, password);
                
                if (cd.login(customer)) {
                    for (int i = 1; i <= Logic.getMaxCount(); i++) {
                        request.setAttribute("status" + i, i + Logic.getElement(i));
                        
                    }
                    request.setAttribute("name", LoginRegister.customer.getLogin());
                    
                    request.setAttribute("priceOfTree", "Price of tree " + Rounder.round(Counter.countPriceOfTree(Logic.getDictionary())));
                    request.setAttribute("priceOfBalls", "Price of Balls " + Rounder.round( Counter.countPriceOfBall(Logic.getDictionary())));
                    request.setAttribute("priceOfCandies", "Price of Candies " + Rounder.round(Counter.countPriceOfCandy(Logic.getDictionary())));
                    request.setAttribute("priceOfFlashlights", "Price of Flashlights " + Rounder.round( Counter.countPriceOfFlashLight(Logic.getDictionary())));
                    request.setAttribute("percentOfBalls", "Percent of Balls " + Rounder.round( Counter.countPercentOfBall(Logic.getDictionary())));
                    request.setAttribute("percentOfCandies", "Percent of Candies " + Rounder.round( Counter.countPercentOfCandy(Logic.getDictionary())));
                    request.setAttribute("percentOfFlashlights", "Percent of Flashlight " + Rounder.round( Counter.countPercentOfFlashlight(Logic.getDictionary())));
                    request.getRequestDispatcher("welcome.jsp").forward(request, response);
                } else {
                    request.setAttribute("message", "Data Not Found");
                    request.getRequestDispatcher("login.jsp").forward(request, response);
                }
                
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else if ("Registration".equals(submitType1) && password1.length() > 0 && password1.equals(password2)) {
            
            try {
                customer = new Customer(userName, password1);
                cd.insertCustomer(customer);
                request.setAttribute("successMessage", "Registration Done");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            request.setAttribute("message", "Data Not Found");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
        
    }
    
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
    }
    
}
