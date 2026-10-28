package com.google.firebase.crashlytics.internal.settings;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.constraintlayout.motion.widget.r;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.common.a0;
import com.google.firebase.crashlytics.internal.common.d0;
import com.google.firebase.crashlytics.internal.common.w0;
import com.google.firebase.crashlytics.internal.common.y;
import com.google.firebase.crashlytics.internal.common.z;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SettingsController.java */
/* loaded from: classes3.dex */
public class f implements j {

    /* renamed from: j, reason: collision with root package name */
    private static final String f16381j = ProtectedSandApp.s("⩟");

    /* renamed from: k, reason: collision with root package name */
    private static final String f16382k = ProtectedSandApp.s("⩠");

    /* renamed from: a, reason: collision with root package name */
    private final Context f16383a;

    /* renamed from: b, reason: collision with root package name */
    private final k f16384b;

    /* renamed from: c, reason: collision with root package name */
    private final h f16385c;

    /* renamed from: d, reason: collision with root package name */
    private final y f16386d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.settings.a f16387e;

    /* renamed from: f, reason: collision with root package name */
    private final l f16388f;

    /* renamed from: g, reason: collision with root package name */
    private final z f16389g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicReference<d> f16390h;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicReference<TaskCompletionSource<d>> f16391i;

    /* compiled from: SettingsController.java */
    class a implements SuccessContinuation<Void, Void> {
        a() {
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        @o0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task<Void> then(@q0 Void r5) throws Exception {
            JSONObject a6 = f.this.f16388f.a(f.this.f16384b, true);
            if (a6 != null) {
                d b6 = f.this.f16385c.b(a6);
                f.this.f16387e.c(b6.f16370c, a6);
                f.this.q(a6, ProtectedSandApp.s("⩕"));
                f fVar = f.this;
                fVar.r(fVar.f16384b.f16423f);
                f.this.f16390h.set(b6);
                ((TaskCompletionSource) f.this.f16391i.get()).trySetResult(b6);
            }
            return Tasks.forResult(null);
        }
    }

    f(Context context, k kVar, y yVar, h hVar, com.google.firebase.crashlytics.internal.settings.a aVar, l lVar, z zVar) {
        AtomicReference<d> atomicReference = new AtomicReference<>();
        this.f16390h = atomicReference;
        this.f16391i = new AtomicReference<>(new TaskCompletionSource());
        this.f16383a = context;
        this.f16384b = kVar;
        this.f16386d = yVar;
        this.f16385c = hVar;
        this.f16387e = aVar;
        this.f16388f = lVar;
        this.f16389g = zVar;
        atomicReference.set(b.b(yVar));
    }

    public static f l(Context context, String str, d0 d0Var, d2.b bVar, String str2, String str3, com.google.firebase.crashlytics.internal.persistence.f fVar, z zVar) {
        String g5 = d0Var.g();
        w0 w0Var = new w0();
        return new f(context, new k(str, d0Var.h(), d0Var.i(), d0Var.j(), d0Var, com.google.firebase.crashlytics.internal.common.i.h(com.google.firebase.crashlytics.internal.common.i.n(context), str, str3, str2), str3, str2, a0.determineFrom(g5).getId()), w0Var, new h(w0Var), new com.google.firebase.crashlytics.internal.settings.a(fVar), new c(String.format(Locale.US, ProtectedSandApp.s("⩖"), str), bVar), zVar);
    }

    private d m(e eVar) {
        d dVar = null;
        try {
            if (!e.SKIP_CACHE_LOOKUP.equals(eVar)) {
                JSONObject b6 = this.f16387e.b();
                if (b6 != null) {
                    d b7 = this.f16385c.b(b6);
                    if (b7 != null) {
                        q(b6, ProtectedSandApp.s("⩗"));
                        long a6 = this.f16386d.a();
                        if (!e.IGNORE_CACHE_EXPIRATION.equals(eVar) && b7.a(a6)) {
                            com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("⩘"));
                        }
                        try {
                            com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("⩙"));
                            dVar = b7;
                        } catch (Exception e6) {
                            e = e6;
                            dVar = b7;
                            com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("⩜"), e);
                            return dVar;
                        }
                    } else {
                        com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("⩚"), null);
                    }
                } else {
                    com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("⩛"));
                }
            }
        } catch (Exception e7) {
            e = e7;
        }
        return dVar;
    }

    private String n() {
        return com.google.firebase.crashlytics.internal.common.i.r(this.f16383a).getString(ProtectedSandApp.s("⩝"), "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(JSONObject jSONObject, String str) throws JSONException {
        com.google.firebase.crashlytics.internal.g f6 = com.google.firebase.crashlytics.internal.g.f();
        StringBuilder a6 = r.a(str);
        a6.append(jSONObject.toString());
        f6.b(a6.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CommitPrefEdits"})
    public boolean r(String str) {
        SharedPreferences.Editor edit = com.google.firebase.crashlytics.internal.common.i.r(this.f16383a).edit();
        edit.putString(ProtectedSandApp.s("⩞"), str);
        edit.apply();
        return true;
    }

    @Override // com.google.firebase.crashlytics.internal.settings.j
    public Task<d> a() {
        return this.f16391i.get().getTask();
    }

    @Override // com.google.firebase.crashlytics.internal.settings.j
    public d b() {
        return this.f16390h.get();
    }

    boolean k() {
        return !n().equals(this.f16384b.f16423f);
    }

    public Task<Void> o(e eVar, Executor executor) {
        d m5;
        if (!k() && (m5 = m(eVar)) != null) {
            this.f16390h.set(m5);
            this.f16391i.get().trySetResult(m5);
            return Tasks.forResult(null);
        }
        d m6 = m(e.IGNORE_CACHE_EXPIRATION);
        if (m6 != null) {
            this.f16390h.set(m6);
            this.f16391i.get().trySetResult(m6);
        }
        return this.f16389g.k(executor).onSuccessTask(executor, new a());
    }

    public Task<Void> p(Executor executor) {
        return o(e.USE_CACHE, executor);
    }
}
