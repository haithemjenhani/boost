package com.example.demo.entites;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.example.tp.dao.Produits;

@RepositoryRestResource

public interface ProduitRepository extends JpaRepository<Produits, Long>
{
	

}