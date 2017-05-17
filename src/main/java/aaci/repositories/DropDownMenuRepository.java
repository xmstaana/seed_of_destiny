package aaci.repositories;

import aaci.controllers.DropDownMenu;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Nico on 4/12/17.
 */
public interface DropDownMenuRepository extends CrudRepository<DropDownMenu,Long> {

//    @Query("delete from DropDownMenu d where d.idDropdown = :idDropdown")
//    public void deleteFromDropDownMenu(@Param("idDropdown") String idDropDown);

    @Transactional
    Long deleteByIdDropdown(String idDropdown);

}
