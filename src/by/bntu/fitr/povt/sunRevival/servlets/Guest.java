package by.bntu.fitr.povt.sunRevival.servlets;

import by.bntu.fitr.povt.sunRevival.Logic.Counter;
import by.bntu.fitr.povt.sunRevival.Logic.Logic;
import by.bntu.fitr.povt.sunRevival.Logic.Rounder;

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
            
            request.setAttribute("priceOfTree", "Price of tree " + Rounder.round(Counter.countPriceOfTree(Logic.getDictionary())));
            request.setAttribute("priceOfBalls", "Price of Balls " + Rounder.round( Counter.countPriceOfBall(Logic.getDictionary())));
            request.setAttribute("priceOfCandies", "Price of Candies " + Rounder.round( Counter.countPriceOfCandy(Logic.getDictionary())));
            request.setAttribute("priceOfFlashlights", "Price of Flashlights " + Rounder.round( Counter.countPriceOfFlashLight(Logic.getDictionary())));
            request.setAttribute("percentOfBalls", "Percent of Balls " + Rounder.round( Counter.countPercentOfBall(Logic.getDictionary())));
            request.setAttribute("percentOfCandies", "Percent of Candies " + Rounder.round( Counter.countPercentOfCandy(Logic.getDictionary())));
            request.setAttribute("percentOfFlashlights", "Percent of Flashlight " + Rounder.round( Counter.countPercentOfFlashlight(Logic.getDictionary())));
            request.setAttribute("guestName", LoginRegister.customer.getLogin());
            request.getRequestDispatcher("welcome.jsp").forward(request, response);
        }
        
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
    }
}
