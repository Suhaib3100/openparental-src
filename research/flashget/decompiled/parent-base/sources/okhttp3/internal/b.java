package okhttp3.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import javax.net.ssl.SSLSocket;
import kd.i;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.u;
import okhttp3.v;

/* compiled from: internal.kt */
@i(name = "Internal")
@Metadata(d1 = {"\u0000T\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012\u001a%\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001f\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001d\u001a%\u0010$\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\n¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"", "currentTimeMillis", "Lokhttp3/v;", "url", "", "setCookie", "Lokhttp3/m;", "f", "(JLokhttp3/v;Ljava/lang/String;)Lokhttp3/m;", "cookie", "", "forObsoleteRfc2965", "e", "(Lokhttp3/m;Z)Ljava/lang/String;", "Lokhttp3/u$a;", "builder", "line", "a", "(Lokhttp3/u$a;Ljava/lang/String;)Lokhttp3/u$a;", "name", "value", "b", "(Lokhttp3/u$a;Ljava/lang/String;Ljava/lang/String;)Lokhttp3/u$a;", "Lokhttp3/c;", "cache", "Lokhttp3/d0;", "request", "Lokhttp3/f0;", "d", "(Lokhttp3/c;Lokhttp3/d0;)Lokhttp3/f0;", "Lokhttp3/l;", "connectionSpec", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "isFallback", "Lkotlin/k2;", "c", "(Lokhttp3/l;Ljavax/net/ssl/SSLSocket;Z)V", "okhttp"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class b {
    @l
    public static final u.a a(@l u.a aVar, @l String str) {
        l0.p(aVar, ProtectedSandApp.s("鿬\u0001"));
        l0.p(str, ProtectedSandApp.s("鿭\u0001"));
        return aVar.f(str);
    }

    @l
    public static final u.a b(@l u.a aVar, @l String str, @l String str2) {
        l0.p(aVar, ProtectedSandApp.s("鿬\u0001"));
        l0.p(str, ProtectedSandApp.s("鿮\u0001"));
        l0.p(str2, ProtectedSandApp.s("鿯\u0001"));
        return aVar.g(str, str2);
    }

    public static final void c(@l okhttp3.l lVar, @l SSLSocket sSLSocket, boolean z4) {
        l0.p(lVar, ProtectedSandApp.s("鿰\u0001"));
        l0.p(sSLSocket, ProtectedSandApp.s("鿱\u0001"));
        lVar.f(sSLSocket, z4);
    }

    @m
    public static final f0 d(@l okhttp3.c cVar, @l d0 d0Var) {
        l0.p(cVar, ProtectedSandApp.s("鿲\u0001"));
        l0.p(d0Var, ProtectedSandApp.s("鿳\u0001"));
        return cVar.f(d0Var);
    }

    @l
    public static final String e(@l okhttp3.m mVar, boolean z4) {
        l0.p(mVar, ProtectedSandApp.s("鿴\u0001"));
        return mVar.y(z4);
    }

    @m
    public static final okhttp3.m f(long j4, @l v vVar, @l String str) {
        l0.p(vVar, ProtectedSandApp.s("鿵\u0001"));
        l0.p(str, ProtectedSandApp.s("鿶\u0001"));
        return okhttp3.m.INSTANCE.f(j4, vVar, str);
    }
}
