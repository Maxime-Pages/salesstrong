package aik.sales.salesstrong.models;

import java.util.ArrayList;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@DiscriminatorValue("seller")
public class Seller  extends User{
    private ArrayList<Article> articles;
}
