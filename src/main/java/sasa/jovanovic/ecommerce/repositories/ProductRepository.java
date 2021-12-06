package sasa.jovanovic.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import sasa.jovanovic.ecommerce.models.Product;

@Repository
@CrossOrigin
public interface ProductRepository extends JpaRepository<Product, Long> {

}
