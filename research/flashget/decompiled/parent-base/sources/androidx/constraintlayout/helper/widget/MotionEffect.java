package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.widget.g;

/* loaded from: classes.dex */
public class MotionEffect extends MotionHelper {
    public static final int A = 2;
    public static final int B = 3;
    private static final int C = -1;

    /* renamed from: w, reason: collision with root package name */
    public static final String f23121w = "FadeMove";

    /* renamed from: x, reason: collision with root package name */
    public static final int f23122x = -1;

    /* renamed from: y, reason: collision with root package name */
    public static final int f23123y = 0;

    /* renamed from: z, reason: collision with root package name */
    public static final int f23124z = 1;

    /* renamed from: o, reason: collision with root package name */
    private float f23125o;

    /* renamed from: p, reason: collision with root package name */
    private int f23126p;

    /* renamed from: q, reason: collision with root package name */
    private int f23127q;

    /* renamed from: r, reason: collision with root package name */
    private int f23128r;

    /* renamed from: s, reason: collision with root package name */
    private int f23129s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f23130t;

    /* renamed from: u, reason: collision with root package name */
    private int f23131u;

    /* renamed from: v, reason: collision with root package name */
    private int f23132v;

    public MotionEffect(Context context) {
        super(context);
        this.f23125o = 0.1f;
        this.f23126p = 49;
        this.f23127q = 50;
        this.f23128r = 0;
        this.f23129s = 0;
        this.f23130t = true;
        this.f23131u = -1;
        this.f23132v = -1;
    }

    private void Q(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, g.m.xj);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == g.m.Bj) {
                    int i5 = obtainStyledAttributes.getInt(index, this.f23126p);
                    this.f23126p = i5;
                    this.f23126p = Math.max(Math.min(i5, 99), 0);
                } else if (index == g.m.zj) {
                    int i6 = obtainStyledAttributes.getInt(index, this.f23127q);
                    this.f23127q = i6;
                    this.f23127q = Math.max(Math.min(i6, 99), 0);
                } else if (index == g.m.Dj) {
                    this.f23128r = obtainStyledAttributes.getDimensionPixelOffset(index, this.f23128r);
                } else if (index == g.m.Ej) {
                    this.f23129s = obtainStyledAttributes.getDimensionPixelOffset(index, this.f23129s);
                } else if (index == g.m.yj) {
                    this.f23125o = obtainStyledAttributes.getFloat(index, this.f23125o);
                } else if (index == g.m.Aj) {
                    this.f23132v = obtainStyledAttributes.getInt(index, this.f23132v);
                } else if (index == g.m.Cj) {
                    this.f23130t = obtainStyledAttributes.getBoolean(index, this.f23130t);
                } else if (index == g.m.Fj) {
                    this.f23131u = obtainStyledAttributes.getResourceId(index, this.f23131u);
                }
            }
            int i7 = this.f23126p;
            int i10 = this.f23127q;
            if (i7 == i10) {
                if (i7 > 0) {
                    this.f23126p = i7 - 1;
                } else {
                    this.f23127q = i10 + 1;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x016e, code lost:
    
        if (r14 == 0.0f) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0182, code lost:
    
        if (r14 == 0.0f) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0192, code lost:
    
        if (r15 == 0.0f) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01a2, code lost:
    
        if (r15 == 0.0f) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01cd  */
    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(androidx.constraintlayout.motion.widget.MotionLayout r23, java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.o> r24) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.MotionEffect.c(androidx.constraintlayout.motion.widget.MotionLayout, java.util.HashMap):void");
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.p
    public boolean m() {
        return true;
    }

    public MotionEffect(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f23125o = 0.1f;
        this.f23126p = 49;
        this.f23127q = 50;
        this.f23128r = 0;
        this.f23129s = 0;
        this.f23130t = true;
        this.f23131u = -1;
        this.f23132v = -1;
        Q(context, attrs);
    }

    public MotionEffect(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f23125o = 0.1f;
        this.f23126p = 49;
        this.f23127q = 50;
        this.f23128r = 0;
        this.f23129s = 0;
        this.f23130t = true;
        this.f23131u = -1;
        this.f23132v = -1;
        Q(context, attrs);
    }
}
