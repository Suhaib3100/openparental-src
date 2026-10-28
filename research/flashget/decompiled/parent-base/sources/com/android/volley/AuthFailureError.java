package com.android.volley;

import android.content.Intent;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes3.dex */
public class AuthFailureError extends VolleyError {

    /* renamed from: d, reason: collision with root package name */
    private Intent f40810d;

    public AuthFailureError() {
    }

    public Intent c() {
        return this.f40810d;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f40810d != null ? ProtectedSandApp.s("١") : super.getMessage();
    }

    public AuthFailureError(Intent intent) {
        this.f40810d = intent;
    }

    public AuthFailureError(l lVar) {
        super(lVar);
    }

    public AuthFailureError(String str) {
        super(str);
    }

    public AuthFailureError(String str, Exception exc) {
        super(str, exc);
    }
}
