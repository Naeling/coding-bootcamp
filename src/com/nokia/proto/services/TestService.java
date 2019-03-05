package com.nokia.proto.services;

import com.intellij.openapi.components.ServiceManager;

public interface TestService {
    static TestService getInstance() {
        return ServiceManager.getService(TestService.class);
    }
}
