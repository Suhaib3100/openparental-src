package org.apache.commons.io.input;

import java.io.FilterInputStream;
import java.io.InputStream;

/* compiled from: CloseShieldInputStream.java */
/* loaded from: classes4.dex */
public class h extends n {
    public h(InputStream inputStream) {
        super(inputStream);
    }

    @Override // org.apache.commons.io.input.n, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((FilterInputStream) this).in = new i();
    }
}
