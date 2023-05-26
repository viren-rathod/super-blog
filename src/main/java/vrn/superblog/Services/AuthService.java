package vrn.superblog.Services;

import org.springframework.stereotype.Service;
import vrn.superblog.DTOs.LoginDto;
import vrn.superblog.DTOs.RegisterDto;

@Service
public interface AuthService {
    String login(LoginDto loginDto);

    String register(RegisterDto registerDto);
}
