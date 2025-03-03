package com.proyectointegrador.msplace.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import java.util.Set;

@AllArgsConstructor
@Getter
@Setter
@Builder
@NoArgsConstructor
@ToString
@Entity
@Table(name = "City")
public class City {

    @Id
    @SequenceGenerator(name = "city-sequence", sequenceName = "city-sequence", allocationSize = 1)
    @GeneratedValue(generator = "city-sequence", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    @Column(name = "zip_code")
    private String zipCode;

    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Place> places;
}
