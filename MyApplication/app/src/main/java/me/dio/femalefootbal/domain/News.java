package me.dio.femalefootbal.domain;

public class News {
    private String Title;
    private String Tag;
    private String FastResume;

    public News(String title, String description, String tag) {
        Title = title;
        Tag = tag;
        this.FastResume = description;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getFastResume() {
        return FastResume;
    }

    public void setFastResume(String fastResume) {
        this.FastResume = fastResume;
    }

    public String getTag() {
        return Tag;
    }

    public void setTag(String tag) {
        Tag = tag;
    }
}
