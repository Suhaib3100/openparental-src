package com.google.maps.android.compose;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Objects;
import kotlin.Metadata;

/* compiled from: MapUiSettings.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017Jq\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b \u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b!\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b#\u0010\u001cR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b$\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001a\u001a\u0004\b%\u0010\u001cR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b&\u0010\u001c¨\u0006'"}, d2 = {"Lcom/google/maps/android/compose/y0;", "", "", "compassEnabled", "indoorLevelPickerEnabled", "mapToolbarEnabled", "myLocationButtonEnabled", "rotationGesturesEnabled", "scrollGesturesEnabled", "scrollGesturesEnabledDuringRotateOrZoom", "tiltGesturesEnabled", "zoomControlsEnabled", "zoomGesturesEnabled", "<init>", "(ZZZZZZZZZZ)V", "", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "(ZZZZZZZZZZ)Lcom/google/maps/android/compose/y0;", "Z", "c", "()Z", "b", "d", "e", "f", "g", "h", "i", "j", "k", "l", "maps-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class y0 {

    /* renamed from: k, reason: collision with root package name */
    public static final int f62201k = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean compassEnabled;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean indoorLevelPickerEnabled;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean mapToolbarEnabled;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean myLocationButtonEnabled;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean rotationGesturesEnabled;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean scrollGesturesEnabled;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean scrollGesturesEnabledDuringRotateOrZoom;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean tiltGesturesEnabled;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean zoomControlsEnabled;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final boolean zoomGesturesEnabled;

    public y0() {
        this(false, false, false, false, false, false, false, false, false, false, 1023, null);
    }

    public static y0 b(y0 y0Var, boolean z4, boolean z5, boolean z6, boolean z7, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i4, Object obj) {
        boolean z16 = (i4 & 1) != 0 ? y0Var.compassEnabled : z4;
        boolean z17 = (i4 & 2) != 0 ? y0Var.indoorLevelPickerEnabled : z5;
        boolean z18 = (i4 & 4) != 0 ? y0Var.mapToolbarEnabled : z6;
        boolean z19 = (i4 & 8) != 0 ? y0Var.myLocationButtonEnabled : z7;
        boolean z20 = (i4 & 16) != 0 ? y0Var.rotationGesturesEnabled : z10;
        boolean z21 = (i4 & 32) != 0 ? y0Var.scrollGesturesEnabled : z11;
        boolean z22 = (i4 & 64) != 0 ? y0Var.scrollGesturesEnabledDuringRotateOrZoom : z12;
        boolean z23 = (i4 & 128) != 0 ? y0Var.tiltGesturesEnabled : z13;
        boolean z24 = (i4 & 256) != 0 ? y0Var.zoomControlsEnabled : z14;
        boolean z25 = (i4 & 512) != 0 ? y0Var.zoomGesturesEnabled : z15;
        y0Var.getClass();
        return new y0(z16, z17, z18, z19, z20, z21, z22, z23, z24, z25);
    }

    @fg.l
    public final y0 a(boolean compassEnabled, boolean indoorLevelPickerEnabled, boolean mapToolbarEnabled, boolean myLocationButtonEnabled, boolean rotationGesturesEnabled, boolean scrollGesturesEnabled, boolean scrollGesturesEnabledDuringRotateOrZoom, boolean tiltGesturesEnabled, boolean zoomControlsEnabled, boolean zoomGesturesEnabled) {
        return new y0(compassEnabled, indoorLevelPickerEnabled, mapToolbarEnabled, myLocationButtonEnabled, rotationGesturesEnabled, scrollGesturesEnabled, scrollGesturesEnabledDuringRotateOrZoom, tiltGesturesEnabled, zoomControlsEnabled, zoomGesturesEnabled);
    }

    /* renamed from: c, reason: from getter */
    public final boolean getCompassEnabled() {
        return this.compassEnabled;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIndoorLevelPickerEnabled() {
        return this.indoorLevelPickerEnabled;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getMapToolbarEnabled() {
        return this.mapToolbarEnabled;
    }

    public boolean equals(@fg.m Object other) {
        if (other instanceof y0) {
            y0 y0Var = (y0) other;
            if (this.compassEnabled == y0Var.compassEnabled && this.indoorLevelPickerEnabled == y0Var.indoorLevelPickerEnabled && this.mapToolbarEnabled == y0Var.mapToolbarEnabled && this.myLocationButtonEnabled == y0Var.myLocationButtonEnabled && this.rotationGesturesEnabled == y0Var.rotationGesturesEnabled && this.scrollGesturesEnabled == y0Var.scrollGesturesEnabled && this.scrollGesturesEnabledDuringRotateOrZoom == y0Var.scrollGesturesEnabledDuringRotateOrZoom && this.tiltGesturesEnabled == y0Var.tiltGesturesEnabled && this.zoomControlsEnabled == y0Var.zoomControlsEnabled && this.zoomGesturesEnabled == y0Var.zoomGesturesEnabled) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getMyLocationButtonEnabled() {
        return this.myLocationButtonEnabled;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getRotationGesturesEnabled() {
        return this.rotationGesturesEnabled;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getScrollGesturesEnabled() {
        return this.scrollGesturesEnabled;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.compassEnabled), Boolean.valueOf(this.indoorLevelPickerEnabled), Boolean.valueOf(this.mapToolbarEnabled), Boolean.valueOf(this.myLocationButtonEnabled), Boolean.valueOf(this.rotationGesturesEnabled), Boolean.valueOf(this.scrollGesturesEnabled), Boolean.valueOf(this.scrollGesturesEnabledDuringRotateOrZoom), Boolean.valueOf(this.tiltGesturesEnabled), Boolean.valueOf(this.zoomControlsEnabled), Boolean.valueOf(this.zoomGesturesEnabled));
    }

    /* renamed from: i, reason: from getter */
    public final boolean getScrollGesturesEnabledDuringRotateOrZoom() {
        return this.scrollGesturesEnabledDuringRotateOrZoom;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getTiltGesturesEnabled() {
        return this.tiltGesturesEnabled;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getZoomControlsEnabled() {
        return this.zoomControlsEnabled;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getZoomGesturesEnabled() {
        return this.zoomGesturesEnabled;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ࡋ\u0001"));
        sb.append(this.compassEnabled);
        sb.append(ProtectedSandApp.s("ࡌ\u0001"));
        sb.append(this.indoorLevelPickerEnabled);
        sb.append(ProtectedSandApp.s("ࡍ\u0001"));
        sb.append(this.mapToolbarEnabled);
        sb.append(ProtectedSandApp.s("ࡎ\u0001"));
        sb.append(this.myLocationButtonEnabled);
        sb.append(ProtectedSandApp.s("ࡏ\u0001"));
        sb.append(this.rotationGesturesEnabled);
        sb.append(ProtectedSandApp.s("ࡐ\u0001"));
        sb.append(this.scrollGesturesEnabled);
        sb.append(ProtectedSandApp.s("ࡑ\u0001"));
        sb.append(this.scrollGesturesEnabledDuringRotateOrZoom);
        sb.append(ProtectedSandApp.s("ࡒ\u0001"));
        sb.append(this.tiltGesturesEnabled);
        sb.append(ProtectedSandApp.s("ࡓ\u0001"));
        sb.append(this.zoomControlsEnabled);
        sb.append(ProtectedSandApp.s("ࡔ\u0001"));
        return androidx.compose.animation.l.a(sb, this.zoomGesturesEnabled, ')');
    }

    public y0(boolean z4, boolean z5, boolean z6, boolean z7, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.compassEnabled = z4;
        this.indoorLevelPickerEnabled = z5;
        this.mapToolbarEnabled = z6;
        this.myLocationButtonEnabled = z7;
        this.rotationGesturesEnabled = z10;
        this.scrollGesturesEnabled = z11;
        this.scrollGesturesEnabledDuringRotateOrZoom = z12;
        this.tiltGesturesEnabled = z13;
        this.zoomControlsEnabled = z14;
        this.zoomGesturesEnabled = z15;
    }

    public /* synthetic */ y0(boolean z4, boolean z5, boolean z6, boolean z7, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? true : z4, (i4 & 2) != 0 ? true : z5, (i4 & 4) != 0 ? true : z6, (i4 & 8) != 0 ? true : z7, (i4 & 16) != 0 ? true : z10, (i4 & 32) != 0 ? true : z11, (i4 & 64) != 0 ? true : z12, (i4 & 128) != 0 ? true : z13, (i4 & 256) != 0 ? true : z14, (i4 & 512) == 0 ? z15 : true);
    }
}
