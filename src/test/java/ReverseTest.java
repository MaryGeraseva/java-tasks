import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import tasks.Reverse;

import java.util.List;
import java.util.stream.Collectors;

public class ReverseTest {
    @Test
    public void testReverseString() {
        List<String> listToReverse = List.of("apple", "John", "1234", "test1");
        List<String> expectedList = List.of("elppa", "nhoJ", "4321", "1tset");
        List<String> reversedList = listToReverse.stream().map(Reverse::reverseString).collect(Collectors.toList());
        Assertions.assertThat(expectedList)
                .usingRecursiveComparison()
                .ignoringCollectionOrder()
                .isEqualTo(reversedList);
    }
}
