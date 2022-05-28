/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareasabado;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class TareaSabado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereScanner sc= new Scanner(System.in);
        Scanner sc= new Scanner(System.in);
         TablaAlumno ejerciciosListasB= new TablaAlumno();
         TablaDatos AlumnosA=new TablaDatos();
         FinalB Alumno2=new FinalB();
         
          int opcion =0;
          
         do{
          
              System.out.println("*--Registro de Alumnos--*");
          
              System.out.println("Seleccione la opcion de registro que desee utilizar: ");
              System.out.println("{1) Registro de datos con arrays"); 
              System.out.println("{2) Registro de datos con listas"); 
              System.out.println("{3) MostrarHistorial");
              System.out.println("{0) Salir");
              
              
              System.out.println("Ingrese la opcion que desea usar: ");
                  opcion =sc.nextInt();
                  
              switch(opcion){
                 
                 case 1:
                     
                     int opcionA = 0;
                     
                     do{
                         
                      
                       System.out.println("*-- seleccione la opcion a registrar: ----");
                         System.out.println("\n");
                       System.out.println("0- Volver al inicio");
                       System.out.println("1- Datos alumnno");
                       System.out.println("2- Datos alumno");
                       System.out.println("3- Datos del curso"); 
                       System.out.println("4- Datos del curso");
                       
                       
                     System.out.println("Ingrese la opcion que desea usar: ");
                     opcionA =sc.nextInt();
                     
 
              switch(opcionA){

                case 1:
                     String nombreA="";
                     String nombreB="";
                     
                         
                      System.out.println(ejerciciosListasB.datAlumn(nombreA,nombreB));
                      System.out.println(""+ejerciciosListasB.datosAlumnosB);
                         
                    //ejerciciosListasB.datosAlumnos(nombreA, codigoA, numeroB, nombreB);
                          

	          break;
                  
                  case 2:
                   
                    int codigoA=0;
                    int numeroB=0;
                  
         
                      System.out.println(ejerciciosListasB.datosAlumnos(numeroB,codigoA));
                      System.out.println(""+ejerciciosListasB.datosAlumnosB);
                         
                       
                       

                           
	          break;
                  
                  
                  case 3:
                      
                        String nombreC="";
                        String descripcionA="";
                         
                        System.out.println(ejerciciosListasB.datosCursos2(nombreC,descripcionA));
                        System.out.println(""+ejerciciosListasB.datoCursoBA);
         
                      
                      break;
                      
                   case 4:
                      
                        int codigoC=0;
                        int codigoG=0;
                           
                        System.out.println(ejerciciosListasB.datosCursos(codigoC,codigoG));
                        System.out.println(""+ejerciciosListasB.datoCursoB);
                         
                      
                  break;
                      
                  
                case 0:
                     
	          break;
                }
              
             }while(opcionA!=0);
   
             break;
             
                case 2:
                    
                     int codigoA=0;
                    int numeroB=0;
                  
         
                      System.out.println(Alumno2.AlumnosB(numeroB,codigoA));
                      System.out.println(""+Alumno2.listAlumnos);
                     
                 break;
                 
                case 3:
                  
                   ejerciciosListasB.mostrarDatos();
                     
                 break;
                 
                case 4:
                     
                     
                 break;
                 
                case 0:
                              
                 break;
                 
              }
         
         }while(opcion!=0);        
    
         System.out.println("The End");
    }
}
    
    

