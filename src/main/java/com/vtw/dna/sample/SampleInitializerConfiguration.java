package com.vtw.dna.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Configuration
@Component
public class SampleInitializerConfiguration {

    @Autowired private MovieInitializer movieInitializer;
    @Autowired private DevExtremeInitializer devExtremeInitializer;
   // @Autowired private ScheduleInitializer scheduleInitializer;
    @Autowired private TheaterInitializer theaterInitializer;

    @PostConstruct
    public void init() {
        movieInitializer.generateData();
        devExtremeInitializer.generateData();
  //      scheduleInitializer.generateData();
        theaterInitializer.generateData();
    }
}
