package com.jcodecraeer.xrecyclerview;

import com.google.android.material.appbar.AppBarLayout;

/* compiled from: AppBarStateChangeListener.java */
/* loaded from: classes6.dex */
public abstract class a implements AppBarLayout.d {

    /* renamed from: a, reason: collision with root package name */
    private EnumC0973a f64942a = EnumC0973a.IDLE;

    /* compiled from: AppBarStateChangeListener.java */
    /* renamed from: com.jcodecraeer.xrecyclerview.a$a, reason: collision with other inner class name */
    public enum EnumC0973a {
        EXPANDED,
        COLLAPSED,
        IDLE
    }

    @Override // com.google.android.material.appbar.AppBarLayout.d, com.google.android.material.appbar.AppBarLayout.c
    public final void a(AppBarLayout appBarLayout, int i4) {
        if (i4 == 0) {
            EnumC0973a enumC0973a = this.f64942a;
            EnumC0973a enumC0973a2 = EnumC0973a.EXPANDED;
            if (enumC0973a != enumC0973a2) {
                b(appBarLayout, enumC0973a2);
            }
            this.f64942a = enumC0973a2;
            return;
        }
        if (Math.abs(i4) >= appBarLayout.q()) {
            EnumC0973a enumC0973a3 = this.f64942a;
            EnumC0973a enumC0973a4 = EnumC0973a.COLLAPSED;
            if (enumC0973a3 != enumC0973a4) {
                b(appBarLayout, enumC0973a4);
            }
            this.f64942a = enumC0973a4;
            return;
        }
        EnumC0973a enumC0973a5 = this.f64942a;
        EnumC0973a enumC0973a6 = EnumC0973a.IDLE;
        if (enumC0973a5 != enumC0973a6) {
            b(appBarLayout, enumC0973a6);
        }
        this.f64942a = enumC0973a6;
    }

    public abstract void b(AppBarLayout appBarLayout, EnumC0973a enumC0973a);
}
