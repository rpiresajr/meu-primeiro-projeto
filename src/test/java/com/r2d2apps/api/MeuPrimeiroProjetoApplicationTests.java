package com.r2d2apps.api;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class MeuPrimeiroProjetoApplicationTests {
	
	@Value("${paginacao.qtd_por_pagina}")
	private int qtd_por_pagina;
	
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void TestCarregarContextoDeTeste() {
		assertEquals(100, qtd_por_pagina);
	}
	

}
