package com.london.immunizations.model;

import java.util.Date;

public class Immunization {

    private String vaccineGroup;

    private int dose;

    private boolean status; //0 means not yet administered; 1 means already administered

    private Date dateAdministered;

    private String vaccineName;

    private String vaccineBrand;

}
