package aaci.controllers;

import javax.persistence.*;

/**
 * Created by Nico on 3/9/17.
 *
 */

@Entity
@Table(name = "CUSTOMER_INFO")
public class CustomerInfo {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Integer ID;

    @Column(name = "CUSTOMER_NAME")
    String customerName;

    @Column(name = "CLIENT_FULL_NAME")
    String clientFullName;

    @Column(name = "INDUSTRY")
    String industry;

    @Column(name = "PRODUCTS")
    String products;

    @Column(name = "SUBSIDIARIES")
    String subsidiaries;

    @Column(name = "ADDRESS")
    String address;

    @Column(name = "PHONE_NUMBER")
    String phoneNumber;

    @Column(name = "FAX_NUMBER")
    String faxNumber;

    @Column(name = "BUDGET_PERIOD_FROM")
    String budgetPeriodFrom;

    @Column(name = "BUDGET_PERIOD_TO")
    String budgetPeriodTo;

    @Column(name = "VOLUME")
    String volume;

    @Column(name = "ACCEPTS_PALLETS")
    String acceptsPallets;

    @Column(name = "CUSTOMER_TYPE")
    String customerType;

    @Column(name = "VOLUME_UNIT")
    String volumeUnit;

    public CustomerInfo(){

    }

    public CustomerInfo(String customerName, String industry, String products, String subsidiaries, String address, String phoneNumber, String faxNumber, String budgetPeriodFrom, String budgetPeriodTo, String volume, String acceptsPallets, String customerType) {
        this.customerName = customerName;
        this.industry = industry;
        this.products = products;
        this.subsidiaries = subsidiaries;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faxNumber = faxNumber;
        this.budgetPeriodFrom = budgetPeriodFrom;
        this.budgetPeriodTo = budgetPeriodTo;
        this.volume = volume;
        this.acceptsPallets = acceptsPallets;
        this.customerType = customerType;
    }

    public String getClientFullName() {
        return clientFullName;
    }

    public void setClientFullName(String clientFullName) {
        this.clientFullName = clientFullName;
    }

    public String getVolumeUnit() {
        return volumeUnit;
    }

    public void setVolumeUnit(String volumeUnit) {
        this.volumeUnit = volumeUnit;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public String getSubsidiaries() {
        return subsidiaries;
    }

    public void setSubsidiaries(String subsidiaries) {
        this.subsidiaries = subsidiaries;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getBudgetPeriodFrom() {
        return budgetPeriodFrom;
    }

    public void setBudgetPeriodFrom(String budgetPeriodFrom) {
        this.budgetPeriodFrom = budgetPeriodFrom;
    }

    public String getBudgetPeriodTo() {
        return budgetPeriodTo;
    }

    public void setBudgetPeriodTo(String budgetPeriodTo) {
        this.budgetPeriodTo = budgetPeriodTo;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getAcceptsPallets() {
        return acceptsPallets;
    }

    public void setAcceptsPallets(String acceptsPallets) {
        this.acceptsPallets = acceptsPallets;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerInfo that = (CustomerInfo) o;

        if (ID != null ? !ID.equals(that.ID) : that.ID != null) return false;
        if (customerName != null ? !customerName.equals(that.customerName) : that.customerName != null) return false;
        if (industry != null ? !industry.equals(that.industry) : that.industry != null) return false;
        if (products != null ? !products.equals(that.products) : that.products != null) return false;
        if (subsidiaries != null ? !subsidiaries.equals(that.subsidiaries) : that.subsidiaries != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(that.phoneNumber) : that.phoneNumber != null) return false;
        if (faxNumber != null ? !faxNumber.equals(that.faxNumber) : that.faxNumber != null) return false;
        if (budgetPeriodFrom != null ? !budgetPeriodFrom.equals(that.budgetPeriodFrom) : that.budgetPeriodFrom != null)
            return false;
        if (budgetPeriodTo != null ? !budgetPeriodTo.equals(that.budgetPeriodTo) : that.budgetPeriodTo != null)
            return false;
        if (volume != null ? !volume.equals(that.volume) : that.volume != null) return false;
        if (acceptsPallets != null ? !acceptsPallets.equals(that.acceptsPallets) : that.acceptsPallets != null)
            return false;
        return customerType != null ? customerType.equals(that.customerType) : that.customerType == null;

    }

    @Override
    public int hashCode() {
        int result = ID != null ? ID.hashCode() : 0;
        result = 31 * result + (customerName != null ? customerName.hashCode() : 0);
        result = 31 * result + (industry != null ? industry.hashCode() : 0);
        result = 31 * result + (products != null ? products.hashCode() : 0);
        result = 31 * result + (subsidiaries != null ? subsidiaries.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (faxNumber != null ? faxNumber.hashCode() : 0);
        result = 31 * result + (budgetPeriodFrom != null ? budgetPeriodFrom.hashCode() : 0);
        result = 31 * result + (budgetPeriodTo != null ? budgetPeriodTo.hashCode() : 0);
        result = 31 * result + (volume != null ? volume.hashCode() : 0);
        result = 31 * result + (acceptsPallets != null ? acceptsPallets.hashCode() : 0);
        result = 31 * result + (customerType != null ? customerType.hashCode() : 0);
        return result;
    }
}
