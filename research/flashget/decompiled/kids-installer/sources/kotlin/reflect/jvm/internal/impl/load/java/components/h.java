package kotlin.reflect.jvm.internal.impl.load.java.components;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.e1;
import kotlin.collections.f1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.l;
import kotlin.reflect.jvm.internal.impl.storage.m;

/* compiled from: JavaAnnotationMapper.kt */
/* loaded from: classes6.dex */
public final class h extends b {

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f24546h = {l1.u(new g1(l1.d(h.class), ProtectedSandApp.s("萑"), ProtectedSandApp.s("萒")))};

    /* renamed from: g, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.i f24547g;

    /* compiled from: JavaAnnotationMapper.kt */
    static final class a extends Lambda implements q3.a<Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> {
        a() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> n() {
            Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> z5;
            kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> a6 = d.f24537a.a(h.this.b());
            Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> k5 = a6 != null ? e1.k(new Pair(c.f24532a.c(), a6)) : null;
            if (k5 != null) {
                return k5;
            }
            z5 = f1.z();
            return z5;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@d5.d b4.a aVar, @d5.d kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar) {
        super(gVar, aVar, l.a.L);
        l0.p(aVar, ProtectedSandApp.s("萓"));
        l0.p(gVar, ProtectedSandApp.s("萔"));
        this.f24547g = gVar.e().d(new a());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.b, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @d5.d
    public Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> a() {
        return (Map) m.a(this.f24547g, this, f24546h[0]);
    }
}
