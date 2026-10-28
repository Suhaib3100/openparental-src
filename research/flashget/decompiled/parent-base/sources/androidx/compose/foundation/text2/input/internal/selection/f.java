package androidx.compose.foundation.text2.input.internal.selection;

import androidx.compose.foundation.text.o;
import androidx.compose.foundation.text.selection.i0;
import androidx.compose.foundation.text2.input.internal.j0;
import androidx.compose.foundation.text2.input.internal.k0;
import androidx.compose.foundation.text2.input.internal.m0;
import androidx.compose.ui.text.n0;
import androidx.compose.ui.text.t0;
import androidx.compose.ui.unit.u;
import fg.l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.r1;
import kotlin.ranges.s;

/* compiled from: TextFieldMagnifier.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a2\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/m0;", "textFieldState", "Landroidx/compose/foundation/text2/input/internal/selection/i;", "selectionState", "Landroidx/compose/foundation/text2/input/internal/j0;", "textLayoutState", "Landroidx/compose/ui/unit/u;", "magnifierSize", "Li0/f;", "a", "(Landroidx/compose/foundation/text2/input/internal/m0;Landroidx/compose/foundation/text2/input/internal/selection/i;Landroidx/compose/foundation/text2/input/internal/j0;J)J", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextFieldMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldMagnifier.kt\nandroidx/compose/foundation/text2/input/internal/selection/TextFieldMagnifierKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,118:1\n1#2:119\n*E\n"})
/* loaded from: classes.dex */
public final class f {

    /* compiled from: TextFieldMagnifier.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8756a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.Cursor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.SelectionStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.SelectionEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f8756a = iArr;
        }
    }

    public static final long a(@l m0 m0Var, @l i iVar, @l j0 j0Var, long j4) {
        int n4;
        long d02 = iVar.d0();
        if (i0.g.f(d02) || m0Var.k().length() == 0) {
            i0.f.INSTANCE.getClass();
            return i0.f.f74149e;
        }
        long selectionInChars = m0Var.k().getSelectionInChars();
        o a02 = iVar.a0();
        int i4 = a02 == null ? -1 : a.f8756a[a02.ordinal()];
        if (i4 == -1) {
            i0.f.INSTANCE.getClass();
            return i0.f.f74149e;
        }
        if (i4 == 1 || i4 == 2) {
            n4 = t0.n(selectionInChars);
        } else {
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            n4 = t0.i(selectionInChars);
        }
        n0 e4 = j0Var.e();
        if (e4 == null) {
            i0.f.INSTANCE.getClass();
            return i0.f.f74149e;
        }
        float p4 = i0.f.p(d02);
        int q4 = e4.q(n4);
        float s4 = e4.s(q4);
        float t4 = e4.t(q4);
        float H = s.H(p4, Math.min(s4, t4), Math.max(s4, t4));
        if (Math.abs(p4 - H) > u.m(j4) / 2) {
            i0.f.INSTANCE.getClass();
            return i0.f.f74149e;
        }
        float v4 = e4.v(q4);
        long a5 = i0.g.a(H, ((e4.m(q4) - v4) / 2) + v4);
        androidx.compose.ui.layout.u j5 = j0Var.j();
        if (j5 != null) {
            if (!j5.f()) {
                j5 = null;
            }
            if (j5 != null) {
                a5 = k0.a(a5, i0.i(j5));
            }
        }
        return k0.c(j0Var, a5);
    }
}
