package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Set;
import kotlin.collections.p1;
import kotlin.collections.r1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.s1;
import kotlin.reflect.jvm.internal.impl.types.z;

/* compiled from: JavaTypeAttributes.kt */
/* loaded from: classes5.dex */
public final class a extends z {

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private final s1 f24780d;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private final c f24781e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f24782f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f24783g;

    /* renamed from: h, reason: collision with root package name */
    @d5.e
    private final Set<f1> f24784h;

    /* renamed from: i, reason: collision with root package name */
    @d5.e
    private final p0 f24785i;

    public /* synthetic */ a(s1 s1Var, c cVar, boolean z5, boolean z6, Set set, p0 p0Var, int i5, w wVar) {
        this(s1Var, (i5 & 2) != 0 ? c.INFLEXIBLE : cVar, (i5 & 4) != 0 ? false : z5, (i5 & 8) != 0 ? false : z6, (i5 & 16) != 0 ? null : set, (i5 & 32) != 0 ? null : p0Var);
    }

    public static a f(a aVar, s1 s1Var, c cVar, boolean z5, boolean z6, Set set, p0 p0Var, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            s1Var = aVar.f24780d;
        }
        if ((i5 & 2) != 0) {
            cVar = aVar.f24781e;
        }
        c cVar2 = cVar;
        if ((i5 & 4) != 0) {
            z5 = aVar.f24782f;
        }
        boolean z7 = z5;
        if ((i5 & 8) != 0) {
            z6 = aVar.f24783g;
        }
        boolean z8 = z6;
        if ((i5 & 16) != 0) {
            set = aVar.f24784h;
        }
        Set set2 = set;
        if ((i5 & 32) != 0) {
            p0Var = aVar.f24785i;
        }
        return aVar.e(s1Var, cVar2, z7, z8, set2, p0Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z
    @d5.e
    public p0 a() {
        return this.f24785i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z
    @d5.d
    public s1 b() {
        return this.f24780d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z
    @d5.e
    public Set<f1> c() {
        return this.f24784h;
    }

    @d5.d
    public final a e(@d5.d s1 s1Var, @d5.d c cVar, boolean z5, boolean z6, @d5.e Set<? extends f1> set, @d5.e p0 p0Var) {
        l0.p(s1Var, ProtectedSandApp.s("䩽"));
        l0.p(cVar, ProtectedSandApp.s("䩾"));
        return new a(s1Var, cVar, z5, z6, set, p0Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z
    public boolean equals(@d5.e Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l0.g(aVar.f24785i, this.f24785i) && aVar.f24780d == this.f24780d && aVar.f24781e == this.f24781e && aVar.f24782f == this.f24782f && aVar.f24783g == this.f24783g;
    }

    @d5.d
    public final c g() {
        return this.f24781e;
    }

    public final boolean h() {
        return this.f24783g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z
    public int hashCode() {
        p0 p0Var = this.f24785i;
        int hashCode = p0Var != null ? p0Var.hashCode() : 0;
        int hashCode2 = this.f24780d.hashCode() + (hashCode * 31) + hashCode;
        int hashCode3 = this.f24781e.hashCode() + (hashCode2 * 31) + hashCode2;
        int i5 = (hashCode3 * 31) + (this.f24782f ? 1 : 0) + hashCode3;
        return (i5 * 31) + (this.f24783g ? 1 : 0) + i5;
    }

    public final boolean i() {
        return this.f24782f;
    }

    @d5.d
    public final a j(boolean z5) {
        return f(this, null, null, z5, false, null, null, 59, null);
    }

    @d5.d
    public a k(@d5.e p0 p0Var) {
        return f(this, null, null, false, false, null, p0Var, 31, null);
    }

    @d5.d
    public final a l(@d5.d c cVar) {
        l0.p(cVar, ProtectedSandApp.s("䩿"));
        return f(this, null, cVar, false, false, null, null, 61, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z
    @d5.d
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public a d(@d5.d f1 f1Var) {
        l0.p(f1Var, ProtectedSandApp.s("䪀"));
        Set<f1> set = this.f24784h;
        return f(this, null, null, false, false, set != null ? r1.D(set, f1Var) : p1.f(f1Var), null, 47, null);
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("䪁") + this.f24780d + ProtectedSandApp.s("䪂") + this.f24781e + ProtectedSandApp.s("䪃") + this.f24782f + ProtectedSandApp.s("䪄") + this.f24783g + ProtectedSandApp.s("䪅") + this.f24784h + ProtectedSandApp.s("䪆") + this.f24785i + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(@d5.d s1 s1Var, @d5.d c cVar, boolean z5, boolean z6, @d5.e Set<? extends f1> set, @d5.e p0 p0Var) {
        super(s1Var, set, p0Var);
        l0.p(s1Var, ProtectedSandApp.s("䩻"));
        l0.p(cVar, ProtectedSandApp.s("䩼"));
        this.f24780d = s1Var;
        this.f24781e = cVar;
        this.f24782f = z5;
        this.f24783g = z6;
        this.f24784h = set;
        this.f24785i = p0Var;
    }
}
