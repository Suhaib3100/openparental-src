package com.google.zxing.client.result;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.text.m0;

/* compiled from: SMSParsedResult.java */
/* loaded from: classes6.dex */
public final class w extends q {

    /* renamed from: b, reason: collision with root package name */
    private final String[] f62754b;

    /* renamed from: c, reason: collision with root package name */
    private final String[] f62755c;

    /* renamed from: d, reason: collision with root package name */
    private final String f62756d;

    /* renamed from: e, reason: collision with root package name */
    private final String f62757e;

    public w(String str, String str2, String str3, String str4) {
        super(r.SMS);
        this.f62754b = new String[]{str};
        this.f62755c = new String[]{str2};
        this.f62756d = str3;
        this.f62757e = str4;
    }

    @Override // com.google.zxing.client.result.q
    public String a() {
        StringBuilder sb = new StringBuilder(100);
        q.d(this.f62754b, sb);
        q.c(this.f62756d, sb);
        q.c(this.f62757e, sb);
        return sb.toString();
    }

    public String e() {
        return this.f62757e;
    }

    public String[] f() {
        return this.f62754b;
    }

    public String g() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("\u0a12\u0001"));
        boolean z4 = true;
        for (int i4 = 0; i4 < this.f62754b.length; i4++) {
            if (z4) {
                z4 = false;
            } else {
                sb.append(',');
            }
            sb.append(this.f62754b[i4]);
            String[] strArr = this.f62755c;
            if (strArr != null && strArr[i4] != null) {
                sb.append(ProtectedSandApp.s("ਓ\u0001"));
                sb.append(this.f62755c[i4]);
            }
        }
        boolean z5 = this.f62757e != null;
        boolean z6 = this.f62756d != null;
        if (z5 || z6) {
            sb.append('?');
            if (z5) {
                sb.append(ProtectedSandApp.s("ਔ\u0001"));
                sb.append(this.f62757e);
            }
            if (z6) {
                if (z5) {
                    sb.append(m0.amp);
                }
                sb.append(ProtectedSandApp.s("ਕ\u0001"));
                sb.append(this.f62756d);
            }
        }
        return sb.toString();
    }

    public String h() {
        return this.f62756d;
    }

    public String[] i() {
        return this.f62755c;
    }

    public w(String[] strArr, String[] strArr2, String str, String str2) {
        super(r.SMS);
        this.f62754b = strArr;
        this.f62755c = strArr2;
        this.f62756d = str;
        this.f62757e = str2;
    }
}
