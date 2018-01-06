/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mateu
 */
public class Dane {
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
    
    TTytul tytul = new TTytul() ;
    public Object dane_produktow[][] = new Object[][]{
         
       {tytul, 456123, 4.5, TProdukt.Nosnik.Bluray},
       {tytul, 789456, 2.3, TProdukt.Nosnik.DVD},
       {tytul, 562415, 1.8, TProdukt.Nosnik.VHS},
       {tytul, 478632, 4.5, TProdukt.Nosnik.Bluray},
       {tytul, 451203, 2.9, TProdukt.Nosnik.DVD},
       {tytul, 412563, 1.3, TProdukt.Nosnik.VHS}
    };
}
