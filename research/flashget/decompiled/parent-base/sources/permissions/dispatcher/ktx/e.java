package permissions.dispatcher.ktx;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: LocationPermission.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lpermissions/dispatcher/ktx/e;", "", "", "permission", "", "apiLevel", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "Ljava/lang/String;", "getPermission$ktx_release", "()Ljava/lang/String;", "I", "getApiLevel$ktx_release", "()I", "FINE", "COARSE", "BACKGROUND", "ktx_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes9.dex */
public enum e {
    FINE(ProtectedSandApp.s("ꕔ\u0001"), 1),
    COARSE(ProtectedSandApp.s("ꕖ\u0001"), 1),
    BACKGROUND(ProtectedSandApp.s("ꕗ\u0001"), 29);

    private final int apiLevel;

    @fg.l
    private final String permission;

    e(String str, int i4) {
        this.permission = str;
        this.apiLevel = i4;
    }

    /* renamed from: getApiLevel$ktx_release, reason: from getter */
    public final int getApiLevel() {
        return this.apiLevel;
    }

    @fg.l
    /* renamed from: getPermission$ktx_release, reason: from getter */
    public final String getPermission() {
        return this.permission;
    }
}
