package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Set;
import kotlin.collections.p1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.builtins.l;

/* compiled from: ClassDeserializer.kt */
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    public static final b f26203c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private static final Set<kotlin.reflect.jvm.internal.impl.name.b> f26204d;

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final k f26205a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final q3.l<a, kotlin.reflect.jvm.internal.impl.descriptors.e> f26206b;

    /* compiled from: ClassDeserializer.kt */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        private final kotlin.reflect.jvm.internal.impl.name.b f26207a;

        /* renamed from: b, reason: collision with root package name */
        @d5.e
        private final g f26208b;

        public a(@d5.d kotlin.reflect.jvm.internal.impl.name.b bVar, @d5.e g gVar) {
            l0.p(bVar, ProtectedSandApp.s("同"));
            this.f26207a = bVar;
            this.f26208b = gVar;
        }

        @d5.e
        public final g a() {
            return this.f26208b;
        }

        @d5.d
        public final kotlin.reflect.jvm.internal.impl.name.b b() {
            return this.f26207a;
        }

        public boolean equals(@d5.e Object obj) {
            return (obj instanceof a) && l0.g(this.f26207a, ((a) obj).f26207a);
        }

        public int hashCode() {
            return this.f26207a.hashCode();
        }
    }

    /* compiled from: ClassDeserializer.kt */
    public static final class b {
        private b() {
        }

        @d5.d
        public final Set<kotlin.reflect.jvm.internal.impl.name.b> a() {
            return i.f26204d;
        }

        public b(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: ClassDeserializer.kt */
    /* loaded from: classes6.dex */
    static final class c extends Lambda implements q3.l<a, kotlin.reflect.jvm.internal.impl.descriptors.e> {
        c() {
            super(1);
        }

        @Override // q3.l
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.descriptors.e N(@d5.d a aVar) {
            l0.p(aVar, ProtectedSandApp.s("蠝"));
            return i.this.c(aVar);
        }
    }

    static {
        Set<kotlin.reflect.jvm.internal.impl.name.b> f6;
        f6 = p1.f(kotlin.reflect.jvm.internal.impl.name.b.m(l.a.f24047d.l()));
        f26204d = f6;
    }

    public i(@d5.d k kVar) {
        l0.p(kVar, ProtectedSandApp.s("名"));
        this.f26205a = kVar;
        this.f26206b = kVar.u().i(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c0 A[EDGE_INSN: B:43:0x00c0->B:44:0x00c0 BREAK  A[LOOP:1: B:34:0x0098->B:48:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[LOOP:1: B:34:0x0098->B:48:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.descriptors.e c(kotlin.reflect.jvm.internal.impl.serialization.deserialization.i.a r13) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.i.c(kotlin.reflect.jvm.internal.impl.serialization.deserialization.i$a):kotlin.reflect.jvm.internal.impl.descriptors.e");
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.e e(i iVar, kotlin.reflect.jvm.internal.impl.name.b bVar, g gVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            gVar = null;
        }
        return iVar.d(bVar, gVar);
    }

    @d5.e
    public final kotlin.reflect.jvm.internal.impl.descriptors.e d(@d5.d kotlin.reflect.jvm.internal.impl.name.b bVar, @d5.e g gVar) {
        l0.p(bVar, ProtectedSandApp.s("吒"));
        return this.f26206b.N(new a(bVar, gVar));
    }
}
