public class Money {
    protected int amount;

    public Money(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) return false;
        if (!(object instanceof Money)) return false;

        Money money = (Money) object;
        return amount == money.amount
                && this.getClass().equals(money.getClass());
    }
}
