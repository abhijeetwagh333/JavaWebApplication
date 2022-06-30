package com.app.payload.request;

import java.io.Serializable;

import com.app.enums.ERole;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SignUpRequest implements Serializable {
	private String name;
	private String email;
	private String password;
	private ERole role;
}
