package com.kosasih.finsavvy;

import com.kosasih.finsavvy.FinSavvyApp;
import com.kosasih.finsavvy.config.AsyncSyncConfiguration;
import com.kosasih.finsavvy.config.EmbeddedElasticsearch;
import com.kosasih.finsavvy.config.EmbeddedKafka;
import com.kosasih.finsavvy.config.EmbeddedSQL;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { FinSavvyApp.class, AsyncSyncConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
@EmbeddedKafka
public @interface IntegrationTest {
}
