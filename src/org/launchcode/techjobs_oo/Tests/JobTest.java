package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    private Job job1;
    private Job job2;
    private Job job3;
    private Job job4;
    private Job job6;
    private Job job7;

    @Before
    public void setUp() {
        job1 = new Job ("Junior Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end Dev"), new CoreCompetency("JavaScript"));
        job2 = new Job ("Senior Developer", new Employer("World Wide Tech"), new Location("Kansas City"), new PositionType("Back-end Dev"), new CoreCompetency("Java"));
        job3 = new Job();
        job4 = new Job();
        job6 = new Job("", new Employer("Walmart"),new Location(""),new PositionType("Cashier"),new CoreCompetency("idk"));
        job7 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
    }

    @Test
    public void testSettingJobId() {
        assertEquals(2, job4.getId() - job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertNotNull(job1);
    }

    @Test
    public void testJobsForEquality() {
        assertNotEquals(job3, job4);
    }

    @Test
    public void testJobToString() {
        Job job5 = new Job("_______", new Employer("_______"),new Location("_______"),new PositionType("_______"),new CoreCompetency("_______"));

        assertEquals(job5.toString(), "\nID: " + job5.getId() +
                "\nName: " + job5.getName() +
                "\nEmployer: " + job5.getEmployer() +
                "\nLocation: " + job5.getLocation() +
                "\nPosition Type: " + job5.getPositionType() +
                "\nCore Competency: " + job5.getCoreCompetency() + "\n");
    }

    @Test
    public void testEmptyData() {
//        System.out.println(job6.getLocation());
        assertEquals("\nID: " + job6.getId() +
                "\nName: Data not available" +
                "\nEmployer: " + job6.getEmployer() +
                "\nLocation: Data not available" +
                "\nPosition Type: " + job6.getPositionType() +
                "\nCore Competency: " + job6.getCoreCompetency() + "\n", job6.toString());
    }

    @Test
    public void testAllSetValuesNotAvailable() {
        assertEquals(job7.toString(), "\nID: " + job7.getId() + "\nName: Data not available\nEmployer: Data not available\nLocation: Data not available\nPosition Type: Data not available\nCore Competency: Data not available\n");
    }

}
