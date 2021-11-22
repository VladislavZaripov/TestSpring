package server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Table1 {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id        public Integer id;

    @Column    public String recipe;
    @Column    public String category;
    @Column    public String kitchen;
    @Column    public String preferences;
    @Column    public Integer time;
    @Column    public Integer portion;
    @Column    public String imageFull;
    @Column    public String imageTitle;


}