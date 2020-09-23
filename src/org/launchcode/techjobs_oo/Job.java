package org.launchcode.techjobs_oo;

import java.util.Objects;
import static java.util.Objects.isNull;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String aName, Employer aEmployer, Location aLocation, PositionType aPosition, CoreCompetency aCompetency) {
        this();
        this.name = aName;
        this.employer = aEmployer;
        this.location = aLocation;
        this.positionType = aPosition;
        this.coreCompetency = aCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }


    @Override
    public String toString() {
        String unavailable = "Data not available";

        String idString = "\nID: " + this.id;
        String nameString = this.name;
        Object employerString = this.employer;
        Object locationString = this.location;
        Object positionString = this.positionType;
        Object competencyString = this.coreCompetency;


        if (nameString.equals("")){
            nameString = "\nName: " + unavailable;
        } else {
            nameString = "\nName: " + this.name;
        }

        if (employerString.toString().length() < 1){
            employerString = "\nEmployer: " + unavailable;
        } else {
            employerString = "\nEmployer: " + this.employer;
        }

        if (locationString.toString().length() < 1){
            locationString = "\nLocation: " + unavailable;
        } else {
            locationString = "\nLocation: " + this.location;
        }

        if (positionString.toString().length() < 1){
            positionString = "\nPosition Type: " + unavailable;
        } else {
            positionString = "\nPosition Type: " + this.positionType;
        }

        if (competencyString.toString().length() < 1){
            competencyString = "\nCore Competency: " + unavailable + "\n";
        } else {
            competencyString = "\nCore Competency: " + this.coreCompetency + "\n";
        }

        return idString + nameString + employerString + locationString + positionString + competencyString;
    }
}
