public class Decyzja {
    public static void main(String[] args) {
        System.out.println("---- Decyzja ----");
        /*
        good morning    12
        good afternoon  20
        good evening
         */
        String message = " jest godzina ";
        int godzina = 22;
        if(godzina < 12){
            System.out.println("Good morning!" + message + godzina);
        } else if (godzina > 12 && godzina < 20) {
            System.out.println("Good afternoon!" + message + godzina);
        } else if (godzina >= 20 && godzina <= 24) {
            System.out.println("Good evening!" + message + godzina);
        }
    }
}
