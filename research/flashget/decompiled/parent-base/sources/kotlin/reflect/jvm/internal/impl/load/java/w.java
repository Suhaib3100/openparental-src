package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;

/* compiled from: JavaNullabilityAnnotationsStatus.kt */
/* loaded from: classes7.dex */
public final class w {

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    public static final a f76793d = new a();

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final w f76794e = new w(g0.STRICT, null, null, 6, null);

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final g0 f76795a;

    /* renamed from: b, reason: collision with root package name */
    @fg.m
    private final kotlin.y f76796b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final g0 f76797c;

    /* compiled from: JavaNullabilityAnnotationsStatus.kt */
    public static final class a {
        private a() {
        }

        @fg.l
        public final w a() {
            return w.f76794e;
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    public w(@fg.l g0 g0Var, @fg.m kotlin.y yVar, @fg.l g0 g0Var2) {
        l0.p(g0Var, ProtectedSandApp.s("猻\u0001"));
        l0.p(g0Var2, ProtectedSandApp.s("猼\u0001"));
        this.f76795a = g0Var;
        this.f76796b = yVar;
        this.f76797c = g0Var2;
    }

    @fg.l
    public final g0 b() {
        return this.f76797c;
    }

    @fg.l
    public final g0 c() {
        return this.f76795a;
    }

    @fg.m
    public final kotlin.y d() {
        return this.f76796b;
    }

    public boolean equals(@fg.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f76795a == wVar.f76795a && l0.g(this.f76796b, wVar.f76796b) && this.f76797c == wVar.f76797c;
    }

    public int hashCode() {
        int hashCode = this.f76795a.hashCode() * 31;
        kotlin.y yVar = this.f76796b;
        return this.f76797c.hashCode() + ((hashCode + (yVar == null ? 0 : yVar.getVersion())) * 31);
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("猽\u0001") + this.f76795a + ProtectedSandApp.s("猾\u0001") + this.f76796b + ProtectedSandApp.s("猿\u0001") + this.f76797c + ')';
    }

    public w(g0 g0Var, kotlin.y yVar, g0 g0Var2, int i4, kotlin.jvm.internal.w wVar) {
        this(g0Var, (i4 & 2) != 0 ? new kotlin.y(1, 0, 0) : yVar, (i4 & 4) != 0 ? g0Var : g0Var2);
    }
}
