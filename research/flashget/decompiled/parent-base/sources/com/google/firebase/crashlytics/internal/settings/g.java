package com.google.firebase.crashlytics.internal.settings;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.compose.material3.j4;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.common.g1;
import com.google.firebase.crashlytics.internal.common.h0;
import com.google.firebase.crashlytics.internal.common.i0;
import com.google.firebase.crashlytics.internal.common.j0;
import com.google.firebase.crashlytics.internal.common.n0;
import com.google.firebase.crashlytics.internal.settings.g;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* compiled from: SettingsController.java */
/* loaded from: classes6.dex */
public class g implements k {

    /* renamed from: j, reason: collision with root package name */
    private static final String f59508j = ProtectedSandApp.s("ￛ");

    /* renamed from: k, reason: collision with root package name */
    private static final String f59509k = ProtectedSandApp.s("ￔ");

    /* renamed from: a, reason: collision with root package name */
    private final Context f59510a;

    /* renamed from: b, reason: collision with root package name */
    private final l f59511b;

    /* renamed from: c, reason: collision with root package name */
    private final i f59512c;

    /* renamed from: d, reason: collision with root package name */
    private final h0 f59513d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.settings.a f59514e;

    /* renamed from: f, reason: collision with root package name */
    private final m f59515f;

    /* renamed from: g, reason: collision with root package name */
    private final i0 f59516g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicReference<d> f59517h;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicReference<TaskCompletionSource<d>> f59518i;

    /* compiled from: SettingsController.java */
    class a implements SuccessContinuation<Void, Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.firebase.crashlytics.internal.concurrency.k f59519a;

        a(com.google.firebase.crashlytics.internal.concurrency.k kVar) {
            this.f59519a = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ JSONObject b() throws Exception {
            return g.this.f59515f.a(g.this.f59511b, true);
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        @o0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Task<Void> then(@q0 Void r5) throws Exception {
            JSONObject jSONObject = (JSONObject) this.f59519a.network.i().submit(new Callable() { // from class: com.google.firebase.crashlytics.internal.settings.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    JSONObject b5;
                    b5 = g.a.this.b();
                    return b5;
                }
            }).get();
            if (jSONObject != null) {
                d b5 = g.this.f59512c.b(jSONObject);
                g.this.f59514e.c(b5.f59496c, jSONObject);
                g.this.q(jSONObject, ProtectedSandApp.s("ￓ"));
                g gVar = g.this;
                gVar.r(gVar.f59511b.f59551f);
                g.this.f59517h.set(b5);
                ((TaskCompletionSource) g.this.f59518i.get()).trySetResult(b5);
            }
            return Tasks.forResult(null);
        }
    }

    g(Context context, l lVar, h0 h0Var, i iVar, com.google.firebase.crashlytics.internal.settings.a aVar, m mVar, i0 i0Var) {
        AtomicReference<d> atomicReference = new AtomicReference<>();
        this.f59517h = atomicReference;
        this.f59518i = new AtomicReference<>(new TaskCompletionSource());
        this.f59510a = context;
        this.f59511b = lVar;
        this.f59513d = h0Var;
        this.f59512c = iVar;
        this.f59514e = aVar;
        this.f59515f = mVar;
        this.f59516g = i0Var;
        atomicReference.set(b.b(h0Var));
    }

    public static g l(Context context, String str, n0 n0Var, n9.b bVar, String str2, String str3, com.google.firebase.crashlytics.internal.persistence.g gVar, i0 i0Var) {
        String g4 = n0Var.g();
        g1 g1Var = new g1();
        return new g(context, new l(str, n0Var.h(), n0Var.i(), n0Var.j(), n0Var, com.google.firebase.crashlytics.internal.common.i.h(com.google.firebase.crashlytics.internal.common.i.n(context), str, str3, str2), str3, str2, j0.determineFrom(g4).getId()), g1Var, new i(g1Var), new com.google.firebase.crashlytics.internal.settings.a(gVar), new c(String.format(Locale.US, ProtectedSandApp.s("ￔ"), str), bVar), i0Var);
    }

    private d m(e eVar) {
        d dVar = null;
        try {
            if (!e.SKIP_CACHE_LOOKUP.equals(eVar)) {
                JSONObject b5 = this.f59514e.b();
                if (b5 != null) {
                    d b6 = this.f59512c.b(b5);
                    if (b6 != null) {
                        q(b5, ProtectedSandApp.s("ￕ"));
                        long a5 = this.f59513d.a();
                        if (!e.IGNORE_CACHE_EXPIRATION.equals(eVar) && b6.a(a5)) {
                            com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ￖ"));
                        }
                        try {
                            com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ￗ"));
                            dVar = b6;
                        } catch (Exception e4) {
                            e = e4;
                            dVar = b6;
                            com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("ￚ"), e);
                            return dVar;
                        }
                    } else {
                        com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("\uffd8"), null);
                    }
                } else {
                    com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("\uffd9"));
                }
            }
        } catch (Exception e5) {
            e = e5;
        }
        return dVar;
    }

    private String n() {
        return com.google.firebase.crashlytics.internal.common.i.r(this.f59510a).getString(ProtectedSandApp.s("ￛ"), "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(JSONObject jSONObject, String str) {
        com.google.firebase.crashlytics.internal.g f4 = com.google.firebase.crashlytics.internal.g.f();
        StringBuilder a5 = j4.a(str);
        a5.append(jSONObject.toString());
        f4.b(a5.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CommitPrefEdits"})
    public boolean r(String str) {
        SharedPreferences.Editor edit = com.google.firebase.crashlytics.internal.common.i.r(this.f59510a).edit();
        edit.putString(ProtectedSandApp.s("ￛ"), str);
        edit.apply();
        return true;
    }

    @Override // com.google.firebase.crashlytics.internal.settings.k
    public Task<d> a() {
        return this.f59518i.get().getTask();
    }

    @Override // com.google.firebase.crashlytics.internal.settings.k
    public d b() {
        return this.f59517h.get();
    }

    boolean k() {
        return !n().equals(this.f59511b.f59551f);
    }

    public Task<Void> o(com.google.firebase.crashlytics.internal.concurrency.k kVar) {
        return p(e.USE_CACHE, kVar);
    }

    public Task<Void> p(e eVar, com.google.firebase.crashlytics.internal.concurrency.k kVar) {
        d m4;
        if (!k() && (m4 = m(eVar)) != null) {
            this.f59517h.set(m4);
            this.f59518i.get().trySetResult(m4);
            return Tasks.forResult(null);
        }
        d m5 = m(e.IGNORE_CACHE_EXPIRATION);
        if (m5 != null) {
            this.f59517h.set(m5);
            this.f59518i.get().trySetResult(m5);
        }
        return this.f59516g.k().onSuccessTask(kVar.common, new a(kVar));
    }
}
