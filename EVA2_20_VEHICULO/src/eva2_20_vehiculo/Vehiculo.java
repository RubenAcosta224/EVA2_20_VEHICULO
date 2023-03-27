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
public class Vehiculo implements ControlVelocidad{
    private int velocidad;
    private String marca;

    public int getVelocidad() {
        return velocidad;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public void acelerar() {
        velocidad+=10;
    }

    @Override
    public void detener() {
//        if(!(velocidad<0)){
//            velocidad-=10;
//        }
        velocidad=0;
    }

    @Override
    public void imprimirVel() {
        System.out.println("Velocidad: "+velocidad);
    }
    
    
    
    
}
