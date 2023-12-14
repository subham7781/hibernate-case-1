package com.webapp.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webapp.entity.Registration;
import com.webapp.repository.RegistrationRepository;
import com.webapp.service.RegistrationService;

@Controller
public class RegistrationController {
	 @Autowired
	 private RegistrationService registrationservice;
	//http://localhost:8080/view-registration-page
	@RequestMapping("/view-registration-page")
  public String viewRegistration() {
	return "new_reg";
  }
	@RequestMapping("/saveReg")
	public String saveRegistration(Registration registration) {
		registrationservice.saveRegistration(registration);
		return "new_reg";
		
	}
}
