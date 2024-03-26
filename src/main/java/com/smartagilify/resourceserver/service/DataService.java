package com.smartagilify.resourceserver.service;

import java.util.Map;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Service;

@Service
public class DataService {

	@PreAuthorize("hasAuthority('SCOPE_user.read')") // <- this kind of authorization is great for GraphQL
	public Map<String, String> getDate() {
		var jwt = (Jwt) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		return Map.of("message", "hello-> " + jwt.getSubject());
	}
}
