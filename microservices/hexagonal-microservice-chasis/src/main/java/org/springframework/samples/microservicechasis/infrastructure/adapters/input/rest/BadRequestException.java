package org.springframework.samples.microservicechasis.infrastructure.adapters.input.rest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException {
	public BadRequestException() {
		this("");
	}

	public BadRequestException(String message) {
		super(message);
	}
}
