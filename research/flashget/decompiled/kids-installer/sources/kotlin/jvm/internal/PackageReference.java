package kotlin.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;

/* compiled from: PackageReference.kt */
@SinceKotlin(version = "1.1")
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lkotlin/jvm/internal/PackageReference;", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "jClass", "Ljava/lang/Class;", "moduleName", "", "(Ljava/lang/Class;Ljava/lang/String;)V", "getJClass", "()Ljava/lang/Class;", "members", "", "Lkotlin/reflect/KCallable;", "getMembers", "()Ljava/util/Collection;", "equals", "", "other", "", "hashCode", "", "toString", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.jvm.internal.b1, reason: from Kotlin metadata */
/* loaded from: classes6.dex */
public final class PackageReference implements ClassBasedDeclarationContainer {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final Class<?> f23536o;

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    private final String f23537p;

    public PackageReference(@d5.d Class<?> cls, @d5.d String str) {
        l0.p(cls, ProtectedSandApp.s("绦"));
        l0.p(str, ProtectedSandApp.s("继"));
        this.f23536o = cls;
        this.f23537p = str;
    }

    @Override // kotlin.reflect.KDeclarationContainer
    @d5.d
    public Collection<KCallable<?>> A() {
        throw new p3.r();
    }

    public boolean equals(@d5.e Object other) {
        return (other instanceof PackageReference) && l0.g(this.f23536o, ((PackageReference) other).f23536o);
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    @d5.d
    public Class<?> f() {
        return this.f23536o;
    }

    public int hashCode() {
        return this.f23536o.hashCode();
    }

    @d5.d
    public String toString() {
        return this.f23536o.toString() + ProtectedSandApp.s("绨");
    }
}
