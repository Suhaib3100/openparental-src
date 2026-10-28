package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.n1;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.n;
import com.google.firebase.messaging.n0;
import java.util.concurrent.ExecutionException;

/* loaded from: classes6.dex */
public final class FirebaseInstanceIdReceiver extends CloudMessagingReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static final String f59694a = ProtectedSandApp.s("\u0088\u0001");

    private static Intent a(@o0 Context context, @o0 String str, @o0 Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    @n1
    protected int onMessageReceive(@o0 Context context, @o0 CloudMessage cloudMessage) {
        try {
            return ((Integer) Tasks.await(new n(context).k(cloudMessage.getIntent()))).intValue();
        } catch (InterruptedException | ExecutionException unused) {
            return 500;
        }
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    @n1
    protected void onNotificationDismissed(@o0 Context context, @o0 Bundle bundle) {
        Intent a5 = a(context, ProtectedSandApp.s("\u0087\u0001"), bundle);
        if (n0.E(a5)) {
            n0.v(a5);
        }
    }
}
