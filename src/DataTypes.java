public class DataTypes {
    public static void main(String[] args) {
        System.out.println("------------------ Data types ------------------");
        int herInt = 22;
        int hisInt = 11;
        float herFLoat = 98.7612345f;
        double hisDouble = 123.45678987d;
        char myChar = 'C';
        boolean myBool = true;
        String her = "Ewa";
        String he = "Adam";
        System.out.println("herInt: " + herInt); //konkatenacja
        System.out.println("hisInt: " + hisInt);
        System.out.println("herFloat: " + herFLoat);
        System.out.println("hisDouble: " + hisDouble);
        System.out.println("myChar: " + myChar);
        System.out.println(her + " i " + he + " są parą.");
        System.out.printf("%s i %s wydali na zakupy %.2f \n", her, he, herFLoat + hisDouble); /*po przecinku zmienne w kolejności*/
        if (!myBool) {
            System.out.println("NNN");
        } else {
            System.out.println("Prawda");
        }
    }
}
