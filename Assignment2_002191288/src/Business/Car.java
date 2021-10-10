/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;

/**
 *
 * @author saikumarganga
 *
 */
public class Car {

    private String modelNumber;
    private String serialNumber;
    private String manufactureType;
    private int manufacturedYear;
    private int availableSeats;
    private String city;
    private boolean maintenceCertificateExpiryStatus;
    private boolean availabilityStatus;
    private Date lastUpdatedDate;

    Car(String modelNumber, String serialNumber, String manufactureType, int manufacturedYear, int availableSeats, String city, boolean maintenceCertificateExpiryStatus, boolean availabilityStatus, Date lastUpdatedDate) {
        this.availabilityStatus = availabilityStatus;
        this.modelNumber = modelNumber;
        this.serialNumber = serialNumber;
        this.manufactureType = manufactureType;
        this.city = city;
        this.maintenceCertificateExpiryStatus = maintenceCertificateExpiryStatus;
        this.manufacturedYear = manufacturedYear;
        this.availableSeats = availableSeats;
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    Car() {

    }

    public boolean ismaintenceCertificateExpiryStatus() {
        return maintenceCertificateExpiryStatus;
    }

    public void setmaintenceCertificateExpiryStatus(boolean maintenceCertificateExpiryStatus) {
        this.maintenceCertificateExpiryStatus = maintenceCertificateExpiryStatus;
    }

    public boolean isavailabilityStatus() {
        return availabilityStatus;
    }

    public void setavailabilityStatus(boolean availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getmanufactureType() {
        return manufactureType;
    }

    public void setmanufactureType(String manufactureType) {
        this.manufactureType = manufactureType;
    }

    public int getManufacturedYear() {
        return manufacturedYear;
    }

    public void setManufacturedYear(int manufacturedYear) {
        this.manufacturedYear = manufacturedYear;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getManufactureType() {
        return manufactureType;
    }

    public void setManufactureType(String manufactureType) {
        this.manufactureType = manufactureType;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public boolean isMaintenceCertificateExpiryStatus() {
        return maintenceCertificateExpiryStatus;
    }

    public void setMaintenceCertificateExpiryStatus(boolean maintenceCertificateExpiryStatus) {
        this.maintenceCertificateExpiryStatus = maintenceCertificateExpiryStatus;
    }

    public boolean isAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(boolean availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    @Override
    public String toString() {
        return manufactureType;
    }

}
