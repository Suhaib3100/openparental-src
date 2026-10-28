package okhttp3;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.x0;
import okhttp3.v;

/* compiled from: FormBody.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u0001:\u0002\u0010\u0013B%\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0014J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010 R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010 R\u0011\u0010\"\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b!\u0010\u0011¨\u0006#"}, d2 = {"Lokhttp3/s;", "Lokhttp3/e0;", "", "", "encodedNames", "encodedValues", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "Lokio/n;", "sink", "", "countBytes", "", "g", "(Lokio/n;Z)J", "", "a", "()I", "index", "b", "(I)Ljava/lang/String;", "d", "c", "f", "Lokhttp3/x;", "contentType", "()Lokhttp3/x;", "contentLength", "()J", "Lkotlin/k2;", "writeTo", "(Lokio/n;)V", "Ljava/util/List;", "e", "size", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class s extends e0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<String> encodedNames;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<String> encodedValues;

    /* renamed from: c, reason: collision with root package name */
    private static final x f85059c = x.INSTANCE.c(ProtectedSandApp.s("ꈇ\u0001"));

    /* compiled from: FormBody.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013¨\u0006\u0014"}, d2 = {"Lokhttp3/s$a;", "", "Ljava/nio/charset/Charset;", "charset", "<init>", "(Ljava/nio/charset/Charset;)V", "", "name", "value", "a", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/s$a;", "b", "Lokhttp3/s;", "c", "()Lokhttp3/s;", "", "Ljava/util/List;", "names", "values", "Ljava/nio/charset/Charset;", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<String> names;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<String> values;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Charset charset;

        /* JADX WARN: Multi-variable type inference failed */
        @kd.j
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @fg.l
        public final a a(@fg.l String name, @fg.l String value) {
            l0.p(name, ProtectedSandApp.s("ꈄ\u0001"));
            l0.p(value, ProtectedSandApp.s("ꈅ\u0001"));
            List<String> list = this.names;
            v.Companion companion = v.INSTANCE;
            list.add(v.Companion.f(companion, name, 0, 0, ProtectedSandApp.s("ꈆ\u0001"), false, false, true, false, this.charset, 91, null));
            this.values.add(v.Companion.f(companion, value, 0, 0, ProtectedSandApp.s("ꈆ\u0001"), false, false, true, false, this.charset, 91, null));
            return this;
        }

        @fg.l
        public final a b(@fg.l String name, @fg.l String value) {
            l0.p(name, ProtectedSandApp.s("ꈄ\u0001"));
            l0.p(value, ProtectedSandApp.s("ꈅ\u0001"));
            List<String> list = this.names;
            v.Companion companion = v.INSTANCE;
            list.add(v.Companion.f(companion, name, 0, 0, ProtectedSandApp.s("ꈆ\u0001"), true, false, true, false, this.charset, 83, null));
            this.values.add(v.Companion.f(companion, value, 0, 0, ProtectedSandApp.s("ꈆ\u0001"), true, false, true, false, this.charset, 83, null));
            return this;
        }

        @fg.l
        public final s c() {
            return new s(this.names, this.values);
        }

        @kd.j
        public a(@fg.m Charset charset) {
            this.charset = charset;
            this.names = new ArrayList();
            this.values = new ArrayList();
        }

        public /* synthetic */ a(Charset charset, int i4, kotlin.jvm.internal.w wVar) {
            this((i4 & 1) != 0 ? null : charset);
        }
    }

    public s(@fg.l List<String> list, @fg.l List<String> list2) {
        l0.p(list, ProtectedSandApp.s("ꈈ\u0001"));
        l0.p(list2, ProtectedSandApp.s("ꈉ\u0001"));
        this.encodedNames = okhttp3.internal.d.c0(list);
        this.encodedValues = okhttp3.internal.d.c0(list2);
    }

    private final long g(okio.n sink, boolean countBytes) {
        okio.m bufferField;
        if (countBytes) {
            bufferField = new okio.m();
        } else {
            l0.m(sink);
            bufferField = sink.getBufferField();
        }
        int size = this.encodedNames.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 > 0) {
                bufferField.writeByte(38);
            }
            bufferField.Q0(this.encodedNames.get(i4));
            bufferField.writeByte(61);
            bufferField.Q0(this.encodedValues.get(i4));
        }
        if (!countBytes) {
            return 0L;
        }
        long size2 = bufferField.size();
        bufferField.d();
        return size2;
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "size", imports = {}))
    @kd.i(name = "-deprecated_size")
    public final int a() {
        return this.encodedNames.size();
    }

    @fg.l
    public final String b(int index) {
        return this.encodedNames.get(index);
    }

    @fg.l
    public final String c(int index) {
        return this.encodedValues.get(index);
    }

    @Override // okhttp3.e0
    public long contentLength() {
        return g(null, true);
    }

    @Override // okhttp3.e0
    @fg.l
    /* renamed from: contentType */
    public x getContentType() {
        return f85059c;
    }

    @fg.l
    public final String d(int index) {
        return v.Companion.n(v.INSTANCE, b(index), 0, 0, true, 3, null);
    }

    @kd.i(name = "size")
    public final int e() {
        return this.encodedNames.size();
    }

    @fg.l
    public final String f(int index) {
        return v.Companion.n(v.INSTANCE, c(index), 0, 0, true, 3, null);
    }

    @Override // okhttp3.e0
    public void writeTo(@fg.l okio.n sink) throws IOException {
        l0.p(sink, ProtectedSandApp.s("ꈊ\u0001"));
        g(sink, false);
    }
}
