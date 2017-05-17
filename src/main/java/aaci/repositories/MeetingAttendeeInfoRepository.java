package aaci.repositories;

import aaci.controllers.MeetingAttendeeInfo;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Nico on 4/25/17.
 */
public interface MeetingAttendeeInfoRepository extends CrudRepository<MeetingAttendeeInfo,Long> {
}
