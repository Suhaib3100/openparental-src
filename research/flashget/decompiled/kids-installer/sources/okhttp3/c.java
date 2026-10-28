package okhttp3;

import com.flashget.kidsdownloader.ProtectedSandApp;
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
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.m2;
import kotlin.text.Typography;
import okhttp3.e0;
import okhttp3.g0;
import okhttp3.internal.cache.d;
import okhttp3.internal.platform.j;
import okhttp3.v;
import okio.m0;
import okio.o0;
import okio.p;

/* compiled from: Cache.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010)\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 P2\u00020\u00012\u00020\u0002:\u0004&\u0007\u0018HB!\b\u0000\u0012\u0006\u0010I\u001a\u00020%\u0012\u0006\u0010J\u001a\u00020 \u0012\u0006\u0010L\u001a\u00020K¢\u0006\u0004\bM\u0010NB\u0019\b\u0016\u0012\u0006\u0010I\u001a\u00020%\u0012\u0006\u0010J\u001a\u00020 ¢\u0006\u0004\bM\u0010OJ\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0018\u00010\u0003R\u00020\u0004H\u0002J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\u0006J\u0006\u0010\u0018\u001a\u00020\u0006J\u0006\u0010\u0019\u001a\u00020\u0006J\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aJ\u0006\u0010\u001e\u001a\u00020\u001dJ\u0006\u0010\u001f\u001a\u00020\u001dJ\u0006\u0010!\u001a\u00020 J\u0006\u0010\"\u001a\u00020 J\b\u0010#\u001a\u00020\u0006H\u0016J\b\u0010$\u001a\u00020\u0006H\u0016J\u000f\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(H\u0000¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0006H\u0000¢\u0006\u0004\b,\u0010-J\u0006\u0010.\u001a\u00020\u001dJ\u0006\u0010/\u001a\u00020\u001dJ\u0006\u00100\u001a\u00020\u001dR\u001a\u00105\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\"\u0010<\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010@\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u00107\u001a\u0004\b>\u00109\"\u0004\b?\u0010;R\u0016\u0010A\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u00107R\u0016\u0010C\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u00107R\u0016\u0010D\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u00107R\u0011\u0010F\u001a\u00020E8F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0011\u0010I\u001a\u00020%8G¢\u0006\u0006\u001a\u0004\bH\u0010'¨\u0006Q"}, d2 = {"Lokhttp3/c;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lokhttp3/internal/cache/d$b;", "Lokhttp3/internal/cache/d;", "editor", "Lkotlin/m2;", "b", "Lokhttp3/e0;", "request", "Lokhttp3/g0;", "g", "(Lokhttp3/e0;)Lokhttp3/g0;", "response", "Lokhttp3/internal/cache/b;", "w", "(Lokhttp3/g0;)Lokhttp3/internal/cache/b;", "z", "(Lokhttp3/e0;)V", "cached", "network", "O", "(Lokhttp3/g0;Lokhttp3/g0;)V", "n", "c", "e", "", "", "P", "", "R", "U", "", "size", "r", "flush", "close", "Ljava/io/File;", "a", "()Ljava/io/File;", "Lokhttp3/internal/cache/c;", "cacheStrategy", "H", "(Lokhttp3/internal/cache/c;)V", "G", "()V", "t", "m", "B", "o", "Lokhttp3/internal/cache/d;", "j", "()Lokhttp3/internal/cache/d;", "cache", "p", "I", "l", "()I", "F", "(I)V", "writeSuccessCount", "q", "k", "D", "writeAbortCount", "networkCount", "s", "hitCount", "requestCount", "", "isClosed", "()Z", "d", "directory", "maxSize", "Lokhttp3/internal/io/a;", "fileSystem", "<init>", "(Ljava/io/File;JLokhttp3/internal/io/a;)V", "(Ljava/io/File;J)V", "y", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class c implements Closeable, Flushable {

    /* renamed from: u, reason: collision with root package name */
    private static final int f30468u = 201105;

    /* renamed from: v, reason: collision with root package name */
    private static final int f30469v = 0;

    /* renamed from: w, reason: collision with root package name */
    private static final int f30470w = 1;

    /* renamed from: x, reason: collision with root package name */
    private static final int f30471x = 2;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final okhttp3.internal.cache.d cache;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int writeSuccessCount;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int writeAbortCount;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int networkCount;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private int hitCount;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int requestCount;

    /* compiled from: Cache.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0011\u001a\u00060\u000bR\u00020\f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001b\u0010\u0011\u001a\u00060\u000bR\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014¨\u0006\u001a"}, d2 = {"Lokhttp3/c$a;", "Lokhttp3/h0;", "Lokhttp3/y;", "k", "", "j", "Lokio/o;", "B", "q", "Lokio/o;", "bodySource", "Lokhttp3/internal/cache/d$d;", "Lokhttp3/internal/cache/d;", "r", "Lokhttp3/internal/cache/d$d;", "F", "()Lokhttp3/internal/cache/d$d;", "snapshot", "", "s", "Ljava/lang/String;", "contentType", "t", "contentLength", "<init>", "(Lokhttp3/internal/cache/d$d;Ljava/lang/String;Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    private static final class a extends h0 {

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        private final okio.o bodySource;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final d.C0472d snapshot;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        private final String contentType;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final String contentLength;

        /* compiled from: Cache.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"okhttp3/c$a$a", "Lokio/s;", "Lkotlin/m2;", "close", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: okhttp3.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0467a extends okio.s {

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ o0 f30484q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0467a(o0 o0Var, o0 o0Var2) {
                super(o0Var2);
                this.f30484q = o0Var;
            }

            @Override // okio.s, okio.o0, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                a.this.getSnapshot().close();
                super.close();
            }
        }

        public a(@d5.d d.C0472d c0472d, @d5.e String str, @d5.e String str2) {
            kotlin.jvm.internal.l0.p(c0472d, ProtectedSandApp.s("廦"));
            this.snapshot = c0472d;
            this.contentType = str;
            this.contentLength = str2;
            o0 c6 = c0472d.c(1);
            this.bodySource = okio.a0.d(new C0467a(c6, c6));
        }

        @Override // okhttp3.h0
        @d5.d
        /* renamed from: B, reason: from getter */
        public okio.o getSource() {
            return this.bodySource;
        }

        @d5.d
        /* renamed from: F, reason: from getter */
        public final d.C0472d getSnapshot() {
            return this.snapshot;
        }

        @Override // okhttp3.h0
        /* renamed from: j */
        public long getContentLength() {
            String str = this.contentLength;
            if (str != null) {
                return okhttp3.internal.d.e0(str, -1L);
            }
            return -1L;
        }

        @Override // okhttp3.h0
        @d5.e
        /* renamed from: k */
        public y getF30637r() {
            String str = this.contentType;
            if (str != null) {
                return y.INSTANCE.d(str);
            }
            return null;
        }
    }

    /* compiled from: Cache.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014J\n\u0010\u0018\u001a\u00020\u0016*\u00020\u0011J\n\u0010\u0019\u001a\u00020\u0002*\u00020\u0011R\u0014\u0010\u001a\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001b¨\u0006!"}, d2 = {"Lokhttp3/c$b;", "", "Lokhttp3/v;", "", "", "d", "requestHeaders", "responseHeaders", "e", "Lokhttp3/w;", "url", "b", "Lokio/o;", "source", "", "c", "(Lokio/o;)I", "Lokhttp3/g0;", "cachedResponse", "cachedRequest", "Lokhttp3/e0;", "newRequest", "", "g", "a", "f", "ENTRY_BODY", "I", "ENTRY_COUNT", "ENTRY_METADATA", "VERSION", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.c$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        private final Set<String> d(v vVar) {
            boolean K1;
            List<String> Q4;
            CharSequence C5;
            Comparator Q1;
            int size = vVar.size();
            TreeSet treeSet = null;
            for (int i5 = 0; i5 < size; i5++) {
                K1 = kotlin.text.e0.K1(ProtectedSandApp.s("廧"), vVar.q(i5), true);
                if (K1) {
                    String x5 = vVar.x(i5);
                    if (treeSet == null) {
                        Q1 = kotlin.text.e0.Q1(StringCompanionObject.f23622a);
                        treeSet = new TreeSet(Q1);
                    }
                    Q4 = kotlin.text.h0.Q4(x5, new char[]{','}, false, 0, 6, null);
                    for (String str : Q4) {
                        if (str == null) {
                            throw new NullPointerException(ProtectedSandApp.s("廨"));
                        }
                        C5 = kotlin.text.h0.C5(str);
                        treeSet.add(C5.toString());
                    }
                }
            }
            return treeSet != null ? treeSet : EmptySet.f23181o;
        }

        private final v e(v requestHeaders, v responseHeaders) {
            Set<String> d6 = d(responseHeaders);
            if (d6.isEmpty()) {
                return okhttp3.internal.d.f30930b;
            }
            v.a aVar = new v.a();
            int size = requestHeaders.size();
            for (int i5 = 0; i5 < size; i5++) {
                String q5 = requestHeaders.q(i5);
                if (d6.contains(q5)) {
                    aVar.b(q5, requestHeaders.x(i5));
                }
            }
            return aVar.i();
        }

        public final boolean a(@d5.d g0 g0Var) {
            kotlin.jvm.internal.l0.p(g0Var, ProtectedSandApp.s("廩"));
            return d(g0Var.getHeaders()).contains(ProtectedSandApp.s("廪"));
        }

        @d5.d
        @p3.n
        public final String b(@d5.d w url) {
            kotlin.jvm.internal.l0.p(url, ProtectedSandApp.s("廫"));
            return okio.p.INSTANCE.l(url.getUrl()).V().C();
        }

        public final int c(@d5.d okio.o source) throws IOException {
            String s5 = ProtectedSandApp.s("廬");
            kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("廭"));
            try {
                long a02 = source.a0();
                String G0 = source.G0();
                if (a02 >= 0 && a02 <= Integer.MAX_VALUE) {
                    if (!(G0.length() > 0)) {
                        return (int) a02;
                    }
                }
                throw new IOException(s5 + a02 + G0 + Typography.f27126b);
            } catch (NumberFormatException e6) {
                throw new IOException(e6.getMessage());
            }
        }

        @d5.d
        public final v f(@d5.d g0 g0Var) {
            kotlin.jvm.internal.l0.p(g0Var, ProtectedSandApp.s("廮"));
            g0 networkResponse = g0Var.getNetworkResponse();
            kotlin.jvm.internal.l0.m(networkResponse);
            return e(networkResponse.getRequest().k(), g0Var.getHeaders());
        }

        public final boolean g(@d5.d g0 cachedResponse, @d5.d v cachedRequest, @d5.d e0 newRequest) {
            kotlin.jvm.internal.l0.p(cachedResponse, ProtectedSandApp.s("廯"));
            kotlin.jvm.internal.l0.p(cachedRequest, ProtectedSandApp.s("廰"));
            kotlin.jvm.internal.l0.p(newRequest, ProtectedSandApp.s("廱"));
            Set<String> d6 = d(cachedResponse.getHeaders());
            if ((d6 instanceof Collection) && d6.isEmpty()) {
                return true;
            }
            for (String str : d6) {
                if (!kotlin.jvm.internal.l0.g(cachedRequest.y(str), newRequest.j(str))) {
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
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0014\u001a\u00060\u0011R\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0014\u001a\u00060\u0011R\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013¨\u0006\u0017"}, d2 = {"Lokhttp3/c$d;", "Lokhttp3/internal/cache/b;", "Lkotlin/m2;", "a", "Lokio/m0;", "b", "Lokio/m0;", "cacheOut", "body", "", "c", "Z", "d", "()Z", "e", "(Z)V", "done", "Lokhttp3/internal/cache/d$b;", "Lokhttp3/internal/cache/d;", "Lokhttp3/internal/cache/d$b;", "editor", "<init>", "(Lokhttp3/c;Lokhttp3/internal/cache/d$b;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    private final class d implements okhttp3.internal.cache.b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final m0 cacheOut;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final m0 body;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean done;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final d.b editor;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ c f30502e;

        /* compiled from: Cache.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"okhttp3/c$d$a", "Lokio/r;", "Lkotlin/m2;", "close", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* loaded from: classes6.dex */
        public static final class a extends okio.r {
            a(m0 m0Var) {
                super(m0Var);
            }

            @Override // okio.r, okio.m0, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                synchronized (d.this.f30502e) {
                    if (d.this.getDone()) {
                        return;
                    }
                    d.this.e(true);
                    c cVar = d.this.f30502e;
                    cVar.F(cVar.getWriteSuccessCount() + 1);
                    super.close();
                    d.this.editor.b();
                }
            }
        }

        public d(@d5.d c cVar, d.b bVar) {
            kotlin.jvm.internal.l0.p(bVar, ProtectedSandApp.s("弁"));
            this.f30502e = cVar;
            this.editor = bVar;
            m0 f6 = bVar.f(1);
            this.cacheOut = f6;
            this.body = new a(f6);
        }

        @Override // okhttp3.internal.cache.b
        public void a() {
            synchronized (this.f30502e) {
                if (this.done) {
                    return;
                }
                this.done = true;
                c cVar = this.f30502e;
                cVar.D(cVar.getWriteAbortCount() + 1);
                okhttp3.internal.d.l(this.cacheOut);
                try {
                    this.editor.a();
                } catch (IOException unused) {
                }
            }
        }

        @Override // okhttp3.internal.cache.b
        @d5.d
        /* renamed from: b, reason: from getter */
        public m0 getBody() {
            return this.body;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getDone() {
            return this.done;
        }

        public final void e(boolean z5) {
            this.done = z5;
        }
    }

    /* compiled from: Cache.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u001e\u0010\f\u001a\f\u0012\b\u0012\u00060\bR\u00020\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"okhttp3/c$e", "", "", "", "hasNext", "a", "Lkotlin/m2;", "remove", "Lokhttp3/internal/cache/d$d;", "Lokhttp3/internal/cache/d;", "o", "Ljava/util/Iterator;", "delegate", "p", "Ljava/lang/String;", "nextUrl", "q", "Z", "canRemove", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes6.dex */
    public static final class e implements Iterator<String>, r3.d {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final Iterator<d.C0472d> delegate;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        private String nextUrl;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        private boolean canRemove;

        e() {
            this.delegate = c.this.getCache().B0();
        }

        @Override // java.util.Iterator
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.nextUrl;
            kotlin.jvm.internal.l0.m(str);
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
                    d.C0472d next = this.delegate.next();
                    try {
                        continue;
                        this.nextUrl = okio.a0.d(next.c(0)).G0();
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
                throw new IllegalStateException(ProtectedSandApp.s("醝").toString());
            }
            this.delegate.remove();
        }
    }

    public c(@d5.d File file, long j5, @d5.d okhttp3.internal.io.a aVar) {
        kotlin.jvm.internal.l0.p(file, ProtectedSandApp.s("彌"));
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("彍"));
        this.cache = new okhttp3.internal.cache.d(aVar, file, f30468u, 2, j5, okhttp3.internal.concurrent.d.f30815h);
    }

    private final void b(d.b bVar) {
        if (bVar != null) {
            try {
                bVar.a();
            } catch (IOException unused) {
            }
        }
    }

    @d5.d
    @p3.n
    public static final String o(@d5.d w wVar) {
        return INSTANCE.b(wVar);
    }

    public final synchronized int B() {
        return this.requestCount;
    }

    public final void D(int i5) {
        this.writeAbortCount = i5;
    }

    public final void F(int i5) {
        this.writeSuccessCount = i5;
    }

    public final synchronized void G() {
        this.hitCount++;
    }

    public final synchronized void H(@d5.d okhttp3.internal.cache.c cacheStrategy) {
        kotlin.jvm.internal.l0.p(cacheStrategy, ProtectedSandApp.s("彎"));
        this.requestCount++;
        if (cacheStrategy.getNetworkRequest() != null) {
            this.networkCount++;
        } else if (cacheStrategy.getCacheResponse() != null) {
            this.hitCount++;
        }
    }

    public final void O(@d5.d g0 cached, @d5.d g0 network) {
        d.b bVar;
        kotlin.jvm.internal.l0.p(cached, ProtectedSandApp.s("彏"));
        kotlin.jvm.internal.l0.p(network, ProtectedSandApp.s("彐"));
        C0468c c0468c = new C0468c(network);
        h0 t5 = cached.t();
        if (t5 == null) {
            throw new NullPointerException(ProtectedSandApp.s("彑"));
        }
        try {
            bVar = ((a) t5).getSnapshot().a();
            if (bVar != null) {
                try {
                    c0468c.f(bVar);
                    bVar.b();
                } catch (IOException unused) {
                    b(bVar);
                }
            }
        } catch (IOException unused2) {
            bVar = null;
        }
    }

    @d5.d
    public final Iterator<String> P() throws IOException {
        return new e();
    }

    public final synchronized int R() {
        return this.writeAbortCount;
    }

    public final synchronized int U() {
        return this.writeSuccessCount;
    }

    @p3.i(name = "-deprecated_directory")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "directory", imports = {}))
    @d5.d
    public final File a() {
        return this.cache.getDirectory();
    }

    public final void c() throws IOException {
        this.cache.D();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.cache.close();
    }

    @p3.i(name = "directory")
    @d5.d
    public final File d() {
        return this.cache.getDirectory();
    }

    public final void e() throws IOException {
        this.cache.O();
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.cache.flush();
    }

    @d5.e
    public final g0 g(@d5.d e0 request) {
        kotlin.jvm.internal.l0.p(request, ProtectedSandApp.s("归"));
        try {
            d.C0472d P = this.cache.P(INSTANCE.b(request.q()));
            if (P != null) {
                try {
                    C0468c c0468c = new C0468c(P.c(0));
                    g0 d6 = c0468c.d(P);
                    if (c0468c.b(request, d6)) {
                        return d6;
                    }
                    h0 t5 = d6.t();
                    if (t5 != null) {
                        okhttp3.internal.d.l(t5);
                    }
                    return null;
                } catch (IOException unused) {
                    okhttp3.internal.d.l(P);
                }
            }
        } catch (IOException unused2) {
        }
        return null;
    }

    public final boolean isClosed() {
        return this.cache.isClosed();
    }

    @d5.d
    /* renamed from: j, reason: from getter */
    public final okhttp3.internal.cache.d getCache() {
        return this.cache;
    }

    /* renamed from: k, reason: from getter */
    public final int getWriteAbortCount() {
        return this.writeAbortCount;
    }

    /* renamed from: l, reason: from getter */
    public final int getWriteSuccessCount() {
        return this.writeSuccessCount;
    }

    public final synchronized int m() {
        return this.hitCount;
    }

    public final void n() throws IOException {
        this.cache.e0();
    }

    public final long r() {
        return this.cache.b0();
    }

    public final long size() throws IOException {
        return this.cache.size();
    }

    public final synchronized int t() {
        return this.networkCount;
    }

    @d5.e
    public final okhttp3.internal.cache.b w(@d5.d g0 response) {
        d.b bVar;
        kotlin.jvm.internal.l0.p(response, ProtectedSandApp.s("当"));
        String m5 = response.getRequest().m();
        if (okhttp3.internal.http.f.f30954a.a(response.getRequest().m())) {
            try {
                z(response.getRequest());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!kotlin.jvm.internal.l0.g(m5, ProtectedSandApp.s("彔"))) {
            return null;
        }
        Companion companion = INSTANCE;
        if (companion.a(response)) {
            return null;
        }
        C0468c c0468c = new C0468c(response);
        try {
            bVar = okhttp3.internal.cache.d.H(this.cache, companion.b(response.getRequest().q()), 0L, 2, null);
            if (bVar == null) {
                return null;
            }
            try {
                c0468c.f(bVar);
                return new d(this, bVar);
            } catch (IOException unused2) {
                b(bVar);
                return null;
            }
        } catch (IOException unused3) {
            bVar = null;
        }
    }

    public final void z(@d5.d e0 request) throws IOException {
        kotlin.jvm.internal.l0.p(request, ProtectedSandApp.s("录"));
        this.cache.n0(INSTANCE.b(request.q()));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@d5.d File file, long j5) {
        this(file, j5, okhttp3.internal.io.a.f31260a);
        kotlin.jvm.internal.l0.p(file, ProtectedSandApp.s("彋"));
    }

    /* compiled from: Cache.kt */
    @Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 ;2\u00020\u0001:\u0001\u001aB\u0011\b\u0016\u0012\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b8\u0010:J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0012\u0010\u000f\u001a\u00020\n2\n\u0010\u000e\u001a\u00060\fR\u00020\rJ\u0016\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012J\u0012\u0010\u0018\u001a\u00020\u00122\n\u0010\u0017\u001a\u00060\u0016R\u00020\rR\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR\u0014\u0010 \u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u0014\u0010'\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u0014\u0010)\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001eR\u0016\u0010-\u001a\u0004\u0018\u00010*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00103\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00100R\u0014\u00105\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u00104¨\u0006<"}, d2 = {"Lokhttp3/c$c;", "", "Lokio/o;", "source", "", "Ljava/security/cert/Certificate;", "c", "Lokio/n;", "sink", "certificates", "Lkotlin/m2;", "e", "Lokhttp3/internal/cache/d$b;", "Lokhttp3/internal/cache/d;", "editor", "f", "Lokhttp3/e0;", "request", "Lokhttp3/g0;", "response", "", "b", "Lokhttp3/internal/cache/d$d;", "snapshot", "d", "", "a", "Ljava/lang/String;", "url", "Lokhttp3/v;", "Lokhttp3/v;", "varyHeaders", "requestMethod", "Lokhttp3/d0;", "Lokhttp3/d0;", "protocol", "", "I", "code", "message", "g", "responseHeaders", "Lokhttp3/t;", "h", "Lokhttp3/t;", "handshake", "", "i", "J", "sentRequestMillis", "j", "receivedResponseMillis", "()Z", "isHttps", "Lokio/o0;", "rawSource", "<init>", "(Lokio/o0;)V", "(Lokhttp3/g0;)V", "m", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.c$c, reason: collision with other inner class name */
    private static final class C0468c {

        /* renamed from: k, reason: collision with root package name */
        private static final String f30485k;

        /* renamed from: l, reason: collision with root package name */
        private static final String f30486l;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String url;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final v varyHeaders;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String requestMethod;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final d0 protocol;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final int code;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final String message;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final v responseHeaders;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final t handshake;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final long sentRequestMillis;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final long receivedResponseMillis;

        static {
            StringBuilder sb = new StringBuilder();
            j.Companion companion = okhttp3.internal.platform.j.INSTANCE;
            companion.getClass();
            sb.append(okhttp3.internal.platform.j.f31323a.i());
            sb.append(ProtectedSandApp.s("廲"));
            f30485k = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            companion.getClass();
            sb2.append(okhttp3.internal.platform.j.f31323a.i());
            sb2.append(ProtectedSandApp.s("廳"));
            f30486l = sb2.toString();
        }

        public C0468c(@d5.d o0 o0Var) throws IOException {
            kotlin.jvm.internal.l0.p(o0Var, ProtectedSandApp.s("廵"));
            try {
                okio.o d6 = okio.a0.d(o0Var);
                this.url = d6.G0();
                this.requestMethod = d6.G0();
                v.a aVar = new v.a();
                int c6 = c.INSTANCE.c(d6);
                for (int i5 = 0; i5 < c6; i5++) {
                    aVar.f(d6.G0());
                }
                this.varyHeaders = aVar.i();
                okhttp3.internal.http.k b6 = okhttp3.internal.http.k.INSTANCE.b(d6.G0());
                this.protocol = b6.protocol;
                this.code = b6.code;
                this.message = b6.message;
                v.a aVar2 = new v.a();
                int c7 = c.INSTANCE.c(d6);
                for (int i6 = 0; i6 < c7; i6++) {
                    aVar2.f(d6.G0());
                }
                String str = f30485k;
                String j5 = aVar2.j(str);
                String str2 = f30486l;
                String j6 = aVar2.j(str2);
                aVar2.l(str);
                aVar2.l(str2);
                this.sentRequestMillis = j5 != null ? Long.parseLong(j5) : 0L;
                this.receivedResponseMillis = j6 != null ? Long.parseLong(j6) : 0L;
                this.responseHeaders = aVar2.i();
                if (a()) {
                    String G0 = d6.G0();
                    if (G0.length() > 0) {
                        throw new IOException(ProtectedSandApp.s("延") + G0 + Typography.f27126b);
                    }
                    this.handshake = t.INSTANCE.c(!d6.M() ? j0.INSTANCE.a(d6.G0()) : j0.SSL_3_0, i.INSTANCE.b(d6.G0()), c(d6), c(d6));
                } else {
                    this.handshake = null;
                }
            } finally {
                o0Var.close();
            }
        }

        private final boolean a() {
            boolean s22;
            s22 = kotlin.text.e0.s2(this.url, ProtectedSandApp.s("廷"), false, 2, null);
            return s22;
        }

        private final List<Certificate> c(okio.o source) throws IOException {
            int c6 = c.INSTANCE.c(source);
            if (c6 == -1) {
                return EmptyList.f23167o;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance(ProtectedSandApp.s("廸"));
                ArrayList arrayList = new ArrayList(c6);
                for (int i5 = 0; i5 < c6; i5++) {
                    String G0 = source.G0();
                    okio.m mVar = new okio.m();
                    okio.p h5 = okio.p.INSTANCE.h(G0);
                    kotlin.jvm.internal.l0.m(h5);
                    mVar.S0(h5);
                    arrayList.add(certificateFactory.generateCertificate(mVar.p1()));
                }
                return arrayList;
            } catch (CertificateException e6) {
                throw new IOException(e6.getMessage());
            }
        }

        private final void e(okio.n nVar, List<? extends Certificate> list) throws IOException {
            try {
                nVar.j1(list.size()).writeByte(10);
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    byte[] encoded = list.get(i5).getEncoded();
                    p.Companion companion = okio.p.INSTANCE;
                    kotlin.jvm.internal.l0.o(encoded, ProtectedSandApp.s("廹"));
                    nVar.j0(p.Companion.p(companion, encoded, 0, 0, 3, null).l()).writeByte(10);
                }
            } catch (CertificateEncodingException e6) {
                throw new IOException(e6.getMessage());
            }
        }

        public final boolean b(@d5.d e0 request, @d5.d g0 response) {
            kotlin.jvm.internal.l0.p(request, ProtectedSandApp.s("建"));
            kotlin.jvm.internal.l0.p(response, ProtectedSandApp.s("廻"));
            return kotlin.jvm.internal.l0.g(this.url, request.q().getUrl()) && kotlin.jvm.internal.l0.g(this.requestMethod, request.m()) && c.INSTANCE.g(response, this.varyHeaders, request);
        }

        @d5.d
        public final g0 d(@d5.d d.C0472d snapshot) {
            kotlin.jvm.internal.l0.p(snapshot, ProtectedSandApp.s("廼"));
            String g5 = this.responseHeaders.g(ProtectedSandApp.s("廽"));
            String g6 = this.responseHeaders.g(ProtectedSandApp.s("廾"));
            return new g0.a().E(new e0.a().B(this.url).p(this.requestMethod, null).o(this.varyHeaders).b()).B(this.protocol).g(this.code).y(this.message).w(this.responseHeaders).b(new a(snapshot, g5, g6)).u(this.handshake).F(this.sentRequestMillis).C(this.receivedResponseMillis).c();
        }

        public final void f(@d5.d d.b bVar) throws IOException {
            String s5;
            kotlin.jvm.internal.l0.p(bVar, ProtectedSandApp.s("廿"));
            okio.n c6 = okio.a0.c(bVar.f(0));
            try {
                c6.j0(this.url).writeByte(10);
                c6.j0(this.requestMethod).writeByte(10);
                c6.j1(this.varyHeaders.size()).writeByte(10);
                int size = this.varyHeaders.size();
                int i5 = 0;
                while (true) {
                    s5 = ProtectedSandApp.s("开");
                    if (i5 >= size) {
                        break;
                    }
                    c6.j0(this.varyHeaders.q(i5)).j0(s5).j0(this.varyHeaders.x(i5)).writeByte(10);
                    i5++;
                }
                c6.j0(new okhttp3.internal.http.k(this.protocol, this.code, this.message).toString()).writeByte(10);
                c6.j1(this.responseHeaders.size() + 2).writeByte(10);
                int size2 = this.responseHeaders.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    c6.j0(this.responseHeaders.q(i6)).j0(s5).j0(this.responseHeaders.x(i6)).writeByte(10);
                }
                c6.j0(f30485k).j0(s5).j1(this.sentRequestMillis).writeByte(10);
                c6.j0(f30486l).j0(s5).j1(this.receivedResponseMillis).writeByte(10);
                if (a()) {
                    c6.writeByte(10);
                    t tVar = this.handshake;
                    kotlin.jvm.internal.l0.m(tVar);
                    c6.j0(tVar.g().e()).writeByte(10);
                    e(c6, this.handshake.m());
                    e(c6, this.handshake.k());
                    c6.j0(this.handshake.o().javaName()).writeByte(10);
                }
                m2 m2Var = m2.f23662a;
                kotlin.io.b.a(c6, null);
            } finally {
            }
        }

        public C0468c(@d5.d g0 g0Var) {
            kotlin.jvm.internal.l0.p(g0Var, ProtectedSandApp.s("廴"));
            this.url = g0Var.getRequest().q().getUrl();
            this.varyHeaders = c.INSTANCE.f(g0Var);
            this.requestMethod = g0Var.getRequest().m();
            this.protocol = g0Var.getProtocol();
            this.code = g0Var.getCode();
            this.message = g0Var.getMessage();
            this.responseHeaders = g0Var.getHeaders();
            this.handshake = g0Var.getHandshake();
            this.sentRequestMillis = g0Var.getSentRequestAtMillis();
            this.receivedResponseMillis = g0Var.getReceivedResponseAtMillis();
        }
    }
}
