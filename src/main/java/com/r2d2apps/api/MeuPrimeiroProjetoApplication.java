package com.r2d2apps.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.r2d2apps.api.utils.SenhaUtils;

@SpringBootApplication
public class MeuPrimeiroProjetoApplication {
	@Value("${paginacao.qtd_por_pagina}")
	private int qtd_por_pagina;
	

	public static void main(String[] args) {
		SpringApplication.run(MeuPrimeiroProjetoApplication.class, args);
		System.out.println("Meu primeiro projeto");
	}
	
	@Bean
	public CommandLineRunner commandLineRunner () {
		return args -> {
			System.out.println("Valor da variavel eh "+ this.qtd_por_pagina);
			
			String senha = SenhaUtils.gerarBCrypt("123456");
			System.out.println("Senha: "+ senha);
			
			senha = SenhaUtils.gerarBCrypt("123456");
			System.out.println("Senha: "+ senha);
			
			System.out.println("Validando a senha : " + SenhaUtils.senhaValida(senha, "123456"));
			
		};
	}
}
