package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroProgramaJava {
    public static void main(String[] args) {
        Gato gato = new Gato();

        gato.setNome("Tom");
        gato.setCor("Preto");
        gato.setIdade(5);
        System.out.println(gato);
        /*int a = 5;
        int b = 3;
        System.out.println("Hello, World! " + (a+b));*/
    }
}
