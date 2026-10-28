package org.apache.commons.lang3.exception;

/* loaded from: classes6.dex */
public class CloneFailedException extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    private static final long f85984b = 20091223;

    public CloneFailedException(String str) {
        super(str);
    }

    public CloneFailedException(Throwable th) {
        super(th);
    }

    public CloneFailedException(String str, Throwable th) {
        super(str, th);
    }
}
