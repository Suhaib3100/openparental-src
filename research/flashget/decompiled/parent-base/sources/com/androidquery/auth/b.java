package com.androidquery.auth;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import androidx.constraintlayout.core.e;
import com.androidquery.callback.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import org.apache.http.HttpRequest;

/* compiled from: GoogleHandle.java */
/* loaded from: classes3.dex */
public class b extends com.androidquery.auth.a implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener {

    /* renamed from: c, reason: collision with root package name */
    private AccountManager f41089c;

    /* renamed from: d, reason: collision with root package name */
    private Account f41090d;

    /* renamed from: e, reason: collision with root package name */
    private String f41091e;

    /* renamed from: f, reason: collision with root package name */
    private Activity f41092f;

    /* renamed from: g, reason: collision with root package name */
    private String f41093g;

    /* renamed from: h, reason: collision with root package name */
    private Account[] f41094h;

    /* renamed from: i, reason: collision with root package name */
    private String f41095i;

    /* compiled from: GoogleHandle.java */
    /* renamed from: com.androidquery.auth.b$b, reason: collision with other inner class name */
    private class AsyncTaskC0679b extends AsyncTask<String, String, Bundle> {
        private AsyncTaskC0679b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bundle doInBackground(String... strArr) {
            try {
                return b.this.f41089c.getAuthToken(b.this.f41090d, b.this.f41091e, (Bundle) null, b.this.f41092f, (AccountManagerCallback<Bundle>) null, (Handler) null).getResult();
            } catch (AuthenticatorException e4) {
                com.androidquery.util.a.k(e4);
                return null;
            } catch (OperationCanceledException unused) {
                return null;
            } catch (IOException e5) {
                com.androidquery.util.a.k(e5);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Bundle bundle) {
            if (bundle != null) {
                String s4 = ProtectedSandApp.s("ܠ");
                if (bundle.containsKey(s4)) {
                    b.this.f41095i = bundle.getString(s4);
                    b bVar = b.this;
                    bVar.k(bVar.f41092f);
                    return;
                }
            }
            b bVar2 = b.this;
            bVar2.g(bVar2.f41092f, c.f41137y, ProtectedSandApp.s("ܡ"));
        }
    }

    public b(Activity activity, String str, String str2) {
        str2 = ProtectedSandApp.s("ܢ").equals(str2) ? t(activity) : str2;
        this.f41092f = activity;
        this.f41091e = str.substring(2);
        this.f41093g = str2;
        this.f41089c = AccountManager.get(activity);
    }

    private void r() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f41092f);
        Account[] accountsByType = this.f41089c.getAccountsByType(ProtectedSandApp.s("ܣ"));
        this.f41094h = accountsByType;
        int length = accountsByType.length;
        if (length == 1) {
            s(accountsByType[0]);
            return;
        }
        String[] strArr = new String[length];
        for (int i4 = 0; i4 < length; i4++) {
            strArr[i4] = this.f41094h[i4].name;
        }
        builder.setItems(strArr, this);
        builder.setOnCancelListener(this);
        new com.androidquery.a(this.f41092f).y1(builder.create());
    }

    private void s(Account account) {
        this.f41090d = account;
        new AsyncTaskC0679b().execute(new String[0]);
    }

    public static String t(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString(ProtectedSandApp.s("ܢ"), null);
    }

    public static void v(Context context, String str) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString(ProtectedSandApp.s("ܢ"), str).commit();
    }

    @Override // com.androidquery.auth.a
    public void b(com.androidquery.callback.a<?, ?> aVar, HttpRequest httpRequest) {
        httpRequest.addHeader(ProtectedSandApp.s("ܥ"), ProtectedSandApp.s("ܤ") + this.f41095i);
    }

    @Override // com.androidquery.auth.a
    protected void c() {
        if (this.f41093g == null) {
            r();
            return;
        }
        for (Account account : this.f41089c.getAccountsByType(ProtectedSandApp.s("ܣ"))) {
            if (this.f41093g.equals(account.name)) {
                s(account);
                return;
            }
        }
    }

    @Override // com.androidquery.auth.a
    public boolean e() {
        return this.f41095i != null;
    }

    @Override // com.androidquery.auth.a
    public boolean f(com.androidquery.callback.a<?, ?> aVar, c cVar) {
        int l4 = cVar.l();
        return l4 == 401 || l4 == 403;
    }

    @Override // com.androidquery.auth.a
    public String h(String str) {
        StringBuilder a5 = e.a(str, ProtectedSandApp.s("ܦ"));
        a5.append(this.f41095i);
        return a5.toString();
    }

    @Override // com.androidquery.auth.a
    public boolean j(com.androidquery.callback.a<?, ?> aVar) {
        this.f41089c.invalidateAuthToken(this.f41090d.type, this.f41095i);
        try {
            String blockingGetAuthToken = this.f41089c.blockingGetAuthToken(this.f41090d, this.f41091e, true);
            this.f41095i = blockingGetAuthToken;
            com.androidquery.util.a.j(ProtectedSandApp.s("ܧ"), blockingGetAuthToken);
        } catch (Exception e4) {
            com.androidquery.util.a.k(e4);
            this.f41095i = null;
        }
        return this.f41095i != null;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        g(this.f41092f, c.f41137y, ProtectedSandApp.s("ܨ"));
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i4) {
        Account account = this.f41094h[i4];
        com.androidquery.util.a.j(ProtectedSandApp.s("ܩ"), account.name);
        v(this.f41092f, account.name);
        s(account);
    }

    public String u() {
        return this.f41091e;
    }
}
