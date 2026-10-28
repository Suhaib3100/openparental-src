package com.google.android.gms.tasks;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
@KeepForSdk
/* loaded from: classes3.dex */
public class NativeOnCompleteListener implements OnCompleteListener<Object> {
    private final long zza;

    @KeepForSdk
    public NativeOnCompleteListener(long j5) {
        this.zza = j5;
    }

    @KeepForSdk
    public static void createAndAddCallback(@o0 Task<Object> task, long j5) {
        task.addOnCompleteListener(new NativeOnCompleteListener(j5));
    }

    @KeepForSdk
    public native void nativeOnComplete(long j5, @q0 Object obj, boolean z5, boolean z6, @q0 String str);

    @Override // com.google.android.gms.tasks.OnCompleteListener
    @KeepForSdk
    public void onComplete(@o0 Task<Object> task) {
        Object obj;
        String str;
        Exception exception;
        if (task.isSuccessful()) {
            obj = task.getResult();
            str = null;
        } else if (task.isCanceled() || (exception = task.getException()) == null) {
            obj = null;
            str = null;
        } else {
            str = exception.getMessage();
            obj = null;
        }
        nativeOnComplete(this.zza, obj, task.isSuccessful(), task.isCanceled(), str);
    }
}
