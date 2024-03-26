package com.smartagilify.resourceserver.controller;

import java.util.Map;

import com.smartagilify.resourceserver.service.DataService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/data")
public class DataController {

	private final DataService dataService;

	@GetMapping
	public Map<String, String> getData(@AuthenticationPrincipal Jwt jwt) {
		log.info("username(subjective) that using get data api: " + jwt.getSubject());
		return dataService.getDate();
	}
}
