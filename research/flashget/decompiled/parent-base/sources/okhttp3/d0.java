package okhttp3;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.z0;
import kotlin.jvm.internal.l0;
import kotlin.q0;
import kotlin.x0;
import okhttp3.u;
import okhttp3.v;

/* compiled from: Request.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001$BC\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0016\u0010\f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0019\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00172\u000e\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0004H\u0007¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\"\u0010#J\u0011\u0010$\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0007¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010!R\u0018\u0010+\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b'\u0010,\u001a\u0004\b-\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\"\u0010.\u001a\u0004\b/\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b \u00100\u001a\u0004\b1\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0007¢\u0006\f\n\u0004\b\u001e\u00102\u001a\u0004\b3\u0010%R*\u0010\f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0004\u0012\u00020\u00010\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0011\u0010:\u001a\u0002078F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0011\u0010<\u001a\u00020&8G¢\u0006\u0006\u001a\u0004\b;\u0010(¨\u0006="}, d2 = {"Lokhttp3/d0;", "", "Lokhttp3/v;", "url", "", "method", "Lokhttp3/u;", "headers", "Lokhttp3/e0;", "body", "", "Ljava/lang/Class;", "tags", "<init>", "(Lokhttp3/v;Ljava/lang/String;Lokhttp3/u;Lokhttp3/e0;Ljava/util/Map;)V", "name", "i", "(Ljava/lang/String;)Ljava/lang/String;", "", "j", "(Ljava/lang/String;)Ljava/util/List;", "o", "()Ljava/lang/Object;", "T", "type", "p", "(Ljava/lang/Class;)Ljava/lang/Object;", "Lokhttp3/d0$a;", "n", "()Lokhttp3/d0$a;", "e", "()Lokhttp3/v;", "d", "()Ljava/lang/String;", "c", "()Lokhttp3/u;", "a", "()Lokhttp3/e0;", "Lokhttp3/d;", "b", "()Lokhttp3/d;", "toString", "Lokhttp3/d;", "lazyCacheControl", "Lokhttp3/v;", "q", "Ljava/lang/String;", "m", "Lokhttp3/u;", "k", "Lokhttp3/e0;", "f", "Ljava/util/Map;", "h", "()Ljava/util/Map;", "", "l", "()Z", "isHttps", "g", "cacheControl", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private d lazyCacheControl;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final v url;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String method;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final u headers;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final e0 body;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<Class<?>, Object> tags;

    public d0(@fg.l v vVar, @fg.l String str, @fg.l u uVar, @fg.m e0 e0Var, @fg.l Map<Class<?>, ? extends Object> map) {
        l0.p(vVar, ProtectedSandApp.s("黋\u0001"));
        l0.p(str, ProtectedSandApp.s("黌\u0001"));
        l0.p(uVar, ProtectedSandApp.s("黍\u0001"));
        l0.p(map, ProtectedSandApp.s("黎\u0001"));
        this.url = vVar;
        this.method = str;
        this.headers = uVar;
        this.body = e0Var;
        this.tags = map;
    }

    @fg.m
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "body", imports = {}))
    @kd.i(name = "-deprecated_body")
    /* renamed from: a, reason: from getter */
    public final e0 getBody() {
        return this.body;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "cacheControl", imports = {}))
    @kd.i(name = "-deprecated_cacheControl")
    public final d b() {
        return g();
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "headers", imports = {}))
    @kd.i(name = "-deprecated_headers")
    /* renamed from: c, reason: from getter */
    public final u getHeaders() {
        return this.headers;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "method", imports = {}))
    @kd.i(name = "-deprecated_method")
    /* renamed from: d, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "url", imports = {}))
    @kd.i(name = "-deprecated_url")
    /* renamed from: e, reason: from getter */
    public final v getUrl() {
        return this.url;
    }

    @fg.m
    @kd.i(name = "body")
    public final e0 f() {
        return this.body;
    }

    @fg.l
    @kd.i(name = "cacheControl")
    public final d g() {
        d dVar = this.lazyCacheControl;
        if (dVar != null) {
            return dVar;
        }
        d c5 = d.INSTANCE.c(this.headers);
        this.lazyCacheControl = c5;
        return c5;
    }

    @fg.l
    public final Map<Class<?>, Object> h() {
        return this.tags;
    }

    @fg.m
    public final String i(@fg.l String name) {
        l0.p(name, ProtectedSandApp.s("黏\u0001"));
        return this.headers.f(name);
    }

    @fg.l
    public final List<String> j(@fg.l String name) {
        l0.p(name, ProtectedSandApp.s("黏\u0001"));
        return this.headers.v(name);
    }

    @fg.l
    @kd.i(name = "headers")
    public final u k() {
        return this.headers;
    }

    public final boolean l() {
        return this.url.getIsHttps();
    }

    @fg.l
    @kd.i(name = "method")
    public final String m() {
        return this.method;
    }

    @fg.l
    public final a n() {
        return new a(this);
    }

    @fg.m
    public final Object o() {
        return p(Object.class);
    }

    @fg.m
    public final <T> T p(@fg.l Class<? extends T> type) {
        l0.p(type, ProtectedSandApp.s("黐\u0001"));
        return type.cast(this.tags.get(type));
    }

    @fg.l
    @kd.i(name = "url")
    public final v q() {
        return this.url;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("黑\u0001"));
        sb.append(this.method);
        sb.append(ProtectedSandApp.s("黒\u0001"));
        sb.append(this.url);
        if (this.headers.size() != 0) {
            sb.append(ProtectedSandApp.s("黓\u0001"));
            int i4 = 0;
            for (q0<? extends String, ? extends String> q0Var : this.headers) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    kotlin.collections.w.Z();
                }
                q0<? extends String, ? extends String> q0Var2 = q0Var;
                String a5 = q0Var2.a();
                String b5 = q0Var2.b();
                if (i4 > 0) {
                    sb.append(ProtectedSandApp.s("黔\u0001"));
                }
                sb.append(a5);
                sb.append(':');
                sb.append(b5);
                i4 = i5;
            }
            sb.append(']');
        }
        if (!this.tags.isEmpty()) {
            sb.append(ProtectedSandApp.s("黕\u0001"));
            sb.append(this.tags);
        }
        return androidx.collection.c.a(sb, '}', ProtectedSandApp.s("黖\u0001"));
    }

    /* compiled from: Request.kt */
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\rJ\u0017\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0000H\u0016¢\u0006\u0004\b!\u0010 J\u0017\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u001b\u0010&\u001a\u00020\u00002\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"H\u0017¢\u0006\u0004\b&\u0010%J\u0017\u0010'\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b'\u0010%J\u0017\u0010(\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b(\u0010%J!\u0010*\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b*\u0010+J\u0019\u0010-\u001a\u00020\u00002\b\u0010,\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b-\u0010.J/\u00102\u001a\u00020\u0000\"\u0004\b\u0000\u0010/2\u000e\u00101\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u0000002\b\u0010,\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0004H\u0016¢\u0006\u0004\b4\u00105R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010)\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010\u0018\u001a\u00020@8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010#\u001a\u0004\u0018\u00010\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR2\u0010R\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u000300\u0012\u0004\u0012\u00020\u00010L8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010Q¨\u0006S"}, d2 = {"Lokhttp3/d0$a;", "", "<init>", "()V", "Lokhttp3/d0;", "request", "(Lokhttp3/d0;)V", "Lokhttp3/v;", "url", "D", "(Lokhttp3/v;)Lokhttp3/d0$a;", "", "B", "(Ljava/lang/String;)Lokhttp3/d0$a;", "Ljava/net/URL;", "C", "(Ljava/net/URL;)Lokhttp3/d0$a;", "name", "value", "n", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/d0$a;", "a", "t", "Lokhttp3/u;", "headers", "o", "(Lokhttp3/u;)Lokhttp3/d0$a;", "Lokhttp3/d;", "cacheControl", "c", "(Lokhttp3/d;)Lokhttp3/d0$a;", "g", "()Lokhttp3/d0$a;", "m", "Lokhttp3/e0;", "body", "r", "(Lokhttp3/e0;)Lokhttp3/d0$a;", "e", "s", "q", "method", "p", "(Ljava/lang/String;Lokhttp3/e0;)Lokhttp3/d0$a;", "tag", "A", "(Ljava/lang/Object;)Lokhttp3/d0$a;", "T", "Ljava/lang/Class;", "type", "z", "(Ljava/lang/Class;Ljava/lang/Object;)Lokhttp3/d0$a;", "b", "()Lokhttp3/d0;", "Lokhttp3/v;", "l", "()Lokhttp3/v;", "y", "(Lokhttp3/v;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "w", "(Ljava/lang/String;)V", "Lokhttp3/u$a;", "Lokhttp3/u$a;", "i", "()Lokhttp3/u$a;", "v", "(Lokhttp3/u$a;)V", "d", "Lokhttp3/e0;", "h", "()Lokhttp3/e0;", "u", "(Lokhttp3/e0;)V", "", "Ljava/util/Map;", "k", "()Ljava/util/Map;", "x", "(Ljava/util/Map;)V", "tags", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private v url;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private String method;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private u.a headers;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private e0 body;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private Map<Class<?>, Object> tags;

        public a() {
            this.tags = new LinkedHashMap();
            this.method = ProtectedSandApp.s("麮\u0001");
            this.headers = new u.a();
        }

        public static /* synthetic */ a f(a aVar, e0 e0Var, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("麰\u0001"));
            }
            if ((i4 & 1) != 0) {
                e0Var = okhttp3.internal.d.f84459d;
            }
            return aVar.e(e0Var);
        }

        @fg.l
        public a A(@fg.m Object tag) {
            return z(Object.class, tag);
        }

        @fg.l
        public a B(@fg.l String url) {
            l0.p(url, ProtectedSandApp.s("麱\u0001"));
            boolean q22 = kotlin.text.v.q2(url, ProtectedSandApp.s("麲\u0001"), true);
            String s4 = ProtectedSandApp.s("麳\u0001");
            if (q22) {
                StringBuilder sb = new StringBuilder(ProtectedSandApp.s("麴\u0001"));
                String substring = url.substring(3);
                l0.o(substring, s4);
                sb.append(substring);
                url = sb.toString();
            } else if (kotlin.text.v.q2(url, ProtectedSandApp.s("麵\u0001"), true)) {
                StringBuilder sb2 = new StringBuilder(ProtectedSandApp.s("麶\u0001"));
                String substring2 = url.substring(4);
                l0.o(substring2, s4);
                sb2.append(substring2);
                url = sb2.toString();
            }
            return D(v.INSTANCE.h(url));
        }

        @fg.l
        public a C(@fg.l URL url) {
            l0.p(url, ProtectedSandApp.s("麱\u0001"));
            v.Companion companion = v.INSTANCE;
            String url2 = url.toString();
            l0.o(url2, ProtectedSandApp.s("麷\u0001"));
            return D(companion.h(url2));
        }

        @fg.l
        public a D(@fg.l v url) {
            l0.p(url, ProtectedSandApp.s("麱\u0001"));
            this.url = url;
            return this;
        }

        @fg.l
        public a a(@fg.l String name, @fg.l String value) {
            l0.p(name, ProtectedSandApp.s("麸\u0001"));
            l0.p(value, ProtectedSandApp.s("麹\u0001"));
            this.headers.b(name, value);
            return this;
        }

        @fg.l
        public d0 b() {
            v vVar = this.url;
            if (vVar != null) {
                return new d0(vVar, this.method, this.headers.i(), this.body, okhttp3.internal.d.d0(this.tags));
            }
            throw new IllegalStateException(ProtectedSandApp.s("麺\u0001"));
        }

        @fg.l
        public a c(@fg.l d cacheControl) {
            l0.p(cacheControl, ProtectedSandApp.s("麻\u0001"));
            String dVar = cacheControl.toString();
            int length = dVar.length();
            String s4 = ProtectedSandApp.s("麼\u0001");
            return length == 0 ? t(s4) : n(s4, dVar);
        }

        @fg.l
        @kd.j
        public final a d() {
            return f(this, null, 1, null);
        }

        @fg.l
        @kd.j
        public a e(@fg.m e0 body) {
            return p(ProtectedSandApp.s("麽\u0001"), body);
        }

        @fg.l
        public a g() {
            return p(ProtectedSandApp.s("麮\u0001"), null);
        }

        @fg.m
        /* renamed from: h, reason: from getter */
        public final e0 getBody() {
            return this.body;
        }

        @fg.l
        /* renamed from: i, reason: from getter */
        public final u.a getHeaders() {
            return this.headers;
        }

        @fg.l
        /* renamed from: j, reason: from getter */
        public final String getMethod() {
            return this.method;
        }

        @fg.l
        public final Map<Class<?>, Object> k() {
            return this.tags;
        }

        @fg.m
        /* renamed from: l, reason: from getter */
        public final v getUrl() {
            return this.url;
        }

        @fg.l
        public a m() {
            return p(ProtectedSandApp.s("麾\u0001"), null);
        }

        @fg.l
        public a n(@fg.l String name, @fg.l String value) {
            l0.p(name, ProtectedSandApp.s("麸\u0001"));
            l0.p(value, ProtectedSandApp.s("麹\u0001"));
            this.headers.m(name, value);
            return this;
        }

        @fg.l
        public a o(@fg.l u headers) {
            l0.p(headers, ProtectedSandApp.s("麿\u0001"));
            this.headers = headers.m();
            return this;
        }

        @fg.l
        public a p(@fg.l String method, @fg.m e0 body) {
            l0.p(method, ProtectedSandApp.s("黀\u0001"));
            if (!(method.length() > 0)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("黄\u0001"));
            }
            String s4 = ProtectedSandApp.s("黁\u0001");
            if (body == null) {
                if (okhttp3.internal.http.f.e(method)) {
                    throw new IllegalArgumentException(android.support.v4.media.d.a(s4, method, ProtectedSandApp.s("黂\u0001")).toString());
                }
            } else if (!okhttp3.internal.http.f.b(method)) {
                throw new IllegalArgumentException(android.support.v4.media.d.a(s4, method, ProtectedSandApp.s("黃\u0001")).toString());
            }
            this.method = method;
            this.body = body;
            return this;
        }

        @fg.l
        public a q(@fg.l e0 body) {
            l0.p(body, ProtectedSandApp.s("黅\u0001"));
            return p(ProtectedSandApp.s("黆\u0001"), body);
        }

        @fg.l
        public a r(@fg.l e0 body) {
            l0.p(body, ProtectedSandApp.s("黅\u0001"));
            return p(ProtectedSandApp.s("黇\u0001"), body);
        }

        @fg.l
        public a s(@fg.l e0 body) {
            l0.p(body, ProtectedSandApp.s("黅\u0001"));
            return p(ProtectedSandApp.s("黈\u0001"), body);
        }

        @fg.l
        public a t(@fg.l String name) {
            l0.p(name, ProtectedSandApp.s("麸\u0001"));
            this.headers.l(name);
            return this;
        }

        public final void u(@fg.m e0 e0Var) {
            this.body = e0Var;
        }

        public final void v(@fg.l u.a aVar) {
            l0.p(aVar, ProtectedSandApp.s("黉\u0001"));
            this.headers = aVar;
        }

        public final void w(@fg.l String str) {
            l0.p(str, ProtectedSandApp.s("黉\u0001"));
            this.method = str;
        }

        public final void x(@fg.l Map<Class<?>, Object> map) {
            l0.p(map, ProtectedSandApp.s("黉\u0001"));
            this.tags = map;
        }

        public final void y(@fg.m v vVar) {
            this.url = vVar;
        }

        @fg.l
        public <T> a z(@fg.l Class<? super T> type, @fg.m T tag) {
            l0.p(type, ProtectedSandApp.s("黊\u0001"));
            if (tag == null) {
                this.tags.remove(type);
            } else {
                if (this.tags.isEmpty()) {
                    this.tags = new LinkedHashMap();
                }
                Map<Class<?>, Object> map = this.tags;
                T cast = type.cast(tag);
                l0.m(cast);
                map.put(type, cast);
            }
            return this;
        }

        public a(@fg.l d0 d0Var) {
            Map<Class<?>, Object> J0;
            l0.p(d0Var, ProtectedSandApp.s("麯\u0001"));
            this.tags = new LinkedHashMap();
            this.url = d0Var.q();
            this.method = d0Var.m();
            this.body = d0Var.f();
            if (d0Var.h().isEmpty()) {
                J0 = new LinkedHashMap<>();
            } else {
                J0 = z0.J0(d0Var.h());
            }
            this.tags = J0;
            this.headers = d0Var.k().m();
        }
    }
}
