package com.algonquin.demo.post;

import com.algonquin.demo.user.User;

public class Post {
	private String id;
    private String postDate;
    private String detail;
    private User user;



    public Post(String id, String postDate, String detail, User user) {
        this.id = id;
        this.postDate = postDate;
        this.detail = detail;
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public String getDetail() {
        return detail;
    }   

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
