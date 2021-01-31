package com.learning.security.user;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {

    @RequestMapping("login")
    public String loginUser(@AuthenticationPrincipal OAuth2User user) {

        if (user != null) {
            return "Username: " + user.getName() + "<br>"
                    + "User Authorities: " + user.getAuthorities();
        } else {
            return null;
        }
    }
}
