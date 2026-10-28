package kotlin.reflect.jvm.internal.impl.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.r1;

/* compiled from: findClassInModule.kt */
@r1({"SMAP\nfindClassInModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 findClassInModule.kt\norg/jetbrains/kotlin/descriptors/FindClassInModuleKt\n*L\n1#1,66:1\n43#1,2:67\n*S KotlinDebug\n*F\n+ 1 findClassInModule.kt\norg/jetbrains/kotlin/descriptors/FindClassInModuleKt\n*L\n23#1:67,2\n*E\n"})
/* loaded from: classes7.dex */
public final class y {

    /* compiled from: findClassInModule.kt */
    /* synthetic */ class a extends kotlin.jvm.internal.g0 implements ld.l<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.name.b> {

        /* renamed from: d, reason: collision with root package name */
        public static final a f76304d = new a(1);

        a() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: Z, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.name.b invoke(@fg.l kotlin.reflect.jvm.internal.impl.name.b bVar) {
            kotlin.jvm.internal.l0.p(bVar, ProtectedSandApp.s("潥\u0001"));
            return bVar.g();
        }

        @Override // kotlin.jvm.internal.q, kotlin.reflect.c
        @fg.l
        public final String getName() {
            return ProtectedSandApp.s("潦\u0001");
        }

        @Override // kotlin.jvm.internal.q
        @fg.l
        public final kotlin.reflect.h getOwner() {
            return kotlin.jvm.internal.l1.d(kotlin.reflect.jvm.internal.impl.name.b.class);
        }

        @Override // kotlin.jvm.internal.q
        @fg.l
        public final String getSignature() {
            return ProtectedSandApp.s("潧\u0001");
        }
    }

    /* compiled from: findClassInModule.kt */
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<kotlin.reflect.jvm.internal.impl.name.b, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f76305b = new b(1);

        b() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(@fg.l kotlin.reflect.jvm.internal.impl.name.b bVar) {
            kotlin.jvm.internal.l0.p(bVar, ProtectedSandApp.s("潨\u0001"));
            return 0;
        }
    }

    @fg.m
    public static final e a(@fg.l h0 h0Var, @fg.l kotlin.reflect.jvm.internal.impl.name.b bVar) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("潱\u0001"));
        kotlin.jvm.internal.l0.p(bVar, ProtectedSandApp.s("潲\u0001"));
        h b5 = b(h0Var, bVar);
        if (b5 instanceof e) {
            return (e) b5;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015d  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.reflect.jvm.internal.impl.descriptors.h b(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.h0 r9, @fg.l kotlin.reflect.jvm.internal.impl.name.b r10) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.y.b(kotlin.reflect.jvm.internal.impl.descriptors.h0, kotlin.reflect.jvm.internal.impl.name.b):kotlin.reflect.jvm.internal.impl.descriptors.h");
    }

    @fg.l
    public static final e c(@fg.l h0 h0Var, @fg.l kotlin.reflect.jvm.internal.impl.name.b bVar, @fg.l k0 k0Var) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("潱\u0001"));
        kotlin.jvm.internal.l0.p(bVar, ProtectedSandApp.s("潲\u0001"));
        kotlin.jvm.internal.l0.p(k0Var, ProtectedSandApp.s("潶\u0001"));
        e a5 = a(h0Var, bVar);
        return a5 != null ? a5 : k0Var.d(bVar, kotlin.sequences.p.c3(kotlin.sequences.p.k1(kotlin.sequences.p.l(bVar, a.f76304d), b.f76305b)));
    }

    @fg.m
    public static final e1 d(@fg.l h0 h0Var, @fg.l kotlin.reflect.jvm.internal.impl.name.b bVar) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("潱\u0001"));
        kotlin.jvm.internal.l0.p(bVar, ProtectedSandApp.s("潲\u0001"));
        h b5 = b(h0Var, bVar);
        if (b5 instanceof e1) {
            return (e1) b5;
        }
        return null;
    }
}
