public class Snimac {

    Vstup vstup;

    public Snimac() {
        this.vstup = Vstup.L_0;
    }

    public String vypisVstup() {
        return this.vstup.vypisVstup(this.getVstup());
    }

    public Vstup getVstup() {
        return vstup;
    }

    public void setVstup(Vstup vstup) {
        this.vstup = vstup;
    }
}
