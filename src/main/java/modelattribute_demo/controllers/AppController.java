package modelattribute_demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import modelattribute_demo.dto.NameInfoDTO;

@Controller
public class AppController {
	@RequestMapping("/home")
	public String showHomePage(Model model) {
		// DTO 에서 존재하는 성질 값들을 읽어오라.
		NameInfoDTO nameInfoDTO = new NameInfoDTO();
		model.addAttribute("nameInfo", nameInfoDTO);

		return "welcome-page";
	}

	@RequestMapping("/process-homepage")
	public String showResultPage(NameInfoDTO nameInfoDTO, Model model) {
		// URL 에서 읽은 값들을 모델에 성질 값으로 저장하라
		model.addAttribute("nameInfo", nameInfoDTO);

		return "result-page";
	}
}
