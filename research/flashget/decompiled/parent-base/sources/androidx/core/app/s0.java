package androidx.core.app;

import android.content.res.Configuration;
import kotlin.Metadata;

/* compiled from: PictureInPictureModeChangedInfo.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0011\u0010\u0007\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\t\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/core/app/s0;", "", "", "isInPictureInPictureMode", "<init>", "(Z)V", "Landroid/content/res/Configuration;", "newConfig", "(ZLandroid/content/res/Configuration;)V", "a", "Z", "b", "()Z", "Landroid/content/res/Configuration;", "newConfiguration", "()Landroid/content/res/Configuration;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isInPictureInPictureMode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    @androidx.annotation.x0(26)
    private Configuration newConfiguration;

    public s0(boolean z4) {
        this.isInPictureInPictureMode = z4;
    }

    @fg.l
    @androidx.annotation.x0(26)
    public final Configuration a() {
        Configuration configuration = this.newConfiguration;
        if (configuration != null) {
            return configuration;
        }
        throw new IllegalStateException("PictureInPictureModeChangedInfo must be constructed with the constructor that takes a Configuration to access the newConfig. Are you running on an API 26 or higher device that makes this information available?");
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsInPictureInPictureMode() {
        return this.isInPictureInPictureMode;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @androidx.annotation.x0(26)
    public s0(boolean z4, @fg.l Configuration newConfig) {
        this(z4);
        kotlin.jvm.internal.l0.p(newConfig, "newConfig");
        this.newConfiguration = newConfig;
    }
}
