package s0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.compose.runtime.internal.u;
import kotlin.Metadata;

/* compiled from: ShadowSpan.kt */
@u(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Ls0/l;", "Landroid/text/style/CharacterStyle;", "", "color", "", "offsetX", "offsetY", "radius", "<init>", "(IFFF)V", "Landroid/text/TextPaint;", "tp", "Lkotlin/k2;", "updateDrawState", "(Landroid/text/TextPaint;)V", "a", "I", "()I", "b", "F", "()F", "c", "d", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l extends CharacterStyle {

    /* renamed from: e, reason: collision with root package name */
    public static final int f90138e = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int color;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float offsetX;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float offsetY;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float radius;

    public l(int i4, float f4, float f5, float f6) {
        this.color = i4;
        this.offsetX = f4;
        this.offsetY = f5;
        this.radius = f6;
    }

    /* renamed from: a, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* renamed from: b, reason: from getter */
    public final float getOffsetX() {
        return this.offsetX;
    }

    /* renamed from: c, reason: from getter */
    public final float getOffsetY() {
        return this.offsetY;
    }

    /* renamed from: d, reason: from getter */
    public final float getRadius() {
        return this.radius;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@fg.l TextPaint tp) {
        tp.setShadowLayer(this.radius, this.offsetX, this.offsetY, this.color);
    }
}
