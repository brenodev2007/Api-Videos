package AluraChalange.API.Service;

import java.util.List;
import java.util.Optional;

import AluraChalange.API.Entity.Categoria;
import AluraChalange.API.repository.CategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;

import AluraChalange.API.Entity.Video;
import AluraChalange.API.Exeptions.VideoNotFoundException;
import AluraChalange.API.repository.VideoRepository;

@Service
public class VideosService {
    

    @Autowired
    private VideoRepository videosRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;


    public Page<Video> getAllVideos(int page){
        Pageable pageable = PageRequest.of(page, 5); // 5 itens por página
        return videosRepository.findAll(pageable);
    }

    public Video getVideoById(Long id){
        return videosRepository.findById(id)
        .orElseThrow(() -> new VideoNotFoundException("Vídeo com ID " + id + " não encontrado"));
    }

    public Optional<Video> finByTitulo (String titulo){
        return videosRepository.findByTitulo(titulo);
    }

    public List<Video> findByCategoria(Categoria categoria){
        return videosRepository.findByCategoria(categoria);
    }

    public Video createVideo(Video video, Long idCategoria) {
        Categoria categoria = categoriaRepository.findById(idCategoria)
                .orElseThrow(() -> new RuntimeException("Categoria não encontrada com id: " + idCategoria));
        video.setCategoria(categoria);
        return videosRepository.save(video);
    }

    public Video updateVideo(Long id, Video videoDetails) {
        return videosRepository.findById(id)
            .map(video -> {
                video.setTitulo(videoDetails.getTitulo());  // Atualiza o título
                video.setDescricao(videoDetails.getDescricao()); // Atualiza a descrição (caso tenha)
                video.setUrl(videoDetails.getUrl()); // Atualiza a URL (caso tenha)
                return videosRepository.save(video);
            })
            .orElseThrow(() -> new RuntimeException("Vídeo não encontrado com id: " + id));
    }

    public void deleteVideo(Long id) {
        videosRepository.deleteById(id);
    }


    

    
}
