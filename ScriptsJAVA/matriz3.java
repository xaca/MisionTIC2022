import java.util.Scanner;

public class matriz3 {

    public static void main(String[] args) {
        String id,nombre;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el número de personas a digitar");
        int num = entrada.nextInt();
        int i = 0;
        String matriz2 [][] = new String[num][2];
        matriz2[0][0] = "Id";
        matriz2[0][1] = "Nombre";

        for (int j=0;j<2;j++) {
            System.out.println("Digite el id: en la posición matriz ["+i+"] ["+j+"]");
            id = entrada.next();
            matriz2[i][j]= id;
            System.out.println("Digite el Nombre: ");
            nombre = entrada.next();
            matriz2[i][j]= nombre;
            if (i < num) {
                i++;
            }
        }
        entrada.close();
        ver_matriz(matriz2, num);
    }

    public  static void ver_matriz(String matriz[][],int num) {
        for (int i=0;i<num;i++){
            System.out.print("|");
            for (int j =0;j<2;j++) {
                System.out.print (matriz[i][j]+ "|");
            }
            System.out.println("");
        }
    }
}
