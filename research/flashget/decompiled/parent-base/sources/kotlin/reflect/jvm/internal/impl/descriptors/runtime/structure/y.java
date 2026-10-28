package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: ReflectJavaRecordComponent.kt */
@r1({"SMAP\nReflectJavaRecordComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaRecordComponent.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaRecordComponent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
/* loaded from: classes7.dex */
public final class y extends t implements wd.w {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final Object f76281a;

    public y(@fg.l Object obj) {
        l0.p(obj, ProtectedSandApp.s("漐\u0001"));
        this.f76281a = obj;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.t
    @fg.l
    public Member P() {
        Method c5 = a.f76223a.c(this.f76281a);
        if (c5 != null) {
            return c5;
        }
        throw new NoSuchMethodError(ProtectedSandApp.s("漑\u0001"));
    }

    @Override // wd.w
    public boolean a() {
        return false;
    }

    @Override // wd.w
    @fg.l
    public wd.x getType() {
        Class<?> d5 = a.f76223a.d(this.f76281a);
        if (d5 != null) {
            return new n(d5);
        }
        throw new NoSuchMethodError(ProtectedSandApp.s("漒\u0001"));
    }
}
