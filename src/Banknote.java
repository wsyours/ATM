/**
 * Created by Администратор on 13.02.2017.
 */
  abstract class Banknote

{       private int amount10;
        private int amount20;
        private int amount50;
        private int amount100;
        private int amount500;
        private int amount1000;
        private int amount5000;

       Banknote (int amount10, int amount50,int amount100)
        {
            this.amount10=amount10;
            this.amount50=amount50;
            this.amount100=amount100;
        }
        Banknote (int amount100, int amount500, int amount1000, int amount5000)
        {
            this.amount100=amount100;
            this.amount500=amount500;
            this.amount1000=amount1000;
            this.amount5000=amount5000;
        }
        Banknote(int amount10, int amount20, int amount50, int amount100, int amount500)
        {
            this.amount10=amount10;
            this.amount20=amount20;
            this.amount50=amount50;
            this.amount100=amount100;
            this.amount500=amount500;
        }

        int getAmount10() {return this.amount10;}
        void setAmount10(int amount10) {this.amount10=amount10;}

        int getAmount20() {return this.amount20;}
        void setAmount20(int amount20) {this.amount20=amount20;}

        int getAmount50() {return this.amount50;}
        void setAmount50(int amount50)
    {
        this.amount50=amount50;
    }

        int getAmount100() {return this.amount100;}
        void setAmount100(int amount100) {this.amount100=amount100;}

        int getAmount500()

    {
        return this.amount500;
    }
        void setAmount500(int amount500) {this.amount500=amount500;}

        int getAmount1000()

    {
        return this.amount1000;
    }
        void setAmount1000(int amount1000) {this.amount1000=amount1000;}

        int getAmount5000()

    {
        return this.amount5000;
    }
        void setAmount5000(int amount5000)

    {
        this.amount5000=amount5000;
    }
}
