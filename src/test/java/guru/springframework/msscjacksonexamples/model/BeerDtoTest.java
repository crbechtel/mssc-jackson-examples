/**
 * 
 */
package guru.springframework.msscjacksonexamples.model;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by @author cliffordbechtel on Apr 11, 2021
 *
 */
@JsonTest
class BeerDtoTest extends BaseTest {
	
	@Autowired
	ObjectMapper objectMapper;

	@Test
	void testSerializeDto() throws JsonProcessingException {
		BeerDto beerDto = getDto();
		
		String jsonString = objectMapper.writeValueAsString(beerDto);
		
		System.out.println(jsonString);
	}
	
	@Test
	void testDeserialize() throws IOException {
		String json = "{\"id\":\"90ad9f22-0ac4-41c0-92bc-04966bad438d\",\"beerName\":\"BeerName\",\"beerStyle\":\"Ale\",\"upc\":123123123123,\"price\":12.99,\"createdDate\":\"2021-04-11T15:16:45.655829-04:00\",\"lastUpdatedDate\":\"2021-04-11T15:16:45.657146-04:00\"}";
		
		BeerDto dto = objectMapper.readValue(json, BeerDto.class);
		
		System.out.println(dto);
	}

}
