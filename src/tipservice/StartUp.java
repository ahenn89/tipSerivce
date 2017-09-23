package tipservice;


public class StartUp {
    
    public static void main(String[] args) {
        //Initialize worker object
        ResturantTipCalculator calc = new ResturantTipCalculator(100, .10);
        
        TipService tipService = new TipService(calc);
        double tip = tipService.calcTip();
        
        System.out.println("The tip is: " + tip);
    }
}
