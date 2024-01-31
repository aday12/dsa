package com.algorithms;

public class BinaryConvert {

    public static void main(String[] args) {
        int number = convertFromBinary("100101");
        System.out.println("Number for binary 100101: " + number);
    }

    public static int convertFromBinary(String binary) {
        // Lab1.1: return calculated decimal value converted from String binary
            int result = 0;

            for (int i = 0; i < binary.length(); i++) {
                char binaryChar = binary.charAt(i);
                int power = binary.length() - i - 1;

                if (binaryChar == '1') {
                    result += Math.pow(2, power);
                } else if (binaryChar != '0') {
                    throw new IllegalArgumentException("Invalid input");
                }
            }
            return result;
        }

}
