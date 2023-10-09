package net.salesianos.processes;

public class VowelCounter {
    public static void main(String[] args) {
        //String line = args[0];
        //String[] letters = line.split("");
        int nCoincidencias = 0;

        String pruebita = "hola buenos dias";

        for (int i = 0; i < pruebita.length(); i++) {

            String caracterComparar = String.valueOf(pruebita.charAt(i));

            if(caracterComparar.equals("o")){
                nCoincidencias++;
            }
        }
        System.out.println(nCoincidencias);
        
    }
}
