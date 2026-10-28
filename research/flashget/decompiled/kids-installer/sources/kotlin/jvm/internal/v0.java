package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

/* compiled from: MutablePropertyReference0Impl.java */
/* loaded from: classes6.dex */
public class v0 extends u0 {
    public v0(KDeclarationContainer kDeclarationContainer, String str, String str2) {
        super(q.f23594u, ((ClassBasedDeclarationContainer) kDeclarationContainer).f(), str, str2, !(kDeclarationContainer instanceof KClass) ? 1 : 0);
    }

    @Override // kotlin.reflect.KProperty0
    public Object get() {
        return e().C(new Object[0]);
    }

    @Override // kotlin.reflect.KMutableProperty0
    public void set(Object obj) {
        h().C(obj);
    }

    @SinceKotlin(version = "1.4")
    public v0(Class cls, String str, String str2, int i5) {
        super(q.f23594u, cls, str, str2, i5);
    }

    @SinceKotlin(version = "1.4")
    public v0(Object obj, Class cls, String str, String str2, int i5) {
        super(obj, cls, str, str2, i5);
    }
}
