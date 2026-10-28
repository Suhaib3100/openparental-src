package kotlin.reflect.jvm.internal.impl.name;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.text.e0;
import org.apache.commons.io.n;

/* compiled from: CallableId.kt */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private static final C0361a f25579e = new C0361a(null);

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    @Deprecated
    private static final f f25580f;

    /* renamed from: g, reason: collision with root package name */
    @d5.d
    @Deprecated
    private static final c f25581g;

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final c f25582a;

    /* renamed from: b, reason: collision with root package name */
    @d5.e
    private final c f25583b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final f f25584c;

    /* renamed from: d, reason: collision with root package name */
    @d5.e
    private final c f25585d;

    /* compiled from: CallableId.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.name.a$a, reason: collision with other inner class name */
    private static final class C0361a {
        private C0361a() {
        }

        public C0361a(w wVar) {
        }
    }

    static {
        f fVar = h.f25617m;
        f25580f = fVar;
        c k5 = c.k(fVar);
        l0.o(k5, ProtectedSandApp.s("丸"));
        f25581g = k5;
    }

    public a(@d5.d c cVar, @d5.e c cVar2, @d5.d f fVar, @d5.e c cVar3) {
        l0.p(cVar, ProtectedSandApp.s("丹"));
        l0.p(fVar, ProtectedSandApp.s("为"));
        this.f25582a = cVar;
        this.f25583b = cVar2;
        this.f25584c = fVar;
        this.f25585d = cVar3;
    }

    public boolean equals(@d5.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l0.g(this.f25582a, aVar.f25582a) && l0.g(this.f25583b, aVar.f25583b) && l0.g(this.f25584c, aVar.f25584c) && l0.g(this.f25585d, aVar.f25585d);
    }

    public int hashCode() {
        int hashCode = this.f25582a.hashCode() * 31;
        c cVar = this.f25583b;
        int hashCode2 = (this.f25584c.hashCode() + ((hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31)) * 31;
        c cVar2 = this.f25585d;
        return hashCode2 + (cVar2 != null ? cVar2.hashCode() : 0);
    }

    @d5.d
    public String toString() {
        String h22;
        StringBuilder sb = new StringBuilder();
        String b6 = this.f25582a.b();
        l0.o(b6, ProtectedSandApp.s("丽"));
        h22 = e0.h2(b6, org.apache.commons.io.k.f32026a, n.f32060b, false, 4, null);
        sb.append(h22);
        sb.append(ProtectedSandApp.s("举"));
        c cVar = this.f25583b;
        if (cVar != null) {
            sb.append(cVar);
            sb.append(ProtectedSandApp.s("丿"));
        }
        sb.append(this.f25584c);
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("乀"));
        return sb2;
    }

    public /* synthetic */ a(c cVar, c cVar2, f fVar, c cVar3, int i5, w wVar) {
        this(cVar, cVar2, fVar, (i5 & 8) != 0 ? null : cVar3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@d5.d c cVar, @d5.d f fVar) {
        this(cVar, null, fVar, null, 8, null);
        l0.p(cVar, ProtectedSandApp.s("主"));
        l0.p(fVar, ProtectedSandApp.s("丼"));
    }
}
