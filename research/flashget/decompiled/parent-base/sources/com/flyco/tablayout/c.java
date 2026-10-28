package com.flyco.tablayout;

import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: TabItemBean.java */
/* loaded from: classes5.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private String f50103a;

    /* renamed from: b, reason: collision with root package name */
    private String f50104b;

    /* renamed from: c, reason: collision with root package name */
    private String f50105c;

    /* renamed from: d, reason: collision with root package name */
    private String f50106d;

    public c() {
        this.f50103a = ProtectedSandApp.s("썈");
        this.f50104b = ProtectedSandApp.s("썉");
        this.f50105c = "";
        this.f50106d = ProtectedSandApp.s("썊");
    }

    public String a() {
        String str = this.f50106d;
        return str == null ? "" : str;
    }

    public String b() {
        String str = this.f50105c;
        return str == null ? "" : str;
    }

    public String c() {
        String str = this.f50103a;
        return str == null ? "" : str;
    }

    public String d() {
        String str = this.f50104b;
        return str == null ? "" : str;
    }

    public void e(String str) {
        this.f50106d = str;
    }

    public void f(String str) {
        this.f50105c = str;
    }

    public void g(String str) {
        this.f50103a = str;
    }

    public void h(String str) {
        this.f50104b = str;
    }

    public c(String str, String str2, String str3, String str4) {
        String s4 = ProtectedSandApp.s("썈");
        this.f50103a = s4;
        String s5 = ProtectedSandApp.s("썉");
        this.f50104b = s5;
        this.f50105c = "";
        String s6 = ProtectedSandApp.s("썊");
        this.f50106d = s6;
        this.f50103a = TextUtils.isEmpty(str4) ? s4 : str;
        this.f50104b = TextUtils.isEmpty(str4) ? s5 : str2;
        this.f50105c = str3;
        this.f50106d = TextUtils.isEmpty(str4) ? s6 : str4;
    }
}
