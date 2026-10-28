package com.lyft.kronos.internal.ntp;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: NTPSyncException.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/lyft/kronos/internal/ntp/NTPSyncException;", "Ljava/lang/RuntimeException;", "message", "", "(Ljava/lang/String;)V", "kronos-java"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NTPSyncException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NTPSyncException(@l String str) {
        super(str);
        l0.p(str, ProtectedSandApp.s("ᠭ\u0001"));
    }
}
