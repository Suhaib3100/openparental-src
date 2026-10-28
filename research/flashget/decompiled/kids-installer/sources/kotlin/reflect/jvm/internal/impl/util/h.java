package kotlin.reflect.jvm.internal.impl.util;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.util.g;
import kotlin.text.Regex;

/* compiled from: modifierChecks.kt */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @d5.e
    private final kotlin.reflect.jvm.internal.impl.name.f f26585a;

    /* renamed from: b, reason: collision with root package name */
    @d5.e
    private final Regex f26586b;

    /* renamed from: c, reason: collision with root package name */
    @d5.e
    private final Collection<kotlin.reflect.jvm.internal.impl.name.f> f26587c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private final q3.l<z, String> f26588d;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private final f[] f26589e;

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes6.dex */
    static final class a extends Lambda implements q3.l {

        /* renamed from: p, reason: collision with root package name */
        public static final a f26590p = new a();

        a() {
            super(1);
        }

        @Override // q3.l
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void N(@d5.d z zVar) {
            l0.p(zVar, ProtectedSandApp.s("覽"));
            return null;
        }
    }

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes6.dex */
    static final class b extends Lambda implements q3.l {

        /* renamed from: p, reason: collision with root package name */
        public static final b f26591p = new b();

        b() {
            super(1);
        }

        @Override // q3.l
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void N(@d5.d z zVar) {
            l0.p(zVar, ProtectedSandApp.s("覾"));
            return null;
        }
    }

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes6.dex */
    static final class c extends Lambda implements q3.l {

        /* renamed from: p, reason: collision with root package name */
        public static final c f26592p = new c();

        c() {
            super(1);
        }

        @Override // q3.l
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void N(@d5.d z zVar) {
            l0.p(zVar, ProtectedSandApp.s("覿"));
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private h(kotlin.reflect.jvm.internal.impl.name.f fVar, Regex regex, Collection<kotlin.reflect.jvm.internal.impl.name.f> collection, q3.l<? super z, String> lVar, f... fVarArr) {
        this.f26585a = fVar;
        this.f26586b = regex;
        this.f26587c = collection;
        this.f26588d = lVar;
        this.f26589e = fVarArr;
    }

    @d5.d
    public final g a(@d5.d z zVar) {
        l0.p(zVar, ProtectedSandApp.s("墉"));
        for (f fVar : this.f26589e) {
            String b6 = fVar.b(zVar);
            if (b6 != null) {
                return new g.b(b6);
            }
        }
        String N = this.f26588d.N(zVar);
        return N != null ? new g.b(N) : g.c.f26584b;
    }

    public final boolean b(@d5.d z zVar) {
        l0.p(zVar, ProtectedSandApp.s("墊"));
        if (this.f26585a != null && !l0.g(zVar.getName(), this.f26585a)) {
            return false;
        }
        if (this.f26586b != null) {
            String h5 = zVar.getName().h();
            l0.o(h5, ProtectedSandApp.s("墋"));
            if (!this.f26586b.k(h5)) {
                return false;
            }
        }
        Collection<kotlin.reflect.jvm.internal.impl.name.f> collection = this.f26587c;
        return collection == null || collection.contains(zVar.getName());
    }

    public /* synthetic */ h(kotlin.reflect.jvm.internal.impl.name.f fVar, f[] fVarArr, q3.l lVar, int i5, w wVar) {
        this(fVar, fVarArr, (q3.l<? super z, String>) ((i5 & 4) != 0 ? a.f26590p : lVar));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d f[] fVarArr, @d5.d q3.l<? super z, String> lVar) {
        this(fVar, (Regex) null, (Collection<kotlin.reflect.jvm.internal.impl.name.f>) null, lVar, (f[]) Arrays.copyOf(fVarArr, fVarArr.length));
        l0.p(fVar, ProtectedSandApp.s("境"));
        l0.p(fVarArr, ProtectedSandApp.s("墄"));
        l0.p(lVar, ProtectedSandApp.s("墅"));
    }

    public /* synthetic */ h(Regex regex, f[] fVarArr, q3.l lVar, int i5, w wVar) {
        this(regex, fVarArr, (q3.l<? super z, String>) ((i5 & 4) != 0 ? b.f26591p : lVar));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(@d5.d Regex regex, @d5.d f[] fVarArr, @d5.d q3.l<? super z, String> lVar) {
        this((kotlin.reflect.jvm.internal.impl.name.f) null, regex, (Collection<kotlin.reflect.jvm.internal.impl.name.f>) null, lVar, (f[]) Arrays.copyOf(fVarArr, fVarArr.length));
        l0.p(regex, ProtectedSandApp.s("墆"));
        l0.p(fVarArr, ProtectedSandApp.s("墇"));
        l0.p(lVar, ProtectedSandApp.s("墈"));
    }

    public /* synthetic */ h(Collection collection, f[] fVarArr, q3.l lVar, int i5, w wVar) {
        this((Collection<kotlin.reflect.jvm.internal.impl.name.f>) collection, fVarArr, (q3.l<? super z, String>) ((i5 & 4) != 0 ? c.f26592p : lVar));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(@d5.d Collection<kotlin.reflect.jvm.internal.impl.name.f> collection, @d5.d f[] fVarArr, @d5.d q3.l<? super z, String> lVar) {
        this((kotlin.reflect.jvm.internal.impl.name.f) null, (Regex) null, collection, lVar, (f[]) Arrays.copyOf(fVarArr, fVarArr.length));
        l0.p(collection, ProtectedSandApp.s("墀"));
        l0.p(fVarArr, ProtectedSandApp.s("墁"));
        l0.p(lVar, ProtectedSandApp.s("墂"));
    }
}
