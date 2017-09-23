/* 
4. Create the high-level module (boss) that gives  order to worker components that are stored in the high-level model, based on abstraction. Call this a "-----Service"
Your code --> TipService --> Worker*/

package tipservice;

public class TipService {
    private TipCalculator calc;

    public TipService(TipCalculator calc) {
        this.calc = calc;
    }
    
    public double calcTip() {
        return calc.calcTip();
    }
    
    public TipCalculator getCalc() {
        return calc;
    }

    public void setCalc(TipCalculator calc) {
        this.calc = calc;
    }
    
    
    
    
}
