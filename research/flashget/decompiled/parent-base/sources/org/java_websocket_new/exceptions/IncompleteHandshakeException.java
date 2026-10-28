package org.java_websocket_new.exceptions;

/* loaded from: classes6.dex */
public class IncompleteHandshakeException extends RuntimeException {

    /* renamed from: c, reason: collision with root package name */
    private static final long f86972c = 7906596804233893092L;

    /* renamed from: b, reason: collision with root package name */
    private int f86973b;

    public IncompleteHandshakeException(int i4) {
        this.f86973b = i4;
    }

    public int a() {
        return this.f86973b;
    }

    public IncompleteHandshakeException() {
        this.f86973b = 0;
    }
}
