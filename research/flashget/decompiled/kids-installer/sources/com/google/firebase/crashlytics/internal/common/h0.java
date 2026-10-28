package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* compiled from: NativeSessionFileGzipper.java */
/* loaded from: classes2.dex */
class h0 {
    h0() {
    }

    private static void a(@androidx.annotation.q0 InputStream inputStream, @androidx.annotation.o0 File file) throws IOException {
        if (inputStream == null) {
            return;
        }
        byte[] bArr = new byte[8192];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        gZIPOutputStream2.finish();
                        i.g(gZIPOutputStream2);
                        return;
                    }
                    gZIPOutputStream2.write(bArr, 0, read);
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    i.g(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    static void b(File file, List<g0> list) {
        for (g0 g0Var : list) {
            InputStream inputStream = null;
            try {
                inputStream = g0Var.b();
                if (inputStream != null) {
                    a(inputStream, new File(file, g0Var.a()));
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                i.g(null);
                throw th;
            }
            i.g(inputStream);
        }
    }
}
