package org.apache.commons.lang3.concurrent;

/* loaded from: classes6.dex */
public class ConcurrentException extends Exception {

    /* renamed from: b, reason: collision with root package name */
    private static final long f85872b = 6622707671812226130L;

    protected ConcurrentException() {
    }

    public ConcurrentException(Throwable th) {
        super(j.a(th));
    }

    public ConcurrentException(String str, Throwable th) {
        super(str, j.a(th));
    }
}
