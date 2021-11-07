package Ukol_7;

import java.util.regex.Pattern;

class ValidatorTextu {

    private String vzor;

    public ValidatorTextu(String vzor) {
        this.vzor = vzor;
    }

    public boolean validuj(String text) {
        return Pattern.matches(this.vzor, text);
    }

    @Override
    public String toString() {
        return "Vzor: " + this.vzor;
    }
}
