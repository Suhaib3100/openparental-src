package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.l1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.builtins.l;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.m0;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.h;

/* compiled from: ClassDeserializer.kt */
@r1({"SMAP\nClassDeserializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/ClassDeserializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,91:1\n1#2:92\n288#3,2:93\n*S KotlinDebug\n*F\n+ 1 ClassDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/ClassDeserializer\n*L\n57#1:93,2\n*E\n"})
/* loaded from: classes7.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    public static final b f78212c = new b();

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final Set<kotlin.reflect.jvm.internal.impl.name.b> f78213d = l1.f(kotlin.reflect.jvm.internal.impl.name.b.m(l.a.f75844d.l()));

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final k f78214a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final ld.l<a, kotlin.reflect.jvm.internal.impl.descriptors.e> f78215b;

    /* compiled from: ClassDeserializer.kt */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        private final kotlin.reflect.jvm.internal.impl.name.b f78216a;

        /* renamed from: b, reason: collision with root package name */
        @fg.m
        private final g f78217b;

        public a(@fg.l kotlin.reflect.jvm.internal.impl.name.b bVar, @fg.m g gVar) {
            l0.p(bVar, ProtectedSandApp.s("籒\u0001"));
            this.f78216a = bVar;
            this.f78217b = gVar;
        }

        @fg.m
        public final g a() {
            return this.f78217b;
        }

        @fg.l
        public final kotlin.reflect.jvm.internal.impl.name.b b() {
            return this.f78216a;
        }

        public boolean equals(@fg.m Object obj) {
            return (obj instanceof a) && l0.g(this.f78216a, ((a) obj).f78216a);
        }

        public int hashCode() {
            return this.f78216a.hashCode();
        }
    }

    /* compiled from: ClassDeserializer.kt */
    public static final class b {
        private b() {
        }

        @fg.l
        public final Set<kotlin.reflect.jvm.internal.impl.name.b> a() {
            return i.f78213d;
        }

        public b(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: ClassDeserializer.kt */
    static final class c extends n0 implements ld.l<a, kotlin.reflect.jvm.internal.impl.descriptors.e> {
        c() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.descriptors.e invoke(@fg.l a aVar) {
            l0.p(aVar, ProtectedSandApp.s("籓\u0001"));
            return i.this.c(aVar);
        }
    }

    public i(@fg.l k kVar) {
        l0.p(kVar, ProtectedSandApp.s("籔\u0001"));
        this.f78214a = kVar;
        this.f78215b = kVar.u().b(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.descriptors.e c(a aVar) {
        Object obj;
        m a5;
        kotlin.reflect.jvm.internal.impl.name.b b5 = aVar.b();
        Iterator<rd.b> it = this.f78214a.l().iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.e c5 = it.next().c(b5);
            if (c5 != null) {
                return c5;
            }
        }
        if (f78213d.contains(b5)) {
            return null;
        }
        g a6 = aVar.a();
        if (a6 == null && (a6 = this.f78214a.e().a(b5)) == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.c a7 = a6.a();
        a.c b6 = a6.b();
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.a c6 = a6.c();
        a1 d5 = a6.d();
        kotlin.reflect.jvm.internal.impl.name.b g4 = b5.g();
        String s4 = ProtectedSandApp.s("籕\u0001");
        if (g4 != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.e e4 = e(this, g4, null, 2, null);
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e eVar = e4 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e ? (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e) e4 : null;
            if (eVar == null) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.name.f j4 = b5.j();
            l0.o(j4, s4);
            if (!eVar.h1(j4)) {
                return null;
            }
            a5 = eVar.a1();
        } else {
            m0 s5 = this.f78214a.s();
            kotlin.reflect.jvm.internal.impl.name.c h4 = b5.h();
            l0.o(h4, ProtectedSandApp.s("籖\u0001"));
            Iterator<T> it2 = o0.c(s5, h4).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                kotlin.reflect.jvm.internal.impl.descriptors.l0 l0Var = (kotlin.reflect.jvm.internal.impl.descriptors.l0) obj;
                if (!(l0Var instanceof o)) {
                    break;
                }
                kotlin.reflect.jvm.internal.impl.name.f j5 = b5.j();
                l0.o(j5, s4);
                if (((o) l0Var).L0(j5)) {
                    break;
                }
            }
            kotlin.reflect.jvm.internal.impl.descriptors.l0 l0Var2 = (kotlin.reflect.jvm.internal.impl.descriptors.l0) obj;
            if (l0Var2 == null) {
                return null;
            }
            k kVar = this.f78214a;
            a.t j12 = b6.j1();
            l0.o(j12, ProtectedSandApp.s("籗\u0001"));
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.g(j12);
            h.a aVar2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.h.f77444b;
            a.w l12 = b6.l1();
            l0.o(l12, ProtectedSandApp.s("籘\u0001"));
            a5 = kVar.a(l0Var2, a7, gVar, aVar2.a(l12), c6, null);
        }
        return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e(a5, b6, a7, c6, d5);
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.e e(i iVar, kotlin.reflect.jvm.internal.impl.name.b bVar, g gVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            gVar = null;
        }
        return iVar.d(bVar, gVar);
    }

    @fg.m
    public final kotlin.reflect.jvm.internal.impl.descriptors.e d(@fg.l kotlin.reflect.jvm.internal.impl.name.b bVar, @fg.m g gVar) {
        l0.p(bVar, ProtectedSandApp.s("籙\u0001"));
        return this.f78215b.invoke(new a(bVar, gVar));
    }
}
