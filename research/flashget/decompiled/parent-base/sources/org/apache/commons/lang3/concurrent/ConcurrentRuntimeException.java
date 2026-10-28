package org.apache.commons.lang3.concurrent;

/* loaded from: classes6.dex */
public class ConcurrentRuntimeException extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    private static final long f85873b = -6582182735562919670L;

    protected ConcurrentRuntimeException() {
    }

    public ConcurrentRuntimeException(Throwable th) {
        super(j.a(th));
    }

    public ConcurrentRuntimeException(String str, Throwable th) {
        super(str, j.a(th));
    }
}
