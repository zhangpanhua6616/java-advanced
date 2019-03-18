package com.java.util;

public class NBA {
    private String qiuyuan;
    private String chuohao;
    private Double defen;
    private Double lanban;
    private Double zhugong;

    public NBA(String qiuyuan, String chuohao, Double defen, Double lanban, Double zhugong) {
        this.qiuyuan = qiuyuan;
        this.chuohao = chuohao;
        this.defen = defen;
        this.lanban = lanban;
        this.zhugong = zhugong;
    }

    public NBA() {
    }

    public String getQiuyuan() {
        return qiuyuan;
    }

    public void setQiuyuan(String qiuyuan) {
        this.qiuyuan = qiuyuan;
    }

    public String getChuohao() {
        return chuohao;
    }

    public void setChuohao(String chuohao) {
        this.chuohao = chuohao;
    }

    public Double getDefen() {
        return defen;
    }

    public void setDefen(Double defen) {
        this.defen = defen;
    }

    public Double getLanban() {
        return lanban;
    }

    public void setLanban(Double lanban) {
        this.lanban = lanban;
    }

    public Double getZhugong() {
        return zhugong;
    }

    public void setZhugong(Double zhugong) {
        this.zhugong = zhugong;
    }
}

