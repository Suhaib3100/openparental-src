package com.google.maps.android.compose;

import androidx.compose.runtime.k2;
import androidx.compose.runtime.t4;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.model.TileOverlay;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: TileOverlay.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R/\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/google/maps/android/compose/p1;", "", "<init>", "()V", "Lkotlin/k2;", "a", "Lcom/google/android/gms/maps/model/TileOverlay;", "<set-?>", "Landroidx/compose/runtime/k2;", "b", "()Lcom/google/android/gms/maps/model/TileOverlay;", "c", "(Lcom/google/android/gms/maps/model/TileOverlay;)V", "tileOverlay", "maps-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nTileOverlay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TileOverlay.kt\ncom/google/maps/android/compose/TileOverlayState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,148:1\n81#2:149\n107#2,2:150\n*S KotlinDebug\n*F\n+ 1 TileOverlay.kt\ncom/google/maps/android/compose/TileOverlayState\n*L\n127#1:149\n127#1:150,2\n*E\n"})
/* loaded from: classes6.dex */
public final class p1 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f62042b = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 tileOverlay;

    public p1() {
        k2 g4;
        g4 = t4.g(null, null, 2, null);
        this.tileOverlay = g4;
    }

    public final void a() {
        TileOverlay b5 = b();
        if (b5 == null) {
            throw new IllegalStateException(ProtectedSandApp.s("\u07fc\u0001"));
        }
        b5.clearTileCache();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.m
    public final TileOverlay b() {
        return (TileOverlay) this.tileOverlay.getValue();
    }

    public final void c(@fg.m TileOverlay tileOverlay) {
        this.tileOverlay.setValue(tileOverlay);
    }
}
