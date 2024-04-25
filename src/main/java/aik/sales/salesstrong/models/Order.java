package aik.sales.salesstrong.models;


import java.sql.Time;
import java.util.ArrayList;

import jakarta.persistence.Entity;

import jakarta.persistence.OneToOne;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String number;
    private ArrayList<Article> articles;
    private Time date;
    
    @OneToOne(mappedBy="command")
    private Facture facture;
    
    @OneToOne(mappedBy="command")
    private Conversation conversation; 

}
