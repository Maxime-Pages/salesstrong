package aik.sales.salesstrong.models;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

import jakarta.persistence.DiscriminatorValue;

@Entity
@Data
@NoArgsConstructor
@DiscriminatorValue("seller")
public class Buyer extends User{
    private ArrayList<Order> orders;
}
