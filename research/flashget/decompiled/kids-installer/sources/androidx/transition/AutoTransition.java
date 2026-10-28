package androidx.transition;

import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes3.dex */
public class AutoTransition extends TransitionSet {
    public AutoTransition() {
        o1();
    }

    private void o1() {
        j1(1);
        V0(new Fade(2)).V0(new ChangeBounds()).V0(new Fade(1));
    }

    public AutoTransition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o1();
    }
}
