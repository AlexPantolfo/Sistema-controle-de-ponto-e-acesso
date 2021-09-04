package com.dio.sistemacontrolede.pontoeacesso.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited

public class Movement {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class Movimentacaoid implements Serializable{
        private long idMovimento;
        private long idUsuario;
    }
    @Id
    @GeneratedValue
    @EmbeddedId
    private Movimentacaoid id;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private BigDecimal periodo;
    @ManyToOne
    private Occurrences occurrences;
    @ManyToOne
    private Calendar calendar;
}