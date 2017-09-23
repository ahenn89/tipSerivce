package tipservice;

/*
1. Create one low-level worker object that produces a tip. 
@author Ashlee
 */
public class ResturantTipCalculator {

    private double tipPercent;
    private double billAmt;
    
    public ResturantTipCalculator(double billAmt, double tipPercent){
        this.billAmt = billAmt;
        this.tipPercent = tipPercent;
    }
    
    public double calcTip(){
        
        return billAmt * tipPercent;
    }
     
    public double getTipPercent() {
        return tipPercent;
    }

    public void setTipPercent(double tipPercent) {
        this.tipPercent = tipPercent;
    }
    
     public double getBillAmt() {
        return billAmt;
    }

    public void setBillAmt(double billAmt) {
        this.billAmt = billAmt;
    }
}
