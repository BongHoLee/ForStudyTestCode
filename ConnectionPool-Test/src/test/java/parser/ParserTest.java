package parser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.hamcrest.MatcherAssert.assertThat;

public class ParserTest {

    private Pattern pattern = Pattern.compile("[\\$|\\#]\\{(.*?)\\}");

    @Test
    @DisplayName("패턴 매칭 테스트")
    public void Pattern_매칭_테스트() {
        String script = "SELECT A, B, C FROM table WHERE ID=#{ID} AND AGE=#{AGE}";
        Matcher matcher = pattern.matcher(script);

        Map<String, Object> map = new HashMap<>();
        map.put("ID", "LEEBONGHO");
        map.put("AGE", 30);

        while (matcher.find()) {
            String fParam = matcher.group();
            String fId 		= fParam.replaceAll("[\\$|\\#]\\{","").replaceAll("\\}","");

            script = script.replace(fParam, (CharSequence) map.get(fId));
            System.out.println(script);

        }
    }

}