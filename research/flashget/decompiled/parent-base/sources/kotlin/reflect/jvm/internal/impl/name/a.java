package kotlin.reflect.jvm.internal.impl.name;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.text.v;

/* compiled from: CallableId.kt */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    @l
    public static final C1166a f77561e = new C1166a();

    /* renamed from: f, reason: collision with root package name */
    @l
    private static final f f77562f;

    /* renamed from: g, reason: collision with root package name */
    @l
    private static final c f77563g;

    /* renamed from: a, reason: collision with root package name */
    @l
    private final c f77564a;

    /* renamed from: b, reason: collision with root package name */
    @m
    private final c f77565b;

    /* renamed from: c, reason: collision with root package name */
    @l
    private final f f77566c;

    /* renamed from: d, reason: collision with root package name */
    @m
    private final c f77567d;

    /* compiled from: CallableId.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.name.a$a, reason: collision with other inner class name */
    public static final class C1166a {
        private C1166a() {
        }

        public C1166a(w wVar) {
        }
    }

    static {
        f fVar = h.f77599l;
        f77562f = fVar;
        c k4 = c.k(fVar);
        l0.o(k4, ProtectedSandApp.s("痚\u0001"));
        f77563g = k4;
    }

    public a(@l c cVar, @m c cVar2, @l f fVar, @m c cVar3) {
        l0.p(cVar, ProtectedSandApp.s("痛\u0001"));
        l0.p(fVar, ProtectedSandApp.s("痜\u0001"));
        this.f77564a = cVar;
        this.f77565b = cVar2;
        this.f77566c = fVar;
        this.f77567d = cVar3;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l0.g(this.f77564a, aVar.f77564a) && l0.g(this.f77565b, aVar.f77565b) && l0.g(this.f77566c, aVar.f77566c) && l0.g(this.f77567d, aVar.f77567d);
    }

    public int hashCode() {
        int hashCode = this.f77564a.hashCode() * 31;
        c cVar = this.f77565b;
        int hashCode2 = (this.f77566c.hashCode() + ((hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31)) * 31;
        c cVar2 = this.f77567d;
        return hashCode2 + (cVar2 != null ? cVar2.hashCode() : 0);
    }

    @l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String b5 = this.f77564a.b();
        l0.o(b5, ProtectedSandApp.s("痝\u0001"));
        sb.append(v.h2(b5, '.', '/', false, 4, null));
        sb.append(ProtectedSandApp.s("痞\u0001"));
        c cVar = this.f77565b;
        if (cVar != null) {
            sb.append(cVar);
            sb.append(ProtectedSandApp.s("痟\u0001"));
        }
        sb.append(this.f77566c);
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("痠\u0001"));
        return sb2;
    }

    public /* synthetic */ a(c cVar, c cVar2, f fVar, c cVar3, int i4, w wVar) {
        this(cVar, cVar2, fVar, (i4 & 8) != 0 ? null : cVar3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@l c cVar, @l f fVar) {
        this(cVar, null, fVar, null, 8, null);
        l0.p(cVar, ProtectedSandApp.s("痛\u0001"));
        l0.p(fVar, ProtectedSandApp.s("痜\u0001"));
    }
}
