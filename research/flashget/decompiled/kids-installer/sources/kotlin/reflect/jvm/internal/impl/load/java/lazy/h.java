package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import b4.y;
import b4.z;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.n;
import q3.l;

/* compiled from: resolvers.kt */
/* loaded from: classes5.dex */
public final class h implements k {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final g f24772a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final m f24773b;

    /* renamed from: c, reason: collision with root package name */
    private final int f24774c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private final Map<y, Integer> f24775d;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.h<y, n> f24776e;

    /* compiled from: resolvers.kt */
    /* loaded from: classes6.dex */
    static final class a extends Lambda implements l<y, n> {
        a() {
            super(1);
        }

        @Override // q3.l
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n N(@d5.d y yVar) {
            l0.p(yVar, ProtectedSandApp.s("蕨"));
            Integer num = (Integer) h.this.f24775d.get(yVar);
            if (num == null) {
                return null;
            }
            h hVar = h.this;
            return new n(kotlin.reflect.jvm.internal.impl.load.java.lazy.a.h(kotlin.reflect.jvm.internal.impl.load.java.lazy.a.b(hVar.f24772a, hVar), hVar.f24773b.getAnnotations()), yVar, hVar.f24774c + num.intValue(), hVar.f24773b);
        }
    }

    public h(@d5.d g gVar, @d5.d m mVar, @d5.d z zVar, int i5) {
        l0.p(gVar, ProtectedSandApp.s("䩱"));
        l0.p(mVar, ProtectedSandApp.s("䩲"));
        l0.p(zVar, ProtectedSandApp.s("䩳"));
        this.f24772a = gVar;
        this.f24773b = mVar;
        this.f24774c = i5;
        this.f24775d = kotlin.reflect.jvm.internal.impl.utils.a.d(zVar.getTypeParameters());
        this.f24776e = gVar.e().i(new a());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.k
    @d5.e
    public f1 a(@d5.d y yVar) {
        l0.p(yVar, ProtectedSandApp.s("䩴"));
        n N = this.f24776e.N(yVar);
        return N != null ? N : this.f24772a.f().a(yVar);
    }
}
