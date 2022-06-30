package com.app.model;

import java.io.Serializable;
import java.util.Set;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

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
@JacksonXmlRootElement(namespace = "userlist")
public class User implements Serializable {
	private long id;
	private String name;
	private String email;
	private String password;
	private Set<Role> roles;
}
