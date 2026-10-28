package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.Set;
import kotlin.collections.l1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.s1;
import kotlin.reflect.jvm.internal.impl.types.z;

/* compiled from: JavaTypeAttributes.kt */
/* loaded from: classes7.dex */
public final class a extends z {

    /* renamed from: d, reason: collision with root package name */
    @l
    private final s1 f76655d;

    /* renamed from: e, reason: collision with root package name */
    @l
    private final c f76656e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f76657f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f76658g;

    /* renamed from: h, reason: collision with root package name */
    @m
    private final Set<f1> f76659h;

    /* renamed from: i, reason: collision with root package name */
    @m
    private final p0 f76660i;

    public /* synthetic */ a(s1 s1Var, c cVar, boolean z4, boolean z5, Set set, p0 p0Var, int i4, w wVar) {
        this(s1Var, (i4 & 2) != 0 ? c.INFLEXIBLE : cVar, (i4 & 4) != 0 ? false : z4, (i4 & 8) != 0 ? false : z5, (i4 & 16) != 0 ? null : set, (i4 & 32) != 0 ? null : p0Var);
    }

    public static /* synthetic */ a f(a aVar, s1 s1Var, c cVar, boolean z4, boolean z5, Set set, p0 p0Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            s1Var = aVar.f76655d;
        }
        if ((i4 & 2) != 0) {
            cVar = aVar.f76656e;
        }
        c cVar2 = cVar;
        if ((i4 & 4) != 0) {
            z4 = aVar.f76657f;
        }
        boolean z6 = z4;
        if ((i4 & 8) != 0) {
            z5 = aVar.f76658g;
        }
        boolean z7 = z5;
        if ((i4 & 16) != 0) {
            set = aVar.f76659h;
        }
        Set set2 = set;
        if ((i4 & 32) != 0) {
            p0Var = aVar.f76660i;
        }
        return aVar.e(s1Var, cVar2, z6, z7, set2, p0Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z
    @m
    public p0 a() {
        return this.f76660i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z
    @l
    public s1 b() {
        return this.f76655d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z
    @m
    public Set<f1> c() {
        return this.f76659h;
    }

    @l
    public final a e(@l s1 s1Var, @l c cVar, boolean z4, boolean z5, @m Set<? extends f1> set, @m p0 p0Var) {
        l0.p(s1Var, ProtectedSandApp.s("爌\u0001"));
        l0.p(cVar, ProtectedSandApp.s("爍\u0001"));
        return new a(s1Var, cVar, z4, z5, set, p0Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z
    public boolean equals(@m Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l0.g(aVar.f76660i, this.f76660i) && aVar.f76655d == this.f76655d && aVar.f76656e == this.f76656e && aVar.f76657f == this.f76657f && aVar.f76658g == this.f76658g;
    }

    @l
    public final c g() {
        return this.f76656e;
    }

    public final boolean h() {
        return this.f76658g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z
    public int hashCode() {
        p0 p0Var = this.f76660i;
        int hashCode = p0Var != null ? p0Var.hashCode() : 0;
        int hashCode2 = this.f76655d.hashCode() + (hashCode * 31) + hashCode;
        int hashCode3 = this.f76656e.hashCode() + (hashCode2 * 31) + hashCode2;
        int i4 = (hashCode3 * 31) + (this.f76657f ? 1 : 0) + hashCode3;
        return (i4 * 31) + (this.f76658g ? 1 : 0) + i4;
    }

    public final boolean i() {
        return this.f76657f;
    }

    @l
    public final a j(boolean z4) {
        return f(this, null, null, z4, false, null, null, 59, null);
    }

    @l
    public a k(@m p0 p0Var) {
        return f(this, null, null, false, false, null, p0Var, 31, null);
    }

    @l
    public final a l(@l c cVar) {
        l0.p(cVar, ProtectedSandApp.s("爍\u0001"));
        return f(this, null, cVar, false, false, null, null, 61, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z
    @l
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public a d(@l f1 f1Var) {
        l0.p(f1Var, ProtectedSandApp.s("爎\u0001"));
        Set<f1> set = this.f76659h;
        return f(this, null, null, false, false, set != null ? l1.D(set, f1Var) : l1.f(f1Var), null, 47, null);
    }

    @l
    public String toString() {
        return ProtectedSandApp.s("爏\u0001") + this.f76655d + ProtectedSandApp.s("爐\u0001") + this.f76656e + ProtectedSandApp.s("爑\u0001") + this.f76657f + ProtectedSandApp.s("爒\u0001") + this.f76658g + ProtectedSandApp.s("爓\u0001") + this.f76659h + ProtectedSandApp.s("爔\u0001") + this.f76660i + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(@l s1 s1Var, @l c cVar, boolean z4, boolean z5, @m Set<? extends f1> set, @m p0 p0Var) {
        super(s1Var, set, p0Var);
        l0.p(s1Var, ProtectedSandApp.s("爌\u0001"));
        l0.p(cVar, ProtectedSandApp.s("爍\u0001"));
        this.f76655d = s1Var;
        this.f76656e = cVar;
        this.f76657f = z4;
        this.f76658g = z5;
        this.f76659h = set;
        this.f76660i = p0Var;
    }
}
