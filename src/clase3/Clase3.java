
package clase3;


public class Clase3 {

    private static String[][] ma = new String[8][8];
    
    public  static void cargaMatriz(){
        for (int c=0; c< ma.length; c++){
            for (int f=0; f< ma.length; f++){
                ma[f][c] = "X";
            }
        }
           
    }
    
    public static void imprimeMatriz(){
        for (int c=0; c< ma.length; c++){
            for (int f=0; f< ma.length; f++){
                System.out.print(ma[f][c]);
            }
            System.out.println(" ");    
        }
           
    }
    
    
    public static void imprimeDecorado(){
        for(int x=0; x<ma.length; x++){
            System.out.print("|");
            for(int y=0; y<ma[x].length; y++){
                System.out.print(ma[x][y]);
                if (y !=ma[x].length -1){
                    System.out.print("\t");
                }
            }
        }
    }
    
    public static void columnas(){
        for(int c=0; c<ma.length; c++){
            for(int f=0; f<ma.length; f++){
                if(f%2==0){
                    ma[f][c]="P";
                }
            }
        }
    }
    
    public static void columnasX(){
        int tam = (ma.length -1);
        for (int f = 0; f<ma.length; f++){
            ma[f][f]="\\";
            ma[f][tam]= f+"/";
            tam--;
        }
            
    }
    public static void columnasL(){
        for(int f=0; f<ma.length; f++){
            ma[f][0]="L";
            ma[ma.length -1][f]="L";
        }
    }
    
    public static void main(String[] args) {
        cargaMatriz();
        imprimeMatriz();
        //imprimeDecorado();
        System.out.println("Resultado");
        //columnas();
        //columnasX();
        columnasL();
        imprimeMatriz();
        
        

        
    }
    
}
