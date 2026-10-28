package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.annotation.o0;
import androidx.annotation.x0;
import java.util.stream.IntStream;

/* compiled from: UnprecomputeTextOnModificationSpannable.java */
/* loaded from: classes3.dex */
class u implements Spannable {

    /* renamed from: b, reason: collision with root package name */
    private boolean f29527b = false;

    /* renamed from: c, reason: collision with root package name */
    @o0
    private Spannable f29528c;

    /* compiled from: UnprecomputeTextOnModificationSpannable.java */
    @x0(24)
    private static class a {
        private a() {
        }

        static IntStream a(CharSequence charSequence) {
            return charSequence.chars();
        }

        static IntStream b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    /* compiled from: UnprecomputeTextOnModificationSpannable.java */
    static class b {
        b() {
        }

        boolean a(CharSequence charSequence) {
            return charSequence instanceof androidx.core.text.p;
        }
    }

    /* compiled from: UnprecomputeTextOnModificationSpannable.java */
    @x0(28)
    static class c extends b {
        c() {
        }

        @Override // androidx.emoji2.text.u.b
        boolean a(CharSequence charSequence) {
            return androidx.core.text.h.a(charSequence) || (charSequence instanceof androidx.core.text.p);
        }
    }

    u(@o0 Spannable spannable) {
        this.f29528c = spannable;
    }

    private void a() {
        Spannable spannable = this.f29528c;
        if (!this.f29527b && f().a(spannable)) {
            this.f29528c = new SpannableString(spannable);
        }
        this.f29527b = true;
    }

    static b f() {
        return Build.VERSION.SDK_INT < 28 ? new b() : new c();
    }

    @Override // java.lang.CharSequence
    public char charAt(int i4) {
        return this.f29528c.charAt(i4);
    }

    @Override // java.lang.CharSequence
    @o0
    @x0(api = 24)
    public IntStream chars() {
        return this.f29528c.chars();
    }

    @Override // java.lang.CharSequence
    @o0
    @x0(api = 24)
    public IntStream codePoints() {
        return this.f29528c.codePoints();
    }

    Spannable e() {
        return this.f29528c;
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f29528c.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f29528c.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f29528c.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i4, int i5, Class<T> cls) {
        return (T[]) this.f29528c.getSpans(i4, i5, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f29528c.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i4, int i5, Class cls) {
        return this.f29528c.nextSpanTransition(i4, i5, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        a();
        this.f29528c.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i4, int i5, int i6) {
        a();
        this.f29528c.setSpan(obj, i4, i5, i6);
    }

    @Override // java.lang.CharSequence
    @o0
    public CharSequence subSequence(int i4, int i5) {
        return this.f29528c.subSequence(i4, i5);
    }

    @Override // java.lang.CharSequence
    @o0
    public String toString() {
        return this.f29528c.toString();
    }

    u(@o0 Spanned spanned) {
        this.f29528c = new SpannableString(spanned);
    }

    u(@o0 CharSequence charSequence) {
        this.f29528c = new SpannableString(charSequence);
    }
}
