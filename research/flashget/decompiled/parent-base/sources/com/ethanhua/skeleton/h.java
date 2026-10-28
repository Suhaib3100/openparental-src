package com.ethanhua.skeleton;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: ViewReplacer.java */
/* loaded from: classes3.dex */
public class h {

    /* renamed from: i, reason: collision with root package name */
    private static final String f49107i = ProtectedSandApp.s("ᔴ");

    /* renamed from: a, reason: collision with root package name */
    private final View f49108a;

    /* renamed from: b, reason: collision with root package name */
    private View f49109b;

    /* renamed from: d, reason: collision with root package name */
    private View f49111d;

    /* renamed from: e, reason: collision with root package name */
    private ViewGroup f49112e;

    /* renamed from: f, reason: collision with root package name */
    private final ViewGroup.LayoutParams f49113f;

    /* renamed from: h, reason: collision with root package name */
    private final int f49115h;

    /* renamed from: c, reason: collision with root package name */
    private int f49110c = -1;

    /* renamed from: g, reason: collision with root package name */
    private int f49114g = 0;

    public h(View view) {
        this.f49108a = view;
        this.f49113f = view.getLayoutParams();
        this.f49111d = view;
        this.f49115h = view.getId();
    }

    private boolean d() {
        if (this.f49112e != null) {
            return true;
        }
        ViewGroup viewGroup = (ViewGroup) this.f49108a.getParent();
        this.f49112e = viewGroup;
        if (viewGroup == null) {
            return false;
        }
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            if (this.f49108a == this.f49112e.getChildAt(i4)) {
                this.f49114g = i4;
                return true;
            }
        }
        return true;
    }

    public View a() {
        return this.f49111d;
    }

    public View b() {
        return this.f49108a;
    }

    public View c() {
        return this.f49109b;
    }

    public void e(int i4) {
        if (this.f49110c != i4 && d()) {
            this.f49110c = i4;
            f(LayoutInflater.from(this.f49108a.getContext()).inflate(this.f49110c, this.f49112e, false));
        }
    }

    public void f(View view) {
        if (this.f49111d == view) {
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        if (d()) {
            this.f49109b = view;
            this.f49112e.removeView(this.f49111d);
            this.f49109b.setId(this.f49115h);
            this.f49112e.addView(this.f49109b, this.f49114g, this.f49113f);
            this.f49111d = this.f49109b;
        }
    }

    public void g() {
        ViewGroup viewGroup = this.f49112e;
        if (viewGroup != null) {
            viewGroup.removeView(this.f49111d);
            this.f49112e.addView(this.f49108a, this.f49114g, this.f49113f);
            this.f49111d = this.f49108a;
            this.f49109b = null;
            this.f49110c = -1;
        }
    }
}
