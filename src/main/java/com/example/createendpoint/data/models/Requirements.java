package com.example.createendpoint.data.models;

public class Requirements {
    private String slackName;
    private String currentDay;
    private String currentTime;
    private String track;
    private String gitHubFileUrl;
    private String gitHubRepoUrl;
    private int statusCode;

    public void setSlackName(String slackName) {
        this.slackName = slackName;
    }

    public void setCurrentDay(String currentDay) {
        this.currentDay = currentDay;
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public void setGitHubFileUrl(String gitHubFileUrl) {
        this.gitHubFileUrl = gitHubFileUrl;
    }

    public void setGitHubRepoUrl(String gitHubRepoUrl) {
        this.gitHubRepoUrl = gitHubRepoUrl;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}
