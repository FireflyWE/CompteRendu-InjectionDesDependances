package presentation;

import dao.DaoImpl;
import metier.MetierImpl;

public class PresentationLogique {
    public static void main(String[] args) {
        DaoImpl dao=new DaoImpl();
        MetierImpl metier=new MetierImpl(dao);
        //metier.setDao(dao);
        System.out.println("Result="+metier.calcul());
    }
}
