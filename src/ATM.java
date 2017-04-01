import java.io.IOException;


/**
 * Created by Администратор on 13.02.2017.
 */
public class ATM {

    public static void main(String[] args) throws IOException {
        AutoOperator oper = new AutoOperator();
        oper.colmen();
        oper.baseCreating();
        oper.baseFormPrint();
        oper.usmen();
    }
}
