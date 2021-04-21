package payment;

public class Payment {

    private float amount;
    private IauthorizeBehavior authorizeBehavior;
    private IPrintBehavior printBehavior;
    
    public String authorize() {
        return authorizeBehavior.authorize();
    }

    public void print() {
        printBehavior.PrintReceipt(amount);
    }
    
    public float getAmount() {
        return amount;
    }
    
    public void setAmount(float amount) {
        this.amount = amount;
    }
    
    public IauthorizeBehavior getAuthorizeBehavior() {
        return authorizeBehavior;
    }
    
    public void setAuthorizeBehavior(IauthorizeBehavior authorizeBehavior) {
        this.authorizeBehavior = authorizeBehavior;
    }
    
    public IPrintBehavior getPrintBehavior() {
        return printBehavior;
    }
    
    public void setPrintBehavior(IPrintBehavior printBehavior) {
        this.printBehavior = printBehavior;
    }
    
}

class cash extends Payment {

    private float CashTendered;

    public cash(float CashTendered) {
        super();
        this.CashTendered = CashTendered;
        setAmount(CashTendered);
        setAuthorizeBehavior(new AuthorizeNon());
        setPrintBehavior(new PrintCashTrans());
    }
    
}

class credit extends Payment {

    private String name;
    private String type;
    private int expDate;

    public credit(float amount, String name, String type, int expDate) {
        super();
        this.name = name;
        this.type = type;
        this.expDate = expDate;
        setAmount(amount);
        setAuthorizeBehavior(new AuthorizeNon());
        setPrintBehavior(new PrintCashTrans());
    }
    
}

class check extends Payment {

    private String name;
    private String bankID;

    public check(float amount, String name, String bankID) {
        super();
        this.name = name;
        this.bankID = bankID;
        setAmount(amount);
        setAuthorizeBehavior(new AuthorizeNon());
        setPrintBehavior(new PrintCashTrans());
    }
    
}
