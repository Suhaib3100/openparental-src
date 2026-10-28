package kotlin.reflect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: TypesJVM.kt */
@kotlin.r
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0003\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001cB\u001b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001d"}, d2 = {"Lkotlin/reflect/c0;", "Ljava/lang/reflect/WildcardType;", "Lkotlin/reflect/y;", "Ljava/lang/reflect/Type;", "upperBound", "lowerBound", "<init>", "(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V", "", "getUpperBounds", "()[Ljava/lang/reflect/Type;", "getLowerBounds", "", "getTypeName", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "b", "Ljava/lang/reflect/Type;", "c", "d", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/WildcardTypeImpl\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,230:1\n26#2:231\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/WildcardTypeImpl\n*L\n163#1:231\n*E\n"})
/* loaded from: classes7.dex */
final class c0 implements WildcardType, y {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final c0 f75519e = new c0(null, null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Type upperBound;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Type lowerBound;

    /* compiled from: TypesJVM.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/reflect/c0$a;", "", "<init>", "()V", "Lkotlin/reflect/c0;", "STAR", "Lkotlin/reflect/c0;", "a", "()Lkotlin/reflect/c0;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.reflect.c0$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final c0 a() {
            return c0.f75519e;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public c0(@fg.m Type type, @fg.m Type type2) {
        this.upperBound = type;
        this.lowerBound = type2;
    }

    public boolean equals(@fg.m Object other) {
        if (other instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) other;
            if (Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    @fg.l
    public Type[] getLowerBounds() {
        Type type = this.lowerBound;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.y
    @fg.l
    public String getTypeName() {
        String j4;
        String j5;
        if (this.lowerBound != null) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("明\u0001"));
            j5 = b0.j(this.lowerBound);
            sb.append(j5);
            return sb.toString();
        }
        Type type = this.upperBound;
        if (type == null || l0.g(type, Object.class)) {
            return ProtectedSandApp.s("昐\u0001");
        }
        StringBuilder sb2 = new StringBuilder(ProtectedSandApp.s("昏\u0001"));
        j4 = b0.j(this.upperBound);
        sb2.append(j4);
        return sb2.toString();
    }

    @Override // java.lang.reflect.WildcardType
    @fg.l
    public Type[] getUpperBounds() {
        Type type = this.upperBound;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    @fg.l
    public String toString() {
        return getTypeName();
    }
}
