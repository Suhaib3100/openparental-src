package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.g;

/* loaded from: classes.dex */
public class MockView extends View {

    /* renamed from: b, reason: collision with root package name */
    private Paint f23718b;

    /* renamed from: c, reason: collision with root package name */
    private Paint f23719c;

    /* renamed from: d, reason: collision with root package name */
    private Paint f23720d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f23721e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f23722f;

    /* renamed from: g, reason: collision with root package name */
    protected String f23723g;

    /* renamed from: h, reason: collision with root package name */
    private Rect f23724h;

    /* renamed from: i, reason: collision with root package name */
    private int f23725i;

    /* renamed from: j, reason: collision with root package name */
    private int f23726j;

    /* renamed from: k, reason: collision with root package name */
    private int f23727k;

    /* renamed from: l, reason: collision with root package name */
    private int f23728l;

    public MockView(Context context) {
        super(context);
        this.f23718b = new Paint();
        this.f23719c = new Paint();
        this.f23720d = new Paint();
        this.f23721e = true;
        this.f23722f = true;
        this.f23723g = null;
        this.f23724h = new Rect();
        this.f23725i = Color.argb(255, 0, 0, 0);
        this.f23726j = Color.argb(255, 200, 200, 200);
        this.f23727k = Color.argb(255, 50, 50, 50);
        this.f23728l = 4;
        a(context, null);
    }

    private void a(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, g.m.fj);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == g.m.hj) {
                    this.f23723g = obtainStyledAttributes.getString(index);
                } else if (index == g.m.kj) {
                    this.f23721e = obtainStyledAttributes.getBoolean(index, this.f23721e);
                } else if (index == g.m.gj) {
                    this.f23725i = obtainStyledAttributes.getColor(index, this.f23725i);
                } else if (index == g.m.ij) {
                    this.f23727k = obtainStyledAttributes.getColor(index, this.f23727k);
                } else if (index == g.m.jj) {
                    this.f23726j = obtainStyledAttributes.getColor(index, this.f23726j);
                } else if (index == g.m.lj) {
                    this.f23722f = obtainStyledAttributes.getBoolean(index, this.f23722f);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.f23723g == null) {
            try {
                this.f23723g = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        this.f23718b.setColor(this.f23725i);
        this.f23718b.setAntiAlias(true);
        this.f23719c.setColor(this.f23726j);
        this.f23719c.setAntiAlias(true);
        this.f23720d.setColor(this.f23727k);
        this.f23728l = Math.round((getResources().getDisplayMetrics().xdpi / 160.0f) * this.f23728l);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f23721e) {
            width--;
            height--;
            float f4 = width;
            float f5 = height;
            canvas.drawLine(0.0f, 0.0f, f4, f5, this.f23718b);
            canvas.drawLine(0.0f, f5, f4, 0.0f, this.f23718b);
            canvas.drawLine(0.0f, 0.0f, f4, 0.0f, this.f23718b);
            canvas.drawLine(f4, 0.0f, f4, f5, this.f23718b);
            canvas.drawLine(f4, f5, 0.0f, f5, this.f23718b);
            canvas.drawLine(0.0f, f5, 0.0f, 0.0f, this.f23718b);
        }
        String str = this.f23723g;
        if (str == null || !this.f23722f) {
            return;
        }
        this.f23719c.getTextBounds(str, 0, str.length(), this.f23724h);
        float width2 = (width - this.f23724h.width()) / 2.0f;
        float height2 = ((height - this.f23724h.height()) / 2.0f) + this.f23724h.height();
        this.f23724h.offset((int) width2, (int) height2);
        Rect rect = this.f23724h;
        int i4 = rect.left;
        int i5 = this.f23728l;
        rect.set(i4 - i5, rect.top - i5, rect.right + i5, rect.bottom + i5);
        canvas.drawRect(this.f23724h, this.f23720d);
        canvas.drawText(this.f23723g, width2, height2, this.f23719c);
    }

    public MockView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f23718b = new Paint();
        this.f23719c = new Paint();
        this.f23720d = new Paint();
        this.f23721e = true;
        this.f23722f = true;
        this.f23723g = null;
        this.f23724h = new Rect();
        this.f23725i = Color.argb(255, 0, 0, 0);
        this.f23726j = Color.argb(255, 200, 200, 200);
        this.f23727k = Color.argb(255, 50, 50, 50);
        this.f23728l = 4;
        a(context, attrs);
    }

    public MockView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f23718b = new Paint();
        this.f23719c = new Paint();
        this.f23720d = new Paint();
        this.f23721e = true;
        this.f23722f = true;
        this.f23723g = null;
        this.f23724h = new Rect();
        this.f23725i = Color.argb(255, 0, 0, 0);
        this.f23726j = Color.argb(255, 200, 200, 200);
        this.f23727k = Color.argb(255, 50, 50, 50);
        this.f23728l = 4;
        a(context, attrs);
    }
}
