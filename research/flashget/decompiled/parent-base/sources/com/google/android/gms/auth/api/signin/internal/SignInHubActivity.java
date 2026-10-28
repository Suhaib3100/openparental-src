package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.fragment.app.FragmentActivity;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@KeepName
/* loaded from: classes5.dex */
public class SignInHubActivity extends FragmentActivity {
    private static boolean zba;
    private boolean zbb = false;
    private SignInConfiguration zbc;
    private boolean zbd;
    private int zbe;
    private Intent zbf;

    private final void zbc() {
        getSupportLoaderManager().g(0, null, new zbw(this, null));
        zba = false;
    }

    private final void zbd(int i4) {
        Status status = new Status(i4);
        Intent intent = new Intent();
        intent.putExtra(ProtectedSandApp.s("젙"), status);
        setResult(0, intent);
        finish();
        zba = false;
    }

    private final void zbe(String str) {
        Intent intent = new Intent(str);
        if (str.equals(ProtectedSandApp.s("젚"))) {
            intent.setPackage(ProtectedSandApp.s("젛"));
        } else {
            intent.setPackage(getPackageName());
        }
        intent.putExtra(ProtectedSandApp.s("제"), this.zbc);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException unused) {
            this.zbb = true;
            zbd(17);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(@o0 AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    protected final void onActivityResult(int i4, int i5, @q0 Intent intent) {
        if (this.zbb) {
            return;
        }
        setResult(0);
        if (i4 != 40962) {
            return;
        }
        if (intent != null) {
            String s4 = ProtectedSandApp.s("젝");
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra(s4);
            if (signInAccount != null && signInAccount.zba() != null) {
                GoogleSignInAccount zba2 = signInAccount.zba();
                if (zba2 == null) {
                    zbd(GoogleSignInStatusCodes.SIGN_IN_FAILED);
                    return;
                }
                zbn.zbc(this).zbe(this.zbc.zba(), zba2);
                intent.removeExtra(s4);
                intent.putExtra(ProtectedSandApp.s("젞"), zba2);
                this.zbd = true;
                this.zbe = i5;
                this.zbf = intent;
                zbc();
                return;
            }
            String s5 = ProtectedSandApp.s("젟");
            if (intent.hasExtra(s5)) {
                int intExtra = intent.getIntExtra(s5, 8);
                if (intExtra == 13) {
                    intExtra = GoogleSignInStatusCodes.SIGN_IN_CANCELLED;
                }
                zbd(intExtra);
                return;
            }
        }
        zbd(8);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(@q0 Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            zbd(GoogleSignInStatusCodes.SIGN_IN_FAILED);
            return;
        }
        if (action.equals(ProtectedSandApp.s("젠"))) {
            zbd(GoogleSignInStatusCodes.SIGN_IN_FAILED);
            return;
        }
        if (!action.equals(ProtectedSandApp.s("젚")) && !action.equals(ProtectedSandApp.s("젡"))) {
            ProtectedSandApp.s("젢").concat(String.valueOf(intent.getAction()));
            finish();
            return;
        }
        String s4 = ProtectedSandApp.s("제");
        Bundle bundleExtra = intent.getBundleExtra(s4);
        if (bundleExtra == null) {
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable(s4);
        if (signInConfiguration == null) {
            setResult(0);
            finish();
            return;
        }
        this.zbc = signInConfiguration;
        if (bundle == null) {
            if (zba) {
                setResult(0);
                zbd(GoogleSignInStatusCodes.SIGN_IN_CURRENTLY_IN_PROGRESS);
                return;
            } else {
                zba = true;
                zbe(action);
                return;
            }
        }
        boolean z4 = bundle.getBoolean(ProtectedSandApp.s("젣"));
        this.zbd = z4;
        if (z4) {
            this.zbe = bundle.getInt(ProtectedSandApp.s("젤"));
            Intent intent2 = (Intent) bundle.getParcelable(ProtectedSandApp.s("젥"));
            if (intent2 == null) {
                setResult(0);
                finish();
            } else {
                this.zbf = intent2;
                zbc();
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        zba = false;
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onSaveInstanceState(@o0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(ProtectedSandApp.s("젣"), this.zbd);
        if (this.zbd) {
            bundle.putInt(ProtectedSandApp.s("젤"), this.zbe);
            bundle.putParcelable(ProtectedSandApp.s("젥"), this.zbf);
        }
    }
}
