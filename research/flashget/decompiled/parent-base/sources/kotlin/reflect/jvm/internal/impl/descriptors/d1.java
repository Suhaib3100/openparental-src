package kotlin.reflect.jvm.internal.impl.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import kotlin.k2;

/* compiled from: SupertypeLoopChecker.kt */
/* loaded from: classes7.dex */
public interface d1 {

    /* compiled from: SupertypeLoopChecker.kt */
    public static final class a implements d1 {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final a f75932a = new a();

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.d1
        @fg.l
        public Collection<kotlin.reflect.jvm.internal.impl.types.h0> a(@fg.l kotlin.reflect.jvm.internal.impl.types.h1 h1Var, @fg.l Collection<? extends kotlin.reflect.jvm.internal.impl.types.h0> collection, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.types.h1, ? extends Iterable<? extends kotlin.reflect.jvm.internal.impl.types.h0>> lVar, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.types.h0, k2> lVar2) {
            kotlin.jvm.internal.l0.p(h1Var, ProtectedSandApp.s("歳\u0001"));
            kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("歴\u0001"));
            kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("歵\u0001"));
            kotlin.jvm.internal.l0.p(lVar2, ProtectedSandApp.s("歶\u0001"));
            return collection;
        }
    }

    @fg.l
    Collection<kotlin.reflect.jvm.internal.impl.types.h0> a(@fg.l kotlin.reflect.jvm.internal.impl.types.h1 h1Var, @fg.l Collection<? extends kotlin.reflect.jvm.internal.impl.types.h0> collection, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.types.h1, ? extends Iterable<? extends kotlin.reflect.jvm.internal.impl.types.h0>> lVar, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.types.h0, k2> lVar2);
}
