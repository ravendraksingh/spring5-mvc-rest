package com.rks.spring5mvcrest.services;

import com.rks.spring5mvcrest.api.vi.model.CustomerDTO;

import java.util.List;

public interface CustomerService {

    List<CustomerDTO> getAllCustomers();

    CustomerDTO getCustomerById(Long id);
}
