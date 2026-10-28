package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.l1;
import kotlin.collections.z0;
import kotlin.q0;

/* compiled from: AnnotationQualifiersFqNames.kt */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final kotlin.reflect.jvm.internal.impl.name.c f76348a = new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("濇\u0001"));

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final kotlin.reflect.jvm.internal.impl.name.c f76349b = new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("濈\u0001"));

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final kotlin.reflect.jvm.internal.impl.name.c f76350c = new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("濉\u0001"));

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final kotlin.reflect.jvm.internal.impl.name.c f76351d = new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("濊\u0001"));

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final List<b> f76352e;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final Map<kotlin.reflect.jvm.internal.impl.name.c, r> f76353f;

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final Map<kotlin.reflect.jvm.internal.impl.name.c, r> f76354g;

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private static final Set<kotlin.reflect.jvm.internal.impl.name.c> f76355h;

    static {
        b bVar = b.FIELD;
        b bVar2 = b.METHOD_RETURN_TYPE;
        b bVar3 = b.VALUE_PARAMETER;
        List<b> O = kotlin.collections.w.O(bVar, bVar2, bVar3, b.TYPE_PARAMETER_BOUNDS, b.TYPE_USE);
        f76352e = O;
        kotlin.reflect.jvm.internal.impl.name.c l4 = c0.l();
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h hVar = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h.NOT_NULL;
        Map<kotlin.reflect.jvm.internal.impl.name.c, r> W = z0.W(new q0(l4, new r(new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i(hVar, false, 2, null), O, false)), new q0(c0.i(), new r(new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i(hVar, false, 2, null), O, false)));
        f76353f = W;
        f76354g = z0.n0(z0.W(new q0(new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("濋\u0001")), new r(new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h.NULLABLE, false, 2, null), kotlin.collections.w.k(bVar3), false, 4, null)), new q0(new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("濌\u0001")), new r(new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i(hVar, false, 2, null), kotlin.collections.w.k(bVar3), false, 4, null))), W);
        f76355h = l1.u(c0.f(), c0.e());
    }

    @fg.l
    public static final Map<kotlin.reflect.jvm.internal.impl.name.c, r> a() {
        return f76354g;
    }

    @fg.l
    public static final Set<kotlin.reflect.jvm.internal.impl.name.c> b() {
        return f76355h;
    }

    @fg.l
    public static final Map<kotlin.reflect.jvm.internal.impl.name.c, r> c() {
        return f76353f;
    }

    @fg.l
    public static final kotlin.reflect.jvm.internal.impl.name.c d() {
        return f76351d;
    }

    @fg.l
    public static final kotlin.reflect.jvm.internal.impl.name.c e() {
        return f76350c;
    }

    @fg.l
    public static final kotlin.reflect.jvm.internal.impl.name.c f() {
        return f76349b;
    }

    @fg.l
    public static final kotlin.reflect.jvm.internal.impl.name.c g() {
        return f76348a;
    }
}
