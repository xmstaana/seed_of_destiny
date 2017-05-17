package aaci.repositories;

import aaci.controllers.UserInfo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Nico on 5/4/17.
 */
public interface UserInfoRepository extends CrudRepository<UserInfo,Long> {

    public List<UserInfo> findByUsername (String username);



}
