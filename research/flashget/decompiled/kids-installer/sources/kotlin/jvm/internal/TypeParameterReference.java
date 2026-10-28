package kotlin.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVariance;

/* compiled from: TypeParameterReference.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0014\u0010\u001c\u001a\u00020\u001d2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\b\u0010\u001e\u001a\u00020\u0005H\u0016R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006 "}, d2 = {"Lkotlin/jvm/internal/TypeParameterReference;", "Lkotlin/reflect/KTypeParameter;", "container", "", "name", "", "variance", "Lkotlin/reflect/KVariance;", "isReified", "", "(Ljava/lang/Object;Ljava/lang/String;Lkotlin/reflect/KVariance;Z)V", "bounds", "", "Lkotlin/reflect/KType;", "()Z", "getName", "()Ljava/lang/String;", "upperBounds", "getUpperBounds$annotations", "()V", "getUpperBounds", "()Ljava/util/List;", "getVariance", "()Lkotlin/reflect/KVariance;", "equals", "other", "hashCode", "", "setUpperBounds", "", "toString", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SinceKotlin(version = "1.4")
@SourceDebugExtension({"SMAP\nTypeParameterReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeParameterReference.kt\nkotlin/jvm/internal/TypeParameterReference\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
/* renamed from: kotlin.jvm.internal.v1, reason: from Kotlin metadata */
/* loaded from: classes6.dex */
public final class TypeParameterReference implements KTypeParameter {

    /* renamed from: t, reason: collision with root package name */
    @d5.d
    public static final a f23632t = new a(null);

    /* renamed from: o, reason: collision with root package name */
    @d5.e
    private final Object f23633o;

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    private final String f23634p;

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    private final KVariance f23635q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f23636r;

    /* renamed from: s, reason: collision with root package name */
    @d5.e
    private volatile List<? extends KType> f23637s;

    /* compiled from: TypeParameterReference.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/jvm/internal/TypeParameterReference$Companion;", "", "()V", "toString", "", "typeParameter", "Lkotlin/reflect/KTypeParameter;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.jvm.internal.v1$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* compiled from: TypeParameterReference.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.jvm.internal.v1$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0259a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f23638a;

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
                f23638a = iArr;
            }
        }

        private a() {
        }

        @d5.d
        public final String a(@d5.d KTypeParameter kTypeParameter) {
            l0.p(kTypeParameter, ProtectedSandApp.s("䆋"));
            StringBuilder sb = new StringBuilder();
            int i5 = C0259a.f23638a[kTypeParameter.getF23635q().ordinal()];
            if (i5 == 2) {
                sb.append(ProtectedSandApp.s("䆍"));
            } else if (i5 == 3) {
                sb.append(ProtectedSandApp.s("䆌"));
            }
            sb.append(kTypeParameter.getF23634p());
            String sb2 = sb.toString();
            l0.o(sb2, ProtectedSandApp.s("䆎"));
            return sb2;
        }

        public a(w wVar) {
        }
    }

    public TypeParameterReference(@d5.e Object obj, @d5.d String str, @d5.d KVariance kVariance, boolean z5) {
        l0.p(str, ProtectedSandApp.s("缺"));
        l0.p(kVariance, ProtectedSandApp.s("缻"));
        this.f23633o = obj;
        this.f23634p = str;
        this.f23635q = kVariance;
        this.f23636r = z5;
    }

    public static /* synthetic */ void b() {
    }

    public final void e(@d5.d List<? extends KType> list) {
        l0.p(list, ProtectedSandApp.s("缼"));
        if (this.f23637s == null) {
            this.f23637s = list;
            return;
        }
        throw new IllegalStateException((ProtectedSandApp.s("缽") + this + ProtectedSandApp.s("缾")).toString());
    }

    public boolean equals(@d5.e Object other) {
        if (other instanceof TypeParameterReference) {
            TypeParameterReference typeParameterReference = (TypeParameterReference) other;
            if (l0.g(this.f23633o, typeParameterReference.f23633o) && l0.g(this.f23634p, typeParameterReference.f23634p)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.KTypeParameter
    @d5.d
    /* renamed from: getName, reason: from getter */
    public String getF23634p() {
        return this.f23634p;
    }

    @Override // kotlin.reflect.KTypeParameter
    @d5.d
    public List<KType> getUpperBounds() {
        List<KType> k5;
        List list = this.f23637s;
        if (list != null) {
            return list;
        }
        k5 = kotlin.collections.z.k(l1.n(Object.class));
        this.f23637s = k5;
        return k5;
    }

    public int hashCode() {
        Object obj = this.f23633o;
        return this.f23634p.hashCode() + ((obj != null ? obj.hashCode() : 0) * 31);
    }

    @d5.d
    public String toString() {
        return f23632t.a(this);
    }

    @Override // kotlin.reflect.KTypeParameter
    /* renamed from: v, reason: from getter */
    public boolean getF23636r() {
        return this.f23636r;
    }

    @Override // kotlin.reflect.KTypeParameter
    @d5.d
    /* renamed from: z, reason: from getter */
    public KVariance getF23635q() {
        return this.f23635q;
    }
}
