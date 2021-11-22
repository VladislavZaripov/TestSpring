package server.entity;

import javax.persistence.*;

@Entity
public class TestSpring {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    public Integer id;

    @Column
    public String text;
    @Column
    public Integer num;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}