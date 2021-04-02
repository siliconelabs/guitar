package com.guitarsales.guitarsale.repository;


import com.guitarsales.guitarsale.entities.ModelType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModelTypeJpaRepository extends JpaRepository<ModelType, Long> {
	List<ModelType> findByNameIsNull();
}
