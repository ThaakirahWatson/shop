package za.co.shinysneakers.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.co.shinysneakers.domain.Flat;
import za.co.shinysneakers.domain.House;
import za.co.shinysneakers.factory.FlatFactory;
import za.co.shinysneakers.factory.HouseFactory;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class HouseRepositoryTest {
    @Autowired
    private HouseRepository repository;
    private static   House house = HouseFactory.createHouse(12345, (short) 10, "Main St", "Gardens", "Cape Town", "Western Cape", (short) 8000);

    @Test
    void testFlatRepository() {
        House created = repository.save(house);
        assertNotNull(created);
        System.out.println(created);
    }

}