package aaci.controllers;

/**
 * Created by Nico on 3/8/17.
 */
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import aaci.Greetings;
import aaci.repositories.*;
import io.swagger.annotations.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.RequestWrapper;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";


    private final AtomicLong counter = new AtomicLong();


    @Autowired
    private CustomerInfoRepository custInfoRep;

    @Autowired
    private ContactInfoRepository contInfoRep;

    @Autowired
    private ActivityInfoRepository actInfoRep;

    @Autowired
    private MeetingInfoRepository meetInfoRep;

    @Autowired
    private ActionPlanInfoRepository actionPlanInfoRepository;

    @Autowired
    private DropDownMenuRepository dropDownMenuRepository;

    @Autowired
    private MeetingActionPlanConnectionRepository meetingActionPlanConnectionRepository;

    @Autowired
    private MeetingAttendeeInfoRepository meetingAttendeeInfoRepository;

    @Autowired
    private UserInfoRepository userInfoRepository;


    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public Greetings greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greetings(counter.incrementAndGet(),
                String.format(template, name));
    }


    @RequestMapping(value = "/getAllClientInfo", method = RequestMethod.GET)
    public Iterable<CustomerInfo> getCustInfo() {

            return custInfoRep.findAll();

    }

    @RequestMapping(value = "/getAllContactInfo", method = RequestMethod.GET)
    public Iterable<ContactInfo> getContactInfo() {

        return contInfoRep.findAll();

    }

    @RequestMapping(value = "/getAllActivityInfo", method = RequestMethod.GET)
    public Iterable<ActivityInfo> getAllActivityInfo() {

        return actInfoRep.findAll();

    }

    @RequestMapping(value = "/getAllMeetingInfo", method = RequestMethod.GET)
    public Iterable<MeetingInfo> getAllMeetingInfo() {

        return meetInfoRep.findAll();

    }

    @RequestMapping(value = "/getAllActionPlan", method = RequestMethod.GET)
    public Iterable<ActionPlanInfo> getAllActionPlanInfo() {

        return actionPlanInfoRepository.findAll();

    }

    @RequestMapping(value = "/getAllUserInfo", method = RequestMethod.GET)
    public Iterable<UserInfo> getAllUserInfo() {

        return userInfoRepository.findAll();

    }



    @RequestMapping(value = "/getAllMeetingAP", method = RequestMethod.GET)
    public Iterable<MeetingActionPlanConnection> getAllMeetingAP() {

        return meetingActionPlanConnectionRepository.findAll();

    }

    @RequestMapping(value = "/getAllMeetingAttendee", method = RequestMethod.GET)
    public Iterable<MeetingAttendeeInfo> getAllMeetingAttendee() {

        return meetingAttendeeInfoRepository.findAll();

    }

    @RequestMapping(value = "/insertClientInfo", method = RequestMethod.POST)
    public ResponseEntity<CustomerInfo> insertClientInfo(@RequestBody CustomerInfo info ){

        if(info != null) {
            custInfoRep.save(info);
        }
        return new ResponseEntity<CustomerInfo>(info, HttpStatus.OK);
    }

    @RequestMapping(value = "/insertContactInfo", method = RequestMethod.POST)
    public ResponseEntity<ContactInfo> insertContactInfo(@RequestBody ContactInfo info ){

        if(info != null) {
            contInfoRep.save(info);
        }
        return new ResponseEntity<ContactInfo>(info, HttpStatus.OK);
    }

    @RequestMapping(value = "/insertActivityInfo", method = RequestMethod.POST)
    public ResponseEntity<ActivityInfo> insertActivityInfo(@RequestBody ActivityInfo info ){

        if(info != null) {
            actInfoRep.save(info);
        }
        return new ResponseEntity<ActivityInfo>(info, HttpStatus.OK);
    }

    @RequestMapping(value = "/insertMeetingInfo", method = RequestMethod.POST)
    public ResponseEntity<MeetingInfo> insertMeetingInfo(@RequestBody MeetingInfo info ){

        if(info != null) {
            meetInfoRep.save(info);
        }
        return new ResponseEntity<MeetingInfo>(info, HttpStatus.OK);
    }

    @RequestMapping(value = "/insertActionPlanInfo", method = RequestMethod.POST)
    public ResponseEntity<List<ActionPlanInfo>> insertActionPlanInfo(@RequestBody List<ActionPlanInfo> info ){

        if(info != null) {

            System.out.println(info);
            for(int i = 0; i < info.size(); i++) {
                actionPlanInfoRepository.save(info.get(i));
            }
        }

        return new ResponseEntity<List<ActionPlanInfo>>(info, HttpStatus.OK);
    }

    @RequestMapping(value = "/getAllDropDownMenu", method = RequestMethod.GET)
    public Iterable<DropDownMenu> getAllDropDownMenu() {

        return dropDownMenuRepository.findAll();

    }

    @RequestMapping(value = "/insertDropDownMenu", method = RequestMethod.POST)
    public ResponseEntity<List<DropDownMenu>> insertDropDownMenu(@RequestBody List<DropDownMenu> info ){

        if(info != null) {

            dropDownMenuRepository.deleteByIdDropdown(info.get(0).getIdDropdown());
            System.out.println(info);
            for(int i = 0; i < info.size(); i++) {
                System.out.println(info.get(i).getDescription());
                dropDownMenuRepository.save(info.get(i));
            }
        }
        return new ResponseEntity<List<DropDownMenu>>(info, HttpStatus.OK);
    }

    @RequestMapping(value = "/insertMeetingAP", method = RequestMethod.POST)
    public ResponseEntity<MeetingActionPlanConnection> insertMeetingAP(@RequestBody MeetingActionPlanConnection info ){

        if(info != null) {
            meetingActionPlanConnectionRepository.save(info);
        }
        return new ResponseEntity<MeetingActionPlanConnection>(info, HttpStatus.OK);
    }

    @RequestMapping(value = "/insertMeetingAttendee", method = RequestMethod.POST)
    public ResponseEntity<List<MeetingAttendeeInfo>> insertMeetingAttendee(@RequestBody List<MeetingAttendeeInfo> info ){

        if(info != null) {
            for(int i = 0 ; i < info.size(); i++)
            meetingAttendeeInfoRepository.save(info.get(i));
        }
        return new ResponseEntity<List<MeetingAttendeeInfo>>(info, HttpStatus.OK);
    }

    @RequestMapping(value = "/updatePassword", method = RequestMethod.POST)
    public ResponseEntity<UserInfo> updatePassword(@RequestBody UserInfo info ){

        if(info != null) {
            userInfoRepository.save(info);
        }
        return new ResponseEntity<UserInfo>(info, HttpStatus.OK);
    }


}
