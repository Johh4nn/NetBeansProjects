/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.entidades;

/**
 *
 * @author Usuario
 */
public class Producto {
    private int codigo;
    private String nombre;
    private double precio;
    private int codigofabricante;

    public Producto() {
    }

    public Producto(int codigo, String nombre, double precio, int codigofabricante) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.codigofabricante = codigofabricante;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCodigofabricante() {
        return codigofabricante;
    }

    public void setCodigofabricante(int codigofabricante) {
        this.codigofabricante = codigofabricante;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", codigofabricante=" + codigofabricante + '}';
    }
    
    
}
