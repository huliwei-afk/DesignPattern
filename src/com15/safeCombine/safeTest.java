package com15.safeCombine;

public class safeTest {
    public static void main(String[] args) {
        //依赖具体的实现类Column
        Column root = new Column("网站页面");

        Column music = new Column("音乐");
        Column video = new Column("视屏");
        PageElement ad = new Content("广告");
        root.addPageElement(music);
        root.addPageElement(video);
        root.addPageElement(ad);

        Column chineseMusic = new Column("国语");
        Column cantoneseMusic = new Column("粤语");
        music.addPageElement(chineseMusic);
        music.addPageElement(cantoneseMusic);

        chineseMusic.addPageElement(new Content("十年.mp3"));
        cantoneseMusic.addPageElement(new Content("明年今日.mp3"));

        video.addPageElement(new Content("唐伯虎点秋香.avi"));

        root.print("");

    }
}
