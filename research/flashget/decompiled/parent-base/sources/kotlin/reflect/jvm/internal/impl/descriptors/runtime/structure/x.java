package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;

/* compiled from: ReflectJavaPrimitiveType.kt */
/* loaded from: classes7.dex */
public final class x extends z implements wd.v {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final Class<?> f76278b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final Collection<wd.a> f76279c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f76280d;

    public x(@fg.l Class<?> cls) {
        l0.p(cls, ProtectedSandApp.s("漏\u0001"));
        this.f76278b = cls;
        this.f76279c = j0.f74919b;
    }

    @Override // wd.d
    public boolean E() {
        return this.f76280d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.z
    public Type O() {
        return this.f76278b;
    }

    @fg.l
    protected Class<?> P() {
        return this.f76278b;
    }

    @Override // wd.d
    @fg.l
    public Collection<wd.a> getAnnotations() {
        return this.f76279c;
    }

    @Override // wd.v
    @fg.m
    public kotlin.reflect.jvm.internal.impl.builtins.i getType() {
        if (l0.g(this.f76278b, Void.TYPE)) {
            return null;
        }
        return kotlin.reflect.jvm.internal.impl.resolve.jvm.e.get(this.f76278b.getName()).getPrimitiveType();
    }
}
