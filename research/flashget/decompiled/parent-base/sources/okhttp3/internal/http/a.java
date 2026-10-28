package okhttp3.internal.http;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.text.v;
import okhttp3.d0;
import okhttp3.e0;
import okhttp3.f0;
import okhttp3.g0;
import okhttp3.m;
import okhttp3.n;
import okhttp3.w;
import okhttp3.x;
import okio.a0;

/* compiled from: BridgeInterceptor.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/http/a;", "Lokhttp3/w;", "Lokhttp3/n;", "cookieJar", "<init>", "(Lokhttp3/n;)V", "", "Lokhttp3/m;", "cookies", "", "a", "(Ljava/util/List;)Ljava/lang/String;", "Lokhttp3/w$a;", "chain", "Lokhttp3/f0;", "intercept", "(Lokhttp3/w$a;)Lokhttp3/f0;", "b", "Lokhttp3/n;", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class a implements w {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final n cookieJar;

    public a(@l n nVar) {
        l0.p(nVar, ProtectedSandApp.s("\u0005"));
        this.cookieJar = nVar;
    }

    private final String a(List<m> cookies) {
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        for (Object obj : cookies) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                kotlin.collections.w.Z();
            }
            m mVar = (m) obj;
            if (i4 > 0) {
                sb.append(ProtectedSandApp.s("\u0006"));
            }
            sb.append(mVar.s());
            sb.append('=');
            sb.append(mVar.z());
            i4 = i5;
        }
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("\u0007"));
        return sb2;
    }

    @Override // okhttp3.w
    @l
    public f0 intercept(@l w.a chain) throws IOException {
        g0 o4;
        l0.p(chain, ProtectedSandApp.s("\b"));
        d0 request = chain.getRequest();
        request.getClass();
        d0.a aVar = new d0.a(request);
        e0 f4 = request.f();
        String s4 = ProtectedSandApp.s("\t");
        String s5 = ProtectedSandApp.s("\n");
        if (f4 != null) {
            x contentType = f4.getContentType();
            if (contentType != null) {
                aVar.n(s4, contentType.getMediaType());
            }
            long contentLength = f4.contentLength();
            String s6 = ProtectedSandApp.s("\u000b");
            if (contentLength != -1) {
                aVar.n(s5, String.valueOf(contentLength));
                aVar.t(s6);
            } else {
                aVar.n(s6, ProtectedSandApp.s("\f"));
                aVar.t(s5);
            }
        }
        String s7 = ProtectedSandApp.s("\r");
        boolean z4 = false;
        if (request.i(s7) == null) {
            aVar.n(s7, okhttp3.internal.d.b0(request.q(), false, 1, null));
        }
        String s10 = ProtectedSandApp.s("\u000e");
        if (request.i(s10) == null) {
            aVar.n(s10, ProtectedSandApp.s("\u000f"));
        }
        String s11 = ProtectedSandApp.s("\u0010");
        String i4 = request.i(s11);
        String s12 = ProtectedSandApp.s("\u0011");
        if (i4 == null && request.i(ProtectedSandApp.s("\u0012")) == null) {
            aVar.n(s11, s12);
            z4 = true;
        }
        List<m> a5 = this.cookieJar.a(request.q());
        if (!a5.isEmpty()) {
            aVar.n(ProtectedSandApp.s("\u0013"), a(a5));
        }
        String s13 = ProtectedSandApp.s("\u0014");
        if (request.i(s13) == null) {
            aVar.n(s13, ProtectedSandApp.s("\u0015"));
        }
        f0 c5 = chain.c(aVar.b());
        e.g(this.cookieJar, request.q(), c5.getHeaders());
        f0.a E = new f0.a(c5).E(request);
        if (z4) {
            String s14 = ProtectedSandApp.s("\u0016");
            if (v.K1(s12, f0.C(c5, s14, null, 2, null), true) && e.c(c5) && (o4 = c5.o()) != null) {
                okio.v vVar = new okio.v(o4.getSource());
                E.w(c5.getHeaders().m().l(s14).l(s5).i());
                E.b(new h(f0.C(c5, s4, null, 2, null), -1L, a0.d(vVar)));
            }
        }
        return E.c();
    }
}
