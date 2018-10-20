package com.cloud.card.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/card")
@RestController
public class CardController {

	@Value("${card.api.version:1.0}")
	private String version;

	@RequestMapping("/version")
	String getVersion() {
		return this.version;
	}
}
