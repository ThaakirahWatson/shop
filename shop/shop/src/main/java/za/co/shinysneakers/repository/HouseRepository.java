package za.co.shinysneakers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.shinysneakers.domain.House;

@Repository
public interface HouseRepository extends JpaRepository<House, Long> {
    // Custom query methods can be defined here if needed
    // For example, find by street name or suburb
    // List<House> findByStreetName(String streetName);
    // List<House> findBySuburb(String suburb);
}
