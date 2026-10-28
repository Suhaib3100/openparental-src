package androidx.compose.ui.text.input;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import kotlin.Metadata;

/* compiled from: CursorAnchorInfoBuilder.android.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\u001ak\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a3\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a;\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a#\u0010\u001f\u001a\u00020\f*\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "Landroidx/compose/ui/text/input/z0;", "textFieldValue", "Landroidx/compose/ui/text/input/p0;", "offsetMapping", "Landroidx/compose/ui/text/n0;", "textLayoutResult", "Landroid/graphics/Matrix;", "matrix", "Li0/i;", "innerTextFieldBounds", "decorationBoxBounds", "", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "Landroid/view/inputmethod/CursorAnchorInfo;", "b", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Landroidx/compose/ui/text/input/z0;Landroidx/compose/ui/text/input/p0;Landroidx/compose/ui/text/n0;Landroid/graphics/Matrix;Li0/i;Li0/i;ZZZZ)Landroid/view/inputmethod/CursorAnchorInfo;", "", "selectionStart", "e", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;ILandroidx/compose/ui/text/input/p0;Landroidx/compose/ui/text/n0;Li0/i;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "startOffset", "endOffset", "a", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;IILandroidx/compose/ui/text/input/p0;Landroidx/compose/ui/text/n0;Li0/i;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "", "x", "y", "d", "(Li0/i;FF)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k {
    /* JADX WARN: Code restructure failed: missing block: B:6:0x005d, code lost:
    
        if (d(r22, r8.x(), r8.j()) == false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final android.view.inputmethod.CursorAnchorInfo.Builder a(android.view.inputmethod.CursorAnchorInfo.Builder r17, int r18, int r19, androidx.compose.ui.text.input.p0 r20, androidx.compose.ui.text.n0 r21, i0.i r22) {
        /*
            r0 = r19
            r1 = r20
            r2 = r18
            r3 = r22
            int r4 = r1.b(r2)
            int r5 = r1.b(r0)
            int r6 = r5 - r4
            int r6 = r6 * 4
            float[] r6 = new float[r6]
            androidx.compose.ui.text.o r7 = r21.getMultiParagraph()
            long r8 = androidx.compose.ui.text.u0.b(r4, r5)
            r5 = 0
            r7.a(r8, r6, r5)
        L22:
            if (r2 >= r0) goto L8e
            int r5 = r1.b(r2)
            int r7 = r5 - r4
            int r7 = r7 * 4
            i0.i r8 = new i0.i
            r9 = r6[r7]
            int r10 = r7 + 1
            r10 = r6[r10]
            int r11 = r7 + 2
            r11 = r6[r11]
            int r7 = r7 + 3
            r7 = r6[r7]
            r8.<init>(r9, r10, r11, r7)
            boolean r7 = r3.R(r8)
            float r9 = r8.t()
            float r10 = r8.getTop()
            boolean r9 = d(r3, r9, r10)
            if (r9 == 0) goto L63
            float r9 = r8.x()
            float r10 = r8.j()
            boolean r9 = d(r3, r9, r10)
            if (r9 != 0) goto L60
            goto L63
        L60:
            r9 = r21
            goto L66
        L63:
            r7 = r7 | 2
            goto L60
        L66:
            androidx.compose.ui.text.style.i r5 = r9.c(r5)
            androidx.compose.ui.text.style.i r10 = androidx.compose.ui.text.style.i.Rtl
            if (r5 != r10) goto L73
            r5 = r7 | 4
            r16 = r5
            goto L75
        L73:
            r16 = r7
        L75:
            float r12 = r8.t()
            float r13 = r8.getTop()
            float r14 = r8.x()
            float r15 = r8.j()
            r10 = r17
            r11 = r2
            r10.addCharacterBounds(r11, r12, r13, r14, r15, r16)
            int r2 = r2 + 1
            goto L22
        L8e:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.input.k.a(android.view.inputmethod.CursorAnchorInfo$Builder, int, int, androidx.compose.ui.text.input.p0, androidx.compose.ui.text.n0, i0.i):android.view.inputmethod.CursorAnchorInfo$Builder");
    }

    @fg.l
    public static final CursorAnchorInfo b(@fg.l CursorAnchorInfo.Builder builder, @fg.l z0 z0Var, @fg.l p0 p0Var, @fg.l androidx.compose.ui.text.n0 n0Var, @fg.l Matrix matrix, @fg.l i0.i iVar, @fg.l i0.i iVar2, boolean z4, boolean z5, boolean z6, boolean z7) {
        builder.reset();
        builder.setMatrix(matrix);
        int l4 = androidx.compose.ui.text.t0.l(z0Var.getSelection());
        builder.setSelectionRange(l4, androidx.compose.ui.text.t0.k(z0Var.getSelection()));
        if (z4) {
            e(builder, l4, p0Var, n0Var, iVar);
        }
        if (z5) {
            androidx.compose.ui.text.t0 composition = z0Var.getComposition();
            int l5 = composition != null ? androidx.compose.ui.text.t0.l(composition.getPackedValue()) : -1;
            androidx.compose.ui.text.t0 composition2 = z0Var.getComposition();
            int k4 = composition2 != null ? androidx.compose.ui.text.t0.k(composition2.getPackedValue()) : -1;
            if (l5 >= 0 && l5 < k4) {
                builder.setComposingText(l5, z0Var.i().subSequence(l5, k4));
                a(builder, l5, k4, p0Var, n0Var, iVar);
            }
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 33 && z6) {
            h.a(builder, iVar2);
        }
        if (i4 >= 34 && z7) {
            j.a(builder, n0Var, iVar);
        }
        return builder.build();
    }

    private static final boolean d(i0.i iVar, float f4, float f5) {
        float t4 = iVar.t();
        if (f4 <= iVar.x() && t4 <= f4) {
            float top2 = iVar.getTop();
            if (f5 <= iVar.j() && top2 <= f5) {
                return true;
            }
        }
        return false;
    }

    private static final CursorAnchorInfo.Builder e(CursorAnchorInfo.Builder builder, int i4, p0 p0Var, androidx.compose.ui.text.n0 n0Var, i0.i iVar) {
        if (i4 < 0) {
            return builder;
        }
        int b5 = p0Var.b(i4);
        i0.i e4 = n0Var.e(b5);
        float H = kotlin.ranges.s.H(e4.t(), 0.0f, androidx.compose.ui.unit.u.m(n0Var.getSize()));
        boolean d5 = d(iVar, H, e4.getTop());
        boolean d6 = d(iVar, H, e4.j());
        boolean z4 = n0Var.c(b5) == androidx.compose.ui.text.style.i.Rtl;
        int i5 = (d5 || d6) ? 1 : 0;
        if (!d5 || !d6) {
            i5 |= 2;
        }
        builder.setInsertionMarkerLocation(H, e4.getTop(), e4.j(), e4.j(), z4 ? i5 | 4 : i5);
        return builder;
    }
}
