package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

/* compiled from: MutablePropertyReference1Impl.java */
/* loaded from: classes6.dex */
public class x0 extends w0 {
    public x0(KDeclarationContainer kDeclarationContainer, String str, String str2) {
        super(q.f23594u, ((ClassBasedDeclarationContainer) kDeclarationContainer).f(), str, str2, !(kDeclarationContainer instanceof KClass) ? 1 : 0);
    }

    @Override // kotlin.reflect.KMutableProperty1
    public void c0(Object obj, Object obj2) {
        h().C(obj, obj2);
    }

    @Override // kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return e().C(obj);
    }

    @SinceKotlin(version = "1.4")
    public x0(Class cls, String str, String str2, int i5) {
        super(q.f23594u, cls, str, str2, i5);
    }

    @SinceKotlin(version = "1.4")
    public x0(Object obj, Class cls, String str, String str2, int i5) {
        super(obj, cls, str, str2, i5);
    }
}
