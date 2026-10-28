package androidx.compose.foundation.layout;

import androidx.compose.runtime.t3;
import kotlin.Metadata;

/* compiled from: BoxWithConstraints.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aP\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042!\u0010\f\u001a\u001d\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0002\b\n¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/ui/c;", "contentAlignment", "", "propagateMinConstraints", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/r;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "Landroidx/compose/ui/v;", "Lkotlin/u;", "content", "a", "(Landroidx/compose/ui/q;Landroidx/compose/ui/c;ZLld/q;Landroidx/compose/runtime/t;II)V", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nBoxWithConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoxWithConstraints.kt\nandroidx/compose/foundation/layout/BoxWithConstraintsKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,124:1\n1116#2,6:125\n*S KotlinDebug\n*F\n+ 1 BoxWithConstraints.kt\nandroidx/compose/foundation/layout/BoxWithConstraintsKt\n*L\n67#1:125,6\n*E\n"})
/* loaded from: classes.dex */
public final class q {

    /* compiled from: BoxWithConstraints.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/s1;", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/s1;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nBoxWithConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoxWithConstraints.kt\nandroidx/compose/foundation/layout/BoxWithConstraintsKt$BoxWithConstraints$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1#2:125\n*E\n"})
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.layout.s1, androidx.compose.ui.unit.b, androidx.compose.ui.layout.n0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.m0 f5256b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.q<r, androidx.compose.runtime.t, Integer, kotlin.k2> f5257c;

        /* compiled from: BoxWithConstraints.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.layout.q$a$a, reason: collision with other inner class name */
        static final class C0096a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.q<r, androidx.compose.runtime.t, Integer, kotlin.k2> f5258b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ s f5259c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0096a(ld.q<? super r, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar, s sVar) {
                super(2);
                this.f5258b = qVar;
                this.f5259c = sVar;
            }

            @androidx.compose.runtime.i
            public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                if ((i4 & 11) == 2 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(-1945019079, i4, -1, "androidx.compose.foundation.layout.BoxWithConstraints.<anonymous>.<anonymous>.<anonymous> (BoxWithConstraints.kt:68)");
                }
                this.f5258b.R(this.f5259c, tVar, 0);
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.q0();
                }
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
                a(tVar, num.intValue());
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.ui.layout.m0 m0Var, ld.q<? super r, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar) {
            super(2);
            this.f5256b = m0Var;
            this.f5257c = qVar;
        }

        @fg.l
        public final androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.s1 s1Var, long j4) {
            return this.f5256b.a(s1Var, s1Var.E2(kotlin.k2.f75408a, new androidx.compose.runtime.internal.b(-1945019079, true, new C0096a(this.f5257c, new s(s1Var, j4, null)))), j4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ androidx.compose.ui.layout.n0 invoke(androidx.compose.ui.layout.s1 s1Var, androidx.compose.ui.unit.b bVar) {
            return a(s1Var, bVar.getValue());
        }
    }

    /* compiled from: BoxWithConstraints.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f5260b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.c f5261c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f5262d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.q<r, androidx.compose.runtime.t, Integer, kotlin.k2> f5263e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f5264f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f5265g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.ui.q qVar, androidx.compose.ui.c cVar, boolean z4, ld.q<? super r, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, int i4, int i5) {
            super(2);
            this.f5260b = qVar;
            this.f5261c = cVar;
            this.f5262d = z4;
            this.f5263e = qVar2;
            this.f5264f = i4;
            this.f5265g = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            q.a(this.f5260b, this.f5261c, this.f5262d, this.f5263e, tVar, androidx.compose.runtime.g3.b(this.f5264f | 1), this.f5265g);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    @androidx.compose.ui.v
    @androidx.compose.runtime.i
    public static final void a(@fg.m androidx.compose.ui.q qVar, @fg.m androidx.compose.ui.c cVar, boolean z4, @fg.l ld.q<? super r, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        int i6;
        androidx.compose.runtime.t o4 = tVar.o(1781813501);
        int i7 = i5 & 1;
        if (i7 != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i6 = (o4.q0(qVar) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i10 = i5 & 2;
        if (i10 != 0) {
            i6 |= 48;
        } else if ((i4 & 112) == 0) {
            i6 |= o4.q0(cVar) ? 32 : 16;
        }
        int i11 = i5 & 4;
        if (i11 != 0) {
            i6 |= 384;
        } else if ((i4 & 896) == 0) {
            i6 |= o4.b(z4) ? 256 : 128;
        }
        if ((i5 & 8) != 0) {
            i6 |= 3072;
        } else if ((i4 & 7168) == 0) {
            i6 |= o4.S(qVar2) ? 2048 : 1024;
        }
        if ((i6 & 5851) == 1170 && o4.p()) {
            o4.d0();
        } else {
            if (i7 != 0) {
                qVar = androidx.compose.ui.q.INSTANCE;
            }
            if (i10 != 0) {
                cVar = androidx.compose.ui.c.INSTANCE.C();
            }
            if (i11 != 0) {
                z4 = false;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1781813501, i6, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:64)");
            }
            androidx.compose.ui.layout.m0 i12 = m.i(cVar, z4, o4, (i6 >> 3) & 126);
            o4.P(-1765292870);
            boolean S = o4.S(qVar2) | o4.q0(i12);
            Object Q = o4.Q();
            if (S || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new a(i12, qVar2);
                o4.E(Q);
            }
            o4.p0();
            androidx.compose.ui.layout.q1.a(qVar, (ld.p) Q, o4, i6 & 14, 0);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.ui.q qVar3 = qVar;
        androidx.compose.ui.c cVar2 = cVar;
        boolean z5 = z4;
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new b(qVar3, cVar2, z5, qVar2, i4, i5));
        }
    }
}
