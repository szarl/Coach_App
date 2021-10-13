package views;

import views.Person;

public class Trener extends Person {


    public Trener(String imie, String nazwisko, String data, String login, String haslo,   boolean osobacheck) {
        super(imie, nazwisko, data, login, haslo, osobacheck);
    }

    public Trener() {
    }

    @Override
    public String getData_Storage() {
        return imie + nazwisko + data_urodzenia + login + haslo;
    }

    @Override
    protected String getLogin() {
        return login;
    }

    @Override
    protected String getHaslo() {
        return haslo;
    }
}
