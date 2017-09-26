/* 
4. Create the high-level module (boss) that gives  order to worker components that are stored in the high-level model, based on abstraction. Call this a "-----Service"
Your code --> TipService --> Worker*/

package tipservice;

public class TipService {
    private TipCalculator calc;

    public TipService(TipCalculator calc) {
        //this validates the calculator
        //setCalc(calc); 
        this.calc = calc;
    }
    
    //change to final so no one else can modify it
    public final double calcTip() {
        return calc.calcTip();
    }
    
    public TipCalculator getCalc() {
        return calc;
    }

    public void setCalc(TipCalculator calc) {
        this.calc = calc;
    }
    
    
    
    
}
