package androidx.compose.runtime.changelist;

import androidx.compose.runtime.a4;
import androidx.compose.runtime.d2;
import androidx.compose.runtime.e2;
import androidx.compose.runtime.f2;
import androidx.compose.runtime.f3;
import androidx.compose.runtime.h3;
import androidx.compose.runtime.n0;
import androidx.compose.runtime.s1;
import androidx.compose.runtime.x;
import androidx.compose.runtime.x3;
import androidx.compose.runtime.z;
import fg.m;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.q0;

/* compiled from: Operation.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a/\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/runtime/a4;", "slots", "Landroidx/compose/runtime/e;", "", "applier", "", "index", "Lkotlin/k2;", "f", "(Landroidx/compose/runtime/a4;Landroidx/compose/runtime/e;I)V", "d", "(Landroidx/compose/runtime/a4;)I", "Landroidx/compose/runtime/d;", "anchor", "e", "(Landroidx/compose/runtime/a4;Landroidx/compose/runtime/d;Landroidx/compose/runtime/e;)I", "Landroidx/compose/runtime/n0;", "composition", "Landroidx/compose/runtime/z;", "parentContext", "Landroidx/compose/runtime/f2;", "reference", "g", "(Landroidx/compose/runtime/n0;Landroidx/compose/runtime/z;Landroidx/compose/runtime/f2;Landroidx/compose/runtime/a4;)V", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/OperationKt\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n1#1,879:1\n166#2,8:880\n166#2,8:888\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/OperationKt\n*L\n809#1:880,8\n869#1:888,8\n*E\n"})
/* loaded from: classes.dex */
public final class i {

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"androidx/compose/runtime/changelist/i$a", "Landroidx/compose/runtime/h3;", "Landroidx/compose/runtime/f3;", "scope", "", "instance", "Landroidx/compose/runtime/s1;", "d", "(Landroidx/compose/runtime/f3;Ljava/lang/Object;)Landroidx/compose/runtime/s1;", "Lkotlin/k2;", "c", "(Landroidx/compose/runtime/f3;)V", "value", "a", "(Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/OperationKt$releaseMovableGroupAtCurrent$movableContentRecomposeScopeOwner$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,879:1\n1#2:880\n*E\n"})
    public static final class a implements h3 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n0 f16073b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f2 f16074c;

        a(n0 n0Var, f2 f2Var) {
            this.f16073b = n0Var;
            this.f16074c = f2Var;
        }

        @Override // androidx.compose.runtime.h3
        public void a(@fg.l Object value) {
        }

        @Override // androidx.compose.runtime.h3
        public void c(@fg.l f3 scope) {
        }

        @Override // androidx.compose.runtime.h3
        @fg.l
        public s1 d(@fg.l f3 scope, @m Object instance) {
            s1 s1Var;
            n0 n0Var = this.f16073b;
            androidx.compose.runtime.collection.d dVar = null;
            h3 h3Var = n0Var instanceof h3 ? (h3) n0Var : null;
            if (h3Var == null || (s1Var = h3Var.d(scope, instance)) == null) {
                s1Var = s1.IGNORED;
            }
            if (s1Var != s1.IGNORED) {
                return s1Var;
            }
            f2 f2Var = this.f16074c;
            List<q0<f3, androidx.compose.runtime.collection.d<Object>>> d5 = f2Var.d();
            if (instance != null) {
                dVar = new androidx.compose.runtime.collection.d();
                dVar.add(dVar);
            }
            f2Var.h(w.E4(d5, new q0(scope, dVar)));
            return s1.SCHEDULED;
        }
    }

    private static final int d(a4 a4Var) {
        int currentGroup = a4Var.getCurrentGroup();
        int parent = a4Var.getParent();
        while (parent >= 0 && !a4Var.B0(parent)) {
            parent = a4Var.R0(parent);
        }
        int i4 = parent + 1;
        int i5 = 0;
        while (i4 < currentGroup) {
            if (a4Var.u0(currentGroup, i4)) {
                if (a4Var.B0(i4)) {
                    i5 = 0;
                }
                i4++;
            } else {
                i5 += a4Var.B0(i4) ? 1 : a4Var.P0(i4);
                i4 += a4Var.p0(i4);
            }
        }
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(a4 a4Var, androidx.compose.runtime.d dVar, androidx.compose.runtime.e<Object> eVar) {
        int H = a4Var.H(dVar);
        x.l0(a4Var.getCurrentGroup() < H);
        f(a4Var, eVar, H);
        int d5 = d(a4Var);
        while (a4Var.getCurrentGroup() < H) {
            if (a4Var.t0(H)) {
                if (a4Var.A0()) {
                    eVar.i(a4Var.N0(a4Var.getCurrentGroup()));
                    d5 = 0;
                }
                a4Var.u1();
            } else {
                d5 += a4Var.m1();
            }
        }
        x.l0(a4Var.getCurrentGroup() == H);
        return d5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(a4 a4Var, androidx.compose.runtime.e<Object> eVar, int i4) {
        while (!a4Var.v0(i4)) {
            a4Var.n1();
            if (a4Var.B0(a4Var.getParent())) {
                eVar.k();
            }
            a4Var.W();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(n0 n0Var, z zVar, f2 f2Var, a4 a4Var) {
        x3 x3Var = new x3();
        a4 e02 = x3Var.e0();
        try {
            e02.K();
            e02.w1(d2.f16148a, f2Var.c());
            a4.E0(e02, 0, 1, null);
            e02.B1(f2Var.getParameter());
            List<androidx.compose.runtime.d> M0 = a4Var.M0(f2Var.getAnchor(), 1, e02);
            e02.m1();
            e02.W();
            e02.X();
            e02.N();
            e2 e2Var = new e2(x3Var);
            f3.Companion companion = f3.INSTANCE;
            if (companion.b(x3Var, M0)) {
                try {
                    companion.a(x3Var.e0(), M0, new a(n0Var, f2Var));
                    k2 k2Var = k2.f75408a;
                } finally {
                }
            }
            zVar.n(f2Var, e2Var);
        } finally {
        }
    }
}
