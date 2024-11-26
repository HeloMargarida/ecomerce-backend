package org.senac.aula01.controller;

import org.senac.aula01.model.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @GetMapping
    public List<Produto> getProdutos() {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto(1, "Paleta Naked", "Cores neutras para looks naturais", 150.00,
                "https://example.com/images/paleta-naked.jpg"));
        produtos.add(new Produto(2, "Gel de Limpeza Neutrogena", "Remove impurezas e controla oleosidade", 89.00,
                "https://example.com/images/gel-neutrogena.jpg"));
        produtos.add(new Produto(3, "Shampoo Wella Invigo", "Nutrição e reparação completa", 80.00,
                "https://example.com/images/shampoo-wella.jpg"));
        produtos.add(new Produto(4, "Shampoo Keune Care", "Crescimento capilar e diminuição da queda", 95.00,
                "https://example.com/images/shampoo-keune.jpg"));
        return produtos;
    }
}
