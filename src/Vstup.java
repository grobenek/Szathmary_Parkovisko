public enum Vstup {
    L_0, L_1;

    public String vypisVstup(Vstup vstup) {
        if (vstup.equals(Vstup.L_0)) {
            return "0";
        } else {
            return "1";
        }
    }
}
