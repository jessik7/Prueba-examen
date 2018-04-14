
package ejerciciopracticaevaluacion;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *Nombre de la clase:EjercicioPracticaEvaluacion
 * Fecha:07-04-2018
 * Version:1.0
 * CopyRight:Mauricio Ayala
 * @author Alonso Ayala
 */
public class EjercicioPracticaEvaluacion {


    public static void main(String[] args) {
        
        
    NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
    
     int codigo;
     String nombre;
     int anioNacimiento;
     int edad;
     String categoria;
     int numeroHoras;
     String direccion;
     int opcion=0;
     double sueldoFinal=0.0;
     int contadorCategoria=0;
     int contadorEdad=0;
     int contadorGeneral=0;
     double montoPlanilla=0.0;
     double promedioSalarios=0.0;
    
    
     do{
     
     codigo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su codigo:"));
     nombre=JOptionPane.showInputDialog("Ingrese su nombre:");
     anioNacimiento=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su año de nacimiento"));
     numeroHoras=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad horas:"));
     direccion=JOptionPane.showInputDialog("Ingrese su domicilio:");
     categoria=JOptionPane.showInputDialog("Seleccione su categoria:");
     
     edad=(2018-anioNacimiento);
     
     if(edad>50)
     {
         contadorEdad++;
     }
     
     switch(categoria)
      {
          
         case "A":
             sueldoFinal=numeroHoras*15;
             break;
         case "B":
             sueldoFinal=numeroHoras*13;
             contadorCategoria++;
             break;
         case "C":
             sueldoFinal=numeroHoras*11;
             break;
         case "D":
             sueldoFinal=numeroHoras*10;
             break;
         default:
             JOptionPane.showMessageDialog(null,"Usted eligio una categoria no existente","Categoria",0);
      }
      
      contadorGeneral++;
      
      montoPlanilla+=sueldoFinal;
      
      promedioSalarios=montoPlanilla/contadorGeneral;
      
      
      JOptionPane.showMessageDialog(null,"Datos de empleado" + 
                                     "\ncodigo: " + codigo +
                                      "\nNombre: " + nombre +
                                       "\nAño de nacimiento: " + anioNacimiento + 
                                       "\nEdad: " + edad +
                                        "\nHoras trabajadas: " + numeroHoras +
                                        "\nDirección: " + direccion +
                                          "\nCategoria: " + categoria +
                                           "\nSalario Final: " + sueldoFinal);
      
      JOptionPane.showMessageDialog(null,"Datos de la empresa" + 
                                    "\nMonto Planilla: " + nf.format(montoPlanilla) +
                                    "\nPromedio de Salario: " + nf.format(promedioSalarios) +
                                    "\nCantidad de empleados categoria B: " + contadorCategoria +
                                    "\nEmpleados mayores a 50 años: " + contadorEdad);
     
     opcion=Integer.parseInt(JOptionPane.showInputDialog("Desea calcular el salario de otro empleado: "
             + "\n Presione 1 para si"
             + "\n Presione 2 para no"));
     
     }while(opcion==1);
     
     
     
    }
    
}
