package com.back.standard.util;

import java.io.PrintStream;
import java.util.Scanner;

public class TestUtil {private static final PrintStream ORIGINAL_OUT = System.out;

    public static Scanner genScanner(String input) {
        return new Scanner(input);
    }

}
