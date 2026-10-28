package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import b4.z;
import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.d0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.load.java.y;

/* compiled from: context.kt */
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: context.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.a$a, reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    static final class C0284a extends Lambda implements q3.a<y> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ g f24599p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.g f24600q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0284a(g gVar, kotlin.reflect.jvm.internal.impl.descriptors.g gVar2) {
            super(0);
            this.f24599p = gVar;
            this.f24600q = gVar2;
        }

        @Override // q3.a
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y n() {
            return a.g(this.f24599p, this.f24600q.getAnnotations());
        }
    }

    /* compiled from: context.kt */
    /* loaded from: classes6.dex */
    static final class b extends Lambda implements q3.a<y> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ g f24601p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.annotations.g f24602q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(g gVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar2) {
            super(0);
            this.f24601p = gVar;
            this.f24602q = gVar2;
        }

        @Override // q3.a
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y n() {
            return a.g(this.f24601p, this.f24602q);
        }
    }

    private static final g a(g gVar, m mVar, z zVar, int i5, Lazy<y> lazy) {
        return new g(gVar.a(), zVar != null ? new h(gVar, mVar, zVar, i5) : gVar.f(), lazy);
    }

    @d5.d
    public static final g b(@d5.d g gVar, @d5.d k kVar) {
        l0.p(gVar, ProtectedSandApp.s("䨰"));
        l0.p(kVar, ProtectedSandApp.s("䨱"));
        return new g(gVar.a(), kVar, gVar.c());
    }

    @d5.d
    public static final g c(@d5.d g gVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.g gVar2, @d5.e z zVar, int i5) {
        Lazy b6;
        l0.p(gVar, ProtectedSandApp.s("䨲"));
        l0.p(gVar2, ProtectedSandApp.s("䨳"));
        b6 = d0.b(LazyThreadSafetyMode.NONE, new C0284a(gVar, gVar2));
        return a(gVar, gVar2, zVar, i5, b6);
    }

    public static /* synthetic */ g d(g gVar, kotlin.reflect.jvm.internal.impl.descriptors.g gVar2, z zVar, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            zVar = null;
        }
        if ((i6 & 4) != 0) {
            i5 = 0;
        }
        return c(gVar, gVar2, zVar, i5);
    }

    @d5.d
    public static final g e(@d5.d g gVar, @d5.d m mVar, @d5.d z zVar, int i5) {
        l0.p(gVar, ProtectedSandApp.s("䨴"));
        l0.p(mVar, ProtectedSandApp.s("䨵"));
        l0.p(zVar, ProtectedSandApp.s("䨶"));
        return a(gVar, mVar, zVar, i5, gVar.c());
    }

    public static /* synthetic */ g f(g gVar, m mVar, z zVar, int i5, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            i5 = 0;
        }
        return e(gVar, mVar, zVar, i5);
    }

    @d5.e
    public static final y g(@d5.d g gVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar2) {
        l0.p(gVar, ProtectedSandApp.s("䨷"));
        l0.p(gVar2, ProtectedSandApp.s("䨸"));
        return gVar.a().a().c(gVar.b(), gVar2);
    }

    @d5.d
    public static final g h(@d5.d g gVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar2) {
        Lazy b6;
        l0.p(gVar, ProtectedSandApp.s("䨹"));
        l0.p(gVar2, ProtectedSandApp.s("䨺"));
        if (gVar2.isEmpty()) {
            return gVar;
        }
        kotlin.reflect.jvm.internal.impl.load.java.lazy.b a6 = gVar.a();
        k f6 = gVar.f();
        b6 = d0.b(LazyThreadSafetyMode.NONE, new b(gVar, gVar2));
        return new g(a6, f6, b6);
    }

    @d5.d
    public static final g i(@d5.d g gVar, @d5.d kotlin.reflect.jvm.internal.impl.load.java.lazy.b bVar) {
        l0.p(gVar, ProtectedSandApp.s("䨻"));
        l0.p(bVar, ProtectedSandApp.s("䨼"));
        return new g(bVar, gVar.f(), gVar.c());
    }
}
