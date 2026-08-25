public class ExemploDeVariaveis {
    public static void main(String args[]){
        int a; //ocupando 4 bytes de memória ou 32 bits - valores de -2.147.483.648 a 2.147.483.647
        long b; //ocupando 8 bytes de memória ou 64 bits - valores de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
        short c; //ocupando 2 bytes de memória ou 16 bits - valores de -32.768 a 32.767
        byte d; //ocupando 1 byte de memória ou 8 bits - valores de -128 a 127

        a = 10;
        b = 8914;
        c = 10000;
        d = (byte)200;

        System.out.println("O valor da variável a é: " + a);
        System.out.println("O valor da variável b é: " + b);
        System.out.println("O valor da variável c é: " + c);
        System.out.println("O valor da variável d é: " + d);


    }
}