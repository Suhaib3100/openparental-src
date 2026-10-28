package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.fragment.app.Fragment;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.api.internal.LifecycleFragment;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public abstract class zag implements DialogInterface.OnClickListener {
    public static zag zab(Activity activity, @q0 Intent intent, int i5) {
        return new zad(intent, activity, i5);
    }

    public static zag zac(@o0 Fragment fragment, @q0 Intent intent, int i5) {
        return new zae(intent, fragment, i5);
    }

    public static zag zad(@o0 LifecycleFragment lifecycleFragment, @q0 Intent intent, int i5) {
        return new zaf(intent, lifecycleFragment, 2);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i5) {
        try {
            zaa();
        } catch (ActivityNotFoundException unused) {
            Build.FINGERPRINT.contains(ProtectedSandApp.s("ல"));
        } finally {
            dialogInterface.dismiss();
        }
    }

    protected abstract void zaa();
}
