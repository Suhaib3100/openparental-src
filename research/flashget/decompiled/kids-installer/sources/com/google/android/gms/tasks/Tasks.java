package com.google.android.gms.tasks;

import android.os.Looper;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* loaded from: classes2.dex */
public final class Tasks {
    private Tasks() {
    }

    public static <TResult> TResult await(@o0 Task<TResult> task) throws ExecutionException, InterruptedException {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotNull(task, ProtectedSandApp.s("ᇬ"));
        if (task.isComplete()) {
            return (TResult) zza(task);
        }
        zzad zzadVar = new zzad(null);
        zzb(task, zzadVar);
        zzadVar.zza();
        return (TResult) zza(task);
    }

    @o0
    @Deprecated
    public static <TResult> Task<TResult> call(@o0 Callable<TResult> callable) {
        return call(TaskExecutors.MAIN_THREAD, callable);
    }

    @o0
    public static <TResult> Task<TResult> forCanceled() {
        zzw zzwVar = new zzw();
        zzwVar.zzc();
        return zzwVar;
    }

    @o0
    public static <TResult> Task<TResult> forException(@o0 Exception exc) {
        zzw zzwVar = new zzw();
        zzwVar.zza(exc);
        return zzwVar;
    }

    @o0
    public static <TResult> Task<TResult> forResult(TResult tresult) {
        zzw zzwVar = new zzw();
        zzwVar.zzb(tresult);
        return zzwVar;
    }

    @o0
    public static Task<Void> whenAll(@q0 Collection<? extends Task<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return forResult(null);
        }
        Iterator<? extends Task<?>> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException(ProtectedSandApp.s("ᇲ"));
            }
        }
        zzw zzwVar = new zzw();
        zzaf zzafVar = new zzaf(collection.size(), zzwVar);
        Iterator<? extends Task<?>> it2 = collection.iterator();
        while (it2.hasNext()) {
            zzb(it2.next(), zzafVar);
        }
        return zzwVar;
    }

    @o0
    public static Task<List<Task<?>>> whenAllComplete(@q0 Collection<? extends Task<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return forResult(Collections.emptyList());
        }
        return whenAll(collection).continueWithTask(TaskExecutors.MAIN_THREAD, new zzab(collection));
    }

    @o0
    public static <TResult> Task<List<TResult>> whenAllSuccess(@q0 Collection<? extends Task> collection) {
        if (collection == null || collection.isEmpty()) {
            return forResult(Collections.emptyList());
        }
        return (Task<List<TResult>>) whenAll((Collection<? extends Task<?>>) collection).continueWith(TaskExecutors.MAIN_THREAD, new zzaa(collection));
    }

    @o0
    public static <T> Task<T> withTimeout(@o0 Task<T> task, long j5, @o0 TimeUnit timeUnit) {
        Preconditions.checkNotNull(task, ProtectedSandApp.s("ᇳ"));
        Preconditions.checkArgument(j5 > 0, ProtectedSandApp.s("ᇴ"));
        Preconditions.checkNotNull(timeUnit, ProtectedSandApp.s("ᇵ"));
        final zzb zzbVar = new zzb();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(zzbVar);
        final com.google.android.gms.internal.tasks.zza zzaVar = new com.google.android.gms.internal.tasks.zza(Looper.getMainLooper());
        zzaVar.postDelayed(new Runnable() { // from class: com.google.android.gms.tasks.zzx
            @Override // java.lang.Runnable
            public final void run() {
                TaskCompletionSource.this.trySetException(new TimeoutException());
            }
        }, timeUnit.toMillis(j5));
        task.addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.tasks.zzy
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                com.google.android.gms.internal.tasks.zza zzaVar2 = com.google.android.gms.internal.tasks.zza.this;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                zzb zzbVar2 = zzbVar;
                zzaVar2.removeCallbacksAndMessages(null);
                if (task2.isSuccessful()) {
                    taskCompletionSource2.trySetResult(task2.getResult());
                } else {
                    if (task2.isCanceled()) {
                        zzbVar2.zza();
                        return;
                    }
                    Exception exception = task2.getException();
                    exception.getClass();
                    taskCompletionSource2.trySetException(exception);
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    private static Object zza(@o0 Task task) throws ExecutionException {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException(ProtectedSandApp.s("ᇶ"));
        }
        throw new ExecutionException(task.getException());
    }

    private static void zzb(Task task, zzae zzaeVar) {
        Executor executor = TaskExecutors.zza;
        task.addOnSuccessListener(executor, zzaeVar);
        task.addOnFailureListener(executor, zzaeVar);
        task.addOnCanceledListener(executor, zzaeVar);
    }

    @o0
    @Deprecated
    public static <TResult> Task<TResult> call(@o0 Executor executor, @o0 Callable<TResult> callable) {
        Preconditions.checkNotNull(executor, ProtectedSandApp.s("ᇰ"));
        Preconditions.checkNotNull(callable, ProtectedSandApp.s("ᇱ"));
        zzw zzwVar = new zzw();
        executor.execute(new zzz(zzwVar, callable));
        return zzwVar;
    }

    @o0
    public static Task<List<Task<?>>> whenAllComplete(@q0 Task<?>... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return whenAllComplete(Arrays.asList(taskArr));
        }
        return forResult(Collections.emptyList());
    }

    @o0
    public static <TResult> Task<List<TResult>> whenAllSuccess(@q0 Task... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return whenAllSuccess(Arrays.asList(taskArr));
        }
        return forResult(Collections.emptyList());
    }

    public static <TResult> TResult await(@o0 Task<TResult> task, long j5, @o0 TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotNull(task, ProtectedSandApp.s("ᇭ"));
        Preconditions.checkNotNull(timeUnit, ProtectedSandApp.s("ᇮ"));
        if (task.isComplete()) {
            return (TResult) zza(task);
        }
        zzad zzadVar = new zzad(null);
        zzb(task, zzadVar);
        if (zzadVar.zzb(j5, timeUnit)) {
            return (TResult) zza(task);
        }
        throw new TimeoutException(ProtectedSandApp.s("ᇯ"));
    }

    @o0
    public static Task<Void> whenAll(@q0 Task<?>... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return whenAll(Arrays.asList(taskArr));
        }
        return forResult(null);
    }
}
