
package Parte2;

import java.util.Scanner;

public class ClsComisiones {
    //definimos variables constantes
    private static final int NOMBRE = 0; 
    private static final int ENERO = 1;
    private static final int FEBRERO = 2;
    private static final int MARZO = 3;
    private static final int TOTAL = 4;
    private static final int PROMEDIO = 5;
    
    
    private static String[][] comisiones = new String [3][6];
    
    
    public static void  cargaInformacion(int fila){//declaramos un parmetro fila 
        
        Scanner t = new Scanner(System.in);
        System.out.println("Ingres Nombre"+ fila);
        comisiones[fila][NOMBRE] = t.nextLine();//nexline para leer cadenas
        System.out.println("Ingrese Enero");
        comisiones[fila][ENERO] = t.nextLine();
        System.out.println("Ingrese Febrero");
        comisiones[fila][FEBRERO] = t.nextLine();
        System.out.println("Ingrese Marzo");
        comisiones[fila][MARZO] = t.nextLine();     
        comisiones[fila][TOTAL]= comisiones[fila][1]+comisiones[fila][2]+comisiones[fila][3];
        
    }
    
   // public static void total(){
     //   int[]total=new int[3];
       // for (int x=0; x<comisiones.length; x++){
         //   total[1]=total[1]+Integer.parseInt(comisiones[x][ENERO]);
           // total[2]=total[2]+Integer.parseInt(comisiones[x][FEBRERO]);
            //total[3]=total[3]+Integer.parseInt(comisiones[x][MARZO]);
        //}System.out.println("el total es" +total );
    //}
     public static void imprimeDecorado(String[][] ma) {//darle formato
        for (int x = 0; x < ma.length; x++) {
            System.out.print("|");
            for (int y = 0; y < ma[x].length; y++) {
                System.out.print(ma[x][y]);
                if (y != ma[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
    }
     
    private static void registro(){//para filas
        for (int i = 0; i < comisiones.length; i++){
            cargaInformacion(i);
        }
    
    
    
}
 public static void menu(){
        
     //Scanner obj=new Scanner(System.in);
     //int menugen;
     //String a;
       // System.out.println("que opcion deseas ?" );
        //System.out.println("1. ingresar datos \t2.total de un mes\t3.datos mayores y menores\n4.totales de filas\t5.buscar datos");
        //menugen=obj.nextInt();
        
       // switch(menugen){
           // case 1:  
            //ingreso_datos();
            //imprimirDecorado(comisiones);
             //totalm();
           
           // break;
            //case 2: System.out.println("1.total de enero\t2.total de febrero\ttotal de marzo");
            //totalm();
            //int menu2;
            //menu2=obj.nextInt();
             //switch(menu2){
               //  case 1:
                 //;break;
                 //case 2:a="total de febrero";break;
                 //case 3:a="total de marzo";break;
             //}break;
             
            //case 3: a ="datos mayores y menores";
          
        //}
        }
    
  
    
    public static void main(String[] args) {
     registro();   
     imprimeDecorado(comisiones);
       
      // menu();
        
    }
    
    
}