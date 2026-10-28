package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.l0;

/* compiled from: ReflectJavaRecordComponent.kt */
/* loaded from: classes6.dex */
public final class y extends t implements b4.w {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final Object f24431a;

    public y(@d5.d Object obj) {
        l0.p(obj, ProtectedSandApp.s("莼"));
        this.f24431a = obj;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.t
    @d5.d
    public Member V() {
        Method c6 = a.f24373a.c(this.f24431a);
        if (c6 != null) {
            return c6;
        }
        throw new NoSuchMethodError(ProtectedSandApp.s("莽"));
    }

    @Override // b4.w
    public boolean b() {
        return false;
    }

    @Override // b4.w
    @d5.d
    public b4.x getType() {
        Class<?> d6 = a.f24373a.d(this.f24431a);
        if (d6 != null) {
            return new n(d6);
        }
        throw new NoSuchMethodError(ProtectedSandApp.s("莾"));
    }
}
