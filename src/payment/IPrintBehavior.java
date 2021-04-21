
package payment;


public interface IPrintBehavior {
    public void PrintReceipt(float money);
}

class PrintCashTrans implements IPrintBehavior{
    @Override
    public void PrintReceipt(float money){
        System.out.println("Cash transaction is " + money);
    }
}

class PrintNon implements IPrintBehavior{
    @Override
    public void PrintReceipt(float money){
    }
}