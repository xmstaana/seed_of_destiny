package aaci.controllers;

import javax.persistence.*;

/**
 * Created by Nico on 4/10/17.
 */
@Entity
@Table(name = "CONTACT_INFO")
public class ContactInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    @Column(name = "CONTACT_ID")
    String contactId;

    @Column(name = "CONTACT_NAME")
    String contactName;

    @Column(name = "FULL_NAME")
    String fullName;

    @Column(name = "CONTACT_POSITION")
    String contactPosition;

    @Column(name = "CONTACT_ADDRESS")
    String contactAddress;

    @Column(name = "MOBILE_NUMBER")
    String mobileNumber;

    @Column(name = "OFFICE_NUMBER")
    String officeNumber;

    @Column(name = "FAX_NUMBER")
    String faxNumber;

    @Column(name = "EMAIL_ADDRESS")
    String emailAddress;

    @Column(name = "BIRTHDAY")
    String birthday;

    @Column(name = "CUSTOMER_INFO_ID")
    String customerInfoId;

    public ContactInfo(){}


    public ContactInfo(String contactName, String contactPosition, String contactAddress, String mobileNumber, String officeNumber, String faxNumber, String emailAddress, String birthday, String customerInfoId) {
        this.contactName = contactName;
        this.contactPosition = contactPosition;
        this.contactAddress = contactAddress;
        this.mobileNumber = mobileNumber;
        this.officeNumber = officeNumber;
        this.faxNumber = faxNumber;
        this.emailAddress = emailAddress;
        this.birthday = birthday;
        this.customerInfoId = customerInfoId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPosition() {
        return contactPosition;
    }

    public void setContactPosition(String contactPosition) {
        this.contactPosition = contactPosition;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCustomerInfoId() {
        return customerInfoId;
    }

    public void setCustomerInfoId(String customerInfoId) {
        this.customerInfoId = customerInfoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactInfo that = (ContactInfo) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (contactName != null ? !contactName.equals(that.contactName) : that.contactName != null) return false;
        if (contactPosition != null ? !contactPosition.equals(that.contactPosition) : that.contactPosition != null)
            return false;
        if (contactAddress != null ? !contactAddress.equals(that.contactAddress) : that.contactAddress != null)
            return false;
        if (mobileNumber != null ? !mobileNumber.equals(that.mobileNumber) : that.mobileNumber != null) return false;
        if (officeNumber != null ? !officeNumber.equals(that.officeNumber) : that.officeNumber != null) return false;
        if (faxNumber != null ? !faxNumber.equals(that.faxNumber) : that.faxNumber != null) return false;
        if (emailAddress != null ? !emailAddress.equals(that.emailAddress) : that.emailAddress != null) return false;
        if (birthday != null ? !birthday.equals(that.birthday) : that.birthday != null) return false;
        return customerInfoId != null ? customerInfoId.equals(that.customerInfoId) : that.customerInfoId == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (contactName != null ? contactName.hashCode() : 0);
        result = 31 * result + (contactPosition != null ? contactPosition.hashCode() : 0);
        result = 31 * result + (contactAddress != null ? contactAddress.hashCode() : 0);
        result = 31 * result + (mobileNumber != null ? mobileNumber.hashCode() : 0);
        result = 31 * result + (officeNumber != null ? officeNumber.hashCode() : 0);
        result = 31 * result + (faxNumber != null ? faxNumber.hashCode() : 0);
        result = 31 * result + (emailAddress != null ? emailAddress.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (customerInfoId != null ? customerInfoId.hashCode() : 0);
        return result;
    }
}
