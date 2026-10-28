package com.google.zxing;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes6.dex */
public abstract class ReaderException extends Exception {

    /* renamed from: b, reason: collision with root package name */
    protected static final boolean f62595b;

    /* renamed from: c, reason: collision with root package name */
    protected static final StackTraceElement[] f62596c;

    static {
        f62595b = System.getProperty(ProtectedSandApp.s("࢜\u0001")) != null;
        f62596c = new StackTraceElement[0];
    }

    ReaderException() {
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }

    ReaderException(Throwable th) {
        super(th);
    }
}
