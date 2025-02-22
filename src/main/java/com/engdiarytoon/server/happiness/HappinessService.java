package com.engdiarytoon.server.happiness;

import com.engdiarytoon.server.user.User;

import java.util.List;
import java.util.Optional;

public interface HappinessService {

    Happiness recordHappiness(User user, float value);

    Happiness updateHappiness(User user, float value);

    Optional<Happiness> getTodayHappiness(User user);

    void deleteTodayHappiness(User user);
    List<Happiness> getHappinessForMonth(User user, int year, int month);
}