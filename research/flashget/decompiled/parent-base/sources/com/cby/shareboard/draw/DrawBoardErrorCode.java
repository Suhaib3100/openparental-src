package com.cby.shareboard.draw;

import fg.l;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;

/* compiled from: DrawBoardErrorCode.kt */
@Retention(RetentionPolicy.RUNTIME)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0086\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/cby/shareboard/draw/DrawBoardErrorCode;", "", "Companion", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public @interface DrawBoardErrorCode {
    public static final int APP_ID_NOT_EXIST = 2000;
    public static final int BOARD_OPEN_TIMEOUT = 2006;
    public static final int CONNECT_ROOM_FAILED = 2005;

    /* renamed from: Companion, reason: from kotlin metadata */
    @l
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int NETWORK_ERROR = 1000;
    public static final int PARAM_ERROR = 1002;
    public static final int ROOM_ID_NOT_EXIST = 2001;
    public static final int ROOM_NOT_CONNECTED = 2004;
    public static final int SERVER_ERROR = 1001;
    public static final int TOKEN_ERROR = 2003;
    public static final int UNKNOW = -1;
    public static final int USER_ID_NOT_EXIST = 2002;

    /* compiled from: DrawBoardErrorCode.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/cby/shareboard/draw/DrawBoardErrorCode$Companion;", "", "()V", "APP_ID_NOT_EXIST", "", "BOARD_OPEN_TIMEOUT", "CONNECT_ROOM_FAILED", "NETWORK_ERROR", "PARAM_ERROR", "ROOM_ID_NOT_EXIST", "ROOM_NOT_CONNECTED", "SERVER_ERROR", "TOKEN_ERROR", "UNKNOW", "USER_ID_NOT_EXIST", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int APP_ID_NOT_EXIST = 2000;
        public static final int BOARD_OPEN_TIMEOUT = 2006;
        public static final int CONNECT_ROOM_FAILED = 2005;
        public static final int NETWORK_ERROR = 1000;
        public static final int PARAM_ERROR = 1002;
        public static final int ROOM_ID_NOT_EXIST = 2001;
        public static final int ROOM_NOT_CONNECTED = 2004;
        public static final int SERVER_ERROR = 1001;
        public static final int TOKEN_ERROR = 2003;
        public static final int UNKNOW = -1;
        public static final int USER_ID_NOT_EXIST = 2002;

        private Companion() {
        }
    }
}
