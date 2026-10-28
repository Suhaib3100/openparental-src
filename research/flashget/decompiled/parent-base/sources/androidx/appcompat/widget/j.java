package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import d.a;

/* compiled from: AppCompatEmojiTextHelper.java */
/* loaded from: classes.dex */
class j {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.o0
    private final TextView f1888a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.o0
    private final androidx.emoji2.viewsintegration.f f1889b;

    j(@androidx.annotation.o0 TextView textView) {
        this.f1888a = textView;
        this.f1889b = new androidx.emoji2.viewsintegration.f(textView, false);
    }

    @androidx.annotation.o0
    InputFilter[] a(@androidx.annotation.o0 InputFilter[] inputFilterArr) {
        return this.f1889b.a(inputFilterArr);
    }

    public boolean b() {
        return this.f1889b.b();
    }

    void c(@androidx.annotation.q0 AttributeSet attributeSet, int i4) {
        TypedArray obtainStyledAttributes = this.f1888a.getContext().obtainStyledAttributes(attributeSet, a.m.f73595v0, i4, 0);
        try {
            int i5 = a.m.K0;
            boolean z4 = obtainStyledAttributes.hasValue(i5) ? obtainStyledAttributes.getBoolean(i5, true) : true;
            obtainStyledAttributes.recycle();
            e(z4);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    void d(boolean z4) {
        this.f1889b.c(z4);
    }

    void e(boolean z4) {
        this.f1889b.d(z4);
    }

    @androidx.annotation.q0
    public TransformationMethod f(@androidx.annotation.q0 TransformationMethod transformationMethod) {
        return this.f1889b.f(transformationMethod);
    }
}
