package AluraChalange.API.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "video")
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;


    @Column(name = "titulo", nullable = false)
    private String titulo;
    @Column(name = "descricao", nullable = false)
    public String descricao;
    @Column(name = "url", nullable = false)
    private String url;

    @JoinColumn
    @ManyToOne
    private Categoria categoria;




    
}
