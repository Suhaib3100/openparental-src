package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;

/* compiled from: JavaTypeEnhancementState.kt */
/* loaded from: classes7.dex */
public final class x {

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    public static final b f76798d = new b();

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final x f76799e = new x(v.b(null, 1, null), a.f76803d);

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final z f76800a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final ld.l<kotlin.reflect.jvm.internal.impl.name.c, g0> f76801b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f76802c;

    /* compiled from: JavaTypeEnhancementState.kt */
    /* synthetic */ class a extends kotlin.jvm.internal.g0 implements ld.l<kotlin.reflect.jvm.internal.impl.name.c, g0> {

        /* renamed from: d, reason: collision with root package name */
        public static final a f76803d = new a(1);

        a() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: Z, reason: merged with bridge method [inline-methods] */
        public final g0 invoke(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
            l0.p(cVar, ProtectedSandApp.s("獀\u0001"));
            return v.d(cVar);
        }

        @Override // kotlin.jvm.internal.q, kotlin.reflect.c
        @fg.l
        public final String getName() {
            return ProtectedSandApp.s("獁\u0001");
        }

        @Override // kotlin.jvm.internal.q
        @fg.l
        public final kotlin.reflect.h getOwner() {
            return l1.h(v.class, ProtectedSandApp.s("獂\u0001"));
        }

        @Override // kotlin.jvm.internal.q
        @fg.l
        public final String getSignature() {
            return ProtectedSandApp.s("獃\u0001");
        }
    }

    /* compiled from: JavaTypeEnhancementState.kt */
    public static final class b {
        private b() {
        }

        @fg.l
        public final x a() {
            return x.f76799e;
        }

        public b(kotlin.jvm.internal.w wVar) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x(@fg.l z zVar, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.name.c, ? extends g0> lVar) {
        l0.p(zVar, ProtectedSandApp.s("獄\u0001"));
        l0.p(lVar, ProtectedSandApp.s("獅\u0001"));
        this.f76800a = zVar;
        this.f76801b = lVar;
        this.f76802c = zVar.d() || lVar.invoke(v.e()) == g0.IGNORE;
    }

    public final boolean b() {
        return this.f76802c;
    }

    @fg.l
    public final ld.l<kotlin.reflect.jvm.internal.impl.name.c, g0> c() {
        return this.f76801b;
    }

    @fg.l
    public final z d() {
        return this.f76800a;
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("獆\u0001") + this.f76800a + ProtectedSandApp.s("獇\u0001") + this.f76801b + ')';
    }
}
