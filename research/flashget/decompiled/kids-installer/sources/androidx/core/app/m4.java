package androidx.core.app;

import android.content.res.Configuration;

/* compiled from: PictureInPictureModeChangedInfo.java */
/* loaded from: classes.dex */
public final class m4 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f4140a;

    /* renamed from: b, reason: collision with root package name */
    private final Configuration f4141b;

    public m4(boolean z5) {
        this.f4140a = z5;
        this.f4141b = null;
    }

    @androidx.annotation.o0
    @androidx.annotation.x0(26)
    public Configuration a() {
        Configuration configuration = this.f4141b;
        if (configuration != null) {
            return configuration;
        }
        throw new IllegalStateException("PictureInPictureModeChangedInfo must be constructed with the constructor that takes a Configuration to call getNewConfig(). Are you running on an API 26 or higher device that makes this information available?");
    }

    public boolean b() {
        return this.f4140a;
    }

    @androidx.annotation.x0(26)
    public m4(boolean z5, @androidx.annotation.o0 Configuration configuration) {
        this.f4140a = z5;
        this.f4141b = configuration;
    }
}
