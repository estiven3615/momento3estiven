 package com.vehiculos.concesionario.model;
 import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "gama_alta")
public class GamaAlta {
    @Id
     int id;
    @Column(name = "marca", length = 50, nullable = false)
String marca;
@Column(name = "velocidad_maxima", nullable = false)
int velocidadmaxima;
@Column(name = "tipo_motor", length=100, nullable = false)
String tipoMotor;
@Column(name = "precio", length=20, nullable = false)
double precio;
public GamaAlta(String marca, int velocidadmaxima, String tipoMotor, double precio) {
    this.marca = marca;
    this.velocidadmaxima = velocidadmaxima;
    this.tipoMotor = tipoMotor;
    this.precio = precio;
}
public GamaAlta() {
}

    public GamaAlta(int id) {
        this.id = id;
    }
public String getMarca() {
    return marca;
}
public int getVelocidadmaxima() {
    return velocidadmaxima;
}
public String getTipoMotor() {
    return tipoMotor;
}
public double getPrecio() {
    return precio;
}
public void setMarca(String marca) {
    this.marca = marca;
}
public void setVelocidadmaxima(int velocidadmaxima) {
    this.velocidadmaxima = velocidadmaxima;
}
public void setTipoMotor(String tipoMotor) {
    this.tipoMotor = tipoMotor;
}
public void setPrecio(double precio) {
    this.precio = precio;
}
public static void main(String[] args) {
    GamaAlta gamaAlta = new GamaAlta("Ferrari", 350, "V8", 250000.0);
    System.out.println("Marca: " + gamaAlta.getMarca());
    System.out.println("Velocidad máxima: " + gamaAlta.getVelocidadmaxima() + " km/h");
    System.out.println("Tipo de motor: " + gamaAlta.getTipoMotor());
    System.out.println("Precio: $" + gamaAlta.getPrecio());
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}