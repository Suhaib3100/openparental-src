package kotlin.reflect.jvm.internal.impl.load.java.components;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.e1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.l;
import kotlin.reflect.jvm.internal.impl.resolve.constants.v;
import kotlin.reflect.jvm.internal.impl.storage.m;

/* compiled from: JavaAnnotationMapper.kt */
/* loaded from: classes6.dex */
public final class e extends b {

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f24541h = {l1.u(new g1(l1.d(e.class), ProtectedSandApp.s("萎"), ProtectedSandApp.s("萏")))};

    /* renamed from: g, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.i f24542g;

    /* compiled from: JavaAnnotationMapper.kt */
    static final class a extends Lambda implements q3.a<Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends v>> {

        /* renamed from: p, reason: collision with root package name */
        public static final a f24543p = new a();

        a() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<kotlin.reflect.jvm.internal.impl.name.f, v> n() {
            Map<kotlin.reflect.jvm.internal.impl.name.f, v> k5;
            k5 = e1.k(new Pair(c.f24532a.b(), new v(ProtectedSandApp.s("萍"))));
            return k5;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@d5.e b4.a aVar, @d5.d kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar) {
        super(gVar, aVar, l.a.f24089y);
        l0.p(gVar, ProtectedSandApp.s("萐"));
        this.f24542g = gVar.e().d(a.f24543p);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.b, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @d5.d
    public Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> a() {
        return (Map) m.a(this.f24542g, this, f24541h[0]);
    }
}
