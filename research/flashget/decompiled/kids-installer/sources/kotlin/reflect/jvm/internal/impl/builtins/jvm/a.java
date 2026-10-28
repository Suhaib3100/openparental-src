package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.storage.n;

/* compiled from: CloneableClassScope.kt */
/* loaded from: classes6.dex */
public final class a extends kotlin.reflect.jvm.internal.impl.resolve.scopes.e {

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    public static final C0272a f23938e = new C0272a(null);

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.impl.name.f f23939f;

    /* compiled from: CloneableClassScope.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0272a {
        private C0272a() {
        }

        @d5.d
        public final kotlin.reflect.jvm.internal.impl.name.f a() {
            return a.f23939f;
        }

        public C0272a(w wVar) {
        }
    }

    static {
        kotlin.reflect.jvm.internal.impl.name.f p5 = kotlin.reflect.jvm.internal.impl.name.f.p(ProtectedSandApp.s("胜"));
        l0.o(p5, ProtectedSandApp.s("胝"));
        f23939f = p5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@d5.d n nVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        super(nVar, eVar);
        l0.p(nVar, ProtectedSandApp.s("胞"));
        l0.p(eVar, ProtectedSandApp.s("胟"));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.e
    @d5.d
    protected List<z> j() {
        List<z> k5;
        g0 s12 = g0.s1(m(), kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e.b(), f23939f, b.a.DECLARATION, a1.f24103a);
        x0 Q0 = m().Q0();
        EmptyList emptyList = EmptyList.f23167o;
        s12.Y0(null, Q0, emptyList, emptyList, emptyList, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.j(m()).i(), e0.OPEN, t.f24438c);
        k5 = kotlin.collections.z.k(s12);
        return k5;
    }
}
