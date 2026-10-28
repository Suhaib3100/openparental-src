package org.apache.commons.lang3.concurrent;

/* loaded from: classes6.dex */
public class CircuitBreakingException extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    private static final long f85871b = 1408176654686913340L;

    public CircuitBreakingException() {
    }

    public CircuitBreakingException(String str, Throwable th) {
        super(str, th);
    }

    public CircuitBreakingException(String str) {
        super(str);
    }

    public CircuitBreakingException(Throwable th) {
        super(th);
    }
}
