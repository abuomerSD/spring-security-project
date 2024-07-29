package com.eltayeb.security.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "_user")
public class User {
    @Id
    @GeneratedValue(generator = "idGenerator")
    @SequenceGenerator(name = "idGenerator", allocationSize = 1)
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
}
