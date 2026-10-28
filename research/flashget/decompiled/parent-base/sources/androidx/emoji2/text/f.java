package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.core.graphics.g0;
import androidx.emoji2.text.g;

/* compiled from: DefaultGlyphChecker.java */
@androidx.annotation.d
@c1({c1.a.LIBRARY})
/* loaded from: classes3.dex */
class f implements g.f {

    /* renamed from: b, reason: collision with root package name */
    private static final int f29277b = 10;

    /* renamed from: c, reason: collision with root package name */
    private static final ThreadLocal<StringBuilder> f29278c = new ThreadLocal<>();

    /* renamed from: a, reason: collision with root package name */
    private final TextPaint f29279a;

    f() {
        TextPaint textPaint = new TextPaint();
        this.f29279a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    private static StringBuilder b() {
        ThreadLocal<StringBuilder> threadLocal = f29278c;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return threadLocal.get();
    }

    @Override // androidx.emoji2.text.g.f
    public boolean a(@o0 CharSequence charSequence, int i4, int i5, int i6) {
        StringBuilder b5 = b();
        b5.setLength(0);
        while (i4 < i5) {
            b5.append(charSequence.charAt(i4));
            i4++;
        }
        return g0.a(this.f29279a, b5.toString());
    }
}
