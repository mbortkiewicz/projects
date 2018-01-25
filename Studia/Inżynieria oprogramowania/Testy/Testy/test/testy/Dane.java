package testy;


import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import mypackage.TTytul;
import mypackage.TKlient;
import mypackage.TProdukt;
import mypackage.TWypozyczenie;
import mypackage.TPozycja;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mateu
 */
public class Dane{
    public Object dane_klientow[][] = new Object[][]{
        {"","","",new byte[]{6,0,0,7,0,7,1,5,5,1,0}, "675876654",""},
        {"Adam", "Kowalski", "", new byte[]{6,3,0,6,1,4,0,7,0,7,4}, "675876654", "mb@mb.pl"},
        {"Krysia","Momo", "",new byte[]{2,1,1,0,2,9,1,4,1,4,3}, "5656566565", "oaka@ww.pl"},
        {"Marysia","Nowak", "", null, "123456789", ""},
        {"Laptop", "Lenovo", "", null, "","support@lenovo.pl"},
        {"Trololo", "Nudno", "Solilandia", new byte[]{6,5,0,7,0,6,1,3,5,6,1}, "", "walidacj@ju.com"},
        {"Co tam", "Anony", "Trawa", null, "", ""},
        {"Tutaj", "będzie", "błąd", new byte[]{7,1,0,5,0,9,0,0,3,4,1}, "123", "123"}  
    };
    
    public TKlient[] klienci()
    {
        TKlient k[] = new TKlient[8];
        k[0] = new TKlient();
        k[0].setImie("");
        k[0].setNazwisko("");
        k[0].setAdres("");
        k[0].setPESEL(new byte[]{6,0,0,7,0,7,1,5,5,1,0});
        k[0].setTelefon("675876654");
        k[0].setMail("");
        
        k[1] = new TKlient();
        k[1].setImie("Adam");
        k[1].setNazwisko("Kowalski");
        k[1].setAdres("");
        k[1].setPESEL(new byte[]{6,3,0,6,1,4,0,7,0,7,4});
        k[1].setTelefon("675876654");
        k[1].setMail("mb@mb.pl");

        k[2] = new TKlient();
        k[2].setImie("Krysia");
        k[2].setNazwisko("Momo");
        k[2].setAdres("");
        k[2].setPESEL(new byte[]{2,1,1,0,2,9,1,4,1,4,3});
        k[2].setTelefon("5656566565");
        k[2].setMail("oaka@ww.pl");
        
        k[3] = new TKlient();
        k[3].setImie("Marysia");
        k[3].setNazwisko("Nowak");
        k[3].setAdres("");
        k[3].setPESEL(null);
        k[3].setTelefon("123456789");
        k[3].setMail("");
        
        k[4] = new TKlient();
        k[4].setImie("Laptop");
        k[4].setNazwisko("Lenovo");
        k[4].setAdres("");
        k[4].setPESEL(null);
        k[4].setTelefon("");
        k[4].setMail("support@lenovo.pl");
        
        k[5] = new TKlient();
        k[5].setImie("Trololo");
        k[5].setNazwisko("Nudno");
        k[5].setAdres("Solilandia");
        k[5].setPESEL(new byte[]{6,5,0,7,0,6,1,3,5,6,1});
        k[5].setTelefon("");
        k[5].setMail("walidacj@ju.com");
        
        k[6] = new TKlient();
        k[6].setImie("Co tam");
        k[6].setNazwisko("Anony");
        k[6].setAdres("Trawa");
        k[6].setPESEL(null);
        k[6].setTelefon("");
        k[6].setMail("");
        
        k[7] = new TKlient();
        k[7].setImie("Tutaj");
        k[7].setNazwisko("Będzie");
        k[7].setAdres("Błąd");
        k[7].setPESEL(new byte[]{7,1,0,5,0,9,0,0,3,4,1});
        k[7].setTelefon("123");
        k[7].setMail("123");
        
        return k;
    }
    
    TTytul tytul = new TTytul() ;
    public Object dane_produktow[][] = new Object[][]{
         
       {tytul, 456123, 4.5f, true, TProdukt.Nosnik.Bluray},
       {tytul, 789456, 2.3f, true, TProdukt.Nosnik.DVD},
       {tytul, 562415, 1.8f, true, TProdukt.Nosnik.VHS},
       {tytul, 478632, 4.5f, true, TProdukt.Nosnik.Bluray},
       {tytul, 451203, 2.9f, true, TProdukt.Nosnik.DVD},
       {tytul, 412563, 1.3f, true, TProdukt.Nosnik.VHS},
       {tytul, 456123, 2.7f, true, TProdukt.Nosnik.DVD},
       {tytul,"" ,"" , true, TProdukt.Nosnik.Bluray},            
    };
    
    public float ceny[] = new float[]{
        31.5f, 16.1f, 12.6f, 31.5f, 20.3f, 9.1f, 10.0f
    };
    
    public TProdukt[] produkty()
    {
        TProdukt p[] = new TProdukt[8];
        
        p[0] = new TProdukt();
        p[0].setTytul(tytul);
        p[0].setRef(456123);
        p[0].setStawka(4.5f);
        p[0].setNosnik(TProdukt.Nosnik.Bluray);
        p[0].setWypozyczony(false);
        
        p[1] = new TProdukt();
        p[1].setTytul(tytul);
        p[1].setRef(789456);
        p[1].setStawka(2.3f);
        p[1].setNosnik(TProdukt.Nosnik.DVD);        
        p[1].setWypozyczony(false);
        
        p[2] = new TProdukt();
        p[2].setTytul(tytul);
        p[2].setRef(562415);
        p[2].setStawka(1.8f);
        p[2].setNosnik(TProdukt.Nosnik.VHS);
        p[2].setWypozyczony(false);
        
        p[3] = new TProdukt();
        p[3].setTytul(tytul);
        p[3].setRef(478632);
        p[3].setStawka(4.5f);
        p[3].setNosnik(TProdukt.Nosnik.Bluray);
        p[3].setWypozyczony(false);
        
        p[4] = new TProdukt();
        p[4].setTytul(tytul);
        p[4].setRef(451203);
        p[4].setStawka(2.9f);
        p[4].setNosnik(TProdukt.Nosnik.DVD);
        p[4].setWypozyczony(false);
        
        p[5] = new TProdukt();
        p[5].setTytul(tytul);
        p[5].setRef(412563);
        p[5].setStawka(1.3f);
        p[5].setNosnik(TProdukt.Nosnik.VHS);
        p[5].setWypozyczony(false);
        
        p[6] = new TProdukt();
        p[6].setTytul(tytul);
        p[6].setRef(456123);
        p[6].setStawka(2.7f);
        p[6].setNosnik(TProdukt.Nosnik.DVD);
        p[6].setWypozyczony(false);
        
        p[7] = new TProdukt();
        p[7].setTytul(tytul);
        p[7].setRef(0);
        p[7].setStawka(0);
        p[7].setNosnik(TProdukt.Nosnik.Bluray);
        p[7].setWypozyczony(false);
        
        return p;
    }
    
    public TPozycja[] pozycje()
    {
        TPozycja pozycje[] = new TPozycja[6];
        pozycje[0] = new TPozycja();
        pozycje[0].setProdukt(produkty()[0]);
        pozycje[0].setStawka(produkty()[0].getStawka());
        pozycje[0].setOddane(false);
        
        pozycje[1] = new TPozycja();
        pozycje[1].setProdukt(produkty()[1]);
        pozycje[1].setStawka(produkty()[1].getStawka());
        pozycje[1].setOddane(false);
        
        pozycje[2] = new TPozycja();
        pozycje[2].setProdukt(produkty()[2]);
        pozycje[2].setStawka(produkty()[2].getStawka());
        pozycje[2].setOddane(false);
        
        pozycje[3] = new TPozycja();
        pozycje[3].setProdukt(produkty()[3]);
        pozycje[3].setStawka(produkty()[3].getStawka());
        pozycje[3].setOddane(false);
        
        pozycje[4] = new TPozycja();
        pozycje[4].setProdukt(produkty()[4]);
        pozycje[4].setStawka(produkty()[4].getStawka());
        pozycje[4].setOddane(false);
        
        pozycje[5] = new TPozycja();
        pozycje[5].setProdukt(produkty()[5]);
        pozycje[5].setStawka(produkty()[5].getStawka());
        pozycje[5].setOddane(false);

        return pozycje;
    }
    
    public TWypozyczenie[] wypozyczenia() throws ParseException
    {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        TWypozyczenie wypozyczenie[] = new TWypozyczenie[6];
        
        wypozyczenie[0] = new TWypozyczenie();
        wypozyczenie[0].setPozycje(Arrays.asList(new TPozycja[] {pozycje()[0]}));
        wypozyczenie[0].setIloscDni(10);
        wypozyczenie[0].setKlient(klienci()[0]);
        wypozyczenie[0].setPoczatek(df.parse("21.01.2018"));
        wypozyczenie[0].setKoniec(null);
        
                wypozyczenie[1] = new TWypozyczenie();
        wypozyczenie[1].setPozycje(Arrays.asList(new TPozycja[] {pozycje()[1]}));
        wypozyczenie[1].setIloscDni(10);
        wypozyczenie[1].setKlient(klienci()[1]);
        wypozyczenie[1].setPoczatek(df.parse("22.01.2018"));
        wypozyczenie[1].setKoniec(null);
        
                wypozyczenie[2] = new TWypozyczenie();
        wypozyczenie[2].setPozycje(Arrays.asList(new TPozycja[] {pozycje()[2]}));
        wypozyczenie[2].setIloscDni(10);
        wypozyczenie[2].setKlient(klienci()[2]);
        wypozyczenie[2].setPoczatek(df.parse("23.01.2018"));
        wypozyczenie[2].setKoniec(null);
        
                wypozyczenie[3] = new TWypozyczenie();
        wypozyczenie[3].setPozycje(Arrays.asList(new TPozycja[] {pozycje()[3]}));
        wypozyczenie[3].setIloscDni(10);
        wypozyczenie[3].setKlient(klienci()[3]);
        wypozyczenie[3].setPoczatek(df.parse("24.01.2018"));
        wypozyczenie[3].setKoniec(null);
        
                wypozyczenie[4] = new TWypozyczenie();
        wypozyczenie[4].setPozycje(Arrays.asList(new TPozycja[] {pozycje()[4]}));
        wypozyczenie[4].setIloscDni(10);
        wypozyczenie[4].setKlient(klienci()[4]);
        wypozyczenie[4].setPoczatek(df.parse("21.01.2018"));
        wypozyczenie[4].setKoniec(null);
        
                wypozyczenie[5] = new TWypozyczenie();
        wypozyczenie[5].setPozycje(Arrays.asList(new TPozycja[] {pozycje()[5]}));
        wypozyczenie[5].setIloscDni(10);
        wypozyczenie[5].setKlient(klienci()[5]);
        wypozyczenie[5].setPoczatek(df.parse("22.01.2018"));
        wypozyczenie[5].setKoniec(null); 
        
        return wypozyczenie;
    }
}
