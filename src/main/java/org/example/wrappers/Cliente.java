package org.example.wrappers;

public class Cliente {
    private static Integer codigo;

    private Long codigoMaior = 123123l;

    private Double valorDecimal1 = 10.1;

    private Boolean status = false;

    private Float valorDecimal = 10.0f;

    private Short shor;

    private Byte bi;

    private Character letra = 'A';

    public static void main(String args[]) {

        // casting
        int codigo2 = 1111;
        short codigo3 = (short) codigo2;
    }

}
