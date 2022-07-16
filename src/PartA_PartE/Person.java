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
public class Person implements Comparable<Person> {

    private int id;
    private String name;
    private String email;
    private int TelNum;

    /**
     *
     * @param id
     * @param name
     * @param email
     * @param TelNum
     */
    public Person(int id, String name, String email, int TelNum) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.TelNum = TelNum;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     */
    public int getTelNum() {
        return TelNum;
    }

    /**
     *
     * @param TelNum
     */
    public void setTelNum(int TelNum) {
        this.TelNum = TelNum;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.id;
        hash = 47 * hash + Objects.hashCode(this.name);
        hash = 47 * hash + Objects.hashCode(this.email);
        hash = 47 * hash + this.TelNum;
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
        final Person other = (Person) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.TelNum != other.TelNum) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
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
        return "Person{" + "id=" + id + ", name=" + name + ", email=" + email + ", TelNum=" + TelNum + '}';
    }

    /**
     *
     * @param p
     * @return
     */
    @Override
    public int compareTo(Person p) {
        return this.getId() - p.getId();
    }

}
