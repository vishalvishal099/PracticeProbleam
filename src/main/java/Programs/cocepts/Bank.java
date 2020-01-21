package Programs.cocepts;

abstract public class Bank {

    public void deposit(){
        System.out.println("The customer is deposit amounts");
    }

    public void withdraw(){
        System.out.println("The custome is withdrawing the amount");
    }

    abstract  void rateOfIntrest();

    public static void main(String args[]){

        Bank b = new HDFC();
        b.deposit();
        b.withdraw();
        b.rateOfIntrest();
    }
}

class HDFC extends Bank {
    @Override
    void rateOfIntrest() {
        System.out.println("HDFC bank rate of interst is 3.5");
    }
}

class ICICI extends Bank {
    void rateOfIntrest(){
        System.out.println("ICICI bank rate of intest is  4%");
    }
}


