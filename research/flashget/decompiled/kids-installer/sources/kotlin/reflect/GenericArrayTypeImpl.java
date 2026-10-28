package kotlin.reflect;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: TypesJVM.kt */
@ExperimentalStdlibApi
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lkotlin/reflect/GenericArrayTypeImpl;", "Ljava/lang/reflect/GenericArrayType;", "Lkotlin/reflect/TypeImpl;", "elementType", "Ljava/lang/reflect/Type;", "(Ljava/lang/reflect/Type;)V", "equals", "", "other", "", "getGenericComponentType", "getTypeName", "", "hashCode", "", "toString", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.reflect.a, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
final class GenericArrayTypeImpl implements GenericArrayType, TypeImpl {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final Type f23765o;

    public GenericArrayTypeImpl(@d5.d Type type) {
        l0.p(type, ProtectedSandApp.s("䋋"));
        this.f23765o = type;
    }

    public boolean equals(@d5.e Object other) {
        return (other instanceof GenericArrayType) && l0.g(this.f23765o, ((GenericArrayType) other).getGenericComponentType());
    }

    @Override // java.lang.reflect.GenericArrayType
    @d5.d
    public Type getGenericComponentType() {
        return this.f23765o;
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.TypeImpl
    @d5.d
    public String getTypeName() {
        String j5;
        StringBuilder sb = new StringBuilder();
        j5 = b0.j(this.f23765o);
        sb.append(j5);
        sb.append(ProtectedSandApp.s("䋌"));
        return sb.toString();
    }

    public int hashCode() {
        return this.f23765o.hashCode();
    }

    @d5.d
    public String toString() {
        return getTypeName();
    }
}
