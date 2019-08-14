package com.rks.spring5mvcrest.services;

import com.rks.spring5mvcrest.api.vi.model.CategoryDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryService {

    List<CategoryDTO> getAllCategories() ;

    CategoryDTO getCategoryByName(String name);
}
