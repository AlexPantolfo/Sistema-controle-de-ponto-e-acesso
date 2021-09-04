package com.dio.sistemacontrolede.pontoeacesso.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited

public class AccessLevel {
    @Id
    @GeneratedValue
    private long id;
    private String descricao;
}