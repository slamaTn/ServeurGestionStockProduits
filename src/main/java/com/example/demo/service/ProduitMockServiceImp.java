package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Produit;

@Service
public class ProduitMockServiceImp implements IProduitService{

	private List<Produit> produits;
	
	public ProduitMockServiceImp() {
		produits = new ArrayList<Produit>();
		produits.add(new Produit("Livre",50,20));
		produits.add(new Produit("Cahier",200,5.25f));
		produits.add(new Produit("Stylo",500,2.1f));
	}

	
	
	@Override
	public List<Produit> getProduits() {
		return produits;
	}

	@Override
	public void addProduit(Produit produit) {
		produits.add(produit);
		System.out.println("produit ajouté : "+produit.getRef());
	}

	@Override
	public void updateProduit(Produit produit) {
		produits.remove(produit);
		produits.add(produit);
		System.out.println("produit Mise à jour : "+produit.getRef());
		
	}

	@Override
	public void deleteProduit(Long id) {
		Produit produit = new Produit();
		produit.setId(id);;
		produits.remove(produit);
		System.out.println("produit supprimé : "+id);
	}

}
