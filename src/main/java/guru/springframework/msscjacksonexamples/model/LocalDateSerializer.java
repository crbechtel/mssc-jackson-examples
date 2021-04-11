/**
 * 
 */
package guru.springframework.msscjacksonexamples.model;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * Created by @author cliffordbechtel on Apr 11, 2021
 *
 */
public class LocalDateSerializer extends JsonSerializer<LocalDate>{

	@Override
	public void serialize(LocalDate value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
		gen.writeObject(value.format(DateTimeFormatter.BASIC_ISO_DATE));
	}
}
