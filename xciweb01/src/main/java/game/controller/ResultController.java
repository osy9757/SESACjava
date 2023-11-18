package game.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.fx.AbstractController;
import mvc.fx.ModelAndView;

public class ResultController extends AbstractController {
	
	@Override
	public  ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
	    int youNum = Integer.parseInt(request.getParameter("you"));
		String you = null;
		int comNum = (int)(Math.random()*3+1);
		String com = null;
		if (comNum == 1)
			com = "가위";
		else if (comNum == 2)
			com = "바위";
		else
			com = "보";
		
		if (youNum == 1)
			you = "가위";
		else if (youNum == 2)
			you = "바위";
		else
			you = "보";
		

		String winner = null;
	    if (you.equals(com)) {
	    	winner = "Draw";
	    } else if ((you.equals("바위") && com.equals("가위")) ||
	               (you.equals("보") && com.equals("바위")) ||
	               (you.equals("가위") && com.equals("보"))) {
	    	winner = "You Win";
	    } else {
	    	winner = "Com Win";
	    }
		
	    ModelAndView modelAndView = new ModelAndView("/WEB-INF/game/result.jsp");
	    modelAndView.addObject("you", you);
	    modelAndView.addObject("com", com);
	    modelAndView.addObject("winner", winner);

	    return modelAndView;
	}
}
