package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.fragment.app.e0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepName
/* loaded from: classes2.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    @VisibleForTesting
    protected int zaa = 0;

    @o0
    public static Intent zaa(@o0 Context context, @o0 PendingIntent pendingIntent, int i5, boolean z5) {
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra(ProtectedSandApp.s("ઠ"), pendingIntent);
        intent.putExtra(ProtectedSandApp.s("ડ"), i5);
        intent.putExtra(ProtectedSandApp.s("ઢ"), z5);
        return intent;
    }

    private final void zab() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get(ProtectedSandApp.s("ણ"));
        Integer num = (Integer) extras.get(ProtectedSandApp.s("ત"));
        if (pendingIntent == null && num == null) {
            finish();
            return;
        }
        if (pendingIntent == null) {
            GoogleApiAvailability.getInstance().showErrorDialogFragment(this, ((Integer) Preconditions.checkNotNull(num)).intValue(), 2, this);
            this.zaa = 1;
            return;
        }
        try {
            startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
            this.zaa = 1;
        } catch (ActivityNotFoundException unused) {
            if (extras.getBoolean(ProtectedSandApp.s("થ"), true)) {
                GoogleApiManager.zam(this).zaz(new ConnectionResult(22, null), getIntent().getIntExtra(ProtectedSandApp.s("દ"), -1));
            } else {
                String obj = pendingIntent.toString();
                String a6 = e0.a(new StringBuilder(obj.length() + 36), ProtectedSandApp.s("ધ"), obj, ProtectedSandApp.s("ન"));
                if (Build.FINGERPRINT.contains(ProtectedSandApp.s("\u0aa9"))) {
                    a6.concat(ProtectedSandApp.s("પ"));
                }
            }
            this.zaa = 1;
            finish();
        } catch (IntentSender.SendIntentException unused2) {
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i5, int i6, @o0 Intent intent) {
        super.onActivityResult(i5, i6, intent);
        if (i5 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra(ProtectedSandApp.s("ફ"), true);
            this.zaa = 0;
            setResult(i6, intent);
            if (booleanExtra) {
                GoogleApiManager zam = GoogleApiManager.zam(this);
                if (i6 == -1) {
                    zam.zaA();
                } else if (i6 == 0) {
                    zam.zaz(new ConnectionResult(13, null), getIntent().getIntExtra(ProtectedSandApp.s("બ"), -1));
                }
            }
        } else if (i5 == 2) {
            this.zaa = 0;
            setResult(i6, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(@o0 DialogInterface dialogInterface) {
        this.zaa = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(@q0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.zaa = bundle.getInt(ProtectedSandApp.s("ભ"));
        }
        if (this.zaa != 1) {
            zab();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(@o0 Bundle bundle) {
        bundle.putInt(ProtectedSandApp.s("મ"), this.zaa);
        super.onSaveInstanceState(bundle);
    }
}
