package by.bntu.fitr.povt.sunRevival.servlets;

import by.bntu.fitr.povt.sunRevival.Logic.Counter;
import by.bntu.fitr.povt.sunRevival.Logic.Logic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/Guest")
public class Guest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String button = request.getParameter("home");
        if ("Home".equals(button)) {
            for (int i = 1; i <= Logic.getCount(); i++) {
                request.setAttribute("status" + i, i + Logic.getElement(i));
            }
            request.setAttribute("name", LoginRegister.customer.getLogin());
            
            request.setAttribute("priceOfTree", "Price of tree " + String.format("%.2f", Counter.countPriceOfTree(Logic.getDictionary())));
            request.setAttribute("priceOfBalls", "Price of Balls " + String.format("%.2f", Counter.countPriceOfBall(Logic.getDictionary())));
            request.setAttribute("priceOfCandies", "Price of Candies " + String.format("%.2f", Counter.countPriceOfCandy(Logic.getDictionary())));
            request.setAttribute("priceOfFlashlights", "Price of Flashlights " + String.format("%.2f", Counter.countPriceOfFlashLight(Logic.getDictionary())));
            request.setAttribute("percentOfBalls", "Percent of Balls " + String.format("%.2f", Counter.countPercentOfBall(Logic.getDictionary())));
            request.setAttribute("percentOfCandies", "Percent of Candies " + String.format("%.2f", Counter.countPercentOfCandy(Logic.getDictionary())));
            request.setAttribute("percentOfFlashlights", "Percent of Flashlight " + String.format("%.2f", Counter.countPercentOfFlashlight(Logic.getDictionary())));
            request.setAttribute("guestName", LoginRegister.customer.getLogin());
            request.getRequestDispatcher("welcome.jsp").forward(request, response);
        }
        
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
    }
}
