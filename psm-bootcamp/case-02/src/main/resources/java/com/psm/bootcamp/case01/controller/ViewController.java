/**
 * 
 */
package com.psm.bootcamp.case01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Awiyanto Ajisasongko
 *
 */
@Controller
public class ViewController {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
