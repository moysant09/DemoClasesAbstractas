/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author moises santiago
 */
public abstract class Empleado {
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    
    public Empleado(String nombre, String apellido, String nss){
        primerNombre = nombre;
        apellidoPaterno = apellido;
        numeroSeguroSocial = nss;
    }
       public void setEstablecerPrimerNombre(String nombre){
       primerNombre = nombre;    
       }     
       public String getObtenerPrimerNombre(){
           return primerNombre;
       }
       public void setEstablecerApellidoPaterno(String apellido){
           apellidoPaterno = apellido;
       }
       public String getObtenerApellidoPaterno(){
           return apellidoPaterno;
       }
       public void setEstablecerNumeroSeguroSocial(String nss){
           numeroSeguroSocial = nss;
       }
       public String getObtenerNumeroSeguroSocial(){
           return numeroSeguroSocial;
       }
       @Override
       public String toString(){
           return String.format("%s %s\nnumero de seguro social: %s",
                   getObtenerPrimerNombre(),getObtenerApellidoPaterno(),getObtenerNumeroSeguroSocial());
       }
       public abstract double ingresos();
}

