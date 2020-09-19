package ru.netology.domain;

import java.util.Date;

public class Post {
    private int postId;
    private int authorId;
    private int placeId;
    private Date date;
    private String postText;
    private int commentsCount;
    private LikesInfo likes;
    private int viewsCount;
    private int repostsCount;
    private boolean isPined;
    private String[] attach;
    private String postType;
}
