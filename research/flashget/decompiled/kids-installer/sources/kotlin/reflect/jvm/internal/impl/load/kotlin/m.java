package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;

/* compiled from: methodSignatureMapping.kt */
/* loaded from: classes5.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final b f25053a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final d f25054b = new d(kotlin.reflect.jvm.internal.impl.resolve.jvm.e.BOOLEAN);

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private static final d f25055c = new d(kotlin.reflect.jvm.internal.impl.resolve.jvm.e.CHAR);

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private static final d f25056d = new d(kotlin.reflect.jvm.internal.impl.resolve.jvm.e.BYTE);

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private static final d f25057e = new d(kotlin.reflect.jvm.internal.impl.resolve.jvm.e.SHORT);

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    private static final d f25058f = new d(kotlin.reflect.jvm.internal.impl.resolve.jvm.e.INT);

    /* renamed from: g, reason: collision with root package name */
    @d5.d
    private static final d f25059g = new d(kotlin.reflect.jvm.internal.impl.resolve.jvm.e.FLOAT);

    /* renamed from: h, reason: collision with root package name */
    @d5.d
    private static final d f25060h = new d(kotlin.reflect.jvm.internal.impl.resolve.jvm.e.LONG);

    /* renamed from: i, reason: collision with root package name */
    @d5.d
    private static final d f25061i = new d(kotlin.reflect.jvm.internal.impl.resolve.jvm.e.DOUBLE);

    /* compiled from: methodSignatureMapping.kt */
    public static final class a extends m {

        /* renamed from: j, reason: collision with root package name */
        @d5.d
        private final m f25062j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@d5.d m mVar) {
            super(null);
            l0.p(mVar, ProtectedSandApp.s("䲚"));
            this.f25062j = mVar;
        }

        @d5.d
        public final m i() {
            return this.f25062j;
        }
    }

    /* compiled from: methodSignatureMapping.kt */
    public static final class b {
        private b() {
        }

        @d5.d
        public final d a() {
            return m.f25054b;
        }

        @d5.d
        public final d b() {
            return m.f25056d;
        }

        @d5.d
        public final d c() {
            return m.f25055c;
        }

        @d5.d
        public final d d() {
            return m.f25061i;
        }

        @d5.d
        public final d e() {
            return m.f25059g;
        }

        @d5.d
        public final d f() {
            return m.f25058f;
        }

        @d5.d
        public final d g() {
            return m.f25060h;
        }

        @d5.d
        public final d h() {
            return m.f25057e;
        }

        public b(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: methodSignatureMapping.kt */
    public static final class c extends m {

        /* renamed from: j, reason: collision with root package name */
        @d5.d
        private final String f25063j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@d5.d String str) {
            super(null);
            l0.p(str, ProtectedSandApp.s("䲛"));
            this.f25063j = str;
        }

        @d5.d
        public final String i() {
            return this.f25063j;
        }
    }

    /* compiled from: methodSignatureMapping.kt */
    public static final class d extends m {

        /* renamed from: j, reason: collision with root package name */
        @d5.e
        private final kotlin.reflect.jvm.internal.impl.resolve.jvm.e f25064j;

        public d(@d5.e kotlin.reflect.jvm.internal.impl.resolve.jvm.e eVar) {
            super(null);
            this.f25064j = eVar;
        }

        @d5.e
        public final kotlin.reflect.jvm.internal.impl.resolve.jvm.e i() {
            return this.f25064j;
        }
    }

    public /* synthetic */ m(kotlin.jvm.internal.w wVar) {
        this();
    }

    @d5.d
    public String toString() {
        return o.f25065a.l(this);
    }

    private m() {
    }
}
