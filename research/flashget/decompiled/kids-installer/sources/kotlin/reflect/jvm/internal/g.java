package kotlin.reflect.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.m2;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;

/* compiled from: util.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lkotlin/reflect/jvm/internal/g;", "Lkotlin/reflect/jvm/internal/impl/descriptors/impl/l;", "Lkotlin/reflect/jvm/internal/l;", "Lkotlin/m2;", "Lkotlin/reflect/jvm/internal/impl/descriptors/z;", "descriptor", "data", "visitFunctionDescriptor", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Lkotlin/m2;)Lkotlin/reflect/jvm/internal/l;", "Lkotlin/reflect/jvm/internal/impl/descriptors/u0;", "visitPropertyDescriptor", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lkotlin/m2;)Lkotlin/reflect/jvm/internal/l;", "Lkotlin/reflect/jvm/internal/p;", "a", "Lkotlin/reflect/jvm/internal/p;", "container", "<init>", "(Lkotlin/reflect/jvm/internal/p;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public class g extends kotlin.reflect.jvm.internal.impl.descriptors.impl.l<l<?>, m2> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final p container;

    public g(@d5.d p pVar) {
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("翬"));
        this.container = pVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.l, kotlin.reflect.jvm.internal.impl.descriptors.o
    @d5.d
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public l<?> g(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.z zVar, @d5.d m2 m2Var) {
        kotlin.jvm.internal.l0.p(zVar, ProtectedSandApp.s("翭"));
        kotlin.jvm.internal.l0.p(m2Var, ProtectedSandApp.s("翮"));
        return new q(this.container, zVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.l, kotlin.reflect.jvm.internal.impl.descriptors.o
    @d5.d
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public l<?> d(@d5.d u0 u0Var, @d5.d m2 m2Var) {
        kotlin.jvm.internal.l0.p(u0Var, ProtectedSandApp.s("翯"));
        kotlin.jvm.internal.l0.p(m2Var, ProtectedSandApp.s("翰"));
        int i5 = (u0Var.m0() != null ? 1 : 0) + (u0Var.t0() != null ? 1 : 0);
        if (u0Var.q0()) {
            if (i5 == 0) {
                return new r(this.container, u0Var);
            }
            if (i5 == 1) {
                return new s(this.container, u0Var);
            }
            if (i5 == 2) {
                return new t(this.container, u0Var);
            }
        } else {
            if (i5 == 0) {
                return new w(this.container, u0Var);
            }
            if (i5 == 1) {
                return new x(this.container, u0Var);
            }
            if (i5 == 2) {
                return new y(this.container, u0Var);
            }
        }
        throw new e0(ProtectedSandApp.s("翱") + u0Var);
    }
}
