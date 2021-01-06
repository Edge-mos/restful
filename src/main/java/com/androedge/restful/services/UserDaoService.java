package com.androedge.restful.services;

import com.androedge.restful.exceptions.UserNotFoundException;
import com.androedge.restful.models.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static int usersCount = 3;

    static {
        users.add(new User(1, "Adam", new Date()));
        users.add(new User(2, "Eve", new Date()));
        users.add(new User(3, "Jack", new Date()));
    }

    public List<User> findAll() {
        return new ArrayList<>(users);
    }

    public User save (User user) {
        if (user.getId() == null) {
            user.setId(++usersCount);
        }
        users.add(user);
        return user;
    }

    public User findOne(int id) {
        return users
                .stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElseThrow(() -> new UserNotFoundException(String.format("User with id: %d not found!", id)));
    }

    public User deleteById(int id) {
        final Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            final User user = iterator.next();
            if (user.getId() == id) {
                iterator.remove();
                return user;
            }
        }
        throw new UserNotFoundException(String.format("User with id: %d not found!", id));
    }
}
