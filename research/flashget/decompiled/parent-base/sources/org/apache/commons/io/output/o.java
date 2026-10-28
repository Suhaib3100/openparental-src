package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.UUID;
import org.apache.commons.io.TaggedIOException;

/* compiled from: TaggedOutputStream.java */
/* loaded from: classes4.dex */
public class o extends l {

    /* renamed from: b, reason: collision with root package name */
    private final Serializable f85609b;

    public o(OutputStream outputStream) {
        super(outputStream);
        this.f85609b = UUID.randomUUID();
    }

    @Override // org.apache.commons.io.output.l
    protected void c(IOException iOException) throws IOException {
        throw new TaggedIOException(iOException, this.f85609b);
    }

    public boolean d(Exception exc) {
        return TaggedIOException.c(exc, this.f85609b);
    }

    public void e(Exception exc) throws IOException {
        TaggedIOException.d(exc, this.f85609b);
    }
}
