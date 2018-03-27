package com.kruders.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.DynaValidatorForm;

public class LoginAction extends Action{
	public ActionForward execute(ActionMapping mapping,ActionForm form,
		HttpServletRequest request, HttpServletResponse response)
	            throws Exception {
	        
	        LoginForm loginForm =  (LoginForm) form;
	        if(loginForm.getUserName().equals("test") && loginForm.getPassword().equals("test123")){
	            return mapping.findForward("success");
	        } else {
	            return mapping.findForward("fail");
	        }

	}
}
