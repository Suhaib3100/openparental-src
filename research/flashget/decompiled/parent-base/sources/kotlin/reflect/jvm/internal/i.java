package kotlin.reflect.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;

/* compiled from: util.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lkotlin/reflect/jvm/internal/i;", "Lkotlin/reflect/jvm/internal/impl/descriptors/impl/l;", "Lkotlin/reflect/jvm/internal/n;", "Lkotlin/k2;", "Lkotlin/reflect/jvm/internal/r;", "container", "<init>", "(Lkotlin/reflect/jvm/internal/r;)V", "Lkotlin/reflect/jvm/internal/impl/descriptors/z;", "descriptor", "data", "visitFunctionDescriptor", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Lkotlin/k2;)Lkotlin/reflect/jvm/internal/n;", "Lkotlin/reflect/jvm/internal/impl/descriptors/u0;", "visitPropertyDescriptor", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lkotlin/k2;)Lkotlin/reflect/jvm/internal/n;", "a", "Lkotlin/reflect/jvm/internal/r;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nutil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 util.kt\nkotlin/reflect/jvm/internal/CreateKCallableVisitor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,330:1\n1#2:331\n*E\n"})
/* loaded from: classes7.dex */
public class i extends kotlin.reflect.jvm.internal.impl.descriptors.impl.l<n<?>, k2> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final r container;

    public i(@fg.l r rVar) {
        kotlin.jvm.internal.l0.p(rVar, ProtectedSandApp.s("杬\u0001"));
        this.container = rVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.l, kotlin.reflect.jvm.internal.impl.descriptors.o
    @fg.l
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public n<?> i(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.z zVar, @fg.l k2 k2Var) {
        kotlin.jvm.internal.l0.p(zVar, ProtectedSandApp.s("杭\u0001"));
        kotlin.jvm.internal.l0.p(k2Var, ProtectedSandApp.s("杮\u0001"));
        return new s(this.container, zVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.l, kotlin.reflect.jvm.internal.impl.descriptors.o
    @fg.l
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public n<?> c(@fg.l u0 u0Var, @fg.l k2 k2Var) {
        kotlin.jvm.internal.l0.p(u0Var, ProtectedSandApp.s("杭\u0001"));
        kotlin.jvm.internal.l0.p(k2Var, ProtectedSandApp.s("杮\u0001"));
        int i4 = (u0Var.O() != null ? 1 : 0) + (u0Var.S() != null ? 1 : 0);
        if (u0Var.Q()) {
            if (i4 == 0) {
                return new t(this.container, u0Var);
            }
            if (i4 == 1) {
                return new u(this.container, u0Var);
            }
            if (i4 == 2) {
                return new v(this.container, u0Var);
            }
        } else {
            if (i4 == 0) {
                return new y(this.container, u0Var);
            }
            if (i4 == 1) {
                return new z(this.container, u0Var);
            }
            if (i4 == 2) {
                return new a0(this.container, u0Var);
            }
        }
        throw new g0(ProtectedSandApp.s("杯\u0001") + u0Var);
    }
}
