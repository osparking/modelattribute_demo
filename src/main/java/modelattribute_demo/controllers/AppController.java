package modelattribute_demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import modelattribute_demo.dto.NameInfoDTO;

@Controller
public class AppController {
	@RequestMapping("/home")
	public String showHomePage(
			@ModelAttribute("nameInfo") NameInfoDTO nameInfoDTO) {
		return "welcome-page";
	}

	@RequestMapping("/process-homepage")
	public String showResultPage(NameInfoDTO nameInfoDTO, Model model) {
		// URL 에서 읽은 값들을 모델에 성질 값으로 저장하라
		model.addAttribute("nameInfo", nameInfoDTO);

		return "result-page";
	}
}
