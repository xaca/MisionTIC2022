import java.util.Scanner;

public class matrices {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el número de filas(>=2) de la matriz");
        int num_fil=entrada.nextInt();
        System.out.println("Ingrese el número de columnas(>=2) de la matriz");
        int num_col=entrada.nextInt();
        double matriz [][] = new double[num_fil][num_col];
        
        double dato;
        //Llenar matriz
        System.out.println("Ingrese el valor de cada dato de la matriz: ");
        for (int i=0;i<matriz.length;i++){
            for (int j =0;j<matriz[i].length;j++){
                System.out.println(("Digite el valor en la posición Matriz ["+i+"]["+j+"]: "));
                dato = entrada.nextDouble();
                matriz[i][j] =dato;

            }
        }
        double suma = 0;
        //Mostrar matriz
        for (int i=0;i<matriz.length;i++){
            //imprimimios un seprados de matriz.
            System.out.print("|");
            // Se pone el matriz[i] porque recorre la fila i 
            for (int j =0;j<matriz[i].length;j++){
                // Un metodo por si quiero sumarla. Como ya la esta recorriendo
                suma = suma+ matriz[i][j];
                //Comenzamos a mostrar la matriz.
                System.out.print (matriz[i][j]+ " ");
                //System.out.println((" Matriz ["+i+"]["+j+"]: "+matriz[i][j]));
                //if (j!=matriz[i].length-1) System.out.print("\t");
                }
                System.out.println("|"); 
        }
        int datos = matriz.length*matriz[0].length;
        System.out.println("La suma de los datos de la matriz es:"+  suma);
        System.out.println("El promedio de los datos es:"+  suma/datos);

        entrada.close();
    }
}
