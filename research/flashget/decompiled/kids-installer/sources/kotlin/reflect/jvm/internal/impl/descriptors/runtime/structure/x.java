package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.l0;

/* compiled from: ReflectJavaPrimitiveType.kt */
/* loaded from: classes6.dex */
public final class x extends z implements b4.v {

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final Class<?> f24428b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final Collection<b4.a> f24429c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f24430d;

    public x(@d5.d Class<?> cls) {
        l0.p(cls, ProtectedSandApp.s("莻"));
        this.f24428b = cls;
        this.f24429c = EmptyList.f23167o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.z
    public Type U() {
        return this.f24428b;
    }

    @d5.d
    protected Class<?> V() {
        return this.f24428b;
    }

    @Override // b4.d
    @d5.d
    public Collection<b4.a> getAnnotations() {
        return this.f24429c;
    }

    @Override // b4.v
    @d5.e
    public kotlin.reflect.jvm.internal.impl.builtins.i getType() {
        if (l0.g(this.f24428b, Void.TYPE)) {
            return null;
        }
        return kotlin.reflect.jvm.internal.impl.resolve.jvm.e.get(this.f24428b.getName()).getPrimitiveType();
    }

    @Override // b4.d
    public boolean o() {
        return this.f24430d;
    }
}
