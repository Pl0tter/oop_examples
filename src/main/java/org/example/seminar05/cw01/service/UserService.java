package org.example.seminar05.cw01.service;

import org.example.seminar05.cw01.model.User;

public interface UserService {
     void save(User user);
     boolean credit(User user, int creditSum);
}
