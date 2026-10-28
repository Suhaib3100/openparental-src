package kotlin.reflect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.c1;
import kotlin.jvm.internal.l0;
import kotlin.w0;

/* compiled from: KTypeProjection.kt */
@c1(version = "1.1")
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u000bB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u000e¨\u0006\u001d"}, d2 = {"Lkotlin/reflect/u;", "", "Lkotlin/reflect/v;", "variance", "Lkotlin/reflect/s;", "type", "<init>", "(Lkotlin/reflect/v;Lkotlin/reflect/s;)V", "", "toString", "()Ljava/lang/String;", "a", "()Lkotlin/reflect/v;", "b", "()Lkotlin/reflect/s;", "d", "(Lkotlin/reflect/v;Lkotlin/reflect/s;)Lkotlin/reflect/u;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/reflect/v;", "h", "Lkotlin/reflect/s;", "g", "c", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class u {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final u f78866d = new u(null, null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final v variance;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final s type;

    /* compiled from: KTypeProjection.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u0012\u0004\b\r\u0010\u0003R\u0011\u0010\u0010\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lkotlin/reflect/u$a;", "", "<init>", "()V", "Lkotlin/reflect/s;", "type", "Lkotlin/reflect/u;", "e", "(Lkotlin/reflect/s;)Lkotlin/reflect/u;", "a", "b", "star", "Lkotlin/reflect/u;", "d", "c", "()Lkotlin/reflect/u;", "STAR", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.reflect.u$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @w0
        public static /* synthetic */ void d() {
        }

        @fg.l
        @kd.n
        public final u a(@fg.l s type) {
            l0.p(type, ProtectedSandApp.s("芹\u0001"));
            return new u(v.IN, type);
        }

        @fg.l
        @kd.n
        public final u b(@fg.l s type) {
            l0.p(type, ProtectedSandApp.s("芹\u0001"));
            return new u(v.OUT, type);
        }

        @fg.l
        public final u c() {
            return u.f78866d;
        }

        @fg.l
        @kd.n
        public final u e(@fg.l s type) {
            l0.p(type, ProtectedSandApp.s("芹\u0001"));
            return new u(v.INVARIANT, type);
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: KTypeProjection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78869a;

        static {
            int[] iArr = new int[v.values().length];
            try {
                iArr[v.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f78869a = iArr;
        }
    }

    public u(@fg.m v vVar, @fg.m s sVar) {
        String str;
        this.variance = vVar;
        this.type = sVar;
        if ((vVar == null) == (sVar == null)) {
            return;
        }
        if (vVar == null) {
            str = ProtectedSandApp.s("芺\u0001");
        } else {
            str = ProtectedSandApp.s("芻\u0001") + vVar + ProtectedSandApp.s("芼\u0001");
        }
        throw new IllegalArgumentException(str.toString());
    }

    @fg.l
    @kd.n
    public static final u c(@fg.l s sVar) {
        return INSTANCE.a(sVar);
    }

    public static u e(u uVar, v vVar, s sVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            vVar = uVar.variance;
        }
        if ((i4 & 2) != 0) {
            sVar = uVar.type;
        }
        uVar.getClass();
        return new u(vVar, sVar);
    }

    @fg.l
    @kd.n
    public static final u f(@fg.l s sVar) {
        return INSTANCE.b(sVar);
    }

    @fg.l
    @kd.n
    public static final u i(@fg.l s sVar) {
        return INSTANCE.e(sVar);
    }

    @fg.m
    /* renamed from: a, reason: from getter */
    public final v getVariance() {
        return this.variance;
    }

    @fg.m
    /* renamed from: b, reason: from getter */
    public final s getType() {
        return this.type;
    }

    @fg.l
    public final u d(@fg.m v variance, @fg.m s type) {
        return new u(variance, type);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof u)) {
            return false;
        }
        u uVar = (u) other;
        return this.variance == uVar.variance && l0.g(this.type, uVar.type);
    }

    @fg.m
    public final s g() {
        return this.type;
    }

    @fg.m
    public final v h() {
        return this.variance;
    }

    public int hashCode() {
        v vVar = this.variance;
        int hashCode = (vVar == null ? 0 : vVar.hashCode()) * 31;
        s sVar = this.type;
        return hashCode + (sVar != null ? sVar.hashCode() : 0);
    }

    @fg.l
    public String toString() {
        v vVar = this.variance;
        int i4 = vVar == null ? -1 : b.f78869a[vVar.ordinal()];
        if (i4 == -1) {
            return ProtectedSandApp.s("芿\u0001");
        }
        if (i4 == 1) {
            return String.valueOf(this.type);
        }
        if (i4 == 2) {
            return ProtectedSandApp.s("芾\u0001") + this.type;
        }
        if (i4 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return ProtectedSandApp.s("芽\u0001") + this.type;
    }
}
