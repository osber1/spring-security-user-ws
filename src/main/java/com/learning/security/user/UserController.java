package com.learning.security.user;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/users")
public class UserController {

    @RequestMapping("profile")
    public String getUserProfile(@AuthenticationPrincipal OAuth2User user) {

        if (user != null) {
            return "Username: " + user.getName() + "<br>"
                    + "User Authorities: " + user.getAuthorities();
        } else {
            return null;
        }
    }
}
