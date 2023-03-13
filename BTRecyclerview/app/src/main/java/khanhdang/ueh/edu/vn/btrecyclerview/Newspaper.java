package khanhdang.ueh.edu.vn.btrecyclerview;

import java.io.Serializable;

public class Newspaper implements Serializable {
    private String title;
    private String content1;
    private String content2;
    private  String image;

    public String getTitle() {
        return title;
    }

    public String getContent1() {
        return content1;
    }

    public String getContent2() {
        return content2;
    }

    public String getImage() {
        return image;
    }

    public Newspaper(String title, String content1, String content2, String image) {
        this.title = title;
        this.content1 = content1;
        this.content2 = content2;
        this.image = image;
    }
}
