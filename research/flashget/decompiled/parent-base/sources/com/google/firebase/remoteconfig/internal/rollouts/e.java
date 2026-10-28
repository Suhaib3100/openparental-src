package com.google.firebase.remoteconfig.internal.rollouts;

import androidx.annotation.o0;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.internal.g;
import com.google.firebase.remoteconfig.internal.h;
import com.google.firebase.remoteconfig.interop.rollouts.f;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: RolloutsStateSubscriptionsHandler.java */
/* loaded from: classes6.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private g f60566a;

    /* renamed from: b, reason: collision with root package name */
    private a f60567b;

    /* renamed from: c, reason: collision with root package name */
    private Executor f60568c;

    /* renamed from: d, reason: collision with root package name */
    private Set<f> f60569d = Collections.newSetFromMap(new ConcurrentHashMap());

    public e(@o0 g gVar, @o0 a aVar, @o0 Executor executor) {
        this.f60566a = gVar;
        this.f60567b = aVar;
        this.f60568c = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(Task task, final f fVar, h hVar) {
        try {
            h hVar2 = (h) task.getResult();
            if (hVar2 != null) {
                final com.google.firebase.remoteconfig.interop.rollouts.e b5 = this.f60567b.b(hVar2);
                this.f60568c.execute(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.rollouts.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        f.this.a(b5);
                    }
                });
            }
        } catch (FirebaseRemoteConfigException unused) {
        }
    }

    public void g(@o0 h hVar) {
        try {
            final com.google.firebase.remoteconfig.interop.rollouts.e b5 = this.f60567b.b(hVar);
            for (final f fVar : this.f60569d) {
                this.f60568c.execute(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.rollouts.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        f.this.a(b5);
                    }
                });
            }
        } catch (FirebaseRemoteConfigException unused) {
        }
    }

    public void h(@o0 final f fVar) {
        this.f60569d.add(fVar);
        final Task<h> f4 = this.f60566a.f();
        f4.addOnSuccessListener(this.f60568c, new OnSuccessListener() { // from class: com.google.firebase.remoteconfig.internal.rollouts.b
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                e.this.f(f4, fVar, (h) obj);
            }
        });
    }
}
