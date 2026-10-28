package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.z;

/* compiled from: ReflectJavaWildcardType.kt */
/* loaded from: classes6.dex */
public final class c0 extends z implements b4.c0 {

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final WildcardType f24392b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final Collection<b4.a> f24393c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f24394d;

    public c0(@d5.d WildcardType wildcardType) {
        l0.p(wildcardType, ProtectedSandApp.s("荠"));
        this.f24392b = wildcardType;
        this.f24393c = EmptyList.f23167o;
    }

    @Override // b4.c0
    public boolean M() {
        Object nc;
        Type[] upperBounds = this.f24392b.getUpperBounds();
        l0.o(upperBounds, ProtectedSandApp.s("荡"));
        nc = kotlin.collections.t.nc(upperBounds);
        return !l0.g(nc, Object.class);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.z
    public Type U() {
        return this.f24392b;
    }

    @Override // b4.c0
    @d5.e
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public z H() {
        Object ft;
        Object ft2;
        Type[] upperBounds = this.f24392b.getUpperBounds();
        Type[] lowerBounds = this.f24392b.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("荦") + this.f24392b);
        }
        if (lowerBounds.length == 1) {
            z.a aVar = z.f24432a;
            l0.o(lowerBounds, ProtectedSandApp.s("荢"));
            ft2 = kotlin.collections.t.ft(lowerBounds);
            l0.o(ft2, ProtectedSandApp.s("荣"));
            return aVar.a((Type) ft2);
        }
        if (upperBounds.length == 1) {
            l0.o(upperBounds, ProtectedSandApp.s("荤"));
            ft = kotlin.collections.t.ft(upperBounds);
            Type type = (Type) ft;
            if (!l0.g(type, Object.class)) {
                z.a aVar2 = z.f24432a;
                l0.o(type, ProtectedSandApp.s("荥"));
                return aVar2.a(type);
            }
        }
        return null;
    }

    @d5.d
    protected WildcardType W() {
        return this.f24392b;
    }

    @Override // b4.d
    @d5.d
    public Collection<b4.a> getAnnotations() {
        return this.f24393c;
    }

    @Override // b4.d
    public boolean o() {
        return this.f24394d;
    }
}
