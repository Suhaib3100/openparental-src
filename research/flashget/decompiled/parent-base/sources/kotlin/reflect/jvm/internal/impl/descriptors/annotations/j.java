package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Map;
import kotlin.b0;
import kotlin.c0;
import kotlin.f0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.p0;

/* compiled from: BuiltInAnnotationDescriptor.kt */
/* loaded from: classes7.dex */
public final class j implements c {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.builtins.h f75915a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.name.c f75916b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> f75917c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f75918d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private final b0 f75919e;

    /* compiled from: BuiltInAnnotationDescriptor.kt */
    static final class a extends n0 implements ld.a<p0> {
        a() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p0 invoke() {
            return j.this.f75915a.o(j.this.g()).r();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(@fg.l kotlin.reflect.jvm.internal.impl.builtins.h hVar, @fg.l kotlin.reflect.jvm.internal.impl.name.c cVar, @fg.l Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> map, boolean z4) {
        l0.p(hVar, ProtectedSandApp.s("欄\u0001"));
        l0.p(cVar, ProtectedSandApp.s("欅\u0001"));
        l0.p(map, ProtectedSandApp.s("欆\u0001"));
        this.f75915a = hVar;
        this.f75916b = cVar;
        this.f75917c = map;
        this.f75918d = z4;
        this.f75919e = c0.b(f0.PUBLICATION, new a());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @fg.l
    public Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> a() {
        return this.f75917c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @fg.l
    public a1 f() {
        a1 a1Var = a1.f75900a;
        l0.o(a1Var, ProtectedSandApp.s("欇\u0001"));
        return a1Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @fg.l
    public kotlin.reflect.jvm.internal.impl.name.c g() {
        return this.f75916b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @fg.l
    public h0 getType() {
        Object value = this.f75919e.getValue();
        l0.o(value, ProtectedSandApp.s("欈\u0001"));
        return (h0) value;
    }

    public /* synthetic */ j(kotlin.reflect.jvm.internal.impl.builtins.h hVar, kotlin.reflect.jvm.internal.impl.name.c cVar, Map map, boolean z4, int i4, w wVar) {
        this(hVar, cVar, map, (i4 & 8) != 0 ? false : z4);
    }
}
