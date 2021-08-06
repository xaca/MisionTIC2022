import java.util.Scanner;

public class matriz2 {
    public static void main(String[] args) {

        String id,nombre;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el número de empleados a digitar");
        int num = entrada.nextInt();
        num = num+1;
        String matriz2 [][] = new String[num][2];
        for (int i=0;i<matriz2.length;i++){
            for (int j =0;j<matriz2[i].length;j++){
                if (matriz2[i][j] == matriz2[0][0] ){
                    matriz2[i][j] = "Id";
                }
                else if (matriz2[i][j] == matriz2[0][1] ){
                    matriz2[i][j] = "Nombre";
                }
                else{
                /*matriz2[0][2] = "Hora Extra";
                matriz2[0][3] = "Auxilio de transporte";
                matriz2[0][4] = "Salario";*/
                System.out.println("Digite el id: en la posición matriz ["+i+"] ["+j+"]");
                id = entrada.next();
                matriz2[i][j]= id;
                System.out.println("Digite el Nombre: ");
                nombre = entrada.next();
                matriz2[i][j]= nombre;
                if (i < num) {
                    
                }
                /*System.out.println("Digite el Hora Extra: ");
                horaExtra = entrada.next();
                matriz2[i][j]= horaExtra;
                System.out.println("Digite el Auxilio De transporte: ");
                AuxTransporte = entrada.next();
                matriz2[i][j]= AuxTransporte;
                System.out.println("Digite el Salario: ");
                Salario = entrada.next();
                matriz2[i][j]= Salario;*/
                }
            }
            
        }
        entrada.close();
        ver_matriz(matriz2);
    }

    public  static void ver_matriz(String matriz[][]){
        for (int i=0;i<matriz.length;i++){
            //imprimimios un seprados de matriz.
            System.out.print("|");
            // Se pone el matriz[i] porque recorre la fila i 
            for (int j =0;j<matriz[i].length;j++){
                // Un metodo por si quiero sumarla. Como ya la esta recorriendo
                //Comenzamos a mostrar la matriz.
                System.out.print (matriz[i][j]+ "|");
                //System.out.println((" Matriz ["+i+"]["+j+"]: "+matriz[i][j]));
                //if (j!=matriz[i].length-1) System.out.print("\t");
                }
            System.out.println("");
        }
    }
}
