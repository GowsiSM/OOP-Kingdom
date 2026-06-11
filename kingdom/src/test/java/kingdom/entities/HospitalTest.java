package kingdom.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

class HospitalTest {

    private Hospital h;

    @BeforeEach
    void setup() {
        h = new Hospital();
    }

    @Test
    @DisplayName("No-arg -> UNDER_CONSTRUCTION")
    void noArgStatus() {
        assertEquals(Hospital.Status.UNDER_CONSTRUCTION, h.getStatus());
    }

    @Test
    @DisplayName("No-arg -> UUID identity with prefix")
    void noArgIdentity() {
        assertNotNull(h.getIdentity());
        assertTrue(h.getIdentity().startsWith("HOSPITAL-"));
    }

    @Test
    @DisplayName("No-arg -> empty patient list")
    void noArgEmpty() {
        assertEquals(0, h.getPatientCount());
    }

    @Test
    @DisplayName("Parameterized -> OPERATIONAL")
    void paramStatus() {
        var op = new Hospital("Royal Infirmary", "Main healing center.");
        assertEquals(Hospital.Status.OPERATIONAL, op.getStatus());
    }

    @Test
    @DisplayName("admitPatient adds one patient")
    void admitOne() {
        h.admitPatient("Arthur");
        assertEquals(1, h.getPatientCount());
    }

    @Test
    @DisplayName("Multiple admissions accumulate")
    void admitMultiple() {
        h.admitPatient("A");
        h.admitPatient("B");
        h.admitPatient("C");
        assertEquals(3, h.getPatientCount());
    }

    @Test
    @DisplayName("dischargePatient removes the right patient")
    void discharge() {
        h.admitPatient("A");
        h.admitPatient("B");
        h.dischargePatient("A");
        assertEquals(1, h.getPatientCount());
    }

    @Test
    @DisplayName("Jackson round-trip preserves state")
    void serialization() throws Exception {
        var mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.activateDefaultTyping(
                mapper.getPolymorphicTypeValidator(),
                ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE);

        h.admitPatient("Arthur");
        var json = mapper.writeValueAsString(h);
        var restored = mapper.readValue(json, Hospital.class);

        assertEquals(h.getPatientCount(), restored.getPatientCount());
        assertEquals(h.getIdentity(), restored.getIdentity());
    }
}