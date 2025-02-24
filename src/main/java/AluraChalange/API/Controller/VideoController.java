package AluraChalange.API.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import AluraChalange.API.Entity.Video;
import AluraChalange.API.Service.VideosService;

@RestController
public class VideoController {
    

    @Autowired
    private VideosService videoService;

    
    @GetMapping("/videos")
    public List<Video> getVideos() {
        return videoService.getAllvideos();
    }


    @GetMapping("/videos/{id}")
    public Video getVideoById(@PathVariable Long id) {
        return videoService.getVideoById(id);
    }

}
