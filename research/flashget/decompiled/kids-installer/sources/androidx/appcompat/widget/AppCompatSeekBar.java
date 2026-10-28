package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import d.a;

/* loaded from: classes.dex */
public class AppCompatSeekBar extends SeekBar {

    /* renamed from: o, reason: collision with root package name */
    private final k f885o;

    public AppCompatSeekBar(@androidx.annotation.o0 Context context) {
        this(context, null);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f885o.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f885o.l();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f885o.g(canvas);
    }

    public AppCompatSeekBar(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.V2);
    }

    public AppCompatSeekBar(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        u0.a(this, getContext());
        k kVar = new k(this);
        this.f885o = kVar;
        kVar.c(attributeSet, i5);
    }
}
