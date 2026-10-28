package com.bumptech.glide.disklrucache;

import androidx.core.content.g;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.charset.Charset;

/* compiled from: Util.java */
/* loaded from: classes3.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f42881a = Charset.forName(ProtectedSandApp.s("࠳"));

    /* renamed from: b, reason: collision with root package name */
    static final Charset f42882b = Charset.forName(ProtectedSandApp.s("࠴"));

    private d() {
    }

    static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e4) {
                throw e4;
            } catch (Exception unused) {
            }
        }
    }

    static void b(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            throw new IOException(g.a(ProtectedSandApp.s("࠶"), file));
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                b(file2);
            }
            if (!file2.delete()) {
                throw new IOException(g.a(ProtectedSandApp.s("࠵"), file2));
            }
        }
    }

    static String c(Reader reader) throws IOException {
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[1024];
            while (true) {
                int read = reader.read(cArr);
                if (read == -1) {
                    String stringWriter2 = stringWriter.toString();
                    reader.close();
                    return stringWriter2;
                }
                stringWriter.write(cArr, 0, read);
            }
        } catch (Throwable th) {
            reader.close();
            throw th;
        }
    }
}
