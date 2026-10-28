package com.lxj.xpopup.core;

import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import androidx.view.AbstractC1450w;
import fb.c;
import fb.d;
import gb.j;
import java.util.ArrayList;

/* compiled from: PopupInfo.java */
/* loaded from: classes6.dex */
public class b {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public int O;
    public int P;
    public ArrayList<Rect> Q;
    public AbstractC1450w R;
    public Boolean S;

    /* renamed from: a, reason: collision with root package name */
    public Boolean f69623a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f69624b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f69625c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f69626d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f69627e;

    /* renamed from: f, reason: collision with root package name */
    public View f69628f;

    /* renamed from: g, reason: collision with root package name */
    public c f69629g;

    /* renamed from: h, reason: collision with root package name */
    public com.lxj.xpopup.animator.c f69630h;

    /* renamed from: i, reason: collision with root package name */
    public PointF f69631i;

    /* renamed from: j, reason: collision with root package name */
    public int f69632j;

    /* renamed from: k, reason: collision with root package name */
    public int f69633k;

    /* renamed from: l, reason: collision with root package name */
    public int f69634l;

    /* renamed from: m, reason: collision with root package name */
    public int f69635m;

    /* renamed from: n, reason: collision with root package name */
    public float f69636n;

    /* renamed from: o, reason: collision with root package name */
    public Boolean f69637o;

    /* renamed from: p, reason: collision with root package name */
    public j f69638p;

    /* renamed from: q, reason: collision with root package name */
    public Boolean f69639q;

    /* renamed from: r, reason: collision with root package name */
    public d f69640r;

    /* renamed from: s, reason: collision with root package name */
    public Boolean f69641s;

    /* renamed from: t, reason: collision with root package name */
    public Boolean f69642t;

    /* renamed from: u, reason: collision with root package name */
    public Boolean f69643u;

    /* renamed from: v, reason: collision with root package name */
    public int f69644v;

    /* renamed from: w, reason: collision with root package name */
    public int f69645w;

    /* renamed from: x, reason: collision with root package name */
    public int f69646x;

    /* renamed from: y, reason: collision with root package name */
    public int f69647y;

    /* renamed from: z, reason: collision with root package name */
    public int f69648z;

    public b() {
        Boolean bool = Boolean.TRUE;
        this.f69623a = bool;
        this.f69624b = bool;
        this.f69625c = bool;
        this.f69626d = bool;
        Boolean bool2 = Boolean.FALSE;
        this.f69627e = bool2;
        this.f69628f = null;
        this.f69629g = null;
        this.f69630h = null;
        this.f69631i = null;
        this.f69636n = 15.0f;
        this.f69637o = bool2;
        this.f69639q = bool;
        this.f69640r = null;
        this.f69641s = bool2;
        this.f69642t = bool;
        this.f69643u = bool;
        this.f69644v = 0;
        this.f69645w = 0;
        this.f69646x = 0;
        this.A = true;
        this.B = false;
        this.C = true;
        this.D = true;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = false;
        this.M = false;
        this.N = 0;
        this.O = -1;
        this.P = 0;
        this.S = bool2;
    }

    public Rect a() {
        int[] iArr = new int[2];
        this.f69628f.getLocationInWindow(iArr);
        int i4 = iArr[0];
        return new Rect(i4, iArr[1], this.f69628f.getMeasuredWidth() + i4, this.f69628f.getMeasuredHeight() + iArr[1]);
    }
}
