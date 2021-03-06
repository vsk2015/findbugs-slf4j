package jp.skypencil.findbugs.slf4j;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class UsingMarkerTest {
  @Test
  public void test() {
    Map<String, Integer> expected = new HashMap<>();
    expected.put("SLF4J_PLACE_HOLDER_MISMATCH", 2);
    new XmlParser().expect(pkg.UsingMarker.class, expected);
  }
}
