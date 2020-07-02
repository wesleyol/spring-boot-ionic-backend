package com.wesley.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.wesley.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
