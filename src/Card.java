import java.util.ArrayList;

/**
 * Created by Администратор on 15.02.2017.
 */
 class Card {

    long cardnum;
    private int cardpas;
    private double cbrub;
    private double cbeur;
    private double cbusd;
    private ArrayList<String> stList;


    Card(long cardnum, int cardpas, double cbrub, double cbeur, double cbusd, ArrayList<String> stList)
    {
        this.cardnum = cardnum;
        this.cardpas = cardpas;
        this.cbrub = cbrub;
        this.cbeur = cbeur;
        this.cbusd = cbusd;
        this.stList = stList;

    }

    int getPas()
    {
        return this.cardpas;
    }

    long getNum()
    {
        return this.cardnum;
    }

    double getRub()
    {
        return this.cbrub;
    }
    void setRub(double cbrub)
    {
        this.cbrub=cbrub;
    }

     double getEur()
    {
        return this.cbeur;
    }
     void setEur(double cbeur)
    {
        this.cbeur=cbeur;
    }

     double getUsd()
    {
        return this.cbusd;
    }
     void setUsd(double cbusd)
    {
        this.cbusd=cbusd;
    }

     ArrayList<String> getArr()
    {
        return this.stList;
    }
}
