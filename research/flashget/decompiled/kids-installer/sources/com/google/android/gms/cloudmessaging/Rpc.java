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
import androidx.collection.i;
import androidx.fragment.app.e0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes2.dex */
public class Rpc {
    private static int zza;
    private static PendingIntent zzb;
    private static final Executor zzc = new Executor() { // from class: com.google.android.gms.cloudmessaging.zzz
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };
    private static final Pattern zzd = Pattern.compile(ProtectedSandApp.s("\u09ca"));
    private final Context zzf;
    private final zzt zzg;
    private final ScheduledExecutorService zzh;
    private Messenger zzj;
    private zzd zzk;

    @GuardedBy("responseCallbacks")
    private final i<String, TaskCompletionSource<Bundle>> zze = new i<>();
    private Messenger zzi = new Messenger(new zzaa(this, Looper.getMainLooper()));

    public Rpc(@o0 Context context) {
        this.zzf = context;
        this.zzg = new zzt(context);
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
                if (intent.hasExtra(ProtectedSandApp.s("ো"))) {
                    Parcelable parcelableExtra = intent.getParcelableExtra(ProtectedSandApp.s("ৌ"));
                    if (parcelableExtra instanceof zzd) {
                        rpc.zzk = (zzd) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        rpc.zzj = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!ProtectedSandApp.s("্").equals(action)) {
                    if (Log.isLoggable(ProtectedSandApp.s("ৎ"), 3)) {
                        String valueOf = String.valueOf(action);
                        String s5 = ProtectedSandApp.s("\u09cf");
                        if (valueOf.length() != 0) {
                            s5.concat(valueOf);
                            return;
                        }
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra(ProtectedSandApp.s("\u09d0"));
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra(ProtectedSandApp.s("\u09d1"));
                }
                if (stringExtra != null) {
                    Matcher matcher = zzd.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable(ProtectedSandApp.s("\u09db"), 3)) {
                            String s6 = ProtectedSandApp.s("ড়");
                            if (stringExtra.length() != 0) {
                                s6.concat(stringExtra);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    if (group != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString(ProtectedSandApp.s("ঢ়"), group2);
                        rpc.zzh(group, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra(ProtectedSandApp.s("\u09d2"));
                if (stringExtra2 == null) {
                    new StringBuilder(String.valueOf(intent2.getExtras()).length() + 49);
                    return;
                }
                if (Log.isLoggable(ProtectedSandApp.s("\u09d3"), 3)) {
                    String s7 = ProtectedSandApp.s("\u09d4");
                    if (stringExtra2.length() != 0) {
                        s7.concat(stringExtra2);
                    }
                }
                if (!stringExtra2.startsWith(ProtectedSandApp.s("\u09d5"))) {
                    synchronized (rpc.zze) {
                        for (int i5 = 0; i5 < rpc.zze.size(); i5++) {
                            rpc.zzh(rpc.zze.l(i5), intent2.getExtras());
                        }
                    }
                    return;
                }
                String[] split = stringExtra2.split(ProtectedSandApp.s("\u09d6"));
                if (split.length <= 2 || !ProtectedSandApp.s("ৗ").equals(split[1])) {
                    String s8 = ProtectedSandApp.s("\u09da");
                    if (stringExtra2.length() != 0) {
                        s8.concat(stringExtra2);
                        return;
                    }
                    return;
                }
                String str = split[2];
                String str2 = split[3];
                if (str2.startsWith(ProtectedSandApp.s("\u09d8"))) {
                    str2 = str2.substring(1);
                }
                rpc.zzh(str, intent2.putExtra(ProtectedSandApp.s("\u09d9"), str2).getExtras());
            }
        }
    }

    @d
    private final Task<Bundle> zze(Bundle bundle) {
        final String zzf = zzf();
        final TaskCompletionSource<Bundle> taskCompletionSource = new TaskCompletionSource<>();
        synchronized (this.zze) {
            this.zze.put(zzf, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage(ProtectedSandApp.s("\u09de"));
        if (this.zzg.zzb() == 2) {
            intent.setAction(ProtectedSandApp.s("য়"));
        } else {
            intent.setAction(ProtectedSandApp.s("ৠ"));
        }
        intent.putExtras(bundle);
        zzg(this.zzf, intent);
        intent.putExtra(ProtectedSandApp.s("ৣ"), e0.a(new StringBuilder(String.valueOf(zzf).length() + 5), ProtectedSandApp.s("ৡ"), zzf, ProtectedSandApp.s("ৢ")));
        if (Log.isLoggable(ProtectedSandApp.s("\u09e4"), 3)) {
            new StringBuilder(String.valueOf(intent.getExtras()).length() + 8);
        }
        intent.putExtra(ProtectedSandApp.s("\u09e5"), this.zzi);
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
                Log.isLoggable(ProtectedSandApp.s("০"), 3);
            }
            final ScheduledFuture<?> schedule = this.zzh.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzy
                @Override // java.lang.Runnable
                public final void run() {
                    TaskCompletionSource.this.trySetException(new IOException(ProtectedSandApp.s("ਗ")));
                }
            }, 30L, TimeUnit.SECONDS);
            taskCompletionSource.getTask().addOnCompleteListener(zzc, new OnCompleteListener() { // from class: com.google.android.gms.cloudmessaging.zzw
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
        final ScheduledFuture schedule2 = this.zzh.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzy
            @Override // java.lang.Runnable
            public final void run() {
                TaskCompletionSource.this.trySetException(new IOException(ProtectedSandApp.s("ਗ")));
            }
        }, 30L, TimeUnit.SECONDS);
        taskCompletionSource.getTask().addOnCompleteListener(zzc, new OnCompleteListener() { // from class: com.google.android.gms.cloudmessaging.zzw
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
            int i5 = zza;
            zza = i5 + 1;
            num = Integer.toString(i5);
        }
        return num;
    }

    private static synchronized void zzg(Context context, Intent intent) {
        synchronized (Rpc.class) {
            if (zzb == null) {
                Intent intent2 = new Intent();
                intent2.setPackage(ProtectedSandApp.s("১"));
                zzb = com.google.android.gms.internal.cloudmessaging.zza.zza(context, 0, intent2, com.google.android.gms.internal.cloudmessaging.zza.zza);
            }
            intent.putExtra(ProtectedSandApp.s("২"), zzb);
        }
    }

    private final void zzh(String str, @q0 Bundle bundle) {
        synchronized (this.zze) {
            TaskCompletionSource<Bundle> remove = this.zze.remove(str);
            if (remove != null) {
                remove.setResult(bundle);
                return;
            }
            String s5 = ProtectedSandApp.s("৩");
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                s5.concat(valueOf);
            }
        }
    }

    private static boolean zzi(Bundle bundle) {
        return bundle != null && bundle.containsKey(ProtectedSandApp.s("৪"));
    }

    @o0
    public Task<Bundle> send(@o0 final Bundle bundle) {
        return this.zzg.zza() < 12000000 ? this.zzg.zzb() != 0 ? zze(bundle).continueWithTask(zzc, new Continuation() { // from class: com.google.android.gms.cloudmessaging.zzu
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return Rpc.this.zzb(bundle, task);
            }
        }) : Tasks.forException(new IOException(ProtectedSandApp.s("৫"))) : zzs.zzb(this.zzf).zzd(1, bundle).continueWith(zzc, new Continuation() { // from class: com.google.android.gms.cloudmessaging.zzv
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                if (task.isSuccessful()) {
                    return (Bundle) task.getResult();
                }
                if (Log.isLoggable(ProtectedSandApp.s("Ⅎ"), 3)) {
                    new StringBuilder(String.valueOf(task.getException()).length() + 22);
                }
                throw new IOException(ProtectedSandApp.s("ℳ"), task.getException());
            }
        });
    }

    @o0
    public final /* synthetic */ Task zzb(@o0 Bundle bundle, @o0 Task task) throws Exception {
        return !task.isSuccessful() ? task : !zzi((Bundle) task.getResult()) ? task : zze(bundle).onSuccessTask(zzc, new SuccessContinuation() { // from class: com.google.android.gms.cloudmessaging.zzx
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return Rpc.zza((Bundle) obj);
            }
        });
    }

    public final /* synthetic */ void zzd(@o0 String str, @o0 ScheduledFuture scheduledFuture, @o0 Task task) {
        synchronized (this.zze) {
            this.zze.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
