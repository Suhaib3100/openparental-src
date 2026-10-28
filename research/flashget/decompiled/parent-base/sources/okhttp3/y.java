package okhttp3;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.text.m0;
import kotlin.x0;
import okhttp3.e0;
import okhttp3.u;
import okhttp3.x;

/* compiled from: MultipartBody.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 /2\u00020\u0001:\u0003\u001a\u001e\u001cB'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0010\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010%R\u0016\u0010 \u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0018\u0010%\u001a\u0004\b(\u0010\u0017R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u001fR\u0011\u0010,\u001a\u00020\u00198G¢\u0006\u0006\u001a\u0004\b)\u0010\u001bR\u0011\u0010.\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b-\u0010\u001d¨\u00060"}, d2 = {"Lokhttp3/y;", "Lokhttp3/e0;", "Lokio/p;", "boundaryByteString", "Lokhttp3/x;", "type", "", "Lokhttp3/y$c;", "parts", "<init>", "(Lokio/p;Lokhttp3/x;Ljava/util/List;)V", "Lokio/n;", "sink", "", "countBytes", "", "j", "(Lokio/n;Z)J", "", "index", "f", "(I)Lokhttp3/y$c;", "contentType", "()Lokhttp3/x;", "d", "", "a", "()Ljava/lang/String;", "c", "()I", "b", "()Ljava/util/List;", "contentLength", "()J", "Lkotlin/k2;", "writeTo", "(Lokio/n;)V", "Lokhttp3/x;", "J", "Lokio/p;", "i", "e", "Ljava/util/List;", "g", "boundary", "h", "size", "n", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class y extends e0 {

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final x f85122f;

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final x f85123g;

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final x f85124h;

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final x f85125i;

    /* renamed from: j, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final x f85126j;

    /* renamed from: k, reason: collision with root package name */
    private static final byte[] f85127k;

    /* renamed from: l, reason: collision with root package name */
    private static final byte[] f85128l;

    /* renamed from: m, reason: collision with root package name */
    private static final byte[] f85129m;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final x contentType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long contentLength;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final okio.p boundaryByteString;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final x type;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<c> parts;

    /* compiled from: MultipartBody.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010!R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\"R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00190#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010$¨\u0006&"}, d2 = {"Lokhttp3/y$a;", "", "", "boundary", "<init>", "(Ljava/lang/String;)V", "Lokhttp3/x;", "type", "g", "(Lokhttp3/x;)Lokhttp3/y$a;", "Lokhttp3/e0;", "body", "e", "(Lokhttp3/e0;)Lokhttp3/y$a;", "Lokhttp3/u;", "headers", "c", "(Lokhttp3/u;Lokhttp3/e0;)Lokhttp3/y$a;", "name", "value", "a", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/y$a;", "filename", "b", "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/e0;)Lokhttp3/y$a;", "Lokhttp3/y$c;", "part", "d", "(Lokhttp3/y$c;)Lokhttp3/y$a;", "Lokhttp3/y;", "f", "()Lokhttp3/y;", "Lokio/p;", "Lokio/p;", "Lokhttp3/x;", "", "Ljava/util/List;", "parts", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final okio.p boundary;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private x type;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<c> parts;

        /* JADX WARN: Multi-variable type inference failed */
        @kd.j
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @fg.l
        public final a a(@fg.l String name, @fg.l String value) {
            l0.p(name, ProtectedSandApp.s("ꊽ\u0001"));
            l0.p(value, ProtectedSandApp.s("ꊾ\u0001"));
            d(c.INSTANCE.c(name, value));
            return this;
        }

        @fg.l
        public final a b(@fg.l String name, @fg.m String filename, @fg.l e0 body) {
            l0.p(name, ProtectedSandApp.s("ꊽ\u0001"));
            l0.p(body, ProtectedSandApp.s("ꊿ\u0001"));
            d(c.INSTANCE.d(name, filename, body));
            return this;
        }

        @fg.l
        public final a c(@fg.m u headers, @fg.l e0 body) {
            l0.p(body, ProtectedSandApp.s("ꊿ\u0001"));
            d(c.INSTANCE.a(headers, body));
            return this;
        }

        @fg.l
        public final a d(@fg.l c part) {
            l0.p(part, ProtectedSandApp.s("ꋀ\u0001"));
            this.parts.add(part);
            return this;
        }

        @fg.l
        public final a e(@fg.l e0 body) {
            l0.p(body, ProtectedSandApp.s("ꊿ\u0001"));
            d(c.INSTANCE.b(body));
            return this;
        }

        @fg.l
        public final y f() {
            if (this.parts.isEmpty()) {
                throw new IllegalStateException(ProtectedSandApp.s("ꋁ\u0001"));
            }
            return new y(this.boundary, this.type, okhttp3.internal.d.c0(this.parts));
        }

        @fg.l
        public final a g(@fg.l x type) {
            l0.p(type, ProtectedSandApp.s("ꋂ\u0001"));
            if (l0.g(type.l(), ProtectedSandApp.s("ꋃ\u0001"))) {
                this.type = type;
                return this;
            }
            throw new IllegalArgumentException((ProtectedSandApp.s("ꋄ\u0001") + type).toString());
        }

        @kd.j
        public a(@fg.l String str) {
            l0.p(str, ProtectedSandApp.s("ꊻ\u0001"));
            this.boundary = okio.p.INSTANCE.l(str);
            this.type = y.f85122f;
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
                if (r2 == 0) goto L16
                java.util.UUID r1 = java.util.UUID.randomUUID()
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "ꊼ\u0001"
                java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
                kotlin.jvm.internal.l0.o(r1, r2)
            L16:
                r0.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.y.a.<init>(java.lang.String, int, kotlin.jvm.internal.w):void");
        }
    }

    /* compiled from: MultipartBody.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b*\u00060\u0004j\u0002`\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u0014\u0010\u0016\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\r¨\u0006\u0017"}, d2 = {"Lokhttp3/y$b;", "", "<init>", "()V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "key", "Lkotlin/k2;", "a", "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", "Lokhttp3/x;", "ALTERNATIVE", "Lokhttp3/x;", "", "COLONSPACE", "[B", "CRLF", "DASHDASH", "DIGEST", "FORM", "MIXED", "PARALLEL", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.y$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final void a(@fg.l StringBuilder sb, @fg.l String str) {
            l0.p(sb, ProtectedSandApp.s("ꋅ\u0001"));
            l0.p(str, ProtectedSandApp.s("ꋆ\u0001"));
            sb.append(m0.quote);
            int length = str.length();
            for (int i4 = 0; i4 < length; i4++) {
                char charAt = str.charAt(i4);
                if (charAt == '\n') {
                    sb.append(ProtectedSandApp.s("ꋉ\u0001"));
                } else if (charAt == '\r') {
                    sb.append(ProtectedSandApp.s("ꋈ\u0001"));
                } else if (charAt != '\"') {
                    sb.append(charAt);
                } else {
                    sb.append(ProtectedSandApp.s("ꋇ\u0001"));
                }
            }
            sb.append(m0.quote);
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: MultipartBody.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u000f2\u00020\u0001:\u0001\nB\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lokhttp3/y$c;", "", "Lokhttp3/u;", "headers", "Lokhttp3/e0;", "body", "<init>", "(Lokhttp3/u;Lokhttp3/e0;)V", "b", "()Lokhttp3/u;", "a", "()Lokhttp3/e0;", "Lokhttp3/u;", "h", "Lokhttp3/e0;", "c", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class c {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private final u headers;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final e0 body;

        /* compiled from: MultipartBody.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lokhttp3/y$c$a;", "", "<init>", "()V", "Lokhttp3/e0;", "body", "Lokhttp3/y$c;", "b", "(Lokhttp3/e0;)Lokhttp3/y$c;", "Lokhttp3/u;", "headers", "a", "(Lokhttp3/u;Lokhttp3/e0;)Lokhttp3/y$c;", "", "name", "value", "c", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/y$c;", "filename", "d", "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/e0;)Lokhttp3/y$c;", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: okhttp3.y$c$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @fg.l
            @kd.n
            public final c a(@fg.m u headers, @fg.l e0 body) {
                l0.p(body, ProtectedSandApp.s("ꋊ\u0001"));
                kotlin.jvm.internal.w wVar = null;
                if (!((headers != null ? headers.f(ProtectedSandApp.s("ꋋ\u0001")) : null) == null)) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("ꋎ\u0001"));
                }
                if ((headers != null ? headers.f(ProtectedSandApp.s("ꋌ\u0001")) : null) == null) {
                    return new c(headers, body, wVar);
                }
                throw new IllegalArgumentException(ProtectedSandApp.s("ꋍ\u0001"));
            }

            @fg.l
            @kd.n
            public final c b(@fg.l e0 body) {
                l0.p(body, ProtectedSandApp.s("ꋊ\u0001"));
                return a(null, body);
            }

            @fg.l
            @kd.n
            public final c c(@fg.l String name, @fg.l String value) {
                l0.p(name, ProtectedSandApp.s("ꋏ\u0001"));
                l0.p(value, ProtectedSandApp.s("ꋐ\u0001"));
                return d(name, null, e0.Companion.o(e0.INSTANCE, value, null, 1, null));
            }

            @fg.l
            @kd.n
            public final c d(@fg.l String name, @fg.m String filename, @fg.l e0 body) {
                l0.p(name, ProtectedSandApp.s("ꋏ\u0001"));
                l0.p(body, ProtectedSandApp.s("ꋊ\u0001"));
                StringBuilder sb = new StringBuilder();
                sb.append(ProtectedSandApp.s("ꋑ\u0001"));
                Companion companion = y.INSTANCE;
                companion.a(sb, name);
                if (filename != null) {
                    sb.append(ProtectedSandApp.s("ꋒ\u0001"));
                    companion.a(sb, filename);
                }
                String sb2 = sb.toString();
                l0.o(sb2, ProtectedSandApp.s("ꋓ\u0001"));
                return a(new u.a().h(ProtectedSandApp.s("ꋔ\u0001"), sb2).i(), body);
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
                this();
            }
        }

        private c(u uVar, e0 e0Var) {
            this.headers = uVar;
            this.body = e0Var;
        }

        @fg.l
        @kd.n
        public static final c d(@fg.m u uVar, @fg.l e0 e0Var) {
            return INSTANCE.a(uVar, e0Var);
        }

        @fg.l
        @kd.n
        public static final c e(@fg.l e0 e0Var) {
            return INSTANCE.b(e0Var);
        }

        @fg.l
        @kd.n
        public static final c f(@fg.l String str, @fg.l String str2) {
            return INSTANCE.c(str, str2);
        }

        @fg.l
        @kd.n
        public static final c g(@fg.l String str, @fg.m String str2, @fg.l e0 e0Var) {
            return INSTANCE.d(str, str2, e0Var);
        }

        @fg.l
        @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "body", imports = {}))
        @kd.i(name = "-deprecated_body")
        /* renamed from: a, reason: from getter */
        public final e0 getBody() {
            return this.body;
        }

        @fg.m
        @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "headers", imports = {}))
        @kd.i(name = "-deprecated_headers")
        /* renamed from: b, reason: from getter */
        public final u getHeaders() {
            return this.headers;
        }

        @fg.l
        @kd.i(name = "body")
        public final e0 c() {
            return this.body;
        }

        @fg.m
        @kd.i(name = "headers")
        public final u h() {
            return this.headers;
        }

        public /* synthetic */ c(u uVar, e0 e0Var, kotlin.jvm.internal.w wVar) {
            this(uVar, e0Var);
        }
    }

    static {
        x.Companion companion = x.INSTANCE;
        f85122f = companion.c(ProtectedSandApp.s("ꋕ\u0001"));
        f85123g = companion.c(ProtectedSandApp.s("ꋖ\u0001"));
        f85124h = companion.c(ProtectedSandApp.s("ꋗ\u0001"));
        f85125i = companion.c(ProtectedSandApp.s("ꋘ\u0001"));
        f85126j = companion.c(ProtectedSandApp.s("ꋙ\u0001"));
        f85127k = new byte[]{(byte) 58, (byte) 32};
        f85128l = new byte[]{(byte) 13, (byte) 10};
        byte b5 = (byte) 45;
        f85129m = new byte[]{b5, b5};
    }

    public y(@fg.l okio.p pVar, @fg.l x xVar, @fg.l List<c> list) {
        l0.p(pVar, ProtectedSandApp.s("ꋚ\u0001"));
        l0.p(xVar, ProtectedSandApp.s("ꋛ\u0001"));
        l0.p(list, ProtectedSandApp.s("ꋜ\u0001"));
        this.boundaryByteString = pVar;
        this.type = xVar;
        this.parts = list;
        this.contentType = x.INSTANCE.c(xVar + ProtectedSandApp.s("ꋝ\u0001") + pVar.o0());
        this.contentLength = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long j(okio.n sink, boolean countBytes) throws IOException {
        okio.m mVar;
        if (countBytes) {
            sink = new okio.m();
            mVar = sink;
        } else {
            mVar = 0;
        }
        int size = this.parts.size();
        long j4 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            c cVar = this.parts.get(i4);
            u h4 = cVar.h();
            e0 c5 = cVar.c();
            l0.m(sink);
            sink.write(f85129m);
            sink.t3(this.boundaryByteString);
            sink.write(f85128l);
            if (h4 != null) {
                int size2 = h4.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    sink.Q0(h4.j(i5)).write(f85127k).Q0(h4.s(i5)).write(f85128l);
                }
            }
            x contentType = c5.getContentType();
            if (contentType != null) {
                sink.Q0(ProtectedSandApp.s("ꋞ\u0001")).Q0(contentType.getMediaType()).write(f85128l);
            }
            long contentLength = c5.contentLength();
            if (contentLength != -1) {
                sink.Q0(ProtectedSandApp.s("ꋟ\u0001")).N1(contentLength).write(f85128l);
            } else if (countBytes) {
                l0.m(mVar);
                mVar.d();
                return -1L;
            }
            byte[] bArr = f85128l;
            sink.write(bArr);
            if (countBytes) {
                j4 += contentLength;
            } else {
                c5.writeTo(sink);
            }
            sink.write(bArr);
        }
        l0.m(sink);
        byte[] bArr2 = f85129m;
        sink.write(bArr2);
        sink.t3(this.boundaryByteString);
        sink.write(bArr2);
        sink.write(f85128l);
        if (!countBytes) {
            return j4;
        }
        l0.m(mVar);
        long size3 = j4 + mVar.size();
        mVar.d();
        return size3;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "boundary", imports = {}))
    @kd.i(name = "-deprecated_boundary")
    public final String a() {
        return this.boundaryByteString.o0();
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "parts", imports = {}))
    @kd.i(name = "-deprecated_parts")
    public final List<c> b() {
        return this.parts;
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "size", imports = {}))
    @kd.i(name = "-deprecated_size")
    public final int c() {
        return this.parts.size();
    }

    @Override // okhttp3.e0
    public long contentLength() throws IOException {
        long j4 = this.contentLength;
        if (j4 != -1) {
            return j4;
        }
        long j5 = j(null, true);
        this.contentLength = j5;
        return j5;
    }

    @Override // okhttp3.e0
    @fg.l
    /* renamed from: contentType, reason: from getter */
    public x getContentType() {
        return this.contentType;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "type", imports = {}))
    @kd.i(name = "-deprecated_type")
    /* renamed from: d, reason: from getter */
    public final x getType() {
        return this.type;
    }

    @fg.l
    @kd.i(name = "boundary")
    public final String e() {
        return this.boundaryByteString.o0();
    }

    @fg.l
    public final c f(int index) {
        return this.parts.get(index);
    }

    @fg.l
    @kd.i(name = "parts")
    public final List<c> g() {
        return this.parts;
    }

    @kd.i(name = "size")
    public final int h() {
        return this.parts.size();
    }

    @fg.l
    @kd.i(name = "type")
    public final x i() {
        return this.type;
    }

    @Override // okhttp3.e0
    public void writeTo(@fg.l okio.n sink) throws IOException {
        l0.p(sink, ProtectedSandApp.s("ꋠ\u0001"));
        j(sink, false);
    }
}
