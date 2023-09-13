package com.example.provaestudar;

public class Pet {

    private int id;
    private String nome;
    private int idade;
    private String sexo;
    private String raca;
    private String especie;
    private String dono;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", raca='" + raca + '\'' +
                ", especie='" + especie + '\'' +
                ", dono='" + dono + '\'' +
                '}';
    }

    public Pet(int id, String nome, int idade, String sexo, String raca, String especie, String dono) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.raca = raca;
        this.especie = especie;
        this.dono = dono;

    }

    public Pet(){

    }
}
