package kotlin.reflect.jvm.internal.impl.load.java.components;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.Map;
import kotlin.collections.z0;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.q0;
import kotlin.reflect.jvm.internal.impl.builtins.l;
import kotlin.reflect.jvm.internal.impl.resolve.constants.v;
import kotlin.reflect.o;

/* compiled from: JavaAnnotationMapper.kt */
/* loaded from: classes7.dex */
public final class e extends b {

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ o<Object>[] f76395h = {l1.u(new g1(l1.d(e.class), ProtectedSandApp.s("瀊\u0001"), ProtectedSandApp.s("瀋\u0001")))};

    /* renamed from: g, reason: collision with root package name */
    @l
    private final kotlin.reflect.jvm.internal.impl.storage.i f76396g;

    /* compiled from: JavaAnnotationMapper.kt */
    static final class a extends n0 implements ld.a<Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends v>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f76397b = new a(0);

        a() {
            super(0);
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<kotlin.reflect.jvm.internal.impl.name.f, v> invoke() {
            return z0.k(new q0(c.f76386a.b(), new v(ProtectedSandApp.s("瀉\u0001"))));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@m wd.a aVar, @l kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar) {
        super(gVar, aVar, l.a.f75886y);
        l0.p(gVar, ProtectedSandApp.s("瀌\u0001"));
        this.f76396g = gVar.e().h(a.f76397b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.b, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @fg.l
    public Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> a() {
        return (Map) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f76396g, this, f76395h[0]);
    }
}
