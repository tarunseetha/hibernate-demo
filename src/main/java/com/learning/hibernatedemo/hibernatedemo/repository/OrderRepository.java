package com.learning.hibernatedemo.hibernatedemo.repository;

import com.learning.hibernatedemo.hibernatedemo.dto.FormattedOrderResponse;
import com.learning.hibernatedemo.hibernatedemo.entity.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<Customer, Integer> {

    @Query("select new com.learning.hibernatedemo.hibernatedemo.dto.FormattedOrderResponse(c.name, p.name) from Customer c JOIN c.products p")
    List<FormattedOrderResponse> getRecordsUsingJoin();
}
