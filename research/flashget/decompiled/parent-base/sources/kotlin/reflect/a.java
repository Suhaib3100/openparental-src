package kotlin.reflect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: TypesJVM.kt */
@kotlin.r
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lkotlin/reflect/a;", "Ljava/lang/reflect/GenericArrayType;", "Lkotlin/reflect/y;", "Ljava/lang/reflect/Type;", "elementType", "<init>", "(Ljava/lang/reflect/Type;)V", "getGenericComponentType", "()Ljava/lang/reflect/Type;", "", "getTypeName", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "b", "Ljava/lang/reflect/Type;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class a implements GenericArrayType, y {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Type elementType;

    public a(@fg.l Type type) {
        l0.p(type, ProtectedSandApp.s("昅\u0001"));
        this.elementType = type;
    }

    public boolean equals(@fg.m Object other) {
        return (other instanceof GenericArrayType) && l0.g(this.elementType, ((GenericArrayType) other).getGenericComponentType());
    }

    @Override // java.lang.reflect.GenericArrayType
    @fg.l
    public Type getGenericComponentType() {
        return this.elementType;
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.y
    @fg.l
    public String getTypeName() {
        String j4;
        StringBuilder sb = new StringBuilder();
        j4 = b0.j(this.elementType);
        sb.append(j4);
        sb.append(ProtectedSandApp.s("昆\u0001"));
        return sb.toString();
    }

    public int hashCode() {
        return this.elementType.hashCode();
    }

    @fg.l
    public String toString() {
        return getTypeName();
    }
}
