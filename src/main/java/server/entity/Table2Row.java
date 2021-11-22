package server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Table2Row {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id        public Integer id;

    @Column    public Integer idRecipe;
    @Column    public String ingredient;
    @Column    public Integer quantity;
    @Column    public String measure;
}