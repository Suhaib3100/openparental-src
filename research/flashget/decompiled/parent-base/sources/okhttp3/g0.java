package okhttp3;

import androidx.collection.p0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.x0;

/* compiled from: ResponseBody.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u001c2\u00020\u0001:\u0002\u0017\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003JB\u0010\u000b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u0006H\u0082\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H&¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010\u0003R\u0018\u0010*\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010)¨\u0006+"}, d2 = {"Lokhttp3/g0;", "Ljava/io/Closeable;", "<init>", "()V", "", "T", "Lkotlin/Function1;", "Lokio/o;", "consumer", "", "sizeMapper", "f", "(Lld/l;Lld/l;)Ljava/lang/Object;", "Ljava/nio/charset/Charset;", "e", "()Ljava/nio/charset/Charset;", "Lokhttp3/x;", "h", "()Lokhttp3/x;", "", "g", "()J", "Ljava/io/InputStream;", "a", "()Ljava/io/InputStream;", "t", "()Lokio/o;", "", "c", "()[B", "Lokio/p;", "b", "()Lokio/p;", "Ljava/io/Reader;", "d", "()Ljava/io/Reader;", "", "u", "()Ljava/lang/String;", "Lkotlin/k2;", "close", "Ljava/io/Reader;", "reader", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public abstract class g0 implements Closeable {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Reader reader;

    /* compiled from: ResponseBody.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lokhttp3/g0$a;", "Ljava/io/Reader;", "Lokio/o;", "source", "Ljava/nio/charset/Charset;", "charset", "<init>", "(Lokio/o;Ljava/nio/charset/Charset;)V", "", "cbuf", "", "off", "len", "read", "([CII)I", "Lkotlin/k2;", "close", "()V", "", "b", "Z", "closed", "c", "Ljava/io/Reader;", "delegate", "d", "Lokio/o;", "e", "Ljava/nio/charset/Charset;", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class a extends Reader {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private Reader delegate;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final okio.o source;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final Charset charset;

        public a(@fg.l okio.o oVar, @fg.l Charset charset) {
            l0.p(oVar, ProtectedSandApp.s("鼩\u0001"));
            l0.p(charset, ProtectedSandApp.s("鼪\u0001"));
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
        public int read(@fg.l char[] cbuf, int off, int len) throws IOException {
            l0.p(cbuf, ProtectedSandApp.s("鼫\u0001"));
            if (this.closed) {
                throw new IOException(ProtectedSandApp.s("鼬\u0001"));
            }
            Reader reader = this.delegate;
            if (reader == null) {
                reader = new InputStreamReader(this.source.J3(), okhttp3.internal.d.P(this.source, this.charset));
                this.delegate = reader;
            }
            return reader.read(cbuf, off, len);
        }
    }

    /* compiled from: ResponseBody.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u0007*\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u0007*\u00020\n2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u0007*\u00020\r2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\u00020\u0007*\u00020\u00102\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001c\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lokhttp3/g0$b;", "", "<init>", "()V", "", "Lokhttp3/x;", "contentType", "Lokhttp3/g0;", "a", "(Ljava/lang/String;Lokhttp3/x;)Lokhttp3/g0;", "", "h", "([BLokhttp3/x;)Lokhttp3/g0;", "Lokio/p;", "g", "(Lokio/p;Lokhttp3/x;)Lokhttp3/g0;", "Lokio/o;", "", "contentLength", "f", "(Lokio/o;Lokhttp3/x;J)Lokhttp3/g0;", "content", "c", "(Lokhttp3/x;Ljava/lang/String;)Lokhttp3/g0;", "e", "(Lokhttp3/x;[B)Lokhttp3/g0;", "d", "(Lokhttp3/x;Lokio/p;)Lokhttp3/g0;", "b", "(Lokhttp3/x;JLokio/o;)Lokhttp3/g0;", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.g0$b, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: ResponseBody.kt */
        @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"okhttp3/g0$b$a", "Lokhttp3/g0;", "Lokhttp3/x;", "h", "()Lokhttp3/x;", "", "g", "()J", "Lokio/o;", "t", "()Lokio/o;", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: okhttp3.g0$b$a */
        public static final class a extends g0 {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ okio.o f84142d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ x f84143e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ long f84144f;

            a(okio.o oVar, x xVar, long j4) {
                this.f84142d = oVar;
                this.f84143e = xVar;
                this.f84144f = j4;
            }

            @Override // okhttp3.g0
            /* renamed from: g, reason: from getter */
            public long getF84144f() {
                return this.f84144f;
            }

            @Override // okhttp3.g0
            @fg.m
            /* renamed from: h, reason: from getter */
            public x getF84143e() {
                return this.f84143e;
            }

            @Override // okhttp3.g0
            @fg.l
            /* renamed from: t, reason: from getter */
            public okio.o getBodySource() {
                return this.f84142d;
            }
        }

        private Companion() {
        }

        public static /* synthetic */ g0 i(Companion companion, String str, x xVar, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                xVar = null;
            }
            return companion.a(str, xVar);
        }

        public static /* synthetic */ g0 j(Companion companion, okio.o oVar, x xVar, long j4, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                xVar = null;
            }
            if ((i4 & 2) != 0) {
                j4 = -1;
            }
            return companion.f(oVar, xVar, j4);
        }

        public static /* synthetic */ g0 k(Companion companion, okio.p pVar, x xVar, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                xVar = null;
            }
            return companion.g(pVar, xVar);
        }

        public static /* synthetic */ g0 l(Companion companion, byte[] bArr, x xVar, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                xVar = null;
            }
            return companion.h(bArr, xVar);
        }

        @fg.l
        @kd.n
        @kd.i(name = "create")
        public final g0 a(@fg.l String str, @fg.m x xVar) {
            l0.p(str, ProtectedSandApp.s("鼭\u0001"));
            Charset charset = kotlin.text.f.UTF_8;
            if (xVar != null) {
                Charset g4 = x.g(xVar, null, 1, null);
                if (g4 == null) {
                    xVar = x.INSTANCE.d(xVar + ProtectedSandApp.s("鼮\u0001"));
                } else {
                    charset = g4;
                }
            }
            okio.m c32 = new okio.m().c3(str, charset);
            return f(c32, xVar, c32.size());
        }

        @fg.l
        @kd.n
        @kotlin.k(level = kotlin.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @x0(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
        public final g0 b(@fg.m x contentType, long contentLength, @fg.l okio.o content) {
            l0.p(content, ProtectedSandApp.s("鼯\u0001"));
            return f(content, contentType, contentLength);
        }

        @fg.l
        @kd.n
        @kotlin.k(level = kotlin.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @x0(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        public final g0 c(@fg.m x contentType, @fg.l String content) {
            l0.p(content, ProtectedSandApp.s("鼯\u0001"));
            return a(content, contentType);
        }

        @fg.l
        @kd.n
        @kotlin.k(level = kotlin.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @x0(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        public final g0 d(@fg.m x contentType, @fg.l okio.p content) {
            l0.p(content, ProtectedSandApp.s("鼯\u0001"));
            return g(content, contentType);
        }

        @fg.l
        @kd.n
        @kotlin.k(level = kotlin.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @x0(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        public final g0 e(@fg.m x contentType, @fg.l byte[] content) {
            l0.p(content, ProtectedSandApp.s("鼯\u0001"));
            return h(content, contentType);
        }

        @fg.l
        @kd.n
        @kd.i(name = "create")
        public final g0 f(@fg.l okio.o oVar, @fg.m x xVar, long j4) {
            l0.p(oVar, ProtectedSandApp.s("鼰\u0001"));
            return new a(oVar, xVar, j4);
        }

        @fg.l
        @kd.n
        @kd.i(name = "create")
        public final g0 g(@fg.l okio.p pVar, @fg.m x xVar) {
            l0.p(pVar, ProtectedSandApp.s("鼭\u0001"));
            return f(new okio.m().t3(pVar), xVar, pVar.q());
        }

        @fg.l
        @kd.n
        @kd.i(name = "create")
        public final g0 h(@fg.l byte[] bArr, @fg.m x xVar) {
            l0.p(bArr, ProtectedSandApp.s("鼭\u0001"));
            return f(new okio.m().write(bArr), xVar, bArr.length);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    private final Charset e() {
        Charset f4;
        x f84143e = getF84143e();
        return (f84143e == null || (f4 = f84143e.f(kotlin.text.f.UTF_8)) == null) ? kotlin.text.f.UTF_8 : f4;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [T, java.lang.Object] */
    private final <T> T f(ld.l<? super okio.o, ? extends T> consumer, ld.l<? super T, Integer> sizeMapper) {
        long f84144f = getF84144f();
        if (f84144f > Integer.MAX_VALUE) {
            throw new IOException(p0.a(ProtectedSandApp.s("鹣\u0001"), f84144f));
        }
        okio.o bodySource = getBodySource();
        try {
            T invoke = consumer.invoke(bodySource);
            kotlin.io.b.a(bodySource, null);
            int intValue = sizeMapper.invoke(invoke).intValue();
            if (f84144f == -1 || f84144f == intValue) {
                return invoke;
            }
            throw new IOException(ProtectedSandApp.s("鹠\u0001") + f84144f + ProtectedSandApp.s("鹡\u0001") + intValue + ProtectedSandApp.s("鹢\u0001"));
        } finally {
        }
    }

    @fg.l
    @kd.n
    @kd.i(name = "create")
    public static final g0 i(@fg.l String str, @fg.m x xVar) {
        return INSTANCE.a(str, xVar);
    }

    @fg.l
    @kd.n
    @kotlin.k(level = kotlin.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @x0(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
    public static final g0 k(@fg.m x xVar, long j4, @fg.l okio.o oVar) {
        return INSTANCE.b(xVar, j4, oVar);
    }

    @fg.l
    @kd.n
    @kotlin.k(level = kotlin.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @x0(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    public static final g0 l(@fg.m x xVar, @fg.l String str) {
        return INSTANCE.c(xVar, str);
    }

    @fg.l
    @kd.n
    @kotlin.k(level = kotlin.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @x0(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    public static final g0 m(@fg.m x xVar, @fg.l okio.p pVar) {
        return INSTANCE.d(xVar, pVar);
    }

    @fg.l
    @kd.n
    @kotlin.k(level = kotlin.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @x0(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    public static final g0 n(@fg.m x xVar, @fg.l byte[] bArr) {
        return INSTANCE.e(xVar, bArr);
    }

    @fg.l
    @kd.n
    @kd.i(name = "create")
    public static final g0 o(@fg.l okio.o oVar, @fg.m x xVar, long j4) {
        return INSTANCE.f(oVar, xVar, j4);
    }

    @fg.l
    @kd.n
    @kd.i(name = "create")
    public static final g0 q(@fg.l okio.p pVar, @fg.m x xVar) {
        return INSTANCE.g(pVar, xVar);
    }

    @fg.l
    @kd.n
    @kd.i(name = "create")
    public static final g0 s(@fg.l byte[] bArr, @fg.m x xVar) {
        return INSTANCE.h(bArr, xVar);
    }

    @fg.l
    public final InputStream a() {
        return getBodySource().J3();
    }

    @fg.l
    public final okio.p b() throws IOException {
        long f84144f = getF84144f();
        if (f84144f > Integer.MAX_VALUE) {
            throw new IOException(p0.a(ProtectedSandApp.s("鹣\u0001"), f84144f));
        }
        okio.o bodySource = getBodySource();
        try {
            okio.p b32 = bodySource.b3();
            kotlin.io.b.a(bodySource, null);
            int q4 = b32.q();
            if (f84144f == -1 || f84144f == q4) {
                return b32;
            }
            throw new IOException(ProtectedSandApp.s("鹠\u0001") + f84144f + ProtectedSandApp.s("鹡\u0001") + q4 + ProtectedSandApp.s("鹢\u0001"));
        } finally {
        }
    }

    @fg.l
    public final byte[] c() throws IOException {
        long f84144f = getF84144f();
        if (f84144f > Integer.MAX_VALUE) {
            throw new IOException(p0.a(ProtectedSandApp.s("鹣\u0001"), f84144f));
        }
        okio.o bodySource = getBodySource();
        try {
            byte[] p22 = bodySource.p2();
            kotlin.io.b.a(bodySource, null);
            int length = p22.length;
            if (f84144f == -1 || f84144f == length) {
                return p22;
            }
            throw new IOException(ProtectedSandApp.s("鹠\u0001") + f84144f + ProtectedSandApp.s("鹡\u0001") + length + ProtectedSandApp.s("鹢\u0001"));
        } finally {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        okhttp3.internal.d.l(getBodySource());
    }

    @fg.l
    public final Reader d() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        a aVar = new a(getBodySource(), e());
        this.reader = aVar;
        return aVar;
    }

    /* renamed from: g */
    public abstract long getF84144f();

    @fg.m
    /* renamed from: h */
    public abstract x getF84143e();

    @fg.l
    /* renamed from: t */
    public abstract okio.o getBodySource();

    @fg.l
    public final String u() throws IOException {
        okio.o bodySource = getBodySource();
        try {
            String X2 = bodySource.X2(okhttp3.internal.d.P(bodySource, e()));
            kotlin.io.b.a(bodySource, null);
            return X2;
        } finally {
        }
    }
}
