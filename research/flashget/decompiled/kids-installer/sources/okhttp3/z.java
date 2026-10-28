package okhttp3;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.text.Typography;
import okhttp3.f0;
import okhttp3.v;
import okhttp3.y;

/* compiled from: MultipartBody.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 12\u00020\u0001:\u0003\u0018\r\u001dB'\b\u0000\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010&\u001a\u00020\f\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0\u0015¢\u0006\u0004\b/\u00100J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\b\u0010\r\u001a\u00020\fH\u0016J\u000f\u0010\u000e\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0006H\u0016J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u001c\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0017\u0010&\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\u000fR\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0\u00158\u0007¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0017R\u0011\u0010,\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b+\u0010\u0012R\u0011\u0010.\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b-\u0010\u0014¨\u00062"}, d2 = {"Lokhttp3/z;", "Lokhttp3/f0;", "Lokio/n;", "sink", "", "countBytes", "", "B", "", "index", "Lokhttp3/z$c;", "x", "Lokhttp3/y;", "b", "v", "()Lokhttp3/y;", "", "s", "()Ljava/lang/String;", "u", "()I", "", "t", "()Ljava/util/List;", "a", "Lkotlin/m2;", "r", "Lokhttp3/y;", "contentType", "c", "J", "contentLength", "Lokio/p;", "d", "Lokio/p;", "boundaryByteString", "e", "A", "type", "f", "Ljava/util/List;", "y", "parts", "w", "boundary", "z", "size", "<init>", "(Lokio/p;Lokhttp3/y;Ljava/util/List;)V", "o", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
public final class z extends f0 {

    /* renamed from: g, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final y f31580g;

    /* renamed from: h, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final y f31581h;

    /* renamed from: i, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final y f31582i;

    /* renamed from: j, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final y f31583j;

    /* renamed from: k, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final y f31584k;

    /* renamed from: l, reason: collision with root package name */
    private static final byte[] f31585l;

    /* renamed from: m, reason: collision with root package name */
    private static final byte[] f31586m;

    /* renamed from: n, reason: collision with root package name */
    private static final byte[] f31587n;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final y contentType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long contentLength;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final okio.p boundaryByteString;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final y type;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final List<c> parts;

    /* compiled from: MultipartBody.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u0018\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0006\u001a\u00020\u0005J\u0016\u0010\u000e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bJ \u0010\u0010\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0015\u001a\u00020\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001b¨\u0006\u001f"}, d2 = {"Lokhttp3/z$a;", "", "Lokhttp3/y;", "type", "g", "Lokhttp3/f0;", "body", "e", "Lokhttp3/v;", "headers", "c", "", "name", "value", "a", "filename", "b", "Lokhttp3/z$c;", "part", "d", "Lokhttp3/z;", "f", "Lokio/p;", "Lokio/p;", "boundary", "Lokhttp3/y;", "", "Ljava/util/List;", "parts", "<init>", "(Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final okio.p boundary;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private y type;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<c> parts;

        /* JADX WARN: Multi-variable type inference failed */
        @p3.j
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @d5.d
        public final a a(@d5.d String name, @d5.d String value) {
            kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("某"));
            kotlin.jvm.internal.l0.p(value, ProtectedSandApp.s("柑"));
            d(c.INSTANCE.c(name, value));
            return this;
        }

        @d5.d
        public final a b(@d5.d String name, @d5.e String filename, @d5.d f0 body) {
            kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("柒"));
            kotlin.jvm.internal.l0.p(body, ProtectedSandApp.s("染"));
            d(c.INSTANCE.d(name, filename, body));
            return this;
        }

        @d5.d
        public final a c(@d5.e v headers, @d5.d f0 body) {
            kotlin.jvm.internal.l0.p(body, ProtectedSandApp.s("柔"));
            d(c.INSTANCE.a(headers, body));
            return this;
        }

        @d5.d
        public final a d(@d5.d c part) {
            kotlin.jvm.internal.l0.p(part, ProtectedSandApp.s("柕"));
            this.parts.add(part);
            return this;
        }

        @d5.d
        public final a e(@d5.d f0 body) {
            kotlin.jvm.internal.l0.p(body, ProtectedSandApp.s("柖"));
            d(c.INSTANCE.b(body));
            return this;
        }

        @d5.d
        public final z f() {
            if (!this.parts.isEmpty()) {
                return new z(this.boundary, this.type, okhttp3.internal.d.c0(this.parts));
            }
            throw new IllegalStateException(ProtectedSandApp.s("柗").toString());
        }

        @d5.d
        public final a g(@d5.d y type) {
            kotlin.jvm.internal.l0.p(type, ProtectedSandApp.s("柘"));
            if (kotlin.jvm.internal.l0.g(type.l(), ProtectedSandApp.s("柙"))) {
                this.type = type;
                return this;
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("柚") + type).toString());
        }

        @p3.j
        public a(@d5.d String str) {
            kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("柎"));
            this.boundary = okio.p.INSTANCE.l(str);
            this.type = z.f31580g;
            this.parts = new ArrayList();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ a(java.lang.String r1, int r2, kotlin.jvm.internal.w r3) {
            /*
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto L15
                java.util.UUID r1 = java.util.UUID.randomUUID()
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "柏"
                java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
                kotlin.jvm.internal.l0.o(r1, r2)
            L15:
                r0.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.z.a.<init>(java.lang.String, int, kotlin.jvm.internal.w):void");
        }
    }

    /* compiled from: MultipartBody.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0007\u001a\u00020\u0006*\u00060\u0002j\u0002`\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0013\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000b¨\u0006\u0017"}, d2 = {"Lokhttp3/z$b;", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "key", "Lkotlin/m2;", "a", "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", "Lokhttp3/y;", "ALTERNATIVE", "Lokhttp3/y;", "", "COLONSPACE", "[B", "CRLF", "DASHDASH", "DIGEST", "FORM", "MIXED", "PARALLEL", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.z$b, reason: from kotlin metadata */
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public final void a(@d5.d StringBuilder sb, @d5.d String str) {
            kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("柛"));
            kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("柜"));
            sb.append(Typography.f27126b);
            int length = str.length();
            for (int i5 = 0; i5 < length; i5++) {
                char charAt = str.charAt(i5);
                if (charAt == '\n') {
                    sb.append(ProtectedSandApp.s("柟"));
                } else if (charAt == '\r') {
                    sb.append(ProtectedSandApp.s("柞"));
                } else if (charAt != '\"') {
                    sb.append(charAt);
                } else {
                    sb.append(ProtectedSandApp.s("柝"));
                }
            }
            sb.append(Typography.f27126b);
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: MultipartBody.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \f2\u00020\u0001:\u0001\u0006B\u001b\b\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\b\u001a\u0004\b\t\u0010\u0004R\u0017\u0010\r\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\u0007¨\u0006\u0010"}, d2 = {"Lokhttp3/z$c;", "", "Lokhttp3/v;", "b", "()Lokhttp3/v;", "Lokhttp3/f0;", "a", "()Lokhttp3/f0;", "Lokhttp3/v;", "h", "headers", "Lokhttp3/f0;", "c", "body", "<init>", "(Lokhttp3/v;Lokhttp3/f0;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static final class c {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private final v headers;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final f0 body;

        /* compiled from: MultipartBody.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001a\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0007J\"\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0011"}, d2 = {"Lokhttp3/z$c$a;", "", "Lokhttp3/f0;", "body", "Lokhttp3/z$c;", "b", "Lokhttp3/v;", "headers", "a", "", "name", "value", "c", "filename", "d", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: okhttp3.z$c$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @d5.d
            @p3.n
            public final c a(@d5.e v headers, @d5.d f0 body) {
                kotlin.jvm.internal.l0.p(body, ProtectedSandApp.s("柠"));
                kotlin.jvm.internal.w wVar = null;
                if (!((headers != null ? headers.g(ProtectedSandApp.s("柡")) : null) == null)) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("柤").toString());
                }
                if ((headers != null ? headers.g(ProtectedSandApp.s("柢")) : null) == null) {
                    return new c(headers, body, wVar);
                }
                throw new IllegalArgumentException(ProtectedSandApp.s("柣").toString());
            }

            @d5.d
            @p3.n
            public final c b(@d5.d f0 body) {
                kotlin.jvm.internal.l0.p(body, ProtectedSandApp.s("查"));
                return a(null, body);
            }

            @d5.d
            @p3.n
            public final c c(@d5.d String name, @d5.d String value) {
                kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("柦"));
                kotlin.jvm.internal.l0.p(value, ProtectedSandApp.s("柧"));
                return d(name, null, f0.Companion.o(f0.INSTANCE, value, null, 1, null));
            }

            @d5.d
            @p3.n
            public final c d(@d5.d String name, @d5.e String filename, @d5.d f0 body) {
                kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("柨"));
                kotlin.jvm.internal.l0.p(body, ProtectedSandApp.s("柩"));
                StringBuilder sb = new StringBuilder();
                sb.append(ProtectedSandApp.s("柪"));
                Companion companion = z.INSTANCE;
                companion.a(sb, name);
                if (filename != null) {
                    sb.append(ProtectedSandApp.s("柫"));
                    companion.a(sb, filename);
                }
                String sb2 = sb.toString();
                kotlin.jvm.internal.l0.o(sb2, ProtectedSandApp.s("柬"));
                return a(new v.a().h(ProtectedSandApp.s("柭"), sb2).i(), body);
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
                this();
            }
        }

        private c(v vVar, f0 f0Var) {
            this.headers = vVar;
            this.body = f0Var;
        }

        @d5.d
        @p3.n
        public static final c d(@d5.e v vVar, @d5.d f0 f0Var) {
            return INSTANCE.a(vVar, f0Var);
        }

        @d5.d
        @p3.n
        public static final c e(@d5.d f0 f0Var) {
            return INSTANCE.b(f0Var);
        }

        @d5.d
        @p3.n
        public static final c f(@d5.d String str, @d5.d String str2) {
            return INSTANCE.c(str, str2);
        }

        @d5.d
        @p3.n
        public static final c g(@d5.d String str, @d5.e String str2, @d5.d f0 f0Var) {
            return INSTANCE.d(str, str2, f0Var);
        }

        @p3.i(name = "-deprecated_body")
        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "body", imports = {}))
        @d5.d
        /* renamed from: a, reason: from getter */
        public final f0 getBody() {
            return this.body;
        }

        @p3.i(name = "-deprecated_headers")
        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "headers", imports = {}))
        @d5.e
        /* renamed from: b, reason: from getter */
        public final v getHeaders() {
            return this.headers;
        }

        @p3.i(name = "body")
        @d5.d
        public final f0 c() {
            return this.body;
        }

        @p3.i(name = "headers")
        @d5.e
        public final v h() {
            return this.headers;
        }

        public /* synthetic */ c(v vVar, f0 f0Var, kotlin.jvm.internal.w wVar) {
            this(vVar, f0Var);
        }
    }

    static {
        y.Companion companion = y.INSTANCE;
        f31580g = companion.c(ProtectedSandApp.s("銋"));
        f31581h = companion.c(ProtectedSandApp.s("銌"));
        f31582i = companion.c(ProtectedSandApp.s("銍"));
        f31583j = companion.c(ProtectedSandApp.s("銎"));
        f31584k = companion.c(ProtectedSandApp.s("銏"));
        f31585l = new byte[]{(byte) 58, (byte) 32};
        f31586m = new byte[]{(byte) 13, (byte) 10};
        byte b6 = (byte) 45;
        f31587n = new byte[]{b6, b6};
    }

    public z(@d5.d okio.p pVar, @d5.d y yVar, @d5.d List<c> list) {
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("銐"));
        kotlin.jvm.internal.l0.p(yVar, ProtectedSandApp.s("銑"));
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("銒"));
        this.boundaryByteString = pVar;
        this.type = yVar;
        this.parts = list;
        this.contentType = y.INSTANCE.c(yVar + ProtectedSandApp.s("銓") + w());
        this.contentLength = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long B(okio.n sink, boolean countBytes) throws IOException {
        okio.m mVar;
        if (countBytes) {
            sink = new okio.m();
            mVar = sink;
        } else {
            mVar = 0;
        }
        int size = this.parts.size();
        long j5 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            c cVar = this.parts.get(i5);
            v h5 = cVar.h();
            f0 c6 = cVar.c();
            kotlin.jvm.internal.l0.m(sink);
            sink.write(f31587n);
            sink.S0(this.boundaryByteString);
            sink.write(f31586m);
            if (h5 != null) {
                int size2 = h5.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    sink.j0(h5.q(i6)).write(f31585l).j0(h5.x(i6)).write(f31586m);
                }
            }
            y contentType = c6.getContentType();
            if (contentType != null) {
                sink.j0(ProtectedSandApp.s("銔")).j0(contentType.getMediaType()).write(f31586m);
            }
            long a6 = c6.a();
            if (a6 != -1) {
                sink.j0(ProtectedSandApp.s("銕")).j1(a6).write(f31586m);
            } else if (countBytes) {
                kotlin.jvm.internal.l0.m(mVar);
                mVar.c();
                return -1L;
            }
            byte[] bArr = f31586m;
            sink.write(bArr);
            if (countBytes) {
                j5 += a6;
            } else {
                c6.r(sink);
            }
            sink.write(bArr);
        }
        kotlin.jvm.internal.l0.m(sink);
        byte[] bArr2 = f31587n;
        sink.write(bArr2);
        sink.S0(this.boundaryByteString);
        sink.write(bArr2);
        sink.write(f31586m);
        if (!countBytes) {
            return j5;
        }
        kotlin.jvm.internal.l0.m(mVar);
        long size3 = j5 + mVar.size();
        mVar.c();
        return size3;
    }

    @p3.i(name = "type")
    @d5.d
    /* renamed from: A, reason: from getter */
    public final y getType() {
        return this.type;
    }

    @Override // okhttp3.f0
    public long a() throws IOException {
        long j5 = this.contentLength;
        if (j5 != -1) {
            return j5;
        }
        long B = B(null, true);
        this.contentLength = B;
        return B;
    }

    @Override // okhttp3.f0
    @d5.d
    /* renamed from: b, reason: from getter */
    public y getContentType() {
        return this.contentType;
    }

    @Override // okhttp3.f0
    public void r(@d5.d okio.n nVar) throws IOException {
        kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("銖"));
        B(nVar, false);
    }

    @p3.i(name = "-deprecated_boundary")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "boundary", imports = {}))
    @d5.d
    public final String s() {
        return w();
    }

    @p3.i(name = "-deprecated_parts")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "parts", imports = {}))
    @d5.d
    public final List<c> t() {
        return this.parts;
    }

    @p3.i(name = "-deprecated_size")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "size", imports = {}))
    public final int u() {
        return z();
    }

    @p3.i(name = "-deprecated_type")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "type", imports = {}))
    @d5.d
    public final y v() {
        return this.type;
    }

    @p3.i(name = "boundary")
    @d5.d
    public final String w() {
        return this.boundaryByteString.t0();
    }

    @d5.d
    public final c x(int index) {
        return this.parts.get(index);
    }

    @p3.i(name = "parts")
    @d5.d
    public final List<c> y() {
        return this.parts;
    }

    @p3.i(name = "size")
    public final int z() {
        return this.parts.size();
    }
}
