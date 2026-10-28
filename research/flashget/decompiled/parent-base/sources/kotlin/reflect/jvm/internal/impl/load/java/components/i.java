package kotlin.reflect.jvm.internal.impl.load.java.components;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.Map;
import kotlin.collections.w;
import kotlin.collections.z0;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.q0;
import kotlin.reflect.jvm.internal.impl.builtins.l;
import kotlin.reflect.o;
import wd.m;

/* compiled from: JavaAnnotationMapper.kt */
/* loaded from: classes7.dex */
public final class i extends b {

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ o<Object>[] f76403h = {l1.u(new g1(l1.d(i.class), ProtectedSandApp.s("瀠\u0001"), ProtectedSandApp.s("瀡\u0001")))};

    /* renamed from: g, reason: collision with root package name */
    @l
    private final kotlin.reflect.jvm.internal.impl.storage.i f76404g;

    /* compiled from: JavaAnnotationMapper.kt */
    @r1({"SMAP\nJavaAnnotationMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaAnnotationMapper.kt\norg/jetbrains/kotlin/load/java/components/JavaTargetAnnotationDescriptor$allValueArguments$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
    static final class a extends n0 implements ld.a<Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<? extends Object>>> {
        a() {
            super(0);
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<Object>> invoke() {
            wd.b b5 = i.this.b();
            kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> c5 = b5 instanceof wd.e ? d.f76391a.c(((wd.e) i.this.b()).getElements()) : b5 instanceof m ? d.f76391a.c(w.k(i.this.b())) : null;
            Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<Object>> k4 = c5 != null ? z0.k(new q0(c.f76386a.d(), c5)) : null;
            return k4 == null ? z0.z() : k4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@l wd.a aVar, @l kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar) {
        super(gVar, aVar, l.a.H);
        l0.p(aVar, ProtectedSandApp.s("瀢\u0001"));
        l0.p(gVar, ProtectedSandApp.s("瀣\u0001"));
        this.f76404g = gVar.e().h(new a());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.b, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @fg.l
    public Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<Object>> a() {
        return (Map) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f76404g, this, f76403h[0]);
    }
}
