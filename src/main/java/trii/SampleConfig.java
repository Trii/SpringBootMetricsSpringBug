package trii;

import org.springframework.context.annotation.Configuration;
import com.ryantenney.metrics.spring.config.annotation.EnableMetrics;

// remove comments to see build success
//import com.ryantenney.metrics.spring.config.annotation.MetricsConfigurerAdapter

@Configuration
@EnableMetrics
public class SampleConfig /*extends MetricsConfigurerAdapter */ {
}
