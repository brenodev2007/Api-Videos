package AluraChalange.API.Service;

import AluraChalange.API.Entity.Categoria;
import AluraChalange.API.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;


    public Page<Categoria> getAllCategorias(int page){
        Pageable pageable = PageRequest.of(page, 5); // 5 itens por página
        return categoriaRepository.findAll(pageable);
    }

    public Optional<Categoria> getCategoriaById(Long id){
        return categoriaRepository.findById(id);
    }

    public Optional<Categoria> finByTitulo (String titulo){
        return categoriaRepository.findByTitulo(titulo);
    }

    public Categoria createCategoria(Categoria categoria){
        return categoriaRepository.save(categoria);
    }

    public Categoria atualizarCategoria(Long id, Categoria categoria) {
        return categoriaRepository.save(new Categoria());
    }

    public void deleteCategoria(Long id) {
        categoriaRepository.deleteById(id);
    }
}
