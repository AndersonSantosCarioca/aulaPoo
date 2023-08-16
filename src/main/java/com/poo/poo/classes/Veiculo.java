package com.poo.poo.classes;



public class Veiculo {
    
    //atributos comportamentos
    public String proprietario;
    public String Marca ;
    public String modelo ;    
    public int ano;
    public String cor;
    public Double quilometragem;
    public String renavan; 

    //comportamentos

    public void imprimeDocumento(){      
        System.out.println(
            this.proprietario + "" +
            this.Marca + "" +
            this.modelo + "" +
            this.ano + "" +
            this.cor + "" +
            this.quilometragem + "" +
            this.renavan + ""

         ) ;


    }
    public void acelerar(){

    }
    public void calculaIPVA(){

    }
}
