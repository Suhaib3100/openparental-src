package androidx.emoji2.viewsintegration;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;

/* compiled from: EmojiTransformationMethod.java */
@c1({c1.a.LIBRARY})
@x0(19)
/* loaded from: classes3.dex */
class h implements TransformationMethod {

    /* renamed from: a, reason: collision with root package name */
    @q0
    private final TransformationMethod f29557a;

    h(@q0 TransformationMethod transformationMethod) {
        this.f29557a = transformationMethod;
    }

    public TransformationMethod a() {
        return this.f29557a;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(@q0 CharSequence charSequence, @o0 View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f29557a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || androidx.emoji2.text.g.c().i() != 1) ? charSequence : androidx.emoji2.text.g.c().x(charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z4, int i4, Rect rect) {
        TransformationMethod transformationMethod = this.f29557a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z4, i4, rect);
        }
    }
}
