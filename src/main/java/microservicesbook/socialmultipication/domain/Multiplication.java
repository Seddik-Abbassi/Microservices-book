package microservicesbook.socialmultipication.domain;

import lombok.Getter;
import lombok.ToString;

/**
 * This class represents a Multiplication in our Application
 */
@Getter
@ToString
public class Multiplication {

    // Both factors
    private int factorA;
    private int factorB;

    // The result of the operation A * B
    private int result;

    public Multiplication(int factorA, int factorB) {
        this.factorA = factorA;
        this.factorB = factorB;
        this.result = factorA * factorB;
    }
}
