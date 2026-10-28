package androidx.compose.ui.text;

import androidx.compose.ui.graphics.c6;
import androidx.compose.ui.graphics.d2;
import androidx.compose.ui.graphics.g5;
import androidx.compose.ui.graphics.t1;
import androidx.compose.ui.graphics.v1;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Paragraph.android.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0014\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\u001d\u0010\u0016J\u001f\u0010\u001f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0017H&¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020!2\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b$\u0010#J\u0017\u0010&\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\rH&¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(H&ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b,\u0010\u000bJ,\u00103\u001a\u0002022\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\b\b\u0001\u00101\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u001d\u00105\u001a\u00020-2\u0006\u0010\b\u001a\u00020\u0002H&ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u00106J<\u0010?\u001a\u0002022\u0006\u00108\u001a\u0002072\b\b\u0002\u0010:\u001a\u0002092\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010=H&ø\u0001\u0000¢\u0006\u0004\b?\u0010@JR\u0010E\u001a\u0002022\u0006\u00108\u001a\u0002072\b\b\u0002\u0010:\u001a\u0002092\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010A2\b\b\u0002\u0010D\u001a\u00020CH&ø\u0001\u0000¢\u0006\u0004\bE\u0010FJZ\u0010J\u001a\u0002022\u0006\u00108\u001a\u0002072\u0006\u0010H\u001a\u00020G2\b\b\u0002\u0010I\u001a\u00020\r2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010A2\b\b\u0002\u0010D\u001a\u00020CH&ø\u0001\u0000¢\u0006\u0004\bJ\u0010KR\u0014\u0010N\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0014\u0010P\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bO\u0010MR\u0014\u0010R\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010MR\u0014\u0010T\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bS\u0010MR\u0014\u0010V\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bU\u0010MR\u0014\u0010X\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bW\u0010MR\u0014\u0010[\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0014\u0010^\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u001c\u0010b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0_8&X¦\u0004¢\u0006\u0006\u001a\u0004\b`\u0010a\u0082\u0001\u0001cø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006dÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/s;", "", "", "start", "end", "Landroidx/compose/ui/graphics/g5;", "t", "(II)Landroidx/compose/ui/graphics/g5;", "offset", "Li0/i;", "h", "(I)Li0/i;", "lineIndex", "", "d", "(I)F", "c", "g", "B", "q", "F", "n", "(I)I", "", "visibleEnd", "o", "(IZ)I", "m", "(I)Z", "z", "usePrimaryDirection", "u", "(IZ)F", "Landroidx/compose/ui/text/style/i;", "f", "(I)Landroidx/compose/ui/text/style/i;", "A", "vertical", "s", "(F)I", "Li0/f;", "position", "l", "(J)I", "e", "Landroidx/compose/ui/text/t0;", "range", "", "array", "arrayStart", "Lkotlin/k2;", "x", "(J[FI)V", "j", "(I)J", "Landroidx/compose/ui/graphics/v1;", "canvas", "Landroidx/compose/ui/graphics/d2;", "color", "Landroidx/compose/ui/graphics/c6;", "shadow", "Landroidx/compose/ui/text/style/k;", "textDecoration", "G", "(Landroidx/compose/ui/graphics/v1;JLandroidx/compose/ui/graphics/c6;Landroidx/compose/ui/text/style/k;)V", "Landroidx/compose/ui/graphics/drawscope/i;", "drawStyle", "Landroidx/compose/ui/graphics/k1;", "blendMode", "i", "(Landroidx/compose/ui/graphics/v1;JLandroidx/compose/ui/graphics/c6;Landroidx/compose/ui/text/style/k;Landroidx/compose/ui/graphics/drawscope/i;I)V", "Landroidx/compose/ui/graphics/t1;", "brush", "alpha", "w", "(Landroidx/compose/ui/graphics/v1;Landroidx/compose/ui/graphics/t1;FLandroidx/compose/ui/graphics/c6;Landroidx/compose/ui/text/style/k;Landroidx/compose/ui/graphics/drawscope/i;I)V", "getWidth", "()F", "width", "getHeight", "height", "b", "minIntrinsicWidth", "a", "maxIntrinsicWidth", "k", "firstBaseline", "y", "lastBaseline", "r", "()Z", "didExceedMaxLines", "p", "()I", "lineCount", "", "D", "()Ljava/util/List;", "placeholderRects", "Landroidx/compose/ui/text/b;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface s {

    /* compiled from: Paragraph.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
    }

    static void C(s sVar, v1 v1Var, long j4, c6 c6Var, androidx.compose.ui.text.style.k kVar, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-RPmYEkk");
        }
        if ((i4 & 2) != 0) {
            d2.INSTANCE.getClass();
            j4 = d2.f17778o;
        }
        sVar.G(v1Var, j4, (i4 & 4) != 0 ? null : c6Var, (i4 & 8) != 0 ? null : kVar);
    }

    static /* synthetic */ void E(s sVar, v1 v1Var, t1 t1Var, float f4, c6 c6Var, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.drawscope.i iVar, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-hn5TExg");
        }
        sVar.w(v1Var, t1Var, (i5 & 4) != 0 ? Float.NaN : f4, (i5 & 8) != 0 ? null : c6Var, (i5 & 16) != 0 ? null : kVar, (i5 & 32) != 0 ? null : iVar, (i5 & 64) != 0 ? androidx.compose.ui.graphics.drawscope.f.INSTANCE.a() : i4);
    }

    static /* synthetic */ int H(s sVar, int i4, boolean z4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEnd");
        }
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        return sVar.o(i4, z4);
    }

    static void v(s sVar, v1 v1Var, long j4, c6 c6Var, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.drawscope.i iVar, int i4, int i5, Object obj) {
        long j5;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-LG529CI");
        }
        if ((i5 & 2) != 0) {
            d2.INSTANCE.getClass();
            j5 = d2.f17778o;
        } else {
            j5 = j4;
        }
        sVar.i(v1Var, j5, (i5 & 4) != 0 ? null : c6Var, (i5 & 8) != 0 ? null : kVar, (i5 & 16) == 0 ? iVar : null, (i5 & 32) != 0 ? androidx.compose.ui.graphics.drawscope.f.INSTANCE.a() : i4);
    }

    @fg.l
    androidx.compose.ui.text.style.i A(int offset);

    float B(int lineIndex);

    @fg.l
    List<i0.i> D();

    float F(int lineIndex);

    void G(@fg.l v1 canvas, long color, @fg.m c6 shadow, @fg.m androidx.compose.ui.text.style.k textDecoration);

    float a();

    float b();

    float c(int lineIndex);

    float d(int lineIndex);

    @fg.l
    i0.i e(int offset);

    @fg.l
    androidx.compose.ui.text.style.i f(int offset);

    float g(int lineIndex);

    float getHeight();

    float getWidth();

    @fg.l
    i0.i h(int offset);

    void i(@fg.l v1 canvas, long color, @fg.m c6 shadow, @fg.m androidx.compose.ui.text.style.k textDecoration, @fg.m androidx.compose.ui.graphics.drawscope.i drawStyle, int blendMode);

    long j(int offset);

    float k();

    int l(long position);

    boolean m(int lineIndex);

    int n(int lineIndex);

    int o(int lineIndex, boolean visibleEnd);

    int p();

    float q(int lineIndex);

    boolean r();

    int s(float vertical);

    @fg.l
    g5 t(int start, int end);

    float u(int offset, boolean usePrimaryDirection);

    void w(@fg.l v1 canvas, @fg.l t1 brush, float alpha, @fg.m c6 shadow, @fg.m androidx.compose.ui.text.style.k textDecoration, @fg.m androidx.compose.ui.graphics.drawscope.i drawStyle, int blendMode);

    void x(long range, @fg.l float[] array, @androidx.annotation.g0(from = 0) int arrayStart);

    float y();

    int z(int offset);
}
