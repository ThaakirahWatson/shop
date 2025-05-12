package za.co.shinysneakers.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.co.shinysneakers.domain.Flat;
import za.co.shinysneakers.factory.FlatFactory;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FlatRepositoryTest {
    @Autowired
    private FlatRepository repository;
    private static Flat flat = FlatFactory.createFlat((short) 10, "Sunset Apartments", (short) 123, "Main St", "Tamboerskloof", "Cape Town", "Western Cape", (short) 8000);

    @Test
    void testFlatRepository() {
        Flat created = repository.save(flat);
        assertNotNull(created);
        System.out.println(created);
    }

}