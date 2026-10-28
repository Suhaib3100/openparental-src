package okhttp3.internal.http;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a0;
import kotlin.jvm.internal.l0;
import okhttp3.e0;
import okhttp3.f0;
import okhttp3.g0;
import okhttp3.h0;
import okhttp3.m;
import okhttp3.n;
import okhttp3.x;
import okhttp3.y;
import okio.v;

/* compiled from: BridgeInterceptor.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/http/a;", "Lokhttp3/x;", "", "Lokhttp3/m;", "cookies", "", "b", "Lokhttp3/x$a;", "chain", "Lokhttp3/g0;", "a", "Lokhttp3/n;", "Lokhttp3/n;", "cookieJar", "<init>", "(Lokhttp3/n;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class a implements x {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final n cookieJar;

    public a(@d5.d n nVar) {
        l0.p(nVar, ProtectedSandApp.s("拔"));
        this.cookieJar = nVar;
    }

    private final String b(List<m> cookies) {
        StringBuilder sb = new StringBuilder();
        int i5 = 0;
        for (Object obj : cookies) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                a0.Z();
            }
            m mVar = (m) obj;
            if (i5 > 0) {
                sb.append(ProtectedSandApp.s("拕"));
            }
            sb.append(mVar.s());
            sb.append('=');
            sb.append(mVar.z());
            i5 = i6;
        }
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("拖"));
        return sb2;
    }

    @Override // okhttp3.x
    @d5.d
    public g0 a(@d5.d x.a chain) throws IOException {
        boolean K1;
        h0 t5;
        l0.p(chain, ProtectedSandApp.s("拗"));
        e0 request = chain.getRequest();
        request.getClass();
        e0.a aVar = new e0.a(request);
        f0 f6 = request.f();
        String s5 = ProtectedSandApp.s("拘");
        String s6 = ProtectedSandApp.s("拙");
        if (f6 != null) {
            y contentType = f6.getContentType();
            if (contentType != null) {
                aVar.n(s5, contentType.getMediaType());
            }
            long a6 = f6.a();
            String s7 = ProtectedSandApp.s("拚");
            if (a6 != -1) {
                aVar.n(s6, String.valueOf(a6));
                aVar.t(s7);
            } else {
                aVar.n(s7, ProtectedSandApp.s("招"));
                aVar.t(s6);
            }
        }
        String s8 = ProtectedSandApp.s("拜");
        boolean z5 = false;
        if (request.i(s8) == null) {
            aVar.n(s8, okhttp3.internal.d.b0(request.q(), false, 1, null));
        }
        String s9 = ProtectedSandApp.s("拝");
        if (request.i(s9) == null) {
            aVar.n(s9, ProtectedSandApp.s("拞"));
        }
        String s10 = ProtectedSandApp.s("拟");
        String i5 = request.i(s10);
        String s11 = ProtectedSandApp.s("拠");
        if (i5 == null && request.i(ProtectedSandApp.s("拡")) == null) {
            aVar.n(s10, s11);
            z5 = true;
        }
        List<m> b6 = this.cookieJar.b(request.q());
        if (!b6.isEmpty()) {
            aVar.n(ProtectedSandApp.s("拢"), b(b6));
        }
        String s12 = ProtectedSandApp.s("拣");
        if (request.i(s12) == null) {
            aVar.n(s12, ProtectedSandApp.s("拤"));
        }
        g0 e6 = chain.e(aVar.b());
        e.g(this.cookieJar, request.q(), e6.getHeaders());
        g0.a E = new g0.a(e6).E(request);
        if (z5) {
            String s13 = ProtectedSandApp.s("拥");
            K1 = kotlin.text.e0.K1(s11, g0.P(e6, s13, null, 2, null), true);
            if (K1 && e.c(e6) && (t5 = e6.t()) != null) {
                v vVar = new v(t5.getBodySource());
                E.w(e6.getHeaders().s().l(s13).l(s6).i());
                E.b(new h(g0.P(e6, s5, null, 2, null), -1L, okio.a0.d(vVar)));
            }
        }
        return E.c();
    }
}
