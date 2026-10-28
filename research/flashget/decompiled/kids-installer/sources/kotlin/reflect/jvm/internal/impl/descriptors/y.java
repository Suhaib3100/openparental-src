package kotlin.reflect.jvm.internal.impl.descriptors;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KDeclarationContainer;
import kotlin.sequences.Sequence;

/* compiled from: findClassInModule.kt */
/* loaded from: classes5.dex */
public final class y {

    /* compiled from: findClassInModule.kt */
    /* loaded from: classes6.dex */
    /* synthetic */ class a extends kotlin.jvm.internal.g0 implements q3.l<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.name.b> {

        /* renamed from: x, reason: collision with root package name */
        public static final a f24454x = new a();

        a() {
            super(1);
        }

        @Override // q3.l
        @d5.e
        /* renamed from: A0, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.name.b N(@d5.d kotlin.reflect.jvm.internal.impl.name.b bVar) {
            kotlin.jvm.internal.l0.p(bVar, ProtectedSandApp.s("菳"));
            return bVar.g();
        }

        @Override // kotlin.jvm.internal.q, kotlin.reflect.KCallable
        @d5.d
        public final String getName() {
            return ProtectedSandApp.s("菴");
        }

        @Override // kotlin.jvm.internal.q
        @d5.d
        public final KDeclarationContainer w0() {
            return kotlin.jvm.internal.l1.d(kotlin.reflect.jvm.internal.impl.name.b.class);
        }

        @Override // kotlin.jvm.internal.q
        @d5.d
        public final String y0() {
            return ProtectedSandApp.s("菵");
        }
    }

    /* compiled from: findClassInModule.kt */
    /* loaded from: classes6.dex */
    static final class b extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.name.b, Integer> {

        /* renamed from: p, reason: collision with root package name */
        public static final b f24455p = new b();

        b() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer N(@d5.d kotlin.reflect.jvm.internal.impl.name.b bVar) {
            kotlin.jvm.internal.l0.p(bVar, ProtectedSandApp.s("菶"));
            return 0;
        }
    }

    @d5.e
    public static final e a(@d5.d h0 h0Var, @d5.d kotlin.reflect.jvm.internal.impl.name.b bVar) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("䣚"));
        kotlin.jvm.internal.l0.p(bVar, ProtectedSandApp.s("䣛"));
        h b6 = b(h0Var, bVar);
        if (b6 instanceof e) {
            return (e) b6;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0163  */
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.reflect.jvm.internal.impl.descriptors.h b(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.h0 r10, @d5.d kotlin.reflect.jvm.internal.impl.name.b r11) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.y.b(kotlin.reflect.jvm.internal.impl.descriptors.h0, kotlin.reflect.jvm.internal.impl.name.b):kotlin.reflect.jvm.internal.impl.descriptors.h");
    }

    @d5.d
    public static final e c(@d5.d h0 h0Var, @d5.d kotlin.reflect.jvm.internal.impl.name.b bVar, @d5.d k0 k0Var) {
        Sequence l5;
        Sequence k12;
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("䣢"));
        kotlin.jvm.internal.l0.p(bVar, ProtectedSandApp.s("䣣"));
        kotlin.jvm.internal.l0.p(k0Var, ProtectedSandApp.s("䣤"));
        e a6 = a(h0Var, bVar);
        if (a6 != null) {
            return a6;
        }
        l5 = kotlin.sequences.s.l(bVar, a.f24454x);
        k12 = kotlin.sequences.v.k1(l5, b.f24455p);
        return k0Var.d(bVar, kotlin.sequences.v.c3(k12));
    }

    @d5.e
    public static final e1 d(@d5.d h0 h0Var, @d5.d kotlin.reflect.jvm.internal.impl.name.b bVar) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("䣥"));
        kotlin.jvm.internal.l0.p(bVar, ProtectedSandApp.s("䣦"));
        h b6 = b(h0Var, bVar);
        if (b6 instanceof e1) {
            return (e1) b6;
        }
        return null;
    }
}
