package za.co.shinysneakers.factory;

import org.junit.jupiter.api.Test;
import za.co.shinysneakers.domain.House;

import static org.junit.jupiter.api.Assertions.*;

class HouseFactoryTest {

    @Test
    void createHouse() {
        House house = HouseFactory.createHouse(12345, (short) 10, "Main St", "Gardens", "Cape Town", "Western Cape", (short) 8000);
        assertNotNull(house);
        System.out.println(house);
    }
}