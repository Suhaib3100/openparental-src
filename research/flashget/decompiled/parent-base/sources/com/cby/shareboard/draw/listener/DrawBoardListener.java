package com.cby.shareboard.draw.listener;

import android.graphics.Bitmap;
import androidx.annotation.l1;
import com.cby.shareboard.draw.model.DrawBoardStatus;
import com.cby.shareboard.draw.model.DrawBoardViewport;
import com.cby.shareboard.draw.model.Room;
import com.cby.shareboard.draw.model.RoomMember;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: DrawBoardListener.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0019\u0010\u0016J\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00062\u000e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001eH\u0017¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0004H\u0017¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0004H\u0017¢\u0006\u0004\b%\u0010$J\u0017\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020&H\u0017¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00062\u0006\u0010'\u001a\u00020&H\u0017¢\u0006\u0004\b*\u0010)J\u0019\u0010,\u001a\u00020\u00062\b\b\u0001\u0010+\u001a\u00020\tH\u0017¢\u0006\u0004\b,\u0010\fJ\u0017\u0010.\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0013H\u0017¢\u0006\u0004\b.\u0010\u0016J\u0017\u00101\u001a\u00020\u00062\u0006\u00100\u001a\u00020/H\u0017¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0006H\u0016¢\u0006\u0004\b3\u0010\u0010J!\u00107\u001a\u00020\u00062\b\u00105\u001a\u0004\u0018\u0001042\u0006\u00106\u001a\u00020/H\u0016¢\u0006\u0004\b7\u00108J'\u0010<\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u00132\u0006\u0010:\u001a\u00020\u00132\u0006\u0010;\u001a\u00020\u0013H\u0017¢\u0006\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lcom/cby/shareboard/draw/listener/DrawBoardListener;", "", "Lcom/cby/shareboard/draw/model/Room;", "room", "Lcom/cby/shareboard/draw/model/RoomMember;", "me", "Lkotlin/k2;", "onJoinSuccess", "(Lcom/cby/shareboard/draw/model/Room;Lcom/cby/shareboard/draw/model/RoomMember;)V", "", "errorCode", "onJoinFailed", "(I)V", "times", "onReconnecting", "onReconnected", "()V", "onDisconnected", "onEnterOffline", "", "bucketId", "onWhiteBoardOpened", "(Ljava/lang/String;)V", "onWhiteBoardOpenFailed", "(Ljava/lang/String;I)V", "onWhiteBoardClosed", "Lcom/cby/shareboard/draw/model/DrawBoardStatus;", "status", "onBoardStatusChanged", "(Lcom/cby/shareboard/draw/model/DrawBoardStatus;)V", "", "users", "onUserList", "(Ljava/util/List;)V", "user", "onUserJoin", "(Lcom/cby/shareboard/draw/model/RoomMember;)V", "onUserLeave", "Lcom/cby/shareboard/draw/model/DrawBoardViewport;", "viewport", "onBoardSizeChanged", "(Lcom/cby/shareboard/draw/model/DrawBoardViewport;)V", "onBoardScroll", "backgroundColor", "onBackgroundColorChanged", "pageId", "onPageCleaned", "", "isEmpty", "onRecoveryStateChanged", "(Z)V", "onActionChanged", "Landroid/graphics/Bitmap;", "bitmap", "hasData", "onDrawChanged", "(Landroid/graphics/Bitmap;Z)V", "command", "content", "sessionId", "onMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface DrawBoardListener {

    /* compiled from: DrawBoardListener.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onActionChanged(@l DrawBoardListener drawBoardListener) {
        }

        @l1
        public static void onBackgroundColorChanged(@l DrawBoardListener drawBoardListener, @androidx.annotation.l int i4) {
        }

        @l1
        public static void onBoardScroll(@l DrawBoardListener drawBoardListener, @l DrawBoardViewport drawBoardViewport) {
            l0.p(drawBoardViewport, ProtectedSandApp.s("\u0b50"));
        }

        @l1
        public static void onBoardSizeChanged(@l DrawBoardListener drawBoardListener, @l DrawBoardViewport drawBoardViewport) {
            l0.p(drawBoardViewport, ProtectedSandApp.s("\u0b50"));
        }

        @l1
        public static void onBoardStatusChanged(@l DrawBoardListener drawBoardListener, @l DrawBoardStatus drawBoardStatus) {
            l0.p(drawBoardStatus, ProtectedSandApp.s("\u0b51"));
        }

        @l1
        public static void onDisconnected(@l DrawBoardListener drawBoardListener) {
        }

        public static void onDrawChanged(@l DrawBoardListener drawBoardListener, @m Bitmap bitmap, boolean z4) {
        }

        @l1
        public static void onEnterOffline(@l DrawBoardListener drawBoardListener) {
        }

        @l1
        public static void onJoinFailed(@l DrawBoardListener drawBoardListener, int i4) {
        }

        @l1
        public static void onJoinSuccess(@l DrawBoardListener drawBoardListener, @l Room room, @l RoomMember roomMember) {
            l0.p(room, ProtectedSandApp.s("\u0b52"));
            l0.p(roomMember, ProtectedSandApp.s("\u0b53"));
        }

        @l1
        public static void onMessage(@l DrawBoardListener drawBoardListener, @l String str, @l String str2, @l String str3) {
            l0.p(str, ProtectedSandApp.s("\u0b54"));
            l0.p(str2, ProtectedSandApp.s("୕"));
            l0.p(str3, ProtectedSandApp.s("ୖ"));
        }

        @l1
        public static void onPageCleaned(@l DrawBoardListener drawBoardListener, @l String str) {
            l0.p(str, ProtectedSandApp.s("ୗ"));
        }

        @l1
        public static void onReconnected(@l DrawBoardListener drawBoardListener) {
        }

        @l1
        public static void onReconnecting(@l DrawBoardListener drawBoardListener, int i4) {
        }

        @l1
        public static void onRecoveryStateChanged(@l DrawBoardListener drawBoardListener, boolean z4) {
        }

        @l1
        public static void onUserJoin(@l DrawBoardListener drawBoardListener, @l RoomMember roomMember) {
            l0.p(roomMember, ProtectedSandApp.s("\u0b58"));
        }

        @l1
        public static void onUserLeave(@l DrawBoardListener drawBoardListener, @l RoomMember roomMember) {
            l0.p(roomMember, ProtectedSandApp.s("\u0b58"));
        }

        @l1
        public static void onUserList(@l DrawBoardListener drawBoardListener, @l List<RoomMember> list) {
            l0.p(list, ProtectedSandApp.s("\u0b59"));
        }

        @l1
        public static void onWhiteBoardClosed(@l DrawBoardListener drawBoardListener, @l String str) {
            l0.p(str, ProtectedSandApp.s("\u0b5a"));
        }

        @l1
        public static void onWhiteBoardOpenFailed(@l DrawBoardListener drawBoardListener, @l String str, int i4) {
            l0.p(str, ProtectedSandApp.s("\u0b5a"));
        }

        @l1
        public static void onWhiteBoardOpened(@l DrawBoardListener drawBoardListener, @l String str) {
            l0.p(str, ProtectedSandApp.s("\u0b5a"));
        }
    }

    void onActionChanged();

    @l1
    void onBackgroundColorChanged(@androidx.annotation.l int backgroundColor);

    @l1
    void onBoardScroll(@l DrawBoardViewport viewport);

    @l1
    void onBoardSizeChanged(@l DrawBoardViewport viewport);

    @l1
    void onBoardStatusChanged(@l DrawBoardStatus status);

    @l1
    void onDisconnected();

    void onDrawChanged(@m Bitmap bitmap, boolean hasData);

    @l1
    void onEnterOffline();

    @l1
    void onJoinFailed(int errorCode);

    @l1
    void onJoinSuccess(@l Room room, @l RoomMember me2);

    @l1
    void onMessage(@l String command, @l String content, @l String sessionId);

    @l1
    void onPageCleaned(@l String pageId);

    @l1
    void onReconnected();

    @l1
    void onReconnecting(int times);

    @l1
    void onRecoveryStateChanged(boolean isEmpty);

    @l1
    void onUserJoin(@l RoomMember user);

    @l1
    void onUserLeave(@l RoomMember user);

    @l1
    void onUserList(@l List<RoomMember> users);

    @l1
    void onWhiteBoardClosed(@l String bucketId);

    @l1
    void onWhiteBoardOpenFailed(@l String bucketId, int errorCode);

    @l1
    void onWhiteBoardOpened(@l String bucketId);
}
