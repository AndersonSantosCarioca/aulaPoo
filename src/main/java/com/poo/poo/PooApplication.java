package com.poo.poo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

		System.out.println(carroDoAnderson.quilometragem);



	}

}
