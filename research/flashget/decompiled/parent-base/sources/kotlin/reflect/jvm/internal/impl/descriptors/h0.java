package kotlin.reflect.jvm.internal.impl.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.List;

/* compiled from: ModuleDescriptor.kt */
/* loaded from: classes7.dex */
public interface h0 extends m {

    /* compiled from: ModuleDescriptor.kt */
    public static final class a {
        @fg.m
        public static <R, D> R a(@fg.l h0 h0Var, @fg.l o<R, D> oVar, D d5) {
            kotlin.jvm.internal.l0.p(oVar, ProtectedSandApp.s("殎\u0001"));
            return oVar.k(h0Var, d5);
        }

        @fg.m
        public static m b(@fg.l h0 h0Var) {
            return null;
        }
    }

    @fg.l
    List<h0> B0();

    @fg.m
    <T> T J0(@fg.l g0<T> g0Var);

    boolean N(@fg.l h0 h0Var);

    @fg.l
    q0 n0(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar);

    @fg.l
    kotlin.reflect.jvm.internal.impl.builtins.h p();

    @fg.l
    Collection<kotlin.reflect.jvm.internal.impl.name.c> z(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar);
}
