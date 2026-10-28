package androidx.constraintlayout.motion.widget;

import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;

/* compiled from: KeyPositionBase.java */
/* loaded from: classes.dex */
abstract class k extends f {
    protected static final float E = 20.0f;
    int D = f.f23308f;

    k() {
    }

    @Override // androidx.constraintlayout.motion.widget.f
    void d(HashSet<String> attributes) {
    }

    abstract void o(int layoutWidth, int layoutHeight, float start_x, float start_y, float end_x, float end_y);

    abstract float p();

    abstract float q();

    public abstract boolean r(int layoutWidth, int layoutHeight, RectF start, RectF end, float x4, float y4);

    abstract void s(View view, RectF start, RectF end, float x4, float y4, String[] attribute, float[] value);
}
