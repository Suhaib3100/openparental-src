package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.fragment.app.e0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes2.dex */
public class Storage {
    private static final Lock zaa = new ReentrantLock();

    @q0
    @GuardedBy("sLk")
    private static Storage zab;
    private final Lock zac = new ReentrantLock();

    @GuardedBy("mLk")
    private final SharedPreferences zad;

    @VisibleForTesting
    Storage(Context context) {
        this.zad = context.getSharedPreferences(ProtectedSandApp.s("\u09b3"), 0);
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
        return e0.a(new StringBuilder(str.length() + 1 + String.valueOf(str2).length()), str, ProtectedSandApp.s("\u09b4"), str2);
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
        String zaa3 = zaa(ProtectedSandApp.s("\u09b5"));
        if (TextUtils.isEmpty(zaa3) || (zaa2 = zaa(zae(ProtectedSandApp.s("শ"), zaa3))) == null) {
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
        String zaa3 = zaa(ProtectedSandApp.s("ষ"));
        if (TextUtils.isEmpty(zaa3) || (zaa2 = zaa(zae(ProtectedSandApp.s("স"), zaa3))) == null) {
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
        return zaa(ProtectedSandApp.s("হ"));
    }

    @KeepForSdk
    public void saveDefaultGoogleSignInAccount(@o0 GoogleSignInAccount googleSignInAccount, @o0 GoogleSignInOptions googleSignInOptions) {
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        zad(ProtectedSandApp.s("\u09ba"), googleSignInAccount.zac());
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        String zac = googleSignInAccount.zac();
        zad(zae(ProtectedSandApp.s("\u09bb"), zac), googleSignInAccount.zad());
        zad(zae(ProtectedSandApp.s("়"), zac), googleSignInOptions.zaf());
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
        String s5 = ProtectedSandApp.s("ঽ");
        String zaa2 = zaa(s5);
        zab(s5);
        if (TextUtils.isEmpty(zaa2)) {
            return;
        }
        zab(zae(ProtectedSandApp.s("া"), zaa2));
        zab(zae(ProtectedSandApp.s("ি"), zaa2));
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
