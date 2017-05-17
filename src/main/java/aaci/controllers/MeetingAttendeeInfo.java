package aaci.controllers;

import javax.persistence.*;

/**
 * Created by Nico on 4/25/17.
 */
@Entity
@Table(name = "MEETING_ATTENDEE_CONN")
public class MeetingAttendeeInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer Id;

    @Column(name = "MEETING_ID")
    String meetingId;

    @Column(name = "ATTENDEE_ID")
    String attendeeId;

    public MeetingAttendeeInfo() {
    }

    public MeetingAttendeeInfo(String meetingId, String attendeeId) {
        this.meetingId = meetingId;
        this.attendeeId = attendeeId;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    public String getAttendeeId() {
        return attendeeId;
    }

    public void setAttendeeId(String attendeeId) {
        this.attendeeId = attendeeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MeetingAttendeeInfo that = (MeetingAttendeeInfo) o;

        if (Id != null ? !Id.equals(that.Id) : that.Id != null) return false;
        if (meetingId != null ? !meetingId.equals(that.meetingId) : that.meetingId != null) return false;
        return attendeeId != null ? attendeeId.equals(that.attendeeId) : that.attendeeId == null;

    }

    @Override
    public int hashCode() {
        int result = Id != null ? Id.hashCode() : 0;
        result = 31 * result + (meetingId != null ? meetingId.hashCode() : 0);
        result = 31 * result + (attendeeId != null ? attendeeId.hashCode() : 0);
        return result;
    }
}
