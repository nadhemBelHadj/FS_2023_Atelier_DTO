package com.nadhem.produits.service;

import java.util.List;

import com.nadhem.produits.dto.ProduitDTO;
import com.nadhem.produits.entities.Categorie;
import com.nadhem.produits.entities.Produit;

public interface ProduitService {
	
	 ProduitDTO saveProduit(ProduitDTO p);
	 ProduitDTO updateProduit(ProduitDTO p);
	 
	 ProduitDTO getProduit(Long id);
	 List<ProduitDTO> getAllProduits();
	 
	 

	 void deleteProduit(Produit p);
     void deleteProduitById(Long id);
	
    
	 
	 List<Produit> findByNomProduit(String nom);
	 List<Produit> findByNomProduitContains(String nom);
	 List<Produit> findByNomPrix (String nom, Double prix);
	 List<Produit> findByCategorie (Categorie categorie);
	 List<Produit> findByCategorieIdCat(Long id);
	 List<Produit> findByOrderByNomProduitAsc();
	 List<Produit> trierProduitsNomsPrix();

	 ProduitDTO convertEntityToDto(Produit p);
	 Produit convertDtoToEntity(ProduitDTO produitDto);
}
