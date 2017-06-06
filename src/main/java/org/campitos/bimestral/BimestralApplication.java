package org.campitos.bimestral;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BimestralApplication {
@Autowired static  RepositorioDireccion repo;
	public static void main(String[] args) {
		SpringApplication.run(BimestralApplication.class, args);
                
            repo.save(new Direccion(22, "asasa", 23232L, "DDDD"));
	}
}
