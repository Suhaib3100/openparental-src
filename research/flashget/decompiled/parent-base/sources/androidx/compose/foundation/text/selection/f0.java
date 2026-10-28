package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.q;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.k1;
import kotlin.k2;

/* compiled from: SelectionLayout.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aJ\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0015\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0017\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001f\u0010\u001b\u001a\u00020\b*\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001f\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/ui/text/n0;", "layoutResult", "", "rawStartHandleOffset", "rawEndHandleOffset", "rawPreviousHandleOffset", "Landroidx/compose/ui/text/t0;", "previousSelectionRange", "", "isStartOfSelection", "isStartHandle", "Landroidx/compose/foundation/text/selection/d0;", "c", "(Landroidx/compose/ui/text/n0;IIIJZZ)Landroidx/compose/foundation/text/selection/d0;", "Landroidx/compose/foundation/text/selection/f;", "x", "y", "f", "(Landroidx/compose/foundation/text/selection/f;Landroidx/compose/foundation/text/selection/f;)Landroidx/compose/foundation/text/selection/f;", "offset", "Landroidx/compose/ui/text/style/i;", "b", "(Landroidx/compose/ui/text/n0;I)Landroidx/compose/ui/text/style/i;", "e", "(Landroidx/compose/ui/text/n0;I)Z", "Landroidx/compose/foundation/text/selection/q;", "layout", "d", "(Landroidx/compose/foundation/text/selection/q;Landroidx/compose/foundation/text/selection/d0;)Z", "a", "I", "UNASSIGNED_SLOT", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7955a = -1;

    /* compiled from: SelectionLayout.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7956a;

        static {
            int[] iArr = new int[f.values().length];
            try {
                iArr[f.BEFORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.AFTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f7956a = iArr;
        }
    }

    /* compiled from: SelectionLayout.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/text/selection/p;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/text/selection/p;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<p, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.a f7957b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(k1.a aVar) {
            super(1);
            this.f7957b = aVar;
        }

        public final void a(@fg.l p pVar) {
            if (pVar.c().length() > 0) {
                this.f7957b.f75322b = false;
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(p pVar) {
            a(pVar);
            return k2.f75408a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.style.i b(androidx.compose.ui.text.n0 n0Var, int i4) {
        return e(n0Var, i4) ? n0Var.y(i4) : n0Var.c(i4);
    }

    @fg.l
    public static final d0 c(@fg.l androidx.compose.ui.text.n0 n0Var, int i4, int i5, int i6, long j4, boolean z4, boolean z5) {
        q qVar;
        if (z4) {
            qVar = null;
        } else {
            int i7 = (int) (4294967295L & j4);
            qVar = new q(new q.a(b(n0Var, androidx.compose.ui.text.t0.n(j4)), (int) (j4 >> 32), 1L), new q.a(b(n0Var, i7), i7, 1L), androidx.compose.ui.text.t0.m(j4));
        }
        return new q0(z5, 1, 1, qVar, new p(1L, 1, i4, i5, i6, n0Var));
    }

    public static final boolean d(@fg.m q qVar, @fg.m d0 d0Var) {
        if (qVar == null || d0Var == null) {
            return true;
        }
        if (qVar.h().h() == qVar.f().h()) {
            return qVar.h().g() == qVar.f().g();
        }
        if ((qVar.g() ? qVar.h() : qVar.f()).g() != 0) {
            return false;
        }
        if (d0Var.d().l() != (qVar.g() ? qVar.f() : qVar.h()).g()) {
            return false;
        }
        k1.a aVar = new k1.a();
        aVar.f75322b = true;
        d0Var.k(new b(aVar));
        return aVar.f75322b;
    }

    private static final boolean e(androidx.compose.ui.text.n0 n0Var, int i4) {
        if (n0Var.getLayoutInput().getText().length() == 0) {
            return true;
        }
        int q4 = n0Var.q(i4);
        return (i4 == 0 || q4 != n0Var.q(i4 + (-1))) && (i4 == n0Var.getLayoutInput().getText().length() || q4 != n0Var.q(i4 + 1));
    }

    @fg.l
    public static final f f(@fg.l f fVar, @fg.l f fVar2) {
        int[] iArr = a.f7956a;
        int i4 = iArr[fVar2.ordinal()];
        if (i4 == 1) {
            return f.BEFORE;
        }
        if (i4 != 2) {
            if (i4 == 3) {
                return f.AFTER;
            }
            throw new NoWhenBranchMatchedException();
        }
        int i5 = iArr[fVar.ordinal()];
        if (i5 == 1) {
            return f.BEFORE;
        }
        if (i5 == 2) {
            return f.ON;
        }
        if (i5 == 3) {
            return f.AFTER;
        }
        throw new NoWhenBranchMatchedException();
    }
}
