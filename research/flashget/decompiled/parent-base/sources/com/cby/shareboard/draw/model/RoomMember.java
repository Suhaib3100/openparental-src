package com.cby.shareboard.draw.model;

import androidx.annotation.Keep;
import androidx.compose.runtime.changelist.c;
import androidx.constraintlayout.core.parser.b;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: RoomMember.kt */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\u0003H\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/cby/shareboard/draw/model/RoomMember;", "", "userId", "", "sessionId", "roleId", "", "nickname", "avatar", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAvatar", "()Ljava/lang/String;", "getNickname", "getRoleId", "()I", "getSessionId", "getUserId", "equals", "", "o", "hashCode", "toString", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RoomMember {

    @m
    private final String avatar;

    @m
    private final String nickname;
    private final int roleId;

    @l
    private final String sessionId;

    @l
    private final String userId;

    public RoomMember(@l String str, @l String str2, int i4, @m String str3, @m String str4) {
        l0.p(str, ProtectedSandApp.s("୷"));
        l0.p(str2, ProtectedSandApp.s("\u0b78"));
        this.userId = str;
        this.sessionId = str2;
        this.roleId = i4;
        this.nickname = str3;
        this.avatar = str4;
    }

    public boolean equals(@m Object o4) {
        if (this == o4) {
            return true;
        }
        if (o4 == null || !l0.g(RoomMember.class, o4.getClass())) {
            return false;
        }
        return l0.g(this.sessionId, ((RoomMember) o4).sessionId);
    }

    @m
    public final String getAvatar() {
        return this.avatar;
    }

    @m
    public final String getNickname() {
        return this.nickname;
    }

    public final int getRoleId() {
        return this.roleId;
    }

    @l
    public final String getSessionId() {
        return this.sessionId;
    }

    @l
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return Objects.hash(this.sessionId);
    }

    @l
    public String toString() {
        String str = this.userId;
        String str2 = this.sessionId;
        int i4 = this.roleId;
        String str3 = this.nickname;
        String str4 = this.avatar;
        StringBuilder a5 = b.a(ProtectedSandApp.s("\u0b79"), str, ProtectedSandApp.s("\u0b7a"), str2, ProtectedSandApp.s("\u0b7b"));
        c.a(a5, i4, ProtectedSandApp.s("\u0b7c"), str3, ProtectedSandApp.s("\u0b7d"));
        return android.support.v4.media.c.a(a5, str4, ProtectedSandApp.s("\u0b7e"));
    }

    public /* synthetic */ RoomMember(String str, String str2, int i4, String str3, String str4, int i5, w wVar) {
        this(str, str2, (i5 & 4) != 0 ? 0 : i4, (i5 & 8) != 0 ? null : str3, (i5 & 16) != 0 ? null : str4);
    }
}
