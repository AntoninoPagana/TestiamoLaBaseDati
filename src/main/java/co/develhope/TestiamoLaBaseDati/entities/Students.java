package co.develhope.TestiamoLaBaseDati.entities;

import jakarta.persistence.*;

@Entity
@Table
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false, unique = true)
    private String email;
}
