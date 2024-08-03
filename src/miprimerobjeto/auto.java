
package miprimerobjeto;
/**
 *
 * @author cmarj
 */
public class auto {
    private String marca;
    private String color;
    private String tipo;
    private String modelo;
    
    private int cantidadpasajeros;

    
    //constructor
    public auto(String marca, String color, String tipo, String modelo, int cantidadpasajeros) {
        this.marca = marca;
        this.color = color;
        this.tipo = tipo;
        this.modelo = modelo;
        this.cantidadpasajeros = cantidadpasajeros;
    }

    
    //getter and setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCantidadpasajeros() {
        return cantidadpasajeros;
    }

    public void setCantidadpasajeros(int cantidadpasajeros) {
        this.cantidadpasajeros = cantidadpasajeros;
    }

 
    
    //mostrar la informacion
    public void mostrarInformacion() {
        System.out.println("Marca:" + marca);
        System.out.println("Color:" + color);
        System.out.println("Tipo:" + tipo);
        System.out.println("Modelo:" + modelo);
        System.out.println("Cantidad de Pasajeros:"+ cantidadpasajeros);
        
        
        
    }
    
}
