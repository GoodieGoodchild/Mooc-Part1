
import java.util.Scanner;

public class GiftTax {
    
    final static int GVA = 5000;
    final static int GVB = 25000;
    final static int GVC = 55000;
    final static int GVD = 200000;
    final static int GVE = 1000000;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of gift?");
        double gift = Double.valueOf(scan.nextLine());
        
        int taxLowLim = 0;
        double taxRate = 0.0;
        int valGiftLow = GVA;
        double giftTax = 0.0;
        
        if (gift >= GVA && gift < GVB) {
            taxLowLim = 100;
            taxRate = 0.08;
            valGiftLow = GVA; //5000
            // (taxLowLim + (gift - valGiftLow) * taxRate)
            double midbrack = (gift * 1.0) - valGiftLow;
            giftTax = taxLowLim + midbrack * taxRate;
            System.out.println("Tax:" + giftTax);
            
        } else if (gift >= GVB && gift < GVC) {
            taxLowLim = 1700;
            taxRate = 0.1;
            valGiftLow = GVB; //25000
            double midbrack = (gift * 1.0) - valGiftLow;
            giftTax = taxLowLim + midbrack * taxRate;
            System.out.println("Tax:" + giftTax);
            
        } else if (gift >= GVC && gift < GVD) {
            taxLowLim = 4700;
            taxRate = 0.12;
            valGiftLow = GVC; //55000
            double midbrack = (gift * 1.0) - valGiftLow;
            giftTax = taxLowLim + midbrack * taxRate;
            System.out.println("Tax:" + giftTax);
            
        } else if (gift >= GVD && gift < GVE) {
            taxLowLim = 22100;
            taxRate = 0.15;
            valGiftLow = GVD; //200 000
            double midbrack = (gift * 1.0) - valGiftLow;
            giftTax = taxLowLim + midbrack * taxRate;
            System.out.println("Tax:" + giftTax);
            
        } else if (gift >= GVE) { 
            taxLowLim = 142100;
            taxRate = 0.17;
            valGiftLow = GVE; // 1 000 000 
            double midbrack = (gift * 1.0) - valGiftLow;
            giftTax = taxLowLim + midbrack * taxRate;
            System.out.println("Tax:" + giftTax);
            
        } else {
            System.out.println("No Tax!");
        }
    }
}
