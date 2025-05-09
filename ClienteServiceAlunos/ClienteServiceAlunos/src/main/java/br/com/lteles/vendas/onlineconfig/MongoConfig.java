/**
 * 
 */
package br.com.lteles.vendas.onlineconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * 
 */
@Configuration
@EnableMongoRepositories(basePackages = "br.com.lteles.vendas.online.repository")
public class MongoConfig {

}
