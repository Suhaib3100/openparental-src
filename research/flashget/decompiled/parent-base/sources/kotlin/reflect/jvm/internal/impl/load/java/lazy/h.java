package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.Map;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.n;
import wd.y;
import wd.z;

/* compiled from: resolvers.kt */
/* loaded from: classes7.dex */
public final class h implements k {

    /* renamed from: a, reason: collision with root package name */
    @l
    private final g f76647a;

    /* renamed from: b, reason: collision with root package name */
    @l
    private final m f76648b;

    /* renamed from: c, reason: collision with root package name */
    private final int f76649c;

    /* renamed from: d, reason: collision with root package name */
    @l
    private final Map<y, Integer> f76650d;

    /* renamed from: e, reason: collision with root package name */
    @l
    private final kotlin.reflect.jvm.internal.impl.storage.h<y, n> f76651e;

    /* compiled from: resolvers.kt */
    static final class a extends n0 implements ld.l<y, n> {
        a() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n invoke(@l y yVar) {
            l0.p(yVar, ProtectedSandApp.s("爁\u0001"));
            Integer num = (Integer) h.this.f76650d.get(yVar);
            if (num == null) {
                return null;
            }
            h hVar = h.this;
            return new n(kotlin.reflect.jvm.internal.impl.load.java.lazy.a.h(kotlin.reflect.jvm.internal.impl.load.java.lazy.a.b(hVar.f76647a, hVar), hVar.f76648b.getAnnotations()), yVar, hVar.f76649c + num.intValue(), hVar.f76648b);
        }
    }

    public h(@l g gVar, @l m mVar, @l z zVar, int i4) {
        l0.p(gVar, ProtectedSandApp.s("爂\u0001"));
        l0.p(mVar, ProtectedSandApp.s("爃\u0001"));
        l0.p(zVar, ProtectedSandApp.s("爄\u0001"));
        this.f76647a = gVar;
        this.f76648b = mVar;
        this.f76649c = i4;
        this.f76650d = kotlin.reflect.jvm.internal.impl.utils.a.d(zVar.getTypeParameters());
        this.f76651e = gVar.e().b(new a());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.k
    @fg.m
    public f1 a(@l y yVar) {
        l0.p(yVar, ProtectedSandApp.s("爅\u0001"));
        n invoke = this.f76651e.invoke(yVar);
        return invoke != null ? invoke : this.f76647a.f().a(yVar);
    }
}
