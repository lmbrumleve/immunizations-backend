package com.london.immunizations.model;

import java.util.Date;

public class Immunization {
    private Long id;

    private Long childId;
    private String vaccineGroup;

    private int dose;

    private boolean status; //0 means not yet administered; 1 means already administered

    private Date dateAdministered;

    private String vaccineName;

    private String vaccineBrand;

    private String doctorName;

    public Long getId() {
        return id;
    }

    public Long getChildId() {
        return childId;
    }

    public void setChildId(Long childId) {
        this.childId = childId;
    }

    public String getVaccineGroup() {
        return vaccineGroup;
    }

    public void setVaccineGroup(String vaccineGroup) {
        this.vaccineGroup = vaccineGroup;
    }

    public int getDose() {
        return dose;
    }

    public void setDose(int dose) {
        this.dose = dose;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getDateAdministered() {
        return dateAdministered;
    }

    public void setDateAdministered(Date dateAdministered) {
        this.dateAdministered = dateAdministered;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public String getVaccineBrand() {
        return vaccineBrand;
    }

    public void setVaccineBrand(String vaccineBrand) {
        this.vaccineBrand = vaccineBrand;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
}
