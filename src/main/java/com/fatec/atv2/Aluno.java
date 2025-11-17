/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatec.atv2;

/**
 *
 * @author Jessi
 */
public class Aluno {
    private String nome;
    private double[] notas = new double[3];

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void setNota(int indice, double valor) {
        this.notas[indice] = valor;
    }

    public double calcularMedia() {
        double soma = 0;
        for (double n : notas) {
            soma += n;
        }
        return soma / notas.length;
    }

    public String avaliarDesempenho() {
        double media = calcularMedia();

        if (media >= 0 && media < 6.0) {
            return "Reprovado";
        } else if (media >= 6.0 && media <= 9.0) {
            return "Aprovado";
        } else if (media > 9.0 && media <= 10){
            return "Ótimo Aproveitamento";
        } else {
            return "Digite notas válidas";
        }
    }

    public String getNome() {
        return nome;
    }
}
