package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.n1;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.w0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes2.dex */
public abstract class CloudMessagingReceiver extends BroadcastReceiver {
    private final ExecutorService zza;

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
    public static final class IntentActionKeys {

        @o0
        public static final String NOTIFICATION_OPEN = ProtectedSandApp.s("ী");

        @o0
        public static final String NOTIFICATION_DISMISS = ProtectedSandApp.s("ু");

        private IntentActionKeys() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
    public static final class IntentKeys {

        @o0
        public static final String WRAPPED_INTENT = ProtectedSandApp.s("ূ");

        @o0
        public static final String PENDING_INTENT = ProtectedSandApp.s("ৃ");

        private IntentKeys() {
        }
    }

    public CloudMessagingReceiver() {
        com.google.android.gms.internal.cloudmessaging.zze.zza();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory(ProtectedSandApp.s("ৄ")));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.zza = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @n1
    private final int zzb(@o0 Context context, @o0 Intent intent) {
        Task<Void> zzc;
        if (intent.getExtras() == null) {
            return w0.f17634f;
        }
        String s5 = ProtectedSandApp.s("\u09c5");
        String stringExtra = intent.getStringExtra(s5);
        if (TextUtils.isEmpty(stringExtra)) {
            zzc = Tasks.forResult(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString(s5, stringExtra);
            zzc = zzs.zzb(context).zzc(2, bundle);
        }
        int onMessageReceive = onMessageReceive(context, new CloudMessage(intent));
        try {
            Tasks.await(zzc, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e6) {
            new StringBuilder(String.valueOf(e6).length() + 20);
        }
        return onMessageReceive;
    }

    @n1
    private final int zzc(@o0 Context context, @o0 Intent intent) {
        String s5 = ProtectedSandApp.s("\u09c6");
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(s5);
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove(s5);
        } else {
            extras = new Bundle();
        }
        if (!ProtectedSandApp.s("ে").equals(intent.getAction())) {
            return w0.f17634f;
        }
        onNotificationDismissed(context, extras);
        return -1;
    }

    @o0
    protected Executor getBroadcastExecutor() {
        return this.zza;
    }

    @n1
    protected abstract int onMessageReceive(@o0 Context context, @o0 CloudMessage cloudMessage);

    @n1
    protected void onNotificationDismissed(@o0 Context context, @o0 Bundle bundle) {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@o0 final Context context, @o0 final Intent intent) {
        if (intent == null) {
            return;
        }
        final boolean isOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        getBroadcastExecutor().execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zze
            @Override // java.lang.Runnable
            public final void run() {
                CloudMessagingReceiver.this.zza(intent, context, isOrderedBroadcast, goAsync);
            }
        });
    }

    public final /* synthetic */ void zza(@o0 Intent intent, @o0 Context context, boolean z5, @o0 BroadcastReceiver.PendingResult pendingResult) {
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra(ProtectedSandApp.s("ৈ"));
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            int zzc = intent2 != null ? zzc(context, intent2) : zzb(context, intent);
            if (z5) {
                pendingResult.setResultCode(zzc);
            }
        } finally {
            pendingResult.finish();
        }
    }
}
