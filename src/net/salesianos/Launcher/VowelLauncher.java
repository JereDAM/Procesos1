package net.salesianos.Launcher;

import java.io.File;
import java.io.IOException;

public class VowelLauncher {
    
    private final static String OUTPUT_ROUTE = "./net/salesianos/outputs/";

  public static Process initVowelCounter(String text, String vowel, String fileName) {
    ProcessBuilder processBuilder = new ProcessBuilder(
      "java", "./net/salesianos/processes/VowelCounter.java", text, vowel
    );

    Process javaProcess = null;

    try {
      File outputFile = new File(OUTPUT_ROUTE + fileName);
      processBuilder.redirectOutput(outputFile);
      javaProcess =  processBuilder.start();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    return javaProcess;
  }
}
