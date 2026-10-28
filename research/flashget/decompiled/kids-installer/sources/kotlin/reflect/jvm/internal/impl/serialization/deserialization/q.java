package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.metadata.a;

/* compiled from: DeserializedPackageFragmentImpl.kt */
/* loaded from: classes6.dex */
public abstract class q extends p {
    private kotlin.reflect.jvm.internal.impl.resolve.scopes.h A;

    /* renamed from: v, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a f26248v;

    /* renamed from: w, reason: collision with root package name */
    @d5.e
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g f26249w;

    /* renamed from: x, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.d f26250x;

    /* renamed from: y, reason: collision with root package name */
    @d5.d
    private final z f26251y;

    /* renamed from: z, reason: collision with root package name */
    @d5.e
    private a.m f26252z;

    /* compiled from: DeserializedPackageFragmentImpl.kt */
    static final class a extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.name.b, a1> {
        a() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a1 N(@d5.d kotlin.reflect.jvm.internal.impl.name.b bVar) {
            l0.p(bVar, ProtectedSandApp.s("蠡"));
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g gVar = q.this.f26249w;
            if (gVar != null) {
                return gVar;
            }
            a1 a1Var = a1.f24103a;
            l0.o(a1Var, ProtectedSandApp.s("蠢"));
            return a1Var;
        }
    }

    /* compiled from: DeserializedPackageFragmentImpl.kt */
    static final class b extends Lambda implements q3.a<Collection<? extends kotlin.reflect.jvm.internal.impl.name.f>> {
        b() {
            super(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x003a A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0013 A[SYNTHETIC] */
        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.name.f> n() {
            /*
                r5 = this;
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.q r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.q.this
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.z r0 = r0.M0()
                java.util.Collection r0 = r0.b()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r0 = r0.iterator()
            L13:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L3e
                java.lang.Object r2 = r0.next()
                r3 = r2
                kotlin.reflect.jvm.internal.impl.name.b r3 = (kotlin.reflect.jvm.internal.impl.name.b) r3
                boolean r4 = r3.l()
                if (r4 != 0) goto L37
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.i$b r4 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.i.f26203c
                r4.getClass()
                java.util.Set r4 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.i.b()
                boolean r3 = r4.contains(r3)
                if (r3 != 0) goto L37
                r3 = 1
                goto L38
            L37:
                r3 = 0
            L38:
                if (r3 == 0) goto L13
                r1.add(r2)
                goto L13
            L3e:
                java.util.ArrayList r0 = new java.util.ArrayList
                r2 = 10
                int r2 = kotlin.collections.y.b0(r1, r2)
                r0.<init>(r2)
                java.util.Iterator r1 = r1.iterator()
            L4d:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L61
                java.lang.Object r2 = r1.next()
                kotlin.reflect.jvm.internal.impl.name.b r2 = (kotlin.reflect.jvm.internal.impl.name.b) r2
                kotlin.reflect.jvm.internal.impl.name.f r2 = r2.j()
                r0.add(r2)
                goto L4d
            L61:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.q.b.n():java.util.Collection");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar, @d5.d kotlin.reflect.jvm.internal.impl.storage.n nVar, @d5.d h0 h0Var, @d5.d a.m mVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.a aVar, @d5.e kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g gVar) {
        super(cVar, nVar, h0Var);
        l0.p(cVar, ProtectedSandApp.s("蜤"));
        l0.p(nVar, ProtectedSandApp.s("蜥"));
        l0.p(h0Var, ProtectedSandApp.s("蜦"));
        l0.p(mVar, ProtectedSandApp.s("蜧"));
        l0.p(aVar, ProtectedSandApp.s("蜨"));
        this.f26248v = aVar;
        this.f26249w = gVar;
        a.p O = mVar.O();
        l0.o(O, ProtectedSandApp.s("蜩"));
        a.o N = mVar.N();
        l0.o(N, ProtectedSandApp.s("蜪"));
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.d dVar = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.d(O, N);
        this.f26250x = dVar;
        this.f26251y = new z(mVar, dVar, aVar, new a());
        this.f26252z = mVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l0
    @d5.d
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h C() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar = this.A;
        if (hVar != null) {
            return hVar;
        }
        l0.S(ProtectedSandApp.s("蜫"));
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.p
    public void S0(@d5.d k kVar) {
        l0.p(kVar, ProtectedSandApp.s("蜬"));
        a.m mVar = this.f26252z;
        if (mVar == null) {
            throw new IllegalStateException(ProtectedSandApp.s("蜯").toString());
        }
        this.f26252z = null;
        a.l M = mVar.M();
        l0.o(M, ProtectedSandApp.s("蜭"));
        this.A = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.j(this, M, this.f26250x, this.f26248v, this.f26249w, kVar, ProtectedSandApp.s("蜮") + this, new b());
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.p
    @d5.d
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public z M0() {
        return this.f26251y;
    }
}
