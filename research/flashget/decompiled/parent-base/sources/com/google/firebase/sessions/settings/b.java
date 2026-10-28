package com.google.firebase.sessions.settings;

import android.content.Context;
import android.os.Bundle;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.k2;

/* compiled from: LocalOverrideSettings.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u0012\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u000eR\u001f\u0010\u0013\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Lcom/google/firebase/sessions/settings/b;", "Lcom/google/firebase/sessions/settings/h;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "kotlin.jvm.PlatformType", "a", "Landroid/os/Bundle;", "f", "()V", "metadata", "", "()Ljava/lang/Boolean;", "sessionEnabled", "Lkotlin/time/e;", "b", "()Lkotlin/time/e;", "sessionRestartTimeout", "", "c", "()Ljava/lang/Double;", "samplingRate", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class b implements h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Bundle metadata;

    /* renamed from: c, reason: collision with root package name */
    @l
    @Deprecated
    public static final String f60937c = ProtectedSandApp.s("ԕ\u0001");

    /* renamed from: d, reason: collision with root package name */
    @l
    @Deprecated
    public static final String f60938d = ProtectedSandApp.s("Ԗ\u0001");

    /* renamed from: e, reason: collision with root package name */
    @l
    @Deprecated
    public static final String f60939e = ProtectedSandApp.s("ԗ\u0001");

    /* renamed from: b, reason: collision with root package name */
    @l
    private static final a f60936b = new a();

    /* compiled from: LocalOverrideSettings.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/google/firebase/sessions/settings/b$a;", "", "<init>", "()V", "", "SAMPLING_RATE", "Ljava/lang/String;", "SESSIONS_ENABLED", "SESSION_RESTART_TIMEOUT", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {
        private a() {
        }

        public a(w wVar) {
        }
    }

    public b(@l Context context) {
        l0.p(context, ProtectedSandApp.s("Ԙ\u0001"));
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.metadata = bundle == null ? Bundle.EMPTY : bundle;
    }

    private static /* synthetic */ void f() {
    }

    @Override // com.google.firebase.sessions.settings.h
    @m
    public Boolean a() {
        Bundle bundle = this.metadata;
        String s4 = ProtectedSandApp.s("ԕ\u0001");
        if (bundle.containsKey(s4)) {
            return Boolean.valueOf(this.metadata.getBoolean(s4));
        }
        return null;
    }

    @Override // com.google.firebase.sessions.settings.h
    @m
    public kotlin.time.e b() {
        Bundle bundle = this.metadata;
        String s4 = ProtectedSandApp.s("Ԗ\u0001");
        if (bundle.containsKey(s4)) {
            return kotlin.time.e.f(kotlin.time.g.m0(this.metadata.getInt(s4), kotlin.time.h.SECONDS));
        }
        return null;
    }

    @Override // com.google.firebase.sessions.settings.h
    @m
    public Double c() {
        Bundle bundle = this.metadata;
        String s4 = ProtectedSandApp.s("ԗ\u0001");
        if (bundle.containsKey(s4)) {
            return Double.valueOf(this.metadata.getDouble(s4));
        }
        return null;
    }

    @Override // com.google.firebase.sessions.settings.h
    public boolean d() {
        return false;
    }

    @Override // com.google.firebase.sessions.settings.h
    @m
    public Object e(@l kotlin.coroutines.d<? super k2> dVar) {
        return k2.f75408a;
    }
}
