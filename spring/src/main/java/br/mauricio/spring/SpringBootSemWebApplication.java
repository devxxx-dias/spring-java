package br.mauricio.spring;

import br.mauricio.spring.model.DadosSerie;
import br.mauricio.spring.services.ConsumoApi;
import br.mauricio.spring.services.ConverterDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class SpringBootSemWebApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSemWebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	var consumoApi = new ConsumoApi();
		String endereco = "https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c";
	var json = consumoApi.obterDados(endereco);
		System.out.println(json);
		ConverterDados conversor = new ConverterDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);


	};




}
