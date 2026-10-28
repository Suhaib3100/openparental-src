package kotlin.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import kotlin.Metadata;

/* compiled from: TypeParameterReference.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0019\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001+B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8VX\u0096\u0004¢\u0006\f\u0012\u0004\b+\u0010,\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Lkotlin/jvm/internal/v1;", "Lkotlin/reflect/t;", "", "container", "", "name", "Lkotlin/reflect/v;", "variance", "", "isReified", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Lkotlin/reflect/v;Z)V", "", "Lkotlin/reflect/s;", "upperBounds", "Lkotlin/k2;", "b", "(Ljava/util/List;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "c", "Ljava/lang/String;", "getName", "d", "Lkotlin/reflect/v;", "o", "()Lkotlin/reflect/v;", "e", "Z", "l", "()Z", "f", "Ljava/util/List;", "bounds", "getUpperBounds", "()Ljava/util/List;", "a", "()V", "g", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.c1(version = "1.4")
@r1({"SMAP\nTypeParameterReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeParameterReference.kt\nkotlin/jvm/internal/TypeParameterReference\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
/* loaded from: classes7.dex */
public final class v1 implements kotlin.reflect.t {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Object container;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String name;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.reflect.v variance;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isReified;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private volatile List<? extends kotlin.reflect.s> bounds;

    /* compiled from: TypeParameterReference.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/jvm/internal/v1$a;", "", "<init>", "()V", "Lkotlin/reflect/t;", "typeParameter", "", "a", "(Lkotlin/reflect/t;)Ljava/lang/String;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.jvm.internal.v1$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: TypeParameterReference.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.jvm.internal.v1$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1061a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f75387a;

            static {
                int[] iArr = new int[kotlin.reflect.v.values().length];
                try {
                    iArr[kotlin.reflect.v.INVARIANT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[kotlin.reflect.v.IN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[kotlin.reflect.v.OUT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f75387a = iArr;
            }
        }

        private Companion() {
        }

        @fg.l
        public final String a(@fg.l kotlin.reflect.t typeParameter) {
            l0.p(typeParameter, ProtectedSandApp.s("敕\u0001"));
            StringBuilder sb = new StringBuilder();
            int i4 = C1061a.f75387a[typeParameter.getVariance().ordinal()];
            if (i4 == 2) {
                sb.append(ProtectedSandApp.s("敗\u0001"));
            } else if (i4 == 3) {
                sb.append(ProtectedSandApp.s("敖\u0001"));
            }
            sb.append(typeParameter.getName());
            String sb2 = sb.toString();
            l0.o(sb2, ProtectedSandApp.s("敘\u0001"));
            return sb2;
        }

        public Companion(w wVar) {
        }
    }

    public v1(@fg.m Object obj, @fg.l String str, @fg.l kotlin.reflect.v vVar, boolean z4) {
        l0.p(str, ProtectedSandApp.s("教\u0001"));
        l0.p(vVar, ProtectedSandApp.s("敚\u0001"));
        this.container = obj;
        this.name = str;
        this.variance = vVar;
        this.isReified = z4;
    }

    public static /* synthetic */ void a() {
    }

    public final void b(@fg.l List<? extends kotlin.reflect.s> upperBounds) {
        l0.p(upperBounds, ProtectedSandApp.s("敛\u0001"));
        if (this.bounds == null) {
            this.bounds = upperBounds;
            return;
        }
        throw new IllegalStateException((ProtectedSandApp.s("敜\u0001") + this + ProtectedSandApp.s("敝\u0001")).toString());
    }

    public boolean equals(@fg.m Object other) {
        if (other instanceof v1) {
            v1 v1Var = (v1) other;
            if (l0.g(this.container, v1Var.container) && l0.g(this.name, v1Var.name)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.t
    @fg.l
    public String getName() {
        return this.name;
    }

    @Override // kotlin.reflect.t
    @fg.l
    public List<kotlin.reflect.s> getUpperBounds() {
        List list = this.bounds;
        if (list != null) {
            return list;
        }
        List<kotlin.reflect.s> k4 = kotlin.collections.w.k(l1.n(Object.class));
        this.bounds = k4;
        return k4;
    }

    public int hashCode() {
        Object obj = this.container;
        return this.name.hashCode() + ((obj != null ? obj.hashCode() : 0) * 31);
    }

    @Override // kotlin.reflect.t
    /* renamed from: l, reason: from getter */
    public boolean getIsReified() {
        return this.isReified;
    }

    @Override // kotlin.reflect.t
    @fg.l
    /* renamed from: o, reason: from getter */
    public kotlin.reflect.v getVariance() {
        return this.variance;
    }

    @fg.l
    public String toString() {
        return INSTANCE.a(this);
    }
}
