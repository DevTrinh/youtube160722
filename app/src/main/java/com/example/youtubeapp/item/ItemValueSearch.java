package com.example.youtubeapp.item;

import java.io.Serializable;

public class ItemValueSearch implements Serializable {
    private String idVideo;
    private String idListVideo;
    private String channelId;
    private String numberSubscribe;
    private String timeUp;
    private String urlAvtChannel;
    private String titleVideo;
    private String descriptionVideo;
    private String urlImage;
    private String channelTitle;
    private String viewCount;
    private String commentCount;
    private String kind;
    private String numberVideoList;

    public String getIdListVideo() {
        return idListVideo;
    }

    public void setIdListVideo(String idListVideo) {
        this.idListVideo = idListVideo;
    }


    public String getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(String commentCount) {
        this.commentCount = commentCount;
    }

    public String getNumberSubscribe() {
        return numberSubscribe;
    }

    public void setNumberSubscribe(String numberSubscribe) {
        this.numberSubscribe = numberSubscribe;
    }

    public String getUrlAvtChannel() {
        return urlAvtChannel;
    }

    public void setUrlAvtChannel(String urlAvtChannel) {
        this.urlAvtChannel = urlAvtChannel;
    }

    public String getIdVideo() {
        return idVideo;
    }

    public void setIdVideo(String idVideo) {
        this.idVideo = idVideo;
    }

    public String getTimeUp() {
        return timeUp;
    }

    public void setTimeUp(String timeUp) {
        this.timeUp = timeUp;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getTitle() {
        return titleVideo;
    }

    public void setTitleVideo(String titleVideo) {
        this.titleVideo = titleVideo;
    }

    public String getDescriptionVideo() {
        return descriptionVideo;
    }

    public void setDescriptionVideo(String descriptionVideo) {
        this.descriptionVideo = descriptionVideo;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getChannelTitle() {
        return channelTitle;
    }

    public void setChannelTitle(String channelTitle) {
        this.channelTitle = channelTitle;
    }

    public String getViewCount() {
        return viewCount;
    }

    public void setViewCount(String viewCount) {
        this.viewCount = viewCount;
    }

    public ItemValueSearch(String kind, String idVideo,
                           String timeUp, String channelId,
                           String titleVideo, String descriptionVideo,
                           String urlImage, String channelTitle,
                           String viewCount, String idListVideo) {
        this.kind = kind;
        this.idVideo = idVideo;
        this.timeUp = timeUp;
        this.channelId = channelId;
        this.titleVideo = titleVideo;
        this.descriptionVideo = descriptionVideo;
        this.urlImage = urlImage;
        this.channelTitle = channelTitle;
        this.viewCount = viewCount;
        this.idListVideo = idListVideo;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getNumberVideoList() {
        return numberVideoList;
    }

    public void setNumberVideoList(String numberVideoList) {
        this.numberVideoList = numberVideoList;
    }
}
