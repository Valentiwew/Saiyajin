package com.Saiyajin.Saiyajin.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Saiyajin {

    private int id;
    private String nombre;
    private String bando; /* Cambie lo de de Boolean a String para decir si es "Malo" o "Bueno" */
    private String raza;
    private int nivel;
}
