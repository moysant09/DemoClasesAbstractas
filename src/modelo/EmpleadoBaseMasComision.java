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
public abstract class EmpleadoBaseMasComision extends EmpleadoPorComision 
{
 private double salarioBase;
 
 
 public EmpleadoBaseMasComision(String nombre, String apellido,
         String nss, double ventas, double tarifa, double salario)
 {
     super(nombre,apellido,nss,ventas,tarifa);
     setEstablecerSalarioBase( salario );
 }
 
 
 public void setEstablecerSalarioBase( double salario)
 {
   if (salario >= 0.0)
       salarioBase = salario;
   else 
       throw new IllegalArgumentException(
       "El salario base debe ser >= 0.0");
 }
 
 public double getObtenerSalarioBase()
 {
     return salarioBase;
 }
    
 
 @Override
 public double ingresos()
 {
     return getObtenerSalarioBase() + super.ingresos();
 }
 
 
 @Override 
 public String toString()
 {
   return String.format("%s %s; %s: $%,.2f",
           "con salario base", super.toString(),
           "salario base", getObtenerSalarioBase());  
 }

}

