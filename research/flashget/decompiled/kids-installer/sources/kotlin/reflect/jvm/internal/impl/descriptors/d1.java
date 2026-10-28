package kotlin.reflect.jvm.internal.impl.descriptors;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import kotlin.m2;

/* compiled from: SupertypeLoopChecker.kt */
/* loaded from: classes5.dex */
public interface d1 {

    /* compiled from: SupertypeLoopChecker.kt */
    public static final class a implements d1 {

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        public static final a f24134a = new a();

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.d1
        @d5.d
        public Collection<kotlin.reflect.jvm.internal.impl.types.h0> a(@d5.d kotlin.reflect.jvm.internal.impl.types.h1 h1Var, @d5.d Collection<? extends kotlin.reflect.jvm.internal.impl.types.h0> collection, @d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.types.h1, ? extends Iterable<? extends kotlin.reflect.jvm.internal.impl.types.h0>> lVar, @d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.types.h0, m2> lVar2) {
            kotlin.jvm.internal.l0.p(h1Var, ProtectedSandApp.s("䝲"));
            kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("䝳"));
            kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("䝴"));
            kotlin.jvm.internal.l0.p(lVar2, ProtectedSandApp.s("䝵"));
            return collection;
        }
    }

    @d5.d
    Collection<kotlin.reflect.jvm.internal.impl.types.h0> a(@d5.d kotlin.reflect.jvm.internal.impl.types.h1 h1Var, @d5.d Collection<? extends kotlin.reflect.jvm.internal.impl.types.h0> collection, @d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.types.h1, ? extends Iterable<? extends kotlin.reflect.jvm.internal.impl.types.h0>> lVar, @d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.types.h0, m2> lVar2);
}
