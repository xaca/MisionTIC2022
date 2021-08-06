import java.util.*;
//la palabra static se usa en los metodos para no tener que instanciarlos y usarlos e el main. 
public class Calc {
    public static void main(String[] args) {
        Scanner  read = new Scanner(System.in);
        //Podemos poner una condición para que se repita el menú mientras la varibale no sea verdadera
        boolean output = false;
        while (!output){
            System.out.println("Bievenido a su calculadora");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. Divisón");
            System.out.println("5. Residuo ");
            System.out.println("6. Números primos ");
            System.out.println("7. Formula cuadratica");
            System.out.println("8. Salir ");
            System.out.println("Seleccione una opción: ");
            //validamos datos solo numericos
            try{
                int opc = read.nextInt();
                switch(opc)
                    { 
                    case 1:
                        System.out.println("Introduce tú primer número");
                        int sum = read.nextInt();
                        System.out.println("Introduce tú segundo número");
                        int sum2 = read.nextInt();
                        System.out.println("El resultado de la suma es: " + suma(sum,sum2)+"\n");
                        break;
                    case 2:
                        System.out.println("Introduce tú primer número");
                        int rest = read.nextInt();
                        System.out.println("Introduce tú segundo número");
                        int rest2 = read.nextInt();
                        System.out.println("El resultado de la resta es: " + resta(rest,rest2)+"\n");
                        break;
                    case 3:
                        System.out.println("Introduce tú primer número");
                        int mult = read.nextInt();
                        System.out.println("Introduce tú segundo número");
                        int mult2 = read.nextInt(); 
                        System.out.println("El resultado de la multiplicación es: " + multiplicacion(mult,mult2)+"\n");
                        break;
                    case 4:
                        System.out.println("Introduce tú primer número");
                        float div = read.nextInt();
                        System.out.println("Introduce tú segundo número");
                        float div2 = read.nextInt();
                        System.out.println("El resultado de la divisón es: " + division(div,div2)+"\n");
                        break;
                    case 5:
                        System.out.println("Introduce tú primer número");
                        float res = read.nextFloat();
                        System.out.println("Introduce tú segundo número");
                        float res2 = read.nextFloat();
                        System.out.println("El resultado del residuo es: " + modulo(res,res2)+"\n");
                        break;
                    case 6:
                        System.out.println("Introduce el número a validar: ");
                        int num_p =  read.nextInt();
                        num_prin(num_p);
                        break;
                    case 7:
                        System.out.println("Introduce tú primer número");
                        double a = read.nextDouble();
                        System.out.println("Introduce tú segundo número");
                        double b = read.nextDouble();
                        System.out.println("Introduce tú tercer número");
                        double c = read.nextDouble();
                        formula_estu(a,b,c);
                        break;
                    case 8:
                        System.out.println("Adios");
                        output = true;
                        break;
                    default:
                        System.out.println("Error");
                        System.exit(0);
                    }
            }catch(InputMismatchException ex) 
                {
                System.out.print("Parametro no valido.");
                break;
                }
        }
        read.close();
    }
    
    public  static int suma ( int a, int b){
        int c = a + b;
        return c;
    }

    public static int resta (int a, int b){
        int c = a - b;
        return c;
    }

    public static int multiplicacion (int a, int b){
        int c = a * b;
        return c;
    }
        
    public static float division (float a, float b){
        float residuo =  b % 2;
        float c = a/b;
        if (residuo == 0){
            System.out.println("No es posible dividir por 0");
        }
        return c;   
    }

    public static float modulo(float a, float b) {
        float res = b % 2;
        return res;
    }

    public static void formula_estu(double a, double b, double c){
        double x1, x2, temp;
        temp = b*b-4*a*c;
        if (temp>=0){
            if(2*a != 0){
                x1 = -b - Math.sqrt(temp) / 2 * a;
                x2 = -b - Math.sqrt(temp) / 2 * a;
                System.out.println("Las raices son: \n");
                System.out.println("x1: "+x1);
                System.out.println("x2: "+x2);
                return;
            }
            else{
                System.out.println("Error división por cero");
            }
        }
        else{
            System.out.println("Error raiz negativa");
        }
    }

    public static void num_prin(int a){
        int divisores = 0;
        for (int i= 0;i<=a;i++){
            if(a%2==0){
                divisores++;
            }
        }
        if (divisores >= 3){
            System.out.println("El número no es primo");
        }
        else{
            System.out.println("El numero si es primo");
            return;
        }
    }
}
