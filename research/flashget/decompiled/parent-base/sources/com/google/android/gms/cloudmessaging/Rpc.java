package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.d;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.collection.a3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* loaded from: classes5.dex */
public class Rpc {
    private static int zza;
    private static PendingIntent zzb;
    private static final Executor zzc = new Executor() { // from class: com.google.android.gms.cloudmessaging.zzy
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };
    private static final Pattern zzd = Pattern.compile(ProtectedSandApp.s("죄"));
    private final Context zzf;
    private final zzw zzg;
    private final ScheduledExecutorService zzh;
    private Messenger zzj;
    private zzd zzk;
    private final a3 zze = new a3();
    private final Messenger zzi = new Messenger(new zzae(this, Looper.getMainLooper()));

    public Rpc(@o0 Context context) {
        this.zzf = context;
        this.zzg = new zzw(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.zzh = scheduledThreadPoolExecutor;
    }

    static /* synthetic */ Task zza(Bundle bundle) throws Exception {
        return zzi(bundle) ? Tasks.forResult(null) : Tasks.forResult(bundle);
    }

    static /* bridge */ /* synthetic */ void zzc(Rpc rpc, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new zzc());
                if (intent.hasExtra(ProtectedSandApp.s("죅"))) {
                    Parcelable parcelableExtra = intent.getParcelableExtra(ProtectedSandApp.s("죅"));
                    if (parcelableExtra instanceof zzd) {
                        rpc.zzk = (zzd) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        rpc.zzj = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!Objects.equals(action, ProtectedSandApp.s("죆"))) {
                    if (Log.isLoggable(ProtectedSandApp.s("죇"), 3)) {
                        ProtectedSandApp.s("죈").concat(String.valueOf(action));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra(ProtectedSandApp.s("죉"));
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra(ProtectedSandApp.s("죊"));
                }
                if (stringExtra != null) {
                    Matcher matcher = zzd.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable(ProtectedSandApp.s("죇"), 3)) {
                            ProtectedSandApp.s("죓").concat(stringExtra);
                            return;
                        }
                        return;
                    }
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    if (group != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString(ProtectedSandApp.s("죉"), group2);
                        rpc.zzh(group, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra(ProtectedSandApp.s("죋"));
                if (stringExtra2 == null) {
                    ProtectedSandApp.s("죌").concat(String.valueOf(intent2.getExtras()));
                    return;
                }
                if (Log.isLoggable(ProtectedSandApp.s("죇"), 3)) {
                    ProtectedSandApp.s("죍").concat(stringExtra2);
                }
                if (!stringExtra2.startsWith(ProtectedSandApp.s("죎"))) {
                    synchronized (rpc.zze) {
                        for (int i4 = 0; i4 < rpc.zze.getSize(); i4++) {
                            try {
                                rpc.zzh((String) rpc.zze.keyAt(i4), intent2.getExtras());
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return;
                }
                String[] split = stringExtra2.split(ProtectedSandApp.s("죏"));
                if (split.length <= 2 || !Objects.equals(split[1], ProtectedSandApp.s("죐"))) {
                    ProtectedSandApp.s("죒").concat(stringExtra2);
                    return;
                }
                String str = split[2];
                String str2 = split[3];
                if (str2.startsWith(ProtectedSandApp.s("죑"))) {
                    str2 = str2.substring(1);
                }
                rpc.zzh(str, intent2.putExtra(ProtectedSandApp.s("죋"), str2).getExtras());
            }
        }
    }

    @d
    private final Task zze(Bundle bundle) {
        final String zzf = zzf();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.zze) {
            this.zze.put(zzf, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage(ProtectedSandApp.s("죔"));
        if (this.zzg.zzb() == 2) {
            intent.setAction(ProtectedSandApp.s("죕"));
        } else {
            intent.setAction(ProtectedSandApp.s("죖"));
        }
        intent.putExtras(bundle);
        zzg(this.zzf, intent);
        intent.putExtra(ProtectedSandApp.s("죘"), ProtectedSandApp.s("죗") + zzf + ProtectedSandApp.s("죎"));
        if (Log.isLoggable(ProtectedSandApp.s("죇"), 3)) {
            ProtectedSandApp.s("죙").concat(String.valueOf(intent.getExtras()));
        }
        intent.putExtra(ProtectedSandApp.s("죅"), this.zzi);
        if (this.zzj != null || this.zzk != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.zzj;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.zzk.zzb(obtain);
                }
            } catch (RemoteException unused) {
                Log.isLoggable(ProtectedSandApp.s("죇"), 3);
            }
            final ScheduledFuture<?> schedule = this.zzh.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzac
                @Override // java.lang.Runnable
                public final void run() {
                    TaskCompletionSource.this.trySetException(new IOException(ProtectedSandApp.s("죥")));
                }
            }, 30L, TimeUnit.SECONDS);
            taskCompletionSource.getTask().addOnCompleteListener(zzc, new OnCompleteListener() { // from class: com.google.android.gms.cloudmessaging.zzad
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    Rpc.this.zzd(zzf, schedule, task);
                }
            });
            return taskCompletionSource.getTask();
        }
        if (this.zzg.zzb() == 2) {
            this.zzf.sendBroadcast(intent);
        } else {
            this.zzf.startService(intent);
        }
        final ScheduledFuture schedule2 = this.zzh.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzac
            @Override // java.lang.Runnable
            public final void run() {
                TaskCompletionSource.this.trySetException(new IOException(ProtectedSandApp.s("죥")));
            }
        }, 30L, TimeUnit.SECONDS);
        taskCompletionSource.getTask().addOnCompleteListener(zzc, new OnCompleteListener() { // from class: com.google.android.gms.cloudmessaging.zzad
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                Rpc.this.zzd(zzf, schedule2, task);
            }
        });
        return taskCompletionSource.getTask();
    }

    private static synchronized String zzf() {
        String num;
        synchronized (Rpc.class) {
            int i4 = zza;
            zza = i4 + 1;
            num = Integer.toString(i4);
        }
        return num;
    }

    private static synchronized void zzg(Context context, Intent intent) {
        synchronized (Rpc.class) {
            try {
                if (zzb == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage(ProtectedSandApp.s("죚"));
                    zzb = PendingIntent.getBroadcast(context, 0, intent2, com.google.android.gms.internal.cloudmessaging.zza.zza);
                }
                intent.putExtra(ProtectedSandApp.s("죛"), zzb);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void zzh(String str, @q0 Bundle bundle) {
        synchronized (this.zze) {
            try {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.zze.remove(str);
                if (taskCompletionSource == null) {
                    return;
                }
                taskCompletionSource.setResult(bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean zzi(Bundle bundle) {
        return bundle != null && bundle.containsKey(ProtectedSandApp.s("죅"));
    }

    @o0
    public Task<CloudMessage> getProxiedNotificationData() {
        return this.zzg.zza() >= 241100000 ? zzv.zzb(this.zzf).zzd(5, Bundle.EMPTY).continueWith(zzc, new Continuation() { // from class: com.google.android.gms.cloudmessaging.zzab
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable(ProtectedSandApp.s("죤"));
                if (intent != null) {
                    return new CloudMessage(intent);
                }
                return null;
            }
        }) : Tasks.forException(new IOException(ProtectedSandApp.s("죜")));
    }

    @o0
    public Task<Void> messageHandled(@o0 CloudMessage cloudMessage) {
        if (this.zzg.zza() < 233700000) {
            return Tasks.forException(new IOException(ProtectedSandApp.s("죜")));
        }
        Bundle bundle = new Bundle();
        bundle.putString(ProtectedSandApp.s("죝"), cloudMessage.getMessageId());
        Integer zza2 = cloudMessage.zza();
        if (zza2 != null) {
            bundle.putInt(ProtectedSandApp.s("죞"), zza2.intValue());
        }
        return zzv.zzb(this.zzf).zzc(3, bundle);
    }

    @o0
    public Task<Bundle> send(@o0 final Bundle bundle) {
        return this.zzg.zza() < 12000000 ? this.zzg.zzb() != 0 ? zze(bundle).continueWithTask(zzc, new Continuation() { // from class: com.google.android.gms.cloudmessaging.zzz
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return Rpc.this.zzb(bundle, task);
            }
        }) : Tasks.forException(new IOException(ProtectedSandApp.s("죟"))) : zzv.zzb(this.zzf).zzd(1, bundle).continueWith(zzc, new Continuation() { // from class: com.google.android.gms.cloudmessaging.zzaa
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                if (task.isSuccessful()) {
                    return (Bundle) task.getResult();
                }
                if (Log.isLoggable(ProtectedSandApp.s("죡"), 3)) {
                    ProtectedSandApp.s("죢").concat(String.valueOf(task.getException()));
                }
                throw new IOException(ProtectedSandApp.s("죣"), task.getException());
            }
        });
    }

    @o0
    public Task<Void> setRetainProxiedNotifications(boolean z4) {
        if (this.zzg.zza() < 241100000) {
            return Tasks.forException(new IOException(ProtectedSandApp.s("죜")));
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean(ProtectedSandApp.s("죠"), z4);
        return zzv.zzb(this.zzf).zzc(4, bundle);
    }

    final /* synthetic */ Task zzb(Bundle bundle, Task task) throws Exception {
        return (task.isSuccessful() && zzi((Bundle) task.getResult())) ? zze(bundle).onSuccessTask(zzc, new SuccessContinuation() { // from class: com.google.android.gms.cloudmessaging.zzx
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return Rpc.zza((Bundle) obj);
            }
        }) : task;
    }

    final /* synthetic */ void zzd(String str, ScheduledFuture scheduledFuture, Task task) {
        synchronized (this.zze) {
            this.zze.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
