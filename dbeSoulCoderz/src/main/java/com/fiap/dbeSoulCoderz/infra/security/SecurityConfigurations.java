	package com.fiap.dbeSoulCoderz.infra.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.fiap.dbeSoulCoderz.service.UserService;

@Configuration
@EnableWebSecurity
public class SecurityConfigurations	 {

	@Autowired
	private DataSource dataSource;
	@Autowired
	private UserService userService;

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.
	
		authorizeHttpRequests()
		.requestMatchers("usuario/formulario")
			.permitAll().and().authorizeHttpRequests().requestMatchers("usuario/novo").permitAll()
		.anyRequest().authenticated().and().formLogin()
						.loginPage("/login").defaultSuccessUrl("/home", true)
				.permitAll().and().logout().permitAll();
		
		http.csrf().disable().
			userDetailsService(userService);
		return http.build();
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		auth.jdbcAuthentication().dataSource(dataSource).passwordEncoder(encoder);
		
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder();    
	}
	
}