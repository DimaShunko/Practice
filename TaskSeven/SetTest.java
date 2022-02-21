package TaskSeven;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {

    public SetTest() {
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
    }

    private Set<Integer> set = new HashSet<>();

    @Test
    public void sizeTest() {
        int size = set.size();
        assertEquals(4, size);
    }

    @Test
    public void addTest() {
        Set<Integer> set1 = set;
        boolean a = set1.add(5);
        assertTrue(a);
    }

    @Test
    public void addAllTest() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.addAll(set);
        assertEquals(set, set1);
    }

    @Test
    public void clearTest() {
        Set<Integer> set1 = new HashSet<>();
        set.clear();
        assertEquals(set1, set);
    }

    @Test
    public void containsTest() {
        boolean contain1 = set.contains(2);
        assertTrue(contain1);

        boolean contain2 = set.contains(25);
        assertFalse(contain2);
    }

    @Test
    public void containsAllTest() {
        Set<Integer> set1 = new HashSet<>();
        set1.addAll(set);
        set1.add(5);
        boolean contain1 = set1.containsAll(set);
        assertTrue(contain1);
        Set<Integer> set2 = new HashSet<>();
        set2.add(5);
        boolean contain2 = set2.contains(set);
        assertFalse(contain2);
    }

    @Test
    public void isEmptyTest() {
        boolean isEmpty = set.isEmpty();
        assertFalse(isEmpty);
    }

    @Test
    public void removeTest() {
        set.remove(1);
        Object[] set1 = set.toArray();
        Object[] set2 = {2,3,4};
        assertArrayEquals(set2, set1);
    }

    @Test
    public void removeAllTest() {
        Set<Integer> set1 = set;
        set1.removeAll(set);
        boolean isEmpty = set1.isEmpty();
        assertTrue(isEmpty);
    }

    @Test
    public void toArrayTest() {
        Object[] list1 = set.toArray();
        Object[] list2 = {1, 2, 3, 4};

        assertArrayEquals(list2, list1);
    }

    @Test
    public void equalsTest() {
        Set<Integer> set1 = set;
        boolean equals = set.equals(set1);
        assertTrue(equals);
    }

    @Test
    public void retainAllTest() {
        Set<Integer> set1 = new HashSet<>();
        set1.addAll(set);
        set1.add(5);
        set1.retainAll(set);
        assertEquals(set, set1);
    }
}