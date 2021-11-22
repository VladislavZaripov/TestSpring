package server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Table3Row {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id        public Integer id;

    @Column    public Integer idRecipe;
    @Column    public Integer number;
    @Column(length = 2048)    public String text;
    @Column    public String imageFull;
    @Column    public String imageTitle;
}