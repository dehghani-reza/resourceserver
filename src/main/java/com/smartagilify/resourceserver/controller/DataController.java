package com.smartagilify.resourceserver.controller;

import java.util.Map;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class DataController {

	@GetMapping
	public Map<String, String> getData(@AuthenticationPrincipal Jwt jwt) {
		return Map.of("message", "hello-> " + jwt.getSubject());
	}
}
