package kotlin.reflect.jvm.internal.impl.load.java.components;

import b4.m;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.e1;
import kotlin.collections.f1;
import kotlin.collections.z;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.l;

/* compiled from: JavaAnnotationMapper.kt */
/* loaded from: classes6.dex */
public final class i extends b {

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f24549h = {l1.u(new g1(l1.d(i.class), ProtectedSandApp.s("萕"), ProtectedSandApp.s("萖")))};

    /* renamed from: g, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.i f24550g;

    /* compiled from: JavaAnnotationMapper.kt */
    static final class a extends Lambda implements q3.a<Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<? extends Object>>> {
        a() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<Object>> n() {
            kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVar;
            List<? extends b4.b> k5;
            Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<Object>> z5;
            b4.b b6 = i.this.b();
            if (b6 instanceof b4.e) {
                gVar = d.f24537a.c(((b4.e) i.this.b()).e());
            } else if (b6 instanceof m) {
                d dVar = d.f24537a;
                k5 = z.k(i.this.b());
                gVar = dVar.c(k5);
            } else {
                gVar = null;
            }
            Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<Object>> k6 = gVar != null ? e1.k(new Pair(c.f24532a.d(), gVar)) : null;
            if (k6 != null) {
                return k6;
            }
            z5 = f1.z();
            return z5;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@d5.d b4.a aVar, @d5.d kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar) {
        super(gVar, aVar, l.a.H);
        l0.p(aVar, ProtectedSandApp.s("萗"));
        l0.p(gVar, ProtectedSandApp.s("萘"));
        this.f24550g = gVar.e().d(new a());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.b, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @d5.d
    public Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<Object>> a() {
        return (Map) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f24550g, this, f24549h[0]);
    }
}
