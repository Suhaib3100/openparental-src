package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.UUID;
import org.apache.commons.io.TaggedIOException;

/* compiled from: TaggedInputStream.java */
/* loaded from: classes4.dex */
public class s extends n {

    /* renamed from: b, reason: collision with root package name */
    private final Serializable f85501b;

    public s(InputStream inputStream) {
        super(inputStream);
        this.f85501b = UUID.randomUUID();
    }

    @Override // org.apache.commons.io.input.n
    protected void c(IOException iOException) throws IOException {
        throw new TaggedIOException(iOException, this.f85501b);
    }

    public boolean d(Throwable th) {
        return TaggedIOException.c(th, this.f85501b);
    }

    public void e(Throwable th) throws IOException {
        TaggedIOException.d(th, this.f85501b);
    }
}
