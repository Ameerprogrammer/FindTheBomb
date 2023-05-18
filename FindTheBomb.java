//Ameer Ahmed

public class FindTheBomb {
    public static String bomb(String str) {

            if(str.contains("bomb") || str.contains("BOMB") || str.contains("BoMb") || str.contains("bOmB")) {
                return "DUCK!";
            }
            else {
                return "Relax, there's no bomb.";
            }
    }
    public static void main (String[] args) {
        System.out.println(bomb("There is a bomb."));
        System.out.println(bomb("Hey, did you think there is a BOMB?"));
        System.out.println(bomb("This goes boom!!!"));
    }
}