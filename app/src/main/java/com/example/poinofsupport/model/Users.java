package com.example.poinofsupport.model;

public class Users {

    private int id;
    private String email;
    private String fullName;
    private String phoneNumber;
    private String city;
    private String workPlace;
    private String position;
    private String birthDate;
    private String maritalStatus;
    private String reason;
    private String wardDescription;
    private String chronicDiseases;
    private String alcoholConsumption;
    private String smoking;
    private String drugUse;
    private String psychiatrist;
    private String narcologist;
    private String hobbies;
    private String consent;
    private String reporting;

    public Users(
            int id,
            String email,
            String fullName,
            String phoneNumber,
            String city,
            String workPlace,
            String position,
            String birthDate,
            String maritalStatus,
            String reason,
            String wardDescription,
            String chronicDiseases,
            String alcoholConsumption,
            String smoking,
            String drugUse,
            String psychiatrist,
            String narcologist,
            String hobbies,
            String consent,
            String reporting
    ) {
        this.id = id;
        this.email = email;
        this.fullName = email;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.workPlace = workPlace;
        this.position = position;
        this.birthDate = birthDate;
        this.maritalStatus = maritalStatus;
        this.reason = reason;
        this.wardDescription = wardDescription;
        this.chronicDiseases = chronicDiseases;
        this.alcoholConsumption = alcoholConsumption;
        this.smoking = smoking;
        this.drugUse = drugUse;
        this.psychiatrist = psychiatrist;
        this.narcologist = narcologist;
        this.hobbies = hobbies;
        this.consent = consent;
        this.reporting = reporting;
    }

    public int getId() {
        return this.id;
    }
    public String getEmail() {
        return this.email;
    }
    public String getFullName() {
        return this.fullName;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public String getCity() {
        return this.city;
    }
    public String getWorkPlace() {
        return this.workPlace;
    }
    public String getPosition() {
        return this.position;
    }
    public String getBirthDate() {
        return this.birthDate;
    }
    public String getMaritalStatus() {
        return this.maritalStatus;
    }
    public String getReason() {
        return this.reason;
    }
    public String getWardDescription() {
        return this.wardDescription;
    }
    public String getchronicDiseases() {
        return this.chronicDiseases;
    }
    public String getAlcoholConsumption() {
        return this.alcoholConsumption;
    }
    public String getSmoking() {
        return this.smoking;
    }
    public String getdrugUse() {
        return this.drugUse;
    }
    public String getPsychiatrist() {
        return this.psychiatrist;
    }
    public String getNarcologist() {
        return this.narcologist;
    }
    public String getHobbies() {
        return this.hobbies;
    }
    public String getConsent() {
        return this.consent;
    }
    public String getReporting() {
        return this.reporting;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }
    public void setWardDescription(String wardDescription) {
        this.wardDescription = wardDescription;
    }
    public void setChronicDiseases(String chronicDiseases) {
        this.chronicDiseases = chronicDiseases;
    }
    public void setAlcoholConsumption(String alcoholConsumption) {
        this.alcoholConsumption = alcoholConsumption;
    }
    public void setSmoking(String smoking) {
        this.smoking = smoking;
    }
    public void setDrugUse(String drugUse) {
        this.drugUse = drugUse;
    }
    public void setPsychiatrist(String psychiatrist) {
        this.psychiatrist = psychiatrist;
    }
    public void setNarcologist(String narcologist) {
        this.narcologist = narcologist;
    }
    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }
    public void setConsent(String consent) {
        this.consent = consent;
    }
    public void setReporting(String reporting) {
        this.reporting = reporting;
    }
}
