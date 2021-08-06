public class tipodatos {
    public static void main(String[] args) {
        String nombre="1";
        int nombre1 = Integer.parseInt(nombre);
        int nombre2= nombre1 + 2;
        System.out.println(nombre2);
        String s1 = "True";
        boolean b1=Boolean.parseBoolean(s1);
        if (s1.toLowerCase() == "si"){
            b1 = true;
            System.out.println(b1);
        }
        else{
            System.out.println(b1);
        }

        String s = "Welcome! to Geeksforgeeks Planet.";
  
        // converting string s to lowercase letter
        String gfg1 = s.toLowerCase();
        System.out.println(gfg1);
        
        
    }
}
