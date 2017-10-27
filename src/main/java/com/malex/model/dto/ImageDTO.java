package com.malex.model.dto;

import com.malex.model.enums.ImageType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@EqualsAndHashCode
public class ImageDTO {

    @Setter
    @Getter
    private String name;

    @Setter
    @Getter
    private byte[] img;

    @Setter
    @Getter
    private boolean isAvailable;

    @Setter
    @Getter
    private ImageType type;
}
