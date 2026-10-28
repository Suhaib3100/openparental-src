package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: ClassifierBasedTypeConstructor.kt */
/* loaded from: classes6.dex */
public abstract class n implements h1 {

    /* renamed from: a, reason: collision with root package name */
    private int f26508a;

    private final boolean g(kotlin.reflect.jvm.internal.impl.descriptors.h hVar) {
        return (kotlin.reflect.jvm.internal.impl.types.error.k.m(hVar) || kotlin.reflect.jvm.internal.impl.resolve.e.E(hVar)) ? false : true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @d5.d
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.h b();

    public boolean equals(@d5.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1) || obj.hashCode() != hashCode()) {
            return false;
        }
        h1 h1Var = (h1) obj;
        if (h1Var.r().size() != r().size()) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h b6 = b();
        kotlin.reflect.jvm.internal.impl.descriptors.h b7 = h1Var.b();
        if (b7 != null && g(b6) && g(b7)) {
            return h(b7);
        }
        return false;
    }

    protected final boolean f(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.h hVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.h hVar2) {
        kotlin.jvm.internal.l0.p(hVar, ProtectedSandApp.s("耩"));
        kotlin.jvm.internal.l0.p(hVar2, ProtectedSandApp.s("耪"));
        if (!kotlin.jvm.internal.l0.g(hVar.getName(), hVar2.getName())) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.m b6 = hVar.b();
        for (kotlin.reflect.jvm.internal.impl.descriptors.m b7 = hVar2.b(); b6 != null && b7 != null; b7 = b7.b()) {
            if (b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.h0) {
                return b7 instanceof kotlin.reflect.jvm.internal.impl.descriptors.h0;
            }
            if (b7 instanceof kotlin.reflect.jvm.internal.impl.descriptors.h0) {
                return false;
            }
            if (b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0) {
                return (b7 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0) && kotlin.jvm.internal.l0.g(((kotlin.reflect.jvm.internal.impl.descriptors.l0) b6).f(), ((kotlin.reflect.jvm.internal.impl.descriptors.l0) b7).f());
            }
            if ((b7 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0) || !kotlin.jvm.internal.l0.g(b6.getName(), b7.getName())) {
                return false;
            }
            b6 = b6.b();
        }
        return true;
    }

    protected abstract boolean h(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.h hVar);

    public int hashCode() {
        int i5 = this.f26508a;
        if (i5 != 0) {
            return i5;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h b6 = b();
        int hashCode = g(b6) ? kotlin.reflect.jvm.internal.impl.resolve.e.m(b6).hashCode() : System.identityHashCode(this);
        this.f26508a = hashCode;
        return hashCode;
    }
}
