package de.neuefische.passwort;

public class Passwortvalidierung {

    public static void main(String[] args) {
    }

    public static boolean pwMitUpperLetter(String pw) {
        int i = pw.length();
        int h = 0;
        char pwSubstr;
        while (h < i) {
            pwSubstr = pw.charAt(h);
            if (Character.isUpperCase(pwSubstr)) {
                return true;
            } else {
                h++;
            }
        }
        String cMessage = "Bitte Passwort mit mindestens 1 Grossbuchstaben eingeben!";
        System.out.println(cMessage);
        return false;
    }

    public static boolean pwMitLowerLetter(String pw) {
        int i = pw.length();
        int h = 0;
        char pwSubstr;
        while (h < i) {
            pwSubstr = pw.charAt(h);
            if (Character.isLowerCase(pwSubstr)) {
                return true;
            } else {
                h++;
            }
        }
        String cMessage = "Bitte Passwort mit mindestens 1 Kleinbuchstaben eingeben!";
        System.out.println(cMessage);
        return false;
    }

    public static <lDigit> boolean pwMitZahlen(String pw) {
        int i = pw.length();
        int h = 0;
        char pwSubstr;
        String x;
        String message = "";

        while (h < i) {
            pwSubstr = pw.charAt(h);
            if (Character.isDigit(pwSubstr)) {
                return true;
            } else {
                h++;
            }
        }
        String cMessage = "Bitte Passwort mit mindestens 1 Zahl eingeben!";
        System.out.println(cMessage);
        return false;
    }


     public static boolean passwortLen(String pw)  {
        if (pw.length() < 8) {
            String cMessage = "Bitte Passwort mit mindestens 8 Stellen eingeben!";
            System.out.println(cMessage);
            return false;
        }
        return true;
    }

}
