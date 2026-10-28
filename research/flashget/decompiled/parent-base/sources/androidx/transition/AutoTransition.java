package androidx.transition;

import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes3.dex */
public class AutoTransition extends TransitionSet {
    public AutoTransition() {
        g1();
    }

    private void g1() {
        d1(1);
        Q0(new Fade(2)).Q0(new ChangeBounds()).Q0(new Fade(1));
    }

    public AutoTransition(@androidx.annotation.o0 Context context, @androidx.annotation.o0 AttributeSet attributeSet) {
        super(context, attributeSet);
        g1();
    }
}
