package com.cby.shareboard.draw.model;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DrawBoardStatus.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/cby/shareboard/draw/model/DrawBoardStatus;", "", "(Ljava/lang/String;I)V", "isSuccessful", "", "isSuccessfulOrOffline", "IDLE", "LOADING", "SUCCESSFUL", "FAILED", "RECONNECTING", "OFFLINE", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DrawBoardStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DrawBoardStatus[] $VALUES;
    public static final DrawBoardStatus IDLE = new DrawBoardStatus(ProtectedSandApp.s("ୢ"), 0);
    public static final DrawBoardStatus LOADING = new DrawBoardStatus(ProtectedSandApp.s("ୣ"), 1);
    public static final DrawBoardStatus SUCCESSFUL = new DrawBoardStatus(ProtectedSandApp.s("\u0b64"), 2);
    public static final DrawBoardStatus FAILED = new DrawBoardStatus(ProtectedSandApp.s("\u0b65"), 3);
    public static final DrawBoardStatus RECONNECTING = new DrawBoardStatus(ProtectedSandApp.s("୦"), 4);
    public static final DrawBoardStatus OFFLINE = new DrawBoardStatus(ProtectedSandApp.s("୧"), 5);

    private static final /* synthetic */ DrawBoardStatus[] $values() {
        return new DrawBoardStatus[]{IDLE, LOADING, SUCCESSFUL, FAILED, RECONNECTING, OFFLINE};
    }

    static {
        DrawBoardStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private DrawBoardStatus(String str, int i4) {
    }

    @l
    public static a<DrawBoardStatus> getEntries() {
        return $ENTRIES;
    }

    public static DrawBoardStatus valueOf(String str) {
        return (DrawBoardStatus) Enum.valueOf(DrawBoardStatus.class, str);
    }

    public static DrawBoardStatus[] values() {
        return (DrawBoardStatus[]) $VALUES.clone();
    }

    public boolean isSuccessful() {
        return this == SUCCESSFUL;
    }

    public boolean isSuccessfulOrOffline() {
        return this == SUCCESSFUL || this == OFFLINE;
    }
}
