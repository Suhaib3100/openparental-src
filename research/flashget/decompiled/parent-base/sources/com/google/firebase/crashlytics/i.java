package com.google.firebase.crashlytics;

import com.google.android.gms.tasks.OnFailureListener;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class i implements OnFailureListener {
    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        FirebaseCrashlytics.c(exc);
    }
}
