package AluraChalange.API.Service;

import AluraChalange.API.Entity.Categoria;
import AluraChalange.API.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;


    public List<Categoria> getAllCategorias(){
        return categoriaRepository.findAll();
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
