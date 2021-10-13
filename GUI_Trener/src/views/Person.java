package views;

import java.util.ArrayList;
import java.util.List;

public abstract class Person {
    protected String imie;
    protected String nazwisko;
    protected String haslo;
    protected String login;
    protected String data_urodzenia;
    protected boolean osobacheck;


    public Person(String imie, String nazwisko, String data_urodzenia, String login, String haslo, boolean osobacheck){
            this.login=login;
            this.haslo=haslo;
            this.imie=imie;
            this.nazwisko=nazwisko;
            this.osobacheck=osobacheck;
            this.data_urodzenia=data_urodzenia;
        }

    public Person() {
    }
    public Person(String imie, String nazwisko, String data_urodzenia, boolean osobacheck){
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.osobacheck=osobacheck;
        this.data_urodzenia=data_urodzenia;
    }

    public abstract String getData_Storage(
    );

    protected abstract String getLogin();

    protected abstract String getHaslo();
}
