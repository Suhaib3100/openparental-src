package androidx.constraintlayout.motion.widget;

import android.graphics.Canvas;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashMap;

/* compiled from: MotionHelperInterface.java */
/* loaded from: classes.dex */
public interface p extends a, MotionLayout.l {
    void b(MotionLayout motionLayout);

    void c(MotionLayout motionLayout, HashMap<View, o> controllerMap);

    void e(Canvas canvas);

    void g(Canvas canvas);

    boolean k();

    boolean l();

    boolean m();
}
