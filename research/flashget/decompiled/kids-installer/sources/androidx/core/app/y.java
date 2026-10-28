package androidx.core.app;

import android.content.res.Configuration;

/* compiled from: MultiWindowModeChangedInfo.java */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f4492a;

    /* renamed from: b, reason: collision with root package name */
    private final Configuration f4493b;

    public y(boolean z5) {
        this.f4492a = z5;
        this.f4493b = null;
    }

    @androidx.annotation.o0
    @androidx.annotation.x0(26)
    public Configuration a() {
        Configuration configuration = this.f4493b;
        if (configuration != null) {
            return configuration;
        }
        throw new IllegalStateException("MultiWindowModeChangedInfo must be constructed with the constructor that takes a Configuration to call getNewConfig(). Are you running on an API 26 or higher device that makes this information available?");
    }

    public boolean b() {
        return this.f4492a;
    }

    @androidx.annotation.x0(26)
    public y(boolean z5, @androidx.annotation.o0 Configuration configuration) {
        this.f4492a = z5;
        this.f4493b = configuration;
    }
}
