package com.example.zyd.zuoye;

/**
 * Created by zhuyadong on 17/5/8.
 */

public class Person {
//    "id":299080,
//            "oid":288342,
//            "category":"article",
//            "data":{
//        "subject":"视频直播：习近平马英九会面",
//                "summary":"两岸领导人习近平、马英九在新加坡会面",
//                "cover":"/Attachs/Article/288342/56a263bcab4a4c55b0bef0528ce880b6_padmini.JPG",
//                "pic":"",
//                "format":"video",
//                "changed":"2015-
    private int id;
    private String oid;
    private String category;

    private String data;
    private String subject;
    private String summary;
    private String cover;
    private String pic;
    private String format;
    private String changed;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getChanged() {
        return changed;
    }

    public void setChanged(String changed) {
        this.changed = changed;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", oid='" + oid + '\'' +
                ", category='" + category + '\'' +
                ", data='" + data + '\'' +
                ", subject='" + subject + '\'' +
                ", summary='" + summary + '\'' +
                ", cover='" + cover + '\'' +
                ", pic='" + pic + '\'' +
                ", format='" + format + '\'' +
                ", changed='" + changed + '\'' +
                '}';
    }
}
