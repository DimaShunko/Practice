package TaskSeven;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestList {

    public TestList() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
    }

    private List<Integer> list = new ArrayList<>();

    @Test
    public void sizeTest() {
        int size = list.size();
        assertEquals(4, size);
    }

    @Test
    public void addTest() {
        List<Integer> list1 = list;
        list1.add(5);
        Object[] list3 = list.toArray();
        Object[] list2 = {1, 2, 3, 4, 5};
        assertArrayEquals(list2, list3);
    }

    @Test
    public void add2Test() {
        List<Integer> list1 = list;
        list1.add(0,5);
        Object[] list3 = list.toArray();
        Object[] list2 = {5,1, 2, 3, 4};
        assertArrayEquals(list2, list3);
    }

    @Test
    public void addAllTest() {
        List<Integer> list2 = new ArrayList<>();
        list2 .addAll(list);
        assertEquals(list, list2 );
    }

    @Test
    public void getTest() {
        Integer get = list.get(0);

        assertEquals(1, get);
    }

    @Test
    public void indexOfTest() {
        List<Integer> list2 = list;
        int i = list2.indexOf(3);
        assertEquals(2, i);
    }

    @Test
    public void lastIndexOfTest() {
        List<Integer> list2 = list;
        list2.add(1);
        int ind = list2.lastIndexOf(1);
        assertEquals(4, ind);
    }

    @Test
    public void clearTest() {
        List<Integer> list2 = new ArrayList<>();
        list.clear();
        assertEquals(list2, list);
    }

    @Test
    public void containsTest() {
        boolean contain1 = list.contains(2);
        assertTrue(contain1);

        boolean contain2 = list.contains(25);
        assertFalse(contain2);
    }

    @Test
    public void isEmptyTest() {
        boolean isEmpty = list.isEmpty();
        assertFalse(isEmpty);
    }

    @Test
    public void removeTest() {
        list.remove(0);
        Object[] list1 = list.toArray();
        Object[] list2 = {2,3,4};
        assertArrayEquals(list2, list1);
    }

    @Test
    public void removeAllTest() {
        List<Integer> list2 = list;
        list2.removeAll(list);
        boolean isEmpty = list2.isEmpty();
        assertTrue(isEmpty);
    }

    @Test
    public void setTest() {
        List<Integer> list2 = list;
        list2.set(0, 2);
        Integer i = list2.get(0);
        assertEquals(2, i);

    }

    @Test
    public void toArrayTest() {
        Object[] list1 = list.toArray();
        Object[] list2 = {1, 2, 3, 4};

        assertArrayEquals(list2, list1);
    }

    @Test
    public void equalsTest() {
        List<Integer> list1 = list;
        boolean equals = list.equals(list1);

        assertTrue(equals);
    }

    @Test
    public void retainAllTest() {
        List<Integer> list1 = new ArrayList<>();
        list1.addAll(list);
        list1.retainAll(list);
        assertEquals(list, list1);
    }
}