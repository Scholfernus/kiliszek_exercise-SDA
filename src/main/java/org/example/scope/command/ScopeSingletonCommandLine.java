package org.example.scope.command;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.example.scope.ExampleBean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Slf4j
@Order(1)
@Component
@Data
public class ScopeSingletonCommandLine implements CommandLineRunner {

    private final ApplicationContext applicationContext;
    @Override
    public void run(String... args) throws Exception {
        ExampleBean exampleBeanFirst = (ExampleBean) applicationContext.getBean("exampleSingletonBean");
        ExampleBean exampleBeanSecond = (ExampleBean) applicationContext.getBean("exampleSingletonBean");
        exampleBeanFirst.setValue("changedValue");
         log.info("Singleton beans value are equal {}",exampleBeanFirst.getValue().equals(exampleBeanSecond.getValue()));
        log.info("Singleton beans address first {}", System.identityHashCode(exampleBeanFirst));
        log.info("Singleton beans address second {}", System.identityHashCode(exampleBeanSecond));

     }
}
