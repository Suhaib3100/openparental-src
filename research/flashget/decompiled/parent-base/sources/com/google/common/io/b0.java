package com.google.common.io;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

/* compiled from: MultiReader.java */
@p
@d9.c
/* loaded from: classes6.dex */
class b0 extends Reader {

    /* renamed from: b, reason: collision with root package name */
    private final Iterator<? extends j> f57094b;

    /* renamed from: c, reason: collision with root package name */
    @zc.a
    private Reader f57095c;

    b0(Iterator<? extends j> it) throws IOException {
        this.f57094b = it;
        a();
    }

    private void a() throws IOException {
        close();
        if (this.f57094b.hasNext()) {
            this.f57095c = this.f57094b.next().m();
        }
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Reader reader = this.f57095c;
        if (reader != null) {
            try {
                reader.close();
            } finally {
                this.f57095c = null;
            }
        }
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i4, int i5) throws IOException {
        cArr.getClass();
        Reader reader = this.f57095c;
        if (reader == null) {
            return -1;
        }
        int read = reader.read(cArr, i4, i5);
        if (read != -1) {
            return read;
        }
        a();
        return read(cArr, i4, i5);
    }

    @Override // java.io.Reader
    public boolean ready() throws IOException {
        Reader reader = this.f57095c;
        return reader != null && reader.ready();
    }

    @Override // java.io.Reader
    public long skip(long j4) throws IOException {
        l0.e(j4 >= 0, ProtectedSandApp.s("\uf681"));
        if (j4 > 0) {
            while (true) {
                Reader reader = this.f57095c;
                if (reader == null) {
                    break;
                }
                long skip = reader.skip(j4);
                if (skip > 0) {
                    return skip;
                }
                a();
            }
        }
        return 0L;
    }
}
