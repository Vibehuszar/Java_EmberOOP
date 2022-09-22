package hu.petrik.emberekoop;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ember {

    private String nev;
    private String szulDatum;
    private String szulHely;

    public Ember(String nev, String szulDatum, String szulHely) {
        this.nev = nev;
        this.szulDatum = szulDatum;
        this.szulHely = szulHely;
    }

    public int szulEv(){
        int ev = Integer.parseInt(szulDatum.substring(0,4));
        return ev;
    }
    public int szulHonap(){
        String[] honap = this.szulDatum.split("-");
        return Integer.parseInt(honap[1]);
    }

    public int szulNap(){
        String[] nap = this.szulDatum.split("-");
        return Integer.parseInt(nap[2]);
    }

    public int eletKor(int eletkor){
        return LocalDate.now().getYear() - szulEv();
    }
    @Override
    public String toString(){
        return  String.format("%30s, %10s, (%3s), %20s,",this.nev, this.szulDatum, this.eletKor(szulEv()) , this.szulHely);
    }
}
