package com.vendasonline.controller;

import com.vendasonline.model.Produto;
import com.vendasonline.repository.ProdutoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProdutoController {

    private final ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @GetMapping("/produtos")
    public String listarProdutos(Model model) {
        model.addAttribute("produtos", produtoRepository.findAll());
        return "produtos";
    }

    @PostMapping("/produtos")
    public String salvarProduto(Produto produto) {
        produtoRepository.save(produto);
        return "redirect:/produtos";
    }
}