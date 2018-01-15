package xkorpion;

public class Main {
    public static int recursive2(int number, int power, int n, int counter){
        n = n * number;
        counter++;
        if(n < power){
            counter = recursive2(number, power, n, counter);
        }
        return counter;
    }
    public static int recursive(int number, int power){
        int n = number * number;
        int counter = 2;
        if(n < power){
            counter = recursive2(number, power, n, counter);
        }
        return counter;
    }
}
