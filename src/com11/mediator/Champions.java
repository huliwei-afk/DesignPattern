package com11.mediator;

//具体中介者 只负责notice各个同事
public class Champions extends WuLinAlliance {
    private Wudang wudang;
    private Shaolin shaolin;
    private Emei emei;
    public void setWudang(Wudang wudang) {
        this.wudang = wudang;
    }
    public void setEmei(Emei emei) {
        this.emei = emei;
    }
    public void setShaolin(Shaolin shaolin) {
        this.shaolin = shaolin;
    }
    @Override
    public void notice(String message, United united) {
        if (united == wudang) {
            shaolin.getNotice(message);
        } else if (united == emei) {
            shaolin.getNotice(message);
        } else if (united == shaolin) {
            wudang.getNotice(message);
            emei.getNotice(message);
        }
    }
}
