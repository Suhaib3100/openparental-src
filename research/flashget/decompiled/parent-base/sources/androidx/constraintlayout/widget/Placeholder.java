package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.e;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.g;

/* loaded from: classes.dex */
public class Placeholder extends View {

    /* renamed from: b, reason: collision with root package name */
    private int f23912b;

    /* renamed from: c, reason: collision with root package name */
    private View f23913c;

    /* renamed from: d, reason: collision with root package name */
    private int f23914d;

    public Placeholder(Context context) {
        super(context);
        this.f23912b = -1;
        this.f23913c = null;
        this.f23914d = 4;
        c(null);
    }

    private void c(AttributeSet attrs) {
        super.setVisibility(this.f23914d);
        this.f23912b = -1;
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, g.m.O8);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == g.m.P8) {
                    this.f23912b = obtainStyledAttributes.getResourceId(index, this.f23912b);
                } else if (index == g.m.Q8) {
                    this.f23914d = obtainStyledAttributes.getInt(index, this.f23914d);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public View a() {
        return this.f23913c;
    }

    public int b() {
        return this.f23914d;
    }

    public void d(int id2) {
        View findViewById;
        if (this.f23912b == id2) {
            return;
        }
        View view = this.f23913c;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.LayoutParams) this.f23913c.getLayoutParams()).Y2 = false;
            this.f23913c = null;
        }
        this.f23912b = id2;
        if (id2 == -1 || (findViewById = ((View) getParent()).findViewById(id2)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    public void e(int visibility) {
        this.f23914d = visibility;
    }

    public void f(ConstraintLayout container) {
        if (this.f23913c == null) {
            return;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.f23913c.getLayoutParams();
        layoutParams2.f23848k3.b2(0);
        e.b H = layoutParams.f23848k3.H();
        e.b bVar = e.b.FIXED;
        if (H != bVar) {
            layoutParams.f23848k3.c2(layoutParams2.f23848k3.m0());
        }
        if (layoutParams.f23848k3.j0() != bVar) {
            layoutParams.f23848k3.y1(layoutParams2.f23848k3.D());
        }
        layoutParams2.f23848k3.b2(8);
    }

    public void g(ConstraintLayout container) {
        if (this.f23912b == -1 && !isInEditMode()) {
            setVisibility(this.f23914d);
        }
        View findViewById = container.findViewById(this.f23912b);
        this.f23913c = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.LayoutParams) findViewById.getLayoutParams()).Y2 = true;
            this.f23913c.setVisibility(0);
            setVisibility(0);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (height / 2.0f)) - rect.bottom, paint);
        }
    }

    public Placeholder(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f23912b = -1;
        this.f23913c = null;
        this.f23914d = 4;
        c(attrs);
    }

    public Placeholder(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f23912b = -1;
        this.f23913c = null;
        this.f23914d = 4;
        c(attrs);
    }

    public Placeholder(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr);
        this.f23912b = -1;
        this.f23913c = null;
        this.f23914d = 4;
        c(attrs);
    }
}
