import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Locale;

/**
 * Created by Администратор on 13.02.2017.
 */
  class AutoOperator
{
   private RUB rub = new RUB(0,0,0,0);
   private USD usd = new USD(0,0,0);
   private EUR eur = new EUR(0,0,0,0,0);

    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    void colmen()

    {
        System.out.print("Good day,cash collector. ");
        while(true)
        {
            System.out.println("Please, enter type of currency you want to load: \"RUB\" or \"USD\" or \"EUR\"");


            String  curtype = null;
            try {
                curtype = reader.readLine();
                curtype = curtype.toUpperCase();
            } catch (IOException e) {
                System.out.println("Uncorrect entering data");
            }



            assert curtype != null;


            switch (curtype) {
                case "RUB":
                    System.out.println("Please, enter denomination of banknote : \"100\", \"500\", \"1000\" or \"5000\"");
                    int bdenomRub = 0;
                    try {
                        bdenomRub = Integer.parseInt(reader.readLine());
                    } catch (IOException e) {
                        System.out.println("Uncorrect entering data");
                    }
                    switch (bdenomRub) {
                        case 100: {
                            System.out.println("Please, enter amount of banknotes of denomination \"100\"");
                            int amountRub = 0;
                            try {
                                amountRub = Integer.parseInt(reader.readLine());
                            } catch (IOException e) {
                                System.out.println("Uncorrect entering data");
                            }
                            rub.setAmount100(amountRub);
                            MoneySafe.allRub += 100 * amountRub;
                            break;
                        }
                        case 500: {
                            System.out.println("Please, enter amount of banknotes of denomination \"500\"");
                            int amountRub = 0;
                            try {
                                amountRub = Integer.parseInt(reader.readLine());
                            } catch (IOException e) {
                                System.out.println("Uncorrect entering data");
                            }
                            rub.setAmount500(amountRub);
                            MoneySafe.allRub += 500 * amountRub;
                            break;
                        }
                        case 1000: {
                            System.out.println("Please, enter amount of banknotes of denomination \"1000\"");
                            int amountRub = 0;
                            try {
                                amountRub = Integer.parseInt(reader.readLine());
                            } catch (IOException e) {
                                System.out.println("Uncorrect entering data");
                            }
                            rub.setAmount1000(amountRub);
                            MoneySafe.allRub += 1000 * amountRub;
                            break;
                        }
                        case 5000: {
                            System.out.println("Please, enter amount of banknotes of denomination \"5000\"");
                            int amountRub = 0;
                            try {
                                amountRub = Integer.parseInt(reader.readLine());
                            } catch (IOException e) {
                                System.out.println("Uncorrect entering data");
                            }
                            rub.setAmount5000(amountRub);
                            MoneySafe.allRub += 5000 * amountRub;
                            break;
                        }
                    }
                    break;
                case "EUR":
                    System.out.println("Please, enter denomination of banknote : \"10\", \"20\", \"100\" or \"500\"");
                    int bdenomEur = 0;
                    try {
                        bdenomEur = Integer.parseInt(reader.readLine());
                    } catch (IOException e) {
                        System.out.println("Uncorrect entering data");
                    }
                    switch (bdenomEur) {
                        case 10: {
                            System.out.println("Please, enter amount of banknotes of denomination \"10\"");
                            int amountEur = 0;
                            try {
                                amountEur = Integer.parseInt(reader.readLine());
                            } catch (IOException e) {
                                System.out.println("Uncorrect entering data");
                            }
                            eur.setAmount10(amountEur);
                            MoneySafe.allEur += 10 * amountEur;
                            break;
                        }
                        case 20: {
                            System.out.println("Please, enter amount of banknotes of denomination \"20\"");
                            int amountEur = 0;
                            try {
                                amountEur = Integer.parseInt(reader.readLine());
                            } catch (IOException e) {
                                System.out.println("Uncorrect entering data");
                            }
                            eur.setAmount20(amountEur);
                            MoneySafe.allEur += 20 * amountEur;
                            break;
                        }
                        case 50: {
                            System.out.println("Please, enter amount of banknotes of denomination \"50\"");
                            int amountEur = 0;
                            try {
                                amountEur = Integer.parseInt(reader.readLine());
                            } catch (IOException e) {
                                System.out.println("Uncorrect entering data");
                            }
                            eur.setAmount50(amountEur);
                            MoneySafe.allEur += 50 * amountEur;
                            break;
                        }
                        case 100: {
                            System.out.println("Please, enter amount of banknotes of denomination \"100\"");
                            int amountEur = 0;
                            try {
                                amountEur = Integer.parseInt(reader.readLine());
                            } catch (IOException e) {
                                System.out.println("Uncorrect entering data");
                            }
                            eur.setAmount100(amountEur);
                            MoneySafe.allEur += 100 * amountEur;
                            break;
                        }
                        case 500: {
                            System.out.println("Please, enter amount of banknotes of denomination \"500\"");
                            int amountEur = 0;
                            try {
                                amountEur = Integer.parseInt(reader.readLine());
                            } catch (IOException e) {
                                System.out.println("Uncorrect entering data");
                            }
                            eur.setAmount500(amountEur);
                            MoneySafe.allEur += 500 * amountEur;
                            break;
                        }
                    }
                    break;
                case "USD":
                    System.out.println("Please, enter denomination of banknote : \"10\", \"50\", \"100\"");
                    int bdenomUsd = 0;
                    try {
                        bdenomUsd = Integer.parseInt(reader.readLine());
                    } catch (IOException e) {
                        System.out.println("Uncorrect entering data");
                    }
                    switch (bdenomUsd) {
                        case 10: {
                            System.out.println("Please, enter amount of banknotes of denomination \"10\"");
                            int amountUsd = 0;
                            try {
                                amountUsd = Integer.parseInt(reader.readLine());
                            } catch (IOException e) {
                                System.out.println("Uncorrect entering data");
                            }
                            usd.setAmount10(amountUsd);
                            MoneySafe.allUsd += 10 * amountUsd;
                            break;
                        }
                        case 50: {
                            System.out.println("Please, enter amount of banknotes of denomination \"50\"");
                            int amountUsd = 0;
                            try {
                                amountUsd = Integer.parseInt(reader.readLine());
                            } catch (IOException e) {
                                System.out.println("Uncorrect entering data");
                            }
                            usd.setAmount50(amountUsd);
                            MoneySafe.allUsd += 50 * amountUsd;
                            break;
                        }
                        case 100: {
                            System.out.println("Please, enter amount of banknotes of denomination \"100\"");
                            int amountUsd = 0;
                            try {
                                amountUsd = Integer.parseInt(reader.readLine());
                            } catch (IOException e) {
                                System.out.println("Uncorrect entering data");
                            }
                            usd.setAmount100(amountUsd);
                            MoneySafe.allUsd += 100 * amountUsd;
                            break;
                        }
                    }
                    break;
            }
            System.out.println();
            System.out.println("Banknotes are loaded in safe. You can change amount or denomination of banknotes.");
            System.out.println();
            System.out.println("Total sum in safe: ");
            System.out.println();
            System.out.println("RUB: "+ MoneySafe.allRub);
            System.out.println("USD: "+ MoneySafe.allUsd);
            System.out.println("EUR: "+ MoneySafe.allEur);

            System.out.println("If you want to stop loading money and start working, please, enter \"start\". If you want load more money, press \"Enter\".");
            String s = null;
            try {
                s = reader.readLine();
            } catch (IOException e) {
                System.out.println("Uncorrect entering data");
            }
            if (s != null && s.equals("start")) {
                break;
            }
        }
    }

    private  ArrayList<Card> clist = new ArrayList<>();

     void baseCreating () {

        for (int i = 0; i < 50; i++)

        {
            int minrub = 1000;
            int mineur = 100;
            int maxeur = 10000;
            int minusd = 100;
            int maxusd = 10000;
            int maxrub = 300000;
            Long mincard = 4715000000000000L;
            Long maxcard = 4715999999999999L;
            int fpas=1000 ;

            clist.add(

                    new Card

                            (mincard + (long) (Math.random() * maxcard),
                            fpas + (int)(Math.random() * 8999),
                            minrub + Math.random() * maxrub,
                            mineur + Math.random() * maxeur,
                            minusd + Math.random() * maxusd, new ArrayList<String>())
                      );
        }
    }
   private Locale locale = new Locale("en");
   private String pattern = "##0.00";
   private DecimalFormat decimalFormat = new DecimalFormat(pattern);

     void baseFormPrint()

    {

        Locale.setDefault(locale);

        for (Card c : clist)
        {
            System.out.println("Num: " + c.getNum()+" Pas: "+c.getPas()+" RUB: "
                    +decimalFormat.format(c.getRub())+" USD: "
                    +decimalFormat.format(c.getUsd())+" EUR: "
                    +decimalFormat.format(c.getEur()));
        }
    }

    private int minClist = 0;
    private int maxClist = 50;
    private int curcard = (int) (minClist + Math.random() * maxClist);
    private boolean forbidden = false;
    private  int pasCounter = 3;


    void usmen () {

        System.out.println("Hello, user! Your card number is: " + clist.get(curcard).cardnum);

        for(int i=pasCounter;i>0;i--) {
            System.out.println("Please, enter your password! ");
            int tpas = 0;
            try {
                tpas = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                System.out.println("Uncorrect entering data");
            }

            if (tpas == clist.get(curcard).getPas())

            {
                System.out.println("Your password is correct.");
                break;
            } else {
                pasCounter--;
                if (pasCounter == 0) {
                    System.out.println("Your card is locked. To unlock it, please, contact technical support.");
                    forbidden = true;
                    break;
                } else

                    System.out.println("Your password is not correct. Please, enter correct password. " + pasCounter + " attempt(s) remain.");
            }
        }

        if (!forbidden) {
            while (true) {

                System.out.println("Please, choose your kind of operation : ");
                System.out.println();
                System.out.println("If you want to withdraw RUB, please, enter \"1\".");
                System.out.println("If you want to withdraw USD, please, enter \"2\".");
                System.out.println("If you want to withdraw EUR, please, enter \"3\".");
                System.out.println("If you want to deposit rubles, please, enter \"4\".");
                System.out.println("If you want to check your account balance, please, enter \"5\".");
                System.out.println("If you want to exchange your currency, please, enter \"6\".");
                System.out.println("If you want to check your operations story, please, enter \"7\".");
                System.out.println("If you want to return your card, please, enter  \"8\".");

                String s1 = null;
                try {
                    s1 = reader.readLine();
                } catch (IOException e) {
                    System.out.println("Uncorrect entering data");
                }
                assert s1 != null;
                switch (Integer.parseInt(s1)) {
                    case 1: {

                        System.out.println("Please, enter amount of rubles you want to withdraw: ");
                        int rubWith = 0;
                        try {
                            rubWith = Integer.parseInt(reader.readLine());
                        } catch (IOException e) {
                            System.out.println("Uncorrect entering data");
                        }

                        int numBank100;
                        int numBank500;
                        int numBank1000;
                        int numBank5000;
                        int bal1;
                        int bal2;
                        int bal3;

                        if (MoneySafe.allRub >= rubWith && rubWith <= clist.get(curcard).getRub()) {

                            numBank5000 = rubWith / 5000;

                            bal1 = rubWith % 5000;
                            numBank1000 = bal1 / 1000;

                            bal2 = bal1 % 1000;
                            numBank500 = bal2 / 500;

                            bal3 = bal2 % 500;
                            numBank100 = bal3 / 100;

                            if (rubWith >= 5000 && numBank5000 <= rub.getAmount5000())
                            {
                                rub.setAmount5000(rub.getAmount5000() - numBank5000);
                            }
                            if (bal1 >= 1000 && numBank1000 <= rub.getAmount1000())
                            {
                                rub.setAmount1000(rub.getAmount1000() - numBank1000);
                            }
                            if (bal2 >= 500 && numBank500 <= rub.getAmount500())
                            {
                                rub.setAmount500(rub.getAmount500() - numBank500);
                            }

                            if (bal3 >= 100 && numBank100 <= rub.getAmount100())
                            {
                                rub.setAmount100(rub.getAmount100() - numBank100);
                            }

                            Card thCard = clist.get(curcard);
                            thCard.setRub(thCard.getRub() - (numBank100 * 100 + numBank500 * 500 + numBank1000 * 1000 + numBank5000 * 5000));
                            clist.set(curcard, thCard);

                            clist.get(curcard).getArr().add(numBank100 * 100 + numBank500 * 500 + numBank1000 * 1000 + numBank5000 * 5000 + " RUB are withdrew.");

                            System.out.println("Please, take your money.");
                        }
                        break;
                    }

                    case 2: {

                        System.out.println("Please, enter amount of USD you want to withdraw: ");
                        int usdWith = 0;
                        try {
                            usdWith = Integer.parseInt(reader.readLine());
                        } catch (IOException e) {
                            System.out.println("Uncorrect entering data");
                        }

                        int numBank10;
                        int numBank50;
                        int numBank100;
                        int bal1;
                        int bal2;

                        if (MoneySafe.allUsd >= usdWith && usdWith <= clist.get(curcard).getUsd())
                        {
                            numBank100 = usdWith / 100;

                            bal1 = usdWith % 100;
                            numBank50 = bal1 / 50;
                            bal2 = bal1 % 50;
                            numBank10 = bal2 / 10;

                            if (usdWith >= 100 && numBank100 <= usd.getAmount100())
                            {
                                usd.setAmount100(usd.getAmount100() - numBank100);
                            }

                            if (bal1 >= 50 && numBank50 <= usd.getAmount50())
                            {
                                usd.setAmount50(usd.getAmount50() - numBank50);
                            }

                            if (bal2 >= 10 && numBank10 <= usd.getAmount10())
                            {
                                usd.setAmount10(usd.getAmount10() - numBank10);
                            }

                            Card thCard = clist.get(curcard);
                            thCard.setUsd(thCard.getUsd() - (numBank10 * 10 + numBank50 * 50 + numBank100 * 100));
                            clist.set(curcard, thCard);

                            clist.get(curcard).getArr().add(numBank10 * 10 + numBank50 * 50 + numBank100 * 100 + " USD are withdrew.");

                            System.out.println("Please, take your money.");
                        }

                        else if (usdWith > clist.get(curcard).getUsd())
                        {
                            System.out.println("Operation can`t be conducted. Check your balance.");
                        }
                        else
                            System.out.println("Operation can`t be conducted. No banknotes remain.");

                        break;
                    }

                    case 3: {

                        System.out.println("Please, enter amount of EUR you want to withdraw: ");
                        int eurWith = 0;
                        try {
                            eurWith = Integer.parseInt(reader.readLine());
                        } catch (IOException e) {
                            System.out.println("Uncorrect entering data");
                        }

                        int numBank10;
                        int numBank20;
                        int numBank50;
                        int numBank100;
                        int numBank500;
                        int bal1;
                        int bal2;
                        int bal3;
                        int bal4;

                        if (MoneySafe.allEur >= eurWith && eurWith <= clist.get(curcard).getEur()) {

                            numBank500 = eurWith / 500;

                            bal1 = eurWith % 500;
                            numBank100 = bal1 / 100;

                            bal2 = bal1 % 100;
                            numBank50 = bal2 / 50;

                            bal3 = bal2 % 50;
                            numBank20 = bal3 / 20;

                            bal4 = bal3 % 20;
                            numBank10 = bal4 / 10;

                            if (eurWith >= 500 && numBank500 <= eur.getAmount500())
                            {
                                eur.setAmount500(eur.getAmount500() - numBank500);
                            }

                            if (bal1 >= 100 && numBank100 <= eur.getAmount100())
                            {
                                eur.setAmount100(eur.getAmount100() - numBank100);
                            }

                            if (bal2 >= 50 && numBank50 <= eur.getAmount50())
                            {
                                eur.setAmount50(eur.getAmount50() - numBank50);
                            }

                            if (bal3 >= 20 && numBank20 <= eur.getAmount20())
                            {
                                eur.setAmount20(eur.getAmount20() - numBank20);
                            }

                            if (bal4 >= 10 && numBank10 <= usd.getAmount10())
                            {
                                eur.setAmount10(eur.getAmount10() - numBank10);
                            }

                            Card thCard = clist.get(curcard);
                            thCard.setEur(thCard.getEur() - (numBank10 * 10 + numBank20 * 20 + numBank50 * 50 + numBank100 * 100 + numBank500 * 500));
                            clist.set(curcard, thCard);

                            clist.get(curcard).getArr().add(numBank10 * 10 + numBank20 * 20 + numBank50 * 50 + numBank100 * 100 + numBank500 * 500 + " EUR are withdrew.");

                            System.out.println("Please, take your money.");

                        }
                        else if (eurWith > clist.get(curcard).getEur())
                            {
                        System.out.println("Operation can`t be conducted. Check your balance.");
                            }
                            else
                        System.out.println("Operation can`t be conducted. No banknotes remain.");

                        break;
                    }
                    case 4: {

                        System.out.println("Please, enter denomination of banknotes, you want to deposit on your account: ");
                        int rubDep = 0;
                        try {
                            rubDep = Integer.parseInt(reader.readLine());
                        } catch (IOException e) {
                            System.out.println("Uncorrect entering data");
                        }
                        System.out.println(" ");

                        switch(rubDep){
                            case 100:
                            {
                                System.out.println("Please, enter amount of banknotes of denomination \"100\"");
                                int amountRub = 0;
                                try {
                                    amountRub = Integer.parseInt(reader.readLine());
                                } catch (IOException e) {
                                    System.out.println("Uncorrect entering data");
                                }
                                rub.setAmount100(amountRub + rub.getAmount100());
                                MoneySafe.allRub += 100*amountRub;

                                Card thCard = clist.get(curcard);
                                thCard.setRub(thCard.getRub() + (double)rubDep*amountRub);
                                clist.set(curcard, thCard);

                                System.out.println("Total RUB on your account: " + decimalFormat.format(clist.get(curcard).getRub()));

                                clist.get(curcard).getArr().add(amountRub * rubDep +" rubles are deposited.");

                                break;
                            }
                            case 500:
                            {
                                System.out.println("Please, enter amount of banknotes of denomination \"500\"");
                                int amountRub = 0;
                                try {
                                    amountRub = Integer.parseInt(reader.readLine());
                                } catch (IOException e) {
                                    System.out.println("Uncorrect entering data");
                                }
                                rub.setAmount500(amountRub + rub.getAmount500());
                                MoneySafe.allRub += 500*amountRub;

                                Card thCard = clist.get(curcard);
                                thCard.setRub(thCard.getRub() + (double)rubDep*amountRub);
                                clist.set(curcard, thCard);

                                System.out.println("Total RUB on your account: " + decimalFormat.format(clist.get(curcard).getRub()));

                                clist.get(curcard).getArr().add(amountRub * rubDep +" RUB are deposited.");

                                break;
                            }
                            case 1000:
                            {
                                System.out.println("Please, enter amount of banknotes of denomination \"1000\"");
                                int amountRub = 0;
                                try {
                                    amountRub = Integer.parseInt(reader.readLine());
                                } catch (IOException e) {
                                    System.out.println("Uncorrect entering data");
                                }
                                rub.setAmount1000(amountRub + rub.getAmount1000());
                                MoneySafe.allRub += 1000*amountRub;

                                Card thCard = clist.get(curcard);
                                thCard.setRub(thCard.getRub() + (double)rubDep * amountRub);
                                clist.set(curcard, thCard);

                                System.out.println("Total RUB on your account: " + decimalFormat.format(clist.get(curcard).getRub()));

                                clist.get(curcard).getArr().add(amountRub * rubDep +" RUB are deposited.");

                                break;
                            }
                            case 5000:
                            {
                                System.out.println("Please, enter amount of banknotes of denomination \"5000\"");
                                int amountRub = 0;
                                try {
                                    amountRub = Integer.parseInt(reader.readLine());
                                } catch (IOException e) {
                                    System.out.println("Uncorrect entering data");
                                }
                                rub.setAmount5000(amountRub + rub.getAmount1000());
                                MoneySafe.allRub += 5000*amountRub;

                                Card thCard = clist.get(curcard);
                                thCard.setRub(thCard.getRub() + (double)rubDep*amountRub);
                                clist.set(curcard, thCard);

                                System.out.println("Total RUB on your account: " + decimalFormat.format(clist.get(curcard).getRub()));

                                clist.get(curcard).getArr().add(amountRub * rubDep +" RUB are deposited.");

                                break;
                            }

                        }
                        break;
                    }
                    case 5: {
                        System.out.println("RUB on your account: " + decimalFormat.format(clist.get(curcard).getRub()));
                        System.out.println("USD on your account: " + decimalFormat.format(clist.get(curcard).getUsd()));
                        System.out.println("EUR on your account: " + decimalFormat.format(clist.get(curcard).getEur()));

                        break;
                    }
                    case 6: {

                        int dolmin = 58;
                        int dolup = 4;
                        int eurmin = 60;
                        int eurup = 3;

                        double dolCourse = dolmin + (Math.random() * dolup);
                        double eurCourse = eurmin + (Math.random() * eurup);

                        System.out.println("Please, choose, what type of currency you want to exchange rubles, \"EUR\" or \"USD\" ");
                        System.out.println("Current exchange rate  \"RUB - USD\": "+ decimalFormat.format(dolCourse));
                        System.out.println("Current exchange rate  \"RUB - EUR\": "+ decimalFormat.format(eurCourse));

                        String curt = null;
                        try {
                            curt = reader.readLine();
                        } catch (IOException e) {
                            System.out.println("Uncorrect entering data");
                        }
                        assert curt != null;
                        curt = curt.toUpperCase();

                        System.out.println("Please, enter amount of RUB you want to exchange");
                        int sumrub = 0;
                        try {
                            sumrub = Integer.parseInt(reader.readLine());
                        } catch (IOException e) {
                            System.out.println("Uncorrect entering data");
                        }

                        switch (curt) {
                            case "USD":

                                if (sumrub <= clist.get(curcard).getRub()) {
                                    double usdEx = sumrub / dolCourse;
                                    Card thCard = clist.get(curcard);
                                    thCard.setUsd(thCard.getUsd() + usdEx);
                                    thCard.setRub(thCard.getRub() - sumrub);
                                    clist.set(curcard, thCard);
                                    clist.get(curcard).getArr().add(sumrub + " rubles are exchanged. " + decimalFormat.format(usdEx) + " USD are deposited on your USD account");
                                    System.out.println(sumrub + " rubles are exchanged. " + decimalFormat.format(usdEx) + " USD are deposted on your USD account");
                                }
                                break;
                            case "EUR":
                                if (sumrub <= clist.get(curcard).getRub()) {
                                double eurEx = sumrub / eurCourse;
                                Card thCard = clist.get(curcard);
                                thCard.setEur(thCard.getEur() + eurEx);
                                thCard.setRub(thCard.getRub() - sumrub);
                                clist.set(curcard, thCard);
                                clist.get(curcard).getArr().add(sumrub + " rubles are exchanged. " + decimalFormat.format(eurEx) + " EUR are deposited on your EUR account");
                                System.out.println(sumrub + " rubles are exchanged. " + decimalFormat.format(eurEx) + " EUR are depsited on your EUR account");
                                }
                                break;
                            default:
                                System.out.println("Please, choose correct currency type!");
                                break;
                        }

                        break;
                    }

                    case 7:

                    {
                      for(String s : clist.get(curcard).getArr())
                       {
                           System.out.println(s);
                           System.out.println();
                       }
                        break;
                    }
                }

                if (s1.equals("8")) {
                    System.out.println("Your card is extracted. Thank you for using our services. Have a nice day!");
                    break;
                }
            }
        }
    }
}
