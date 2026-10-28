package com.cby.shareboard.draw.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import oe.d;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JoinConfig.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0007\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b!\u0010\u0014R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010%R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001d\u001a\u0004\b&\u0010\u0014\"\u0004\b'\u0010(R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001d\u001a\u0004\b)\u0010\u0014\"\u0004\b*\u0010(R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b+\u0010\u0014\"\u0004\b,\u0010(R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010\u000e\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010-\u001a\u0004\b2\u0010/\"\u0004\b3\u00101R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u00069"}, d2 = {"Lcom/cby/shareboard/draw/model/JoinConfig;", "Landroid/os/Parcelable;", "", "appId", "roomId", "userId", "token", "", "roleId", "sessionId", "nickname", "avatar", "", "needPushData", "needPullData", "Lcom/cby/shareboard/draw/model/DrawBoardSize;", "drawBoardSize", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLcom/cby/shareboard/draw/model/DrawBoardSize;)V", "toString", "()Ljava/lang/String;", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/k2;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getAppId", "getRoomId", "getUserId", "getToken", "I", "getRoleId", "setRoleId", "(I)V", "getSessionId", "setSessionId", "(Ljava/lang/String;)V", "getNickname", "setNickname", "getAvatar", "setAvatar", "Z", "getNeedPushData", "()Z", "setNeedPushData", "(Z)V", "getNeedPullData", "setNeedPullData", "Lcom/cby/shareboard/draw/model/DrawBoardSize;", "getDrawBoardSize", "()Lcom/cby/shareboard/draw/model/DrawBoardSize;", "setDrawBoardSize", "(Lcom/cby/shareboard/draw/model/DrawBoardSize;)V", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes3.dex */
public final class JoinConfig implements Parcelable {

    @l
    public static final Parcelable.Creator<JoinConfig> CREATOR = new Creator();

    @l
    private final String appId;

    @m
    private String avatar;

    @m
    private DrawBoardSize drawBoardSize;
    private boolean needPullData;
    private boolean needPushData;

    @m
    private String nickname;
    private int roleId;

    @l
    private final String roomId;

    @m
    private String sessionId;

    @l
    private final String token;

    @l
    private final String userId;

    /* compiled from: JoinConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<JoinConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @l
        public final JoinConfig createFromParcel(@l Parcel parcel) {
            l0.p(parcel, ProtectedSandApp.s("୨"));
            return new JoinConfig(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : DrawBoardSize.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @l
        public final JoinConfig[] newArray(int i4) {
            return new JoinConfig[i4];
        }
    }

    public JoinConfig(@l String str, @l String str2, @l String str3, @l String str4, int i4, @m String str5, @m String str6, @m String str7, boolean z4, boolean z5, @m DrawBoardSize drawBoardSize) {
        l0.p(str, ProtectedSandApp.s("୩"));
        l0.p(str2, ProtectedSandApp.s("୪"));
        l0.p(str3, ProtectedSandApp.s("୫"));
        l0.p(str4, ProtectedSandApp.s("୬"));
        this.appId = str;
        this.roomId = str2;
        this.userId = str3;
        this.token = str4;
        this.roleId = i4;
        this.sessionId = str5;
        this.nickname = str6;
        this.avatar = str7;
        this.needPushData = z4;
        this.needPullData = z5;
        this.drawBoardSize = drawBoardSize;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final String getAppId() {
        return this.appId;
    }

    @m
    public final String getAvatar() {
        return this.avatar;
    }

    @m
    public final DrawBoardSize getDrawBoardSize() {
        return this.drawBoardSize;
    }

    public final boolean getNeedPullData() {
        return this.needPullData;
    }

    public final boolean getNeedPushData() {
        return this.needPushData;
    }

    @m
    public final String getNickname() {
        return this.nickname;
    }

    public final int getRoleId() {
        return this.roleId;
    }

    @l
    public final String getRoomId() {
        return this.roomId;
    }

    @m
    public final String getSessionId() {
        return this.sessionId;
    }

    @l
    public final String getToken() {
        return this.token;
    }

    @l
    public final String getUserId() {
        return this.userId;
    }

    public final void setAvatar(@m String str) {
        this.avatar = str;
    }

    public final void setDrawBoardSize(@m DrawBoardSize drawBoardSize) {
        this.drawBoardSize = drawBoardSize;
    }

    public final void setNeedPullData(boolean z4) {
        this.needPullData = z4;
    }

    public final void setNeedPushData(boolean z4) {
        this.needPushData = z4;
    }

    public final void setNickname(@m String str) {
        this.nickname = str;
    }

    public final void setRoleId(int i4) {
        this.roleId = i4;
    }

    public final void setSessionId(@m String str) {
        this.sessionId = str;
    }

    @l
    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ProtectedSandApp.s("୩"), this.appId);
            jSONObject.put(ProtectedSandApp.s("୭"), this.roomId);
            jSONObject.put(ProtectedSandApp.s("୬"), this.token);
            jSONObject.put(ProtectedSandApp.s("୮"), ProtectedSandApp.s("୯"));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(ProtectedSandApp.s("୫"), this.userId);
            jSONObject2.put(ProtectedSandApp.s("୰"), this.roleId);
            String str = this.sessionId;
            if (str != null) {
                jSONObject2.put(ProtectedSandApp.s("ୱ"), str);
            }
            String str2 = this.nickname;
            if (str2 != null) {
                jSONObject2.put(ProtectedSandApp.s("୲"), str2);
            }
            String str3 = this.avatar;
            if (str3 != null) {
                jSONObject2.put(ProtectedSandApp.s("୳"), str3);
            }
            jSONObject.put(ProtectedSandApp.s("୴"), jSONObject2);
        } catch (JSONException unused) {
        }
        String jSONObject3 = jSONObject.toString();
        l0.o(jSONObject3, ProtectedSandApp.s("୵"));
        return jSONObject3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel, int flags) {
        l0.p(parcel, ProtectedSandApp.s("୶"));
        parcel.writeString(this.appId);
        parcel.writeString(this.roomId);
        parcel.writeString(this.userId);
        parcel.writeString(this.token);
        parcel.writeInt(this.roleId);
        parcel.writeString(this.sessionId);
        parcel.writeString(this.nickname);
        parcel.writeString(this.avatar);
        parcel.writeInt(this.needPushData ? 1 : 0);
        parcel.writeInt(this.needPullData ? 1 : 0);
        DrawBoardSize drawBoardSize = this.drawBoardSize;
        if (drawBoardSize == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            drawBoardSize.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ JoinConfig(String str, String str2, String str3, String str4, int i4, String str5, String str6, String str7, boolean z4, boolean z5, DrawBoardSize drawBoardSize, int i5, w wVar) {
        this(str, str2, str3, str4, (i5 & 16) != 0 ? 0 : i4, (i5 & 32) != 0 ? null : str5, (i5 & 64) != 0 ? null : str6, (i5 & 128) != 0 ? null : str7, (i5 & 256) != 0 ? true : z4, (i5 & 512) != 0 ? true : z5, (i5 & 1024) != 0 ? null : drawBoardSize);
    }
}
