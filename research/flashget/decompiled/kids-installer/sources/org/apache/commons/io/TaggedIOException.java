package org.apache.commons.io;

import java.io.IOException;
import java.io.Serializable;

/* loaded from: classes6.dex */
public class TaggedIOException extends IOExceptionWithCause {

    /* renamed from: q, reason: collision with root package name */
    private static final long f31804q = -6994123481142850163L;

    /* renamed from: p, reason: collision with root package name */
    private final Serializable f31805p;

    public TaggedIOException(IOException iOException, Serializable serializable) {
        super(iOException.getMessage(), iOException);
        this.f31805p = serializable;
    }

    public static boolean c(Throwable th, Object obj) {
        return obj != null && (th instanceof TaggedIOException) && obj.equals(((TaggedIOException) th).f31805p);
    }

    public static void d(Throwable th, Object obj) throws IOException {
        if (c(th, obj)) {
            throw ((TaggedIOException) th).getCause();
        }
    }

    @Override // java.lang.Throwable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public IOException getCause() {
        return (IOException) super.getCause();
    }

    public Serializable b() {
        return this.f31805p;
    }
}
