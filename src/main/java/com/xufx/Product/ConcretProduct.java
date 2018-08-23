package com.xufx.Product;

public class ConcretProduct implements Product{
    private String head;
    private String body;
    private String end;

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "ConcretProduct{" +
                "head='" + head + '\'' +
                ", body='" + body + '\'' +
                ", end='" + end + '\'' +
                '}';
    }
}
