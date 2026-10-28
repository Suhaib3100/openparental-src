package okhttp3;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.text.Charsets;
import okio.o0;

/* compiled from: RequestBody.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016¨\u0006\u000f"}, d2 = {"Lokhttp3/f0;", "", "Lokhttp3/y;", "b", "", "a", "Lokio/n;", "sink", "Lkotlin/m2;", "r", "", "p", "q", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: RequestBody.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\u00020\u0005*\u00020\b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\t\u0010\nJ3\u0010\u000f\u001a\u00020\u0005*\u00020\u000b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u0005*\u00020\u00112\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u0002H\u0007J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\bH\u0007J.\u0010\u0017\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0007J\u001a\u0010\u0019\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0018\u001a\u00020\u0011H\u0007¨\u0006\u001c"}, d2 = {"Lokhttp3/f0$a;", "", "", "Lokhttp3/y;", "contentType", "Lokhttp3/f0;", "b", "(Ljava/lang/String;Lokhttp3/y;)Lokhttp3/f0;", "Lokio/p;", "i", "(Lokio/p;Lokhttp3/y;)Lokhttp3/f0;", "", "", "offset", "byteCount", "m", "([BLokhttp3/y;II)Lokhttp3/f0;", "Ljava/io/File;", "a", "(Ljava/io/File;Lokhttp3/y;)Lokhttp3/f0;", "content", "d", "e", "h", "file", "c", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.f0$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: RequestBody.kt */
        @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"okhttp3/f0$a$a", "Lokhttp3/f0;", "Lokhttp3/y;", "b", "", "a", "Lokio/n;", "sink", "Lkotlin/m2;", "r", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: okhttp3.f0$a$a, reason: collision with other inner class name */
        public static final class C0470a extends f0 {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ File f30584b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ y f30585c;

            C0470a(File file, y yVar) {
                this.f30584b = file;
                this.f30585c = yVar;
            }

            @Override // okhttp3.f0
            public long a() {
                return this.f30584b.length();
            }

            @Override // okhttp3.f0
            @d5.e
            /* renamed from: b, reason: from getter */
            public y getF30589c() {
                return this.f30585c;
            }

            @Override // okhttp3.f0
            public void r(@d5.d okio.n nVar) {
                kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("徿"));
                o0 l5 = okio.a0.l(this.f30584b);
                try {
                    nVar.v0(l5);
                    kotlin.io.b.a(l5, null);
                } finally {
                }
            }
        }

        /* compiled from: RequestBody.kt */
        @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"okhttp3/f0$a$b", "Lokhttp3/f0;", "Lokhttp3/y;", "b", "", "a", "Lokio/n;", "sink", "Lkotlin/m2;", "r", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: okhttp3.f0$a$b */
        public static final class b extends f0 {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ okio.p f30586b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ y f30587c;

            b(okio.p pVar, y yVar) {
                this.f30586b = pVar;
                this.f30587c = yVar;
            }

            @Override // okhttp3.f0
            public long a() {
                return this.f30586b.i0();
            }

            @Override // okhttp3.f0
            @d5.e
            /* renamed from: b, reason: from getter */
            public y getF30589c() {
                return this.f30587c;
            }

            @Override // okhttp3.f0
            public void r(@d5.d okio.n nVar) {
                kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("忀"));
                nVar.S0(this.f30586b);
            }
        }

        /* compiled from: RequestBody.kt */
        @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"okhttp3/f0$a$c", "Lokhttp3/f0;", "Lokhttp3/y;", "b", "", "a", "Lokio/n;", "sink", "Lkotlin/m2;", "r", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: okhttp3.f0$a$c */
        public static final class c extends f0 {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ byte[] f30588b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ y f30589c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f30590d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f30591e;

            c(byte[] bArr, y yVar, int i5, int i6) {
                this.f30588b = bArr;
                this.f30589c = yVar;
                this.f30590d = i5;
                this.f30591e = i6;
            }

            @Override // okhttp3.f0
            public long a() {
                return this.f30590d;
            }

            @Override // okhttp3.f0
            @d5.e
            /* renamed from: b, reason: from getter */
            public y getF30589c() {
                return this.f30589c;
            }

            @Override // okhttp3.f0
            public void r(@d5.d okio.n nVar) {
                kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("忁"));
                nVar.write(this.f30588b, this.f30591e, this.f30590d);
            }
        }

        private Companion() {
        }

        public static /* synthetic */ f0 n(Companion companion, File file, y yVar, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                yVar = null;
            }
            return companion.a(file, yVar);
        }

        public static /* synthetic */ f0 o(Companion companion, String str, y yVar, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                yVar = null;
            }
            return companion.b(str, yVar);
        }

        public static /* synthetic */ f0 p(Companion companion, y yVar, byte[] bArr, int i5, int i6, int i7, Object obj) {
            if ((i7 & 4) != 0) {
                i5 = 0;
            }
            if ((i7 & 8) != 0) {
                i6 = bArr.length;
            }
            return companion.h(yVar, bArr, i5, i6);
        }

        public static /* synthetic */ f0 q(Companion companion, okio.p pVar, y yVar, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                yVar = null;
            }
            return companion.i(pVar, yVar);
        }

        public static /* synthetic */ f0 r(Companion companion, byte[] bArr, y yVar, int i5, int i6, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                yVar = null;
            }
            if ((i7 & 2) != 0) {
                i5 = 0;
            }
            if ((i7 & 4) != 0) {
                i6 = bArr.length;
            }
            return companion.m(bArr, yVar, i5, i6);
        }

        @p3.i(name = "create")
        @d5.d
        @p3.n
        public final f0 a(@d5.d File file, @d5.e y yVar) {
            kotlin.jvm.internal.l0.p(file, ProtectedSandApp.s("忂"));
            return new C0470a(file, yVar);
        }

        @p3.i(name = "create")
        @d5.d
        @p3.n
        public final f0 b(@d5.d String str, @d5.e y yVar) {
            kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("心"));
            Charset charset = Charsets.f27049b;
            if (yVar != null) {
                Charset g5 = y.g(yVar, null, 1, null);
                if (g5 == null) {
                    yVar = y.INSTANCE.d(yVar + ProtectedSandApp.s("忄"));
                } else {
                    charset = g5;
                }
            }
            byte[] bytes = str.getBytes(charset);
            kotlin.jvm.internal.l0.o(bytes, ProtectedSandApp.s("必"));
            return m(bytes, yVar, 0, bytes.length);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @ReplaceWith(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
        @d5.d
        @p3.n
        public final f0 c(@d5.e y contentType, @d5.d File file) {
            kotlin.jvm.internal.l0.p(file, ProtectedSandApp.s("忆"));
            return a(file, contentType);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @d5.d
        @p3.n
        public final f0 d(@d5.e y contentType, @d5.d String content) {
            kotlin.jvm.internal.l0.p(content, ProtectedSandApp.s("忇"));
            return b(content, contentType);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @d5.d
        @p3.n
        public final f0 e(@d5.e y contentType, @d5.d okio.p content) {
            kotlin.jvm.internal.l0.p(content, ProtectedSandApp.s("忈"));
            return i(content, contentType);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @d5.d
        @p3.j
        @p3.n
        public final f0 f(@d5.e y yVar, @d5.d byte[] bArr) {
            return p(this, yVar, bArr, 0, 0, 12, null);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @d5.d
        @p3.j
        @p3.n
        public final f0 g(@d5.e y yVar, @d5.d byte[] bArr, int i5) {
            return p(this, yVar, bArr, i5, 0, 8, null);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @d5.d
        @p3.j
        @p3.n
        public final f0 h(@d5.e y contentType, @d5.d byte[] content, int offset, int byteCount) {
            kotlin.jvm.internal.l0.p(content, ProtectedSandApp.s("忉"));
            return m(content, contentType, offset, byteCount);
        }

        @p3.i(name = "create")
        @d5.d
        @p3.n
        public final f0 i(@d5.d okio.p pVar, @d5.e y yVar) {
            kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("忊"));
            return new b(pVar, yVar);
        }

        @p3.i(name = "create")
        @d5.d
        @p3.j
        @p3.n
        public final f0 j(@d5.d byte[] bArr) {
            return r(this, bArr, null, 0, 0, 7, null);
        }

        @p3.i(name = "create")
        @d5.d
        @p3.j
        @p3.n
        public final f0 k(@d5.d byte[] bArr, @d5.e y yVar) {
            return r(this, bArr, yVar, 0, 0, 6, null);
        }

        @p3.i(name = "create")
        @d5.d
        @p3.j
        @p3.n
        public final f0 l(@d5.d byte[] bArr, @d5.e y yVar, int i5) {
            return r(this, bArr, yVar, i5, 0, 4, null);
        }

        @p3.i(name = "create")
        @d5.d
        @p3.j
        @p3.n
        public final f0 m(@d5.d byte[] bArr, @d5.e y yVar, int i5, int i6) {
            kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("忋"));
            okhttp3.internal.d.k(bArr.length, i5, i6);
            return new c(bArr, yVar, i6, i5);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    @p3.i(name = "create")
    @d5.d
    @p3.n
    public static final f0 c(@d5.d File file, @d5.e y yVar) {
        return INSTANCE.a(file, yVar);
    }

    @p3.i(name = "create")
    @d5.d
    @p3.n
    public static final f0 d(@d5.d String str, @d5.e y yVar) {
        return INSTANCE.b(str, yVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @ReplaceWith(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
    @d5.d
    @p3.n
    public static final f0 e(@d5.e y yVar, @d5.d File file) {
        return INSTANCE.c(yVar, file);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @d5.d
    @p3.n
    public static final f0 f(@d5.e y yVar, @d5.d String str) {
        return INSTANCE.d(yVar, str);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @d5.d
    @p3.n
    public static final f0 g(@d5.e y yVar, @d5.d okio.p pVar) {
        return INSTANCE.e(yVar, pVar);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @d5.d
    @p3.j
    @p3.n
    public static final f0 h(@d5.e y yVar, @d5.d byte[] bArr) {
        return Companion.p(INSTANCE, yVar, bArr, 0, 0, 12, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @d5.d
    @p3.j
    @p3.n
    public static final f0 i(@d5.e y yVar, @d5.d byte[] bArr, int i5) {
        return Companion.p(INSTANCE, yVar, bArr, i5, 0, 8, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @d5.d
    @p3.j
    @p3.n
    public static final f0 j(@d5.e y yVar, @d5.d byte[] bArr, int i5, int i6) {
        return INSTANCE.h(yVar, bArr, i5, i6);
    }

    @p3.i(name = "create")
    @d5.d
    @p3.n
    public static final f0 k(@d5.d okio.p pVar, @d5.e y yVar) {
        return INSTANCE.i(pVar, yVar);
    }

    @p3.i(name = "create")
    @d5.d
    @p3.j
    @p3.n
    public static final f0 l(@d5.d byte[] bArr) {
        return Companion.r(INSTANCE, bArr, null, 0, 0, 7, null);
    }

    @p3.i(name = "create")
    @d5.d
    @p3.j
    @p3.n
    public static final f0 m(@d5.d byte[] bArr, @d5.e y yVar) {
        return Companion.r(INSTANCE, bArr, yVar, 0, 0, 6, null);
    }

    @p3.i(name = "create")
    @d5.d
    @p3.j
    @p3.n
    public static final f0 n(@d5.d byte[] bArr, @d5.e y yVar, int i5) {
        return Companion.r(INSTANCE, bArr, yVar, i5, 0, 4, null);
    }

    @p3.i(name = "create")
    @d5.d
    @p3.j
    @p3.n
    public static final f0 o(@d5.d byte[] bArr, @d5.e y yVar, int i5, int i6) {
        return INSTANCE.m(bArr, yVar, i5, i6);
    }

    public long a() throws IOException {
        return -1L;
    }

    @d5.e
    /* renamed from: b */
    public abstract y getF30589c();

    public boolean p() {
        return false;
    }

    public boolean q() {
        return false;
    }

    public abstract void r(@d5.d okio.n nVar) throws IOException;
}
