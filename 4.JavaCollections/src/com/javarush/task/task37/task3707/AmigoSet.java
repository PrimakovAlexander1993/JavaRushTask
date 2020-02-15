package com.javarush.task.task37.task3707;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class AmigoSet<E> extends AbstractSet<E> implements Serializable, Cloneable, Set<E> {

    private static final Object PRESENT = new Object();
    private transient HashMap<E, Object> map;

    public AmigoSet() {
        map = new HashMap<>();
    }

    public AmigoSet(Collection<? extends E> collection) {
        int capacity = Math.max(16, (int) Math.floor(collection.size() / .75f) + 1);
        map = new HashMap<>(capacity);

        for (E e : collection) {
            this.add(e);
        }
    }

    @Override
    public boolean add(Object e) {
        return null == map.put((E) e, PRESENT);
    }

    //Метод iterator должен возвращать итератор для множества ключей поля map.
    @Override
    public Iterator iterator() {
        return map.keySet().iterator();
    }

    @Override
    public int size() {
        return map.size();
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }

    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public boolean remove(Object o) {
        return null == map.remove(o);
    }

    @Override
    public Object clone() {
        try {
            AmigoSet copy = (AmigoSet)super.clone();
            copy.map = (HashMap) map.clone();
            return copy;
        }
        catch (Exception e) {
            throw new InternalError();
        }
    }
    private void writeObject(ObjectOutputStream outputStream){
        try {
            outputStream.defaultWriteObject();
            outputStream.writeInt(HashMapReflectionHelper.callHiddenMethod(map,"capacity"));
            outputStream.writeFloat(HashMapReflectionHelper.callHiddenMethod(map,"loadFactor"));
            outputStream.writeInt(map.keySet().size());
            for(E e : map.keySet()) {
                outputStream.writeObject(e);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void readObject(ObjectInputStream inputStream){
        try {
            inputStream.defaultReadObject();
            int capacity =inputStream.readInt();
            float loadFactor= inputStream.readFloat();
            map= new HashMap<>(capacity,loadFactor);
            int size = inputStream.readInt();
            for(int i = 0; i<size; i++) {
                map.put((E)inputStream.readObject(), PRESENT);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
