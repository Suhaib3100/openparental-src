package org.apache.commons.io;

import java.io.IOException;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class TaggedIOException extends IOExceptionWithCause {

    /* renamed from: d, reason: collision with root package name */
    private static final long f85304d = -6994123481142850163L;

    /* renamed from: c, reason: collision with root package name */
    private final Serializable f85305c;

    public TaggedIOException(IOException iOException, Serializable serializable) {
        super(iOException.getMessage(), iOException);
        this.f85305c = serializable;
    }

    public static boolean c(Throwable th, Object obj) {
        return obj != null && (th instanceof TaggedIOException) && obj.equals(((TaggedIOException) th).f85305c);
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
        return this.f85305c;
    }
}
