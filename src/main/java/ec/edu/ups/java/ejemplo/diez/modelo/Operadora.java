/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.ejemplo.diez.modelo;

import java.util.Objects;

/**
 *
 * @author davidvargas
 */
public class Operadora {
    private int codigo;
    private String nombre;

    public Operadora() {
    }

    public Operadora(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Operadora{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
