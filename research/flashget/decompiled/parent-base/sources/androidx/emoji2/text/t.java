package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.annotation.c1;
import androidx.annotation.g0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;

/* compiled from: TypefaceEmojiSpan.java */
@c1({c1.a.LIBRARY_GROUP})
@x0(19)
/* loaded from: classes3.dex */
public final class t extends l {

    /* renamed from: g, reason: collision with root package name */
    @q0
    private static Paint f29525g;

    /* renamed from: f, reason: collision with root package name */
    @q0
    private TextPaint f29526f;

    public t(@o0 s sVar) {
        super(sVar);
    }

    @q0
    private TextPaint f(@q0 CharSequence charSequence, int i4, int i5, Paint paint) {
        if (!(charSequence instanceof Spanned)) {
            if (paint instanceof TextPaint) {
                return (TextPaint) paint;
            }
            return null;
        }
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i4, i5, CharacterStyle.class);
        if (characterStyleArr.length != 0) {
            if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                TextPaint textPaint = this.f29526f;
                if (textPaint == null) {
                    textPaint = new TextPaint();
                    this.f29526f = textPaint;
                }
                textPaint.set(paint);
                for (CharacterStyle characterStyle : characterStyleArr) {
                    characterStyle.updateDrawState(textPaint);
                }
                return textPaint;
            }
        }
        if (paint instanceof TextPaint) {
            return (TextPaint) paint;
        }
        return null;
    }

    @o0
    private static Paint h() {
        if (f29525g == null) {
            TextPaint textPaint = new TextPaint();
            f29525g = textPaint;
            textPaint.setColor(g.c().g());
            f29525g.setStyle(Paint.Style.FILL);
        }
        return f29525g;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@o0 Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, @g0(from = 0) int i4, @g0(from = 0) int i5, float f4, int i6, int i7, int i10, @o0 Paint paint) {
        Paint paint2 = paint;
        TextPaint f5 = f(charSequence, i4, i5, paint2);
        if (f5 != null && f5.bgColor != 0) {
            g(canvas, f5, f4, f4 + e(), i6, i10);
        }
        if (g.c().r()) {
            canvas.drawRect(f4, i6, f4 + e(), i10, h());
        }
        s d5 = d();
        float f6 = i7;
        if (f5 != null) {
            paint2 = f5;
        }
        d5.a(canvas, f4, f6, paint2);
    }

    void g(Canvas canvas, TextPaint textPaint, float f4, float f5, float f6, float f7) {
        int color = textPaint.getColor();
        Paint.Style style = textPaint.getStyle();
        textPaint.setColor(textPaint.bgColor);
        textPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(f4, f6, f5, f7, textPaint);
        textPaint.setStyle(style);
        textPaint.setColor(color);
    }
}
