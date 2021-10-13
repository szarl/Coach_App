package views;

import java.util.*;

public class Katalog extends Trener {
    public static List<Person> listaOsob = new ArrayList<>();
    public Katalog(){
        super();
    }
    public Katalog(String imie, String nazwisko, String data, String login, String haslo,   boolean osobacheck) {
        listaOsob.add(new Trener(this.imie = imie,
                this.nazwisko = nazwisko,
                this.data_urodzenia = data,
                this.login = login,
                this.haslo = haslo,
                this.osobacheck = osobacheck));
    }
    public String getData_storage(){
        return imie +" "+ nazwisko + " "+login + " "+haslo + " "+data_urodzenia;
    }

    public static boolean check_status(String login, String haslo) {
        for (Person person : listaOsob) {
            System.out.println(person.getLogin());
            System.out.println(person.getHaslo());
            if (login.equals(person.getLogin())) {
                if (haslo.equals(person.getHaslo())) {
                    return true;
                }
            }
        }
        return false;
    }
}