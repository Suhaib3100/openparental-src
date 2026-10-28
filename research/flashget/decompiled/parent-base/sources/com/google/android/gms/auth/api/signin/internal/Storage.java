package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.compose.material3.z3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import g9.a;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public class Storage {
    private static final Lock zaa = new ReentrantLock();

    @q0
    @a("sLk")
    private static Storage zab;
    private final Lock zac = new ReentrantLock();

    @a("mLk")
    private final SharedPreferences zad;

    @m1
    Storage(Context context) {
        this.zad = context.getSharedPreferences(ProtectedSandApp.s("젦"), 0);
    }

    @o0
    @KeepForSdk
    public static Storage getInstance(@o0 Context context) {
        Preconditions.checkNotNull(context);
        Lock lock = zaa;
        lock.lock();
        try {
            if (zab == null) {
                zab = new Storage(context.getApplicationContext());
            }
            Storage storage = zab;
            lock.unlock();
            return storage;
        } catch (Throwable th) {
            zaa.unlock();
            throw th;
        }
    }

    private static final String zae(String str, String str2) {
        return z3.a(str, ProtectedSandApp.s("젧"), str2);
    }

    @KeepForSdk
    public void clear() {
        this.zac.lock();
        try {
            this.zad.edit().clear().apply();
        } finally {
            this.zac.unlock();
        }
    }

    @q0
    @KeepForSdk
    public GoogleSignInAccount getSavedDefaultGoogleSignInAccount() {
        String zaa2;
        String zaa3 = zaa(ProtectedSandApp.s("젨"));
        if (TextUtils.isEmpty(zaa3) || (zaa2 = zaa(zae(ProtectedSandApp.s("젩"), zaa3))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.zab(zaa2);
        } catch (JSONException unused) {
            return null;
        }
    }

    @q0
    @KeepForSdk
    public GoogleSignInOptions getSavedDefaultGoogleSignInOptions() {
        String zaa2;
        String zaa3 = zaa(ProtectedSandApp.s("젨"));
        if (TextUtils.isEmpty(zaa3) || (zaa2 = zaa(zae(ProtectedSandApp.s("젪"), zaa3))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.zab(zaa2);
        } catch (JSONException unused) {
            return null;
        }
    }

    @q0
    @KeepForSdk
    public String getSavedRefreshToken() {
        return zaa(ProtectedSandApp.s("젫"));
    }

    @KeepForSdk
    public void saveDefaultGoogleSignInAccount(@o0 GoogleSignInAccount googleSignInAccount, @o0 GoogleSignInOptions googleSignInOptions) {
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        zad(ProtectedSandApp.s("젨"), googleSignInAccount.zac());
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        String zac = googleSignInAccount.zac();
        zad(zae(ProtectedSandApp.s("젩"), zac), googleSignInAccount.zad());
        zad(zae(ProtectedSandApp.s("젪"), zac), googleSignInOptions.zaf());
    }

    @q0
    protected final String zaa(@o0 String str) {
        this.zac.lock();
        try {
            return this.zad.getString(str, null);
        } finally {
            this.zac.unlock();
        }
    }

    protected final void zab(@o0 String str) {
        this.zac.lock();
        try {
            this.zad.edit().remove(str).apply();
        } finally {
            this.zac.unlock();
        }
    }

    public final void zac() {
        String s4 = ProtectedSandApp.s("젨");
        String zaa2 = zaa(s4);
        zab(s4);
        if (TextUtils.isEmpty(zaa2)) {
            return;
        }
        zab(zae(ProtectedSandApp.s("젩"), zaa2));
        zab(zae(ProtectedSandApp.s("젪"), zaa2));
    }

    protected final void zad(@o0 String str, @o0 String str2) {
        this.zac.lock();
        try {
            this.zad.edit().putString(str, str2).apply();
        } finally {
            this.zac.unlock();
        }
    }
}
