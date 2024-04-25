package aik.sales.salesstrong.models;

import java.util.ArrayList;

import jakarta.persistence.OneToOne;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Conversation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    @OneToMany(mappedBy = "conversation")
    private ArrayList<Message> messages;
    private Seller seller;
    private Buyer buyer;
    
    @OneToOne
    private Order command;
}
