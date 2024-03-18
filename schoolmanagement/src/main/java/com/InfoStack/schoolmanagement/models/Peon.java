package com.InfoStack.schoolmanagement.models;

import javax.persistence.*;

@Entity
@Table(name = "tbl_peon")
public class Peon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "peon_id")
    int peonId;
    @Column(name = "peon_name")
    String peonName;
    @Column(name = "peon_salary")
    int peonSalary;
    @Column(name = "peon_duty")
    String peonDuty;

    public int getPeonId() {
        return peonId;
    }

    public void setPeonId(int peonId) {

        this.peonId = peonId;
    }

    public String getPeonName() {

        return peonName;
    }

    public void setPeonName(String peonName) {

        this.peonName = peonName;
    }

    public int getPeonSalary() {

        return peonSalary;
    }

    public void setPeonSalary(int peonSalary) {

        this.peonSalary = peonSalary;
    }

    public String getPeonWork() {

        return peonDuty;
    }

    public void setPeonDuty(String peonDuty) {

        this.peonDuty = peonDuty;
    }


    public Peon(String peonName, int peonSalary, String peonDuty) {
        this.peonName = peonName;
        this.peonSalary = peonSalary;
        this.peonDuty = peonDuty;
    }

    public Peon(int peonId, String peonName, int peonSalary, String peonWork) {
        this.peonId = peonId;
        this.peonName = peonName;
        this.peonSalary = peonSalary;
        this.peonDuty = peonWork;}

    public Peon() {
    }

    public void setName(String na) {

        this.peonName = na;
    }

    public void setSalary(int i) {

        this.peonSalary = i;
    }

    public void setDuty(String na) {

        this.peonDuty = na;
    }
}
