package okhttp3;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.x0;
import okio.o0;

/* compiled from: RequestBody.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0015"}, d2 = {"Lokhttp3/e0;", "", "<init>", "()V", "Lokhttp3/x;", "contentType", "()Lokhttp3/x;", "", "contentLength", "()J", "Lokio/n;", "sink", "Lkotlin/k2;", "writeTo", "(Lokio/n;)V", "", "isDuplex", "()Z", "isOneShot", "Companion", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public abstract class e0 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: RequestBody.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u0007*\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u0007*\u00020\n2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0011\u001a\u00020\u0007*\u00020\r2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u0007*\u00020\u00132\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ5\u0010\u001b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001d\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lokhttp3/e0$a;", "", "<init>", "()V", "", "Lokhttp3/x;", "contentType", "Lokhttp3/e0;", "b", "(Ljava/lang/String;Lokhttp3/x;)Lokhttp3/e0;", "Lokio/p;", "i", "(Lokio/p;Lokhttp3/x;)Lokhttp3/e0;", "", "", "offset", "byteCount", "m", "([BLokhttp3/x;II)Lokhttp3/e0;", "Ljava/io/File;", "a", "(Ljava/io/File;Lokhttp3/x;)Lokhttp3/e0;", "content", "d", "(Lokhttp3/x;Ljava/lang/String;)Lokhttp3/e0;", "e", "(Lokhttp3/x;Lokio/p;)Lokhttp3/e0;", "h", "(Lokhttp3/x;[BII)Lokhttp3/e0;", "file", "c", "(Lokhttp3/x;Ljava/io/File;)Lokhttp3/e0;", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.e0$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: RequestBody.kt */
        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"okhttp3/e0$a$a", "Lokhttp3/e0;", "Lokhttp3/x;", "contentType", "()Lokhttp3/x;", "", "contentLength", "()J", "Lokio/n;", "sink", "Lkotlin/k2;", "writeTo", "(Lokio/n;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: okhttp3.e0$a$a, reason: collision with other inner class name */
        public static final class C1309a extends e0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ File f84090a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f84091b;

            C1309a(File file, x xVar) {
                this.f84090a = file;
                this.f84091b = xVar;
            }

            @Override // okhttp3.e0
            public long contentLength() {
                return this.f84090a.length();
            }

            @Override // okhttp3.e0
            @fg.m
            /* renamed from: contentType, reason: from getter */
            public x getF84095b() {
                return this.f84091b;
            }

            @Override // okhttp3.e0
            public void writeTo(@fg.l okio.n sink) {
                l0.p(sink, ProtectedSandApp.s("黥\u0001"));
                o0 l4 = okio.a0.l(this.f84090a);
                try {
                    sink.b1(l4);
                    kotlin.io.b.a(l4, null);
                } finally {
                }
            }
        }

        /* compiled from: RequestBody.kt */
        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"okhttp3/e0$a$b", "Lokhttp3/e0;", "Lokhttp3/x;", "contentType", "()Lokhttp3/x;", "", "contentLength", "()J", "Lokio/n;", "sink", "Lkotlin/k2;", "writeTo", "(Lokio/n;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: okhttp3.e0$a$b */
        public static final class b extends e0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ okio.p f84092a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f84093b;

            b(okio.p pVar, x xVar) {
                this.f84092a = pVar;
                this.f84093b = xVar;
            }

            @Override // okhttp3.e0
            public long contentLength() {
                return this.f84092a.q();
            }

            @Override // okhttp3.e0
            @fg.m
            /* renamed from: contentType, reason: from getter */
            public x getF84095b() {
                return this.f84093b;
            }

            @Override // okhttp3.e0
            public void writeTo(@fg.l okio.n sink) {
                l0.p(sink, ProtectedSandApp.s("黦\u0001"));
                sink.t3(this.f84092a);
            }
        }

        /* compiled from: RequestBody.kt */
        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"okhttp3/e0$a$c", "Lokhttp3/e0;", "Lokhttp3/x;", "contentType", "()Lokhttp3/x;", "", "contentLength", "()J", "Lokio/n;", "sink", "Lkotlin/k2;", "writeTo", "(Lokio/n;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: okhttp3.e0$a$c */
        public static final class c extends e0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ byte[] f84094a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f84095b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f84096c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f84097d;

            c(byte[] bArr, x xVar, int i4, int i5) {
                this.f84094a = bArr;
                this.f84095b = xVar;
                this.f84096c = i4;
                this.f84097d = i5;
            }

            @Override // okhttp3.e0
            public long contentLength() {
                return this.f84096c;
            }

            @Override // okhttp3.e0
            @fg.m
            /* renamed from: contentType, reason: from getter */
            public x getF84095b() {
                return this.f84095b;
            }

            @Override // okhttp3.e0
            public void writeTo(@fg.l okio.n sink) {
                l0.p(sink, ProtectedSandApp.s("黧\u0001"));
                sink.write(this.f84094a, this.f84097d, this.f84096c);
            }
        }

        private Companion() {
        }

        public static /* synthetic */ e0 n(Companion companion, File file, x xVar, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                xVar = null;
            }
            return companion.a(file, xVar);
        }

        public static /* synthetic */ e0 o(Companion companion, String str, x xVar, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                xVar = null;
            }
            return companion.b(str, xVar);
        }

        public static /* synthetic */ e0 p(Companion companion, x xVar, byte[] bArr, int i4, int i5, int i6, Object obj) {
            if ((i6 & 4) != 0) {
                i4 = 0;
            }
            if ((i6 & 8) != 0) {
                i5 = bArr.length;
            }
            return companion.h(xVar, bArr, i4, i5);
        }

        public static /* synthetic */ e0 q(Companion companion, okio.p pVar, x xVar, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                xVar = null;
            }
            return companion.i(pVar, xVar);
        }

        public static /* synthetic */ e0 r(Companion companion, byte[] bArr, x xVar, int i4, int i5, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                xVar = null;
            }
            if ((i6 & 2) != 0) {
                i4 = 0;
            }
            if ((i6 & 4) != 0) {
                i5 = bArr.length;
            }
            return companion.m(bArr, xVar, i4, i5);
        }

        @fg.l
        @kd.n
        @kd.i(name = "create")
        public final e0 a(@fg.l File file, @fg.m x xVar) {
            l0.p(file, ProtectedSandApp.s("黨\u0001"));
            return new C1309a(file, xVar);
        }

        @fg.l
        @kd.n
        @kd.i(name = "create")
        public final e0 b(@fg.l String str, @fg.m x xVar) {
            l0.p(str, ProtectedSandApp.s("黩\u0001"));
            Charset charset = kotlin.text.f.UTF_8;
            if (xVar != null) {
                Charset g4 = x.g(xVar, null, 1, null);
                if (g4 == null) {
                    xVar = x.INSTANCE.d(xVar + ProtectedSandApp.s("黪\u0001"));
                } else {
                    charset = g4;
                }
            }
            byte[] bytes = str.getBytes(charset);
            l0.o(bytes, ProtectedSandApp.s("黫\u0001"));
            return m(bytes, xVar, 0, bytes.length);
        }

        @fg.l
        @kd.n
        @kotlin.k(level = kotlin.m.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @x0(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
        public final e0 c(@fg.m x contentType, @fg.l File file) {
            l0.p(file, ProtectedSandApp.s("黬\u0001"));
            return a(file, contentType);
        }

        @fg.l
        @kd.n
        @kotlin.k(level = kotlin.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @x0(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        public final e0 d(@fg.m x contentType, @fg.l String content) {
            l0.p(content, ProtectedSandApp.s("黭\u0001"));
            return b(content, contentType);
        }

        @fg.l
        @kd.n
        @kotlin.k(level = kotlin.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @x0(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        public final e0 e(@fg.m x contentType, @fg.l okio.p content) {
            l0.p(content, ProtectedSandApp.s("黭\u0001"));
            return i(content, contentType);
        }

        @kd.j
        @kotlin.k(level = kotlin.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @x0(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @fg.l
        @kd.n
        public final e0 f(@fg.m x xVar, @fg.l byte[] bArr) {
            return p(this, xVar, bArr, 0, 0, 12, null);
        }

        @kd.j
        @kotlin.k(level = kotlin.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @x0(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @fg.l
        @kd.n
        public final e0 g(@fg.m x xVar, @fg.l byte[] bArr, int i4) {
            return p(this, xVar, bArr, i4, 0, 8, null);
        }

        @kd.j
        @kotlin.k(level = kotlin.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @x0(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @fg.l
        @kd.n
        public final e0 h(@fg.m x contentType, @fg.l byte[] content, int offset, int byteCount) {
            l0.p(content, ProtectedSandApp.s("黭\u0001"));
            return m(content, contentType, offset, byteCount);
        }

        @fg.l
        @kd.n
        @kd.i(name = "create")
        public final e0 i(@fg.l okio.p pVar, @fg.m x xVar) {
            l0.p(pVar, ProtectedSandApp.s("黩\u0001"));
            return new b(pVar, xVar);
        }

        @kd.j
        @fg.l
        @kd.n
        @kd.i(name = "create")
        public final e0 j(@fg.l byte[] bArr) {
            return r(this, bArr, null, 0, 0, 7, null);
        }

        @kd.j
        @fg.l
        @kd.n
        @kd.i(name = "create")
        public final e0 k(@fg.l byte[] bArr, @fg.m x xVar) {
            return r(this, bArr, xVar, 0, 0, 6, null);
        }

        @kd.j
        @fg.l
        @kd.n
        @kd.i(name = "create")
        public final e0 l(@fg.l byte[] bArr, @fg.m x xVar, int i4) {
            return r(this, bArr, xVar, i4, 0, 4, null);
        }

        @kd.j
        @fg.l
        @kd.n
        @kd.i(name = "create")
        public final e0 m(@fg.l byte[] bArr, @fg.m x xVar, int i4, int i5) {
            l0.p(bArr, ProtectedSandApp.s("黩\u0001"));
            okhttp3.internal.d.k(bArr.length, i4, i5);
            return new c(bArr, xVar, i5, i4);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    @fg.l
    @kd.n
    @kd.i(name = "create")
    public static final e0 create(@fg.l File file, @fg.m x xVar) {
        return INSTANCE.a(file, xVar);
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    @fg.m
    /* renamed from: contentType */
    public abstract x getF84095b();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(@fg.l okio.n sink) throws IOException;

    @fg.l
    @kd.n
    @kd.i(name = "create")
    public static final e0 create(@fg.l String str, @fg.m x xVar) {
        return INSTANCE.b(str, xVar);
    }

    @fg.l
    @kd.n
    @kotlin.k(level = kotlin.m.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @x0(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
    public static final e0 create(@fg.m x xVar, @fg.l File file) {
        return INSTANCE.c(xVar, file);
    }

    @fg.l
    @kd.n
    @kotlin.k(level = kotlin.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @x0(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    public static final e0 create(@fg.m x xVar, @fg.l String str) {
        return INSTANCE.d(xVar, str);
    }

    @fg.l
    @kd.n
    @kotlin.k(level = kotlin.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @x0(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    public static final e0 create(@fg.m x xVar, @fg.l okio.p pVar) {
        return INSTANCE.e(xVar, pVar);
    }

    @kd.j
    @kotlin.k(level = kotlin.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @x0(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @fg.l
    @kd.n
    public static final e0 create(@fg.m x xVar, @fg.l byte[] bArr) {
        return Companion.p(INSTANCE, xVar, bArr, 0, 0, 12, null);
    }

    @kd.j
    @kotlin.k(level = kotlin.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @x0(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @fg.l
    @kd.n
    public static final e0 create(@fg.m x xVar, @fg.l byte[] bArr, int i4) {
        return Companion.p(INSTANCE, xVar, bArr, i4, 0, 8, null);
    }

    @kd.j
    @kotlin.k(level = kotlin.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @x0(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @fg.l
    @kd.n
    public static final e0 create(@fg.m x xVar, @fg.l byte[] bArr, int i4, int i5) {
        return INSTANCE.h(xVar, bArr, i4, i5);
    }

    @fg.l
    @kd.n
    @kd.i(name = "create")
    public static final e0 create(@fg.l okio.p pVar, @fg.m x xVar) {
        return INSTANCE.i(pVar, xVar);
    }

    @kd.j
    @fg.l
    @kd.n
    @kd.i(name = "create")
    public static final e0 create(@fg.l byte[] bArr) {
        return Companion.r(INSTANCE, bArr, null, 0, 0, 7, null);
    }

    @kd.j
    @fg.l
    @kd.n
    @kd.i(name = "create")
    public static final e0 create(@fg.l byte[] bArr, @fg.m x xVar) {
        return Companion.r(INSTANCE, bArr, xVar, 0, 0, 6, null);
    }

    @kd.j
    @fg.l
    @kd.n
    @kd.i(name = "create")
    public static final e0 create(@fg.l byte[] bArr, @fg.m x xVar, int i4) {
        return Companion.r(INSTANCE, bArr, xVar, i4, 0, 4, null);
    }

    @kd.j
    @fg.l
    @kd.n
    @kd.i(name = "create")
    public static final e0 create(@fg.l byte[] bArr, @fg.m x xVar, int i4, int i5) {
        return INSTANCE.m(bArr, xVar, i4, i5);
    }
}
