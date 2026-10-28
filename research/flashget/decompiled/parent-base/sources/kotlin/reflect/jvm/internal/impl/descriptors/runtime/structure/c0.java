package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.z;

/* compiled from: ReflectJavaWildcardType.kt */
@r1({"SMAP\nReflectJavaWildcardType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaWildcardType.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaWildcardType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
/* loaded from: classes7.dex */
public final class c0 extends z implements wd.c0 {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final WildcardType f76242b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final Collection<wd.a> f76243c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f76244d;

    public c0(@fg.l WildcardType wildcardType) {
        l0.p(wildcardType, ProtectedSandApp.s("溙\u0001"));
        this.f76242b = wildcardType;
        this.f76243c = j0.f74919b;
    }

    @Override // wd.d
    public boolean E() {
        return this.f76244d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.z
    public Type O() {
        return this.f76242b;
    }

    @Override // wd.c0
    @fg.m
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public z A() {
        Type[] upperBounds = this.f76242b.getUpperBounds();
        Type[] lowerBounds = this.f76242b.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("溛\u0001") + this.f76242b);
        }
        if (lowerBounds.length == 1) {
            z.a aVar = z.f76282a;
            l0.m(lowerBounds);
            Object gt = kotlin.collections.l.gt(lowerBounds);
            l0.o(gt, ProtectedSandApp.s("溚\u0001"));
            return aVar.a((Type) gt);
        }
        if (upperBounds.length == 1) {
            l0.m(upperBounds);
            Type type = (Type) kotlin.collections.l.gt(upperBounds);
            if (!l0.g(type, Object.class)) {
                z.a aVar2 = z.f76282a;
                l0.m(type);
                return aVar2.a(type);
            }
        }
        return null;
    }

    @fg.l
    protected WildcardType Q() {
        return this.f76242b;
    }

    @Override // wd.d
    @fg.l
    public Collection<wd.a> getAnnotations() {
        return this.f76243c;
    }

    @Override // wd.c0
    public boolean isExtends() {
        l0.o(this.f76242b.getUpperBounds(), ProtectedSandApp.s("溜\u0001"));
        return !l0.g(kotlin.collections.l.nc(r0), Object.class);
    }
}
