/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareasabado;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class FinalB extends TareaSabado {
    Scanner sc= new Scanner(System.in);
   ArrayList<FinalB> listAlumnos = new ArrayList();
   
    int[] vector;
    private double[] matriz;
    private int indiceVector;
    String listaA;
    String verLista;
    
     private String nombreA;
     private String aleasA;

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public String getAleasA() {
        return aleasA;
    }

    public void setAleasA(String aleasA) {
        this.aleasA = aleasA;
    }

   
  
  //constructor
    
    public String AlumnosB(){
        
         
                      
                        System.out.println("------Ingrese el nombre del alumno: -----");
                       
                         nombreA = sc.next();
                         
                     
                        System.out.println("------Ingrese el aleas del alumno: ------");
                    
                         aleasA = sc.next();
                       
     String nombreA = ("Nombre del Alumno");
     String aleasA = ("Aleas del Alumno ");
     FinalB registroA = new FinalB();
     registroA.setNombreA(nombreA);
     registroA.setAleasA(aleasA);
     listAlumnos.add(registroA);
     
     return verLista;

   }
   
   
   public void mostrarAlumnosB(){
      String string="";
      for(int i=0;i<listAlumnos.size();i++){
         string+=""+(i+1)+"\n";
         string+="nombreDelAlumno: "+listAlumnos.get(i).getNombreA()+"\n";
         string+="aleasDelAlumno: "+listAlumnos.get(i).getAleasA()+"\n";
      }
      
   }

    boolean AlumnosB(int numeroB, int codigoA) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
  
}

