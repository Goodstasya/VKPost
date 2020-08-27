package ru.netology.domain;

import java.sql.Time;
import java.util.Date;

public class VKPost {
    private long id;
    private String createdUser;
    private String logoURL;
    private String name;
    private Date date;
    private Time time;
    private String imageUrl;
    private String postLinkUrl;
    private boolean isFavourite;
    private boolean isLikedByMe;
    private String likedList;
    private String commentsXML;
    private int repostedCount;
    private int viewedCount;
}

