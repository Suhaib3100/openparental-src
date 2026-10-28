package com.scwang.smart.refresh.header;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.l;
import androidx.annotation.o0;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.scwang.smart.refresh.classics.ClassicsAbstract;
import com.scwang.smart.refresh.layout.constant.c;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import pc.b;
import qc.d;
import qc.e;
import qc.f;

/* loaded from: classes6.dex */
public class ClassicsHeader extends ClassicsAbstract<ClassicsHeader> implements d {
    public static final int I = b.C1374b.f88726e;
    public static String J = null;
    public static String K = null;
    public static String L = null;
    public static String M = null;
    public static String N = null;
    public static String O = null;
    public static String P = null;
    public static String Q = null;
    protected String A;
    protected String B;
    protected String C;
    protected String D;
    protected String E;
    protected String F;
    protected String G;
    protected String H;

    /* renamed from: u, reason: collision with root package name */
    protected String f70560u;

    /* renamed from: v, reason: collision with root package name */
    protected Date f70561v;

    /* renamed from: w, reason: collision with root package name */
    protected TextView f70562w;

    /* renamed from: x, reason: collision with root package name */
    protected SharedPreferences f70563x;

    /* renamed from: y, reason: collision with root package name */
    protected DateFormat f70564y;

    /* renamed from: z, reason: collision with root package name */
    protected boolean f70565z;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f70566a;

        static {
            int[] iArr = new int[com.scwang.smart.refresh.layout.constant.b.values().length];
            f70566a = iArr;
            try {
                iArr[com.scwang.smart.refresh.layout.constant.b.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70566a[com.scwang.smart.refresh.layout.constant.b.PullDownToRefresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f70566a[com.scwang.smart.refresh.layout.constant.b.Refreshing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f70566a[com.scwang.smart.refresh.layout.constant.b.RefreshReleased.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f70566a[com.scwang.smart.refresh.layout.constant.b.ReleaseToRefresh.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f70566a[com.scwang.smart.refresh.layout.constant.b.ReleaseToTwoLevel.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f70566a[com.scwang.smart.refresh.layout.constant.b.Loading.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public ClassicsHeader(Context context) {
        this(context, null);
    }

    @Override // com.scwang.smart.refresh.classics.ClassicsAbstract
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public ClassicsHeader t(@l int i4) {
        this.f70562w.setTextColor((16777215 & i4) | (-872415232));
        return (ClassicsHeader) super.t(i4);
    }

    public ClassicsHeader S(boolean z4) {
        TextView textView = this.f70562w;
        this.f70565z = z4;
        textView.setVisibility(z4 ? 0 : 8);
        e eVar = this.f70540h;
        if (eVar != null) {
            eVar.d(this);
        }
        return this;
    }

    public ClassicsHeader T(CharSequence charSequence) {
        this.f70561v = null;
        this.f70562w.setText(charSequence);
        return this;
    }

    public ClassicsHeader U(Date date) {
        this.f70561v = date;
        this.f70562w.setText(this.f70564y.format(date));
        if (this.f70563x != null && !isInEditMode()) {
            this.f70563x.edit().putLong(this.f70560u, date.getTime()).apply();
        }
        return this;
    }

    public ClassicsHeader V(float f4) {
        this.f70562w.setTextSize(f4);
        e eVar = this.f70540h;
        if (eVar != null) {
            eVar.d(this);
        }
        return this;
    }

    public ClassicsHeader W(int i4, float f4) {
        this.f70562w.setTextSize(i4, f4);
        e eVar = this.f70540h;
        if (eVar != null) {
            eVar.d(this);
        }
        return this;
    }

    public ClassicsHeader X(float f4) {
        TextView textView = this.f70562w;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        marginLayoutParams.topMargin = com.scwang.smart.refresh.layout.util.b.c(f4);
        textView.setLayoutParams(marginLayoutParams);
        return this;
    }

    public ClassicsHeader Y(int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f70562w.getLayoutParams();
        marginLayoutParams.topMargin = i4;
        this.f70562w.setLayoutParams(marginLayoutParams);
        return this;
    }

    public ClassicsHeader Z(DateFormat dateFormat) {
        this.f70564y = dateFormat;
        Date date = this.f70561v;
        if (date != null) {
            this.f70562w.setText(dateFormat.format(date));
        }
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.simple.b, sc.i
    public void g(@o0 f fVar, @o0 com.scwang.smart.refresh.layout.constant.b bVar, @o0 com.scwang.smart.refresh.layout.constant.b bVar2) {
        ImageView imageView = this.f70538f;
        TextView textView = this.f70562w;
        switch (a.f70566a[bVar2.ordinal()]) {
            case 1:
                textView.setVisibility(this.f70565z ? 0 : 8);
                break;
            case 2:
                break;
            case 3:
            case 4:
                this.f70537e.setText(this.B);
                imageView.setVisibility(8);
                return;
            case 5:
                this.f70537e.setText(this.D);
                imageView.animate().rotation(180.0f);
                return;
            case 6:
                this.f70537e.setText(this.H);
                imageView.animate().rotation(0.0f);
                return;
            case 7:
                imageView.setVisibility(8);
                textView.setVisibility(this.f70565z ? 4 : 8);
                this.f70537e.setText(this.C);
                return;
            default:
                return;
        }
        this.f70537e.setText(this.A);
        imageView.setVisibility(0);
        imageView.animate().rotation(0.0f);
    }

    @Override // com.scwang.smart.refresh.classics.ClassicsAbstract, com.scwang.smart.refresh.layout.simple.b, qc.a
    public int l(@o0 f fVar, boolean z4) {
        if (z4) {
            this.f70537e.setText(this.E);
            if (this.f70561v != null) {
                U(new Date());
            }
        } else {
            this.f70537e.setText(this.F);
        }
        return super.l(fVar, z4);
    }

    public ClassicsHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        FragmentManager supportFragmentManager;
        this.f70560u = ProtectedSandApp.s("⿇\u0001");
        this.f70565z = true;
        View.inflate(context, b.c.f88728b, this);
        ImageView imageView = (ImageView) findViewById(b.C1374b.f88722a);
        this.f70538f = imageView;
        TextView textView = (TextView) findViewById(b.C1374b.f88726e);
        this.f70562w = textView;
        ImageView imageView2 = (ImageView) findViewById(b.C1374b.f88724c);
        this.f70539g = imageView2;
        this.f70537e = (TextView) findViewById(b.C1374b.f88725d);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.e.f88763t);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) imageView2.getLayoutParams();
        new LinearLayout.LayoutParams(-2, -2).topMargin = obtainStyledAttributes.getDimensionPixelSize(b.e.O, com.scwang.smart.refresh.layout.util.b.c(0.0f));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(b.e.f88768y, com.scwang.smart.refresh.layout.util.b.c(20.0f));
        layoutParams2.rightMargin = dimensionPixelSize;
        layoutParams.rightMargin = dimensionPixelSize;
        int i4 = b.e.f88767x;
        layoutParams.width = obtainStyledAttributes.getLayoutDimension(i4, layoutParams.width);
        layoutParams.height = obtainStyledAttributes.getLayoutDimension(i4, layoutParams.height);
        int i5 = b.e.A;
        layoutParams2.width = obtainStyledAttributes.getLayoutDimension(i5, layoutParams2.width);
        layoutParams2.height = obtainStyledAttributes.getLayoutDimension(i5, layoutParams2.height);
        int i6 = b.e.B;
        layoutParams.width = obtainStyledAttributes.getLayoutDimension(i6, layoutParams.width);
        layoutParams.height = obtainStyledAttributes.getLayoutDimension(i6, layoutParams.height);
        layoutParams2.width = obtainStyledAttributes.getLayoutDimension(i6, layoutParams2.width);
        layoutParams2.height = obtainStyledAttributes.getLayoutDimension(i6, layoutParams2.height);
        this.f70546n = obtainStyledAttributes.getInt(b.e.D, this.f70546n);
        this.f70565z = obtainStyledAttributes.getBoolean(b.e.C, this.f70565z);
        this.f70698c = c.f70690i[obtainStyledAttributes.getInt(b.e.f88765v, this.f70698c.f70691a)];
        int i7 = b.e.f88766w;
        if (obtainStyledAttributes.hasValue(i7)) {
            this.f70538f.setImageDrawable(obtainStyledAttributes.getDrawable(i7));
        } else if (this.f70538f.getDrawable() == null) {
            com.scwang.smart.refresh.classics.a aVar = new com.scwang.smart.refresh.classics.a();
            this.f70541i = aVar;
            aVar.a(-10066330);
            this.f70538f.setImageDrawable(this.f70541i);
        }
        int i10 = b.e.f88769z;
        if (obtainStyledAttributes.hasValue(i10)) {
            this.f70539g.setImageDrawable(obtainStyledAttributes.getDrawable(i10));
        } else if (this.f70539g.getDrawable() == null) {
            com.scwang.smart.drawable.b bVar = new com.scwang.smart.drawable.b();
            this.f70542j = bVar;
            bVar.a(-10066330);
            this.f70539g.setImageDrawable(this.f70542j);
        }
        if (obtainStyledAttributes.hasValue(b.e.N)) {
            this.f70537e.setTextSize(0, obtainStyledAttributes.getDimensionPixelSize(r4, com.scwang.smart.refresh.layout.util.b.c(16.0f)));
        }
        if (obtainStyledAttributes.hasValue(b.e.M)) {
            this.f70562w.setTextSize(0, obtainStyledAttributes.getDimensionPixelSize(r4, com.scwang.smart.refresh.layout.util.b.c(12.0f)));
        }
        int i11 = b.e.E;
        if (obtainStyledAttributes.hasValue(i11)) {
            super.J(obtainStyledAttributes.getColor(i11, 0));
        }
        int i12 = b.e.f88764u;
        if (obtainStyledAttributes.hasValue(i12)) {
            t(obtainStyledAttributes.getColor(i12, 0));
        }
        int i13 = b.e.I;
        if (obtainStyledAttributes.hasValue(i13)) {
            this.A = obtainStyledAttributes.getString(i13);
        } else {
            String str = J;
            if (str != null) {
                this.A = str;
            } else {
                this.A = context.getString(b.d.f88739k);
            }
        }
        int i14 = b.e.H;
        if (obtainStyledAttributes.hasValue(i14)) {
            this.C = obtainStyledAttributes.getString(i14);
        } else {
            String str2 = L;
            if (str2 != null) {
                this.C = str2;
            } else {
                this.C = context.getString(b.d.f88738j);
            }
        }
        int i15 = b.e.K;
        if (obtainStyledAttributes.hasValue(i15)) {
            this.D = obtainStyledAttributes.getString(i15);
        } else {
            String str3 = M;
            if (str3 != null) {
                this.D = str3;
            } else {
                this.D = context.getString(b.d.f88741m);
            }
        }
        int i16 = b.e.G;
        if (obtainStyledAttributes.hasValue(i16)) {
            this.E = obtainStyledAttributes.getString(i16);
        } else {
            String str4 = N;
            if (str4 != null) {
                this.E = str4;
            } else {
                this.E = context.getString(b.d.f88737i);
            }
        }
        int i17 = b.e.F;
        if (obtainStyledAttributes.hasValue(i17)) {
            this.F = obtainStyledAttributes.getString(i17);
        } else {
            String str5 = O;
            if (str5 != null) {
                this.F = str5;
            } else {
                this.F = context.getString(b.d.f88736h);
            }
        }
        int i18 = b.e.L;
        if (obtainStyledAttributes.hasValue(i18)) {
            this.H = obtainStyledAttributes.getString(i18);
        } else {
            String str6 = Q;
            if (str6 != null) {
                this.H = str6;
            } else {
                this.H = context.getString(b.d.f88742n);
            }
        }
        int i19 = b.e.J;
        if (obtainStyledAttributes.hasValue(i19)) {
            this.B = obtainStyledAttributes.getString(i19);
        } else {
            String str7 = K;
            if (str7 != null) {
                this.B = str7;
            } else {
                this.B = context.getString(b.d.f88740l);
            }
        }
        int i20 = b.e.P;
        if (obtainStyledAttributes.hasValue(i20)) {
            this.G = obtainStyledAttributes.getString(i20);
        } else {
            String str8 = P;
            if (str8 != null) {
                this.G = str8;
            } else {
                this.G = context.getString(b.d.f88743o);
            }
        }
        this.f70564y = new SimpleDateFormat(this.G, Locale.getDefault());
        obtainStyledAttributes.recycle();
        imageView2.animate().setInterpolator(null);
        textView.setVisibility(this.f70565z ? 0 : 8);
        this.f70537e.setText(isInEditMode() ? this.B : this.A);
        if (isInEditMode()) {
            imageView.setVisibility(8);
        } else {
            imageView2.setVisibility(8);
        }
        try {
            if ((context instanceof FragmentActivity) && (supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager()) != null && supportFragmentManager.I0().size() > 0) {
                U(new Date());
                return;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.f70560u += context.getClass().getName();
        this.f70563x = context.getSharedPreferences(ProtectedSandApp.s("⿈\u0001"), 0);
        U(new Date(this.f70563x.getLong(this.f70560u, System.currentTimeMillis())));
    }
}
