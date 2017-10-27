package com.malex.model.entity.templ;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@NoArgsConstructor
@MappedSuperclass
public class BaseEntity {

    @Getter
    @Setter
    @Id
    @SequenceGenerator(name = "app_sequence", sequenceName = "app_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "app_sequence")
    private Long id;
}
