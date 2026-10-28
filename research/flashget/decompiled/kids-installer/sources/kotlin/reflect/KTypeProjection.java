package kotlin.reflect;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.l0;

/* compiled from: KTypeProjection.kt */
@SinceKotlin(version = "1.1")
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lkotlin/reflect/KTypeProjection;", "", "variance", "Lkotlin/reflect/KVariance;", "type", "Lkotlin/reflect/KType;", "(Lkotlin/reflect/KVariance;Lkotlin/reflect/KType;)V", "getType", "()Lkotlin/reflect/KType;", "getVariance", "()Lkotlin/reflect/KVariance;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.reflect.u, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final /* data */ class KTypeProjection {

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    public static final a f26861c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final KTypeProjection f26862d = new KTypeProjection(null, null);

    /* renamed from: a, reason: collision with root package name */
    @d5.e
    private final KVariance f26863a;

    /* renamed from: b, reason: collision with root package name */
    @d5.e
    private final KType f26864b;

    /* compiled from: KTypeProjection.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0002¨\u0006\u000e"}, d2 = {"Lkotlin/reflect/KTypeProjection$Companion;", "", "()V", "STAR", "Lkotlin/reflect/KTypeProjection;", "getSTAR", "()Lkotlin/reflect/KTypeProjection;", "star", "getStar$annotations", "contravariant", "type", "Lkotlin/reflect/KType;", "covariant", "invariant", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.reflect.u$a */
    public static final class a {
        private a() {
        }

        @PublishedApi
        public static /* synthetic */ void d() {
        }

        @d5.d
        @p3.n
        public final KTypeProjection a(@d5.d KType kType) {
            l0.p(kType, ProtectedSandApp.s("姵"));
            return new KTypeProjection(KVariance.IN, kType);
        }

        @d5.d
        @p3.n
        public final KTypeProjection b(@d5.d KType kType) {
            l0.p(kType, ProtectedSandApp.s("姶"));
            return new KTypeProjection(KVariance.OUT, kType);
        }

        @d5.d
        public final KTypeProjection c() {
            return KTypeProjection.f26862d;
        }

        @d5.d
        @p3.n
        public final KTypeProjection e(@d5.d KType kType) {
            l0.p(kType, ProtectedSandApp.s("姷"));
            return new KTypeProjection(KVariance.INVARIANT, kType);
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: KTypeProjection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.reflect.u$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26865a;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f26865a = iArr;
        }
    }

    public KTypeProjection(@d5.e KVariance kVariance, @d5.e KType kType) {
        String str;
        this.f26863a = kVariance;
        this.f26864b = kType;
        if ((kVariance == null) == (kType == null)) {
            return;
        }
        if (kVariance == null) {
            str = ProtectedSandApp.s("姸");
        } else {
            str = ProtectedSandApp.s("姹") + kVariance + ProtectedSandApp.s("姺");
        }
        throw new IllegalArgumentException(str.toString());
    }

    @d5.d
    @p3.n
    public static final KTypeProjection c(@d5.d KType kType) {
        return f26861c.a(kType);
    }

    public static KTypeProjection e(KTypeProjection kTypeProjection, KVariance kVariance, KType kType, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            kVariance = kTypeProjection.f26863a;
        }
        if ((i5 & 2) != 0) {
            kType = kTypeProjection.f26864b;
        }
        kTypeProjection.getClass();
        return new KTypeProjection(kVariance, kType);
    }

    @d5.d
    @p3.n
    public static final KTypeProjection f(@d5.d KType kType) {
        return f26861c.b(kType);
    }

    @d5.d
    @p3.n
    public static final KTypeProjection i(@d5.d KType kType) {
        return f26861c.e(kType);
    }

    @d5.e
    /* renamed from: a, reason: from getter */
    public final KVariance getF26863a() {
        return this.f26863a;
    }

    @d5.e
    /* renamed from: b, reason: from getter */
    public final KType getF26864b() {
        return this.f26864b;
    }

    @d5.d
    public final KTypeProjection d(@d5.e KVariance kVariance, @d5.e KType kType) {
        return new KTypeProjection(kVariance, kType);
    }

    public boolean equals(@d5.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KTypeProjection)) {
            return false;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) other;
        return this.f26863a == kTypeProjection.f26863a && l0.g(this.f26864b, kTypeProjection.f26864b);
    }

    @d5.e
    public final KType g() {
        return this.f26864b;
    }

    @d5.e
    public final KVariance h() {
        return this.f26863a;
    }

    public int hashCode() {
        KVariance kVariance = this.f26863a;
        int hashCode = (kVariance == null ? 0 : kVariance.hashCode()) * 31;
        KType kType = this.f26864b;
        return hashCode + (kType != null ? kType.hashCode() : 0);
    }

    @d5.d
    public String toString() {
        KVariance kVariance = this.f26863a;
        int i5 = kVariance == null ? -1 : b.f26865a[kVariance.ordinal()];
        if (i5 == -1) {
            return ProtectedSandApp.s("姽");
        }
        if (i5 == 1) {
            return String.valueOf(this.f26864b);
        }
        if (i5 == 2) {
            return ProtectedSandApp.s("姼") + this.f26864b;
        }
        if (i5 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return ProtectedSandApp.s("姻") + this.f26864b;
    }
}
