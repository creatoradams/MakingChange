import java.util.HashMap;
import java.util.Map;

// purse class takes a double amount and returns a reference to a purse object that contains the amount translated
// into the fewest possible coins and bills.
public class Purse //
{
    private Map<Denomination, Integer> cash; //  represents the money in the purse. stores denominations as keys
    // and their count as values.
    public Purse() // constructor
    {
        cash = new HashMap<Denomination, Integer>(); // initializes the cash map when a Purse object is created.
    }
    public void add(Denomination type, int num) // adds a number of a particular denomination
    {
        this.cash.put(type, this.cash.getOrDefault(type, 0) + num); // gets current count of the denom type
    }
    public double remove(Denomination type, int num) //diminishes the money in the purse and returns that amount.
    {
        // Check denomination amounts. if type is not in the map or if num is > available cash, print message
        if (!cash.containsKey(type) || num > cash.get(type))
        {
            System.out.println("PURCHASE ERROR");
            return 0;
        }
        // count down denomination
        cash.put(type, cash.get(type) - num);
        return num * type.amount();
    }
    public double getValue() // returns the amount of money in the Purse
    {
        double total = 0.0;
        // traverse denominations
        for (Map.Entry<Denomination, Integer> entry : cash.entrySet())
        {
            Denomination d = entry.getKey(); // get bill/coin
            int amount = entry.getValue(); // get how many of that bill/coin
            total += amount * d.amount(); // calc total value
        }
        return total;
    }

    @Override
    public String toString() {
        if (cash.isEmpty()) {
            return "We Are Broke!";
        }
        StringBuilder str = new StringBuilder();

        // list the currency and how much
        for (Map.Entry<Denomination, Integer> entry : cash.entrySet()) {
            Denomination d = entry.getKey();
            int count = entry.getValue();
            if (count > 0) {
                str.append(count).append(" x ").append(d.name()).append(" ($").append(d.amount()).append(" each");
            }
        }
        // show total
        str.append("Total: $").append(getValue());
        return str.toString();
    }

}


