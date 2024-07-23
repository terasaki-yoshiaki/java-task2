package com.Calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Calculator.Service.CalcService;
import com.Calculator.model.CalcDTO;

@Controller
public class CalculatorController {

	@GetMapping("/")
	public String index(Model model ) {
		CalcDTO calcDTO = new CalcDTO();
        model.addAttribute("dto", calcDTO);
		return "index.html";
	}
	
	@PostMapping("/calc")
    public String calc(@ModelAttribute CalcDTO dto, Model model) {
        CalcDTO calcDTO = new CalcDTO();
        // サービスを呼び出す
        CalcService service = new CalcService();
        // 計算処理のメソッドgetResultを呼び、結果をresultへ入れる
        calcDTO = service.getResult(dto);

        // 画面側へresultを渡す
        model.addAttribute("dto", calcDTO);
        return "index.html";
    }
	
	
	
}
