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
import android.support.v4.media.d;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@KeepName
/* loaded from: classes5.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    @m1
    protected int zaa = 0;

    @o0
    public static Intent zaa(@o0 Context context, @o0 PendingIntent pendingIntent, int i4, boolean z4) {
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra(ProtectedSandApp.s("즶"), pendingIntent);
        intent.putExtra(ProtectedSandApp.s("즷"), i4);
        intent.putExtra(ProtectedSandApp.s("즸"), z4);
        return intent;
    }

    private final void zab() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get(ProtectedSandApp.s("즶"));
        Integer num = (Integer) extras.get(ProtectedSandApp.s("즹"));
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
            if (extras.getBoolean(ProtectedSandApp.s("즸"), true)) {
                GoogleApiManager.zak(this).zax(new ConnectionResult(22, null), getIntent().getIntExtra(ProtectedSandApp.s("즷"), -1));
            } else {
                String a5 = d.a(ProtectedSandApp.s("즺"), pendingIntent.toString(), ProtectedSandApp.s("즻"));
                if (Build.FINGERPRINT.contains(ProtectedSandApp.s("즼"))) {
                    a5.concat(ProtectedSandApp.s("즽"));
                }
            }
            this.zaa = 1;
            finish();
        } catch (IntentSender.SendIntentException unused2) {
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i4, int i5, @o0 Intent intent) {
        super.onActivityResult(i4, i5, intent);
        if (i4 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra(ProtectedSandApp.s("즸"), true);
            this.zaa = 0;
            setResult(i5, intent);
            if (booleanExtra) {
                GoogleApiManager zak = GoogleApiManager.zak(this);
                if (i5 == -1) {
                    zak.zay();
                } else if (i5 == 0) {
                    zak.zax(new ConnectionResult(13, null), getIntent().getIntExtra(ProtectedSandApp.s("즷"), -1));
                }
            }
        } else if (i4 == 2) {
            this.zaa = 0;
            setResult(i5, intent);
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
            this.zaa = bundle.getInt(ProtectedSandApp.s("즾"));
        }
        if (this.zaa != 1) {
            zab();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(@o0 Bundle bundle) {
        bundle.putInt(ProtectedSandApp.s("즾"), this.zaa);
        super.onSaveInstanceState(bundle);
    }
}
