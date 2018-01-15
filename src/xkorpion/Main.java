package xkorpion;

public class Main {
    public static int recursive(int number, int power, int n, int counter){
        n = n * number;
        counter++;
        if(n < power){
            counter = recursive(number, power, n, counter);
        }
        return counter;
    }
}
