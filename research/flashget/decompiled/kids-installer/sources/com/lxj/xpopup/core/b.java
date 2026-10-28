package com.lxj.xpopup.core;

import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.t;
import b3.c;
import b3.d;
import c3.j;
import java.util.ArrayList;

/* compiled from: PopupInfo.java */
/* loaded from: classes5.dex */
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
    public t R;
    public Boolean S;

    /* renamed from: a, reason: collision with root package name */
    public Boolean f21149a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f21150b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f21151c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f21152d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f21153e;

    /* renamed from: f, reason: collision with root package name */
    public View f21154f;

    /* renamed from: g, reason: collision with root package name */
    public c f21155g;

    /* renamed from: h, reason: collision with root package name */
    public com.lxj.xpopup.animator.c f21156h;

    /* renamed from: i, reason: collision with root package name */
    public PointF f21157i;

    /* renamed from: j, reason: collision with root package name */
    public int f21158j;

    /* renamed from: k, reason: collision with root package name */
    public int f21159k;

    /* renamed from: l, reason: collision with root package name */
    public int f21160l;

    /* renamed from: m, reason: collision with root package name */
    public int f21161m;

    /* renamed from: n, reason: collision with root package name */
    public float f21162n;

    /* renamed from: o, reason: collision with root package name */
    public Boolean f21163o;

    /* renamed from: p, reason: collision with root package name */
    public j f21164p;

    /* renamed from: q, reason: collision with root package name */
    public Boolean f21165q;

    /* renamed from: r, reason: collision with root package name */
    public d f21166r;

    /* renamed from: s, reason: collision with root package name */
    public Boolean f21167s;

    /* renamed from: t, reason: collision with root package name */
    public Boolean f21168t;

    /* renamed from: u, reason: collision with root package name */
    public Boolean f21169u;

    /* renamed from: v, reason: collision with root package name */
    public int f21170v;

    /* renamed from: w, reason: collision with root package name */
    public int f21171w;

    /* renamed from: x, reason: collision with root package name */
    public int f21172x;

    /* renamed from: y, reason: collision with root package name */
    public int f21173y;

    /* renamed from: z, reason: collision with root package name */
    public int f21174z;

    public b() {
        Boolean bool = Boolean.TRUE;
        this.f21149a = bool;
        this.f21150b = bool;
        this.f21151c = bool;
        this.f21152d = bool;
        Boolean bool2 = Boolean.FALSE;
        this.f21153e = bool2;
        this.f21154f = null;
        this.f21155g = null;
        this.f21156h = null;
        this.f21157i = null;
        this.f21162n = 15.0f;
        this.f21163o = bool2;
        this.f21165q = bool;
        this.f21166r = null;
        this.f21167s = bool2;
        this.f21168t = bool;
        this.f21169u = bool;
        this.f21170v = 0;
        this.f21171w = 0;
        this.f21172x = 0;
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
        this.f21154f.getLocationInWindow(iArr);
        int i5 = iArr[0];
        return new Rect(i5, iArr[1], this.f21154f.getMeasuredWidth() + i5, this.f21154f.getMeasuredHeight() + iArr[1]);
    }
}
