package com.mss.plugins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@RestController
@RequestMapping("/api")
public class SampleController {

	private int MemberVariable;

	@GetMapping("/test")
	public String TestMethod(@RequestParam String Parameter) {
		final int LocalFinalVariable = 10;
		int localVariable = 20;

		if (Parameter != null) {
			return "Hello, " + Parameter;
		} else {
			return "Hello, World!";
		}
	}
}
