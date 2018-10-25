package com.example.demo;

import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entites.ProduitRepository;
import com.example.tp.dao.Produits;




@SpringBootApplication
public class ProduitMicroServiceApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(ProduitMicroServiceApplication.class, args);
		ProduitRepository produitRepository=context.getBean(ProduitRepository.class);
		Stream.of("fA","BT","CP").forEach(s->produitRepository.save(new Produits(7L,"hf",77.2)));
		produitRepository.findAll().forEach(s->System.out.println(s.getDesignation()));
		
		
	
}
	
}
