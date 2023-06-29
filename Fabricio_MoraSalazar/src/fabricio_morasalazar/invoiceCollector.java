/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricio_morasalazar;

/**
 *
 * @author fmora
 */
public class invoiceCollector {
    private String customerName = "";
    private int customerCedula = 0;
    private int invoiceID = 0;
    private double invoiceCost = 0.0; 
    private int invoiceYear = 0;
    private int invoiceMonth = 0;
    private int invoiceStatus = 0;
    
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerCedula() {
        return customerCedula;
    }

    public void setCustomerCedula(int customerCedula) {
        this.customerCedula = customerCedula;
    }

    public int getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(int invoiceID) {
        this.invoiceID = invoiceID;
    }

    public double getInvoiceCost() {
        return invoiceCost;
    }

    public void setInvoiceCost(double invoiceCost) {
        this.invoiceCost = invoiceCost;
    }

    public int getInvoiceYear() {
        return invoiceYear;
    }

    public void setInvoiceYear(int invoiceYear) {
        this.invoiceYear = invoiceYear;
    }

    public int getInvoiceMonth() {
        return invoiceMonth;
    }

    public void setInvoiceMonth(int invoiceMonth) {
        this.invoiceMonth = invoiceMonth;
    }

    public int getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(int invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }
    
    
    
    
}
