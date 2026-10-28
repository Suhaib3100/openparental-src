package okhttp3.internal.http;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.net.Proxy;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okhttp3.d0;
import okhttp3.v;

/* compiled from: RequestLine.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/http/i;", "", "<init>", "()V", "Lokhttp3/d0;", "request", "Ljava/net/Proxy$Type;", "proxyType", "", "b", "(Lokhttp3/d0;Ljava/net/Proxy$Type;)Z", "", "a", "(Lokhttp3/d0;Ljava/net/Proxy$Type;)Ljava/lang/String;", "Lokhttp3/v;", "url", "c", "(Lokhttp3/v;)Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f84494a = new i();

    private i() {
    }

    private final boolean b(d0 request, Proxy.Type proxyType) {
        return !request.l() && proxyType == Proxy.Type.HTTP;
    }

    @l
    public final String a(@l d0 request, @l Proxy.Type proxyType) {
        l0.p(request, ProtectedSandApp.s("\\"));
        l0.p(proxyType, ProtectedSandApp.s("]"));
        StringBuilder sb = new StringBuilder();
        sb.append(request.m());
        sb.append(' ');
        i iVar = f84494a;
        if (iVar.b(request, proxyType)) {
            sb.append(request.q());
        } else {
            sb.append(iVar.c(request.q()));
        }
        sb.append(ProtectedSandApp.s("^"));
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("_"));
        return sb2;
    }

    @l
    public final String c(@l v url) {
        l0.p(url, ProtectedSandApp.s("`"));
        String x4 = url.x();
        String z4 = url.z();
        if (z4 == null) {
            return x4;
        }
        return x4 + '?' + z4;
    }
}
