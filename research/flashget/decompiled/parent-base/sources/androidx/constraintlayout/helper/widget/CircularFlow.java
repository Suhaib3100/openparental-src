package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import androidx.constraintlayout.widget.d;
import androidx.constraintlayout.widget.g;
import java.util.Arrays;

/* loaded from: classes.dex */
public class CircularFlow extends VirtualLayout {

    /* renamed from: w, reason: collision with root package name */
    private static final String f23078w = "CircularFlow";

    /* renamed from: x, reason: collision with root package name */
    private static int f23079x;

    /* renamed from: y, reason: collision with root package name */
    private static float f23080y;

    /* renamed from: m, reason: collision with root package name */
    ConstraintLayout f23081m;

    /* renamed from: n, reason: collision with root package name */
    int f23082n;

    /* renamed from: o, reason: collision with root package name */
    private float[] f23083o;

    /* renamed from: p, reason: collision with root package name */
    private int[] f23084p;

    /* renamed from: q, reason: collision with root package name */
    private int f23085q;

    /* renamed from: r, reason: collision with root package name */
    private int f23086r;

    /* renamed from: s, reason: collision with root package name */
    private String f23087s;

    /* renamed from: t, reason: collision with root package name */
    private String f23088t;

    /* renamed from: u, reason: collision with root package name */
    private Float f23089u;

    /* renamed from: v, reason: collision with root package name */
    private Integer f23090v;

    public CircularFlow(Context context) {
        super(context);
    }

    private void Q(String angleString) {
        float[] fArr;
        if (angleString == null || angleString.length() == 0 || this.f23782d == null || (fArr = this.f23083o) == null) {
            return;
        }
        if (this.f23086r + 1 > fArr.length) {
            this.f23083o = Arrays.copyOf(fArr, fArr.length + 1);
        }
        this.f23083o[this.f23086r] = Integer.parseInt(angleString);
        this.f23086r++;
    }

    private void R(String radiusString) {
        int[] iArr;
        if (radiusString == null || radiusString.length() == 0 || this.f23782d == null || (iArr = this.f23084p) == null) {
            return;
        }
        if (this.f23085q + 1 > iArr.length) {
            this.f23084p = Arrays.copyOf(iArr, iArr.length + 1);
        }
        this.f23084p[this.f23085q] = (int) (Integer.parseInt(radiusString) * this.f23782d.getResources().getDisplayMetrics().density);
        this.f23085q++;
    }

    private void T() {
        this.f23081m = (ConstraintLayout) getParent();
        for (int i4 = 0; i4 < this.f23781c; i4++) {
            View w4 = this.f23081m.w(this.f23780b[i4]);
            if (w4 != null) {
                int i5 = f23079x;
                float f4 = f23080y;
                int[] iArr = this.f23084p;
                if (iArr == null || i4 >= iArr.length) {
                    Integer num = this.f23090v;
                    if (num == null || num.intValue() == -1) {
                        this.f23788j.get(Integer.valueOf(w4.getId()));
                    } else {
                        this.f23085q++;
                        if (this.f23084p == null) {
                            this.f23084p = new int[1];
                        }
                        int[] V = V();
                        this.f23084p = V;
                        V[this.f23085q - 1] = i5;
                    }
                } else {
                    i5 = iArr[i4];
                }
                float[] fArr = this.f23083o;
                if (fArr == null || i4 >= fArr.length) {
                    Float f5 = this.f23089u;
                    if (f5 == null || f5.floatValue() == -1.0f) {
                        this.f23788j.get(Integer.valueOf(w4.getId()));
                    } else {
                        this.f23086r++;
                        if (this.f23083o == null) {
                            this.f23083o = new float[1];
                        }
                        float[] U = U();
                        this.f23083o = U;
                        U[this.f23086r - 1] = f4;
                    }
                } else {
                    f4 = fArr[i4];
                }
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) w4.getLayoutParams();
                layoutParams.f23857s = f4;
                layoutParams.f23855q = this.f23082n;
                layoutParams.f23856r = i5;
                w4.setLayoutParams(layoutParams);
            }
        }
        r();
    }

    private float[] X(float[] angles, int index) {
        return (angles == null || index < 0 || index >= this.f23086r) ? angles : Y(angles, index);
    }

    public static float[] Y(float[] array, int index) {
        float[] fArr = new float[array.length - 1];
        int i4 = 0;
        for (int i5 = 0; i5 < array.length; i5++) {
            if (i5 != index) {
                fArr[i4] = array[i5];
                i4++;
            }
        }
        return fArr;
    }

    public static int[] Z(int[] array, int index) {
        int[] iArr = new int[array.length - 1];
        int i4 = 0;
        for (int i5 = 0; i5 < array.length; i5++) {
            if (i5 != index) {
                iArr[i4] = array[i5];
                i4++;
            }
        }
        return iArr;
    }

    private int[] a0(int[] radius, int index) {
        return (radius == null || index < 0 || index >= this.f23085q) ? radius : Z(radius, index);
    }

    private void b0(String idList) {
        if (idList == null) {
            return;
        }
        int i4 = 0;
        this.f23086r = 0;
        while (true) {
            int indexOf = idList.indexOf(44, i4);
            if (indexOf == -1) {
                Q(idList.substring(i4).trim());
                return;
            } else {
                Q(idList.substring(i4, indexOf).trim());
                i4 = indexOf + 1;
            }
        }
    }

    private void e0(String idList) {
        if (idList == null) {
            return;
        }
        int i4 = 0;
        this.f23085q = 0;
        while (true) {
            int indexOf = idList.indexOf(44, i4);
            if (indexOf == -1) {
                R(idList.substring(i4).trim());
                return;
            } else {
                R(idList.substring(i4, indexOf).trim());
                i4 = indexOf + 1;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    protected void B(AttributeSet attrs) {
        super.B(attrs);
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, g.m.x6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == g.m.f7) {
                    this.f23082n = obtainStyledAttributes.getResourceId(index, 0);
                } else if (index == g.m.b7) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f23087s = string;
                    b0(string);
                } else if (index == g.m.e7) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f23088t = string2;
                    e0(string2);
                } else if (index == g.m.c7) {
                    Float valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, f23080y));
                    this.f23089u = valueOf;
                    c0(valueOf.floatValue());
                } else if (index == g.m.d7) {
                    Integer valueOf2 = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, f23079x));
                    this.f23090v = valueOf2;
                    d0(valueOf2.intValue());
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public int D(View view) {
        int D = super.D(view);
        if (D == -1) {
            return D;
        }
        d dVar = new d();
        dVar.H(this.f23081m);
        dVar.F(view.getId(), 8);
        dVar.r(this.f23081m);
        float[] fArr = this.f23083o;
        if (D < fArr.length) {
            this.f23083o = X(fArr, D);
            this.f23086r--;
        }
        int[] iArr = this.f23084p;
        if (D < iArr.length) {
            this.f23084p = a0(iArr, D);
            this.f23085q--;
        }
        T();
        return D;
    }

    public void S(View view, int radius, float angle) {
        if (u(view.getId())) {
            return;
        }
        q(view);
        this.f23086r++;
        float[] U = U();
        this.f23083o = U;
        U[this.f23086r - 1] = angle;
        this.f23085q++;
        int[] V = V();
        this.f23084p = V;
        V[this.f23085q - 1] = (int) (radius * this.f23782d.getResources().getDisplayMetrics().density);
        T();
    }

    public float[] U() {
        return Arrays.copyOf(this.f23083o, this.f23086r);
    }

    public int[] V() {
        return Arrays.copyOf(this.f23084p, this.f23085q);
    }

    public boolean W(View view) {
        return u(view.getId()) && A(view.getId()) != -1;
    }

    public void c0(float angle) {
        f23080y = angle;
    }

    public void d0(int radius) {
        f23079x = radius;
    }

    public void f0(View view, float angle) {
        if (!W(view)) {
            view.getId();
            return;
        }
        int A = A(view.getId());
        if (A > this.f23083o.length) {
            return;
        }
        float[] U = U();
        this.f23083o = U;
        U[A] = angle;
        T();
    }

    public void g0(View view, int radius) {
        if (!W(view)) {
            view.getId();
            return;
        }
        int A = A(view.getId());
        if (A > this.f23084p.length) {
            return;
        }
        int[] V = V();
        this.f23084p = V;
        V[A] = (int) (radius * this.f23782d.getResources().getDisplayMetrics().density);
        T();
    }

    public void h0(View view, int radius, float angle) {
        if (!W(view)) {
            view.getId();
            return;
        }
        int A = A(view.getId());
        if (U().length > A) {
            float[] U = U();
            this.f23083o = U;
            U[A] = angle;
        }
        if (V().length > A) {
            int[] V = V();
            this.f23084p = V;
            V[A] = (int) (radius * this.f23782d.getResources().getDisplayMetrics().density);
        }
        T();
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f23087s;
        if (str != null) {
            this.f23083o = new float[1];
            b0(str);
        }
        String str2 = this.f23088t;
        if (str2 != null) {
            this.f23084p = new int[1];
            e0(str2);
        }
        Float f4 = this.f23089u;
        if (f4 != null) {
            c0(f4.floatValue());
        }
        Integer num = this.f23090v;
        if (num != null) {
            d0(num.intValue());
        }
        T();
    }

    public CircularFlow(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CircularFlow(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
