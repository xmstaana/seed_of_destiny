package aaci.controllers;

import javax.persistence.*;

/**
 * Created by Nico on 4/25/17.
 */
@Entity
@Table(name = "MEETING_AP_CONN")
public class MeetingActionPlanConnection {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    @Column(name = "MEETING_ID")
    String meetingId;

    @Column(name = "ACTION_PLAN_ID")
    String actionPlanId;

    public MeetingActionPlanConnection(){

    }

    public MeetingActionPlanConnection(String meetingId, String actionPlanId) {
        this.meetingId = meetingId;
        this.actionPlanId = actionPlanId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    public String getActionPlanId() {
        return actionPlanId;
    }

    public void setActionPlanId(String actionPlanId) {
        this.actionPlanId = actionPlanId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MeetingActionPlanConnection that = (MeetingActionPlanConnection) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (meetingId != null ? !meetingId.equals(that.meetingId) : that.meetingId != null) return false;
        return actionPlanId != null ? actionPlanId.equals(that.actionPlanId) : that.actionPlanId == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (meetingId != null ? meetingId.hashCode() : 0);
        result = 31 * result + (actionPlanId != null ? actionPlanId.hashCode() : 0);
        return result;
    }
}
