package com.example.qpassessment.Repo;

import com.example.qpassessment.Entity.GroceryItem;
import org.springframework.data.repository.CrudRepository;

public interface GroceryItemRepository extends CrudRepository<GroceryItem,Long> {
    List<GroceryItem> findByInventoryGreaterThan(int inventory);
}
