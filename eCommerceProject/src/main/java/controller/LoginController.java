package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Account;
import service.account.AccountService;
import service.account.AccountServiceImpl;

public class LoginController {

	public static void login(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		AccountService myServ = new AccountServiceImpl();
		
		String inputUsername = req.getParameter("Username");
		String inputPassword = req.getParameter("Password");
		
		PrintWriter printer = resp.getWriter();
		
		if(myServ.findUser(inputUsername, inputPassword).getFirst_name() != null) {
			
			Account myAccount = myServ.findUser(inputUsername, inputPassword);
			printer.println("Welcome " + myAccount.getFirst_name());
			HttpSession accountSession = req.getSession();
			accountSession.setAttribute("currentAccount", myAccount);
			
		} else {
			printer.println("Failed to login. User and Pass do not match. Try Again.");
		}
		
	}
}