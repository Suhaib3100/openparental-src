package okhttp3.internal.http;

import androidx.collection.s;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.text.v;
import okhttp3.d0;
import okhttp3.e0;
import okhttp3.f0;
import okhttp3.g0;
import okhttp3.w;
import okio.a0;
import okio.n;

/* compiled from: CallServerInterceptor.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lokhttp3/internal/http/b;", "Lokhttp3/w;", "", "forWebSocket", "<init>", "(Z)V", "Lokhttp3/w$a;", "chain", "Lokhttp3/f0;", "intercept", "(Lokhttp3/w$a;)Lokhttp3/f0;", "b", "Z", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class b implements w {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean forWebSocket;

    public b(boolean z4) {
        this.forWebSocket = z4;
    }

    @Override // okhttp3.w
    @l
    public f0 intercept(@l w.a chain) throws IOException {
        boolean z4;
        f0.a aVar;
        l0.p(chain, ProtectedSandApp.s("\u0017"));
        g gVar = (g) chain;
        okhttp3.internal.connection.c exchange = gVar.getExchange();
        l0.m(exchange);
        d0 p4 = gVar.p();
        e0 f4 = p4.f();
        long currentTimeMillis = System.currentTimeMillis();
        exchange.w(p4);
        if (!f.b(p4.m()) || f4 == null) {
            exchange.o();
            z4 = true;
            aVar = null;
        } else {
            if (v.K1(ProtectedSandApp.s("\u0019"), p4.i(ProtectedSandApp.s("\u0018")), true)) {
                exchange.f();
                aVar = exchange.q(true);
                exchange.s();
                z4 = false;
            } else {
                z4 = true;
                aVar = null;
            }
            if (aVar != null) {
                exchange.o();
                if (!exchange.getConnection().C()) {
                    exchange.n();
                }
            } else if (f4.isDuplex()) {
                exchange.f();
                f4.writeTo(a0.c(exchange.c(p4, true)));
            } else {
                n c5 = a0.c(exchange.c(p4, false));
                f4.writeTo(c5);
                c5.close();
            }
        }
        if (f4 == null || !f4.isDuplex()) {
            exchange.e();
        }
        if (aVar == null) {
            aVar = exchange.q(false);
            l0.m(aVar);
            if (z4) {
                exchange.s();
                z4 = false;
            }
        }
        f0 c6 = aVar.E(p4).u(exchange.getConnection().getHandshake()).F(currentTimeMillis).C(System.currentTimeMillis()).c();
        int u4 = c6.u();
        if (u4 == 100) {
            f0.a q4 = exchange.q(false);
            l0.m(q4);
            if (z4) {
                exchange.s();
            }
            c6 = q4.E(p4).u(exchange.getConnection().getHandshake()).F(currentTimeMillis).C(System.currentTimeMillis()).c();
            u4 = c6.u();
        }
        exchange.r(c6);
        f0 c7 = (this.forWebSocket && u4 == 101) ? new f0.a(c6).b(okhttp3.internal.d.f84458c).c() : new f0.a(c6).b(exchange.p(c6)).c();
        d0 request = c7.getRequest();
        String s4 = ProtectedSandApp.s("\u001a");
        String i4 = request.i(s4);
        String s5 = ProtectedSandApp.s("\u001b");
        if (v.K1(s5, i4, true) || v.K1(s5, f0.C(c7, s4, null, 2, null), true)) {
            exchange.n();
        }
        if (u4 == 204 || u4 == 205) {
            g0 o4 = c7.o();
            if ((o4 != null ? o4.getContentLength() : -1L) > 0) {
                StringBuilder a5 = s.a(ProtectedSandApp.s("\u001c"), u4, ProtectedSandApp.s("\u001d"));
                g0 o5 = c7.o();
                a5.append(o5 != null ? Long.valueOf(o5.getContentLength()) : null);
                throw new ProtocolException(a5.toString());
            }
        }
        return c7;
    }
}
