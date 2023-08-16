package com.poo.poo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.poo.poo.classes.Conta;
import com.poo.poo.classes.Veiculo;

@SpringBootApplication
public class PooApplication {

	public static void main(String[] args) {
		SpringApplication.run(PooApplication.class, args);

		Veiculo carroDoAnderson = new Veiculo();
		carroDoAnderson.proprietario = "Anderson";
		carroDoAnderson.renavan = "123456";
		carroDoAnderson.Marca = "Gol";
		carroDoAnderson.ano = 1970;
		carroDoAnderson.cor = "vermelho";
		carroDoAnderson.quilometragem = (double) 4000;

		System.out.println(carroDoAnderson.ano);

		Conta contaAnderson = new Conta();
		contaAnderson.settitular("Anderson");
		contaAnderson.setNumeroConta ("199556448");
		contaAnderson.setsenha ("12345");
		contaAnderson.setNumeroConta("1");

		//conta.setSenha(senha:"123456");
		System.out.println("");
		System.out.println(contaAnderson.get);


	}

}
