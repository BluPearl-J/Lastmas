package data.repositories;

import data.models.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VehiclesTest {

    private VehicleRepository vehicleRepository;
    private Vehicle vehicle1;
    private Vehicle vehicle2;

    @BeforeEach
    void setUp() {
        vehicleRepository = new Vehicles();
        vehicle1 = new Vehicle();
        vehicle1.setColour("Red");
        vehicle1.setPlateNumber("ABC123");

        vehicle2 = new Vehicle();
        vehicle2.setColour("Blue");
        vehicle2.setPlateNumber("XYZ789");
    }

    @Test
    void testSaveNewVehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Toyota");

        Vehicle saved = vehicleRepository.save(vehicle);

        assertTrue(saved.getId() > 0);

        List<Vehicle> allVehicles = vehicleRepository.findAll();
        assertEquals(1, allVehicles.size());
        assertEquals(saved.getId(), allVehicles.get(0).getId());
        assertEquals(saved.getName(), allVehicles.get(0).getName());
    }

    @Test
    void testSaveExistingVehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setId(5);
        vehicle.setName("Honda");

        Vehicle saved = vehicleRepository.save(vehicle);

        assertEquals(0, vehicleRepository.findAll().size());
        assertEquals(5, saved.getId());
        assertEquals("Honda", saved.getName());
    }

    @Test
    void testFindAll() {
        vehicleRepository.save(vehicle1);
        vehicleRepository.save(vehicle2);

        List<Vehicle> allVehicles = vehicleRepository.findAll();
        assertEquals(2, allVehicles.size());
        assertTrue(allVehicles.contains(vehicle1));
        assertTrue(allVehicles.contains(vehicle2));
    }

    @Test
    void testDeleteAll() {
        vehicleRepository.save(vehicle1);
        vehicleRepository.save(vehicle2);

        vehicleRepository.deleteAll();
        assertEquals(0, vehicleRepository.count());
    }

    @Test
    void testCount() {
        assertEquals(0, vehicleRepository.count());
        vehicleRepository.save(vehicle1);
        assertEquals(1, vehicleRepository.count());
        vehicleRepository.save(vehicle2);
        assertEquals(2, vehicleRepository.count());
    }
}

