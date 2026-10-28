package com.tencent.qcloud.core.http.interceptor;

import java.io.IOException;

/* loaded from: classes7.dex */
public class CircuitBreakerDeniedException extends IOException {
    CircuitBreakerDeniedException(String str) {
        super(str);
    }
}
