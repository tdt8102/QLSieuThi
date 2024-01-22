package com.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {
	@Autowired
	private SieuThiService service;
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/")
	public String home(Model model) {
		List<SieuThi> list = service.getAll();
		model.addAttribute("list",list); 
		return "index";
	}
	
	@PostMapping("/save")
	public String addBook(@ModelAttribute SieuThi b) {
		service.save(b);
		return "redirect:/";
	}
	
	@RequestMapping("/edit/{id}")
	public String edit(@PathVariable("id") int id, Model model) {
		SieuThi b = service.getById(id);
		model.addAttribute("b", b);
		return "edit";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id) {
		service.deleteById(id);
		return "redirect:/";
	}
	
	@GetMapping("/search")
	public String search(@RequestParam(value = "tenst", required = false) String a,@RequestParam(value = "soluong", required = false) int b, Model model) {
		if (a != "" || b > 0) {
			 model.addAttribute("list", service.search(a, b));
			 return "index";
        }
            model.addAttribute("error", "Vui lòng nhập giá trị trước khi tìm kiếm!!");
            return "redirect:/"; 
        
		
	}
}
