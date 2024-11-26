package org.senac.aula01.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@SuppressWarnings("unused")
@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Double preco;
    private String imageUrl;

    public Produto(Integer id, String nome, String descricao, Double preco, String imageUrl) {
        this.id = id;
        this.preco = preco;
        this.imageUrl = imageUrl;
    }

    public Produto() {}

    // Getters e setters
    // ...
}
