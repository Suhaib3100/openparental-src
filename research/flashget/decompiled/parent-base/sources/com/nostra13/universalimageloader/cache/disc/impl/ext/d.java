package com.nostra13.universalimageloader.cache.disc.impl.ext;

import androidx.core.content.g;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.charset.Charset;

/* compiled from: Util.java */
/* loaded from: classes6.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f70231a = Charset.forName(ProtectedSandApp.s("ᨲ\u0001"));

    /* renamed from: b, reason: collision with root package name */
    static final Charset f70232b = Charset.forName(ProtectedSandApp.s("ᨳ\u0001"));

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
            throw new IOException(g.a(ProtectedSandApp.s("ᨵ\u0001"), file));
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                b(file2);
            }
            if (!file2.delete()) {
                throw new IOException(g.a(ProtectedSandApp.s("ᨴ\u0001"), file2));
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
