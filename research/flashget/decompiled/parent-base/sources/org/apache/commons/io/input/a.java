package org.apache.commons.io.input;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: AutoCloseInputStream.java */
/* loaded from: classes4.dex */
public class a extends n {
    public a(InputStream inputStream) {
        super(inputStream);
    }

    @Override // org.apache.commons.io.input.n
    protected void a(int i4) throws IOException {
        if (i4 == -1) {
            close();
        }
    }

    @Override // org.apache.commons.io.input.n, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterInputStream) this).in.close();
        ((FilterInputStream) this).in = new i();
    }

    protected void finalize() throws Throwable {
        close();
        super.finalize();
    }
}
