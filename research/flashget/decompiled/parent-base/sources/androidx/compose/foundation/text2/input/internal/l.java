package androidx.compose.foundation.text2.input.internal;

import androidx.collection.q2;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: EditCommand.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\n\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a#\u0010\f\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\f\u0010\u0007\u001a#\u0010\u000f\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u000f\u0010\u000b\u001a#\u0010\u0010\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0010\u0010\u000b\u001a\u0013\u0010\u0011\u001a\u00020\u0005*\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u0013\u001a\u00020\u0005*\u00020\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0012\u001a\u001b\u0010\u0015\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0017\u001a\u00020\u0005*\u00020\u0000H\u0000¢\u0006\u0004\b\u0017\u0010\u0012\u001a\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/m;", "", "text", "", "newCursorPosition", "Lkotlin/k2;", "b", "(Landroidx/compose/foundation/text2/input/internal/m;Ljava/lang/String;I)V", "start", "end", "i", "(Landroidx/compose/foundation/text2/input/internal/m;II)V", "j", "lengthBeforeCursor", "lengthAfterCursor", "d", "e", "f", "(Landroidx/compose/foundation/text2/input/internal/m;)V", "a", "amount", "h", "(Landroidx/compose/foundation/text2/input/internal/m;I)V", "c", "", "high", "low", "", "g", "(CC)Z", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nEditCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditCommand.kt\nandroidx/compose/foundation/text2/input/internal/EditCommandKt\n+ 2 MathUtils.kt\nandroidx/compose/foundation/text2/input/internal/MathUtilsKt\n*L\n1#1,298:1\n23#2,3:299\n32#2,4:302\n*S KotlinDebug\n*F\n+ 1 EditCommand.kt\nandroidx/compose/foundation/text2/input/internal/EditCommandKt\n*L\n156#1:299,3\n161#1:302,4\n*E\n"})
/* loaded from: classes.dex */
public final class l {
    public static final void a(@fg.l m mVar) {
        if (mVar.n()) {
            mVar.c(mVar.getCompositionStart(), mVar.getCompositionEnd());
            return;
        }
        if (mVar.i() != -1) {
            if (mVar.i() != 0) {
                mVar.c(androidx.compose.foundation.text.k0.b(mVar.toString(), mVar.i()), mVar.i());
            }
        } else {
            int selectionStart = mVar.getSelectionStart();
            int selectionEnd = mVar.getSelectionEnd();
            int selectionStart2 = mVar.getSelectionStart();
            mVar.r(selectionStart2, selectionStart2);
            mVar.c(selectionStart, selectionEnd);
        }
    }

    public static final void b(@fg.l m mVar, @fg.l String str, int i4) {
        if (mVar.n()) {
            mVar.o(mVar.getCompositionStart(), mVar.getCompositionEnd(), str);
        } else {
            mVar.o(mVar.getSelectionStart(), mVar.getSelectionEnd(), str);
        }
        int I = kotlin.ranges.s.I(i4 > 0 ? (r0 + i4) - 1 : (mVar.i() + i4) - str.length(), 0, mVar.j());
        mVar.r(I, I);
    }

    public static final void c(@fg.l m mVar) {
        mVar.o(0, mVar.j(), "");
    }

    public static final void d(@fg.l m mVar, int i4, int i5) {
        if (i4 < 0 || i5 < 0) {
            throw new IllegalArgumentException(q2.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", i4, " and ", i5, " respectively.").toString());
        }
        int selectionEnd = mVar.getSelectionEnd();
        int i6 = selectionEnd + i5;
        if (((i5 ^ i6) & (selectionEnd ^ i6)) < 0) {
            i6 = mVar.j();
        }
        mVar.c(mVar.getSelectionEnd(), Math.min(i6, mVar.j()));
        int selectionStart = mVar.getSelectionStart();
        int i7 = selectionStart - i4;
        if (((i4 ^ selectionStart) & (selectionStart ^ i7)) < 0) {
            i7 = 0;
        }
        mVar.c(Math.max(0, i7), mVar.getSelectionStart());
    }

    public static final void e(@fg.l m mVar, int i4, int i5) {
        if (i4 < 0 || i5 < 0) {
            throw new IllegalArgumentException(q2.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", i4, " and ", i5, " respectively.").toString());
        }
        int i6 = 0;
        for (int i7 = 0; i7 < i4; i7++) {
            int i10 = i6 + 1;
            i6 = (mVar.getSelectionStart() <= i10 || !g(mVar.d((mVar.getSelectionStart() - i10) + (-1)), mVar.d(mVar.getSelectionStart() - i10))) ? i10 : i6 + 2;
            if (i6 == mVar.getSelectionStart()) {
                break;
            }
        }
        int i11 = 0;
        for (int i12 = 0; i12 < i5; i12++) {
            int i13 = i11 + 1;
            i11 = (mVar.getSelectionEnd() + i13 >= mVar.j() || !g(mVar.d((mVar.getSelectionEnd() + i13) + (-1)), mVar.d(mVar.getSelectionEnd() + i13))) ? i13 : i11 + 2;
            if (mVar.getSelectionEnd() + i11 == mVar.j()) {
                break;
            }
        }
        mVar.c(mVar.getSelectionEnd(), mVar.getSelectionEnd() + i11);
        mVar.c(mVar.getSelectionStart() - i6, mVar.getSelectionStart());
    }

    public static final void f(@fg.l m mVar) {
        mVar.b();
    }

    private static final boolean g(char c5, char c6) {
        return Character.isHighSurrogate(c5) && Character.isLowSurrogate(c6);
    }

    public static final void h(@fg.l m mVar, int i4) {
        if (mVar.i() == -1) {
            int selectionStart = mVar.getSelectionStart();
            mVar.r(selectionStart, selectionStart);
        }
        int selectionStart2 = mVar.getSelectionStart();
        String mVar2 = mVar.toString();
        int i5 = 0;
        if (i4 <= 0) {
            int i6 = -i4;
            while (i5 < i6) {
                int b5 = androidx.compose.foundation.text.k0.b(mVar2, selectionStart2);
                if (b5 == -1) {
                    break;
                }
                i5++;
                selectionStart2 = b5;
            }
        } else {
            while (i5 < i4) {
                int a5 = androidx.compose.foundation.text.k0.a(mVar2, selectionStart2);
                if (a5 == -1) {
                    break;
                }
                i5++;
                selectionStart2 = a5;
            }
        }
        mVar.r(selectionStart2, selectionStart2);
    }

    public static final void i(@fg.l m mVar, int i4, int i5) {
        if (mVar.n()) {
            mVar.b();
        }
        int I = kotlin.ranges.s.I(i4, 0, mVar.j());
        int I2 = kotlin.ranges.s.I(i5, 0, mVar.j());
        if (I != I2) {
            if (I < I2) {
                mVar.p(I, I2);
            } else {
                mVar.p(I2, I);
            }
        }
    }

    public static final void j(@fg.l m mVar, @fg.l String str, int i4) {
        if (mVar.n()) {
            int compositionStart = mVar.getCompositionStart();
            mVar.o(compositionStart, mVar.getCompositionEnd(), str);
            if (str.length() > 0) {
                mVar.p(compositionStart, str.length() + compositionStart);
            }
        } else {
            int selectionStart = mVar.getSelectionStart();
            mVar.o(selectionStart, mVar.getSelectionEnd(), str);
            if (str.length() > 0) {
                mVar.p(selectionStart, str.length() + selectionStart);
            }
        }
        int I = kotlin.ranges.s.I(i4 > 0 ? (r0 + i4) - 1 : (mVar.i() + i4) - str.length(), 0, mVar.j());
        mVar.r(I, I);
    }
}
