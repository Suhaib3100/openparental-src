package com.scwang.smart.refresh.footer;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.l;
import androidx.annotation.o0;
import com.scwang.smart.refresh.classics.ClassicsAbstract;
import com.scwang.smart.refresh.layout.constant.b;
import oc.b;
import qc.c;
import qc.f;

/* loaded from: classes6.dex */
public class ClassicsFooter extends ClassicsAbstract<ClassicsFooter> implements c {
    public static String C;
    public static String D;
    public static String E;
    public static String F;
    public static String G;
    public static String H;
    public static String I;
    protected String A;
    protected boolean B;

    /* renamed from: u, reason: collision with root package name */
    protected String f70553u;

    /* renamed from: v, reason: collision with root package name */
    protected String f70554v;

    /* renamed from: w, reason: collision with root package name */
    protected String f70555w;

    /* renamed from: x, reason: collision with root package name */
    protected String f70556x;

    /* renamed from: y, reason: collision with root package name */
    protected String f70557y;

    /* renamed from: z, reason: collision with root package name */
    protected String f70558z;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f70559a;

        static {
            int[] iArr = new int[b.values().length];
            f70559a = iArr;
            try {
                iArr[b.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70559a[b.PullUpToLoad.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f70559a[b.Loading.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f70559a[b.LoadReleased.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f70559a[b.ReleaseToLoad.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f70559a[b.Refreshing.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ClassicsFooter(Context context) {
        this(context, null);
    }

    @Override // com.scwang.smart.refresh.layout.simple.b, qc.c
    public boolean a(boolean z4) {
        if (this.B == z4) {
            return true;
        }
        this.B = z4;
        ImageView imageView = this.f70538f;
        if (z4) {
            this.f70537e.setText(this.A);
            imageView.setVisibility(8);
            return true;
        }
        this.f70537e.setText(this.f70553u);
        imageView.setVisibility(0);
        return true;
    }

    @Override // com.scwang.smart.refresh.classics.ClassicsAbstract, com.scwang.smart.refresh.layout.simple.b, qc.a
    @Deprecated
    public void d(@l int... iArr) {
        if (this.f70698c == com.scwang.smart.refresh.layout.constant.c.f70687f) {
            super.d(iArr);
        }
    }

    @Override // com.scwang.smart.refresh.layout.simple.b, sc.i
    public void g(@o0 f fVar, @o0 b bVar, @o0 b bVar2) {
        ImageView imageView = this.f70538f;
        if (this.B) {
            return;
        }
        switch (a.f70559a[bVar2.ordinal()]) {
            case 1:
                imageView.setVisibility(0);
                break;
            case 2:
                break;
            case 3:
            case 4:
                imageView.setVisibility(8);
                this.f70537e.setText(this.f70555w);
                return;
            case 5:
                this.f70537e.setText(this.f70554v);
                imageView.animate().rotation(0.0f);
                return;
            case 6:
                this.f70537e.setText(this.f70556x);
                imageView.setVisibility(8);
                return;
            default:
                return;
        }
        this.f70537e.setText(this.f70553u);
        imageView.animate().rotation(180.0f);
    }

    @Override // com.scwang.smart.refresh.classics.ClassicsAbstract, com.scwang.smart.refresh.layout.simple.b, qc.a
    public int l(@o0 f fVar, boolean z4) {
        super.l(fVar, z4);
        if (this.B) {
            return 0;
        }
        this.f70537e.setText(z4 ? this.f70557y : this.f70558z);
        return this.f70546n;
    }

    public ClassicsFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.B = false;
        View.inflate(context, b.c.f83789a, this);
        ImageView imageView = (ImageView) findViewById(b.C1303b.f83786a);
        this.f70538f = imageView;
        ImageView imageView2 = (ImageView) findViewById(b.C1303b.f83787b);
        this.f70539g = imageView2;
        this.f70537e = (TextView) findViewById(b.C1303b.f83788c);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.e.f83797a);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) imageView2.getLayoutParams();
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(b.e.f83802f, com.scwang.smart.refresh.layout.util.b.c(20.0f));
        layoutParams2.rightMargin = dimensionPixelSize;
        layoutParams.rightMargin = dimensionPixelSize;
        int i4 = b.e.f83801e;
        layoutParams.width = obtainStyledAttributes.getLayoutDimension(i4, layoutParams.width);
        layoutParams.height = obtainStyledAttributes.getLayoutDimension(i4, layoutParams.height);
        int i5 = b.e.f83804h;
        layoutParams2.width = obtainStyledAttributes.getLayoutDimension(i5, layoutParams2.width);
        layoutParams2.height = obtainStyledAttributes.getLayoutDimension(i5, layoutParams2.height);
        int i6 = b.e.f83805i;
        layoutParams.width = obtainStyledAttributes.getLayoutDimension(i6, layoutParams.width);
        layoutParams.height = obtainStyledAttributes.getLayoutDimension(i6, layoutParams.height);
        layoutParams2.width = obtainStyledAttributes.getLayoutDimension(i6, layoutParams2.width);
        layoutParams2.height = obtainStyledAttributes.getLayoutDimension(i6, layoutParams2.height);
        this.f70546n = obtainStyledAttributes.getInt(b.e.f83806j, this.f70546n);
        this.f70698c = com.scwang.smart.refresh.layout.constant.c.f70690i[obtainStyledAttributes.getInt(b.e.f83799c, this.f70698c.f70691a)];
        int i7 = b.e.f83800d;
        if (obtainStyledAttributes.hasValue(i7)) {
            this.f70538f.setImageDrawable(obtainStyledAttributes.getDrawable(i7));
        } else if (this.f70538f.getDrawable() == null) {
            com.scwang.smart.refresh.classics.a aVar = new com.scwang.smart.refresh.classics.a();
            this.f70541i = aVar;
            aVar.a(-10066330);
            this.f70538f.setImageDrawable(this.f70541i);
        }
        int i10 = b.e.f83803g;
        if (obtainStyledAttributes.hasValue(i10)) {
            this.f70539g.setImageDrawable(obtainStyledAttributes.getDrawable(i10));
        } else if (this.f70539g.getDrawable() == null) {
            com.scwang.smart.drawable.b bVar = new com.scwang.smart.drawable.b();
            this.f70542j = bVar;
            bVar.a(-10066330);
            this.f70539g.setImageDrawable(this.f70542j);
        }
        if (obtainStyledAttributes.hasValue(b.e.f83815s)) {
            this.f70537e.setTextSize(0, obtainStyledAttributes.getDimensionPixelSize(r3, com.scwang.smart.refresh.layout.util.b.c(16.0f)));
        }
        int i11 = b.e.f83807k;
        if (obtainStyledAttributes.hasValue(i11)) {
            super.J(obtainStyledAttributes.getColor(i11, 0));
        }
        int i12 = b.e.f83798b;
        if (obtainStyledAttributes.hasValue(i12)) {
            super.t(obtainStyledAttributes.getColor(i12, 0));
        }
        int i13 = b.e.f83812p;
        if (obtainStyledAttributes.hasValue(i13)) {
            this.f70553u = obtainStyledAttributes.getString(i13);
        } else {
            String str = C;
            if (str != null) {
                this.f70553u = str;
            } else {
                this.f70553u = context.getString(b.d.f83794e);
            }
        }
        int i14 = b.e.f83814r;
        if (obtainStyledAttributes.hasValue(i14)) {
            this.f70554v = obtainStyledAttributes.getString(i14);
        } else {
            String str2 = D;
            if (str2 != null) {
                this.f70554v = str2;
            } else {
                this.f70554v = context.getString(b.d.f83796g);
            }
        }
        int i15 = b.e.f83810n;
        if (obtainStyledAttributes.hasValue(i15)) {
            this.f70555w = obtainStyledAttributes.getString(i15);
        } else {
            String str3 = E;
            if (str3 != null) {
                this.f70555w = str3;
            } else {
                this.f70555w = context.getString(b.d.f83792c);
            }
        }
        int i16 = b.e.f83813q;
        if (obtainStyledAttributes.hasValue(i16)) {
            this.f70556x = obtainStyledAttributes.getString(i16);
        } else {
            String str4 = F;
            if (str4 != null) {
                this.f70556x = str4;
            } else {
                this.f70556x = context.getString(b.d.f83795f);
            }
        }
        int i17 = b.e.f83809m;
        if (obtainStyledAttributes.hasValue(i17)) {
            this.f70557y = obtainStyledAttributes.getString(i17);
        } else {
            String str5 = G;
            if (str5 != null) {
                this.f70557y = str5;
            } else {
                this.f70557y = context.getString(b.d.f83791b);
            }
        }
        int i18 = b.e.f83808l;
        if (obtainStyledAttributes.hasValue(i18)) {
            this.f70558z = obtainStyledAttributes.getString(i18);
        } else {
            String str6 = H;
            if (str6 != null) {
                this.f70558z = str6;
            } else {
                this.f70558z = context.getString(b.d.f83790a);
            }
        }
        int i19 = b.e.f83811o;
        if (obtainStyledAttributes.hasValue(i19)) {
            this.A = obtainStyledAttributes.getString(i19);
        } else {
            String str7 = I;
            if (str7 != null) {
                this.A = str7;
            } else {
                this.A = context.getString(b.d.f83793d);
            }
        }
        obtainStyledAttributes.recycle();
        imageView2.animate().setInterpolator(null);
        this.f70537e.setText(isInEditMode() ? this.f70555w : this.f70553u);
        if (isInEditMode()) {
            imageView.setVisibility(8);
        } else {
            imageView2.setVisibility(8);
        }
    }
}
