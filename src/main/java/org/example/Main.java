package org.example;

public class Main {
    public static void main(String[] args) {

        //creando una variable ordinaria
        int edad=5;
        System.out.println(edad);

        //CREANDO UN OBJETO
        Cliente objeto=new Cliente();
        //Yo uso un objeto para acceder a los atributos y metodos
        //de la clase POR SEPARADO
        objeto.edad=33;
        System.out.println(objeto.edad);
        objeto.nombre="Juan José Gallego Mesa";
        System.out.println(objeto.nombre);





    }
}