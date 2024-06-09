import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Declaramos el scanner
        Scanner scanner = new Scanner(System.in);

        String palabraSecreta = "Tamales";
        int intentosMaximos = 10;
        int intentosActuales = 0;
        boolean palabraAdivinada = false;

        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        for(int n = 0 ; n < letrasAdivinadas.length ; n++){
            letrasAdivinadas[n] = '_';
        }

        System.out.println("Bienvenido al juego del ahorcado!");

        while(!palabraAdivinada && intentosMaximos > intentosActuales){

            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " de " + palabraSecreta.length() + " letras");
            

            char letra = Character.toLowerCase(scanner.next().charAt(0));
            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {

                if(Character.toLowerCase(palabraSecreta.charAt(i)) == letra){

                    letrasAdivinadas[i] = palabraSecreta.charAt(i);
                    letraCorrecta = true;
                }
                
            }

            if(!letraCorrecta){
                intentosActuales++;
                System.out.println("Error, Te quedan " + (intentosMaximos - intentosActuales) + " intentos");
            }



            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada = true;
                System.out.println("Bien jugado!");
            }

        }

        if(!palabraAdivinada){
            System.out.println("Te has quedado sin intentos, suerte la proxima!");
        }
        

        scanner.close();
    }
}
