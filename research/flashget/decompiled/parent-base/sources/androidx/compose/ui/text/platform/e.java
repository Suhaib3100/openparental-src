package androidx.compose.ui.text.platform;

import android.graphics.Matrix;
import android.graphics.Shader;
import androidx.compose.ui.graphics.a6;
import androidx.compose.ui.graphics.c6;
import androidx.compose.ui.graphics.g6;
import androidx.compose.ui.graphics.k1;
import androidx.compose.ui.graphics.t1;
import androidx.compose.ui.graphics.u1;
import androidx.compose.ui.graphics.v1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: AndroidMultiParagraphDraw.android.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a^\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aT\u0010\u0012\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/o;", "Landroidx/compose/ui/graphics/v1;", "canvas", "Landroidx/compose/ui/graphics/t1;", "brush", "", "alpha", "Landroidx/compose/ui/graphics/c6;", "shadow", "Landroidx/compose/ui/text/style/k;", "decoration", "Landroidx/compose/ui/graphics/drawscope/i;", "drawStyle", "Landroidx/compose/ui/graphics/k1;", "blendMode", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/text/o;Landroidx/compose/ui/graphics/v1;Landroidx/compose/ui/graphics/t1;FLandroidx/compose/ui/graphics/c6;Landroidx/compose/ui/text/style/k;Landroidx/compose/ui/graphics/drawscope/i;I)V", "c", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAndroidMultiParagraphDraw.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidMultiParagraphDraw.android.kt\nandroidx/compose/ui/text/platform/AndroidMultiParagraphDraw_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,95:1\n33#2,6:96\n33#2,6:102\n33#2,6:108\n*S KotlinDebug\n*F\n+ 1 AndroidMultiParagraphDraw.android.kt\nandroidx/compose/ui/text/platform/AndroidMultiParagraphDraw_androidKt\n*L\n53#1:96,6\n60#1:102,6\n90#1:108,6\n*E\n"})
/* loaded from: classes.dex */
public final class e {
    public static final void a(@fg.l androidx.compose.ui.text.o oVar, @fg.l v1 v1Var, @fg.l t1 t1Var, float f4, @fg.m c6 c6Var, @fg.m androidx.compose.ui.text.style.k kVar, @fg.m androidx.compose.ui.graphics.drawscope.i iVar, int i4) {
        v1Var.C();
        if (oVar.C().size() <= 1) {
            c(oVar, v1Var, t1Var, f4, c6Var, kVar, iVar, i4);
        } else if (t1Var instanceof g6) {
            c(oVar, v1Var, t1Var, f4, c6Var, kVar, iVar, i4);
        } else if (t1Var instanceof a6) {
            List<androidx.compose.ui.text.t> C = oVar.C();
            int size = C.size();
            float f5 = 0.0f;
            float f6 = 0.0f;
            for (int i5 = 0; i5 < size; i5++) {
                androidx.compose.ui.text.t tVar = C.get(i5);
                f6 += tVar.n().getHeight();
                f5 = Math.max(f5, tVar.n().getWidth());
            }
            Shader c5 = ((a6) t1Var).c(i0.o.a(f5, f6));
            Matrix matrix = new Matrix();
            c5.getLocalMatrix(matrix);
            List<androidx.compose.ui.text.t> C2 = oVar.C();
            int size2 = C2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                androidx.compose.ui.text.t tVar2 = C2.get(i6);
                tVar2.n().w(v1Var, u1.a(c5), f4, c6Var, kVar, iVar, i4);
                v1Var.translate(0.0f, tVar2.n().getHeight());
                matrix.setTranslate(0.0f, -tVar2.n().getHeight());
                c5.setLocalMatrix(matrix);
            }
        }
        v1Var.o();
    }

    public static void b(androidx.compose.ui.text.o oVar, v1 v1Var, t1 t1Var, float f4, c6 c6Var, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.drawscope.i iVar, int i4, int i5, Object obj) {
        int i6;
        float f5 = (i5 & 4) != 0 ? Float.NaN : f4;
        c6 c6Var2 = (i5 & 8) != 0 ? null : c6Var;
        androidx.compose.ui.text.style.k kVar2 = (i5 & 16) != 0 ? null : kVar;
        androidx.compose.ui.graphics.drawscope.i iVar2 = (i5 & 32) != 0 ? null : iVar;
        if ((i5 & 64) != 0) {
            k1.INSTANCE.getClass();
            i6 = k1.f17877f;
        } else {
            i6 = i4;
        }
        a(oVar, v1Var, t1Var, f5, c6Var2, kVar2, iVar2, i6);
    }

    private static final void c(androidx.compose.ui.text.o oVar, v1 v1Var, t1 t1Var, float f4, c6 c6Var, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.drawscope.i iVar, int i4) {
        List<androidx.compose.ui.text.t> C = oVar.C();
        int size = C.size();
        for (int i5 = 0; i5 < size; i5++) {
            androidx.compose.ui.text.t tVar = C.get(i5);
            tVar.n().w(v1Var, t1Var, f4, c6Var, kVar, iVar, i4);
            v1Var.translate(0.0f, tVar.n().getHeight());
        }
    }
}
