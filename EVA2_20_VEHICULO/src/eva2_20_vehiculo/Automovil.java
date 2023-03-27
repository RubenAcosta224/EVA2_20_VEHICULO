/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_20_vehiculo;

/**
 *
 * @author invitado
 */
public class Automovil extends Vehiculo{
    private String nombre;

    public Automovil(String nombre) {
        this.nombre = nombre;
    }
    
    

//    private String ;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
