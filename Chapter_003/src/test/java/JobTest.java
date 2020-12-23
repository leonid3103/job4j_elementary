import comparator.*;
import org.junit.Test;
import tracker.Item;
import tracker.Tracker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;

public class JobTest {

    @Test
    public void sortNameAscendingTest() {
        List<Job> jobs = new ArrayList<Job>();
        jobs.add(new Job("impl task", 1));
        jobs.add(new Job("fix bug", 2));
        Collections.sort(jobs, new JobNameAscending());
        assertThat("fix bug", is(jobs.get(0).getName()));
    }

    @Test
    public void sortNameDescendingTest() {
        List<Job> jobs = new ArrayList<Job>();
        jobs.add(new Job("impl task", 1));
        jobs.add(new Job("fix bug", 2));
        Collections.sort(jobs, new JobNameDescending());
        assertThat("impl task", is(jobs.get(0).getName()));
    }

    @Test
    public void sortPriorityAscendingTest() {
        List<Job> jobs = new ArrayList<Job>();
        jobs.add(new Job("impl task", 1));
        jobs.add(new Job("fix bug", 2));
        Collections.sort(jobs, new JobPriorityAscending());
        assertThat(1, is(jobs.get(0).getPriority()));
    }

    @Test
    public void sortPriorityDescendingTest() {
        List<Job> jobs = new ArrayList<Job>();
        jobs.add(new Job("impl task", 1));
        jobs.add(new Job("fix bug", 2));
        Collections.sort(jobs, new JobPriorityDescending());
        assertThat(2, is(jobs.get(0).getPriority()));
    }


    @Test
    public void whenComparatorsDescending() {
        Comparator<Job> cmpNamePriority = new JobNameDescending().thenComparing(new JobPriorityDescending()
        );
        int rsl = cmpNamePriority.compare(new Job("Impl task", 0), new Job("Fix bug", 1));
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorsAscending() {
        Comparator<Job> cmpNamePriority = new JobNameAscending().thenComparing(new JobPriorityAscending()
        );
        int rsl = cmpNamePriority.compare(new Job("Impl task", 0), new Job("Fix bug", 1));
        assertThat(rsl, greaterThan(0));
    }
    }

