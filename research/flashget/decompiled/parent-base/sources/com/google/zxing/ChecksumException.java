package com.google.zxing;

/* loaded from: classes6.dex */
public final class ChecksumException extends ReaderException {

    /* renamed from: d, reason: collision with root package name */
    private static final ChecksumException f62592d;

    static {
        ChecksumException checksumException = new ChecksumException();
        f62592d = checksumException;
        checksumException.setStackTrace(ReaderException.f62596c);
    }

    private ChecksumException() {
    }

    public static ChecksumException a() {
        return ReaderException.f62595b ? new ChecksumException() : f62592d;
    }

    public static ChecksumException b(Throwable th) {
        return ReaderException.f62595b ? new ChecksumException(th) : f62592d;
    }

    private ChecksumException(Throwable th) {
        super(th);
    }
}
