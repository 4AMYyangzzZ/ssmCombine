package com.bjsxt.pojo;

public class Fund {
    private int fid;
    private String fname;
    private int amount;

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Fund{" +
                "fid=" + fid +
                ", fname='" + fname + '\'' +
                ", amount=" + amount +
                '}';
    }
}
