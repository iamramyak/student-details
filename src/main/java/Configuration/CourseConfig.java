package Configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CourseConfig {
    @Bean
    public ModelMapper modelMApperBean(){

        return new ModelMapper();
    }
}
