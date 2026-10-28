package com.tencent.liteav.base.util;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes7.dex */
public final class e {
    public static long a(File file, int i4) {
        long j4 = 0;
        if (i4 <= 0) {
            return 0L;
        }
        try {
            for (File file2 : file.listFiles()) {
                j4 += file2.isDirectory() ? a(file2, i4 - 1) : file2.length();
            }
        } catch (Exception e4) {
            LiteavLog.i(ProtectedSandApp.s("厮\u0001"), ProtectedSandApp.s("厭\u0001") + e4.toString());
        }
        return j4;
    }

    public static void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
