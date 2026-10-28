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
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* loaded from: classes5.dex */
public abstract class CloudMessagingReceiver extends BroadcastReceiver {

    @q0
    private static SoftReference zza;

    @q0
    private static SoftReference zzb;

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
    public static final class IntentActionKeys {

        @o0
        public static final String NOTIFICATION_OPEN = ProtectedSandApp.s("좸");

        @o0
        public static final String NOTIFICATION_DISMISS = ProtectedSandApp.s("좹");

        private IntentActionKeys() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
    public static final class IntentKeys {

        @o0
        public static final String WRAPPED_INTENT = ProtectedSandApp.s("좺");

        @o0
        public static final String PENDING_INTENT = ProtectedSandApp.s("좻");

        private IntentKeys() {
        }
    }

    @n1
    private final int zzb(@o0 Context context, @o0 Intent intent) {
        String s4 = ProtectedSandApp.s("좼");
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(s4);
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove(s4);
        } else {
            extras = new Bundle();
        }
        if (!Objects.equals(intent.getAction(), ProtectedSandApp.s("좽"))) {
            return 500;
        }
        onNotificationDismissed(context, extras);
        return -1;
    }

    @o0
    protected Executor getBroadcastExecutor() {
        ExecutorService executorService;
        synchronized (CloudMessagingReceiver.class) {
            try {
                SoftReference softReference = zza;
                executorService = softReference != null ? (ExecutorService) softReference.get() : null;
                if (executorService == null) {
                    com.google.android.gms.internal.cloudmessaging.zze.zza();
                    executorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new NamedThreadFactory(ProtectedSandApp.s("좾"))));
                    zza = new SoftReference(executorService);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
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
        getBroadcastExecutor().execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzh
            @Override // java.lang.Runnable
            public final void run() {
                CloudMessagingReceiver.this.zza(intent, context, isOrderedBroadcast, goAsync);
            }
        });
    }

    final /* synthetic */ void zza(Intent intent, final Context context, boolean z4, BroadcastReceiver.PendingResult pendingResult) {
        Executor executor;
        int i4;
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra(ProtectedSandApp.s("좿"));
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                i4 = zzb(context, intent2);
            } else if (intent.getExtras() == null) {
                i4 = 500;
            } else {
                final CloudMessage cloudMessage = new CloudMessage(intent);
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                synchronized (CloudMessagingReceiver.class) {
                    try {
                        SoftReference softReference = zzb;
                        executor = softReference != null ? (Executor) softReference.get() : null;
                        if (executor == null) {
                            com.google.android.gms.internal.cloudmessaging.zze.zza();
                            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory(ProtectedSandApp.s("죀")));
                            threadPoolExecutor.allowCoreThreadTimeOut(true);
                            executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
                            zzb = new SoftReference(executor);
                        }
                    } finally {
                    }
                }
                executor.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzg
                    @Override // java.lang.Runnable
                    public final void run() {
                        Task zzc;
                        CloudMessage cloudMessage2 = cloudMessage;
                        if (TextUtils.isEmpty(cloudMessage2.getMessageId())) {
                            zzc = Tasks.forResult(null);
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putString(ProtectedSandApp.s("죨"), cloudMessage2.getMessageId());
                            Integer zza2 = cloudMessage2.zza();
                            if (zza2 != null) {
                                bundle.putInt(ProtectedSandApp.s("죩"), zza2.intValue());
                            }
                            Context context2 = context;
                            bundle.putBoolean(ProtectedSandApp.s("죪"), true);
                            zzc = zzv.zzb(context2).zzc(2, bundle);
                        }
                        final CountDownLatch countDownLatch2 = countDownLatch;
                        zzc.addOnCompleteListener(new Executor() { // from class: com.google.android.gms.cloudmessaging.zze
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                runnable.run();
                            }
                        }, new OnCompleteListener() { // from class: com.google.android.gms.cloudmessaging.zzf
                            @Override // com.google.android.gms.tasks.OnCompleteListener
                            public final void onComplete(Task task) {
                                countDownLatch2.countDown();
                            }
                        });
                    }
                });
                int onMessageReceive = onMessageReceive(context, cloudMessage);
                try {
                    countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
                } catch (InterruptedException e4) {
                    ProtectedSandApp.s("죁").concat(e4.toString());
                }
                i4 = onMessageReceive;
            }
            if (z4 && pendingResult != null) {
                pendingResult.setResultCode(i4);
            }
            if (pendingResult != null) {
                pendingResult.finish();
            }
        } catch (Throwable th) {
            if (pendingResult != null) {
                pendingResult.finish();
            }
            throw th;
        }
    }
}
