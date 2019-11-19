/*
    Narrowing Casting : (manually) Converting large datatype to smaller datatype
        double -> float -> long -> int -> char -> short -> byte
*/

class NarrowingCasting{
    public static void main(String[] args) {
        double myDouble = 20.34;
        int myInt = (int) myDouble;

        System.out.println(
            "Value of Double is :" + myDouble + " and Int is :" + myInt
        );
    }
}