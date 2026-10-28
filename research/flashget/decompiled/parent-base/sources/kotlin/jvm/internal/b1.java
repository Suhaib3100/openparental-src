package kotlin.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import kotlin.Metadata;

/* compiled from: PackageReference.kt */
@kotlin.c1(version = "1.1")
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001e\u0010\u001c\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00190\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lkotlin/jvm/internal/b1;", "Lkotlin/jvm/internal/t;", "Ljava/lang/Class;", "jClass", "", "moduleName", "<init>", "(Ljava/lang/Class;Ljava/lang/String;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "b", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "c", "Ljava/lang/String;", "", "Lkotlin/reflect/c;", "r", "()Ljava/util/Collection;", "members", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class b1 implements t {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Class<?> jClass;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String moduleName;

    public b1(@fg.l Class<?> cls, @fg.l String str) {
        l0.p(cls, ProtectedSandApp.s("擘\u0001"));
        l0.p(str, ProtectedSandApp.s("擙\u0001"));
        this.jClass = cls;
        this.moduleName = str;
    }

    @Override // kotlin.jvm.internal.t
    @fg.l
    public Class<?> e() {
        return this.jClass;
    }

    public boolean equals(@fg.m Object other) {
        return (other instanceof b1) && l0.g(this.jClass, ((b1) other).jClass);
    }

    public int hashCode() {
        return this.jClass.hashCode();
    }

    @Override // kotlin.reflect.h
    @fg.l
    public Collection<kotlin.reflect.c<?>> r() {
        throw new kd.r();
    }

    @fg.l
    public String toString() {
        return this.jClass.toString() + ProtectedSandApp.s("據\u0001");
    }
}
