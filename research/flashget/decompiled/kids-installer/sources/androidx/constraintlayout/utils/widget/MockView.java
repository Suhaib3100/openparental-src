package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.f;
import androidx.recyclerview.widget.o;

/* loaded from: classes.dex */
public class MockView extends View {

    /* renamed from: o, reason: collision with root package name */
    private Paint f2683o;

    /* renamed from: p, reason: collision with root package name */
    private Paint f2684p;

    /* renamed from: q, reason: collision with root package name */
    private Paint f2685q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f2686r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f2687s;

    /* renamed from: t, reason: collision with root package name */
    protected String f2688t;

    /* renamed from: u, reason: collision with root package name */
    private Rect f2689u;

    /* renamed from: v, reason: collision with root package name */
    private int f2690v;

    /* renamed from: w, reason: collision with root package name */
    private int f2691w;

    /* renamed from: x, reason: collision with root package name */
    private int f2692x;

    /* renamed from: y, reason: collision with root package name */
    private int f2693y;

    public MockView(Context context) {
        super(context);
        this.f2683o = new Paint();
        this.f2684p = new Paint();
        this.f2685q = new Paint();
        this.f2686r = true;
        this.f2687s = true;
        this.f2688t = null;
        this.f2689u = new Rect();
        this.f2690v = Color.argb(255, 0, 0, 0);
        this.f2691w = Color.argb(255, o.f.f9512b, o.f.f9512b, o.f.f9512b);
        this.f2692x = Color.argb(255, 50, 50, 50);
        this.f2693y = 4;
        a(context, null);
    }

    private void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.m.nf);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == f.m.pf) {
                    this.f2688t = obtainStyledAttributes.getString(index);
                } else if (index == f.m.sf) {
                    this.f2686r = obtainStyledAttributes.getBoolean(index, this.f2686r);
                } else if (index == f.m.of) {
                    this.f2690v = obtainStyledAttributes.getColor(index, this.f2690v);
                } else if (index == f.m.qf) {
                    this.f2692x = obtainStyledAttributes.getColor(index, this.f2692x);
                } else if (index == f.m.rf) {
                    this.f2691w = obtainStyledAttributes.getColor(index, this.f2691w);
                } else if (index == f.m.tf) {
                    this.f2687s = obtainStyledAttributes.getBoolean(index, this.f2687s);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.f2688t == null) {
            try {
                this.f2688t = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        this.f2683o.setColor(this.f2690v);
        this.f2683o.setAntiAlias(true);
        this.f2684p.setColor(this.f2691w);
        this.f2684p.setAntiAlias(true);
        this.f2685q.setColor(this.f2692x);
        this.f2693y = Math.round((getResources().getDisplayMetrics().xdpi / 160.0f) * this.f2693y);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f2686r) {
            width--;
            height--;
            float f6 = width;
            float f7 = height;
            canvas.drawLine(0.0f, 0.0f, f6, f7, this.f2683o);
            canvas.drawLine(0.0f, f7, f6, 0.0f, this.f2683o);
            canvas.drawLine(0.0f, 0.0f, f6, 0.0f, this.f2683o);
            canvas.drawLine(f6, 0.0f, f6, f7, this.f2683o);
            canvas.drawLine(f6, f7, 0.0f, f7, this.f2683o);
            canvas.drawLine(0.0f, f7, 0.0f, 0.0f, this.f2683o);
        }
        String str = this.f2688t;
        if (str == null || !this.f2687s) {
            return;
        }
        this.f2684p.getTextBounds(str, 0, str.length(), this.f2689u);
        float width2 = (width - this.f2689u.width()) / 2.0f;
        float height2 = ((height - this.f2689u.height()) / 2.0f) + this.f2689u.height();
        this.f2689u.offset((int) width2, (int) height2);
        Rect rect = this.f2689u;
        int i5 = rect.left;
        int i6 = this.f2693y;
        rect.set(i5 - i6, rect.top - i6, rect.right + i6, rect.bottom + i6);
        canvas.drawRect(this.f2689u, this.f2685q);
        canvas.drawText(this.f2688t, width2, height2, this.f2684p);
    }

    public MockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2683o = new Paint();
        this.f2684p = new Paint();
        this.f2685q = new Paint();
        this.f2686r = true;
        this.f2687s = true;
        this.f2688t = null;
        this.f2689u = new Rect();
        this.f2690v = Color.argb(255, 0, 0, 0);
        this.f2691w = Color.argb(255, o.f.f9512b, o.f.f9512b, o.f.f9512b);
        this.f2692x = Color.argb(255, 50, 50, 50);
        this.f2693y = 4;
        a(context, attributeSet);
    }

    public MockView(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f2683o = new Paint();
        this.f2684p = new Paint();
        this.f2685q = new Paint();
        this.f2686r = true;
        this.f2687s = true;
        this.f2688t = null;
        this.f2689u = new Rect();
        this.f2690v = Color.argb(255, 0, 0, 0);
        this.f2691w = Color.argb(255, o.f.f9512b, o.f.f9512b, o.f.f9512b);
        this.f2692x = Color.argb(255, 50, 50, 50);
        this.f2693y = 4;
        a(context, attributeSet);
    }
}
