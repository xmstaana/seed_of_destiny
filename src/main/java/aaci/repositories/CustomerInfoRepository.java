package aaci.repositories;

import aaci.controllers.CustomerInfo;

import org.springframework.data.repository.*;

/**
 * Created by Nico on 4/10/17.
 */
public interface CustomerInfoRepository extends CrudRepository<CustomerInfo, Long> {

}
