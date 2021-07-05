package com.somnium.evershine;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UiController {

	@RequestMapping("/evershinetest")
	 public String index1() {
	     return "test1";
	 }
	@RequestMapping({"/","/evershine"})
	 public String index() {
	     return "index";
	 }
}
