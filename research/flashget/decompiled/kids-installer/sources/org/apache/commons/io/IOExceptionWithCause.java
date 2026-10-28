package org.apache.commons.io;

import java.io.IOException;

/* loaded from: classes5.dex */
public class IOExceptionWithCause extends IOException {

    /* renamed from: o, reason: collision with root package name */
    private static final long f31803o = 1;

    public IOExceptionWithCause(String str, Throwable th) {
        super(str);
        initCause(th);
    }

    public IOExceptionWithCause(Throwable th) {
        super(th == null ? null : th.toString());
        initCause(th);
    }
}
