package br.com.alura.screenmatch;

import br.com.alura.screenmatch.Model.DadoSerie;
import br.com.alura.screenmatch.Services.ConsumoAPI;
import br.com.alura.screenmatch.Services.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		 var consumoApi = new ConsumoAPI();
		 var json = consumoApi.obterDados("https://www.omdbapi.com/?t=dexter&apikey=82075ae4");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadoSerie dados = conversor.obterDados(json, DadoSerie.class);
		System.out.println(dados);
	}
}
