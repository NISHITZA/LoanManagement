package emi.Logic;

import java.time.LocalDate;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;

public class Calculation
{
    public static void main(String args[]) 
    {
        float P=0;
        int tenure=0;
        int rate=12;
        LocalDate date=LocalDate.now();
        Calculation cal=new Calculation();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd MMMM yyyy");
        if(args.length>2)
        {
            System.out.println("Wrong Number of Input");
            System.exit(1);
        }
        try
        {
        for(int i = 0; i<args.length; i++) 
        {
            P=Float.parseFloat(args[0]);
            tenure=Integer.parseInt(args[1]);
        }
        
        System.out.println("\nLoan creation date : "+formatter.format(date));
        System.out.println("\nPrincipal Amount : "+P);
        System.out.println("\nNo of EMI's : "+tenure);
        }
        catch(Exception e)
        {
            System.out.println("Enter the correct input ");
            System.out.println("Format-[Amount Tenure]");
            System.exit(1);
        }
        cal.emiDisplay(cal.emiCal(P,rate,tenure,date));
        
     }
    
    
    public String[][] emiCal(float P,int rate,int t,LocalDate date)
    {
    	DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd MMMM yyyy");
    	float SI=(P*1*rate)/100;
        float total=P+SI;
        System.out.println("\nTotal payable amount : "+total);
        String EMI[][]=new String[t][6];
        float PE=P/t;
        float IE=SI/t;
        float TE=PE+IE;
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        for(int i=0;i<EMI.length;i++)
        {
            
                EMI[i][0]=Integer.toString(i+1);
                EMI[i][1]=df.format(PE);
                EMI[i][2]=df.format(IE);
                EMI[i][3]=df.format(TE);
                EMI[i][4]=formatter.format(date.plusMonths(i+1));
                total=total-TE;
                EMI[i][5]=df.format(Math.round(total));
        }
		return EMI;	
    }
    
    
    public void emiDisplay(String EMI[][])
    {
         System.out.println("\nEMI Details :\n");
    	 for(int i=0;i<EMI.length;i++)
         {
             System.out.println("EMI NO : "+EMI[i][0]+" Principal EMI : "+EMI[i][1]+" Interest EMI :"+EMI[i][2]);
             System.out.println("Total EMI : "+EMI[i][3]+" EMI Date : "+EMI[i][4]+" Principal remaining :"+EMI[i][5]);
             System.out.println(" ");
         }
    	
    }
    
  }