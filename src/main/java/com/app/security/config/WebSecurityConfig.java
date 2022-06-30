package com.app.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	UserDetailsServiceImpl userDetailsServiceImpl;
	
	@Override
	  public void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
	    authenticationManagerBuilder.userDetailsService(userDetailsServiceImpl).passwordEncoder(passwordEncoder());
	  }
	
	@Bean
	  public PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	  }
	
	  @Override
	  protected void configure(HttpSecurity http) throws Exception {
	    http.cors().and().csrf().disable()
	      .exceptionHandling().and()
	      .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
	      .authorizeRequests().antMatchers("/api/**").permitAll()
	      .antMatchers("/**").permitAll()
	      .anyRequest().authenticated();
	  }

}
