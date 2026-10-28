package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.reflect.jvm.internal.impl.types.o1;

/* compiled from: ModuleAwareClassDescriptor.kt */
/* loaded from: classes7.dex */
public abstract class t implements kotlin.reflect.jvm.internal.impl.descriptors.e {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    public static final a f76145b = new a();

    /* compiled from: ModuleAwareClassDescriptor.kt */
    public static final class a {
        private a() {
        }

        @fg.l
        public final kotlin.reflect.jvm.internal.impl.resolve.scopes.h a(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @fg.l o1 o1Var, @fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
            kotlin.reflect.jvm.internal.impl.resolve.scopes.h j02;
            kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("淊\u0001"));
            kotlin.jvm.internal.l0.p(o1Var, ProtectedSandApp.s("淋\u0001"));
            kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("淌\u0001"));
            t tVar = eVar instanceof t ? (t) eVar : null;
            if (tVar != null && (j02 = tVar.j0(o1Var, gVar)) != null) {
                return j02;
            }
            kotlin.reflect.jvm.internal.impl.resolve.scopes.h s02 = eVar.s0(o1Var);
            kotlin.jvm.internal.l0.o(s02, ProtectedSandApp.s("淍\u0001"));
            return s02;
        }

        @fg.l
        public final kotlin.reflect.jvm.internal.impl.resolve.scopes.h b(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
            kotlin.reflect.jvm.internal.impl.resolve.scopes.h l02;
            kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("淊\u0001"));
            kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("淌\u0001"));
            t tVar = eVar instanceof t ? (t) eVar : null;
            if (tVar != null && (l02 = tVar.l0(gVar)) != null) {
                return l02;
            }
            kotlin.reflect.jvm.internal.impl.resolve.scopes.h Z = eVar.Z();
            kotlin.jvm.internal.l0.o(Z, ProtectedSandApp.s("淎\u0001"));
            return Z;
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.m
    @fg.l
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.h a() {
        return a();
    }

    @fg.l
    protected abstract kotlin.reflect.jvm.internal.impl.resolve.scopes.h j0(@fg.l o1 o1Var, @fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar);

    @fg.l
    protected abstract kotlin.reflect.jvm.internal.impl.resolve.scopes.h l0(@fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    @fg.l
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.m a() {
        return a();
    }
}
