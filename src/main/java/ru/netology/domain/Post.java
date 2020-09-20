package ru.netology.domain;

import java.util.Date;

public class Post {
    private int postId;
    private int authorId; //from_id
    private int placeId; // owner_id
    private Date date;
    private String postText;
    private LikesInfo likes;
    private int viewsCount;
    private boolean isPined;
    private String[] attach;
    private String postType;

    //недостающие
    int replyOwnerId;
    int replyPostId;
    int friendsOnly;
    CommentsInfo comments;
    RepostsInfo reposts;
    PostSource postSource;
    Geo geo;
    int signerId;
    boolean canPin;
    boolean canDelete;
    boolean canEdit;
    boolean markerAsAds;
    boolean isFavorite;
    int postPonedId;
}
