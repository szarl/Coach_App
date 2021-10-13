package views;

public class Podopieczny extends Person{

    private boolean plec;
    private Float waga;
    private Float wzrost;
    private Float goal;
    private String numer_tel;
    private String email;

    public Podopieczny(String imie, String nazwisko, String data,boolean plec, Float waga, Float wzrost, String numer_tel, String email,Float goal, boolean osobacheck){
        super(imie, nazwisko, data, osobacheck);
        this.plec=plec;
        this.waga=waga;
        this.wzrost=wzrost;
        this.goal=goal;
        this.email=email;
        this.numer_tel=numer_tel;
    }


    @Override
    public String getData_Storage() {
        return imie + nazwisko + data_urodzenia + plec + waga + wzrost + goal + numer_tel + email;
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
