package androidx.compose.ui.text.platform.style;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.internal.u;
import androidx.compose.ui.graphics.drawscope.i;
import androidx.compose.ui.graphics.drawscope.n;
import androidx.compose.ui.graphics.h5;
import androidx.compose.ui.graphics.i6;
import androidx.compose.ui.graphics.j6;
import androidx.compose.ui.graphics.x0;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: DrawStyleSpan.android.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/platform/style/a;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "Landroidx/compose/ui/graphics/drawscope/i;", "drawStyle", "<init>", "(Landroidx/compose/ui/graphics/drawscope/i;)V", "Landroidx/compose/ui/graphics/j6;", "Landroid/graphics/Paint$Join;", "c", "(I)Landroid/graphics/Paint$Join;", "Landroidx/compose/ui/graphics/i6;", "Landroid/graphics/Paint$Cap;", "b", "(I)Landroid/graphics/Paint$Cap;", "Landroid/text/TextPaint;", "textPaint", "Lkotlin/k2;", "updateDrawState", "(Landroid/text/TextPaint;)V", "a", "Landroidx/compose/ui/graphics/drawscope/i;", "()Landroidx/compose/ui/graphics/drawscope/i;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a extends CharacterStyle implements UpdateAppearance {

    /* renamed from: b, reason: collision with root package name */
    public static final int f21279b = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final i drawStyle;

    public a(@l i iVar) {
        this.drawStyle = iVar;
    }

    private final Paint.Cap b(int i4) {
        i6.Companion companion = i6.INSTANCE;
        companion.getClass();
        if (i6.g(i4, i6.f17861c)) {
            return Paint.Cap.BUTT;
        }
        companion.getClass();
        if (i6.g(i4, i6.f17862d)) {
            return Paint.Cap.ROUND;
        }
        companion.getClass();
        return i6.g(i4, i6.f17863e) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
    }

    private final Paint.Join c(int i4) {
        j6.Companion companion = j6.INSTANCE;
        companion.getClass();
        if (j6.g(i4, j6.f17869c)) {
            return Paint.Join.MITER;
        }
        companion.getClass();
        if (j6.g(i4, j6.f17870d)) {
            return Paint.Join.ROUND;
        }
        companion.getClass();
        return j6.g(i4, j6.f17871e) ? Paint.Join.BEVEL : Paint.Join.MITER;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final i getDrawStyle() {
        return this.drawStyle;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@m TextPaint textPaint) {
        if (textPaint != null) {
            i iVar = this.drawStyle;
            if (l0.g(iVar, androidx.compose.ui.graphics.drawscope.m.f17797a)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (iVar instanceof n) {
                textPaint.setStyle(Paint.Style.STROKE);
                textPaint.setStrokeWidth(((n) this.drawStyle).getWidth());
                textPaint.setStrokeMiter(((n) this.drawStyle).getMiter());
                textPaint.setStrokeJoin(c(((n) this.drawStyle).getJoin()));
                textPaint.setStrokeCap(b(((n) this.drawStyle).getCap()));
                h5 pathEffect = ((n) this.drawStyle).getPathEffect();
                textPaint.setPathEffect(pathEffect != null ? x0.e(pathEffect) : null);
            }
        }
    }
}
