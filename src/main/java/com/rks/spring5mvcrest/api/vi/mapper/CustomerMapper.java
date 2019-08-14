package com.rks.spring5mvcrest.api.vi.mapper;

import com.rks.spring5mvcrest.api.vi.model.CustomerDTO;
import com.rks.spring5mvcrest.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDTO customerToCustomerDTO(Customer customer);
}