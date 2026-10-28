package kotlin.reflect.jvm.internal.calls;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.l;
import kotlin.reflect.jvm.internal.impl.descriptors.l1;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.t1;
import kotlin.reflect.jvm.internal.n0;

/* compiled from: InlineClassAwareCaller.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a6\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000\u001a\f\u0010\b\u001a\u00020\u0005*\u00020\u0003H\u0002\u001a\u0018\u0010\u000b\u001a\u00020\n*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\f\u001a\u00020\n*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u0012\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t*\u00020\rH\u0000\u001a\u0014\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t*\u0004\u0018\u00010\u000fH\u0000\u001a\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u0004\u0018\u00010\u00112\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\"\u001a\u0010\u0015\u001a\u0004\u0018\u00010\r*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Ljava/lang/reflect/Member;", "M", "Lkotlin/reflect/jvm/internal/calls/e;", "Lkotlin/reflect/jvm/internal/impl/descriptors/b;", "descriptor", "", "isDefault", "b", "g", "Ljava/lang/Class;", "Ljava/lang/reflect/Method;", "f", "d", "Lkotlin/reflect/jvm/internal/impl/types/h0;", "i", "Lkotlin/reflect/jvm/internal/impl/descriptors/m;", "h", "", "a", "getExpectedReceiverType", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;)Lorg/jetbrains/kotlin/types/KotlinType;", "expectedReceiverType", "kotlin-reflection"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class i {
    @d5.e
    public static final Object a(@d5.e Object obj, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        Class<?> i5;
        Method f6;
        l0.p(bVar, ProtectedSandApp.s("䎡"));
        if ((bVar instanceof u0) && kotlin.reflect.jvm.internal.impl.resolve.g.d((l1) bVar)) {
            return obj;
        }
        h0 e6 = e(bVar);
        return (e6 == null || (i5 = i(e6)) == null || (f6 = f(i5, bVar)) == null) ? obj : f6.invoke(obj, new Object[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d5.d
    public static final <M extends Member> e<M> b(@d5.d e<? extends M> eVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar, boolean z5) {
        boolean z6;
        l0.p(eVar, ProtectedSandApp.s("䎢"));
        l0.p(bVar, ProtectedSandApp.s("䎣"));
        boolean z7 = true;
        if (!kotlin.reflect.jvm.internal.impl.resolve.g.a(bVar)) {
            List<j1> n5 = bVar.n();
            l0.o(n5, ProtectedSandApp.s("䎤"));
            if (!(n5 instanceof Collection) || !n5.isEmpty()) {
                Iterator<T> it = n5.iterator();
                while (it.hasNext()) {
                    h0 type = ((j1) it.next()).getType();
                    l0.o(type, ProtectedSandApp.s("䎥"));
                    if (kotlin.reflect.jvm.internal.impl.resolve.g.c(type)) {
                        z6 = true;
                        break;
                    }
                }
            }
            z6 = false;
            if (!z6) {
                h0 i5 = bVar.i();
                if (!(i5 != null && kotlin.reflect.jvm.internal.impl.resolve.g.c(i5)) && ((eVar instanceof d) || !g(bVar))) {
                    z7 = false;
                }
            }
        }
        return z7 ? new h(bVar, eVar, z5) : eVar;
    }

    public static /* synthetic */ e c(e eVar, kotlin.reflect.jvm.internal.impl.descriptors.b bVar, boolean z5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z5 = false;
        }
        return b(eVar, bVar, z5);
    }

    @d5.d
    public static final Method d(@d5.d Class<?> cls, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        l0.p(cls, ProtectedSandApp.s("䎦"));
        l0.p(bVar, ProtectedSandApp.s("䎧"));
        try {
            Method declaredMethod = cls.getDeclaredMethod(ProtectedSandApp.s("䎨"), f(cls, bVar).getReturnType());
            l0.o(declaredMethod, ProtectedSandApp.s("䎩"));
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new e0(ProtectedSandApp.s("䎪") + cls + ProtectedSandApp.s("䎫") + bVar + ')');
        }
    }

    private static final h0 e(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        x0 t02 = bVar.t0();
        x0 m02 = bVar.m0();
        if (t02 != null) {
            return t02.getType();
        }
        if (m02 != null) {
            if (bVar instanceof l) {
                return m02.getType();
            }
            m b6 = bVar.b();
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar = b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) b6 : null;
            if (eVar != null) {
                return eVar.E();
            }
        }
        return null;
    }

    @d5.d
    public static final Method f(@d5.d Class<?> cls, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        l0.p(cls, ProtectedSandApp.s("䎬"));
        l0.p(bVar, ProtectedSandApp.s("䎭"));
        try {
            Method declaredMethod = cls.getDeclaredMethod(ProtectedSandApp.s("䎮"), new Class[0]);
            l0.o(declaredMethod, ProtectedSandApp.s("䎯"));
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new e0(ProtectedSandApp.s("䎰") + cls + ProtectedSandApp.s("䎱") + bVar + ')');
        }
    }

    private static final boolean g(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        h0 e6 = e(bVar);
        return e6 != null && kotlin.reflect.jvm.internal.impl.resolve.g.c(e6);
    }

    @d5.e
    public static final Class<?> h(@d5.e m mVar) {
        if (!(mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) || !kotlin.reflect.jvm.internal.impl.resolve.g.b(mVar)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = (kotlin.reflect.jvm.internal.impl.descriptors.e) mVar;
        Class<?> p5 = n0.p(eVar);
        if (p5 != null) {
            return p5;
        }
        throw new e0(ProtectedSandApp.s("䎲") + eVar.getName() + ProtectedSandApp.s("䎳") + kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.k((kotlin.reflect.jvm.internal.impl.descriptors.h) mVar) + ')');
    }

    @d5.e
    public static final Class<?> i(@d5.d h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("䎴"));
        Class<?> h5 = h(h0Var.U0().b());
        if (h5 == null) {
            return null;
        }
        if (!t1.l(h0Var)) {
            return h5;
        }
        h0 e6 = kotlin.reflect.jvm.internal.impl.resolve.g.e(h0Var);
        if (e6 == null || t1.l(e6) || kotlin.reflect.jvm.internal.impl.builtins.h.r0(e6)) {
            return null;
        }
        return h5;
    }
}
