package com.google.zxing;

/* loaded from: classes6.dex */
public final class NotFoundException extends ReaderException {

    /* renamed from: d, reason: collision with root package name */
    private static final NotFoundException f62594d;

    static {
        NotFoundException notFoundException = new NotFoundException();
        f62594d = notFoundException;
        notFoundException.setStackTrace(ReaderException.f62596c);
    }

    private NotFoundException() {
    }

    public static NotFoundException a() {
        return f62594d;
    }
}
