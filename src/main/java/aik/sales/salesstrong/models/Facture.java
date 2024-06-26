package aik.sales.salesstrong.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Facture {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String number;
    @OneToOne
    private Order command;
}
