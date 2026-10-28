package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

/* compiled from: FunctionReferenceImpl.java */
/* loaded from: classes6.dex */
public class h0 extends g0 {
    public h0(int i5, KDeclarationContainer kDeclarationContainer, String str, String str2) {
        super(i5, q.f23594u, ((ClassBasedDeclarationContainer) kDeclarationContainer).f(), str, str2, !(kDeclarationContainer instanceof KClass) ? 1 : 0);
    }

    @SinceKotlin(version = "1.4")
    public h0(int i5, Class cls, String str, String str2, int i6) {
        super(i5, q.f23594u, cls, str, str2, i6);
    }

    @SinceKotlin(version = "1.4")
    public h0(int i5, Object obj, Class cls, String str, String str2, int i6) {
        super(i5, obj, cls, str, str2, i6);
    }
}
