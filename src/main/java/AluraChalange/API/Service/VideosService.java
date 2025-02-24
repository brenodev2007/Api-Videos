package AluraChalange.API.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import AluraChalange.API.Entity.Video;
import AluraChalange.API.repository.VideoRepository;

@Service
public class VideosService {
    

    @Autowired
    private VideoRepository videosRepository;


    @GetMapping("/videos")
    public List<Video> getAllvideos(){
        return videosRepository.findAll();
    }

    
    
}
