package com.guitarsales.guitarsale.repository;


import com.guitarsales.guitarsale.entities.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ModelJpaRepository extends JpaRepository<Model, Long> {
	List<Model> findByPriceGreaterThanEqualAndPriceLessThanEqual(BigDecimal low, BigDecimal high);
	
	List<Model> findByModelTypeNameIn(List<String> types);
}
