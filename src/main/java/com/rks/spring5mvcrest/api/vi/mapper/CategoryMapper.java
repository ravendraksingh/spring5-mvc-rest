package com.rks.spring5mvcrest.api.vi.mapper;

import com.rks.spring5mvcrest.api.vi.model.CategoryDTO;
import com.rks.spring5mvcrest.domain.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDTO categoryToCategoryDTO(Category category);
}
