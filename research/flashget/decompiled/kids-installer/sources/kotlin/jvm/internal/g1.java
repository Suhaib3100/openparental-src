package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

/* compiled from: PropertyReference1Impl.java */
/* loaded from: classes6.dex */
public class g1 extends f1 {
    public g1(KDeclarationContainer kDeclarationContainer, String str, String str2) {
        super(q.f23594u, ((ClassBasedDeclarationContainer) kDeclarationContainer).f(), str, str2, !(kDeclarationContainer instanceof KClass) ? 1 : 0);
    }

    @Override // kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return e().C(obj);
    }

    @SinceKotlin(version = "1.4")
    public g1(Class cls, String str, String str2, int i5) {
        super(q.f23594u, cls, str, str2, i5);
    }

    @SinceKotlin(version = "1.4")
    public g1(Object obj, Class cls, String str, String str2, int i5) {
        super(obj, cls, str, str2, i5);
    }
}
