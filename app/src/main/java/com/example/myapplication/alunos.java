package com.example.myapplication;

public class alunos {

    private int id;

    private String nome;

    private  String documento;

    private String curso;

    public alunos(int id, String name, String doc, String course){
        this.id = id;
        this.nome = name;
        this.documento = doc;
        this.curso = course;
    }
    public int getId(){
        return id;
    }
    public String getnome(){
        return nome;
    }
    public String getdocumento(){
        return documento;
    }
    public String getCurso(){
        return curso;
    }
}

