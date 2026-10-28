package com.nostra13.universalimageloader.utils;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: IoUtils.java */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f70518a = 32768;

    /* renamed from: b, reason: collision with root package name */
    public static final int f70519b = 512000;

    /* renamed from: c, reason: collision with root package name */
    public static final int f70520c = 75;

    /* compiled from: IoUtils.java */
    public interface a {
        boolean a(int i4, int i5);
    }

    private c() {
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static boolean b(InputStream inputStream, OutputStream outputStream, a aVar) throws IOException {
        return c(inputStream, outputStream, aVar, 32768);
    }

    public static boolean c(InputStream inputStream, OutputStream outputStream, a aVar, int i4) throws IOException {
        int available = inputStream.available();
        if (available <= 0) {
            available = f70519b;
        }
        byte[] bArr = new byte[i4];
        if (e(aVar, 0, available)) {
            return false;
        }
        int i5 = 0;
        do {
            int read = inputStream.read(bArr, 0, i4);
            if (read == -1) {
                outputStream.flush();
                return true;
            }
            outputStream.write(bArr, 0, read);
            i5 += read;
        } while (!e(aVar, i5, available));
        return false;
    }

    public static void d(InputStream inputStream) {
        do {
            try {
            } catch (IOException unused) {
            } catch (Throwable th) {
                a(inputStream);
                throw th;
            }
        } while (inputStream.read(new byte[32768], 0, 32768) != -1);
        a(inputStream);
    }

    private static boolean e(a aVar, int i4, int i5) {
        return (aVar == null || aVar.a(i4, i5) || (i4 * 100) / i5 >= 75) ? false : true;
    }
}
