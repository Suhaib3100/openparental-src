package com.airbnb.lottie.network;

import android.util.Pair;
import androidx.annotation.n1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: NetworkCache.java */
/* loaded from: classes3.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    @o0
    private final e f39186a;

    public g(@o0 e eVar) {
        this.f39186a = eVar;
    }

    private static String c(String str, c cVar, boolean z4) {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("Ɩ"));
        sb.append(str.replaceAll(ProtectedSandApp.s("Ɨ"), ""));
        sb.append(z4 ? cVar.tempExtension() : cVar.extension);
        return sb.toString();
    }

    @q0
    private File d(String str) throws FileNotFoundException {
        File file = new File(e(), c(str, c.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(e(), c(str, c.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    private File e() {
        File a5 = this.f39186a.a();
        if (a5.isFile()) {
            a5.delete();
        }
        if (!a5.exists()) {
            a5.mkdirs();
        }
        return a5;
    }

    public void a() {
        File e4 = e();
        if (e4.exists()) {
            File[] listFiles = e4.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File file : e4.listFiles()) {
                    file.delete();
                }
            }
            e4.delete();
        }
    }

    @n1
    @q0
    Pair<c, InputStream> b(String str) {
        try {
            File d5 = d(str);
            if (d5 == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(d5);
            c cVar = d5.getAbsolutePath().endsWith(ProtectedSandApp.s("Ƙ")) ? c.ZIP : c.JSON;
            StringBuilder a5 = androidx.appcompat.view.g.a(ProtectedSandApp.s("ƙ"), str, ProtectedSandApp.s("ƚ"));
            a5.append(d5.getAbsolutePath());
            com.airbnb.lottie.utils.f.a(a5.toString());
            return new Pair<>(cVar, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    void f(String str, c cVar) {
        File file = new File(e(), c(str, cVar, true));
        File file2 = new File(file.getAbsolutePath().replace(ProtectedSandApp.s("ƛ"), ""));
        boolean renameTo = file.renameTo(file2);
        com.airbnb.lottie.utils.f.a(ProtectedSandApp.s("Ɯ") + file2 + ProtectedSandApp.s("Ɲ"));
        if (renameTo) {
            return;
        }
        com.airbnb.lottie.utils.f.e(ProtectedSandApp.s("ƞ") + file.getAbsolutePath() + ProtectedSandApp.s("Ɵ") + file2.getAbsolutePath() + ProtectedSandApp.s("Ơ"));
    }

    File g(String str, InputStream inputStream, c cVar) throws IOException {
        File file = new File(e(), c(str, cVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } finally {
            inputStream.close();
        }
    }
}
