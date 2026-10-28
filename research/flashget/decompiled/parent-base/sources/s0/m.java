package s0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.runtime.internal.u;
import kotlin.Metadata;

/* compiled from: SkewXSpan.kt */
@u(parameters = 1)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Ls0/m;", "Landroid/text/style/MetricAffectingSpan;", "", "skewX", "<init>", "(F)V", "Landroid/text/TextPaint;", "textPaint", "Lkotlin/k2;", "updateDrawState", "(Landroid/text/TextPaint;)V", "updateMeasureState", "a", "F", "()F", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class m extends MetricAffectingSpan {

    /* renamed from: b, reason: collision with root package name */
    public static final int f90143b = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float skewX;

    public m(float f4) {
        this.skewX = f4;
    }

    /* renamed from: a, reason: from getter */
    public final float getSkewX() {
        return this.skewX;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@fg.l TextPaint textPaint) {
        textPaint.setTextSkewX(textPaint.getTextSkewX() + this.skewX);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@fg.l TextPaint textPaint) {
        textPaint.setTextSkewX(textPaint.getTextSkewX() + this.skewX);
    }
}
