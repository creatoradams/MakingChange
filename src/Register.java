public class Register
{
    public Purse makeChange(double amount)
    {
        Purse newTotal = new Purse();
        // takes an amt and returns a Purse containing that amount in the fewest number of bills and coins.
        Denomination[] denoms =
                {
                        new Denomination("Hundred Dollar", 100.0, "Bill", "images/hundred.jpg"),
                        new Denomination("Fifty Dollar", 50.0, "Bill", "images/fifty.jpg"),
                        new Denomination("Twenty Dollar", 20.0, "Bill", "images/twenty.jpg"),
                        new Denomination("Ten Dollar", 10.0, "Bill", "images/ten.jpg"),
                        new Denomination("Five Dollar", 5.0, "Bill", "images/five.jpg"),
                        new Denomination("One Dollar", 1.0, "Bill", "images/one.jpg"),
                        new Denomination("Quarter", 0.25, "Coin", "images/quarter.jpeg"),
                        new Denomination("Dime", 0.10, "Coin", "images/dime.jpg"),
                        new Denomination("Nickel", 0.05, "Coin", "images/nickel.jpg"),
                        new Denomination("Penny", 0.01, "Coin", "images/penny.jpg"),
                };
        // convert dollar amounts to cents
        int cents = (int)Math.round(amount * 100);

        // use a for loop to see what coins and bills can fit in the amount
        for(Denomination d : denoms)
        {
            int centValue = (int)Math.round(d.amount() * 100);
            int count = cents / centValue;
            if (count > 0)
            {
                // add to purse
                newTotal.add(d, count);
                // subtract from remaining amount
                cents = cents - (count * centValue);
            }
        }
        // return new purse with the change
        return newTotal;
    }
    public static void main(String [] args)
    {

    }
}

