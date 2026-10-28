package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.reflect.jvm.internal.impl.types.o1;

/* compiled from: ModuleAwareClassDescriptor.kt */
/* loaded from: classes6.dex */
public abstract class t implements kotlin.reflect.jvm.internal.impl.descriptors.e {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    public static final a f24302o = new a(null);

    /* compiled from: ModuleAwareClassDescriptor.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        @d5.d
        public final kotlin.reflect.jvm.internal.impl.resolve.scopes.h a(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.d o1 o1Var, @d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
            kotlin.reflect.jvm.internal.impl.resolve.scopes.h Q;
            kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("䟣"));
            kotlin.jvm.internal.l0.p(o1Var, ProtectedSandApp.s("䟤"));
            kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("䟥"));
            t tVar = eVar instanceof t ? (t) eVar : null;
            if (tVar != null && (Q = tVar.Q(o1Var, gVar)) != null) {
                return Q;
            }
            kotlin.reflect.jvm.internal.impl.resolve.scopes.h h02 = eVar.h0(o1Var);
            kotlin.jvm.internal.l0.o(h02, ProtectedSandApp.s("䟦"));
            return h02;
        }

        @d5.d
        public final kotlin.reflect.jvm.internal.impl.resolve.scopes.h b(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
            kotlin.reflect.jvm.internal.impl.resolve.scopes.h S;
            kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("䟧"));
            kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("䟨"));
            t tVar = eVar instanceof t ? (t) eVar : null;
            if (tVar != null && (S = tVar.S(gVar)) != null) {
                return S;
            }
            kotlin.reflect.jvm.internal.impl.resolve.scopes.h K0 = eVar.K0();
            kotlin.jvm.internal.l0.o(K0, ProtectedSandApp.s("䟩"));
            return K0;
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    @d5.d
    protected abstract kotlin.reflect.jvm.internal.impl.resolve.scopes.h Q(@d5.d o1 o1Var, @d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar);

    @d5.d
    protected abstract kotlin.reflect.jvm.internal.impl.resolve.scopes.h S(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.m
    @d5.d
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.h a() {
        return a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    @d5.d
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.m a() {
        return a();
    }
}
