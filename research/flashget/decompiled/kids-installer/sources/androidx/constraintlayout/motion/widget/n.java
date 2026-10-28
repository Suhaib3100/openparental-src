package androidx.constraintlayout.motion.widget;

import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;

/* compiled from: KeyPositionBase.java */
/* loaded from: classes2.dex */
abstract class n extends f {

    /* renamed from: z, reason: collision with root package name */
    protected static final float f1919z = 20.0f;

    /* renamed from: y, reason: collision with root package name */
    int f1920y = f.f1803f;

    n() {
    }

    @Override // androidx.constraintlayout.motion.widget.f
    void b(HashSet<String> hashSet) {
    }

    abstract void j(int i5, int i6, float f6, float f7, float f8, float f9);

    abstract float k();

    abstract float l();

    public abstract boolean m(int i5, int i6, RectF rectF, RectF rectF2, float f6, float f7);

    abstract void n(View view, RectF rectF, RectF rectF2, float f6, float f7, String[] strArr, float[] fArr);
}
