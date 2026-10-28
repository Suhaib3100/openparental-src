package okhttp3;

import com.bumptech.glide.load.resource.bitmap.p0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.text.Charsets;

/* compiled from: ResponseBody.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 #2\u00020\u0001:\u0002\u0012\u0017B\u0007¢\u0006\u0004\b!\u0010\"JB\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0004H\u0082\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0002J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH&J\b\u0010\u0010\u001a\u00020\u000fH&J\u0006\u0010\u0012\u001a\u00020\u0011J\b\u0010\u0013\u001a\u00020\u0005H&J\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u001aJ\b\u0010\u001d\u001a\u00020\u001cH\u0016R\u0018\u0010 \u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lokhttp3/h0;", "Ljava/io/Closeable;", "", "T", "Lkotlin/Function1;", "Lokio/o;", "consumer", "", "sizeMapper", "g", "(Lq3/l;Lq3/l;)Ljava/lang/Object;", "Ljava/nio/charset/Charset;", "e", "Lokhttp3/y;", "k", "", "j", "Ljava/io/InputStream;", "a", "B", "", "c", "Lokio/p;", "b", "Ljava/io/Reader;", "d", "", "D", "Lkotlin/m2;", "close", "o", "Ljava/io/Reader;", "reader", "<init>", "()V", "p", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public abstract class h0 implements Closeable {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Reader reader;

    /* compiled from: ResponseBody.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lokhttp3/h0$a;", "Ljava/io/Reader;", "", "cbuf", "", "off", "len", "read", "Lkotlin/m2;", "close", "", "o", "Z", "closed", "p", "Ljava/io/Reader;", "delegate", "Lokio/o;", "q", "Lokio/o;", "source", "Ljava/nio/charset/Charset;", "r", "Ljava/nio/charset/Charset;", "charset", "<init>", "(Lokio/o;Ljava/nio/charset/Charset;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class a extends Reader {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        private Reader delegate;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        private final okio.o source;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        private final Charset charset;

        public a(@d5.d okio.o oVar, @d5.d Charset charset) {
            kotlin.jvm.internal.l0.p(oVar, ProtectedSandApp.s("急"));
            kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("怦"));
            this.source = oVar;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
            } else {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(@d5.d char[] cbuf, int off, int len) throws IOException {
            kotlin.jvm.internal.l0.p(cbuf, ProtectedSandApp.s("性"));
            if (this.closed) {
                throw new IOException(ProtectedSandApp.s("怨"));
            }
            Reader reader = this.delegate;
            if (reader == null) {
                reader = new InputStreamReader(this.source.p1(), okhttp3.internal.d.P(this.source, this.charset));
                this.delegate = reader;
            }
            return reader.read(cbuf, off, len);
        }
    }

    /* compiled from: ResponseBody.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\u00020\u0005*\u00020\b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u0005*\u00020\u000b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0011\u001a\u00020\u0005*\u00020\u000e2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0007J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\bH\u0007J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u000bH\u0007J\"\u0010\u0017\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000eH\u0007¨\u0006\u001a"}, d2 = {"Lokhttp3/h0$b;", "", "", "Lokhttp3/y;", "contentType", "Lokhttp3/h0;", "a", "(Ljava/lang/String;Lokhttp3/y;)Lokhttp3/h0;", "", "h", "([BLokhttp3/y;)Lokhttp3/h0;", "Lokio/p;", "g", "(Lokio/p;Lokhttp3/y;)Lokhttp3/h0;", "Lokio/o;", "", "contentLength", "f", "(Lokio/o;Lokhttp3/y;J)Lokhttp3/h0;", "content", "c", "e", "d", "b", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.h0$b, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: ResponseBody.kt */
        @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"okhttp3/h0$b$a", "Lokhttp3/h0;", "Lokhttp3/y;", "k", "", "j", "Lokio/o;", "B", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: okhttp3.h0$b$a */
        public static final class a extends h0 {

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ okio.o f30636q;

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ y f30637r;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ long f30638s;

            a(okio.o oVar, y yVar, long j5) {
                this.f30636q = oVar;
                this.f30637r = yVar;
                this.f30638s = j5;
            }

            @Override // okhttp3.h0
            @d5.d
            /* renamed from: B, reason: from getter */
            public okio.o getF30636q() {
                return this.f30636q;
            }

            @Override // okhttp3.h0
            /* renamed from: j, reason: from getter */
            public long getF30638s() {
                return this.f30638s;
            }

            @Override // okhttp3.h0
            @d5.e
            /* renamed from: k, reason: from getter */
            public y getF30637r() {
                return this.f30637r;
            }
        }

        private Companion() {
        }

        public static /* synthetic */ h0 i(Companion companion, String str, y yVar, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                yVar = null;
            }
            return companion.a(str, yVar);
        }

        public static /* synthetic */ h0 j(Companion companion, okio.o oVar, y yVar, long j5, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                yVar = null;
            }
            if ((i5 & 2) != 0) {
                j5 = -1;
            }
            return companion.f(oVar, yVar, j5);
        }

        public static /* synthetic */ h0 k(Companion companion, okio.p pVar, y yVar, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                yVar = null;
            }
            return companion.g(pVar, yVar);
        }

        public static /* synthetic */ h0 l(Companion companion, byte[] bArr, y yVar, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                yVar = null;
            }
            return companion.h(bArr, yVar);
        }

        @p3.i(name = "create")
        @d5.d
        @p3.n
        public final h0 a(@d5.d String str, @d5.e y yVar) {
            kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("怩"));
            Charset charset = Charsets.f27049b;
            if (yVar != null) {
                Charset g5 = y.g(yVar, null, 1, null);
                if (g5 == null) {
                    yVar = y.INSTANCE.d(yVar + ProtectedSandApp.s("怪"));
                } else {
                    charset = g5;
                }
            }
            okio.m z02 = new okio.m().z0(str, charset);
            return f(z02, yVar, z02.size());
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
        @d5.d
        @p3.n
        public final h0 b(@d5.e y contentType, long contentLength, @d5.d okio.o content) {
            kotlin.jvm.internal.l0.p(content, ProtectedSandApp.s("怫"));
            return f(content, contentType, contentLength);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @d5.d
        @p3.n
        public final h0 c(@d5.e y contentType, @d5.d String content) {
            kotlin.jvm.internal.l0.p(content, ProtectedSandApp.s("怬"));
            return a(content, contentType);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @d5.d
        @p3.n
        public final h0 d(@d5.e y contentType, @d5.d okio.p content) {
            kotlin.jvm.internal.l0.p(content, ProtectedSandApp.s("怭"));
            return g(content, contentType);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @d5.d
        @p3.n
        public final h0 e(@d5.e y contentType, @d5.d byte[] content) {
            kotlin.jvm.internal.l0.p(content, ProtectedSandApp.s("怮"));
            return h(content, contentType);
        }

        @p3.i(name = "create")
        @d5.d
        @p3.n
        public final h0 f(@d5.d okio.o oVar, @d5.e y yVar, long j5) {
            kotlin.jvm.internal.l0.p(oVar, ProtectedSandApp.s("怯"));
            return new a(oVar, yVar, j5);
        }

        @p3.i(name = "create")
        @d5.d
        @p3.n
        public final h0 g(@d5.d okio.p pVar, @d5.e y yVar) {
            kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("怰"));
            return f(new okio.m().S0(pVar), yVar, pVar.i0());
        }

        @p3.i(name = "create")
        @d5.d
        @p3.n
        public final h0 h(@d5.d byte[] bArr, @d5.e y yVar) {
            kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("怱"));
            return f(new okio.m().write(bArr), yVar, bArr.length);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    private final Charset e() {
        Charset f6;
        y f30637r = getF30637r();
        return (f30637r == null || (f6 = f30637r.f(Charsets.f27049b)) == null) ? Charsets.f27049b : f6;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [T, java.lang.Object] */
    private final <T> T g(q3.l<? super okio.o, ? extends T> consumer, q3.l<? super T, Integer> sizeMapper) {
        long f30638s = getF30638s();
        if (f30638s > Integer.MAX_VALUE) {
            throw new IOException(p0.a(ProtectedSandApp.s("廝"), f30638s));
        }
        okio.o f30636q = getF30636q();
        try {
            T N = consumer.N(f30636q);
            kotlin.io.b.a(f30636q, null);
            int intValue = sizeMapper.N(N).intValue();
            if (f30638s == -1 || f30638s == intValue) {
                return N;
            }
            throw new IOException(ProtectedSandApp.s("廚") + f30638s + ProtectedSandApp.s("廛") + intValue + ProtectedSandApp.s("廜"));
        } finally {
        }
    }

    @p3.i(name = "create")
    @d5.d
    @p3.n
    public static final h0 l(@d5.d String str, @d5.e y yVar) {
        return INSTANCE.a(str, yVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
    @d5.d
    @p3.n
    public static final h0 m(@d5.e y yVar, long j5, @d5.d okio.o oVar) {
        return INSTANCE.b(yVar, j5, oVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @d5.d
    @p3.n
    public static final h0 n(@d5.e y yVar, @d5.d String str) {
        return INSTANCE.c(yVar, str);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @d5.d
    @p3.n
    public static final h0 o(@d5.e y yVar, @d5.d okio.p pVar) {
        return INSTANCE.d(yVar, pVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @d5.d
    @p3.n
    public static final h0 r(@d5.e y yVar, @d5.d byte[] bArr) {
        return INSTANCE.e(yVar, bArr);
    }

    @p3.i(name = "create")
    @d5.d
    @p3.n
    public static final h0 t(@d5.d okio.o oVar, @d5.e y yVar, long j5) {
        return INSTANCE.f(oVar, yVar, j5);
    }

    @p3.i(name = "create")
    @d5.d
    @p3.n
    public static final h0 w(@d5.d okio.p pVar, @d5.e y yVar) {
        return INSTANCE.g(pVar, yVar);
    }

    @p3.i(name = "create")
    @d5.d
    @p3.n
    public static final h0 z(@d5.d byte[] bArr, @d5.e y yVar) {
        return INSTANCE.h(bArr, yVar);
    }

    @d5.d
    /* renamed from: B */
    public abstract okio.o getF30636q();

    @d5.d
    public final String D() throws IOException {
        okio.o f30636q = getF30636q();
        try {
            String r02 = f30636q.r0(okhttp3.internal.d.P(f30636q, e()));
            kotlin.io.b.a(f30636q, null);
            return r02;
        } finally {
        }
    }

    @d5.d
    public final InputStream a() {
        return getF30636q().p1();
    }

    @d5.d
    public final okio.p b() throws IOException {
        long f30638s = getF30638s();
        if (f30638s > Integer.MAX_VALUE) {
            throw new IOException(p0.a(ProtectedSandApp.s("廡"), f30638s));
        }
        okio.o f30636q = getF30636q();
        try {
            okio.p x02 = f30636q.x0();
            kotlin.io.b.a(f30636q, null);
            int i02 = x02.i0();
            if (f30638s == -1 || f30638s == i02) {
                return x02;
            }
            throw new IOException(ProtectedSandApp.s("廞") + f30638s + ProtectedSandApp.s("廟") + i02 + ProtectedSandApp.s("廠"));
        } finally {
        }
    }

    @d5.d
    public final byte[] c() throws IOException {
        long f30638s = getF30638s();
        if (f30638s > Integer.MAX_VALUE) {
            throw new IOException(p0.a(ProtectedSandApp.s("廥"), f30638s));
        }
        okio.o f30636q = getF30636q();
        try {
            byte[] I = f30636q.I();
            kotlin.io.b.a(f30636q, null);
            int length = I.length;
            if (f30638s == -1 || f30638s == length) {
                return I;
            }
            throw new IOException(ProtectedSandApp.s("廢") + f30638s + ProtectedSandApp.s("廣") + length + ProtectedSandApp.s("廤"));
        } finally {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        okhttp3.internal.d.l(getF30636q());
    }

    @d5.d
    public final Reader d() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        a aVar = new a(getF30636q(), e());
        this.reader = aVar;
        return aVar;
    }

    /* renamed from: j */
    public abstract long getF30638s();

    @d5.e
    /* renamed from: k */
    public abstract y getF30637r();
}
