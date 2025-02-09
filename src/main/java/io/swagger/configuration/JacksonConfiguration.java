//package io.swagger.configuration;
//
//import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.threeten.bp.Instant;
//import java.time.LocalDate;
//import org.threeten.bp.OffsetDateTime;
//import org.threeten.bp.ZonedDateTime;
//
//import com.fasterxml.jackson.datatype.threetenbp.ThreeTenModule;
//import com.fasterxml.jackson.datatype.threetenbp.deser.LocalDateDeserializer;
//
//@Configuration
//public class JacksonConfiguration {
//
//  @Bean
//  @ConditionalOnMissingBean(ThreeTenModule.class)
//  ThreeTenModule threeTenModule() {
//    ThreeTenModule module = new ThreeTenModule();
//    module.addDeserializer(LocalDate.class, LocalDateDeserializer.INSTANCE);
//    module.addDeserializer(Instant.class, CustomInstantDeserializer.INSTANT);
//    module.addDeserializer(OffsetDateTime.class, CustomInstantDeserializer.OFFSET_DATE_TIME);
//    module.addDeserializer(ZonedDateTime.class, CustomInstantDeserializer.ZONED_DATE_TIME);
//    return module;
//  }
//}
