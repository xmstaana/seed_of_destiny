package aaci.controllers;

import javax.persistence.*;

/**
 * Created by Nico on 4/10/17.
 */
@Entity
@Table(name = "ACTIVITY_INFO")
public class ActivityInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    @Column(name = "CLIENT_ID")
    String clientId;

    @Column(name = "ACTIVITY_ID")
    String activityId;

    @Column(name = "ACTIVITY_TYPE")
    String activityType;

    @Column(name = "OFFER_DATE")
    String offerDate;

    @Column(name = "CONCLUSION_DATE")
    String conclusionDate;

    @Column(name = "MILLMARK")
    String millmark;

    @Column(name = "PRICE")
    String price;

    @Column(name = "CURRENCY")
    String currency;

    @Column(name = "VAT")
    String vat;

    @Column(name = "QUANTITY")
    String quantity;

    @Column(name = "UNIT")
    String unit;

    @Column(name = "DEL_PERIOD_FROM")
    String delPeriodFrom;

    @Column(name = "DEL_PERIOD_TO")
    String delPeriodTo;

    @Column(name = "DEL_STATUS")
    String delStatus;

    @Column(name = "DEL_LOCATION")
    String delLocation;

    @Column(name = "TERMS")
    String terms;

    @Column(name = "TYPE_OF_PAYMENT")
    String typeOfPayment;

    @Column(name = "TOTAL_AMOUNT")
    String totalAmount;

    @Column(name = "COMMODITY")
    String commodity;

    @Column(name = "CONTRACT_STATUS")
    String contractStatus;

    @Column(name = "CLIENT_TYPE")
    String clientType;

    @Column(name = "ACT_CLASS")
    String actClass;

    @Column(name = "XEDRIC")
    String xedric;


    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public ActivityInfo(){

    }

    public ActivityInfo(String activityId, String activityType, String offerDate, String conclusionDate, String millmark, String price, String currency, String vat, String quantity, String unit, String delPeriodFrom, String delPeriodTo, String delStatus, String delLocation, String terms, String typeOfPayment) {
        this.activityId = activityId;
        this.activityType = activityType;
        this.offerDate = offerDate;
        this.conclusionDate = conclusionDate;
        this.millmark = millmark;
        this.price = price;
        this.currency = currency;
        this.vat = vat;
        this.quantity = quantity;
        this.unit = unit;
        this.delPeriodFrom = delPeriodFrom;
        this.delPeriodTo = delPeriodTo;
        this.delStatus = delStatus;
        this.delLocation = delLocation;
        this.terms = terms;
        this.typeOfPayment = typeOfPayment;
    }

    public String getXedric() {
        return xedric;
    }

    public void setXedric(String xedric) {
        this.xedric = xedric;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getActClass() {
        return actClass;
    }

    public void setActClass(String actClass) {
        this.actClass = actClass;
    }

    public String getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(String contractStatus) {
        this.contractStatus = contractStatus;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public String getOfferDate() {
        return offerDate;
    }

    public void setOfferDate(String offerDate) {
        this.offerDate = offerDate;
    }

    public String getConclusionDate() {
        return conclusionDate;
    }

    public void setConclusionDate(String conclusionDate) {
        this.conclusionDate = conclusionDate;
    }

    public String getMillmark() {
        return millmark;
    }

    public void setMillmark(String millmark) {
        this.millmark = millmark;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getVat() {
        return vat;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getDelPeriodFrom() {
        return delPeriodFrom;
    }

    public void setDelPeriodFrom(String delPeriodFrom) {
        this.delPeriodFrom = delPeriodFrom;
    }

    public String getDelPeriodTo() {
        return delPeriodTo;
    }

    public void setDelPeriodTo(String delPeriodTo) {
        this.delPeriodTo = delPeriodTo;
    }

    public String getDelStatus() {
        return delStatus;
    }

    public void setDelStatus(String delStatus) {
        this.delStatus = delStatus;
    }

    public String getDelLocation() {
        return delLocation;
    }

    public void setDelLocation(String delLocation) {
        this.delLocation = delLocation;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public String getTypeOfPayment() {
        return typeOfPayment;
    }

    public void setTypeOfPayment(String typeOfPayment) {
        this.typeOfPayment = typeOfPayment;
    }

    public String getCommodity() {
        return commodity;
    }

    public void setCommodity(String commodity) {
        this.commodity = commodity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ActivityInfo that = (ActivityInfo) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (activityId != null ? !activityId.equals(that.activityId) : that.activityId != null) return false;
        if (activityType != null ? !activityType.equals(that.activityType) : that.activityType != null) return false;
        if (offerDate != null ? !offerDate.equals(that.offerDate) : that.offerDate != null) return false;
        if (conclusionDate != null ? !conclusionDate.equals(that.conclusionDate) : that.conclusionDate != null)
            return false;
        if (millmark != null ? !millmark.equals(that.millmark) : that.millmark != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (currency != null ? !currency.equals(that.currency) : that.currency != null) return false;
        if (vat != null ? !vat.equals(that.vat) : that.vat != null) return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;
        if (unit != null ? !unit.equals(that.unit) : that.unit != null) return false;
        if (delPeriodFrom != null ? !delPeriodFrom.equals(that.delPeriodFrom) : that.delPeriodFrom != null)
            return false;
        if (delPeriodTo != null ? !delPeriodTo.equals(that.delPeriodTo) : that.delPeriodTo != null) return false;
        if (delStatus != null ? !delStatus.equals(that.delStatus) : that.delStatus != null) return false;
        if (delLocation != null ? !delLocation.equals(that.delLocation) : that.delLocation != null) return false;
        if (terms != null ? !terms.equals(that.terms) : that.terms != null) return false;
        return typeOfPayment != null ? typeOfPayment.equals(that.typeOfPayment) : that.typeOfPayment == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (activityId != null ? activityId.hashCode() : 0);
        result = 31 * result + (activityType != null ? activityType.hashCode() : 0);
        result = 31 * result + (offerDate != null ? offerDate.hashCode() : 0);
        result = 31 * result + (conclusionDate != null ? conclusionDate.hashCode() : 0);
        result = 31 * result + (millmark != null ? millmark.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (vat != null ? vat.hashCode() : 0);
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        result = 31 * result + (delPeriodFrom != null ? delPeriodFrom.hashCode() : 0);
        result = 31 * result + (delPeriodTo != null ? delPeriodTo.hashCode() : 0);
        result = 31 * result + (delStatus != null ? delStatus.hashCode() : 0);
        result = 31 * result + (delLocation != null ? delLocation.hashCode() : 0);
        result = 31 * result + (terms != null ? terms.hashCode() : 0);
        result = 31 * result + (typeOfPayment != null ? typeOfPayment.hashCode() : 0);
        return result;
    }
}
