 package com.vehiculos.concesionario.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "gama_baja")

public class GamaBaja {
    @Id
    int id;
    @Column(name = "marca", length = 100, nullable = false)
    String marca;
    @Column(name = "capacidad_maletero",  nullable = false)
    int Capacidadmaletero;
    @Column(name = "tipo_motor", length=100, nullable = false)
    String tipoMotor;
    @Column(name = "cantidad_puertas", nullable = false)
    int cantidadpuertas;

    public GamaBaja(String marca, int capacidadmaletero, String tipoMotor, int cantidadpuertas) {
        this.marca = marca;
        this.Capacidadmaletero = capacidadmaletero;
        this.tipoMotor = tipoMotor;
        this.cantidadpuertas = cantidadpuertas;
    }

    public GamaBaja() {
    }

    public GamaBaja(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public int getCapacidadmaletero() {
        return Capacidadmaletero;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public int getCantidadpuertas() {
        return cantidadpuertas;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCapacidadmaletero(int capacidadmaletero) {
        this.Capacidadmaletero = capacidadmaletero;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public void setCantidadpuertas(int cantidadpuertas) {
        this.cantidadpuertas = cantidadpuertas;
    }
    public static void main(String[] args) {
        GamaBaja gamaBaja = new GamaBaja("Toyota", 400, "Gasolina", 4);
        System.out.println("Marca: " + gamaBaja.getMarca());
        System.out.println("Capacidad del maletero: " + gamaBaja.getCapacidadmaletero() + " litros");
        System.out.println("Tipo de motor: " + gamaBaja.getTipoMotor());
        System.out.println("Cantidad de puertas: " + gamaBaja.getCantidadpuertas());
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
