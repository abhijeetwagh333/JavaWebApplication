package com.app.service;

import com.app.payload.request.SignUpRequest;

public interface RegistrationService {

	public int registerUser(SignUpRequest signUpRequest);
	
}
