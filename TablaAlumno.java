/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareasabado;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class TablaAlumno {
    String nombreA = "";
     float codigoAA;
     float numeroBA;
     String nombreB = "";
     float codigoCA;
     String nombreCA = "";
     float codigoG;
     String descripcionAA ="";
     String[] vectorDatos;
     private int indiceVector;
     String[] vector;
     private String[] registrarDatos;
     String i="";
     int datosAlumnosB;
     int codigoA;
     int numeroB;
      Scanner sc= new Scanner(System.in);
    String datoCursoBA;
    String datoCursoB;
    
     
     
     //constructor
     public TablaAlumno(){
        this.nombreA="";
        this.nombreB="";
        this.codigoA=0;
        this.numeroB=0;
        vectorDatos = new String [100];//inicializo el vector
         this.indiceVector= 0;  
         this.registrarDatos(i, i, i, i, numeroB, i, i, i, numeroB);
     }
     
    /**
     *
     * @param numeroB
     * @param codigoA
     * @param nombreA
     * @return
     */
    public int datosAlumnos(int numeroB, int codigoA ){
 
                      
                        System.out.println("*-Ingresa tu numero de telefono: -*");
                         numeroB= sc.nextInt();
                      
                        System.out.println("*-Ingresa tu  codigo de alumno: -*");
                         codigoA = sc.nextInt();
      

                     this.registrarDatos("Datos","..","numeroDeTelefono","....",numeroB,"....","codigoDeAlumno","....",codigoA);  
            
            return datosAlumnosB;
     }
     
    
   public void registrarDatos(String tipo, String espacio1,String tipo1, String espacio2, int primerParametro, String espacio3, String tipo3, String espacio4, int segundoParametro){
       indiceVector=indiceVector+1;;
       
      vectorDatos[indiceVector]= tipo+espacio1+""+tipo1+espacio2+""+primerParametro+""+espacio3+""+tipo3+espacio4+""+segundoParametro;
   
    }
     
      public void mostrarDatos(){
          try{   
              System.out.println(vectorDatos.length);
            for (int i=1; i<vectorDatos.length;i++){
                if(vectorDatos[i]!=null){
                    System.out.println(vectorDatos[i]);
                }
            } 
        }catch(Exception e){
            System.out.println(e.getMessage());       
        }
     }

       public void almacenarDatos(String numero){
        this.vector[indiceVector]=numero;
        this.indiceVector=this.indiceVector+1;
    }

    boolean datAlumn(String nombreA, String nombreB) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    boolean datosCursos2(String nombreC, String descripcionA) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    boolean datosCursos(int codigoC, int codigoG) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   






   

 

    

              
       }

