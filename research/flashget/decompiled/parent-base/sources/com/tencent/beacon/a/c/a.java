package com.tencent.beacon.a.c;

import android.content.SharedPreferences;
import com.tencent.beacon.a.d.a;

/* compiled from: AppInfo.java */
/* loaded from: classes6.dex */
class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.tencent.beacon.a.d.a f71066a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f71067b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f71068c;

    a(com.tencent.beacon.a.d.a aVar, String str, long j4) {
        this.f71066a = aVar;
        this.f71067b = str;
        this.f71068c = j4;
    }

    @Override // java.lang.Runnable
    public void run() {
        a.SharedPreferencesEditorC0995a edit = this.f71066a.edit();
        if (com.tencent.beacon.base.util.b.a((SharedPreferences.Editor) edit)) {
            edit.putLong(this.f71067b, this.f71068c);
        }
    }
}
