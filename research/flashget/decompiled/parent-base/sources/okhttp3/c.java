package okhttp3;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.t1;
import kotlin.k2;
import kotlin.text.m0;
import kotlin.x0;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.internal.cache.d;
import okhttp3.internal.platform.j;
import okhttp3.u;
import okio.o0;
import okio.p;

/* compiled from: Cache.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010)\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u00042\u0010#EB!\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0018\u00010\fR\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u000f¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u000f¢\u0006\u0004\b#\u0010\"J\r\u0010$\u001a\u00020\u000f¢\u0006\u0004\b$\u0010\"J\u0013\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%¢\u0006\u0004\b'\u0010(J\r\u0010*\u001a\u00020)¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020)¢\u0006\u0004\b,\u0010+J\r\u0010-\u001a\u00020\u0005¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u0005¢\u0006\u0004\b/\u0010.J\u000f\u00100\u001a\u00020\u000fH\u0016¢\u0006\u0004\b0\u0010\"J\u000f\u00101\u001a\u00020\u000fH\u0016¢\u0006\u0004\b1\u0010\"J\u000f\u00102\u001a\u00020\u0003H\u0007¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\u000f2\u0006\u00105\u001a\u000204H\u0000¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u000fH\u0000¢\u0006\u0004\b8\u0010\"J\r\u00109\u001a\u00020)¢\u0006\u0004\b9\u0010+J\r\u0010:\u001a\u00020)¢\u0006\u0004\b:\u0010+J\r\u0010;\u001a\u00020)¢\u0006\u0004\b;\u0010+R\u001a\u0010?\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010<\u001a\u0004\b=\u0010>R\"\u0010D\u001a\u00020)8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010@\u001a\u0004\bA\u0010+\"\u0004\bB\u0010CR\"\u0010H\u001a\u00020)8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bE\u0010@\u001a\u0004\bF\u0010+\"\u0004\bG\u0010CR\u0016\u0010I\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010@R\u0016\u0010J\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010@R\u0016\u0010K\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010@R\u0011\u0010M\u001a\u00020L8F¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0011\u0010\u0004\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\bE\u00103¨\u0006O"}, d2 = {"Lokhttp3/c;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Ljava/io/File;", "directory", "", "maxSize", "Lokhttp3/internal/io/a;", "fileSystem", "<init>", "(Ljava/io/File;JLokhttp3/internal/io/a;)V", "(Ljava/io/File;J)V", "Lokhttp3/internal/cache/d$b;", "Lokhttp3/internal/cache/d;", "editor", "Lkotlin/k2;", "b", "(Lokhttp3/internal/cache/d$b;)V", "Lokhttp3/d0;", "request", "Lokhttp3/f0;", "f", "(Lokhttp3/d0;)Lokhttp3/f0;", "response", "Lokhttp3/internal/cache/b;", "q", "(Lokhttp3/f0;)Lokhttp3/internal/cache/b;", "s", "(Lokhttp3/d0;)V", "cached", "network", "B", "(Lokhttp3/f0;Lokhttp3/f0;)V", "l", "()V", "c", "e", "", "", "C", "()Ljava/util/Iterator;", "", "D", "()I", "E", "size", "()J", "n", "flush", "close", "a", "()Ljava/io/File;", "Lokhttp3/internal/cache/c;", "cacheStrategy", "z", "(Lokhttp3/internal/cache/c;)V", "y", "o", "k", "t", "Lokhttp3/internal/cache/d;", "g", "()Lokhttp3/internal/cache/d;", "cache", "I", "i", "x", "(I)V", "writeSuccessCount", "d", "h", "u", "writeAbortCount", "networkCount", "hitCount", "requestCount", "", "isClosed", "()Z", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class c implements Closeable, Flushable {

    /* renamed from: h, reason: collision with root package name */
    private static final int f84015h = 201105;

    /* renamed from: i, reason: collision with root package name */
    private static final int f84016i = 0;

    /* renamed from: j, reason: collision with root package name */
    private static final int f84017j = 1;

    /* renamed from: k, reason: collision with root package name */
    private static final int f84018k = 2;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final okhttp3.internal.cache.d cache;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int writeSuccessCount;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int writeAbortCount;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int networkCount;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int hitCount;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int requestCount;

    /* compiled from: Cache.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001b¨\u0006\u001c"}, d2 = {"Lokhttp3/c$a;", "Lokhttp3/g0;", "Lokhttp3/internal/cache/d$d;", "Lokhttp3/internal/cache/d;", "snapshot", "", "contentType", "contentLength", "<init>", "(Lokhttp3/internal/cache/d$d;Ljava/lang/String;Ljava/lang/String;)V", "Lokhttp3/x;", "h", "()Lokhttp3/x;", "", "g", "()J", "Lokio/o;", "t", "()Lokio/o;", "d", "Lokio/o;", "bodySource", "e", "Lokhttp3/internal/cache/d$d;", "x", "()Lokhttp3/internal/cache/d$d;", "f", "Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 4, 0})
    private static final class a extends g0 {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final okio.o bodySource;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final d.C1311d snapshot;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final String contentType;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final String contentLength;

        /* compiled from: Cache.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"okhttp3/c$a$a", "Lokio/s;", "Lkotlin/k2;", "close", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: okhttp3.c$a$a, reason: collision with other inner class name */
        public static final class C1307a extends okio.s {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ o0 f84031d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1307a(o0 o0Var, o0 o0Var2) {
                super(o0Var2);
                this.f84031d = o0Var;
            }

            @Override // okio.s, okio.o0, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                a.this.getSnapshot().close();
                super.close();
            }
        }

        public a(@fg.l d.C1311d c1311d, @fg.m String str, @fg.m String str2) {
            l0.p(c1311d, ProtectedSandApp.s("鹤\u0001"));
            this.snapshot = c1311d;
            this.contentType = str;
            this.contentLength = str2;
            o0 c5 = c1311d.c(1);
            this.bodySource = okio.a0.d(new C1307a(c5, c5));
        }

        @Override // okhttp3.g0
        /* renamed from: g */
        public long getContentLength() {
            String str = this.contentLength;
            if (str != null) {
                return okhttp3.internal.d.e0(str, -1L);
            }
            return -1L;
        }

        @Override // okhttp3.g0
        @fg.m
        /* renamed from: h */
        public x getF84143e() {
            String str = this.contentType;
            if (str != null) {
                return x.INSTANCE.d(str);
            }
            return null;
        }

        @Override // okhttp3.g0
        @fg.l
        /* renamed from: t, reason: from getter */
        public okio.o getSource() {
            return this.bodySource;
        }

        @fg.l
        /* renamed from: x, reason: from getter */
        public final d.C1311d getSnapshot() {
            return this.snapshot;
        }
    }

    /* compiled from: Cache.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001e\u001a\u00020\u001b*\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010 \u001a\u00020\u0004*\u00020\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010%\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010#R\u0014\u0010&\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010#¨\u0006'"}, d2 = {"Lokhttp3/c$b;", "", "<init>", "()V", "Lokhttp3/u;", "", "", "d", "(Lokhttp3/u;)Ljava/util/Set;", "requestHeaders", "responseHeaders", "e", "(Lokhttp3/u;Lokhttp3/u;)Lokhttp3/u;", "Lokhttp3/v;", "url", "b", "(Lokhttp3/v;)Ljava/lang/String;", "Lokio/o;", "source", "", "c", "(Lokio/o;)I", "Lokhttp3/f0;", "cachedResponse", "cachedRequest", "Lokhttp3/d0;", "newRequest", "", "g", "(Lokhttp3/f0;Lokhttp3/u;Lokhttp3/d0;)Z", "a", "(Lokhttp3/f0;)Z", "f", "(Lokhttp3/f0;)Lokhttp3/u;", "ENTRY_BODY", "I", "ENTRY_COUNT", "ENTRY_METADATA", "VERSION", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.c$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        private final Set<String> d(u uVar) {
            int size = uVar.size();
            TreeSet treeSet = null;
            for (int i4 = 0; i4 < size; i4++) {
                if (kotlin.text.v.K1(ProtectedSandApp.s("鹥\u0001"), uVar.j(i4), true)) {
                    String s4 = uVar.s(i4);
                    if (treeSet == null) {
                        treeSet = new TreeSet(kotlin.text.v.Q1(t1.f75371a));
                    }
                    for (String str : kotlin.text.v.Q4(s4, new char[]{','}, false, 0, 6, null)) {
                        if (str == null) {
                            throw new NullPointerException(ProtectedSandApp.s("鹦\u0001"));
                        }
                        treeSet.add(kotlin.text.v.C5(str).toString());
                    }
                }
            }
            return treeSet != null ? treeSet : kotlin.collections.l0.f74939b;
        }

        private final u e(u requestHeaders, u responseHeaders) {
            Set<String> d5 = d(responseHeaders);
            if (d5.isEmpty()) {
                return okhttp3.internal.d.f84457b;
            }
            u.a aVar = new u.a();
            int size = requestHeaders.size();
            for (int i4 = 0; i4 < size; i4++) {
                String j4 = requestHeaders.j(i4);
                if (d5.contains(j4)) {
                    aVar.b(j4, requestHeaders.s(i4));
                }
            }
            return aVar.i();
        }

        public final boolean a(@fg.l f0 f0Var) {
            l0.p(f0Var, ProtectedSandApp.s("鹧\u0001"));
            return d(f0Var.getHeaders()).contains(ProtectedSandApp.s("鹨\u0001"));
        }

        @fg.l
        @kd.n
        public final String b(@fg.l v url) {
            l0.p(url, ProtectedSandApp.s("鹩\u0001"));
            return okio.p.INSTANCE.l(url.getUrl()).Q().s();
        }

        public final int c(@fg.l okio.o source) throws IOException {
            String s4 = ProtectedSandApp.s("鹪\u0001");
            l0.p(source, ProtectedSandApp.s("鹫\u0001"));
            try {
                long y22 = source.y2();
                String m12 = source.m1();
                if (y22 >= 0 && y22 <= Integer.MAX_VALUE && m12.length() <= 0) {
                    return (int) y22;
                }
                throw new IOException(s4 + y22 + m12 + m0.quote);
            } catch (NumberFormatException e4) {
                throw new IOException(e4.getMessage());
            }
        }

        @fg.l
        public final u f(@fg.l f0 f0Var) {
            l0.p(f0Var, ProtectedSandApp.s("鹬\u0001"));
            f0 networkResponse = f0Var.getNetworkResponse();
            l0.m(networkResponse);
            return e(networkResponse.getRequest().k(), f0Var.getHeaders());
        }

        public final boolean g(@fg.l f0 cachedResponse, @fg.l u cachedRequest, @fg.l d0 newRequest) {
            l0.p(cachedResponse, ProtectedSandApp.s("鹭\u0001"));
            l0.p(cachedRequest, ProtectedSandApp.s("鹮\u0001"));
            l0.p(newRequest, ProtectedSandApp.s("鹯\u0001"));
            Set<String> d5 = d(cachedResponse.getHeaders());
            if ((d5 instanceof Collection) && d5.isEmpty()) {
                return true;
            }
            for (String str : d5) {
                if (!l0.g(cachedRequest.v(str), newRequest.j(str))) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    /* compiled from: Cache.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\"\u0010\u0017\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018¨\u0006\u0019"}, d2 = {"Lokhttp3/c$d;", "Lokhttp3/internal/cache/b;", "Lokhttp3/internal/cache/d$b;", "Lokhttp3/internal/cache/d;", "editor", "<init>", "(Lokhttp3/c;Lokhttp3/internal/cache/d$b;)V", "Lkotlin/k2;", "abort", "()V", "Lokio/m0;", "a", "()Lokio/m0;", "Lokio/m0;", "cacheOut", "b", "body", "", "c", "Z", "()Z", "d", "(Z)V", "done", "Lokhttp3/internal/cache/d$b;", "okhttp"}, k = 1, mv = {1, 4, 0})
    private final class d implements okhttp3.internal.cache.b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final okio.m0 cacheOut;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final okio.m0 body;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean done;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final d.b editor;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ c f84049e;

        /* compiled from: Cache.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"okhttp3/c$d$a", "Lokio/r;", "Lkotlin/k2;", "close", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
        public static final class a extends okio.r {
            a(okio.m0 m0Var) {
                super(m0Var);
            }

            @Override // okio.r, okio.m0, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                synchronized (d.this.f84049e) {
                    if (d.this.getDone()) {
                        return;
                    }
                    d.this.d(true);
                    c cVar = d.this.f84049e;
                    cVar.x(cVar.getWriteSuccessCount() + 1);
                    super.close();
                    d.this.editor.b();
                }
            }
        }

        public d(@fg.l c cVar, d.b bVar) {
            l0.p(bVar, ProtectedSandApp.s("鹾\u0001"));
            this.f84049e = cVar;
            this.editor = bVar;
            okio.m0 f4 = bVar.f(1);
            this.cacheOut = f4;
            this.body = new a(f4);
        }

        @Override // okhttp3.internal.cache.b
        @fg.l
        /* renamed from: a, reason: from getter */
        public okio.m0 getBody() {
            return this.body;
        }

        @Override // okhttp3.internal.cache.b
        public void abort() {
            synchronized (this.f84049e) {
                if (this.done) {
                    return;
                }
                this.done = true;
                c cVar = this.f84049e;
                cVar.u(cVar.getWriteAbortCount() + 1);
                okhttp3.internal.d.l(this.cacheOut);
                try {
                    this.editor.a();
                } catch (IOException unused) {
                }
            }
        }

        /* renamed from: c, reason: from getter */
        public final boolean getDone() {
            return this.done;
        }

        public final void d(boolean z4) {
            this.done = z4;
        }
    }

    /* compiled from: Cache.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001e\u0010\u000e\u001a\f\u0012\b\u0012\u00060\u000bR\u00020\f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"okhttp3/c$e", "", "", "", "hasNext", "()Z", "b", "()Ljava/lang/String;", "Lkotlin/k2;", "remove", "()V", "Lokhttp3/internal/cache/d$d;", "Lokhttp3/internal/cache/d;", "Ljava/util/Iterator;", "delegate", "c", "Ljava/lang/String;", "nextUrl", "d", "Z", "canRemove", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class e implements Iterator<String>, md.d {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Iterator<d.C1311d> delegate;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private String nextUrl;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean canRemove;

        e() {
            this.delegate = c.this.getCache().n0();
        }

        @Override // java.util.Iterator
        @fg.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.nextUrl;
            l0.m(str);
            this.nextUrl = null;
            this.canRemove = true;
            return str;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.nextUrl != null) {
                return true;
            }
            this.canRemove = false;
            while (this.delegate.hasNext()) {
                try {
                    d.C1311d next = this.delegate.next();
                    try {
                        continue;
                        this.nextUrl = okio.a0.d(next.c(0)).m1();
                        kotlin.io.b.a(next, null);
                        return true;
                    } finally {
                        try {
                            continue;
                        } catch (Throwable th) {
                        }
                    }
                } catch (IOException unused) {
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.canRemove) {
                throw new IllegalStateException(ProtectedSandApp.s("鹿\u0001"));
            }
            this.delegate.remove();
        }
    }

    public c(@fg.l File file, long j4, @fg.l okhttp3.internal.io.a aVar) {
        l0.p(file, ProtectedSandApp.s("麎\u0001"));
        l0.p(aVar, ProtectedSandApp.s("麏\u0001"));
        this.cache = new okhttp3.internal.cache.d(aVar, file, f84015h, 2, j4, okhttp3.internal.concurrent.d.f84336h);
    }

    private final void b(d.b editor) {
        if (editor != null) {
            try {
                editor.a();
            } catch (IOException unused) {
            }
        }
    }

    @fg.l
    @kd.n
    public static final String m(@fg.l v vVar) {
        return INSTANCE.b(vVar);
    }

    public final void B(@fg.l f0 cached, @fg.l f0 network) {
        d.b bVar;
        l0.p(cached, ProtectedSandApp.s("麐\u0001"));
        l0.p(network, ProtectedSandApp.s("麑\u0001"));
        C1308c c1308c = new C1308c(network);
        g0 o4 = cached.o();
        if (o4 == null) {
            throw new NullPointerException(ProtectedSandApp.s("麒\u0001"));
        }
        try {
            bVar = ((a) o4).getSnapshot().a();
            if (bVar != null) {
                try {
                    c1308c.f(bVar);
                    bVar.b();
                } catch (IOException unused) {
                    b(bVar);
                }
            }
        } catch (IOException unused2) {
            bVar = null;
        }
    }

    @fg.l
    public final Iterator<String> C() throws IOException {
        return new e();
    }

    public final synchronized int D() {
        return this.writeAbortCount;
    }

    public final synchronized int E() {
        return this.writeSuccessCount;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "directory", imports = {}))
    @kd.i(name = "-deprecated_directory")
    public final File a() {
        return this.cache.getDirectory();
    }

    public final void c() throws IOException {
        this.cache.u();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.cache.close();
    }

    @fg.l
    @kd.i(name = "directory")
    public final File d() {
        return this.cache.getDirectory();
    }

    public final void e() throws IOException {
        this.cache.B();
    }

    @fg.m
    public final f0 f(@fg.l d0 request) {
        l0.p(request, ProtectedSandApp.s("麓\u0001"));
        try {
            d.C1311d C = this.cache.C(INSTANCE.b(request.q()));
            if (C != null) {
                try {
                    C1308c c1308c = new C1308c(C.c(0));
                    f0 d5 = c1308c.d(C);
                    if (c1308c.b(request, d5)) {
                        return d5;
                    }
                    g0 o4 = d5.o();
                    if (o4 != null) {
                        okhttp3.internal.d.l(o4);
                    }
                    return null;
                } catch (IOException unused) {
                    okhttp3.internal.d.l(C);
                }
            }
        } catch (IOException unused2) {
        }
        return null;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.cache.flush();
    }

    @fg.l
    /* renamed from: g, reason: from getter */
    public final okhttp3.internal.cache.d getCache() {
        return this.cache;
    }

    /* renamed from: h, reason: from getter */
    public final int getWriteAbortCount() {
        return this.writeAbortCount;
    }

    /* renamed from: i, reason: from getter */
    public final int getWriteSuccessCount() {
        return this.writeSuccessCount;
    }

    public final boolean isClosed() {
        return this.cache.isClosed();
    }

    public final synchronized int k() {
        return this.hitCount;
    }

    public final void l() throws IOException {
        this.cache.J();
    }

    public final long n() {
        return this.cache.H();
    }

    public final synchronized int o() {
        return this.networkCount;
    }

    @fg.m
    public final okhttp3.internal.cache.b q(@fg.l f0 response) {
        d.b bVar;
        l0.p(response, ProtectedSandApp.s("麔\u0001"));
        String m4 = response.getRequest().m();
        if (okhttp3.internal.http.f.f84481a.a(response.getRequest().m())) {
            try {
                s(response.getRequest());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!l0.g(m4, ProtectedSandApp.s("麕\u0001"))) {
            return null;
        }
        Companion companion = INSTANCE;
        if (companion.a(response)) {
            return null;
        }
        C1308c c1308c = new C1308c(response);
        try {
            bVar = okhttp3.internal.cache.d.z(this.cache, companion.b(response.getRequest().q()), 0L, 2, null);
            if (bVar == null) {
                return null;
            }
            try {
                c1308c.f(bVar);
                return new d(this, bVar);
            } catch (IOException unused2) {
                b(bVar);
                return null;
            }
        } catch (IOException unused3) {
            bVar = null;
        }
    }

    public final void s(@fg.l d0 request) throws IOException {
        l0.p(request, ProtectedSandApp.s("麓\u0001"));
        this.cache.S(INSTANCE.b(request.q()));
    }

    public final long size() throws IOException {
        return this.cache.size();
    }

    public final synchronized int t() {
        return this.requestCount;
    }

    public final void u(int i4) {
        this.writeAbortCount = i4;
    }

    public final void x(int i4) {
        this.writeSuccessCount = i4;
    }

    public final synchronized void y() {
        this.hitCount++;
    }

    public final synchronized void z(@fg.l okhttp3.internal.cache.c cacheStrategy) {
        try {
            l0.p(cacheStrategy, ProtectedSandApp.s("麖\u0001"));
            this.requestCount++;
            if (cacheStrategy.getNetworkRequest() != null) {
                this.networkCount++;
            } else if (cacheStrategy.getCacheResponse() != null) {
                this.hitCount++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@fg.l File file, long j4) {
        this(file, j4, okhttp3.internal.io.a.f84800a);
        l0.p(file, ProtectedSandApp.s("麎\u0001"));
    }

    /* compiled from: Cache.kt */
    @Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\b\u0002\u0018\u0000 @2\u00020\u0001:\u0001$B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u00020\u00122\n\u0010\u0017\u001a\u00060\u0015R\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\u00062\n\u0010 \u001a\u00060\u001fR\u00020\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010(R\u0014\u0010*\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010%R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010,R\u0014\u00100\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010/R\u0014\u00101\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010%R\u0014\u00103\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010(R\u0016\u00107\u001a\u0004\u0018\u0001048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010=\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010:R\u0014\u0010?\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010>¨\u0006A"}, d2 = {"Lokhttp3/c$c;", "", "Lokio/o0;", "rawSource", "<init>", "(Lokio/o0;)V", "Lokhttp3/f0;", "response", "(Lokhttp3/f0;)V", "Lokio/o;", "source", "", "Ljava/security/cert/Certificate;", "c", "(Lokio/o;)Ljava/util/List;", "Lokio/n;", "sink", "certificates", "Lkotlin/k2;", "e", "(Lokio/n;Ljava/util/List;)V", "Lokhttp3/internal/cache/d$b;", "Lokhttp3/internal/cache/d;", "editor", "f", "(Lokhttp3/internal/cache/d$b;)V", "Lokhttp3/d0;", "request", "", "b", "(Lokhttp3/d0;Lokhttp3/f0;)Z", "Lokhttp3/internal/cache/d$d;", "snapshot", "d", "(Lokhttp3/internal/cache/d$d;)Lokhttp3/f0;", "", "a", "Ljava/lang/String;", "url", "Lokhttp3/u;", "Lokhttp3/u;", "varyHeaders", "requestMethod", "Lokhttp3/c0;", "Lokhttp3/c0;", "protocol", "", "I", "code", "message", "g", "responseHeaders", "Lokhttp3/t;", "h", "Lokhttp3/t;", "handshake", "", "i", "J", "sentRequestMillis", "j", "receivedResponseMillis", "()Z", "isHttps", "m", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.c$c, reason: collision with other inner class name */
    private static final class C1308c {

        /* renamed from: k, reason: collision with root package name */
        private static final String f84032k;

        /* renamed from: l, reason: collision with root package name */
        private static final String f84033l;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String url;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final u varyHeaders;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String requestMethod;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final c0 protocol;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final int code;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final String message;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final u responseHeaders;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final t handshake;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final long sentRequestMillis;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final long receivedResponseMillis;

        static {
            j.Companion companion = okhttp3.internal.platform.j.INSTANCE;
            companion.getClass();
            okhttp3.internal.platform.j.f84863a.getClass();
            f84032k = ProtectedSandApp.s("鹰\u0001");
            companion.getClass();
            okhttp3.internal.platform.j.f84863a.getClass();
            f84033l = ProtectedSandApp.s("鹱\u0001");
        }

        public C1308c(@fg.l o0 o0Var) throws IOException {
            l0.p(o0Var, ProtectedSandApp.s("鹳\u0001"));
            try {
                okio.o d5 = okio.a0.d(o0Var);
                this.url = d5.m1();
                this.requestMethod = d5.m1();
                u.a aVar = new u.a();
                int c5 = c.INSTANCE.c(d5);
                for (int i4 = 0; i4 < c5; i4++) {
                    aVar.f(d5.m1());
                }
                this.varyHeaders = aVar.i();
                okhttp3.internal.http.k b5 = okhttp3.internal.http.k.INSTANCE.b(d5.m1());
                this.protocol = b5.protocol;
                this.code = b5.code;
                this.message = b5.message;
                u.a aVar2 = new u.a();
                int c6 = c.INSTANCE.c(d5);
                for (int i5 = 0; i5 < c6; i5++) {
                    aVar2.f(d5.m1());
                }
                String str = f84032k;
                String j4 = aVar2.j(str);
                String str2 = f84033l;
                String j5 = aVar2.j(str2);
                aVar2.l(str);
                aVar2.l(str2);
                this.sentRequestMillis = j4 != null ? Long.parseLong(j4) : 0L;
                this.receivedResponseMillis = j5 != null ? Long.parseLong(j5) : 0L;
                this.responseHeaders = aVar2.i();
                if (a()) {
                    String m12 = d5.m1();
                    if (m12.length() > 0) {
                        throw new IOException(ProtectedSandApp.s("鹴\u0001") + m12 + m0.quote);
                    }
                    this.handshake = t.INSTANCE.c(!d5.t2() ? i0.INSTANCE.a(d5.m1()) : i0.SSL_3_0, i.INSTANCE.b(d5.m1()), c(d5), c(d5));
                } else {
                    this.handshake = null;
                }
                o0Var.close();
            } catch (Throwable th) {
                o0Var.close();
                throw th;
            }
        }

        private final boolean a() {
            return kotlin.text.v.s2(this.url, ProtectedSandApp.s("鹵\u0001"), false, 2, null);
        }

        private final List<Certificate> c(okio.o source) throws IOException {
            int c5 = c.INSTANCE.c(source);
            if (c5 == -1) {
                return kotlin.collections.j0.f74919b;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance(ProtectedSandApp.s("鹶\u0001"));
                ArrayList arrayList = new ArrayList(c5);
                for (int i4 = 0; i4 < c5; i4++) {
                    String m12 = source.m1();
                    okio.m mVar = new okio.m();
                    okio.p h4 = okio.p.INSTANCE.h(m12);
                    l0.m(h4);
                    mVar.t3(h4);
                    arrayList.add(certificateFactory.generateCertificate(mVar.J3()));
                }
                return arrayList;
            } catch (CertificateException e4) {
                throw new IOException(e4.getMessage());
            }
        }

        private final void e(okio.n sink, List<? extends Certificate> certificates) throws IOException {
            try {
                sink.N1(certificates.size()).writeByte(10);
                int size = certificates.size();
                for (int i4 = 0; i4 < size; i4++) {
                    byte[] encoded = certificates.get(i4).getEncoded();
                    p.Companion companion = okio.p.INSTANCE;
                    l0.o(encoded, ProtectedSandApp.s("鹷\u0001"));
                    sink.Q0(p.Companion.p(companion, encoded, 0, 0, 3, null).d()).writeByte(10);
                }
            } catch (CertificateEncodingException e4) {
                throw new IOException(e4.getMessage());
            }
        }

        public final boolean b(@fg.l d0 request, @fg.l f0 response) {
            l0.p(request, ProtectedSandApp.s("鹸\u0001"));
            l0.p(response, ProtectedSandApp.s("鹲\u0001"));
            return l0.g(this.url, request.q().getUrl()) && l0.g(this.requestMethod, request.m()) && c.INSTANCE.g(response, this.varyHeaders, request);
        }

        @fg.l
        public final f0 d(@fg.l d.C1311d snapshot) {
            l0.p(snapshot, ProtectedSandApp.s("鹹\u0001"));
            String f4 = this.responseHeaders.f(ProtectedSandApp.s("鹺\u0001"));
            String f5 = this.responseHeaders.f(ProtectedSandApp.s("鹻\u0001"));
            return new f0.a().E(new d0.a().B(this.url).p(this.requestMethod, null).o(this.varyHeaders).b()).B(this.protocol).g(this.code).y(this.message).w(this.responseHeaders).b(new a(snapshot, f4, f5)).u(this.handshake).F(this.sentRequestMillis).C(this.receivedResponseMillis).c();
        }

        public final void f(@fg.l d.b editor) throws IOException {
            String s4;
            l0.p(editor, ProtectedSandApp.s("鹼\u0001"));
            okio.n c5 = okio.a0.c(editor.f(0));
            try {
                c5.Q0(this.url).writeByte(10);
                c5.Q0(this.requestMethod).writeByte(10);
                c5.N1(this.varyHeaders.size()).writeByte(10);
                int size = this.varyHeaders.size();
                int i4 = 0;
                while (true) {
                    s4 = ProtectedSandApp.s("鹽\u0001");
                    if (i4 >= size) {
                        break;
                    }
                    c5.Q0(this.varyHeaders.j(i4)).Q0(s4).Q0(this.varyHeaders.s(i4)).writeByte(10);
                    i4++;
                }
                c5.Q0(new okhttp3.internal.http.k(this.protocol, this.code, this.message).toString()).writeByte(10);
                c5.N1(this.responseHeaders.size() + 2).writeByte(10);
                int size2 = this.responseHeaders.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    c5.Q0(this.responseHeaders.j(i5)).Q0(s4).Q0(this.responseHeaders.s(i5)).writeByte(10);
                }
                c5.Q0(f84032k).Q0(s4).N1(this.sentRequestMillis).writeByte(10);
                c5.Q0(f84033l).Q0(s4).N1(this.receivedResponseMillis).writeByte(10);
                if (a()) {
                    c5.writeByte(10);
                    t tVar = this.handshake;
                    l0.m(tVar);
                    c5.Q0(tVar.g().e()).writeByte(10);
                    e(c5, this.handshake.m());
                    e(c5, this.handshake.k());
                    c5.Q0(this.handshake.o().javaName()).writeByte(10);
                }
                k2 k2Var = k2.f75408a;
                kotlin.io.b.a(c5, null);
            } finally {
            }
        }

        public C1308c(@fg.l f0 f0Var) {
            l0.p(f0Var, ProtectedSandApp.s("鹲\u0001"));
            this.url = f0Var.getRequest().q().getUrl();
            this.varyHeaders = c.INSTANCE.f(f0Var);
            this.requestMethod = f0Var.getRequest().m();
            this.protocol = f0Var.getProtocol();
            this.code = f0Var.u();
            this.message = f0Var.getMessage();
            this.responseHeaders = f0Var.getHeaders();
            this.handshake = f0Var.y();
            this.sentRequestMillis = f0Var.getSentRequestAtMillis();
            this.receivedResponseMillis = f0Var.getReceivedResponseAtMillis();
        }
    }
}
