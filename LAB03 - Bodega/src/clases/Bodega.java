package clases;
import java.util.ArrayList;

public class Bodega {
    public static ArrayList<Producto> Productos = new ArrayList<Producto>();
    public static ArrayList<Integer> Codigos = new ArrayList<>();
    
    public Bodega(){
    
    }
    public void addCodigo(int Code){
        this.Codigos.add(Code);
    }
            
    public void add(Producto p){
        this.Productos.add(p);
    }
    
    public Producto getProducto(int codigo){
        for (Producto prod : this.Productos) {
            if (codigo == prod.getCodigo()) {
                return prod;
            }
        }
        return null;
    }
    public ArrayList<Producto> getAll() {
        return Productos;
    }
    

}
