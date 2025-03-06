package AluraChalange.API.repository;

import AluraChalange.API.Entity.Categoria;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import AluraChalange.API.Entity.Video;

import java.util.List;
import java.util.Optional;

@Repository
public interface VideoRepository extends JpaRepository<Video, Long> {
    public Optional<Video> findByTitulo(String titulo);
    List<Video> findByCategoria(Categoria categoria);
    Page<Video> findAll(Pageable pageable);
}
