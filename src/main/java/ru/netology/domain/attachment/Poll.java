package ru.netology.domain.attachment;

public class Poll {
    int id;
    int placeId;
    int created;
    String question;
    int votes;
    boolean anonymity;
    boolean multiple;
    int endDate;
    boolean closed;
    boolean board;
    boolean canEdit;
    boolean canVote;
    boolean canReport;
    boolean canShare;
    int authorID;
}
