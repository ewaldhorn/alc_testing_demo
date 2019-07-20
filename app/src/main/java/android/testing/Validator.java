package android.testing;

public class Validator {
    public boolean isValid(String input) {

        if (input == null) return false;

        switch (input) {
            case "Blue" :
            case "Red" :
            case "Orange" : return true;
            default: return false;
        }
    }
}
