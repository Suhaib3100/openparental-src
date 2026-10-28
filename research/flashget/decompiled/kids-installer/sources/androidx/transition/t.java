package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* compiled from: RectEvaluator.java */
/* loaded from: classes.dex */
class t implements TypeEvaluator<Rect> {

    /* renamed from: a, reason: collision with root package name */
    private Rect f10070a;

    t() {
    }

    @Override // android.animation.TypeEvaluator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Rect evaluate(float f6, Rect rect, Rect rect2) {
        int i5 = rect.left + ((int) ((rect2.left - r0) * f6));
        int i6 = rect.top + ((int) ((rect2.top - r1) * f6));
        int i7 = rect.right + ((int) ((rect2.right - r2) * f6));
        int i8 = rect.bottom + ((int) ((rect2.bottom - r6) * f6));
        Rect rect3 = this.f10070a;
        if (rect3 == null) {
            return new Rect(i5, i6, i7, i8);
        }
        rect3.set(i5, i6, i7, i8);
        return this.f10070a;
    }

    t(Rect rect) {
        this.f10070a = rect;
    }
}
