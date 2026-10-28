package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.solver.widgets.e;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.f;

/* loaded from: classes.dex */
public class Placeholder extends View {

    /* renamed from: o, reason: collision with root package name */
    private int f2809o;

    /* renamed from: p, reason: collision with root package name */
    private View f2810p;

    /* renamed from: q, reason: collision with root package name */
    private int f2811q;

    public Placeholder(Context context) {
        super(context);
        this.f2809o = -1;
        this.f2810p = null;
        this.f2811q = 4;
        c(null);
    }

    private void c(AttributeSet attributeSet) {
        super.setVisibility(this.f2811q);
        this.f2809o = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.m.K7);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == f.m.L7) {
                    this.f2809o = obtainStyledAttributes.getResourceId(index, this.f2809o);
                } else if (index == f.m.M7) {
                    this.f2811q = obtainStyledAttributes.getInt(index, this.f2811q);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public View a() {
        return this.f2810p;
    }

    public int b() {
        return this.f2811q;
    }

    public void d(int i5) {
        View findViewById;
        if (this.f2809o == i5) {
            return;
        }
        View view = this.f2810p;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.LayoutParams) this.f2810p.getLayoutParams()).f2733b0 = false;
            this.f2810p = null;
        }
        this.f2809o = i5;
        if (i5 == -1 || (findViewById = ((View) getParent()).findViewById(i5)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    public void e(int i5) {
        this.f2811q = i5;
    }

    public void f(ConstraintLayout constraintLayout) {
        if (this.f2810p == null) {
            return;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.f2810p.getLayoutParams();
        layoutParams2.f2757n0.G1(0);
        e.b H = layoutParams.f2757n0.H();
        e.b bVar = e.b.FIXED;
        if (H != bVar) {
            layoutParams.f2757n0.H1(layoutParams2.f2757n0.j0());
        }
        if (layoutParams.f2757n0.g0() != bVar) {
            layoutParams.f2757n0.d1(layoutParams2.f2757n0.D());
        }
        layoutParams2.f2757n0.G1(8);
    }

    public void g(ConstraintLayout constraintLayout) {
        if (this.f2809o == -1 && !isInEditMode()) {
            setVisibility(this.f2811q);
        }
        View findViewById = constraintLayout.findViewById(this.f2809o);
        this.f2810p = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.LayoutParams) findViewById.getLayoutParams()).f2733b0 = true;
            this.f2810p.setVisibility(0);
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

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2809o = -1;
        this.f2810p = null;
        this.f2811q = 4;
        c(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f2809o = -1;
        this.f2810p = null;
        this.f2811q = 4;
        c(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i5, int i6) {
        super(context, attributeSet, i5);
        this.f2809o = -1;
        this.f2810p = null;
        this.f2811q = 4;
        c(attributeSet);
    }
}
