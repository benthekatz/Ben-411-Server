/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import org.springframework.data.repository.CrudRepository;

import hello.Address;
/**
 *
 * @author Ben
 */
public interface AddressRepository extends CrudRepository<Address, Long> {
    
}
