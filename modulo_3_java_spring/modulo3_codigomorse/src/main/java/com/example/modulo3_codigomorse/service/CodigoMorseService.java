package com.example.modulo3_codigomorse.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

@Service
public class CodigoMorseService implements CodigoMorse {
    private static final String[][] arrayMorse = new String[][]{
            {".-", "A"}, {"-...", "B"}, {"-.-.", "C"}, {"-..", "D"},
            {".", "E"}, {"..-.", "F"}, {"--.", "G"}, {"....", "H"},
            {"..", "I"}, {".---", "J"}, {"-.-", "K"}, {".-..", "L"},
            {"--", "M"}, {"-.", "N"}, {"---", "O"}, {".--.", "P"},
            {"--.-", "Q"}, {".-.", "R"}, {"...", "S"}, {"-", "T"},
            {"..-", "U"}, {"...-", "V"}, {".--", "W"}, {"-..-", "X"},
            {"-.--", "Y"}, {"--..", "Z"},
            {".----", "1"}, {"..---", "2"}, {"...--", "3"}, {"....-", "4"},
            {".....", "5"}, {"-....", "6"}, {"--...", "7"}, {"---..", "8"},
            {"----.", "9"}, {"-----", "0"}, {"..--..", "?"}, {".-.-.-", "."},
            {"-.-.--", "!"}, {"--..--", ","}

    };

    @Override
    public String transformarMorseEmAz(String morse) {
        String[] chars = morse.split(" ");
        chars = buscarChars(chars);
        String frase = Arrays.stream(chars).reduce("", String::concat);
        return frase;
    }

    public String[] buscarChars(String[] morseChars) {
        String[] frase = new String[morseChars.length];
        int aux = 0;
        for (String morseChar : morseChars) {
            if (morseChar.equals("")) {
                frase[aux] = " ";
                aux++;
                continue;
            }
            for (int i = 0; i < arrayMorse.length; i++) {
                if (arrayMorse[i][0].equals(morseChar)) {
                    frase[aux] = arrayMorse[i][1];
                    aux++;
                    break;
                }
            }
        }
        return frase;
    }
}
