package org.example.peaksoft.congiguratin;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@Setter
@ToString
public class Capital {
    private String capitalName;
    private Long population;
    private Long code;
}
