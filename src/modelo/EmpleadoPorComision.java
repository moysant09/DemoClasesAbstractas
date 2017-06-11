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
public abstract class EmpleadoPorComision extends Empleado 
{
    private double ventasBrutas;
    private double tarifaComision;
    
    
    public EmpleadoPorComision(String nombre, String apellido, String nss,
            double ventas, double tarifa)
    {
     super(nombre, apellido, nss);
     setEstablecerVentasBrutas(ventas);
     setEstablecerTarifasComision(tarifa);
    }
    
    
    public void setEstablecerTarifasComision(double tarifa)
    {
     if (tarifa > 0.0 && tarifa < 1.0)
         tarifaComision = tarifa;
     else
         throw new IllegalArgumentException(
         "La tarifa de comision debe ser > 0.0 y 1.0");
    }
    
    public double getObtenerTarifaComision()
    {
        return tarifaComision;
    }
    
    public void setEstablecerVentasBrutas(double ventas)
    {
        if (ventas >= 0.0)
            ventasBrutas = ventas;
        else
            throw new IllegalArgumentException(
            "Las ventas brutas deben ser >= 0.0");
    }
    
    public double getObtenerVentasBrutas()
    {
    return ventasBrutas;    
    }
    
    @Override
    public double ingresos()
    {
        return getObtenerTarifaComision() * getObtenerVentasBrutas();
    }
    
    @Override
    public String toString()
    {
        return String.format("%s: %s\n%s: $%,.2f; %s: %.2f",
                "empleado por comision", super.toString(),
                "ventas brutas", getObtenerVentasBrutas(),
                "tarifa de comision", getObtenerTarifaComision());
    }
}
