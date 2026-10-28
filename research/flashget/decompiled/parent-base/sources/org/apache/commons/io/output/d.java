package org.apache.commons.io.output;

import androidx.collection.r2;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: ClosedOutputStream.java */
/* loaded from: classes4.dex */
public class d extends OutputStream {

    /* renamed from: b, reason: collision with root package name */
    public static final d f85592b = new d();

    @Override // java.io.OutputStream
    public void write(int i4) throws IOException {
        throw new IOException(r2.a("write(", i4, ") failed: stream is closed"));
    }
}
