package com.example.c.search;

/**
 * Created by c on 2015/12/8.
 */
public class Item {
    private String text;
    private int imageId;
    private String xuehao;
    private String grade;
    public Item(String text,int imageId,String xuehao,String grade){
        this.text=text;
        this.imageId=imageId;
        this.xuehao=xuehao;
        this.grade=grade;
    }
    public String getText(){
        return text;
    }
    public int getImageId(){
        return imageId;
    }
    public String getXuehao(){return xuehao;}
    public String getGrade(){return grade;}
}
