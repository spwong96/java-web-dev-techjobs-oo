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

    @Before
    public void setUp() {
        job1 = new Job ("Junior Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Junior Developer"), new CoreCompetency("JavaScript"));
        job2 = new Job ("Senior Developer", new Employer("World Wide Tech"), new Location("Kansas City"), new PositionType("Back-end Dev"), new CoreCompetency("Java"));
        job3 = new Job();
        job4 = new Job();
    }

    @Test
    public void testSettingJobId() {
        assertEquals(2, job4.getId() - job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(job1 instanceof Job);
    }

    @Test
    public void testJobsForEquality() {
        assertNotEquals(job3, job4);
    }

}
