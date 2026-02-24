import java.util.Scanner;

public class Peso20Dispenser implements DispenseChain {
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if (cur.getAmount() >= 20) {
            int num = cur.getAmount() / 20;
            int remainder = cur.getAmount() % 20;
            System.out.println("Dispensing " + num + " 20-peso bill(s)");
            if (remainder != 0 && chain != null) {
                chain.dispense(new Currency(remainder));
            }
        } else {
            if (chain != null) {
                chain.dispense(cur);
            }
        }
    }
}
