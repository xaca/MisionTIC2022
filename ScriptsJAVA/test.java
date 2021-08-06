import java.util.ArrayList;


public class test {
    
    public static void main(String[] args) {
        String[] data = new String[9];
        for (int i=0;i<=8;i++){
            data[i] = "Hola";//similar a numpy en pyhton. 
        }
        System.out.println(data);
        String strBuff = "Hola";

        for (int i=0;i<=8;i++){
            strBuff.concat(data[i] + "|");
        }
        ArrayList<String> colaboradorList = new ArrayList<String>();

        colaboradorList.add(strBuff);

        for (int p=0;p<colaboradorList.size();p++){
            //usamos un metodo get para traer lo que hay en la posición. Es decir p para indicar la posición y p el contenido
            System.out.println("array_list_digitos["+p+"]="+colaboradorList.get(p));
        }

        
    }
}
