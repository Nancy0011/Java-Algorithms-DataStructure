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
public class Address implements Comparable<Address> {

    private int id;
    private int number;
    private String Street;
    private String Suburb;
    private int postcode;
    private String State;

    /**
     *
     * @param id
     * @param number
     * @param Street
     * @param Suburb
     * @param postcode
     * @param State
     */
    public Address(int id, int number, String Street, String Suburb, int postcode, String State) {
        this.id = id;
        this.number = number;
        this.Street = Street;
        this.Suburb = Suburb;
        this.postcode = postcode;
        this.State = State;
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
    public int getNumber() {
        return number;
    }

    /**
     *
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     *
     * @return
     */
    public String getStreet() {
        return Street;
    }

    /**
     *
     * @param Street
     */
    public void setStreet(String Street) {
        this.Street = Street;
    }

    /**
     *
     * @return
     */
    public String getSuburb() {
        return Suburb;
    }

    /**
     *
     * @param Suburb
     */
    public void setSuburb(String Suburb) {
        this.Suburb = Suburb;
    }

    /**
     *
     * @return
     */
    public int getPostcode() {
        return postcode;
    }

    /**
     *
     * @param postcode
     */
    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    /**
     *
     * @return
     */
    public String getState() {
        return State;
    }

    /**
     *
     * @param State
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.id);
        hash = 59 * hash + this.number;
        hash = 59 * hash + Objects.hashCode(this.Street);
        hash = 59 * hash + Objects.hashCode(this.Suburb);
        hash = 59 * hash + this.postcode;
        hash = 59 * hash + Objects.hashCode(this.State);
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
        final Address other = (Address) obj;
        if (this.number != other.number) {
            return false;
        }
        if (this.postcode != other.postcode) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.Street, other.Street)) {
            return false;
        }
        if (!Objects.equals(this.Suburb, other.Suburb)) {
            return false;
        }
        if (!Objects.equals(this.State, other.State)) {
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
        return "Address{" + "id=" + id + ", number=" + number + ", Street=" + Street + ", Suburb=" + Suburb + ", postcode=" + postcode + ", State=" + State + '}';
    }

    /**
     *
     * @param a
     * @return
     */
    @Override
    public int compareTo(Address a) {
        return this.getId() - a.getId();
    }

}
