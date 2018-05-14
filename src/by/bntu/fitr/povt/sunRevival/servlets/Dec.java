package by.bntu.fitr.povt.sunRevival.servlets;

import by.bntu.fitr.povt.sunRevival.Logic.Counter;
import by.bntu.fitr.povt.sunRevival.Logic.God;
import by.bntu.fitr.povt.sunRevival.Logic.Logic;
import by.bntu.fitr.povt.sunRevival.login.ConnectionProvider;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/Dec")
public class Dec extends HttpServlet {
    
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (LoginRegister.customer != null) {
            String submitType = request.getParameter("button");
            String button = request.getParameter("searchButton");
            
            String delete = request.getParameter("deleteButton");
            
            request.setAttribute("priceOfTree", "Price of tree " + Counter.countPriceOfTree(Logic.getDictionary()));
            request.setAttribute("priceOfBalls", "Price of Balls " + Counter.countPercentOfBall(Logic.getDictionary()));
            request.setAttribute("priceOfCandies", "Price of Candies " + Counter.countPercentOfCandy(Logic.getDictionary()));
            request.setAttribute("priceOfFlashlights", "Ppice of Flashlights " + Counter.countPercentOfFlashlight(Logic.getDictionary()));
            request.setAttribute("percentOfBalls", "Percent of Balls " + Counter.countPriceOfCandy(Logic.getDictionary()));
            request.setAttribute("percentOfCandies", "Percent of Candies " + Counter.countPriceOfFlashLight(Logic.getDictionary()));
            request.setAttribute("percentOfFlashlights", "Percent of Flashlight " + Counter.countPriceOfBall(Logic.getDictionary()));
            
            
            request.setAttribute("name", LoginRegister.customer.getLogin());
            
            ConnectionProvider cd = new ConnectionProvider();
            
            
            if ("Delete".equals(delete)) {
                try {
                    int deleteCount = Integer.parseInt(request.getParameter("delete"));
                    LoginRegister.logic.addEmpty(deleteCount);
                    try {
                        cd.deleteDecoration(deleteCount, LoginRegister.customer);
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                } catch (Exception e) {
                    request.setAttribute("SearchYourselfOrAbsent", "Enter number");
                    request.getRequestDispatcher("welcome.jsp").forward(request, response);
                }
                
            }
            
            if ("Search".equals(button)) {
                String guestName = request.getParameter("search");
                LoginRegister.logic.clearSearchDictionary();
                if (guestName.equals(LoginRegister.customer.getLogin())) {
                    request.setAttribute("SearchYourselfOrAbsent", "It is you!");
                    
                } else if (cd.Search(guestName)) {
                    
                    
                    for (int i = 1; i <= LoginRegister.logic.getMaxCount(); i++) {
                        
                        request.setAttribute("status" + i, i + LoginRegister.logic.getElementSearch(i));
                    }
                    request.setAttribute("searchpriceOfTree", "Price of tree " + String.format("%.2f", Counter.countPriceOfTree(Logic.getDictionary())));
                    request.setAttribute("searchpriceOfBalls", "Price of Balls " + String.format("%.2f", Counter.countPriceOfBall(Logic.getDictionary())));
                    request.setAttribute("searchpriceOfCandies", "Price of Candies " + String.format("%.2f", Counter.countPriceOfCandy(Logic.getDictionary())));
                    request.setAttribute("searchpriceOfFlashlights", "Price of Flashlights " + String.format("%.2f", Counter.countPriceOfFlashLight(Logic.getDictionary())));
                    request.setAttribute("searchpercentOfBalls", "Percent of Balls " + String.format("%.2f", Counter.countPercentOfBall(Logic.getDictionary())));
                    request.setAttribute("searchpercentOfCandies", "Percent of Candies " + String.format("%.2f", Counter.countPercentOfCandy(Logic.getDictionary())));
                    request.setAttribute("searchpercentOfFlashlights", "Percent of Flashlight " + String.format("%.2f", Counter.countPercentOfFlashlight(Logic.getDictionary())));
                    
                    request.getRequestDispatcher("guest.jsp").forward(request, response);
                } else {
                    request.setAttribute("SearchYourselfOrAbsent", "User not found");
                }
            }
            if (LoginRegister.logic.getCount() >= LoginRegister.logic.getMaxCount()) {
                
                
                request.setAttribute("ErrorMessage", "A lot of toys");
            }
            if (LoginRegister.logic.getCount() < LoginRegister.logic.getMaxCount() && submitType != null) {
                LoginRegister.logic.add(God.greate(submitType));
                try {
                    
                    cd.insertDecoration(LoginRegister.logic.getCountNow(), submitType, LoginRegister.customer);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            
            
            for (int i = 1; i <= LoginRegister.logic.getMaxCount(); i++) {
                request.setAttribute("status" + i, i + LoginRegister.logic.getElement(i));
                
            }
            
            request.setAttribute("priceOfTree", "Price of tree " + String.format("%.2f", Counter.countPriceOfTree(Logic.getDictionary())));
            request.setAttribute("priceOfBalls", "Price of Balls " + String.format("%.2f", Counter.countPriceOfBall(Logic.getDictionary())));
            request.setAttribute("priceOfCandies", "Price of Candies " + String.format("%.2f", Counter.countPriceOfCandy(Logic.getDictionary())));
            request.setAttribute("priceOfFlashlights", "Price of Flashlights " + String.format("%.2f", Counter.countPriceOfFlashLight(Logic.getDictionary())));
            request.setAttribute("percentOfBalls", "Percent of Balls " + String.format("%.2f", Counter.countPercentOfBall(Logic.getDictionary())));
            request.setAttribute("percentOfCandies", "Percent of Candies " + String.format("%.2f", Counter.countPercentOfCandy(Logic.getDictionary())));
            request.setAttribute("percentOfFlashlights", "Percent of Flashlight " + String.format("%.2f", Counter.countPercentOfFlashlight(Logic.getDictionary())));
            
            request.getRequestDispatcher("welcome.jsp").forward(request, response);
        } else {
            request.setAttribute("message", "Authorized please!!!");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
        
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
    }
    
}

