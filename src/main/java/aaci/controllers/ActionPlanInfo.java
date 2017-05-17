package aaci.controllers;

import javax.persistence.*;

/**
 * Created by Nico on 4/11/17.
 */
@Entity
@Table(name = "ACTION_PLAN")
public class ActionPlanInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    @Column(name = "ID_ACTION_ITEM")
    String idActionItem;

    @Column(name = "ID_MEETING")
    String idMeeting;

    @Column(name = "ACTION_PLAN")
    String actionPlan;

    @Column(name = "ASSIGNED_USER")
    String assignedUser;

    @Column(name = "DEADLINE")
    String deadline;

    @Column(name = "IS_COMPLETED")
    String isCompleted;

    public ActionPlanInfo(){

    }

    public ActionPlanInfo(String idActionItem, String actionPlan, String assignedUser, String deadline, String isCompleted) {
        this.idActionItem = idActionItem;
        this.actionPlan = actionPlan;
        this.assignedUser = assignedUser;
        this.deadline = deadline;
        this.isCompleted = isCompleted;
    }

    public String getIdMeeting() {
        return idMeeting;
    }

    public void setIdMeeting(String idMeeting) {
        this.idMeeting = idMeeting;
    }

    public String getIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(String isCompleted) {
        this.isCompleted = isCompleted;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdActionItem() {
        return idActionItem;
    }

    public void setIdActionItem(String idActionItem) {
        this.idActionItem = idActionItem;
    }

    public String getActionPlan() {
        return actionPlan;
    }

    public void setActionPlan(String actionPlan) {
        this.actionPlan = actionPlan;
    }

    public String getAssignedUser() {
        return assignedUser;
    }

    public void setAssignedUser(String assignedUser) {
        this.assignedUser = assignedUser;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ActionPlanInfo that = (ActionPlanInfo) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (idActionItem != null ? !idActionItem.equals(that.idActionItem) : that.idActionItem != null) return false;
        if (actionPlan != null ? !actionPlan.equals(that.actionPlan) : that.actionPlan != null) return false;
        if (assignedUser != null ? !assignedUser.equals(that.assignedUser) : that.assignedUser != null) return false;
        if (deadline != null ? !deadline.equals(that.deadline) : that.deadline != null) return false;
        return isCompleted != null ? isCompleted.equals(that.isCompleted) : that.isCompleted == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (idActionItem != null ? idActionItem.hashCode() : 0);
        result = 31 * result + (actionPlan != null ? actionPlan.hashCode() : 0);
        result = 31 * result + (assignedUser != null ? assignedUser.hashCode() : 0);
        result = 31 * result + (deadline != null ? deadline.hashCode() : 0);
        result = 31 * result + (isCompleted != null ? isCompleted.hashCode() : 0);
        return result;
    }
}
