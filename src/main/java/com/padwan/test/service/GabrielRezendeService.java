package com.padwan.test.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GabrielRezendeService {

    public List<String> skills() {
        List<String> skills = new ArrayList<>();
        skills.add("The Power of Friendship");
        skills.add("Lightsaber Mastery");
        skills.add("Survival");
        skills.add("Use the force");

        return skills;
    }
}
