package kingdom.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

import kingdom.contracts.AbstractHospital;
import kingdom.core.KingdomRegistry;

public class Hospital extends AbstractHospital {

    static {
        KingdomRegistry.register(Hospital.class);
    }

    @JsonProperty("identity")
    private String id;
    @JsonProperty
    private String name;
    @JsonProperty
    private String description;
    @JsonProperty
    private LocalDate foundingDate;
    @JsonProperty
    private Status status;
    @JsonProperty
    private List<String> patients;

    public Hospital() {
        this.id = "HOSPITAL-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        this.name = "Hospital";
        this.description = "A place of healing for the kingdom's citizens.";
        this.foundingDate = LocalDate.now();
        this.status = Status.UNDER_CONSTRUCTION;
        this.patients = new ArrayList<>();
    }

    public Hospital(String name, String description) {
        this();
        this.name = name;
        this.description = description;
        this.status = Status.OPERATIONAL;
    }

    @Override
    public void admitPatient(String patientName) {
        if (patientName != null && !patientName.trim().isEmpty())
            this.patients.add(patientName.trim());
    }

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Override
    public int getPatientCount() {
        return this.patients.size();
    }

    @Override
    public void dischargePatient(String patientName) {
        this.patients.remove(patientName);
    }

    // KingdomEntity interface
    @Override
    public String getIdentity() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public LocalDate getFoundingDate() {
        return this.foundingDate;
    }

    @Override
    public Status getStatus() {
        return this.status;
    }
}