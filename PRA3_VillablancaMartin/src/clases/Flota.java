/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;
import clases.Estado;
import clases.Vehiculo;
/**
 *
 * @author Martin
 */
public class Flota {

    private ArrayList<Vehiculo> vehiculos = new ArrayList();

    public void add(Vehiculo vehiculo) {
        this.vehiculos.add(vehiculo);
    }

    public ArrayList<Vehiculo> getAll() {
        return this.vehiculos;
}
    public Vehiculo getVehiculo(String patente) {
        for (int i = 0; i < vehiculos.size(); i++) {
            if (vehiculos.get(i).getPatente().equals(patente)) {
                return vehiculos.get(i);
            }
        }
        return null;
    }
    public ArrayList getEstado(Estado estado){
        ArrayList<Vehiculo> lista = new ArrayList<Vehiculo>();
        for(Vehiculo vehiculo : vehiculos){
            if(vehiculo.getEstado().toString().equals(estado.toString())){
                lista.add(vehiculo);
            }
        }
    
        return lista;
    } 
}
