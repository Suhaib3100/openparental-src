package eightbitlab.com.blurview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.l;
import androidx.annotation.o0;
import androidx.annotation.x0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import eightbitlab.com.blurview.h;

/* loaded from: classes7.dex */
public class BlurView extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    private static final String f73778d = ProtectedSandApp.s("怾\u0001");

    /* renamed from: b, reason: collision with root package name */
    b f73779b;

    /* renamed from: c, reason: collision with root package name */
    @l
    private int f73780c;

    public BlurView(Context context) {
        super(context);
        this.f73779b = new f();
        b(null, 0);
    }

    @o0
    @x0(api = 17)
    private a a() {
        return Build.VERSION.SDK_INT >= 31 ? new i() : new j(getContext());
    }

    private void b(AttributeSet attributeSet, int i4) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.b.f73802a, i4, 0);
        this.f73780c = obtainStyledAttributes.getColor(h.b.f73803b, 0);
        obtainStyledAttributes.recycle();
    }

    public d c(boolean z4) {
        return this.f73779b.c(z4);
    }

    public d d(boolean z4) {
        return this.f73779b.b(z4);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (this.f73779b.draw(canvas)) {
            super.draw(canvas);
        }
    }

    public d e(float f4) {
        return this.f73779b.f(f4);
    }

    public d f(@l int i4) {
        this.f73780c = i4;
        return this.f73779b.a(i4);
    }

    @x0(api = 17)
    public d g(@o0 ViewGroup viewGroup) {
        this.f73779b.destroy();
        g gVar = new g(this, viewGroup, this.f73780c, a());
        this.f73779b = gVar;
        return gVar;
    }

    public d h(@o0 ViewGroup viewGroup, a aVar) {
        this.f73779b.destroy();
        g gVar = new g(this, viewGroup, this.f73780c, aVar);
        this.f73779b = gVar;
        return gVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isHardwareAccelerated()) {
            this.f73779b.c(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f73779b.c(false);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        this.f73779b.e();
    }

    public BlurView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f73779b = new f();
        b(attributeSet, 0);
    }

    public BlurView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f73779b = new f();
        b(attributeSet, i4);
    }
}
