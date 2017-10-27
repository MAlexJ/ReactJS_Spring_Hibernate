package com.malex.model.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.malex.model.entity.templ.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "article")
public class ArticleEntity extends BaseEntity{

    @Setter
    @Getter
    @Column(name = "title", nullable = false)
    private String title;

    @Setter
    @Getter
    @Column(name = "description", nullable = false)
    private String description;

    @Setter
    @Getter
    @Column(name = "text", nullable = false)
    private String text;

    @Setter
    @Getter
    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
    @OneToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "id_image", unique = true, nullable = false)
    private ImageEntity image;

}
