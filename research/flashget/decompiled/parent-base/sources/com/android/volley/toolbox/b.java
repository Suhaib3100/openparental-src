package com.android.volley.toolbox;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerFuture;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.m1;
import com.android.volley.AuthFailureError;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: AndroidAuthenticator.java */
@SuppressLint({"MissingPermission"})
/* loaded from: classes3.dex */
public class b implements d {

    /* renamed from: a, reason: collision with root package name */
    private final AccountManager f40968a;

    /* renamed from: b, reason: collision with root package name */
    private final Account f40969b;

    /* renamed from: c, reason: collision with root package name */
    private final String f40970c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f40971d;

    public b(Context context, Account account, String str) {
        this(context, account, str, false);
    }

    @Override // com.android.volley.toolbox.d
    public void a(String str) {
        this.f40968a.invalidateAuthToken(this.f40969b.type, str);
    }

    @Override // com.android.volley.toolbox.d
    public String b() throws AuthFailureError {
        String str;
        AccountManagerFuture<Bundle> authToken = this.f40968a.getAuthToken(this.f40969b, this.f40970c, this.f40971d, null, null);
        try {
            Bundle result = authToken.getResult();
            if (!authToken.isDone() || authToken.isCancelled()) {
                str = null;
            } else {
                String s4 = ProtectedSandApp.s("ڰ");
                if (result.containsKey(s4)) {
                    throw new AuthFailureError((Intent) result.getParcelable(s4));
                }
                str = result.getString(ProtectedSandApp.s("ڱ"));
            }
            if (str != null) {
                return str;
            }
            throw new AuthFailureError(ProtectedSandApp.s("ڲ") + this.f40970c);
        } catch (Exception e4) {
            throw new AuthFailureError(ProtectedSandApp.s("ڳ"), (Throwable) e4);
        }
    }

    public Account c() {
        return this.f40969b;
    }

    public String d() {
        return this.f40970c;
    }

    public b(Context context, Account account, String str, boolean z4) {
        this(AccountManager.get(context), account, str, z4);
    }

    @m1
    b(AccountManager accountManager, Account account, String str, boolean z4) {
        this.f40968a = accountManager;
        this.f40969b = account;
        this.f40970c = str;
        this.f40971d = z4;
    }
}
