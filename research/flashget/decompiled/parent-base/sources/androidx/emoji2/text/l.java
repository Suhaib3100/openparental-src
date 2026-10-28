package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.core.util.w;

/* compiled from: EmojiSpan.java */
@x0(19)
/* loaded from: classes3.dex */
public abstract class l extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final s f29472b;

    /* renamed from: a, reason: collision with root package name */
    private final Paint.FontMetricsInt f29471a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    private short f29473c = -1;

    /* renamed from: d, reason: collision with root package name */
    private short f29474d = -1;

    /* renamed from: e, reason: collision with root package name */
    private float f29475e = 1.0f;

    @c1({c1.a.LIBRARY})
    l(@o0 s sVar) {
        w.m(sVar, "rasterizer cannot be null");
        this.f29472b = sVar;
    }

    @c1({c1.a.TESTS})
    public final int a() {
        return this.f29474d;
    }

    @c1({c1.a.TESTS})
    public final int b() {
        return this.f29472b.g();
    }

    @c1({c1.a.LIBRARY})
    final float c() {
        return this.f29475e;
    }

    @o0
    public final s d() {
        return this.f29472b;
    }

    @c1({c1.a.LIBRARY})
    final int e() {
        return this.f29473c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@o0 Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i4, int i5, @q0 Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f29471a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f29471a;
        this.f29475e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f29472b.f();
        this.f29474d = (short) (this.f29472b.f() * this.f29475e);
        short k4 = (short) (this.f29472b.k() * this.f29475e);
        this.f29473c = k4;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f29471a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return k4;
    }
}
