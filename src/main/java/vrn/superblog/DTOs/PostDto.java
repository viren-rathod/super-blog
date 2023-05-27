package vrn.superblog.DTOs;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;


import java.util.Set;

@Schema(description = "Post Dto Model")
@Data
public class PostDto {
    private long id;
    @NotEmpty
    @Size(min = 2, message = "Post title should be at least 2 characters long!!")
    private String title;

    @NotEmpty
    @Size(min = 10, message = "Post description should be at least 10 characters long!!")
    private String description;

    @NotEmpty(message = "content can not be null or empty!!")
    private String content;
    private Set<CommentDto> comments;

    private Long categoryId;
}
