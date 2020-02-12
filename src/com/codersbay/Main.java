package com.codersbay;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan_console = new Scanner(System.in);
        String input = scan_console.nextLine();
        //System.out.println(input);
        char[] input_char = input.toUpperCase().toCharArray();
        String leetspeak = "";
        //System.out.println(input_char);
        for (char i : input_char) {
            switch (i) {
                case ' ':
                    leetspeak += ' ';
                    break;
                case 'A':
                    leetspeak += '@';
                    break;
                case 'B':
                    leetspeak += '8';
                    break;
                case 'C':
                    leetspeak += '(';
                    break;
                case 'D':
                    leetspeak += 'D';
                    break;
                case 'E':
                    leetspeak += '3';
                    break;
                case 'F':
                    leetspeak += 'F';
                    break;
                case 'G':
                    leetspeak += '6';
                    break;
                case 'H':
                    leetspeak += '#';
                    break;
                case 'I':
                    leetspeak += '!';
                    break;
                case 'J':
                    leetspeak += 'J';
                    break;
                case 'K':
                    leetspeak += 'K';
                    break;
                case 'L':
                    leetspeak += '1';
                    break;
                case 'M':
                    leetspeak += 'M';
                    break;
                case 'N':
                    leetspeak += 'N';
                    break;
                case 'O':
                    leetspeak += '0';
                    break;
                case 'P':
                    leetspeak += 'P';
                    break;
                case 'Q':
                    leetspeak += 'Q';
                    break;
                case 'R':
                    leetspeak += 'R';
                    break;
                case 'S':
                    leetspeak += '$';
                    break;
                case 'T':
                    leetspeak += '7';
                    break;
                case 'U':
                    leetspeak += 'U';
                    break;
                case 'V':
                    leetspeak += 'V';
                    break;
                case 'W':
                    leetspeak += 'W';
                    break;
                case 'X':
                    leetspeak += 'X';
                    break;
                case 'Y':
                    leetspeak += 'Y';
                    break;
                case 'Z':
                    leetspeak += '2';
                    break;
                default:
                    leetspeak += i;
            }
        }
        System.out.println(leetspeak);
    }

}
