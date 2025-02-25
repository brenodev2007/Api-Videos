package AluraChalange.API.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

   @PostMapping("/videos")
    public Video createVideo(@RequestBody Video video) {
        return videoService.createVideo(video);
    }

    @PutMapping("/videos/{id}")
    public Video updateVideo(@PathVariable Long id, @RequestBody Video video) {
        return videoService.updateVideo(id, video);
    }

    @DeleteMapping("/videos/{id}")
    public void deleteVideo(@PathVariable Long id) {
        videoService.deleteVideo(id);
    }

}
