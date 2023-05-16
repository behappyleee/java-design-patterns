package com.iluwatar.callback;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SimpleTaskTest extends Task {
    @Override
    public void execute() {
        LOGGER.info("THIS IS MY CUSTOM SIMPLE TASK TEST EXECUTE METHOD TEST !!!!");
    }
}
