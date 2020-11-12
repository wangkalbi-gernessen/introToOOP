package collections.list;


import java.util.*;

public class MyArrayList implements List, RandomAccess {
    private static final int DEFAULT_SIZE = 10;
    private Object[] elementData;
    private int size;

    public MyArrayList() {
        // TODO: Implement Me
        elementData = new Object[DEFAULT_SIZE]; // Object[] elementData = new Object[10]
    }

    public MyArrayList(int initialCapacity) {
        if (initialCapacity >= 0) {
            elementData = new Object[initialCapacity];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        }
    }

    public MyArrayList(Collection c) {
        elementData = c.toArray();
    }

    @Override
    public int size() {
        // TODO: Implement Me
        return elementData.length;
    }

    @Override
    public boolean isEmpty() {
        // TODO: Implement Me
        if(elementData.length == 0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean contains(Object o) {
        // TODO: Implement Me
        for(int i = 0; i <= elementData.length - 1; i++){
            if(elementData[i] == o){
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        // DO NOT NEED TO IMPLEMENT
        return null;
    }

    @Override
    public Object[] toArray() {
        // TODO: Implement Me
        return elementData.clone();
    }

    @Override
    public Object[] toArray(Object[] a) {
        // DO NOT NEED TO IMPLEMENT
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        // TODO: Implement Me
        if (size == elementData.length) {
            elementData = grow(size + 1);
        }
        elementData[size] = o;
        size++;
        return true;
    }

    private Object[] grow(int minCapacity) {
        return elementData = Arrays.copyOf(elementData, minCapacity + minCapacity / 2);
    }

    @Override
    public boolean remove(Object o) {
        // TODO: Implement Me
        // find the index of Object o; (linear search)
        // shift all the elements after the index to left
        for(int i = 0; i < size; i++){
            if(elementData[i].equals(o)){
                if(i == size - 1){
                    elementData[i] = null;
                }else{
//                    elementData[i] = null;
                    elementData[i] = elementData[i + 1];
                }
                size -= 1;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        // TODO: Implement Me
        if(c.size() <= 0){
            return false;
        }else{
            int count = 0; // the number of that elementData element coincide with c element
            Object[] arr = c.toArray();
            for(int i = 0; i < size; i++){
                for(Object elem : arr){
                    if(elementData[i].equals(elem)){
                        count++;
                    }
                }
            }
            if(count >= arr.length){
                return true;
            }else{
                return false;
            }
        }
    }

    @Override
    public boolean addAll(Collection c) {
        // TODO: Implement Me
        if(c.size() <= 0){
            return false;
        }else{
            int lastIndex = elementData.length - 1;
            Object[] temp = elementData.clone();
            int len = temp.length; // length for array including added element
            Object[] arr = c.toArray();
            for (Object elem : arr) {
                len++;
                lastIndex++;
                temp[lastIndex] = elem;
            }
            if ((len - size) == arr.length) {
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public boolean addAll(int index, Collection c) {
        // TODO: Implement Me
        if(c.size() <= 0 || (index < 0 && index > c.size())){
            return false;
        }else{
            int indexForElementData = 0;
            int indexForTemp = 0;
            int count = 0; // the number of that elementData element coincide with c element
            Object[] temp = new Object[c.size() + elementData.length]; // array including added element
            int len = temp.length; // length for array including added element
            Object[] arr = c.toArray();
            while (indexForTemp < len) {
                if (indexForTemp == index) {
                    for (Object elem : arr) {
                        temp[indexForTemp] = elem;
                        indexForTemp++;
                    }
                }
                temp[indexForTemp] = elementData[indexForElementData];
                indexForTemp++;
                indexForElementData++;
            }
            if ((len - elementData.length) == arr.length) {
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public boolean removeAll(Collection c) {
        // TODO: Implement Me
        if(c.size() <= 0){
            return false;
        }else{
            Object[] arr = c.toArray();
            int count = 0;
            for(int i = 0; i <= size - 1; i++){
                for(Object elem : arr){
                    if(elementData[i].equals(elem)){
//                        elementData[i] = elementData[i + 1];
                        count++;
                    }
                }
            }
            if(count == arr.length || (count - arr.length >= 2)){
                size -= arr.length;
                return true;
            }else{
                return false;
            }
        }
    }

    @Override
    public boolean retainAll(Collection c) {
        // TODO: Implement Me
        if (c.size() <= 0) {
            return false;
        } else {
            Object[] arr  = c.toArray();
            for (int i = 0; i < size; i++) {
                for (Object elem : arr) {
                    if (elementData[i].equals(elem)) {
                        break;
                    }
                }
                remove(elementData[i]);
            }
            return true;
        }
    }

    @Override
    public void clear() {
        // TODO: Implement Me
        for (int i = 0; i < size; i++) {
            elementData[i] = null;
        }
        System.out.println(elementData);
    }

    @Override
    public Object get(int index) {
        // TODO: Implement Me
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return elementData[index];
    }

    @Override
    public Object set(int index, Object element) {
        // TODO: Implement Me
        if (index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return elementData[index] = element;
    }

    @Override
    public void add(int index, Object element) {
        // TODO: Implement Me
        Object[] arr = new Object[size];
        int indexForElementData = 0;
        int indexForArr = 0;
        while(indexForArr < size){
            if(indexForArr == index){
                arr[indexForArr] = element;
                size++;
                indexForArr++;
            }
            arr[indexForArr] = elementData[indexForElementData];
            indexForArr++;
            indexForElementData++;
        }
        System.out.println(arr);
    }

    @Override
    public Object remove(int index) {
        // TODO: Implement Me
        Object[] arr = new Object[size];
        for (int i = 0; i < size; i++){
            if(elementData[index] != elementData[i]){
                arr[i] = elementData[i];
            }
        }
        return arr;
    }

    @Override
    public int indexOf(Object o) {
        // TODO: Implement Me
        for(int i = 0; i <= elementData.length - 1; i++){
            if(o.equals(elementData[i])){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        // TODO: Implement Me
        for(int i = elementData.length - 1;  i >= 0; i--){
            if(o.equals(elementData[i])){
                return i;
            }
        }
        return -1;
    }

    @Override
    public ListIterator listIterator() {
        // DO NOT NEED TO IMPLEMENT
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        // DO NOT NEED TO IMPLEMENT
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        // TODO: Implement Me
        List<Object> list = new LinkedList<>();
        for(int i = fromIndex; i <= toIndex - 1; i++){
            list.add(elementData[i]);
        }
        return list;
    }
}