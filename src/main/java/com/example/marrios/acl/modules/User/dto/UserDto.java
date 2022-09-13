package com.example.marrios.acl.modules.User.dto;

import java.io.Serializable;

import com.example.marrios.acl.modules.User.models.User;

import ch.qos.logback.core.joran.spi.NoAutoStart;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class UserDto  implements Serializable{
    private static final long serialVersionUID = 1L;

    private @Getter @Setter Long id;
    private @Getter @Setter String username;

    public UserDto(User model) {
        id = model.getId();
        username = model.getUsername();
    }   
}
