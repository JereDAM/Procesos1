import java.io.File;
import java.util.ArrayList;

import net.salesianos.Launcher.VowelLauncher;
import net.salesianos.utils.Utils;

public class App {
    public static void main(String[] args) throws Exception {
    
        ArrayList<String> lines = Utils.getAllTextLineCounter("src\\lorem_ipsum.txt");
        ArrayList<Process> allProcesses = new ArrayList<>();

        Integer lineCounter = 0;
        String vowela = "a";
        String vowele = "e";
        String voweli = "i";
        String vowelo = "o";
        String vowelu = "u";


        
        for (String line : lines) {
            lineCounter++;
            String outputFileName = "outputLine" + lineCounter + ".txt";
            Process javaProcess = VowelLauncher.initVowelCounter(line, vowela, outputFileName);
            allProcesses.add(javaProcess);
        }

        for (String line : lines) {
            lineCounter++;
            String outputFileName = "outputLine" + lineCounter + ".txt";
            Process javaProcess = VowelLauncher.initVowelCounter(line, vowele, outputFileName);
            allProcesses.add(javaProcess);
        }

        for (String line : lines) {
            lineCounter++;
            String outputFileName = "outputLine" + lineCounter + ".txt";
            Process javaProcess = VowelLauncher.initVowelCounter(line, voweli, outputFileName);
            allProcesses.add(javaProcess);
        }

        for (String line : lines) {
            lineCounter++;
            String outputFileName = "outputLine" + lineCounter + ".txt";
            Process javaProcess = VowelLauncher.initVowelCounter(line, vowelo, outputFileName);
            allProcesses.add(javaProcess);
        }

        for (String line : lines) {
            lineCounter++;
            String outputFileName = "outputLine" + lineCounter + ".txt";
            Process javaProcess = VowelLauncher.initVowelCounter(line, vowelu, outputFileName);
            allProcesses.add(javaProcess);
        }

        for (Process process : allProcesses) {
            try {
                process.waitFor();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Integer totalVowels = 0;

        for (int i = 1; i <= lineCounter; i++) {
        String outputFileName = "outputLine" + i + ".txt";
        String outputFileRoute = "src/net/salesianos/outputs/" + outputFileName;
        Integer VowelsFromFile = Utils.getTotalVowelsFrom(outputFileRoute);
        totalVowels += VowelsFromFile;

        System.out.println("El fichero " + outputFileName + " tiene " + VowelsFromFile );
    
        File outputFile = new File(outputFileRoute);
        outputFile.delete();
        }
        
        System.out.println("El fichero tiene " + totalVowels + " vocales en total");
    }
}
