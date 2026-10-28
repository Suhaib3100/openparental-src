package com.google.zxing;

/* loaded from: classes6.dex */
public final class FormatException extends ReaderException {

    /* renamed from: d, reason: collision with root package name */
    private static final FormatException f62593d;

    static {
        FormatException formatException = new FormatException();
        f62593d = formatException;
        formatException.setStackTrace(ReaderException.f62596c);
    }

    private FormatException() {
    }

    public static FormatException a() {
        return ReaderException.f62595b ? new FormatException() : f62593d;
    }

    public static FormatException b(Throwable th) {
        return ReaderException.f62595b ? new FormatException(th) : f62593d;
    }

    private FormatException(Throwable th) {
        super(th);
    }
}
