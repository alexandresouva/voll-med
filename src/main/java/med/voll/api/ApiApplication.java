package med.voll.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
//		A classe abaixo (dentro do método Main), é responsável por iniciar a aplicação, cuidado inclusive do servidor.
		SpringApplication.run(ApiApplication.class, args);
	}

}
