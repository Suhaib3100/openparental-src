package kotlin.reflect.jvm.internal.impl.util;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.util.g;

/* compiled from: modifierChecks.kt */
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @fg.m
    private final kotlin.reflect.jvm.internal.impl.name.f f78593a;

    /* renamed from: b, reason: collision with root package name */
    @fg.m
    private final kotlin.text.r f78594b;

    /* renamed from: c, reason: collision with root package name */
    @fg.m
    private final Collection<kotlin.reflect.jvm.internal.impl.name.f> f78595c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final ld.l<z, String> f78596d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private final f[] f78597e;

    /* compiled from: modifierChecks.kt */
    static final class a extends n0 implements ld.l {

        /* renamed from: b, reason: collision with root package name */
        public static final a f78598b = new a(1);

        a() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(@fg.l z zVar) {
            l0.p(zVar, ProtectedSandApp.s("肻\u0001"));
            return null;
        }
    }

    /* compiled from: modifierChecks.kt */
    static final class b extends n0 implements ld.l {

        /* renamed from: b, reason: collision with root package name */
        public static final b f78599b = new b(1);

        b() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(@fg.l z zVar) {
            l0.p(zVar, ProtectedSandApp.s("肼\u0001"));
            return null;
        }
    }

    /* compiled from: modifierChecks.kt */
    static final class c extends n0 implements ld.l {

        /* renamed from: b, reason: collision with root package name */
        public static final c f78600b = new c(1);

        c() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(@fg.l z zVar) {
            l0.p(zVar, ProtectedSandApp.s("肽\u0001"));
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private h(kotlin.reflect.jvm.internal.impl.name.f fVar, kotlin.text.r rVar, Collection<kotlin.reflect.jvm.internal.impl.name.f> collection, ld.l<? super z, String> lVar, f... fVarArr) {
        this.f78593a = fVar;
        this.f78594b = rVar;
        this.f78595c = collection;
        this.f78596d = lVar;
        this.f78597e = fVarArr;
    }

    @fg.l
    public final g a(@fg.l z zVar) {
        l0.p(zVar, ProtectedSandApp.s("胃\u0001"));
        for (f fVar : this.f78597e) {
            String b5 = fVar.b(zVar);
            if (b5 != null) {
                return new g.b(b5);
            }
        }
        String invoke = this.f78596d.invoke(zVar);
        return invoke != null ? new g.b(invoke) : g.c.f78592b;
    }

    public final boolean b(@fg.l z zVar) {
        l0.p(zVar, ProtectedSandApp.s("胃\u0001"));
        if (this.f78593a != null && !l0.g(zVar.getName(), this.f78593a)) {
            return false;
        }
        if (this.f78594b != null) {
            String b5 = zVar.getName().b();
            l0.o(b5, ProtectedSandApp.s("胄\u0001"));
            if (!this.f78594b.k(b5)) {
                return false;
            }
        }
        Collection<kotlin.reflect.jvm.internal.impl.name.f> collection = this.f78595c;
        return collection == null || collection.contains(zVar.getName());
    }

    public /* synthetic */ h(kotlin.reflect.jvm.internal.impl.name.f fVar, f[] fVarArr, ld.l lVar, int i4, w wVar) {
        this(fVar, fVarArr, (ld.l<? super z, String>) ((i4 & 4) != 0 ? a.f78598b : lVar));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l f[] fVarArr, @fg.l ld.l<? super z, String> lVar) {
        this(fVar, (kotlin.text.r) null, (Collection<kotlin.reflect.jvm.internal.impl.name.f>) null, lVar, (f[]) Arrays.copyOf(fVarArr, fVarArr.length));
        l0.p(fVar, ProtectedSandApp.s("胁\u0001"));
        l0.p(fVarArr, ProtectedSandApp.s("肿\u0001"));
        l0.p(lVar, ProtectedSandApp.s("胀\u0001"));
    }

    public /* synthetic */ h(kotlin.text.r rVar, f[] fVarArr, ld.l lVar, int i4, w wVar) {
        this(rVar, fVarArr, (ld.l<? super z, String>) ((i4 & 4) != 0 ? b.f78599b : lVar));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(@fg.l kotlin.text.r rVar, @fg.l f[] fVarArr, @fg.l ld.l<? super z, String> lVar) {
        this((kotlin.reflect.jvm.internal.impl.name.f) null, rVar, (Collection<kotlin.reflect.jvm.internal.impl.name.f>) null, lVar, (f[]) Arrays.copyOf(fVarArr, fVarArr.length));
        l0.p(rVar, ProtectedSandApp.s("胂\u0001"));
        l0.p(fVarArr, ProtectedSandApp.s("肿\u0001"));
        l0.p(lVar, ProtectedSandApp.s("胀\u0001"));
    }

    public /* synthetic */ h(Collection collection, f[] fVarArr, ld.l lVar, int i4, w wVar) {
        this((Collection<kotlin.reflect.jvm.internal.impl.name.f>) collection, fVarArr, (ld.l<? super z, String>) ((i4 & 4) != 0 ? c.f78600b : lVar));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(@fg.l Collection<kotlin.reflect.jvm.internal.impl.name.f> collection, @fg.l f[] fVarArr, @fg.l ld.l<? super z, String> lVar) {
        this((kotlin.reflect.jvm.internal.impl.name.f) null, (kotlin.text.r) null, collection, lVar, (f[]) Arrays.copyOf(fVarArr, fVarArr.length));
        l0.p(collection, ProtectedSandApp.s("肾\u0001"));
        l0.p(fVarArr, ProtectedSandApp.s("肿\u0001"));
        l0.p(lVar, ProtectedSandApp.s("胀\u0001"));
    }
}
