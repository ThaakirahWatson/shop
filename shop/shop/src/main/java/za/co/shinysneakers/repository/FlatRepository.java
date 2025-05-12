package za.co.shinysneakers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.shinysneakers.domain.Flat;

@Repository
public interface FlatRepository extends JpaRepository<Flat, Long> {
    // Custom query methods can be defined here if needed
    // For example, find by street name or suburb
    // List<Flat> findByStreetName(String streetName);
    // List<Flat> findBySuburb(String suburb);
}
