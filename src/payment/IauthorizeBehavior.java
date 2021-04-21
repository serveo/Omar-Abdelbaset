package payment;

public interface IauthorizeBehavior {

    public String authorize();
}

class AuthorizeCheck implements IauthorizeBehavior {

    @Override
    public String authorize() {
        return "AuthorizeCheck";
    }
}

class AuthorizeCredit1 implements IauthorizeBehavior {

    @Override
    public String authorize() {
        return "AuthorizeCredit1";
    }
}

class AuthorizeCredit2 implements IauthorizeBehavior {

    @Override
    public String authorize() {
        return "AuthorizeCredit2";
    }
}

class AuthorizeNon implements IauthorizeBehavior {

    @Override
    public String authorize() {
        return "AuthorizeNon";
    }
}
