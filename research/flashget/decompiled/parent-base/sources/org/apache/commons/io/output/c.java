package org.apache.commons.io.output;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* compiled from: CloseShieldOutputStream.java */
/* loaded from: classes4.dex */
public class c extends l {
    public c(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // org.apache.commons.io.output.l, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((FilterOutputStream) this).out = new d();
    }
}
