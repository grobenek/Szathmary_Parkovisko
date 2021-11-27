public class Parkovisko {

    Snimac snimacA;
    Snimac snimacB;
    Stav stav;

    public Parkovisko() {
        this.snimacA = new Snimac();
        this.snimacB = new Snimac();
        this.stav = Stav.S0;
    }

    public Snimac getSnimacA() {
        return snimacA;
    }

    public Snimac getSnimacB() {
        return snimacB;
    }

    public Stav getStav() {
        return stav;
    }

    public void zmenStav() {
        switch (this.stav) {
            case S0:
                if (this.snimacA.getVstup() == Vstup.L_0 && this.snimacB.getVstup() == Vstup.L_1) {
                    this.stav = Stav.S1;
                    System.out.println("Stav zmeneny na S1!");
                } else {
                    this.stav = Stav.S0;
                }
                break;
            case S1:
                if (this.snimacA.getVstup() == Vstup.L_1 && this.snimacB.getVstup() == Vstup.L_1) {
                    this.stav = Stav.S0;
                    System.out.println("Stav zmeneny na S0!");
                    break;
                } else if (this.snimacA.getVstup() == Vstup.L_1 && this.snimacB.getVstup() == Vstup.L_0) {
                    this.stav = Stav.S2;
                    System.out.println("Stav zmeneny na S2!");
                    break;
                } else {
                    this.stav = Stav.S1;
                    break;
                }
            case S2:
                if (this.snimacA.getVstup() == Vstup.L_0 && this.snimacB.getVstup() == Vstup.L_0) {
                    this.stav = Stav.S1;
                    System.out.println("Stav zmeneny na S1!");
                    break;
                } else if (this.snimacA.getVstup() == Vstup.L_0 && this.snimacB.getVstup() == Vstup.L_1) {
                    this.stav = Stav.S3;
                    System.out.println("Stav zmeneny na S3!");
                    break;
                } else {
                    this.stav = Stav.S2;
                    break;
                }
            case S3:
                if (this.snimacA.getVstup() == Vstup.L_1 && this.snimacB.getVstup() == Vstup.L_1) {
                    this.stav = Stav.S2;
                    System.out.println("Stav zmeneny na S2!");
                } else {
                    this.stav = Stav.S3;
                }
                break;
            default:
                break;
        }
    }

    public String dajFarbu() {
        return switch (this.stav) {
            case S0, S1 -> ConsoleColors.GREEN + "Zelena" + ConsoleColors.RESET;
            case S2, S3 -> ConsoleColors.RED + "Cervena" + ConsoleColors.RESET;
        };
    }

    @Override
    public String toString() {
        return "Stav parkoviska:" +
                this.getStav().vypisStav(this.getStav()) +
                " | SnimacA: " +
                this.snimacA.vypisVstup() +
                " | SnimacB: " +
                this.snimacB.vypisVstup() +
                " | Farba: " +
                this.dajFarbu() +
                "\n\n\n\n\n\n\n";
    }
}
