package okhttp3;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.collections.f1;
import okhttp3.v;
import okhttp3.w;

/* compiled from: Request.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0018BC\b\u0000\u0012\u0006\u0010\"\u001a\u00020\u000f\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020\u0014\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0017\u0012\u0016\u00100\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00010,¢\u0006\u0004\b7\u00108J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001J%\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\t¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u000e\u001a\u00020\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u0002H\u0016R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u0017\u0010\"\u001a\u00020\u000f8\u0007¢\u0006\f\n\u0004\b\u001b\u0010 \u001a\u0004\b!\u0010\u0011R\u0017\u0010%\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010#\u001a\u0004\b$\u0010\u0013R\u0017\u0010(\u001a\u00020\u00148\u0007¢\u0006\f\n\u0004\b\u0012\u0010&\u001a\u0004\b'\u0010\u0016R\u0019\u0010+\u001a\u0004\u0018\u00010\u00178\u0007¢\u0006\f\n\u0004\b\u0010\u0010)\u001a\u0004\b*\u0010\u0019R*\u00100\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00010,8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010-\u001a\u0004\b.\u0010/R\u0011\u00104\u001a\u0002018F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u00106\u001a\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b5\u0010\u001c¨\u00069"}, d2 = {"Lokhttp3/e0;", "", "", "name", "i", "", "j", "o", "T", "Ljava/lang/Class;", "type", "p", "(Ljava/lang/Class;)Ljava/lang/Object;", "Lokhttp3/e0$a;", "n", "Lokhttp3/w;", "e", "()Lokhttp3/w;", "d", "()Ljava/lang/String;", "Lokhttp3/v;", "c", "()Lokhttp3/v;", "Lokhttp3/f0;", "a", "()Lokhttp3/f0;", "Lokhttp3/d;", "b", "()Lokhttp3/d;", "toString", "Lokhttp3/d;", "lazyCacheControl", "Lokhttp3/w;", "q", "url", "Ljava/lang/String;", "m", "method", "Lokhttp3/v;", "k", "headers", "Lokhttp3/f0;", "f", "body", "", "Ljava/util/Map;", "h", "()Ljava/util/Map;", "tags", "", "l", "()Z", "isHttps", "g", "cacheControl", "<init>", "(Lokhttp3/w;Ljava/lang/String;Lokhttp3/v;Lokhttp3/f0;Ljava/util/Map;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private d lazyCacheControl;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final w url;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final String method;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final v headers;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final f0 body;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final Map<Class<?>, Object> tags;

    public e0(@d5.d w wVar, @d5.d String str, @d5.d v vVar, @d5.e f0 f0Var, @d5.d Map<Class<?>, ? extends Object> map) {
        kotlin.jvm.internal.l0.p(wVar, ProtectedSandApp.s("徲"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("徳"));
        kotlin.jvm.internal.l0.p(vVar, ProtectedSandApp.s("徴"));
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("徵"));
        this.url = wVar;
        this.method = str;
        this.headers = vVar;
        this.body = f0Var;
        this.tags = map;
    }

    @p3.i(name = "-deprecated_body")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "body", imports = {}))
    @d5.e
    /* renamed from: a, reason: from getter */
    public final f0 getBody() {
        return this.body;
    }

    @p3.i(name = "-deprecated_cacheControl")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "cacheControl", imports = {}))
    @d5.d
    public final d b() {
        return g();
    }

    @p3.i(name = "-deprecated_headers")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "headers", imports = {}))
    @d5.d
    /* renamed from: c, reason: from getter */
    public final v getHeaders() {
        return this.headers;
    }

    @p3.i(name = "-deprecated_method")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "method", imports = {}))
    @d5.d
    /* renamed from: d, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    @p3.i(name = "-deprecated_url")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "url", imports = {}))
    @d5.d
    /* renamed from: e, reason: from getter */
    public final w getUrl() {
        return this.url;
    }

    @p3.i(name = "body")
    @d5.e
    public final f0 f() {
        return this.body;
    }

    @p3.i(name = "cacheControl")
    @d5.d
    public final d g() {
        d dVar = this.lazyCacheControl;
        if (dVar != null) {
            return dVar;
        }
        d c6 = d.INSTANCE.c(this.headers);
        this.lazyCacheControl = c6;
        return c6;
    }

    @d5.d
    public final Map<Class<?>, Object> h() {
        return this.tags;
    }

    @d5.e
    public final String i(@d5.d String name) {
        kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("徶"));
        return this.headers.g(name);
    }

    @d5.d
    public final List<String> j(@d5.d String name) {
        kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("德"));
        return this.headers.y(name);
    }

    @p3.i(name = "headers")
    @d5.d
    public final v k() {
        return this.headers;
    }

    public final boolean l() {
        return this.url.getIsHttps();
    }

    @p3.i(name = "method")
    @d5.d
    public final String m() {
        return this.method;
    }

    @d5.d
    public final a n() {
        return new a(this);
    }

    @d5.e
    public final Object o() {
        return p(Object.class);
    }

    @d5.e
    public final <T> T p(@d5.d Class<? extends T> type) {
        kotlin.jvm.internal.l0.p(type, ProtectedSandApp.s("徸"));
        return type.cast(this.tags.get(type));
    }

    @p3.i(name = "url")
    @d5.d
    public final w q() {
        return this.url;
    }

    @d5.d
    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("徹"));
        sb.append(this.method);
        sb.append(ProtectedSandApp.s("徺"));
        sb.append(this.url);
        if (this.headers.size() != 0) {
            sb.append(ProtectedSandApp.s("徻"));
            int i5 = 0;
            for (Pair<? extends String, ? extends String> pair : this.headers) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    kotlin.collections.a0.Z();
                }
                Pair<? extends String, ? extends String> pair2 = pair;
                String a6 = pair2.a();
                String b6 = pair2.b();
                if (i5 > 0) {
                    sb.append(ProtectedSandApp.s("徼"));
                }
                sb.append(a6);
                sb.append(':');
                sb.append(b6);
                i5 = i6;
            }
            sb.append(']');
        }
        if (!this.tags.isEmpty()) {
            sb.append(ProtectedSandApp.s("徽"));
            sb.append(this.tags);
        }
        sb.append('}');
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, ProtectedSandApp.s("徾"));
        return sb2;
    }

    /* compiled from: Request.kt */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\bD\u0010EB\u0011\b\u0010\u0012\u0006\u0010F\u001a\u00020%¢\u0006\u0004\bD\u0010GJ\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0007H\u0016J\u0018\u0010\u000b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0000H\u0016J\b\u0010\u0015\u001a\u00020\u0000H\u0016J\u0010\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0014\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0017J\u0010\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u001a\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010\u001f\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0016J/\u0010#\u001a\u00020\u0000\"\u0004\b\u0000\u0010 2\u000e\u0010\"\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000!2\b\u0010\u001e\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b#\u0010$J\b\u0010&\u001a\u00020%H\u0016R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010\u001c\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u0010\u000f\u001a\u0002018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R2\u0010C\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030!\u0012\u0004\u0012\u00020\u00010=8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006H"}, d2 = {"Lokhttp3/e0$a;", "", "Lokhttp3/w;", "url", "D", "", "B", "Ljava/net/URL;", "C", "name", "value", "n", "a", "t", "Lokhttp3/v;", "headers", "o", "Lokhttp3/d;", "cacheControl", "c", "g", "m", "Lokhttp3/f0;", "body", "r", "e", "s", "q", "method", "p", "tag", "A", "T", "Ljava/lang/Class;", "type", "z", "(Ljava/lang/Class;Ljava/lang/Object;)Lokhttp3/e0$a;", "Lokhttp3/e0;", "b", "Lokhttp3/w;", "l", "()Lokhttp3/w;", "y", "(Lokhttp3/w;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "w", "(Ljava/lang/String;)V", "Lokhttp3/v$a;", "Lokhttp3/v$a;", "i", "()Lokhttp3/v$a;", "v", "(Lokhttp3/v$a;)V", "d", "Lokhttp3/f0;", "h", "()Lokhttp3/f0;", "u", "(Lokhttp3/f0;)V", "", "Ljava/util/Map;", "k", "()Ljava/util/Map;", "x", "(Ljava/util/Map;)V", "tags", "<init>", "()V", "request", "(Lokhttp3/e0;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private w url;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private String method;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private v.a headers;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private f0 body;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private Map<Class<?>, Object> tags;

        public a() {
            this.tags = new LinkedHashMap();
            this.method = ProtectedSandApp.s("律");
            this.headers = new v.a();
        }

        public static /* synthetic */ a f(a aVar, f0 f0Var, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("徍"));
            }
            if ((i5 & 1) != 0) {
                f0Var = okhttp3.internal.d.f30932d;
            }
            return aVar.e(f0Var);
        }

        @d5.d
        public a A(@d5.e Object tag) {
            return z(Object.class, tag);
        }

        @d5.d
        public a B(@d5.d String url) {
            boolean q22;
            boolean q23;
            kotlin.jvm.internal.l0.p(url, ProtectedSandApp.s("徎"));
            q22 = kotlin.text.e0.q2(url, ProtectedSandApp.s("徏"), true);
            String s5 = ProtectedSandApp.s("徐");
            if (q22) {
                StringBuilder sb = new StringBuilder(ProtectedSandApp.s("徑"));
                String substring = url.substring(3);
                kotlin.jvm.internal.l0.o(substring, s5);
                sb.append(substring);
                url = sb.toString();
            } else {
                q23 = kotlin.text.e0.q2(url, ProtectedSandApp.s("徒"), true);
                if (q23) {
                    StringBuilder sb2 = new StringBuilder(ProtectedSandApp.s("従"));
                    String substring2 = url.substring(4);
                    kotlin.jvm.internal.l0.o(substring2, s5);
                    sb2.append(substring2);
                    url = sb2.toString();
                }
            }
            return D(w.INSTANCE.h(url));
        }

        @d5.d
        public a C(@d5.d URL url) {
            kotlin.jvm.internal.l0.p(url, ProtectedSandApp.s("徔"));
            w.Companion companion = w.INSTANCE;
            String url2 = url.toString();
            kotlin.jvm.internal.l0.o(url2, ProtectedSandApp.s("徕"));
            return D(companion.h(url2));
        }

        @d5.d
        public a D(@d5.d w url) {
            kotlin.jvm.internal.l0.p(url, ProtectedSandApp.s("徖"));
            this.url = url;
            return this;
        }

        @d5.d
        public a a(@d5.d String name, @d5.d String value) {
            kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("得"));
            kotlin.jvm.internal.l0.p(value, ProtectedSandApp.s("徘"));
            this.headers.b(name, value);
            return this;
        }

        @d5.d
        public e0 b() {
            w wVar = this.url;
            if (wVar != null) {
                return new e0(wVar, this.method, this.headers.i(), this.body, okhttp3.internal.d.d0(this.tags));
            }
            throw new IllegalStateException(ProtectedSandApp.s("徙").toString());
        }

        @d5.d
        public a c(@d5.d d cacheControl) {
            kotlin.jvm.internal.l0.p(cacheControl, ProtectedSandApp.s("徚"));
            String dVar = cacheControl.toString();
            boolean z5 = dVar.length() == 0;
            String s5 = ProtectedSandApp.s("徛");
            return z5 ? t(s5) : n(s5, dVar);
        }

        @d5.d
        @p3.j
        public final a d() {
            return f(this, null, 1, null);
        }

        @d5.d
        @p3.j
        public a e(@d5.e f0 body) {
            return p(ProtectedSandApp.s("徜"), body);
        }

        @d5.d
        public a g() {
            return p(ProtectedSandApp.s("徝"), null);
        }

        @d5.e
        /* renamed from: h, reason: from getter */
        public final f0 getBody() {
            return this.body;
        }

        @d5.d
        /* renamed from: i, reason: from getter */
        public final v.a getHeaders() {
            return this.headers;
        }

        @d5.d
        /* renamed from: j, reason: from getter */
        public final String getMethod() {
            return this.method;
        }

        @d5.d
        public final Map<Class<?>, Object> k() {
            return this.tags;
        }

        @d5.e
        /* renamed from: l, reason: from getter */
        public final w getUrl() {
            return this.url;
        }

        @d5.d
        public a m() {
            return p(ProtectedSandApp.s("從"), null);
        }

        @d5.d
        public a n(@d5.d String name, @d5.d String value) {
            kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("徟"));
            kotlin.jvm.internal.l0.p(value, ProtectedSandApp.s("徠"));
            this.headers.m(name, value);
            return this;
        }

        @d5.d
        public a o(@d5.d v headers) {
            kotlin.jvm.internal.l0.p(headers, ProtectedSandApp.s("御"));
            this.headers = headers.s();
            return this;
        }

        @d5.d
        public a p(@d5.d String method, @d5.e f0 body) {
            kotlin.jvm.internal.l0.p(method, ProtectedSandApp.s("徢"));
            if (!(method.length() > 0)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("徦").toString());
            }
            String s5 = ProtectedSandApp.s("徣");
            if (body == null) {
                if (!(true ^ okhttp3.internal.http.f.e(method))) {
                    throw new IllegalArgumentException(androidx.constraintlayout.solver.widgets.analyzer.e.a(s5, method, ProtectedSandApp.s("徤")).toString());
                }
            } else if (!okhttp3.internal.http.f.b(method)) {
                throw new IllegalArgumentException(androidx.constraintlayout.solver.widgets.analyzer.e.a(s5, method, ProtectedSandApp.s("徥")).toString());
            }
            this.method = method;
            this.body = body;
            return this;
        }

        @d5.d
        public a q(@d5.d f0 body) {
            kotlin.jvm.internal.l0.p(body, ProtectedSandApp.s("徧"));
            return p(ProtectedSandApp.s("徨"), body);
        }

        @d5.d
        public a r(@d5.d f0 body) {
            kotlin.jvm.internal.l0.p(body, ProtectedSandApp.s("復"));
            return p(ProtectedSandApp.s("循"), body);
        }

        @d5.d
        public a s(@d5.d f0 body) {
            kotlin.jvm.internal.l0.p(body, ProtectedSandApp.s("徫"));
            return p(ProtectedSandApp.s("徬"), body);
        }

        @d5.d
        public a t(@d5.d String name) {
            kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("徭"));
            this.headers.l(name);
            return this;
        }

        public final void u(@d5.e f0 f0Var) {
            this.body = f0Var;
        }

        public final void v(@d5.d v.a aVar) {
            kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("微"));
            this.headers = aVar;
        }

        public final void w(@d5.d String str) {
            kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("徯"));
            this.method = str;
        }

        public final void x(@d5.d Map<Class<?>, Object> map) {
            kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("徰"));
            this.tags = map;
        }

        public final void y(@d5.e w wVar) {
            this.url = wVar;
        }

        @d5.d
        public <T> a z(@d5.d Class<? super T> type, @d5.e T tag) {
            kotlin.jvm.internal.l0.p(type, ProtectedSandApp.s("徱"));
            if (tag == null) {
                this.tags.remove(type);
            } else {
                if (this.tags.isEmpty()) {
                    this.tags = new LinkedHashMap();
                }
                Map<Class<?>, Object> map = this.tags;
                T cast = type.cast(tag);
                kotlin.jvm.internal.l0.m(cast);
                map.put(type, cast);
            }
            return this;
        }

        public a(@d5.d e0 e0Var) {
            Map<Class<?>, Object> J0;
            kotlin.jvm.internal.l0.p(e0Var, ProtectedSandApp.s("後"));
            this.tags = new LinkedHashMap();
            this.url = e0Var.q();
            this.method = e0Var.m();
            this.body = e0Var.f();
            if (!e0Var.h().isEmpty()) {
                J0 = f1.J0(e0Var.h());
            } else {
                J0 = new LinkedHashMap<>();
            }
            this.tags = J0;
            this.headers = e0Var.k().s();
        }
    }
}
