package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.n1;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.j0;
import com.google.firebase.messaging.n;
import com.google.firebase.messaging.w0;
import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
public final class FirebaseInstanceIdReceiver extends CloudMessagingReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16673a = ProtectedSandApp.s("⪒");

    private static Intent a(@o0 Context context, @o0 String str, @o0 Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    @n1
    protected int onMessageReceive(@o0 Context context, @o0 CloudMessage cloudMessage) {
        try {
            return ((Integer) Tasks.await(new n(context).k(cloudMessage.getIntent()))).intValue();
        } catch (InterruptedException | ExecutionException unused) {
            return w0.f17634f;
        }
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    @n1
    protected void onNotificationDismissed(@o0 Context context, @o0 Bundle bundle) {
        Intent a6 = a(context, ProtectedSandApp.s("⪑"), bundle);
        if (j0.E(a6)) {
            j0.v(a6);
        }
    }
}
