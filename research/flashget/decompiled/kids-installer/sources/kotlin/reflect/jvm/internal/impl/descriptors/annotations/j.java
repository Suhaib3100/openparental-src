package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.d0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.p0;

/* compiled from: BuiltInAnnotationDescriptor.kt */
/* loaded from: classes5.dex */
public final class j implements c {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.builtins.h f24118a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.name.c f24119b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> f24120c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private final Lazy f24121d;

    /* compiled from: BuiltInAnnotationDescriptor.kt */
    /* loaded from: classes6.dex */
    static final class a extends Lambda implements q3.a<p0> {
        a() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p0 n() {
            return j.this.f24118a.o(j.this.f()).E();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(@d5.d kotlin.reflect.jvm.internal.impl.builtins.h hVar, @d5.d kotlin.reflect.jvm.internal.impl.name.c cVar, @d5.d Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> map) {
        Lazy b6;
        l0.p(hVar, ProtectedSandApp.s("䜍"));
        l0.p(cVar, ProtectedSandApp.s("䜎"));
        l0.p(map, ProtectedSandApp.s("䜏"));
        this.f24118a = hVar;
        this.f24119b = cVar;
        this.f24120c = map;
        b6 = d0.b(LazyThreadSafetyMode.PUBLICATION, new a());
        this.f24121d = b6;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @d5.d
    public Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> a() {
        return this.f24120c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @d5.d
    public kotlin.reflect.jvm.internal.impl.name.c f() {
        return this.f24119b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @d5.d
    public h0 getType() {
        Object value = this.f24121d.getValue();
        l0.o(value, ProtectedSandApp.s("䜐"));
        return (h0) value;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @d5.d
    public a1 k() {
        a1 a1Var = a1.f24103a;
        l0.o(a1Var, ProtectedSandApp.s("䜑"));
        return a1Var;
    }
}
