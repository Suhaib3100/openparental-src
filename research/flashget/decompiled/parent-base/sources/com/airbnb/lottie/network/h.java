package com.airbnb.lottie.network;

import android.util.Pair;
import androidx.annotation.n1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.airbnb.lottie.k;
import com.airbnb.lottie.t0;
import com.airbnb.lottie.w;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

/* compiled from: NetworkFetcher.java */
/* loaded from: classes3.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    @o0
    private final g f39187a;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final f f39188b;

    public h(@o0 g gVar, @o0 f fVar) {
        this.f39187a = gVar;
        this.f39188b = fVar;
    }

    @n1
    @q0
    private k a(@o0 String str, @q0 String str2) {
        Pair<c, InputStream> b5;
        if (str2 == null || (b5 = this.f39187a.b(str)) == null) {
            return null;
        }
        c cVar = (c) b5.first;
        InputStream inputStream = (InputStream) b5.second;
        t0<k> L = cVar == c.ZIP ? w.L(new ZipInputStream(inputStream), str) : w.u(inputStream, str);
        if (L.b() != null) {
            return L.b();
        }
        return null;
    }

    @n1
    @o0
    private t0<k> b(@o0 String str, @q0 String str2) {
        String s4 = ProtectedSandApp.s("ơ");
        String s5 = ProtectedSandApp.s("Ƣ");
        com.airbnb.lottie.utils.f.a(ProtectedSandApp.s("ƣ") + str);
        Closeable closeable = null;
        try {
            try {
                d a5 = this.f39188b.a(str);
                if (!a5.r1()) {
                    t0<k> t0Var = new t0<>(new IllegalArgumentException(a5.Q2()));
                    try {
                        a5.close();
                    } catch (IOException e4) {
                        com.airbnb.lottie.utils.f.f(s4, e4);
                    }
                    return t0Var;
                }
                t0<k> d5 = d(str, a5.Z0(), a5.P0(), str2);
                StringBuilder sb = new StringBuilder(s5);
                sb.append(d5.b() != null);
                com.airbnb.lottie.utils.f.a(sb.toString());
                try {
                    a5.close();
                } catch (IOException e5) {
                    com.airbnb.lottie.utils.f.f(s4, e5);
                }
                return d5;
            } catch (Exception e6) {
                t0<k> t0Var2 = new t0<>(e6);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e7) {
                        com.airbnb.lottie.utils.f.f(s4, e7);
                    }
                }
                return t0Var2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException e10) {
                    com.airbnb.lottie.utils.f.f(s4, e10);
                }
            }
            throw th;
        }
    }

    @o0
    private t0<k> d(@o0 String str, @o0 InputStream inputStream, @q0 String str2, @q0 String str3) throws IOException {
        c cVar;
        t0<k> f4;
        if (str2 == null) {
            str2 = ProtectedSandApp.s("Ƥ");
        }
        if (str2.contains(ProtectedSandApp.s("ƥ")) || str2.contains(ProtectedSandApp.s("Ʀ")) || str2.contains(ProtectedSandApp.s("Ƨ")) || str.split(ProtectedSandApp.s("ƨ"))[0].endsWith(ProtectedSandApp.s("Ʃ"))) {
            com.airbnb.lottie.utils.f.a(ProtectedSandApp.s("ƫ"));
            cVar = c.ZIP;
            f4 = f(str, inputStream, str3);
        } else {
            com.airbnb.lottie.utils.f.a(ProtectedSandApp.s("ƪ"));
            cVar = c.JSON;
            f4 = e(str, inputStream, str3);
        }
        if (str3 != null && f4.b() != null) {
            this.f39187a.f(str, cVar);
        }
        return f4;
    }

    @o0
    private t0<k> e(@o0 String str, @o0 InputStream inputStream, @q0 String str2) throws IOException {
        return str2 == null ? w.u(inputStream, null) : w.u(new FileInputStream(this.f39187a.g(str, inputStream, c.JSON).getAbsolutePath()), str);
    }

    @o0
    private t0<k> f(@o0 String str, @o0 InputStream inputStream, @q0 String str2) throws IOException {
        return str2 == null ? w.L(new ZipInputStream(inputStream), null) : w.L(new ZipInputStream(new FileInputStream(this.f39187a.g(str, inputStream, c.ZIP))), str);
    }

    @n1
    @o0
    public t0<k> c(@o0 String str, @q0 String str2) {
        k a5 = a(str, str2);
        if (a5 != null) {
            return new t0<>(a5);
        }
        com.airbnb.lottie.utils.f.a(ProtectedSandApp.s("Ƭ") + str + ProtectedSandApp.s("ƭ"));
        return b(str, str2);
    }
}
