package views;

import java.util.Iterator;

public class Authorization {

    public static boolean checkStatus(String login, String haslo){
        Iterator it = Katalog.listaOsob.iterator();
        while(it.hasNext()){
            Person osoba = (Person) it.next();
            if(osoba.getLogin() == login && osoba.getHaslo().equals(haslo))
            {
                return true;
            }else
            {
                System.out.println("Nieudana proba logowania !!!");
                System.out.println(osoba.getData_Storage());
                System.out.println(osoba.getHaslo());
            }
        }
        return false;
    }
}
