package com.google.common.io;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: Closeables.java */
@p
@d9.a
@d9.c
/* loaded from: classes6.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @d9.d
    static final Logger f57142a = Logger.getLogger(l.class.getName());

    private l() {
    }

    public static void a(@zc.a Closeable closeable, boolean z4) throws IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e4) {
            if (!z4) {
                throw e4;
            }
            f57142a.log(Level.WARNING, ProtectedSandApp.s("\uf6b3"), (Throwable) e4);
        }
    }

    public static void b(@zc.a InputStream inputStream) {
        try {
            a(inputStream, true);
        } catch (IOException e4) {
            throw new AssertionError(e4);
        }
    }

    public static void c(@zc.a Reader reader) {
        try {
            a(reader, true);
        } catch (IOException e4) {
            throw new AssertionError(e4);
        }
    }
}
