package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.metadata.a;

/* compiled from: DeserializedPackageFragmentImpl.kt */
/* loaded from: classes7.dex */
public abstract class p extends o {

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a f78255i;

    /* renamed from: j, reason: collision with root package name */
    @fg.m
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g f78256j;

    /* renamed from: k, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.d f78257k;

    /* renamed from: l, reason: collision with root package name */
    @fg.l
    private final a0 f78258l;

    /* renamed from: m, reason: collision with root package name */
    @fg.m
    private a.m f78259m;

    /* renamed from: n, reason: collision with root package name */
    private kotlin.reflect.jvm.internal.impl.resolve.scopes.h f78260n;

    /* compiled from: DeserializedPackageFragmentImpl.kt */
    static final class a extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.name.b, a1> {
        a() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a1 invoke(@fg.l kotlin.reflect.jvm.internal.impl.name.b bVar) {
            l0.p(bVar, ProtectedSandApp.s("粆\u0001"));
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g gVar = p.this.f78256j;
            if (gVar != null) {
                return gVar;
            }
            a1 a1Var = a1.f75900a;
            l0.o(a1Var, ProtectedSandApp.s("粇\u0001"));
            return a1Var;
        }
    }

    /* compiled from: DeserializedPackageFragmentImpl.kt */
    @r1({"SMAP\nDeserializedPackageFragmentImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedPackageFragmentImpl.kt\norg/jetbrains/kotlin/serialization/deserialization/DeserializedPackageFragmentImpl$initialize$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n766#2:64\n857#2,2:65\n1549#2:67\n1620#2,3:68\n*S KotlinDebug\n*F\n+ 1 DeserializedPackageFragmentImpl.kt\norg/jetbrains/kotlin/serialization/deserialization/DeserializedPackageFragmentImpl$initialize$1\n*L\n54#1:64\n54#1:65,2\n56#1:67\n56#1:68,3\n*E\n"})
    static final class b extends n0 implements ld.a<Collection<? extends kotlin.reflect.jvm.internal.impl.name.f>> {
        b() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection<kotlin.reflect.jvm.internal.impl.name.f> invoke() {
            Collection<kotlin.reflect.jvm.internal.impl.name.b> b5 = p.this.I0().b();
            ArrayList arrayList = new ArrayList();
            for (Object obj : b5) {
                kotlin.reflect.jvm.internal.impl.name.b bVar = (kotlin.reflect.jvm.internal.impl.name.b) obj;
                if (!bVar.l()) {
                    i.f78212c.getClass();
                    if (!i.f78213d.contains(bVar)) {
                        arrayList.add(obj);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(kotlin.collections.w.b0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((kotlin.reflect.jvm.internal.impl.name.b) it.next()).j());
            }
            return arrayList2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar, @fg.l kotlin.reflect.jvm.internal.impl.storage.n nVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.h0 h0Var, @fg.l a.m mVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.a aVar, @fg.m kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g gVar) {
        super(cVar, nVar, h0Var);
        l0.p(cVar, ProtectedSandApp.s("笤\u0001"));
        l0.p(nVar, ProtectedSandApp.s("笥\u0001"));
        l0.p(h0Var, ProtectedSandApp.s("符\u0001"));
        l0.p(mVar, ProtectedSandApp.s("笧\u0001"));
        l0.p(aVar, ProtectedSandApp.s("笨\u0001"));
        this.f78255i = aVar;
        this.f78256j = gVar;
        a.p P = mVar.P();
        l0.o(P, ProtectedSandApp.s("笩\u0001"));
        a.o O = mVar.O();
        l0.o(O, ProtectedSandApp.s("笪\u0001"));
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.d dVar = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.d(P, O);
        this.f78257k = dVar;
        this.f78258l = new a0(mVar, dVar, aVar, new a());
        this.f78259m = mVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.o
    public void M0(@fg.l k kVar) {
        l0.p(kVar, ProtectedSandApp.s("笫\u0001"));
        a.m mVar = this.f78259m;
        if (mVar == null) {
            throw new IllegalStateException(ProtectedSandApp.s("笮\u0001"));
        }
        this.f78259m = null;
        a.l N = mVar.N();
        l0.o(N, ProtectedSandApp.s("第\u0001"));
        this.f78260n = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.j(this, N, this.f78257k, this.f78255i, this.f78256j, kVar, ProtectedSandApp.s("笭\u0001") + this, new b());
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.o
    @fg.l
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public a0 I0() {
        return this.f78258l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l0
    @fg.l
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h q() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar = this.f78260n;
        if (hVar != null) {
            return hVar;
        }
        l0.S(ProtectedSandApp.s("笯\u0001"));
        return null;
    }
}
