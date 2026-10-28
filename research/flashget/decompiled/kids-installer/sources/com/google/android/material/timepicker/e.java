package com.google.android.material.timepicker;

import android.view.accessibility.AccessibilityManager;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.timepicker.ClockHandView;
import com.google.android.material.timepicker.TimePickerView;
import n1.a;

/* compiled from: TimePickerClockPresenter.java */
/* loaded from: classes3.dex */
class e implements ClockHandView.d, TimePickerView.g, TimePickerView.f, ClockHandView.c, g {

    /* renamed from: t, reason: collision with root package name */
    private static final String[] f14628t = {ProtectedSandApp.s("✷"), ProtectedSandApp.s("✸"), ProtectedSandApp.s("✹"), ProtectedSandApp.s("✺"), ProtectedSandApp.s("✻"), ProtectedSandApp.s("✼"), ProtectedSandApp.s("✽"), ProtectedSandApp.s("✾"), ProtectedSandApp.s("✿"), ProtectedSandApp.s("❀"), ProtectedSandApp.s("❁"), ProtectedSandApp.s("❂")};

    /* renamed from: u, reason: collision with root package name */
    private static final String[] f14629u = {ProtectedSandApp.s("❃"), ProtectedSandApp.s("❄"), ProtectedSandApp.s("❅"), ProtectedSandApp.s("❆"), ProtectedSandApp.s("❇"), ProtectedSandApp.s("❈"), ProtectedSandApp.s("❉"), ProtectedSandApp.s("❊"), ProtectedSandApp.s("❋"), ProtectedSandApp.s("❌"), ProtectedSandApp.s("❍"), ProtectedSandApp.s("❎")};

    /* renamed from: v, reason: collision with root package name */
    private static final String[] f14630v = {ProtectedSandApp.s("❏"), ProtectedSandApp.s("❐"), ProtectedSandApp.s("❑"), ProtectedSandApp.s("❒"), ProtectedSandApp.s("❓"), ProtectedSandApp.s("❔"), ProtectedSandApp.s("❕"), ProtectedSandApp.s("❖"), ProtectedSandApp.s("❗"), ProtectedSandApp.s("❘"), ProtectedSandApp.s("❙"), ProtectedSandApp.s("❚")};

    /* renamed from: w, reason: collision with root package name */
    private static final int f14631w = 30;

    /* renamed from: x, reason: collision with root package name */
    private static final int f14632x = 6;

    /* renamed from: o, reason: collision with root package name */
    private TimePickerView f14633o;

    /* renamed from: p, reason: collision with root package name */
    private TimeModel f14634p;

    /* renamed from: q, reason: collision with root package name */
    private float f14635q;

    /* renamed from: r, reason: collision with root package name */
    private float f14636r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f14637s = false;

    public e(TimePickerView timePickerView, TimeModel timeModel) {
        this.f14633o = timePickerView;
        this.f14634p = timeModel;
        b();
    }

    private int h() {
        return this.f14634p.f14587q == 1 ? 15 : 30;
    }

    private String[] i() {
        return this.f14634p.f14587q == 1 ? f14629u : f14628t;
    }

    private void j(int i5, int i6) {
        TimeModel timeModel = this.f14634p;
        if (timeModel.f14589s == i6 && timeModel.f14588r == i5) {
            return;
        }
        this.f14633o.performHapticFeedback(4);
    }

    private void l() {
        TimePickerView timePickerView = this.f14633o;
        TimeModel timeModel = this.f14634p;
        timePickerView.b(timeModel.f14591u, timeModel.c(), this.f14634p.f14589s);
    }

    private void m() {
        String[] strArr = f14628t;
        String s5 = ProtectedSandApp.s("❛");
        n(strArr, s5);
        n(f14629u, s5);
        n(f14630v, ProtectedSandApp.s("❜"));
    }

    private void n(String[] strArr, String str) {
        for (int i5 = 0; i5 < strArr.length; i5++) {
            strArr[i5] = TimeModel.b(this.f14633o.getResources(), strArr[i5], str);
        }
    }

    @Override // com.google.android.material.timepicker.g
    public void a() {
        this.f14633o.setVisibility(0);
    }

    @Override // com.google.android.material.timepicker.g
    public void b() {
        if (this.f14634p.f14587q == 0) {
            this.f14633o.i0();
        }
        this.f14633o.X(this);
        this.f14633o.f0(this);
        this.f14633o.e0(this);
        this.f14633o.c0(this);
        m();
        invalidate();
    }

    @Override // com.google.android.material.timepicker.ClockHandView.c
    public void c(float f6, boolean z5) {
        this.f14637s = true;
        TimeModel timeModel = this.f14634p;
        int i5 = timeModel.f14589s;
        int i6 = timeModel.f14588r;
        if (timeModel.f14590t == 10) {
            this.f14633o.Z(this.f14636r, false);
            if (!((AccessibilityManager) androidx.core.content.d.o(this.f14633o.getContext(), AccessibilityManager.class)).isTouchExplorationEnabled()) {
                k(12, true);
            }
        } else {
            int round = Math.round(f6);
            if (!z5) {
                this.f14634p.i(((round + 15) / 30) * 5);
                this.f14635q = this.f14634p.f14589s * 6;
            }
            this.f14633o.Z(this.f14635q, z5);
        }
        this.f14637s = false;
        l();
        j(i6, i5);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.d
    public void d(float f6, boolean z5) {
        if (this.f14637s) {
            return;
        }
        TimeModel timeModel = this.f14634p;
        int i5 = timeModel.f14588r;
        int i6 = timeModel.f14589s;
        int round = Math.round(f6);
        TimeModel timeModel2 = this.f14634p;
        if (timeModel2.f14590t == 12) {
            timeModel2.i((round + 3) / 6);
            this.f14635q = (float) Math.floor(this.f14634p.f14589s * 6);
        } else {
            this.f14634p.g((round + (h() / 2)) / h());
            this.f14636r = this.f14634p.c() * h();
        }
        if (z5) {
            return;
        }
        l();
        j(i5, i6);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.f
    public void e(int i5) {
        this.f14634p.j(i5);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.g
    public void f(int i5) {
        k(i5, true);
    }

    @Override // com.google.android.material.timepicker.g
    public void g() {
        this.f14633o.setVisibility(8);
    }

    @Override // com.google.android.material.timepicker.g
    public void invalidate() {
        this.f14636r = this.f14634p.c() * h();
        TimeModel timeModel = this.f14634p;
        this.f14635q = timeModel.f14589s * 6;
        k(timeModel.f14590t, false);
        l();
    }

    void k(int i5, boolean z5) {
        boolean z6 = i5 == 12;
        this.f14633o.Y(z6);
        this.f14634p.f14590t = i5;
        this.f14633o.c(z6 ? f14630v : i(), z6 ? a.m.V : a.m.T);
        this.f14633o.Z(z6 ? this.f14635q : this.f14636r, z5);
        this.f14633o.a(i5);
        this.f14633o.b0(new a(this.f14633o.getContext(), a.m.S));
        this.f14633o.a0(new a(this.f14633o.getContext(), a.m.U));
    }
}
