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


    

    
}
