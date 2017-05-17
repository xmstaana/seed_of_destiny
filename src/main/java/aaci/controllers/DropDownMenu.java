package aaci.controllers;

import javax.persistence.*;

/**
 * Created by Nico on 4/12/17.
 */
@Entity
@Table(name = "DROPDOWN_MENU")
public class DropDownMenu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    @Column(name = "ID_DROPDOWN")
    String idDropdown;

    @Column(name = "DESCRIPTION")
    String description;

    public DropDownMenu(){

    }

    public DropDownMenu(String idDropdown, String description) {
        this.idDropdown = idDropdown;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdDropdown() {
        return idDropdown;
    }

    public void setIdDropdown(String idDropdown) {
        this.idDropdown = idDropdown;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DropDownMenu that = (DropDownMenu) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (idDropdown != null ? !idDropdown.equals(that.idDropdown) : that.idDropdown != null) return false;
        return description != null ? description.equals(that.description) : that.description == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (idDropdown != null ? idDropdown.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
