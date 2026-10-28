package com.cby.shareboard.draw.model;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RoomStatus.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/cby/shareboard/draw/model/RoomStatus;", "", "(Ljava/lang/String;I)V", "isConnected", "", "isConnectedOrOffline", "IDLE", "CONNECTING", "CONNECTED", "RECONNECTING", "FAILED", "OFFLINE", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RoomStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ RoomStatus[] $VALUES;
    public static final RoomStatus IDLE = new RoomStatus(ProtectedSandApp.s("\u0b7f"), 0);
    public static final RoomStatus CONNECTING = new RoomStatus(ProtectedSandApp.s("\u0b80"), 1);
    public static final RoomStatus CONNECTED = new RoomStatus(ProtectedSandApp.s("\u0b81"), 2);
    public static final RoomStatus RECONNECTING = new RoomStatus(ProtectedSandApp.s("ஂ"), 3);
    public static final RoomStatus FAILED = new RoomStatus(ProtectedSandApp.s("ஃ"), 4);
    public static final RoomStatus OFFLINE = new RoomStatus(ProtectedSandApp.s("\u0b84"), 5);

    private static final /* synthetic */ RoomStatus[] $values() {
        return new RoomStatus[]{IDLE, CONNECTING, CONNECTED, RECONNECTING, FAILED, OFFLINE};
    }

    static {
        RoomStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private RoomStatus(String str, int i4) {
    }

    @l
    public static a<RoomStatus> getEntries() {
        return $ENTRIES;
    }

    public static RoomStatus valueOf(String str) {
        return (RoomStatus) Enum.valueOf(RoomStatus.class, str);
    }

    public static RoomStatus[] values() {
        return (RoomStatus[]) $VALUES.clone();
    }

    public final boolean isConnected() {
        return this == CONNECTED;
    }

    public final boolean isConnectedOrOffline() {
        return this == CONNECTED || this == OFFLINE;
    }
}
