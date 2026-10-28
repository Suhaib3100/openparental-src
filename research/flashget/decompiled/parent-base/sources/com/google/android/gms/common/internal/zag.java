package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.fragment.app.Fragment;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.api.internal.LifecycleFragment;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes5.dex */
public abstract class zag implements DialogInterface.OnClickListener {
    public static zag zab(Activity activity, @q0 Intent intent, int i4) {
        return new zad(intent, activity, i4);
    }

    public static zag zac(@o0 Fragment fragment, @q0 Intent intent, int i4) {
        return new zae(intent, fragment, i4);
    }

    public static zag zad(@o0 LifecycleFragment lifecycleFragment, @q0 Intent intent, int i4) {
        return new zaf(intent, lifecycleFragment, 2);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        try {
            try {
                zaa();
            } catch (ActivityNotFoundException unused) {
                Build.FINGERPRINT.contains(ProtectedSandApp.s("쬰"));
            }
        } finally {
            dialogInterface.dismiss();
        }
    }

    protected abstract void zaa();
}
