package com.devfest.its.its_devfest.models;

import com.google.firebase.database.Exclude;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by schhaiderahmed on 26/11/16.
 */

public class Post implements Serializable {



    public String uid;
    public String author;
    public String title;
    public String body;
    public int starCount = 0;


    public Map<String, Boolean> stars = new HashMap<>();


    public Post() {


    }


    public Post(String uid, String author, String title, String body) {
        this.uid = uid;
        this.author = author;
        this.title = title;
        this.body = body;
    }


    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("uid", uid);
        result.put("author", author);
        result.put("title", title);
        result.put("body", body);
        result.put("starCount", starCount);
        result.put("stars", stars);


        return result;
    }
}

