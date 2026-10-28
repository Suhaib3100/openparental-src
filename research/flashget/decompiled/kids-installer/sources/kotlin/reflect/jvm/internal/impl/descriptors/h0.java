package kotlin.reflect.jvm.internal.impl.descriptors;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.List;

/* compiled from: ModuleDescriptor.kt */
/* loaded from: classes6.dex */
public interface h0 extends m {

    /* compiled from: ModuleDescriptor.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        @d5.e
        public static <R, D> R a(@d5.d h0 h0Var, @d5.d o<R, D> oVar, D d6) {
            kotlin.jvm.internal.l0.p(oVar, ProtectedSandApp.s("䞋"));
            return oVar.j(h0Var, d6);
        }

        @d5.e
        public static m b(@d5.d h0 h0Var) {
            return null;
        }
    }

    @d5.d
    kotlin.reflect.jvm.internal.impl.builtins.h A();

    @d5.d
    List<h0> A0();

    @d5.e
    <T> T P0(@d5.d g0<T> g0Var);

    @d5.d
    q0 V(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar);

    boolean l0(@d5.d h0 h0Var);

    @d5.d
    Collection<kotlin.reflect.jvm.internal.impl.name.c> t(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar, @d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar);
}
