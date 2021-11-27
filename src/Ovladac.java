import java.util.Objects;
import java.util.Scanner;

public class Ovladac {
    Parkovisko parkovisko;

    public Ovladac() {
        parkovisko = new Parkovisko();
    }

    private String nacitajVstup() throws ZlyVstupException {
        Scanner vstup = new Scanner(System.in);
        System.out.print("Zadaj vstup: ");
        String vystup = vstup.nextLine();
        if (!Objects.equals(vystup, "a") && !Objects.equals(vystup, "b") && !Objects.equals(vystup, "k")) {
            throw new ZlyVstupException("Zle zadany vstup");
        }
        return vystup;
    }

    public void zacniProgram() {
        System.out.println("Vitaj v simulatore pre parkovisko!");
        System.out.println("Pre zmenu stavu snimaca A napis 'a' | pre zmenu stavu snimaca B napis 'b'  | pre koniec napis 'k'");
        this.ovladajSimulaciu();
    }

    private void ovladajSimulaciu() {
        String vstup;
        vstup = kontrolujVstup();
        while (!vstup.equals("k")) {
            if (vstup.equals("")) {
                vstup = this.kontrolujVstup();
                continue;
            }
            if (vstup.equals("a")) {
                if (this.parkovisko.getSnimacA().getVstup().equals(Vstup.L_0)) {
                    this.parkovisko.snimacA.setVstup(Vstup.L_1);
                } else {
                    this.parkovisko.snimacA.setVstup(Vstup.L_0);
                }
                this.parkovisko.zmenStav();
                System.out.println(this.parkovisko.toString());
                vstup = this.kontrolujVstup();
                continue;
            }
            if (vstup.equals("b")) {
                if (this.parkovisko.getSnimacB().getVstup().equals(Vstup.L_0)) {
                    this.parkovisko.snimacB.setVstup(Vstup.L_1);
                } else {
                    this.parkovisko.snimacB.setVstup(Vstup.L_0);
                }
            }
            this.parkovisko.zmenStav();
            System.out.println(this.parkovisko.toString());
            vstup = this.kontrolujVstup();
        }
    }

    private String kontrolujVstup() {
        String vstup;
        try {
            vstup = this.nacitajVstup();
        } catch (ZlyVstupException e) {
            System.out.println("Zadany zly vstup! Zadaj bud 'a' alebo 'b'");
            vstup = "";
        }
        return vstup;
    }
}