package org.example;

public class Cliente {

    //ATRIBUTOS (VARIABLES QUE ALMACENAN DATOS DE LA CLASE)
    String nombre;
    int edad; //DATO PRIMITIVO
    String telefono; //DATO EN ENVOLTURA
    String direccion;
    Integer comprasAlMes;

    //METODOS ESPECIALES
    //1. constructor vacio
    public Cliente() {
    }

    //2. constrcutor LLENO

    public Cliente(String nombre, int edad, String telefono, String direccion, Integer comprasAlMes) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
        this.comprasAlMes = comprasAlMes;
    }


    //METODOS ORDINARIOS

}
