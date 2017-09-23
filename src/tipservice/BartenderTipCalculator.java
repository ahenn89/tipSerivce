/*
2. Create a second, but different type of low-level worker that also produce a tip, using the same method as in #1 above.
*/
package tipservice;

public class BartenderTipCalculator implements TipCalculator {
    private int drinkQty;
    private double tipPerDrink;

    public BartenderTipCalculator(int drinkQty, double tipPerDrink) {
        this.drinkQty = drinkQty;
        this.tipPerDrink = tipPerDrink;
    }
    
    @Override
    public double calcTip() {
        return drinkQty * tipPerDrink;
    }
    
    public int getDrinkQty() {
        return drinkQty;
    }

    public void setDrinkQty(int drinkQty) {
        this.drinkQty = drinkQty;
    }

    public double getTipPerDrink() {
        return tipPerDrink;
    }

    public void setTipPerDrink(double tipPerDrink) {
        this.tipPerDrink = tipPerDrink;
    }
    
    
}
