package com.google.firebase.sessions.settings;

import android.content.Context;
import android.os.Bundle;
import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.m2;
import kotlin.time.Duration;
import kotlin.time.DurationUnit;

/* compiled from: LocalOverrideSettings.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\u0004B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\b\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\nR\u001f\u0010\u000f\u001a\u0004\u0018\u00010\f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Lcom/google/firebase/sessions/settings/b;", "Lcom/google/firebase/sessions/settings/h;", "Landroid/os/Bundle;", "kotlin.jvm.PlatformType", "a", "Landroid/os/Bundle;", "getMetadata$annotations", "()V", "metadata", "", "()Ljava/lang/Boolean;", "sessionEnabled", "Lkotlin/time/e;", "b", "()Lkotlin/time/e;", "sessionRestartTimeout", "", "d", "()Ljava/lang/Double;", "samplingRate", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class b implements h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Bundle metadata;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    @Deprecated
    public static final String f18664c = ProtectedSandApp.s("⮠");

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    @Deprecated
    public static final String f18665d = ProtectedSandApp.s("⮡");

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    @Deprecated
    public static final String f18666e = ProtectedSandApp.s("⮢");

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final a f18663b = new a(null);

    /* compiled from: LocalOverrideSettings.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/google/firebase/sessions/settings/b$a;", "", "", "SAMPLING_RATE", "Ljava/lang/String;", "SESSIONS_ENABLED", "SESSION_RESTART_TIMEOUT", "<init>", "()V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes2.dex */
    private static final class a {
        private a() {
        }

        public a(w wVar) {
        }
    }

    public b(@d5.d Context context) {
        l0.p(context, ProtectedSandApp.s("⮣"));
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.metadata = bundle == null ? Bundle.EMPTY : bundle;
    }

    private static /* synthetic */ void f() {
    }

    @Override // com.google.firebase.sessions.settings.h
    @d5.e
    public Boolean a() {
        Bundle bundle = this.metadata;
        String s5 = ProtectedSandApp.s("⮤");
        if (bundle.containsKey(s5)) {
            return Boolean.valueOf(this.metadata.getBoolean(s5));
        }
        return null;
    }

    @Override // com.google.firebase.sessions.settings.h
    @d5.e
    public Duration b() {
        Bundle bundle = this.metadata;
        String s5 = ProtectedSandApp.s("⮥");
        if (bundle.containsKey(s5)) {
            return Duration.p(kotlin.time.g.m0(this.metadata.getInt(s5), DurationUnit.SECONDS));
        }
        return null;
    }

    @Override // com.google.firebase.sessions.settings.h
    public boolean c() {
        return false;
    }

    @Override // com.google.firebase.sessions.settings.h
    @d5.e
    public Double d() {
        Bundle bundle = this.metadata;
        String s5 = ProtectedSandApp.s("⮦");
        if (bundle.containsKey(s5)) {
            return Double.valueOf(this.metadata.getDouble(s5));
        }
        return null;
    }

    @Override // com.google.firebase.sessions.settings.h
    @d5.e
    public Object e(@d5.d Continuation<? super m2> continuation) {
        return m2.f23662a;
    }
}
