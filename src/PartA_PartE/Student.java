/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PartA_PartE;

import java.util.Objects;

/**
 *
 * @author 000920418
 */
public class Student extends Person {

    private String Program;
    String DateRegistered;

    /**
     *
     * @param id
     * @param name
     * @param email
     * @param TelNum
     * @param Program
     * @param DataRegistered
     */
    public Student(int id, String name, String email, int TelNum, String Program, String DataRegistered) {
        super(id, name, email, TelNum);
        this.Program = Program;
        this.DateRegistered = DateRegistered;

    }

    /**
     *
     * @return
     */
    public String getProgram() {
        return Program;
    }

    /**
     *
     * @param Program
     */
    public void setProgram(String Program) {
        this.Program = Program;
    }

    /**
     *
     * @return
     */
    public String getDateRegistered() {
        return DateRegistered;
    }

    /**
     *
     * @param DateRegistered
     */
    public void setDateRegistered(String DateRegistered) {
        this.DateRegistered = DateRegistered;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.Program);
        hash = 83 * hash + Objects.hashCode(this.DateRegistered);
        return hash;
    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (!Objects.equals(this.Program, other.Program)) {
            return false;
        }
        if (!Objects.equals(this.DateRegistered, other.DateRegistered)) {
            return false;
        }
        return true;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + " Student{" + "Program=" + Program + ", DateRegistered=" + DateRegistered + '}';

    }

}
