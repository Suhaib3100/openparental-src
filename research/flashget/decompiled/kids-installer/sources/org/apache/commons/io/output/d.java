package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: ClosedOutputStream.java */
/* loaded from: classes5.dex */
public class d extends OutputStream {

    /* renamed from: o, reason: collision with root package name */
    public static final d f32080o = new d();

    @Override // java.io.OutputStream
    public void write(int i5) throws IOException {
        throw new IOException(androidx.constraintlayout.solver.f.a("write(", i5, ") failed: stream is closed"));
    }
}
