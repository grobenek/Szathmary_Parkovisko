public enum Stav {
    S0,S1,S2,S3;

    public String vypisStav(Stav stav) {
        if (stav.equals(Stav.S0)) {
            return "S0";
        }
        if (stav.equals(Stav.S1)) {
            return "S1";
        }
        if (stav.equals(Stav.S2)) {
            return "S2";
        }
        if (stav.equals(Stav.S3)) {
            return "S3";
        }
        return null;
    }

}
