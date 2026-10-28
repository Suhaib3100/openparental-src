package okhttp3.internal.http;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.net.Proxy;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okhttp3.e0;
import okhttp3.w;

/* compiled from: RequestLine.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/http/i;", "", "Lokhttp3/e0;", "request", "Ljava/net/Proxy$Type;", "proxyType", "", "b", "", "a", "Lokhttp3/w;", "url", "c", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f30967a = new i();

    private i() {
    }

    private final boolean b(e0 request, Proxy.Type proxyType) {
        return !request.l() && proxyType == Proxy.Type.HTTP;
    }

    @d5.d
    public final String a(@d5.d e0 request, @d5.d Proxy.Type proxyType) {
        l0.p(request, ProtectedSandApp.s("挹"));
        l0.p(proxyType, ProtectedSandApp.s("挺"));
        StringBuilder sb = new StringBuilder();
        sb.append(request.m());
        sb.append(' ');
        i iVar = f30967a;
        if (iVar.b(request, proxyType)) {
            sb.append(request.q());
        } else {
            sb.append(iVar.c(request.q()));
        }
        sb.append(ProtectedSandApp.s("挻"));
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("挼"));
        return sb2;
    }

    @d5.d
    public final String c(@d5.d w url) {
        l0.p(url, ProtectedSandApp.s("挽"));
        String x5 = url.x();
        String z5 = url.z();
        if (z5 == null) {
            return x5;
        }
        return x5 + '?' + z5;
    }
}
