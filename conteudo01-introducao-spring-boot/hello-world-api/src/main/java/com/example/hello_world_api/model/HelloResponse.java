package com.example.hello_world_api.model;

public class HelloResponse {
    
    private String mensagem;
    private String descricao;
    
    // Construtores
    public HelloResponse() {
    }
    
    public HelloResponse(String mensagem, String descricao) {
        this.mensagem = mensagem;
        this.descricao = descricao;
    }
    
    // Getters e Setters
    public String getMensagem() {
        return mensagem;
    }
    
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}