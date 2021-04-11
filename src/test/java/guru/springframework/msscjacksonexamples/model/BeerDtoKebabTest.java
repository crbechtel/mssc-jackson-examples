/**
 * 
 */
package guru.springframework.msscjacksonexamples.model;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * Created by @author cliffordbechtel on Apr 11, 2021
 *
 */
@ActiveProfiles("kebab")
@JsonTest
public class BeerDtoKebabTest extends BaseTest {

	@Test
	void testKebab() throws JsonProcessingException {
		BeerDto dto = getDto();
		
		String json = objectMapper.writeValueAsString(dto);
		
		System.out.println(json);
	}
}
