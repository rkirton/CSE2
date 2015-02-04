///////////////////////////////////////
//Ryan Kirton
//hw02
//Arithmetic
//
//This program should be able to take list of items bought at Walmart
//and compute the cost including the sales tax
//

public class Arithmetic{
    
    public static void main(String[] args)  {
     
     //number of pairs of socks   
     int nSocks=3;
     //cost per pair of socks
     double sockCost$=2.58;
     
     //number of drinking glasses
     int nGlasses=6;
     //cost per glass
     double glassCost$=2.29;
     
     //number of boxes of envelopes
     int nEnvelopes=1;
     //cost per box of envelopes
     double envelopeCost$=3.25;
     double taxPercent=0.06;
     
     //print the item, quantity and cost per item
     System.out.println("There were "+(nSocks)+" pairs of socks purchased at $"+(sockCost$)+" per pair");
     System.out.println("There were "+(nGlasses)+" glasses purchased at $"+(glassCost$)+" per glass");
     System.out.println("There was "+(nEnvelopes)+" envelope purchased at $"+(envelopeCost$)+" per envelope");
     
     //calculate sock subtotal, tax, and total
     double subtotalSockCost$=sockCost$*nSocks;
     double taxForSocks$=subtotalSockCost$*taxPercent;
     double totalSockCost$=taxForSocks$+subtotalSockCost$;
     
     //limit decimal places in the tax to 2
     taxForSocks$=(int)(taxForSocks$*100)/100.0;
     
     //print the sock subtotal and tax
     System.out.println("The subtotal sock cost was $"+(subtotalSockCost$)+" and the tax for socks was $" +(taxForSocks$)+ "");
     
     //calculate glass subtotal, tax and total
     double subtotalGlassCost$=glassCost$*nGlasses;
     double taxForGlasses$=subtotalGlassCost$*taxPercent;
     double totalGlassCost$=taxForGlasses$+subtotalGlassCost$;
     
     //limit decimal places in the tax to 2
     taxForGlasses$=(int)(taxForGlasses$*100)/100.0;
     
     //print the glass subtotal and tax
     System.out.println("The subtotal glass cost was $"+(subtotalGlassCost$)+" and the tax for glasses was $"+(taxForGlasses$)+"");
     
     //calculate envelope subtotal, tax and total
     double subtotalEnvelopeCost$=envelopeCost$*nEnvelopes;
     double taxForEnvelope$=subtotalEnvelopeCost$*taxPercent;
     double totalEnvelopeCost$=taxForEnvelope$+subtotalEnvelopeCost$;
     
     //limit decimal places in the tax to 2
     taxForEnvelope$=(int)(taxForEnvelope$*100)/100.0;
     
     //print the envelope subtotal and tax
     System.out.println("The subtotal envelope cost was $"+(subtotalEnvelopeCost$)+" and the tax for envelopes was $"+(taxForEnvelope$)+"");
     
     //calculate the grand subtotal, the total tax and grand total
     double grandSubtotal$=subtotalEnvelopeCost$+subtotalGlassCost$+subtotalSockCost$;
     double grandTaxTotal$=taxForEnvelope$+taxForGlasses$+taxForSocks$;
     double grandTotal$=totalSockCost$+totalEnvelopeCost$+totalGlassCost$;
     
     //limit the number of decimals for each answer to 2
     grandSubtotal$=(int)(grandSubtotal$*100)/100.0;
     grandTaxTotal$=(int)(grandTaxTotal$*100)/100.0;
     grandTotal$=(int)(grandTotal$*100)/100.0;
     
     //print the grand subtotal, total tax and grand total
     System.out.println("The total cost of the purchases before tax was $"+(grandSubtotal$)+""); //print total cost before tax
     System.out.println("The total tax of the purchases was $"+(grandTaxTotal$)+""); //print the total tax
     System.out.println("The grand total including tax was $"+(grandTotal$)+""); //print the grand total
     
     
    }
}