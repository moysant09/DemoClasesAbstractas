/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democlasesabstractas;

import modelo.Empleado;
import modelo.EmpleadoAsalariado;
import modelo.EmpleadoBaseMasComision;
import modelo.EmpleadoPorComision;
import modelo.EmpleadoPorHoras;

/**
 *
 * @author moises santiago
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            EmpleadoAsalariado empleadoAsalariado =
            new EmpleadoAsalariado("John", "Smit", "111-11-1111", 800.00) {};
        EmpleadoPorHoras empleadoPorHoras =
                new EmpleadoPorHoras("Karen", "Price", "222-22-2222", 16.75, 40) {};
        EmpleadoPorComision empleadoPorComision =
                new EmpleadoPorComision(
                "Sue", "Jones", "333-33-3333", 10000, .06) {};
        EmpleadoBaseMasComision empleadoBaseMasComision =
                new EmpleadoBaseMasComision(
                "Bob", "Lewis", "444-44-4444", 5000, .04, 300) {};
        
        System.out.println("Empleados procesados por separado:\n");
        
        System.out.printf( "%s\n%s: $%,.2f\n\n",
                empleadoAsalariado, "ingresos", empleadoAsalariado.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n",
                empleadoPorHoras, "ingresos", empleadoPorHoras.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n",
                empleadoPorComision, "ingresos", empleadoPorComision.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n",
                empleadoBaseMasComision,
                "ingresos", empleadoBaseMasComision.ingresos());
        
        Empleado[] empleados = new Empleado[ 4 ];
        
        empleados [ 0 ] = empleadoAsalariado;
        empleados [ 1 ] = empleadoPorHoras;
        empleados [ 2 ] = empleadoPorComision;
        empleados [ 3 ] = empleadoBaseMasComision;
        
        System.out.println("Empleados procesados en forma polimorfica:\n");
        
        for ( Empleado empleadoActual : empleados)
        {
         System.out.println(empleadoActual);
         
         
         if ( empleadoActual instanceof EmpleadoBaseMasComision)  
         {
             
             
             
             EmpleadoBaseMasComision empleado =
                     (EmpleadoBaseMasComision)empleadoActual;
             
             empleado.setEstablecerSalarioBase( 1.10 * empleado.getObtenerSalarioBase());
             
             System.out.printf(
             "el nuevo salario base con 10%% de aumento es : $%,.2f\n",
              empleado.getObtenerSalarioBase());
         }
         System.out.printf(
         "ingresos $%,.2f\n\n", empleadoActual.ingresos());
        }
        
        for ( int j = 0; j < empleados.length; j++)
            System.out.printf( "empleado %d es un %s\n", j, 
                    empleados [ j ].getClass().getName());
    }
}
