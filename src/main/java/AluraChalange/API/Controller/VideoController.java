package AluraChalange.API.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import AluraChalange.API.Entity.Video;
import AluraChalange.API.Service.VideosService;

import java.util.List;

@RestController
public class VideoController {
    

    @Autowired
    private VideosService videoService;

    
    @GetMapping("/videos/")
    public Page<Video> getAllVideos(@RequestParam (defaultValue = "0")int page) {
        return videoService.getAllVideos(page);
    }

    @GetMapping("/videos/free")
    public ResponseEntity<List<Video>> getFreeVideos() {
        List<Video> videos = videoService.getFreeVideos();
        return ResponseEntity.ok(videos);
    }

    @GetMapping("/videos/{id}")
    public Video getVideoById(@PathVariable Long id) {
        return videoService.getVideoById(id);
    }

    @PostMapping("/videos")
    public Video createVideo(@RequestBody Video video, @RequestParam Long idCategoria) {
        return videoService.createVideo(video, idCategoria);
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
