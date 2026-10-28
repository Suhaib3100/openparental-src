package okhttp3;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.Metadata;

/* compiled from: EventListener.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b&\u0018\u0000 :2\u00020\u0001:\u0002:;B\u0007¢\u0006\u0004\b>\u0010?J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J+\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0011\u0010\f\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\tH\u0016J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J+\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0011\u0010\u0012\u001a\r\u0012\t\u0012\u00070\u0011¢\u0006\u0002\b\u000b0\tH\u0016J \u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\nH\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J*\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016J2\u0010!\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0018\u0010$\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0016J\u0018\u0010%\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0016J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010)\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'H\u0016J\u0010\u0010*\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010-\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+H\u0016J\u0018\u0010.\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0010\u0010/\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00102\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00101\u001a\u000200H\u0016J\u0010\u00103\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00104\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+H\u0016J\u0018\u00105\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0010\u00106\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00107\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0010\u00108\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00109\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00101\u001a\u000200H\u0016J\u0018\u0010:\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00101\u001a\u000200H\u0016J\u0010\u0010;\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010=\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010<\u001a\u000200H\u0016¨\u0006@"}, d2 = {"Lokhttp3/r;", "", "Lokhttp3/e;", "call", "Lkotlin/m2;", "f", "Lokhttp3/w;", "url", "p", "", "Ljava/net/Proxy;", "Lp3/o;", "proxies", "o", "", "domainName", "n", "Ljava/net/InetAddress;", "inetAddressList", "m", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "proxy", "j", "C", "Lokhttp3/t;", "handshake", "B", "Lokhttp3/d0;", "protocol", "h", "Ljava/io/IOException;", "ioe", "i", "Lokhttp3/j;", "connection", "k", "l", "u", "Lokhttp3/e0;", "request", "t", "r", "", "byteCount", "q", "s", "z", "Lokhttp3/g0;", "response", "y", "w", "v", "x", "d", "e", "g", "A", "b", "c", "cachedResponse", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final r f31515a = new a();

    /* compiled from: EventListener.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okhttp3/r$a", "Lokhttp3/r;", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes6.dex */
    public static final class a extends r {
        a() {
        }
    }

    /* compiled from: EventListener.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lokhttp3/r$c;", "", "Lokhttp3/e;", "call", "Lokhttp3/r;", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
    public interface c {
        @d5.d
        r a(@d5.d e call);
    }

    public void A(@d5.d e eVar, @d5.d g0 g0Var) {
        kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("暧"));
        kotlin.jvm.internal.l0.p(g0Var, ProtectedSandApp.s("暨"));
    }

    public void B(@d5.d e eVar, @d5.e t tVar) {
        kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("暩"));
    }

    public void C(@d5.d e eVar) {
        kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("暪"));
    }

    public void a(@d5.d e eVar, @d5.d g0 g0Var) {
        kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("暫"));
        kotlin.jvm.internal.l0.p(g0Var, ProtectedSandApp.s("暬"));
    }

    public void b(@d5.d e eVar, @d5.d g0 g0Var) {
        kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("暭"));
        kotlin.jvm.internal.l0.p(g0Var, ProtectedSandApp.s("暮"));
    }

    public void c(@d5.d e eVar) {
        kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("暯"));
    }

    public void d(@d5.d e eVar) {
        kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("暰"));
    }

    public void e(@d5.d e eVar, @d5.d IOException iOException) {
        kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("暱"));
        kotlin.jvm.internal.l0.p(iOException, ProtectedSandApp.s("暲"));
    }

    public void f(@d5.d e eVar) {
        kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("暳"));
    }

    public void g(@d5.d e eVar) {
        kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("暴"));
    }

    public void h(@d5.d e eVar, @d5.d InetSocketAddress inetSocketAddress, @d5.d Proxy proxy, @d5.e d0 d0Var) {
        kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("暵"));
        kotlin.jvm.internal.l0.p(inetSocketAddress, ProtectedSandApp.s("暶"));
        kotlin.jvm.internal.l0.p(proxy, ProtectedSandApp.s("暷"));
    }

    public void i(@d5.d e eVar, @d5.d InetSocketAddress inetSocketAddress, @d5.d Proxy proxy, @d5.e d0 d0Var, @d5.d IOException iOException) {
        kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("暸"));
        kotlin.jvm.internal.l0.p(inetSocketAddress, ProtectedSandApp.s("暹"));
        kotlin.jvm.internal.l0.p(proxy, ProtectedSandApp.s("暺"));
        kotlin.jvm.internal.l0.p(iOException, ProtectedSandApp.s("暻"));
    }

    public void j(@d5.d e eVar, @d5.d InetSocketAddress inetSocketAddress, @d5.d Proxy proxy) {
        kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("暼"));
        kotlin.jvm.internal.l0.p(inetSocketAddress, ProtectedSandApp.s("暽"));
        kotlin.jvm.internal.l0.p(proxy, ProtectedSandApp.s("暾"));
    }

    public void k(@d5.d e eVar, @d5.d j jVar) {
        kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("暿"));
        kotlin.jvm.internal.l0.p(jVar, ProtectedSandApp.s("曀"));
    }

    public void l(@d5.d e eVar, @d5.d j jVar) {
        kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("曁"));
        kotlin.jvm.internal.l0.p(jVar, ProtectedSandApp.s("曂"));
    }

    public void m(@d5.d e eVar, @d5.d String str, @d5.d List<InetAddress> list) {
        kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("曃"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("曄"));
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("曅"));
    }

    public void n(@d5.d e eVar, @d5.d String str) {
        kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("曆"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("曇"));
    }

    public void o(@d5.d e eVar, @d5.d w wVar, @d5.d List<Proxy> list) {
        kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("曈"));
        kotlin.jvm.internal.l0.p(wVar, ProtectedSandApp.s("曉"));
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("曊"));
    }

    public void p(@d5.d e eVar, @d5.d w wVar) {
        kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("曋"));
        kotlin.jvm.internal.l0.p(wVar, ProtectedSandApp.s("曌"));
    }

    public void q(@d5.d e eVar, long j5) {
        kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("曍"));
    }

    public void r(@d5.d e eVar) {
        kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("曎"));
    }

    public void s(@d5.d e eVar, @d5.d IOException iOException) {
        kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("曏"));
        kotlin.jvm.internal.l0.p(iOException, ProtectedSandApp.s("曐"));
    }

    public void t(@d5.d e eVar, @d5.d e0 e0Var) {
        kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("曑"));
        kotlin.jvm.internal.l0.p(e0Var, ProtectedSandApp.s("曒"));
    }

    public void u(@d5.d e eVar) {
        kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("曓"));
    }

    public void v(@d5.d e eVar, long j5) {
        kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("曔"));
    }

    public void w(@d5.d e eVar) {
        kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("曕"));
    }

    public void x(@d5.d e eVar, @d5.d IOException iOException) {
        kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("曖"));
        kotlin.jvm.internal.l0.p(iOException, ProtectedSandApp.s("曗"));
    }

    public void y(@d5.d e eVar, @d5.d g0 g0Var) {
        kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("曘"));
        kotlin.jvm.internal.l0.p(g0Var, ProtectedSandApp.s("曙"));
    }

    public void z(@d5.d e eVar) {
        kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("曚"));
    }
}
