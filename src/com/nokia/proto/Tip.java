package com.nokia.proto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Tip {
    private int _id;
    private String category;
    private String topic;
    private String rule;
    private String title;
    private String description;
    private String example;

    public Tip() {}

    public int getId(){ return _id; }
    public void setId(int id){ this._id = id; }

    public String getCategory(){ return category; }
    public void setCategory(String category){ this.category = category; }

    public String getTopic(){ return topic; }
    public void setTopic(String topic){ this.topic = topic; }

    public String getRule(){ return rule; }
    public void setRule(String rule){ this.rule = rule; }

    public String getTitle(){ return title; }
    public void setTitle(String title){ this.title = title; }

    public String getDescription(){ return description; }
    public void setDescription(String description){ this.description = description; }

    public String getExample(){ return example; }
    public void setExample(String example){ this.example = example; }
}
