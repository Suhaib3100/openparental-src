package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;

/* compiled from: AnnotationsTypeAttribute.kt */
/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f26503a = {kotlin.jvm.internal.l1.u(new kotlin.jvm.internal.g1(kotlin.jvm.internal.l1.h(l.class, ProtectedSandApp.s("坸")), ProtectedSandApp.s("坹"), ProtectedSandApp.s("坺")))};

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final ReadOnlyProperty f26504b;

    static {
        ReadOnlyProperty c6 = d1.f26381p.c(kotlin.jvm.internal.l1.d(k.class));
        kotlin.jvm.internal.l0.n(c6, ProtectedSandApp.s("坻"));
        f26504b = c6;
    }

    @d5.d
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g a(@d5.d d1 d1Var) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g e6;
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("坼"));
        k b6 = b(d1Var);
        return (b6 == null || (e6 = b6.e()) == null) ? kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e.b() : e6;
    }

    @d5.e
    public static final k b(@d5.d d1 d1Var) {
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("坽"));
        return (k) f26504b.a(d1Var, f26503a[0]);
    }
}
