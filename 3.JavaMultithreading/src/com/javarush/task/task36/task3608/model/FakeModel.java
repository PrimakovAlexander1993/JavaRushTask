package com.javarush.task.task36.task3608.model;

/*
6. В интерфейсе Model должен быть объявлен метод void loadUsers().
7. Метод void loadUsers() в классе FakeModel должен инициализировать список пользователей в объекте modelData любыми данными.
 */

import com.javarush.task.task36.task3608.bean.User;

import java.util.ArrayList;
import java.util.List;

public class FakeModel implements Model {
    @Override
    public void deleteUserById(long id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void changeUserData(String name, long id, int level) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void loadDeletedUsers() {
        throw new UnsupportedOperationException();
    }

    private ModelData modelData = new ModelData();

    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void loadUserById(long userId) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void loadUsers() {
        List<User> list = new ArrayList<>();
        list.add(new User("A",1,1));
        list.add(new User("B",2,1));
        modelData.setUsers(list);
    }
}
