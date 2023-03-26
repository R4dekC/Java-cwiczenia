public class Kino {
    public static void main(String[] args) {
     /*
    do 10 lat
    nastolatkowie do 18
    dorośli
     */
        String message = "Witamy w kinie, jesteś ";
        int wiek = 4;
        if (wiek > 0 && wiek < 10) {
            System.out.printf("%s masz %s i możesz wejść do kina." + message + wiek);
        } else if (wiek >= 10 && wiek < 18) {
            System.out.println("%s masz %s i możesz wejść do kina." + message + wiek);
        } else if (wiek >= 18) {
            System.out.println("%s masz %s i możesz wejść do kina." + message + wiek);
        }
    }
}
