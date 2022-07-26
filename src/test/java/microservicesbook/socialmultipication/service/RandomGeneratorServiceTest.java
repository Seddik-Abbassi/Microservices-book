package microservicesbook.socialmultipication.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class RandomGeneratorServiceTest {

    @Autowired
    private RandomGeneratorService randomGeneratorService;

    @Test
    void generateRandomFactorIsBetweenExpectedLimits() {

        List<Integer> randomFactors = IntStream.range(0,1000)
                .map(i->randomGeneratorService.generateRandomFactor())
                .boxed().collect(Collectors.toList());
        assertThat(randomFactors).isSubsetOf
                (IntStream.range(11, 100)
                        .boxed().collect(Collectors.toList()));
    }
}