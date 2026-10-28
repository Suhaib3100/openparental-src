package kotlin.reflect.jvm.internal.impl.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;

/* compiled from: typeParameterUtils.kt */
/* loaded from: classes7.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final i f76283a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final List<kotlin.reflect.jvm.internal.impl.types.l1> f76284b;

    /* renamed from: c, reason: collision with root package name */
    @fg.m
    private final s0 f76285c;

    /* JADX WARN: Multi-variable type inference failed */
    public s0(@fg.l i iVar, @fg.l List<? extends kotlin.reflect.jvm.internal.impl.types.l1> list, @fg.m s0 s0Var) {
        kotlin.jvm.internal.l0.p(iVar, ProtectedSandApp.s("演\u0001"));
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("漕\u0001"));
        this.f76283a = iVar;
        this.f76284b = list;
        this.f76285c = s0Var;
    }

    @fg.l
    public final List<kotlin.reflect.jvm.internal.impl.types.l1> a() {
        return this.f76284b;
    }

    @fg.l
    public final i b() {
        return this.f76283a;
    }

    @fg.m
    public final s0 c() {
        return this.f76285c;
    }
}
