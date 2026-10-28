package kotlin.reflect;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.l0;

/* compiled from: TypesJVM.kt */
@ExperimentalStdlibApi
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\u0010\tJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0016¢\u0006\u0002\u0010\u0011J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u0019"}, d2 = {"Lkotlin/reflect/ParameterizedTypeImpl;", "Ljava/lang/reflect/ParameterizedType;", "Lkotlin/reflect/TypeImpl;", "rawType", "Ljava/lang/Class;", "ownerType", "Ljava/lang/reflect/Type;", "typeArguments", "", "(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/List;)V", "", "[Ljava/lang/reflect/Type;", "equals", "", "other", "", "getActualTypeArguments", "()[Ljava/lang/reflect/Type;", "getOwnerType", "getRawType", "getTypeName", "", "hashCode", "", "toString", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/ParameterizedTypeImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,230:1\n37#2,2:231\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/ParameterizedTypeImpl\n*L\n190#1:231,2\n*E\n"})
/* renamed from: kotlin.reflect.x, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
final class ParameterizedTypeImpl implements ParameterizedType, TypeImpl {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final Class<?> f26866o;

    /* renamed from: p, reason: collision with root package name */
    @d5.e
    private final Type f26867p;

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    private final Type[] f26868q;

    /* compiled from: TypesJVM.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.reflect.x$a */
    /* loaded from: classes6.dex */
    /* synthetic */ class a extends h0 implements q3.l<Type, String> {

        /* renamed from: x, reason: collision with root package name */
        public static final a f26869x = new a();

        a() {
            super(1, b0.class, ProtectedSandApp.s("誶"), ProtectedSandApp.s("誷"), 1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: A0, reason: merged with bridge method [inline-methods] */
        public final String N(@d5.d Type type) {
            String j5;
            l0.p(type, ProtectedSandApp.s("誸"));
            j5 = b0.j(type);
            return j5;
        }
    }

    public ParameterizedTypeImpl(@d5.d Class<?> cls, @d5.e Type type, @d5.d List<? extends Type> list) {
        l0.p(cls, ProtectedSandApp.s("娅"));
        l0.p(list, ProtectedSandApp.s("娆"));
        this.f26866o = cls;
        this.f26867p = type;
        this.f26868q = (Type[]) list.toArray(new Type[0]);
    }

    public boolean equals(@d5.e Object other) {
        if (other instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) other;
            if (l0.g(this.f26866o, parameterizedType.getRawType()) && l0.g(this.f26867p, parameterizedType.getOwnerType()) && Arrays.equals(this.f26868q, parameterizedType.getActualTypeArguments())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    @d5.d
    public Type[] getActualTypeArguments() {
        return this.f26868q;
    }

    @Override // java.lang.reflect.ParameterizedType
    @d5.e
    public Type getOwnerType() {
        return this.f26867p;
    }

    @Override // java.lang.reflect.ParameterizedType
    @d5.d
    public Type getRawType() {
        return this.f26866o;
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.TypeImpl
    @d5.d
    public String getTypeName() {
        String j5;
        String j6;
        StringBuilder sb = new StringBuilder();
        Type type = this.f26867p;
        if (type != null) {
            j6 = b0.j(type);
            sb.append(j6);
            sb.append(ProtectedSandApp.s("娇"));
            sb.append(this.f26866o.getSimpleName());
        } else {
            j5 = b0.j(this.f26866o);
            sb.append(j5);
        }
        Type[] typeArr = this.f26868q;
        if (!(typeArr.length == 0)) {
            kotlin.collections.l.Tg(typeArr, sb, null, ProtectedSandApp.s("娈"), ProtectedSandApp.s("娉"), 0, null, a.f26869x, 50, null);
        }
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("娊"));
        return sb2;
    }

    public int hashCode() {
        int hashCode = this.f26866o.hashCode();
        Type type = this.f26867p;
        return (hashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(this.f26868q);
    }

    @d5.d
    public String toString() {
        return getTypeName();
    }
}
