package codeverse.com.web_be.dto.request.AuthenRequest;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChangePasswordRequest {
    private String username;
    private String oldPassword;
    private String newPassword;
}
