package okhttp3.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.e;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okhttp3.e0;
import okhttp3.g0;
import okhttp3.l;
import okhttp3.m;
import okhttp3.v;
import okhttp3.w;
import p3.i;

/* compiled from: internal.kt */
@i(name = "Internal")
@Metadata(d1 = {"\u0000R\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t\u001a\u0016\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004\u001a\u001e\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004\u001a\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015\u001a\u001e\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\t¨\u0006 "}, d2 = {"", "currentTimeMillis", "Lokhttp3/w;", "url", "", "setCookie", "Lokhttp3/m;", "f", "cookie", "", "forObsoleteRfc2965", "e", "Lokhttp3/v$a;", "builder", "line", "a", "name", "value", "b", "Lokhttp3/c;", "cache", "Lokhttp3/e0;", "request", "Lokhttp3/g0;", "d", "Lokhttp3/l;", "connectionSpec", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "isFallback", "Lkotlin/m2;", "c", "okhttp"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class b {
    @d5.d
    public static final v.a a(@d5.d v.a aVar, @d5.d String str) {
        l0.p(aVar, ProtectedSandApp.s("惑"));
        l0.p(str, ProtectedSandApp.s("惒"));
        return aVar.f(str);
    }

    @d5.d
    public static final v.a b(@d5.d v.a aVar, @d5.d String str, @d5.d String str2) {
        l0.p(aVar, ProtectedSandApp.s("惓"));
        l0.p(str, ProtectedSandApp.s("惔"));
        l0.p(str2, ProtectedSandApp.s("惕"));
        return aVar.g(str, str2);
    }

    public static final void c(@d5.d l lVar, @d5.d SSLSocket sSLSocket, boolean z5) {
        l0.p(lVar, ProtectedSandApp.s("惖"));
        l0.p(sSLSocket, ProtectedSandApp.s("惗"));
        lVar.f(sSLSocket, z5);
    }

    @e
    public static final g0 d(@d5.d okhttp3.c cVar, @d5.d e0 e0Var) {
        l0.p(cVar, ProtectedSandApp.s("惘"));
        l0.p(e0Var, ProtectedSandApp.s("惙"));
        return cVar.g(e0Var);
    }

    @d5.d
    public static final String e(@d5.d m mVar, boolean z5) {
        l0.p(mVar, ProtectedSandApp.s("惚"));
        return mVar.y(z5);
    }

    @e
    public static final m f(long j5, @d5.d w wVar, @d5.d String str) {
        l0.p(wVar, ProtectedSandApp.s("惛"));
        l0.p(str, ProtectedSandApp.s("惜"));
        return m.INSTANCE.f(j5, wVar, str);
    }
}
