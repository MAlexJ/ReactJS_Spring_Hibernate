package com.malex.model.entity;

import com.malex.model.entity.templ.BaseEntity;
import com.malex.model.enums.ImageType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "image")
public class ImageEntity extends BaseEntity {

    @Setter
    @Getter
    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Setter
    @Getter
    @Lob
    @Column(name = "img", nullable = false)
    @Type(type = "org.hibernate.type.BinaryType")
    private byte[] img;

    @Setter
    @Getter
    @Column(name = "available", nullable = false)
    private boolean isAvailable;

    @Setter
    @Getter
    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false)
    private ImageType type;

    @Setter
    @Getter
    @OneToOne(mappedBy = "image")
    private ArticleEntity article;
}
