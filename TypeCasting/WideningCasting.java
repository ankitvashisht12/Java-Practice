/*
    Widening Casting : (automatically)  converting smaller data type to larger type 
        byte -> short -> char -> int -> long -> float -> double
*/

class WideningCasting{
    public static void main(String[] args) {
        int myInt = 23;
        double myDouble = myInt;
        System.out.println("Int value is : " + myInt + " and Double value is : " + myDouble);
    }
}