package okhttp3;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import okhttp3.w;

/* compiled from: FormBody.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\u0018\u0000 \u001f2\u00020\u0001:\u0002\u0013\u0012B%\b\u0000\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u0016\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bJ\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0011\u0010\u001c\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\n¨\u0006 "}, d2 = {"Lokhttp3/s;", "Lokhttp3/f0;", "Lokio/n;", "sink", "", "countBytes", "", "y", "", "s", "()I", "index", "", "t", "v", "u", "x", "Lokhttp3/y;", "b", "a", "Lkotlin/m2;", "r", "", "Ljava/util/List;", "encodedNames", "c", "encodedValues", "w", "size", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "e", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
public final class s extends f0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<String> encodedNames;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<String> encodedValues;

    /* renamed from: d, reason: collision with root package name */
    private static final y f31517d = y.INSTANCE.c(ProtectedSandApp.s("鉺"));

    /* compiled from: FormBody.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\b\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0016\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000e¨\u0006\u0012"}, d2 = {"Lokhttp3/s$a;", "", "", "name", "value", "a", "b", "Lokhttp3/s;", "c", "", "Ljava/util/List;", "names", "values", "Ljava/nio/charset/Charset;", "Ljava/nio/charset/Charset;", "charset", "<init>", "(Ljava/nio/charset/Charset;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<String> names;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<String> values;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Charset charset;

        /* JADX WARN: Multi-variable type inference failed */
        @p3.j
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @d5.d
        public final a a(@d5.d String name, @d5.d String value) {
            kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("曛"));
            kotlin.jvm.internal.l0.p(value, ProtectedSandApp.s("曜"));
            List<String> list = this.names;
            w.Companion companion = w.INSTANCE;
            list.add(w.Companion.f(companion, name, 0, 0, ProtectedSandApp.s("曝"), false, false, true, false, this.charset, 91, null));
            this.values.add(w.Companion.f(companion, value, 0, 0, ProtectedSandApp.s("曞"), false, false, true, false, this.charset, 91, null));
            return this;
        }

        @d5.d
        public final a b(@d5.d String name, @d5.d String value) {
            kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("曟"));
            kotlin.jvm.internal.l0.p(value, ProtectedSandApp.s("曠"));
            List<String> list = this.names;
            w.Companion companion = w.INSTANCE;
            list.add(w.Companion.f(companion, name, 0, 0, ProtectedSandApp.s("曡"), true, false, true, false, this.charset, 83, null));
            this.values.add(w.Companion.f(companion, value, 0, 0, ProtectedSandApp.s("曢"), true, false, true, false, this.charset, 83, null));
            return this;
        }

        @d5.d
        public final s c() {
            return new s(this.names, this.values);
        }

        @p3.j
        public a(@d5.e Charset charset) {
            this.charset = charset;
            this.names = new ArrayList();
            this.values = new ArrayList();
        }

        public /* synthetic */ a(Charset charset, int i5, kotlin.jvm.internal.w wVar) {
            this((i5 & 1) != 0 ? null : charset);
        }
    }

    public s(@d5.d List<String> list, @d5.d List<String> list2) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("鉻"));
        kotlin.jvm.internal.l0.p(list2, ProtectedSandApp.s("鉼"));
        this.encodedNames = okhttp3.internal.d.c0(list);
        this.encodedValues = okhttp3.internal.d.c0(list2);
    }

    private final long y(okio.n sink, boolean countBytes) {
        okio.m i5;
        if (countBytes) {
            i5 = new okio.m();
        } else {
            kotlin.jvm.internal.l0.m(sink);
            i5 = sink.i();
        }
        int size = this.encodedNames.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (i6 > 0) {
                i5.writeByte(38);
            }
            i5.j0(this.encodedNames.get(i6));
            i5.writeByte(61);
            i5.j0(this.encodedValues.get(i6));
        }
        if (!countBytes) {
            return 0L;
        }
        long size2 = i5.size();
        i5.c();
        return size2;
    }

    @Override // okhttp3.f0
    public long a() {
        return y(null, true);
    }

    @Override // okhttp3.f0
    @d5.d
    /* renamed from: b */
    public y getContentType() {
        return f31517d;
    }

    @Override // okhttp3.f0
    public void r(@d5.d okio.n nVar) throws IOException {
        kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("鉽"));
        y(nVar, false);
    }

    @p3.i(name = "-deprecated_size")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "size", imports = {}))
    public final int s() {
        return w();
    }

    @d5.d
    public final String t(int index) {
        return this.encodedNames.get(index);
    }

    @d5.d
    public final String u(int index) {
        return this.encodedValues.get(index);
    }

    @d5.d
    public final String v(int index) {
        return w.Companion.n(w.INSTANCE, t(index), 0, 0, true, 3, null);
    }

    @p3.i(name = "size")
    public final int w() {
        return this.encodedNames.size();
    }

    @d5.d
    public final String x(int index) {
        return w.Companion.n(w.INSTANCE, u(index), 0, 0, true, 3, null);
    }
}
