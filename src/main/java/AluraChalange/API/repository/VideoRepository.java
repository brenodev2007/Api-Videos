package AluraChalange.API.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import AluraChalange.API.Entity.Video;

@Repository
public interface VideoRepository extends JpaRepository<Video, Long> {
    
}
