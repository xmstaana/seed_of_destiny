package aaci.controllers;

import com.fasterxml.jackson.annotation.JsonTypeId;

import javax.persistence.*;

/**
 * Created by Nico on 4/10/17.
 */
@Entity
@Table(name = "MEETING_INFO")
public class MeetingInfo {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer Id;

    @Column(name = "CLIENT_ID")
    String clientId;

    @Column(name = "MEETING_ID")
    String meetingId;

    @Column(name = "PURPOSE")
    String meetingPurpose;

    @Column(name = "NOTES")
    String meetingNotes;

    @Column(name = "MEETING_DATE")
    String meetingDate;

    public String getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingDate(String meetingDate) {
        this.meetingDate = meetingDate;
    }

    public MeetingInfo(){}

    public MeetingInfo(String meetingId, String meetingPurpose, String meetingNotes) {
        this.meetingId = meetingId;
        this.meetingPurpose = meetingPurpose;
        this.meetingNotes = meetingNotes;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
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

    public String getMeetingPurpose() {
        return meetingPurpose;
    }

    public void setMeetingPurpose(String meetingPurpose) {
        this.meetingPurpose = meetingPurpose;
    }

    public String getMeetingNotes() {
        return meetingNotes;
    }

    public void setMeetingNotes(String meetingNotes) {
        this.meetingNotes = meetingNotes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MeetingInfo that = (MeetingInfo) o;

        if (Id != null ? !Id.equals(that.Id) : that.Id != null) return false;
        if (meetingId != null ? !meetingId.equals(that.meetingId) : that.meetingId != null) return false;
        if (meetingPurpose != null ? !meetingPurpose.equals(that.meetingPurpose) : that.meetingPurpose != null)
            return false;
        return meetingNotes != null ? meetingNotes.equals(that.meetingNotes) : that.meetingNotes == null;

    }

    @Override
    public int hashCode() {
        int result = Id != null ? Id.hashCode() : 0;
        result = 31 * result + (meetingId != null ? meetingId.hashCode() : 0);
        result = 31 * result + (meetingPurpose != null ? meetingPurpose.hashCode() : 0);
        result = 31 * result + (meetingNotes != null ? meetingNotes.hashCode() : 0);
        return result;
    }
}
