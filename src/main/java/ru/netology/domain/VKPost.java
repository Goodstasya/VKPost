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
    private int ownerID;
    private int fromID;
    private int createdBy;
    private int replyOwnerID;
    private int replyPostId;
    private int friendsOnly;
    private String copyright;
    private CommentsInfo commentsInfo;
    private LikeInfo likesInfo;
    private RepostInfo repostInfo;
    private Geo geo;
    private int can_pin;
    private int can_delete;
    private int can_edit;
    private int is_pinned;
    private int marked_as_ads;
    private boolean is_favorite;
    private int postponed_id;
}




