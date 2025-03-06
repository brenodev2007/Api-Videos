package AluraChalange.API.repository;

import AluraChalange.API.Entity.Categoria;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    Optional<Categoria> findByTitulo(String titulo);
    Page<Categoria> findAll(Pageable pageable);
}
