package com7.facade;

public class ZhangWuJi {
    private JingMai jingMai;
    private ZhaoShi zhaoShi;
    private NeiGong neiGong;

    public ZhangWuJi(){
        jingMai = new JingMai();
        zhaoShi = new ZhaoShi();
        neiGong = new NeiGong();
    }
    /**
     * 使用乾坤大挪移
     */
    public void QianKun(){
        jingMai.jingMai();//开启经脉
        neiGong.QianKun();//使用内功乾坤大挪移

    }
    /**
     * 使用七伤拳
     */
    public void QiShang(){
        jingMai.jingMai();//开启经脉
        neiGong.JiuYang();//使用内功九阳神功
        zhaoShi.QiShang();//使用招式七伤拳
    }
}
