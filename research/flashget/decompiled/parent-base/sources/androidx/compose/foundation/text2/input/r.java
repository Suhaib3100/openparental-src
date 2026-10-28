package androidx.compose.foundation.text2.input;

import androidx.compose.foundation.z0;
import androidx.compose.ui.text.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: TextFieldCharSequence.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a&\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a.\u0010\t\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a3\u0010\u0012\u001a\u00020\u0011*\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0015\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0014\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0017\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0014\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0017\u0010\u0016\u001a\u0013\u0010\u0018\u001a\u00020\u0007*\u00020\u0004H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"", "text", "Landroidx/compose/ui/text/t0;", "selection", "Landroidx/compose/foundation/text2/input/q;", "c", "(Ljava/lang/String;J)Landroidx/compose/foundation/text2/input/q;", "", "composition", "a", "(Ljava/lang/CharSequence;JLandroidx/compose/ui/text/t0;)Landroidx/compose/foundation/text2/input/q;", "", "destination", "", "destinationOffset", "sourceStartIndex", "sourceEndIndex", "Lkotlin/k2;", "h", "(Landroidx/compose/foundation/text2/input/q;[CIII)V", "maxChars", "g", "(Landroidx/compose/foundation/text2/input/q;I)Ljava/lang/CharSequence;", "f", "e", "(Landroidx/compose/foundation/text2/input/q;)Ljava/lang/CharSequence;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r {
    @fg.l
    public static final q a(@fg.l CharSequence charSequence, long j4, @fg.m t0 t0Var) {
        return new s(charSequence, j4, t0Var, null);
    }

    public static /* synthetic */ q b(CharSequence charSequence, long j4, t0 t0Var, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            t0Var = null;
        }
        return a(charSequence, j4, t0Var);
    }

    @fg.l
    @z0
    public static final q c(@fg.l String str, long j4) {
        return new s(str, j4, null, null);
    }

    public static q d(String str, long j4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = "";
        }
        if ((i4 & 2) != 0) {
            t0.INSTANCE.getClass();
            j4 = t0.f21417c;
        }
        return c(str, j4);
    }

    @fg.l
    public static final CharSequence e(@fg.l q qVar) {
        return qVar.subSequence(t0.l(qVar.getSelectionInChars()), t0.k(qVar.getSelectionInChars()));
    }

    @fg.l
    public static final CharSequence f(@fg.l q qVar, int i4) {
        return qVar.subSequence(t0.k(qVar.getSelectionInChars()), Math.min(t0.k(qVar.getSelectionInChars()) + i4, qVar.length()));
    }

    @fg.l
    public static final CharSequence g(@fg.l q qVar, int i4) {
        return qVar.subSequence(Math.max(0, t0.l(qVar.getSelectionInChars()) - i4), t0.l(qVar.getSelectionInChars()));
    }

    public static final void h(@fg.l q qVar, @fg.l char[] cArr, int i4, int i5, int i6) {
        l0.n(qVar, "null cannot be cast to non-null type androidx.compose.foundation.text2.input.TextFieldCharSequenceWrapper");
        ((s) qVar).f(cArr, i4, i5, i6);
    }
}
