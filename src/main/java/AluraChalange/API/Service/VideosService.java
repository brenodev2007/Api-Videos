package AluraChalange.API.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import AluraChalange.API.Entity.Video;
import AluraChalange.API.repository.VideoRepository;

@Service
public class VideosService {
    

    @Autowired
    private VideoRepository videosRepository;


    public List<Video> getAllvideos(){
        return videosRepository.findAll();
    }

    public Video getVideoById(Long id){
        return videosRepository.findById(id).orElse(null);
    }

    public Video createVideo(Video video){
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


    

    
}
