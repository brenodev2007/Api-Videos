package AluraChalange.API.Controller;

import AluraChalange.API.Entity.Categoria;
import AluraChalange.API.Service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {


    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/")
    public List<Categoria> getAllCategorias(){
        return categoriaService.getAllCategorias();
    }

    @GetMapping("/{id}")
    public Categoria getCategoriaById(Long id){
        return categoriaService.getCategoriaById(id).get();
    }

    @GetMapping("/{titulo}")
    public Categoria getCategoriaByTitulo(@PathVariable String titulo) {
        return categoriaService.finByTitulo(titulo).get();
    }

    @PostMapping("/")
    public Categoria createCategoria(@RequestBody Categoria categoria){
        return categoriaService.createCategoria(categoria);
    }

    @PutMapping("/{id}")
    public Categoria updateCategoria(@PathVariable Long id, @RequestBody Categoria categoria){
        return categoriaService.atualizarCategoria(id);
    }

    public void deleteCategoria(@PathVariable Long id) {
        categoriaService.deleteCategoria(id);
    }
}
