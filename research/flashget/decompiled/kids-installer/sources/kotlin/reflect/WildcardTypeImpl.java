package kotlin.reflect;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;

/* compiled from: TypesJVM.kt */
@ExperimentalStdlibApi
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0014B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0016¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0016¢\u0006\u0002\u0010\rJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lkotlin/reflect/WildcardTypeImpl;", "Ljava/lang/reflect/WildcardType;", "Lkotlin/reflect/TypeImpl;", "upperBound", "Ljava/lang/reflect/Type;", "lowerBound", "(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V", "equals", "", "other", "", "getLowerBounds", "", "()[Ljava/lang/reflect/Type;", "getTypeName", "", "getUpperBounds", "hashCode", "", "toString", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/WildcardTypeImpl\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,230:1\n26#2:231\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/WildcardTypeImpl\n*L\n163#1:231\n*E\n"})
/* renamed from: kotlin.reflect.c0, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
final class WildcardTypeImpl implements WildcardType, TypeImpl {

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    public static final a f23769q = new a(null);

    /* renamed from: r, reason: collision with root package name */
    @d5.d
    private static final WildcardTypeImpl f23770r = new WildcardTypeImpl(null, null);

    /* renamed from: o, reason: collision with root package name */
    @d5.e
    private final Type f23771o;

    /* renamed from: p, reason: collision with root package name */
    @d5.e
    private final Type f23772p;

    /* compiled from: TypesJVM.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/WildcardTypeImpl$Companion;", "", "()V", "STAR", "Lkotlin/reflect/WildcardTypeImpl;", "getSTAR", "()Lkotlin/reflect/WildcardTypeImpl;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.reflect.c0$a */
    public static final class a {
        private a() {
        }

        @d5.d
        public final WildcardTypeImpl a() {
            return WildcardTypeImpl.f23770r;
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    public WildcardTypeImpl(@d5.e Type type, @d5.e Type type2) {
        this.f23771o = type;
        this.f23772p = type2;
    }

    public boolean equals(@d5.e Object other) {
        if (other instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) other;
            if (Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    @d5.d
    public Type[] getLowerBounds() {
        Type type = this.f23772p;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.TypeImpl
    @d5.d
    public String getTypeName() {
        String j5;
        String j6;
        if (this.f23772p != null) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䋑"));
            j6 = b0.j(this.f23772p);
            sb.append(j6);
            return sb.toString();
        }
        Type type = this.f23771o;
        if (type == null || l0.g(type, Object.class)) {
            return ProtectedSandApp.s("䋓");
        }
        StringBuilder sb2 = new StringBuilder(ProtectedSandApp.s("䋒"));
        j5 = b0.j(this.f23771o);
        sb2.append(j5);
        return sb2.toString();
    }

    @Override // java.lang.reflect.WildcardType
    @d5.d
    public Type[] getUpperBounds() {
        Type[] typeArr = new Type[1];
        Type type = this.f23771o;
        if (type == null) {
            type = Object.class;
        }
        typeArr[0] = type;
        return typeArr;
    }

    public int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    @d5.d
    public String toString() {
        return getTypeName();
    }
}
