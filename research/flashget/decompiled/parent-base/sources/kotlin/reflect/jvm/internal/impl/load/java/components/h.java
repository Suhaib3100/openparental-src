package kotlin.reflect.jvm.internal.impl.load.java.components;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.Map;
import kotlin.collections.z0;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.q0;
import kotlin.reflect.jvm.internal.impl.builtins.l;
import kotlin.reflect.jvm.internal.impl.storage.m;
import kotlin.reflect.o;

/* compiled from: JavaAnnotationMapper.kt */
/* loaded from: classes7.dex */
public final class h extends b {

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ o<Object>[] f76400h = {l1.u(new g1(l1.d(h.class), ProtectedSandApp.s("瀜\u0001"), ProtectedSandApp.s("瀝\u0001")))};

    /* renamed from: g, reason: collision with root package name */
    @l
    private final kotlin.reflect.jvm.internal.impl.storage.i f76401g;

    /* compiled from: JavaAnnotationMapper.kt */
    @r1({"SMAP\nJavaAnnotationMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaAnnotationMapper.kt\norg/jetbrains/kotlin/load/java/components/JavaRetentionAnnotationDescriptor$allValueArguments$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
    static final class a extends n0 implements ld.a<Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> {
        a() {
            super(0);
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> invoke() {
            kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> a5 = d.f76391a.a(h.this.b());
            Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> k4 = a5 != null ? z0.k(new q0(c.f76386a.c(), a5)) : null;
            return k4 == null ? z0.z() : k4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@l wd.a aVar, @l kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar) {
        super(gVar, aVar, l.a.L);
        l0.p(aVar, ProtectedSandApp.s("瀞\u0001"));
        l0.p(gVar, ProtectedSandApp.s("瀟\u0001"));
        this.f76401g = gVar.e().h(new a());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.b, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @fg.l
    public Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> a() {
        return (Map) m.a(this.f76401g, this, f76400h[0]);
    }
}
