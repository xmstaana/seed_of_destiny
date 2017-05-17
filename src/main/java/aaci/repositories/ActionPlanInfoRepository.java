package aaci.repositories;

import aaci.controllers.ActionPlanInfo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Nico on 4/11/17.
 */
public interface ActionPlanInfoRepository extends CrudRepository<ActionPlanInfo,Long> {


    public ActionPlanInfo findByIdActionItem(String idActionItem);


}
