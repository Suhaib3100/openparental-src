package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.b;

/* compiled from: AbstractBinaryClassAnnotationLoader.kt */
/* loaded from: classes7.dex */
public final class d<A, C> extends b.a<A> {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final Map<w, List<A>> f76832a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final Map<w, C> f76833b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final Map<w, C> f76834c;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@fg.l Map<w, ? extends List<? extends A>> map, @fg.l Map<w, ? extends C> map2, @fg.l Map<w, ? extends C> map3) {
        l0.p(map, ProtectedSandApp.s("玦\u0001"));
        l0.p(map2, ProtectedSandApp.s("玧\u0001"));
        l0.p(map3, ProtectedSandApp.s("玨\u0001"));
        this.f76832a = map;
        this.f76833b = map2;
        this.f76834c = map3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.b.a
    @fg.l
    public Map<w, List<A>> a() {
        return this.f76832a;
    }

    @fg.l
    public final Map<w, C> b() {
        return this.f76834c;
    }

    @fg.l
    public final Map<w, C> c() {
        return this.f76833b;
    }
}
