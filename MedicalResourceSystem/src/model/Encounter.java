/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author yanyanchen
 */
public class Encounter {
    private String encounterDate;

    private Patient patient;
    VitalSigns vitalSign;


    public String getEncounterDate() {
        return encounterDate;
    }

    public void setEncounterDate(String encounterDate) {
        this.encounterDate = encounterDate;
    }


    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public VitalSigns getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(VitalSigns vitalSign) {
        this.vitalSign = vitalSign;
    }
    

    String specialty;
    String positionTitle;

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getPositionTitle() {
        return positionTitle;
    }

    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }
    
    String doctor;
    String patientId;
    String name;
    String gender;
    String age;
    String email;
    String house;
    String community;
    String patientHeartBeat;
    String patientBloodPressure;
    String date;
    String id;
    String heartBeat;
    String bloodPressure;
    String diagnose;
    String status;

    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHeartBeat() {
        return heartBeat;
    }

    public void setHeartBeat(String heartBeat) {
        this.heartBeat = heartBeat;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    
    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientHeartBeat() {
        return patientHeartBeat;
    }

    public void setPatientHeartBeat(String patientHeartBeat) {
        this.patientHeartBeat = patientHeartBeat;
    }

    public String getPatientBloodPressure() {
        return patientBloodPressure;
    }

    public void setPatientBloodPressure(String patientBloodPressure) {
        this.patientBloodPressure = patientBloodPressure;
    }
    
    
}
