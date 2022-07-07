package clases;

public class Producto {
    private int codigo;
    private String nombre;
    private int precio;
    private int stock;
    
    public void setEntrada(int unidades){
    
    }
    
    public void setSalida(int unidades){
    
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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (this.stock >= 0) {
            this.stock = stock;            
        }
    }

    public Producto(int codigo, String nombre, int precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    

    @Override
    public String toString() {
        return "Codigo: " + codigo + "\nNombre: " + nombre + "\nPrecio=" + precio + "\nStock: " + stock;
    }
    
    
}
