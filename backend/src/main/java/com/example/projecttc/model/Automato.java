package com.example.projecttc.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Automato {
    private String nome;
    private Set<String> alfabeto = new HashSet<>(); //HashSet é para evitar que duplique a entrada do alfabeto
    private ArrayList<Estado> estados;
    private ArrayList<Transicao> transicoes;

    public Automato(String nome) {
        this.nome = nome;
        this.estados = new ArrayList<>();
        this.transicoes = new ArrayList<>();
    }

    public Automato(String nome, ArrayList<Estado> estados, ArrayList<Transicao> transicoes) {
        this.nome = nome;
        this.estados = estados;
        this.transicoes = transicoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Estado> getEstados() {
        return estados;
    }

    public void addEstado(Estado estado) {
        this.estados.add(estado);
    }

    public List<Transicao> getTransicoes() {
        return this.transicoes;
    }

    public void addTransicao(Transicao transicao) {
        this.transicoes.add(transicao);
        this.alfabeto.add(transicao.getSimbolo());
    }

    public Set<String> getAlfabeto() {
        return alfabeto;
    }
}