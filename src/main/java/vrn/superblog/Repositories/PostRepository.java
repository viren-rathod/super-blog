package vrn.superblog.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vrn.superblog.Models.Post;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findByCategoryId(Long categoryId);

}
