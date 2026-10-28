package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.l0;

/* compiled from: JavaNullabilityAnnotationsStatus.kt */
/* loaded from: classes5.dex */
public final class w {

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    public static final a f24916d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private static final w f24917e = new w(g0.STRICT, null, null, 6, null);

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final g0 f24918a;

    /* renamed from: b, reason: collision with root package name */
    @d5.e
    private final KotlinVersion f24919b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final g0 f24920c;

    /* compiled from: JavaNullabilityAnnotationsStatus.kt */
    public static final class a {
        private a() {
        }

        @d5.d
        public final w a() {
            return w.f24917e;
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    public w(@d5.d g0 g0Var, @d5.e KotlinVersion kotlinVersion, @d5.d g0 g0Var2) {
        l0.p(g0Var, ProtectedSandApp.s("䭷"));
        l0.p(g0Var2, ProtectedSandApp.s("䭸"));
        this.f24918a = g0Var;
        this.f24919b = kotlinVersion;
        this.f24920c = g0Var2;
    }

    @d5.d
    public final g0 b() {
        return this.f24920c;
    }

    @d5.d
    public final g0 c() {
        return this.f24918a;
    }

    @d5.e
    public final KotlinVersion d() {
        return this.f24919b;
    }

    public boolean equals(@d5.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f24918a == wVar.f24918a && l0.g(this.f24919b, wVar.f24919b) && this.f24920c == wVar.f24920c;
    }

    public int hashCode() {
        int hashCode = this.f24918a.hashCode() * 31;
        KotlinVersion kotlinVersion = this.f24919b;
        return this.f24920c.hashCode() + ((hashCode + (kotlinVersion == null ? 0 : kotlinVersion.getF27234r())) * 31);
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("䭹") + this.f24918a + ProtectedSandApp.s("䭺") + this.f24919b + ProtectedSandApp.s("䭻") + this.f24920c + ')';
    }

    public w(g0 g0Var, KotlinVersion kotlinVersion, g0 g0Var2, int i5, kotlin.jvm.internal.w wVar) {
        this(g0Var, (i5 & 2) != 0 ? new KotlinVersion(1, 0, 0) : kotlinVersion, (i5 & 4) != 0 ? g0Var : g0Var2);
    }
}
