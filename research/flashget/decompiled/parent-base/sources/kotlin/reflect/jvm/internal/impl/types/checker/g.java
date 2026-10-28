package kotlin.reflect.jvm.internal.impl.types.checker;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.types.h1;

/* compiled from: KotlinTypeRefiner.kt */
/* loaded from: classes7.dex */
public abstract class g extends kotlin.reflect.jvm.internal.impl.types.j {

    /* compiled from: KotlinTypeRefiner.kt */
    public static final class a extends g {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final a f78351a = new a();

        private a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.g
        @fg.m
        public kotlin.reflect.jvm.internal.impl.descriptors.e b(@fg.l kotlin.reflect.jvm.internal.impl.name.b bVar) {
            l0.p(bVar, ProtectedSandApp.s("絪\u0001"));
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.g
        @fg.l
        public <S extends kotlin.reflect.jvm.internal.impl.resolve.scopes.h> S c(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @fg.l ld.a<? extends S> aVar) {
            l0.p(eVar, ProtectedSandApp.s("絫\u0001"));
            l0.p(aVar, ProtectedSandApp.s("絬\u0001"));
            return aVar.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.g
        public boolean d(@fg.l h0 h0Var) {
            l0.p(h0Var, ProtectedSandApp.s("絭\u0001"));
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.g
        public boolean e(@fg.l h1 h1Var) {
            l0.p(h1Var, ProtectedSandApp.s("絮\u0001"));
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.g
        @fg.l
        public Collection<kotlin.reflect.jvm.internal.impl.types.h0> g(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            l0.p(eVar, ProtectedSandApp.s("絫\u0001"));
            Collection<kotlin.reflect.jvm.internal.impl.types.h0> j4 = eVar.j().j();
            l0.o(j4, ProtectedSandApp.s("絯\u0001"));
            return j4;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.j
        @fg.l
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public kotlin.reflect.jvm.internal.impl.types.h0 a(@fg.l ce.i iVar) {
            l0.p(iVar, ProtectedSandApp.s("絰\u0001"));
            return (kotlin.reflect.jvm.internal.impl.types.h0) iVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.g
        @fg.m
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public kotlin.reflect.jvm.internal.impl.descriptors.e f(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
            l0.p(mVar, ProtectedSandApp.s("統\u0001"));
            return null;
        }
    }

    @fg.m
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.e b(@fg.l kotlin.reflect.jvm.internal.impl.name.b bVar);

    @fg.l
    public abstract <S extends kotlin.reflect.jvm.internal.impl.resolve.scopes.h> S c(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @fg.l ld.a<? extends S> aVar);

    public abstract boolean d(@fg.l h0 h0Var);

    public abstract boolean e(@fg.l h1 h1Var);

    @fg.m
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.h f(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar);

    @fg.l
    public abstract Collection<kotlin.reflect.jvm.internal.impl.types.h0> g(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar);

    @fg.l
    /* renamed from: h */
    public abstract kotlin.reflect.jvm.internal.impl.types.h0 a(@fg.l ce.i iVar);
}
