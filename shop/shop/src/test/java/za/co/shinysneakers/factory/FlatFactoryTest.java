package za.co.shinysneakers.factory;

import org.junit.jupiter.api.Test;
import za.co.shinysneakers.domain.Flat;

import static org.junit.jupiter.api.Assertions.*;

class FlatFactoryTest {

    @Test
    void createFlat() {
        Flat flat = FlatFactory.createFlat((short) 10, "Sunset Apartments", (short) 123, "Main St", "Tamboerskloof", "Cape Town", "Western Cape", (short) 8000);
    }
}