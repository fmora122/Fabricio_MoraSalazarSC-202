/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fabricio_morasalazar;

import javax.swing.JOptionPane;

/**
 *
 * @author fmora
 */
public class Fabricio_MoraSalazar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        invoiceCollector myInvoice = new invoiceCollector();
        double debt = 0;
        int option = 1;
        while (option != 0) {
            System.out.println("Main Menu - Select an option");
            System.out.println("1) To add an invoice.");
            System.out.println("2) Calculate Debt and Payment Plan.");
            System.out.println("3) Forecast next 6 Months");
            System.out.println("0) To exit.");
            System.out.println("");
            option = Integer.parseInt(JOptionPane.showInputDialog("Type your selection"));
            
            
            if (option == 1) {
                // *
                // Here we collect data and estimate the debt value by summing invoices in pending status
                // *
                System.out.println("New Invoice Menu");
                System.out.println("Please add the invoice data");
                System.out.println("");
                myInvoice.setCustomerName(JOptionPane.showInputDialog("Customer Full Name"));
                //
                myInvoice.setCustomerCedula(Integer.parseInt(JOptionPane.showInputDialog("Customer Cedula")));
                myInvoice.setInvoiceID(Integer.parseInt(JOptionPane.showInputDialog("Invoice ID")));
                myInvoice.setInvoiceCost(Double.parseDouble(JOptionPane.showInputDialog("Invoice Cost")));
                myInvoice.setInvoiceMonth(Integer.parseInt(JOptionPane.showInputDialog("Invoice Month")));
                myInvoice.setInvoiceYear(Integer.parseInt(JOptionPane.showInputDialog("Invoice Year")));
                myInvoice.setInvoiceStatus(Integer.parseInt(JOptionPane.showInputDialog("Status: 1 for Payed | 2 for Pending")));
                
                if (myInvoice.getInvoiceStatus() == 2) {
                    debt = debt + myInvoice.getInvoiceCost();
                }
                
            } else if (option == 2) {
                System.out.println("*Customer Name:");
                System.out.println(myInvoice.getCustomerName());
                System.out.println("*Total Debt:");
                System.out.println(debt);
                System.out.println("*Total Debt + interests:");
                System.out.println(debt+(debt*0.05));
                System.out.println("*Monthly Payment");
                System.out.println((debt+(debt*0.05))/6);
                System.out.println("");
                
            } else if (option == 3) {
                System.out.println("Invoice Forecast");
                System.out.println("");
                for (int month = 1; month <= 6; month ++) {
                    System.out.println("Payment #"+month);
                    System.out.println("Amount: "+(debt+(debt*0.05))/6);
                    //int currentMonth = myInvoice.getInvoiceMonth+
                    System.out.println("Month: "+(myInvoice.getInvoiceMonth()+month));
                    System.out.println("Year: "+myInvoice.getInvoiceYear());
                    System.out.println("");
                    
                }
            }
                    
        }
    }
    
}
