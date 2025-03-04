package AluraChalange.API.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

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

    @NotNull// Validação no nível da aplicação
    @JoinColumn(name = "categoria_id", nullable = false)
    @ManyToOne
    private Categoria categoria;




    
}
