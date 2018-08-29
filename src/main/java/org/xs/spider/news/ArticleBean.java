package org.xs.spider.news;

/**
 * @Project:org.xs.spider
 * @PackageName:org.xs.spider.news
 * @Author:null z
 * @DateTime:2018/8/29 21:00.
 */
public class ArticleBean {


    /**
     *
     */
    private static final long serialVersionUID = 370831686575591288L;

    private String title="";

    private String content="";

    private String date="";

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
