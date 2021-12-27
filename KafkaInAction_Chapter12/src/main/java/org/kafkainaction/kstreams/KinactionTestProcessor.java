package org.kafkainaction.kstreams;

import org.apache.kafka.streams.processor.AbstractProcessor;
import org.apache.kafka.streams.processor.To;

public class KinactionTestProcessor extends AbstractProcessor<String, String> {

    @Override
    public void process(String key, String value) {
      context().forward(key, value, To.child("Kinaction-Destination2-Topic"));
    }

}