package kotlin.reflect.jvm.internal.impl.types.checker;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.types.h1;

/* compiled from: KotlinTypeRefiner.kt */
/* loaded from: classes5.dex */
public abstract class g extends kotlin.reflect.jvm.internal.impl.types.j {

    /* compiled from: KotlinTypeRefiner.kt */
    /* loaded from: classes6.dex */
    public static final class a extends g {

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        public static final a f26343a = new a();

        private a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.g
        @d5.e
        public kotlin.reflect.jvm.internal.impl.descriptors.e b(@d5.d kotlin.reflect.jvm.internal.impl.name.b bVar) {
            l0.p(bVar, ProtectedSandApp.s("袐"));
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.g
        @d5.d
        public <S extends kotlin.reflect.jvm.internal.impl.resolve.scopes.h> S c(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.d q3.a<? extends S> aVar) {
            l0.p(eVar, ProtectedSandApp.s("袑"));
            l0.p(aVar, ProtectedSandApp.s("袒"));
            return aVar.n();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.g
        public boolean d(@d5.d h0 h0Var) {
            l0.p(h0Var, ProtectedSandApp.s("袓"));
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.g
        public boolean e(@d5.d h1 h1Var) {
            l0.p(h1Var, ProtectedSandApp.s("袔"));
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.g
        @d5.d
        public Collection<kotlin.reflect.jvm.internal.impl.types.h0> g(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            l0.p(eVar, ProtectedSandApp.s("袕"));
            Collection<kotlin.reflect.jvm.internal.impl.types.h0> m5 = eVar.m().m();
            l0.o(m5, ProtectedSandApp.s("袖"));
            return m5;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.j
        @d5.d
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public kotlin.reflect.jvm.internal.impl.types.h0 a(@d5.d h4.i iVar) {
            l0.p(iVar, ProtectedSandApp.s("袗"));
            return (kotlin.reflect.jvm.internal.impl.types.h0) iVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.g
        @d5.e
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public kotlin.reflect.jvm.internal.impl.descriptors.e f(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
            l0.p(mVar, ProtectedSandApp.s("袘"));
            return null;
        }
    }

    @d5.e
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.e b(@d5.d kotlin.reflect.jvm.internal.impl.name.b bVar);

    @d5.d
    public abstract <S extends kotlin.reflect.jvm.internal.impl.resolve.scopes.h> S c(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.d q3.a<? extends S> aVar);

    public abstract boolean d(@d5.d h0 h0Var);

    public abstract boolean e(@d5.d h1 h1Var);

    @d5.e
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.h f(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar);

    @d5.d
    public abstract Collection<kotlin.reflect.jvm.internal.impl.types.h0> g(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar);

    @d5.d
    /* renamed from: h */
    public abstract kotlin.reflect.jvm.internal.impl.types.h0 a(@d5.d h4.i iVar);
}
