package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.x0;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.g;

/* loaded from: classes.dex */
public class MotionButton extends AppCompatButton {

    /* renamed from: e, reason: collision with root package name */
    private float f23729e;

    /* renamed from: f, reason: collision with root package name */
    private float f23730f;

    /* renamed from: g, reason: collision with root package name */
    private Path f23731g;

    /* renamed from: h, reason: collision with root package name */
    ViewOutlineProvider f23732h;

    /* renamed from: i, reason: collision with root package name */
    RectF f23733i;

    class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionButton.this.getWidth(), MotionButton.this.getHeight(), (Math.min(r3, r4) * MotionButton.this.f23729e) / 2.0f);
        }
    }

    class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionButton.this.getWidth(), MotionButton.this.getHeight(), MotionButton.this.f23730f);
        }
    }

    public MotionButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f23729e = 0.0f;
        this.f23730f = Float.NaN;
        j(context, attrs);
    }

    private void j(Context context, AttributeSet attrs) {
        setPadding(0, 0, 0, 0);
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, g.m.f25216ue);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == g.m.Fe) {
                    k(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == g.m.Ge) {
                    l(obtainStyledAttributes.getFloat(index, 0.0f));
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float h() {
        return this.f23730f;
    }

    public float i() {
        return this.f23729e;
    }

    @x0(21)
    public void k(float round) {
        if (Float.isNaN(round)) {
            this.f23730f = round;
            float f4 = this.f23729e;
            this.f23729e = -1.0f;
            l(f4);
            return;
        }
        boolean z4 = this.f23730f != round;
        this.f23730f = round;
        if (round != 0.0f) {
            if (this.f23731g == null) {
                this.f23731g = new Path();
            }
            if (this.f23733i == null) {
                this.f23733i = new RectF();
            }
            if (this.f23732h == null) {
                b bVar = new b();
                this.f23732h = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f23733i.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f23731g.reset();
            Path path = this.f23731g;
            RectF rectF = this.f23733i;
            float f5 = this.f23730f;
            path.addRoundRect(rectF, f5, f5, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z4) {
            invalidateOutline();
        }
    }

    @x0(21)
    public void l(float round) {
        boolean z4 = this.f23729e != round;
        this.f23729e = round;
        if (round != 0.0f) {
            if (this.f23731g == null) {
                this.f23731g = new Path();
            }
            if (this.f23733i == null) {
                this.f23733i = new RectF();
            }
            if (this.f23732h == null) {
                a aVar = new a();
                this.f23732h = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f23729e) / 2.0f;
            this.f23733i.set(0.0f, 0.0f, width, height);
            this.f23731g.reset();
            this.f23731g.addRoundRect(this.f23733i, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z4) {
            invalidateOutline();
        }
    }

    public MotionButton(Context context) {
        super(context, null);
        this.f23729e = 0.0f;
        this.f23730f = Float.NaN;
        j(context, null);
    }

    public MotionButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f23729e = 0.0f;
        this.f23730f = Float.NaN;
        j(context, attrs);
    }
}
