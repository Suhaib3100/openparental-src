package kotlin.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.SinceKotlin;
import kotlin.collections.EmptyList;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;

/* compiled from: TypeReference.kt */
@SinceKotlin(version = "1.4")
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B%\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0010\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\bH\u0002J\u0013\u0010$\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010&H\u0096\u0002J\b\u0010'\u001a\u00020\fH\u0016J\b\u0010(\u001a\u00020\u001eH\u0016J\f\u0010\"\u001a\u00020\u001e*\u00020\u0006H\u0002R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u000b\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0019R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u00020\u001e*\u0006\u0012\u0002\b\u00030\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006*"}, d2 = {"Lkotlin/jvm/internal/TypeReference;", "Lkotlin/reflect/KType;", "classifier", "Lkotlin/reflect/KClassifier;", "arguments", "", "Lkotlin/reflect/KTypeProjection;", "isMarkedNullable", "", "(Lkotlin/reflect/KClassifier;Ljava/util/List;Z)V", "platformTypeUpperBound", "flags", "", "(Lkotlin/reflect/KClassifier;Ljava/util/List;Lkotlin/reflect/KType;I)V", "annotations", "", "getAnnotations", "()Ljava/util/List;", "getArguments", "getClassifier", "()Lkotlin/reflect/KClassifier;", "getFlags$kotlin_stdlib$annotations", "()V", "getFlags$kotlin_stdlib", "()I", "()Z", "getPlatformTypeUpperBound$kotlin_stdlib$annotations", "getPlatformTypeUpperBound$kotlin_stdlib", "()Lkotlin/reflect/KType;", "arrayClassName", "", "Ljava/lang/Class;", "getArrayClassName", "(Ljava/lang/Class;)Ljava/lang/String;", "asString", "convertPrimitiveToWrapper", "equals", "other", "", "hashCode", "toString", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.jvm.internal.w1, reason: from Kotlin metadata */
/* loaded from: classes6.dex */
public final class TypeReference implements KType {

    /* renamed from: s, reason: collision with root package name */
    @d5.d
    public static final a f23639s = new a(null);

    /* renamed from: t, reason: collision with root package name */
    public static final int f23640t = 1;

    /* renamed from: u, reason: collision with root package name */
    public static final int f23641u = 2;

    /* renamed from: v, reason: collision with root package name */
    public static final int f23642v = 4;

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final KClassifier f23643o;

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    private final List<KTypeProjection> f23644p;

    /* renamed from: q, reason: collision with root package name */
    @d5.e
    private final KType f23645q;

    /* renamed from: r, reason: collision with root package name */
    private final int f23646r;

    /* compiled from: TypeReference.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lkotlin/jvm/internal/TypeReference$Companion;", "", "()V", "IS_MARKED_NULLABLE", "", "IS_MUTABLE_COLLECTION_TYPE", "IS_NOTHING_TYPE", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.jvm.internal.w1$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public a(w wVar) {
        }
    }

    /* compiled from: TypeReference.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.jvm.internal.w1$b */
    /* loaded from: classes5.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23647a;

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
            f23647a = iArr;
        }
    }

    /* compiled from: TypeReference.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lkotlin/reflect/KTypeProjection;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.jvm.internal.w1$c */
    static final class c extends Lambda implements q3.l<KTypeProjection, CharSequence> {
        c() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence N(@d5.d KTypeProjection kTypeProjection) {
            l0.p(kTypeProjection, ProtectedSandApp.s("缿"));
            return TypeReference.this.n(kTypeProjection);
        }
    }

    @SinceKotlin(version = "1.6")
    public TypeReference(@d5.d KClassifier kClassifier, @d5.d List<KTypeProjection> list, @d5.e KType kType, int i5) {
        l0.p(kClassifier, ProtectedSandApp.s("罀"));
        l0.p(list, ProtectedSandApp.s("罁"));
        this.f23643o = kClassifier;
        this.f23644p = list;
        this.f23645q = kType;
        this.f23646r = i5;
    }

    @SinceKotlin(version = "1.6")
    public static /* synthetic */ void G() {
    }

    @SinceKotlin(version = "1.6")
    public static /* synthetic */ void N() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String n(KTypeProjection kTypeProjection) {
        String valueOf;
        if (kTypeProjection.h() == null) {
            return ProtectedSandApp.s("罄");
        }
        KType g5 = kTypeProjection.g();
        TypeReference typeReference = g5 instanceof TypeReference ? (TypeReference) g5 : null;
        if (typeReference == null || (valueOf = typeReference.v(true)) == null) {
            valueOf = String.valueOf(kTypeProjection.g());
        }
        int i5 = b.f23647a[kTypeProjection.h().ordinal()];
        if (i5 == 1) {
            return valueOf;
        }
        if (i5 == 2) {
            return ProtectedSandApp.s("罆").concat(valueOf);
        }
        if (i5 == 3) {
            return ProtectedSandApp.s("罅").concat(valueOf);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String v(boolean z5) {
        String name;
        KClassifier kClassifier = this.f23643o;
        KClass kClass = kClassifier instanceof KClass ? (KClass) kClassifier : null;
        Class<?> e6 = kClass != null ? p3.b.e(kClass) : null;
        if (e6 == null) {
            name = this.f23643o.toString();
        } else if ((this.f23646r & 4) != 0) {
            name = ProtectedSandApp.s("罇");
        } else if (e6.isArray()) {
            name = z(e6);
        } else if (z5 && e6.isPrimitive()) {
            KClassifier kClassifier2 = this.f23643o;
            l0.n(kClassifier2, ProtectedSandApp.s("罈"));
            name = p3.b.g((KClass) kClassifier2).getName();
        } else {
            name = e6.getName();
        }
        String str = name + (this.f23644p.isEmpty() ? "" : kotlin.collections.j0.m3(this.f23644p, ProtectedSandApp.s("罉"), ProtectedSandApp.s("罊"), ProtectedSandApp.s("罋"), 0, null, new c(), 24, null)) + (L() ? ProtectedSandApp.s("罌") : "");
        KType kType = this.f23645q;
        if (!(kType instanceof TypeReference)) {
            return str;
        }
        String v5 = ((TypeReference) kType).v(true);
        if (l0.g(v5, str)) {
            return str;
        }
        if (l0.g(v5, str + '?')) {
            return str + '!';
        }
        return ProtectedSandApp.s("罍") + str + ProtectedSandApp.s("罎") + v5 + ')';
    }

    private final String z(Class<?> cls) {
        return l0.g(cls, boolean[].class) ? ProtectedSandApp.s("罏") : l0.g(cls, char[].class) ? ProtectedSandApp.s("罐") : l0.g(cls, byte[].class) ? ProtectedSandApp.s("网") : l0.g(cls, short[].class) ? ProtectedSandApp.s("罒") : l0.g(cls, int[].class) ? ProtectedSandApp.s("罓") : l0.g(cls, float[].class) ? ProtectedSandApp.s("罔") : l0.g(cls, long[].class) ? ProtectedSandApp.s("罕") : l0.g(cls, double[].class) ? ProtectedSandApp.s("罖") : ProtectedSandApp.s("罗");
    }

    /* renamed from: F, reason: from getter */
    public final int getF23646r() {
        return this.f23646r;
    }

    @Override // kotlin.reflect.KType
    public boolean L() {
        return (this.f23646r & 1) != 0;
    }

    @d5.e
    /* renamed from: M, reason: from getter */
    public final KType getF23645q() {
        return this.f23645q;
    }

    public boolean equals(@d5.e Object other) {
        if (other instanceof TypeReference) {
            TypeReference typeReference = (TypeReference) other;
            if (l0.g(this.f23643o, typeReference.f23643o) && l0.g(this.f23644p, typeReference.f23644p) && l0.g(this.f23645q, typeReference.f23645q) && this.f23646r == typeReference.f23646r) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.KType
    @d5.d
    public List<KTypeProjection> g() {
        return this.f23644p;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    @d5.d
    public List<Annotation> getAnnotations() {
        return EmptyList.f23167o;
    }

    public int hashCode() {
        return Integer.hashCode(this.f23646r) + ((this.f23644p.hashCode() + (this.f23643o.hashCode() * 31)) * 31);
    }

    @Override // kotlin.reflect.KType
    @d5.d
    /* renamed from: k, reason: from getter */
    public KClassifier getF23643o() {
        return this.f23643o;
    }

    @d5.d
    public String toString() {
        return androidx.concurrent.futures.a.a(new StringBuilder(), v(false), ProtectedSandApp.s("罘"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TypeReference(@d5.d KClassifier kClassifier, @d5.d List<KTypeProjection> list, boolean z5) {
        this(kClassifier, list, null, z5 ? 1 : 0);
        l0.p(kClassifier, ProtectedSandApp.s("罂"));
        l0.p(list, ProtectedSandApp.s("罃"));
    }
}
