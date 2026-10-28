package com.google.android.material.timepicker;

import android.view.accessibility.AccessibilityManager;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.timepicker.ClockHandView;
import com.google.android.material.timepicker.TimePickerView;
import s8.a;

/* compiled from: TimePickerClockPresenter.java */
/* loaded from: classes6.dex */
class e implements ClockHandView.d, TimePickerView.g, TimePickerView.f, ClockHandView.c, g {

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f54477g = {ProtectedSandApp.s("\uf25a"), ProtectedSandApp.s("\uf25b"), ProtectedSandApp.s("\uf25c"), ProtectedSandApp.s("\uf25d"), ProtectedSandApp.s("\uf25e"), ProtectedSandApp.s("\uf25f"), ProtectedSandApp.s("\uf260"), ProtectedSandApp.s("\uf261"), ProtectedSandApp.s("\uf262"), ProtectedSandApp.s("\uf263"), ProtectedSandApp.s("\uf258"), ProtectedSandApp.s("\uf259")};

    /* renamed from: h, reason: collision with root package name */
    private static final String[] f54478h = {ProtectedSandApp.s("\uf266"), ProtectedSandApp.s("\uf25c"), ProtectedSandApp.s("\uf25e"), ProtectedSandApp.s("\uf260"), ProtectedSandApp.s("\uf262"), ProtectedSandApp.s("\uf258"), ProtectedSandApp.s("\uf25a"), ProtectedSandApp.s("\uf267"), ProtectedSandApp.s("\uf268"), ProtectedSandApp.s("\uf269"), ProtectedSandApp.s("\uf264"), ProtectedSandApp.s("\uf265")};

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f54479i = {ProtectedSandApp.s("\uf266"), ProtectedSandApp.s("\uf25f"), ProtectedSandApp.s("\uf258"), ProtectedSandApp.s("\uf26c"), ProtectedSandApp.s("\uf264"), ProtectedSandApp.s("\uf26d"), ProtectedSandApp.s("\uf26e"), ProtectedSandApp.s("\uf26f"), ProtectedSandApp.s("\uf270"), ProtectedSandApp.s("\uf271"), ProtectedSandApp.s("\uf26a"), ProtectedSandApp.s("\uf26b")};

    /* renamed from: j, reason: collision with root package name */
    private static final int f54480j = 30;

    /* renamed from: k, reason: collision with root package name */
    private static final int f54481k = 6;

    /* renamed from: b, reason: collision with root package name */
    private TimePickerView f54482b;

    /* renamed from: c, reason: collision with root package name */
    private TimeModel f54483c;

    /* renamed from: d, reason: collision with root package name */
    private float f54484d;

    /* renamed from: e, reason: collision with root package name */
    private float f54485e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f54486f = false;

    public e(TimePickerView timePickerView, TimeModel timeModel) {
        this.f54482b = timePickerView;
        this.f54483c = timeModel;
        c();
    }

    private int h() {
        return this.f54483c.f54430d == 1 ? 15 : 30;
    }

    private String[] i() {
        return this.f54483c.f54430d == 1 ? f54478h : f54477g;
    }

    private void j(int i4, int i5) {
        TimeModel timeModel = this.f54483c;
        if (timeModel.f54432f == i5 && timeModel.f54431e == i4) {
            return;
        }
        this.f54482b.performHapticFeedback(4);
    }

    private void l() {
        TimePickerView timePickerView = this.f54482b;
        TimeModel timeModel = this.f54483c;
        timePickerView.b(timeModel.f54434h, timeModel.c(), this.f54483c.f54432f);
    }

    private void m() {
        String[] strArr = f54477g;
        String s4 = ProtectedSandApp.s("\uf272");
        n(strArr, s4);
        n(f54478h, s4);
        n(f54479i, ProtectedSandApp.s("\uf273"));
    }

    private void n(String[] strArr, String str) {
        for (int i4 = 0; i4 < strArr.length; i4++) {
            strArr[i4] = TimeModel.b(this.f54482b.getResources(), strArr[i4], str);
        }
    }

    @Override // com.google.android.material.timepicker.g
    public void a() {
        this.f54482b.setVisibility(8);
    }

    @Override // com.google.android.material.timepicker.g
    public void b() {
        this.f54482b.setVisibility(0);
    }

    @Override // com.google.android.material.timepicker.g
    public void c() {
        if (this.f54483c.f54430d == 0) {
            this.f54482b.i0();
        }
        this.f54482b.X(this);
        this.f54482b.f0(this);
        this.f54482b.e0(this);
        this.f54482b.c0(this);
        m();
        invalidate();
    }

    @Override // com.google.android.material.timepicker.ClockHandView.c
    public void d(float f4, boolean z4) {
        this.f54486f = true;
        TimeModel timeModel = this.f54483c;
        int i4 = timeModel.f54432f;
        int i5 = timeModel.f54431e;
        if (timeModel.f54433g == 10) {
            this.f54482b.Z(this.f54485e, false);
            if (!((AccessibilityManager) androidx.core.content.d.getSystemService(this.f54482b.getContext(), AccessibilityManager.class)).isTouchExplorationEnabled()) {
                k(12, true);
            }
        } else {
            int round = Math.round(f4);
            if (!z4) {
                this.f54483c.j(((round + 15) / 30) * 5);
                this.f54484d = this.f54483c.f54432f * 6;
            }
            this.f54482b.Z(this.f54484d, z4);
        }
        this.f54486f = false;
        l();
        j(i5, i4);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.f
    public void e(int i4) {
        this.f54483c.k(i4);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.g
    public void f(int i4) {
        k(i4, true);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.d
    public void g(float f4, boolean z4) {
        if (this.f54486f) {
            return;
        }
        TimeModel timeModel = this.f54483c;
        int i4 = timeModel.f54431e;
        int i5 = timeModel.f54432f;
        int round = Math.round(f4);
        TimeModel timeModel2 = this.f54483c;
        if (timeModel2.f54433g == 12) {
            timeModel2.j((round + 3) / 6);
            this.f54484d = (float) Math.floor(this.f54483c.f54432f * 6);
        } else {
            this.f54483c.g((round + (h() / 2)) / h());
            this.f54485e = this.f54483c.c() * h();
        }
        if (z4) {
            return;
        }
        l();
        j(i4, i5);
    }

    @Override // com.google.android.material.timepicker.g
    public void invalidate() {
        this.f54485e = this.f54483c.c() * h();
        TimeModel timeModel = this.f54483c;
        this.f54484d = timeModel.f54432f * 6;
        k(timeModel.f54433g, false);
        l();
    }

    void k(int i4, boolean z4) {
        boolean z5 = i4 == 12;
        this.f54482b.Y(z5);
        this.f54483c.f54433g = i4;
        this.f54482b.c(z5 ? f54479i : i(), z5 ? a.m.V : a.m.T);
        this.f54482b.Z(z5 ? this.f54484d : this.f54485e, z4);
        this.f54482b.a(i4);
        this.f54482b.b0(new a(this.f54482b.getContext(), a.m.S));
        this.f54482b.a0(new a(this.f54482b.getContext(), a.m.U));
    }
}
