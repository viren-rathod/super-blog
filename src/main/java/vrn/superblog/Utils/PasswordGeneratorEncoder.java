package vrn.superblog.Utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Slf4j
public class PasswordGeneratorEncoder {
    public static void main(String[] args) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        log.info(passwordEncoder.encode("admin"));
        log.info(passwordEncoder.encode("viren"));
        log.info(passwordEncoder.encode("rohit"));
    }
}
