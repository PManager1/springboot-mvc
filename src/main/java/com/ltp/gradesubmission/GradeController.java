package com.ltp.gradesubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GradeController {
	
	@GetMapping("/")
	public String sayHello() {
		System.out.println("sending test");
		return "test";
	}


	@GetMapping("/grades")
	public String getGrades(Model model) {
		System.out.println("sending grades");
		Grade grade = new Grade ( name: "Harry", subject: "English", score: "C-" );
		model.addAttribute("grade", grade);
		return "grades";
	}

}
