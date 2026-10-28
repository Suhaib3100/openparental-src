package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

/* compiled from: PropertyReference0Impl.java */
/* loaded from: classes6.dex */
public class e1 extends d1 {
    public e1(KDeclarationContainer kDeclarationContainer, String str, String str2) {
        super(q.f23594u, ((ClassBasedDeclarationContainer) kDeclarationContainer).f(), str, str2, !(kDeclarationContainer instanceof KClass) ? 1 : 0);
    }

    @Override // kotlin.reflect.KProperty0
    public Object get() {
        return e().C(new Object[0]);
    }

    @SinceKotlin(version = "1.4")
    public e1(Class cls, String str, String str2, int i5) {
        super(q.f23594u, cls, str, str2, i5);
    }

    @SinceKotlin(version = "1.4")
    public e1(Object obj, Class cls, String str, String str2, int i5) {
        super(obj, cls, str, str2, i5);
    }
}
