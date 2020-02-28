package cn.herodotus.eurynome.platform.autoconfigure;

import cn.herodotus.eurynome.component.common.domain.RequestMappingStore;
import cn.herodotus.eurynome.component.data.properties.ApplicationProperties;
import cn.herodotus.eurynome.component.sdk.annotation.KafkaRequestMappingStore;
import cn.herodotus.eurynome.component.sdk.configuration.kafka.KafkaProducer;
import cn.herodotus.eurynome.component.security.annotation.RequestMappingScan;
import cn.herodotus.eurynome.component.security.configuration.SecurityComponentConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.kafka.core.KafkaTemplate;

/**
 * @author gengwei.zheng
 */
@Import({
        SecurityComponentConfiguration.class
})
@Slf4j
@Configuration
public class AutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(KafkaProducer.class)
    public KafkaProducer kafkaProducer(KafkaTemplate kafkaTemplate) {
        KafkaProducer kafkaProducer = new KafkaProducer(kafkaTemplate);
        log.debug("[Luban] |- Bean [Kafka Producer] Auto Configure.");
        return kafkaProducer;
    }

    @Bean
    @ConditionalOnMissingBean(KafkaRequestMappingStore.class)
    @ConditionalOnBean(KafkaProducer.class)
    public RequestMappingStore requestMappingStore(KafkaProducer kafkaProducer) {
        KafkaRequestMappingStore kafkaRequestMappingStore = new KafkaRequestMappingStore(kafkaProducer);
        log.debug("[Luban] |- Bean [Kafka Request Mapping Store] Auto Configure.");
        return kafkaRequestMappingStore;
    }

    /**
     * 自定义注解扫描
     *
     * @return
     */
    @Bean
    @ConditionalOnMissingBean(RequestMappingScan.class)
    @ConditionalOnBean(RequestMappingStore.class)
    public RequestMappingScan requestMappingScan(RequestMappingStore requestMappingStore, ApplicationProperties applicationProperties) {
        RequestMappingScan scan = new RequestMappingScan(requestMappingStore, applicationProperties);
        log.debug("[Luban] |- Bean [Request Mapping Scan] Auto Configure.");
        return scan;
    }
}
