package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

/* compiled from: PropertyReference2Impl.java */
/* loaded from: classes6.dex */
public class i1 extends h1 {
    public i1(KDeclarationContainer kDeclarationContainer, String str, String str2) {
        super(((ClassBasedDeclarationContainer) kDeclarationContainer).f(), str, str2, !(kDeclarationContainer instanceof KClass) ? 1 : 0);
    }

    @Override // kotlin.reflect.KProperty2
    public Object m0(Object obj, Object obj2) {
        return e().C(obj, obj2);
    }

    @SinceKotlin(version = "1.4")
    public i1(Class cls, String str, String str2, int i5) {
        super(cls, str, str2, i5);
    }
}
