package kotlin.reflect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: TypesJVM.kt */
@kotlin.r
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u0013R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lkotlin/reflect/x;", "Ljava/lang/reflect/ParameterizedType;", "Lkotlin/reflect/y;", "Ljava/lang/Class;", "rawType", "Ljava/lang/reflect/Type;", "ownerType", "", "typeArguments", "<init>", "(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/List;)V", "getRawType", "()Ljava/lang/reflect/Type;", "getOwnerType", "", "getActualTypeArguments", "()[Ljava/lang/reflect/Type;", "", "getTypeName", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "b", "Ljava/lang/Class;", "c", "Ljava/lang/reflect/Type;", "d", "[Ljava/lang/reflect/Type;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/ParameterizedTypeImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,230:1\n37#2,2:231\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/ParameterizedTypeImpl\n*L\n190#1:231,2\n*E\n"})
/* loaded from: classes7.dex */
final class x implements ParameterizedType, y {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Class<?> rawType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Type ownerType;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Type[] typeArguments;

    /* compiled from: TypesJVM.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class a extends h0 implements ld.l<Type, String> {

        /* renamed from: d, reason: collision with root package name */
        public static final a f78873d = new a();

        a() {
            super(1, b0.class, ProtectedSandApp.s("苈\u0001"), ProtectedSandApp.s("苇\u0001"), 1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: Z, reason: merged with bridge method [inline-methods] */
        public final String invoke(@fg.l Type type) {
            String j4;
            l0.p(type, ProtectedSandApp.s("苉\u0001"));
            j4 = b0.j(type);
            return j4;
        }
    }

    public x(@fg.l Class<?> cls, @fg.m Type type, @fg.l List<? extends Type> list) {
        l0.p(cls, ProtectedSandApp.s("苊\u0001"));
        l0.p(list, ProtectedSandApp.s("苋\u0001"));
        this.rawType = cls;
        this.ownerType = type;
        this.typeArguments = (Type[]) list.toArray(new Type[0]);
    }

    public boolean equals(@fg.m Object other) {
        if (other instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) other;
            if (l0.g(this.rawType, parameterizedType.getRawType()) && l0.g(this.ownerType, parameterizedType.getOwnerType()) && Arrays.equals(this.typeArguments, parameterizedType.getActualTypeArguments())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    @fg.l
    public Type[] getActualTypeArguments() {
        return this.typeArguments;
    }

    @Override // java.lang.reflect.ParameterizedType
    @fg.m
    public Type getOwnerType() {
        return this.ownerType;
    }

    @Override // java.lang.reflect.ParameterizedType
    @fg.l
    public Type getRawType() {
        return this.rawType;
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.y
    @fg.l
    public String getTypeName() {
        String j4;
        String j5;
        StringBuilder sb = new StringBuilder();
        Type type = this.ownerType;
        if (type != null) {
            j5 = b0.j(type);
            sb.append(j5);
            sb.append(ProtectedSandApp.s("苌\u0001"));
            sb.append(this.rawType.getSimpleName());
        } else {
            j4 = b0.j(this.rawType);
            sb.append(j4);
        }
        Type[] typeArr = this.typeArguments;
        if (!(typeArr.length == 0)) {
            kotlin.collections.r.Kg(typeArr, sb, (r14 & 2) != 0 ? ProtectedSandApp.s("懤\u0001") : null, (r14 & 4) != 0 ? "" : ProtectedSandApp.s("苍\u0001"), (r14 & 8) == 0 ? ProtectedSandApp.s("苎\u0001") : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? ProtectedSandApp.s("懥\u0001") : null, (r14 & 64) != 0 ? null : a.f78873d);
        }
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("苏\u0001"));
        return sb2;
    }

    public int hashCode() {
        int hashCode = this.rawType.hashCode();
        Type type = this.ownerType;
        return (hashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(this.typeArguments);
    }

    @fg.l
    public String toString() {
        return getTypeName();
    }
}
