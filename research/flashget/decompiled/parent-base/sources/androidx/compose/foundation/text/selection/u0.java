package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.l2;
import androidx.compose.foundation.u1;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.t;
import androidx.compose.runtime.t4;
import androidx.compose.ui.platform.h1;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: TextFieldSelectionManager.android.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0018\u0010\t\u001a\u00020\u0006*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/q;", "Landroidx/compose/foundation/text/selection/s0;", "manager", "b", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/text/selection/s0;)Landroidx/compose/ui/q;", "Landroidx/compose/ui/input/pointer/p;", "", "a", "(Landroidx/compose/ui/input/pointer/p;)Z", "isShiftPressed", "Landroidx/compose/ui/unit/u;", "magnifierSize", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class u0 {

    /* compiled from: TextFieldSelectionManager.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/q;", "c", "(Landroidx/compose/ui/q;Landroidx/compose/runtime/t;I)Landroidx/compose/ui/q;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nTextFieldSelectionManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionManager.android.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager_androidKt$textFieldMagnifier$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,67:1\n74#2:68\n25#3:69\n1116#4,6:70\n1116#4,6:76\n81#5:82\n107#5,2:83\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionManager.android.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager_androidKt$textFieldMagnifier$1\n*L\n46#1:68\n47#1:69\n47#1:70,6\n52#1:76,6\n47#1:82\n47#1:83,2\n*E\n"})
    static final class a extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.ui.q, androidx.compose.runtime.t, Integer, androidx.compose.ui.q> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ s0 f8155b;

        /* compiled from: TextFieldSelectionManager.android.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li0/f;", "a", "()J"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.text.selection.u0$a$a, reason: collision with other inner class name */
        static final class C0159a extends kotlin.jvm.internal.n0 implements ld.a<i0.f> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ s0 f8156b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ k2<androidx.compose.ui.unit.u> f8157c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0159a(s0 s0Var, k2<androidx.compose.ui.unit.u> k2Var) {
                super(0);
                this.f8156b = s0Var;
                this.f8157c = k2Var;
            }

            public final long a() {
                return t0.b(this.f8156b, a.d(this.f8157c));
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ i0.f invoke() {
                return i0.f.d(a());
            }
        }

        /* compiled from: TextFieldSelectionManager.android.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function0;", "Li0/f;", "center", "Landroidx/compose/ui/q;", "a", "(Lld/a;)Landroidx/compose/ui/q;"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.l<ld.a<? extends i0.f>, androidx.compose.ui.q> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.unit.d f8158b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ k2<androidx.compose.ui.unit.u> f8159c;

            /* compiled from: TextFieldSelectionManager.android.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/unit/d;", "Li0/f;", "a", "(Landroidx/compose/ui/unit/d;)J"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.foundation.text.selection.u0$a$b$a, reason: collision with other inner class name */
            static final class C0160a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.unit.d, i0.f> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ld.a<i0.f> f8160b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0160a(ld.a<i0.f> aVar) {
                    super(1);
                    this.f8160b = aVar;
                }

                public final long a(@fg.l androidx.compose.ui.unit.d dVar) {
                    return this.f8160b.invoke().getPackedValue();
                }

                @Override // ld.l
                public /* bridge */ /* synthetic */ i0.f invoke(androidx.compose.ui.unit.d dVar) {
                    return i0.f.d(a(dVar));
                }
            }

            /* compiled from: TextFieldSelectionManager.android.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/unit/l;", "size", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.foundation.text.selection.u0$a$b$b, reason: collision with other inner class name */
            static final class C0161b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.unit.l, kotlin.k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ androidx.compose.ui.unit.d f8161b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ k2<androidx.compose.ui.unit.u> f8162c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0161b(androidx.compose.ui.unit.d dVar, k2<androidx.compose.ui.unit.u> k2Var) {
                    super(1);
                    this.f8161b = dVar;
                    this.f8162c = k2Var;
                }

                public final void a(long j4) {
                    k2<androidx.compose.ui.unit.u> k2Var = this.f8162c;
                    androidx.compose.ui.unit.d dVar = this.f8161b;
                    a.f(k2Var, androidx.compose.ui.unit.v.a(dVar.q2(androidx.compose.ui.unit.l.p(j4)), dVar.q2(androidx.compose.ui.unit.l.m(j4))));
                }

                @Override // ld.l
                public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.unit.l lVar) {
                    a(lVar.getPackedValue());
                    return kotlin.k2.f75408a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(androidx.compose.ui.unit.d dVar, k2<androidx.compose.ui.unit.u> k2Var) {
                super(1);
                this.f8158b = dVar;
                this.f8159c = k2Var;
            }

            @Override // ld.l
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.ui.q invoke(@fg.l ld.a<i0.f> aVar) {
                return u1.g(androidx.compose.ui.q.INSTANCE, new C0160a(aVar), null, new C0161b(this.f8158b, this.f8159c), 0.0f, true, 0L, 0.0f, 0.0f, false, l2.INSTANCE.a(), 490, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s0 s0Var) {
            super(3);
            this.f8155b = s0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long d(k2<androidx.compose.ui.unit.u> k2Var) {
            return k2Var.getValue().getPackedValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(k2<androidx.compose.ui.unit.u> k2Var, long j4) {
            k2Var.setValue(androidx.compose.ui.unit.u.b(j4));
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.q R(androidx.compose.ui.q qVar, androidx.compose.runtime.t tVar, Integer num) {
            return c(qVar, tVar, num.intValue());
        }

        @fg.l
        @androidx.compose.runtime.i
        public final androidx.compose.ui.q c(@fg.l androidx.compose.ui.q qVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            tVar.P(1980580247);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1980580247, i4, -1, "androidx.compose.foundation.text.selection.textFieldMagnifier.<anonymous> (TextFieldSelectionManager.android.kt:45)");
            }
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) tVar.x(h1.i());
            tVar.P(-492369756);
            Object Q = tVar.Q();
            t.Companion companion = androidx.compose.runtime.t.INSTANCE;
            if (Q == companion.a()) {
                androidx.compose.ui.unit.u.INSTANCE.getClass();
                Q = t4.g(androidx.compose.ui.unit.u.b(androidx.compose.ui.unit.u.f21529c), null, 2, null);
                tVar.E(Q);
            }
            tVar.p0();
            k2 k2Var = (k2) Q;
            C0159a c0159a = new C0159a(this.f8155b, k2Var);
            tVar.P(-233457119);
            boolean q02 = tVar.q0(k2Var) | tVar.q0(dVar);
            Object Q2 = tVar.Q();
            if (q02 || Q2 == companion.a()) {
                Q2 = new b(dVar, k2Var);
                tVar.E(Q2);
            }
            tVar.p0();
            androidx.compose.ui.q d5 = g0.d(qVar, c0159a, (ld.l) Q2);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return d5;
        }
    }

    public static final boolean a(@fg.l androidx.compose.ui.input.pointer.p pVar) {
        return false;
    }

    @fg.l
    public static final androidx.compose.ui.q b(@fg.l androidx.compose.ui.q qVar, @fg.l s0 s0Var) {
        return !u1.c(0, 1, null) ? qVar : androidx.compose.ui.i.j(qVar, null, new a(s0Var), 1, null);
    }
}
