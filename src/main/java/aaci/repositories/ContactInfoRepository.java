package aaci.repositories;

import aaci.controllers.ContactInfo;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Nico on 4/10/17.
 */
public interface ContactInfoRepository extends CrudRepository<ContactInfo, Long> {

}
