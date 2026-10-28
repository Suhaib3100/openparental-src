package com.cby.shareboard.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.layout.a0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.gson.annotations.SerializedName;
import fg.l;
import fg.m;
import kd.j;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import oe.d;

/* compiled from: DoodleDataBean.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b0\b\u0007\u0018\u00002\u00020\u0001B¡\u0001\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010!\u001a\u0004\b&\u0010#\"\u0004\b'\u0010%R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010!\u001a\u0004\b-\u0010#\"\u0004\b.\u0010%R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u00104\u001a\u0004\b5\u0010\u001a\"\u0004\b6\u00107R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010\u000e\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u00108\u001a\u0004\b=\u0010:\"\u0004\b>\u0010<R\"\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u00104\u001a\u0004\b?\u0010\u001a\"\u0004\b@\u00107R\"\u0010\u0010\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u00104\u001a\u0004\bA\u0010\u001a\"\u0004\bB\u00107R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u00104\u001a\u0004\bC\u0010\u001a\"\u0004\bD\u00107R$\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010(\u001a\u0004\bE\u0010*\"\u0004\bF\u0010,R\"\u0010\u0013\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010(\u001a\u0004\bG\u0010*\"\u0004\bH\u0010,R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010I\u001a\u0004\b\u0015\u0010J\"\u0004\bK\u0010LR\"\u0010\u0016\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010I\u001a\u0004\b\u0016\u0010J\"\u0004\bM\u0010L¨\u0006N"}, d2 = {"Lcom/cby/shareboard/model/DoodleDataBean;", "Landroid/os/Parcelable;", "", "id", "pageId", "", "userId", "timestamp", "", "step", "", "no", "", "x", "y", "paintColor", "paintSize", "actionType", "imageBase64", "targetIds", "", "isForwardConfirmed", "isSentRemote", "<init>", "(JJLjava/lang/String;JBIFFIIILjava/lang/String;Ljava/lang/String;ZZ)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/k2;", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getId", "()J", "setId", "(J)V", "getPageId", "setPageId", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "getTimestamp", "setTimestamp", "B", "getStep", "()B", "setStep", "(B)V", "I", "getNo", "setNo", "(I)V", "F", "getX", "()F", "setX", "(F)V", "getY", "setY", "getPaintColor", "setPaintColor", "getPaintSize", "setPaintSize", "getActionType", "setActionType", "getImageBase64", "setImageBase64", "getTargetIds", "setTargetIds", "Z", "()Z", "setForwardConfirmed", "(Z)V", "setSentRemote", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes3.dex */
public final class DoodleDataBean implements Parcelable {

    @l
    public static final Parcelable.Creator<DoodleDataBean> CREATOR = new Creator();

    @SerializedName("Type")
    private int actionType;

    @SerializedName("Id")
    private long id;

    @SerializedName("ImageBase64 ")
    @m
    private String imageBase64;

    @SerializedName("IsForwardConfirmed")
    private boolean isForwardConfirmed;

    @SerializedName("IsSentRemote")
    private boolean isSentRemote;

    @SerializedName("No")
    private int no;

    @SerializedName("PageId")
    private long pageId;

    @SerializedName("Color")
    private int paintColor;

    @SerializedName("Size")
    private int paintSize;

    @SerializedName("Step")
    private byte step;

    @SerializedName("TargetIds")
    @l
    private String targetIds;

    @SerializedName("Timestamp")
    private long timestamp;

    @SerializedName("UserId")
    @l
    private String userId;

    @SerializedName("X")
    private float x;

    @SerializedName("Y")
    private float y;

    /* compiled from: DoodleDataBean.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DoodleDataBean> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @l
        public final DoodleDataBean createFromParcel(@l Parcel parcel) {
            l0.p(parcel, ProtectedSandApp.s("ౘ"));
            return new DoodleDataBean(parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readByte(), parcel.readInt(), parcel.readFloat(), parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @l
        public final DoodleDataBean[] newArray(int i4) {
            return new DoodleDataBean[i4];
        }
    }

    @j
    public DoodleDataBean() {
        this(0L, 0L, null, 0L, (byte) 0, 0, 0.0f, 0.0f, 0, 0, 0, null, null, false, false, a0.f18904a, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getActionType() {
        return this.actionType;
    }

    public final long getId() {
        return this.id;
    }

    @m
    public final String getImageBase64() {
        return this.imageBase64;
    }

    public final int getNo() {
        return this.no;
    }

    public final long getPageId() {
        return this.pageId;
    }

    public final int getPaintColor() {
        return this.paintColor;
    }

    public final int getPaintSize() {
        return this.paintSize;
    }

    public final byte getStep() {
        return this.step;
    }

    @l
    public final String getTargetIds() {
        return this.targetIds;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @l
    public final String getUserId() {
        return this.userId;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    /* renamed from: isForwardConfirmed, reason: from getter */
    public final boolean getIsForwardConfirmed() {
        return this.isForwardConfirmed;
    }

    /* renamed from: isSentRemote, reason: from getter */
    public final boolean getIsSentRemote() {
        return this.isSentRemote;
    }

    public final void setActionType(int i4) {
        this.actionType = i4;
    }

    public final void setForwardConfirmed(boolean z4) {
        this.isForwardConfirmed = z4;
    }

    public final void setId(long j4) {
        this.id = j4;
    }

    public final void setImageBase64(@m String str) {
        this.imageBase64 = str;
    }

    public final void setNo(int i4) {
        this.no = i4;
    }

    public final void setPageId(long j4) {
        this.pageId = j4;
    }

    public final void setPaintColor(int i4) {
        this.paintColor = i4;
    }

    public final void setPaintSize(int i4) {
        this.paintSize = i4;
    }

    public final void setSentRemote(boolean z4) {
        this.isSentRemote = z4;
    }

    public final void setStep(byte b5) {
        this.step = b5;
    }

    public final void setTargetIds(@l String str) {
        l0.p(str, ProtectedSandApp.s("\u0c5b"));
        this.targetIds = str;
    }

    public final void setTimestamp(long j4) {
        this.timestamp = j4;
    }

    public final void setUserId(@l String str) {
        l0.p(str, ProtectedSandApp.s("\u0c5b"));
        this.userId = str;
    }

    public final void setX(float f4) {
        this.x = f4;
    }

    public final void setY(float f4) {
        this.y = f4;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel, int flags) {
        l0.p(parcel, ProtectedSandApp.s("\u0c5c"));
        parcel.writeLong(this.id);
        parcel.writeLong(this.pageId);
        parcel.writeString(this.userId);
        parcel.writeLong(this.timestamp);
        parcel.writeByte(this.step);
        parcel.writeInt(this.no);
        parcel.writeFloat(this.x);
        parcel.writeFloat(this.y);
        parcel.writeInt(this.paintColor);
        parcel.writeInt(this.paintSize);
        parcel.writeInt(this.actionType);
        parcel.writeString(this.imageBase64);
        parcel.writeString(this.targetIds);
        parcel.writeInt(this.isForwardConfirmed ? 1 : 0);
        parcel.writeInt(this.isSentRemote ? 1 : 0);
    }

    @j
    public DoodleDataBean(long j4) {
        this(j4, 0L, null, 0L, (byte) 0, 0, 0.0f, 0.0f, 0, 0, 0, null, null, false, false, 32766, null);
    }

    @j
    public DoodleDataBean(long j4, long j5) {
        this(j4, j5, null, 0L, (byte) 0, 0, 0.0f, 0.0f, 0, 0, 0, null, null, false, false, 32764, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public DoodleDataBean(long j4, long j5, @l String str) {
        this(j4, j5, str, 0L, (byte) 0, 0, 0.0f, 0.0f, 0, 0, 0, null, null, false, false, 32760, null);
        l0.p(str, ProtectedSandApp.s("ౙ"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public DoodleDataBean(long j4, long j5, @l String str, long j6) {
        this(j4, j5, str, j6, (byte) 0, 0, 0.0f, 0.0f, 0, 0, 0, null, null, false, false, 32752, null);
        l0.p(str, ProtectedSandApp.s("ౙ"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public DoodleDataBean(long j4, long j5, @l String str, long j6, byte b5) {
        this(j4, j5, str, j6, b5, 0, 0.0f, 0.0f, 0, 0, 0, null, null, false, false, 32736, null);
        l0.p(str, ProtectedSandApp.s("ౙ"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public DoodleDataBean(long j4, long j5, @l String str, long j6, byte b5, int i4) {
        this(j4, j5, str, j6, b5, i4, 0.0f, 0.0f, 0, 0, 0, null, null, false, false, 32704, null);
        l0.p(str, ProtectedSandApp.s("ౙ"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public DoodleDataBean(long j4, long j5, @l String str, long j6, byte b5, int i4, float f4) {
        this(j4, j5, str, j6, b5, i4, f4, 0.0f, 0, 0, 0, null, null, false, false, 32640, null);
        l0.p(str, ProtectedSandApp.s("ౙ"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public DoodleDataBean(long j4, long j5, @l String str, long j6, byte b5, int i4, float f4, float f5) {
        this(j4, j5, str, j6, b5, i4, f4, f5, 0, 0, 0, null, null, false, false, 32512, null);
        l0.p(str, ProtectedSandApp.s("ౙ"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public DoodleDataBean(long j4, long j5, @l String str, long j6, byte b5, int i4, float f4, float f5, int i5) {
        this(j4, j5, str, j6, b5, i4, f4, f5, i5, 0, 0, null, null, false, false, 32256, null);
        l0.p(str, ProtectedSandApp.s("ౙ"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public DoodleDataBean(long j4, long j5, @l String str, long j6, byte b5, int i4, float f4, float f5, int i5, int i6) {
        this(j4, j5, str, j6, b5, i4, f4, f5, i5, i6, 0, null, null, false, false, 31744, null);
        l0.p(str, ProtectedSandApp.s("ౙ"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public DoodleDataBean(long j4, long j5, @l String str, long j6, byte b5, int i4, float f4, float f5, int i5, int i6, int i7) {
        this(j4, j5, str, j6, b5, i4, f4, f5, i5, i6, i7, null, null, false, false, 30720, null);
        l0.p(str, ProtectedSandApp.s("ౙ"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public DoodleDataBean(long j4, long j5, @l String str, long j6, byte b5, int i4, float f4, float f5, int i5, int i6, int i7, @m String str2) {
        this(j4, j5, str, j6, b5, i4, f4, f5, i5, i6, i7, str2, null, false, false, 28672, null);
        l0.p(str, ProtectedSandApp.s("ౙ"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public DoodleDataBean(long j4, long j5, @l String str, long j6, byte b5, int i4, float f4, float f5, int i5, int i6, int i7, @m String str2, @l String str3) {
        this(j4, j5, str, j6, b5, i4, f4, f5, i5, i6, i7, str2, str3, false, false, 24576, null);
        l0.p(str, ProtectedSandApp.s("ౙ"));
        l0.p(str3, ProtectedSandApp.s("ౚ"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public DoodleDataBean(long j4, long j5, @l String str, long j6, byte b5, int i4, float f4, float f5, int i5, int i6, int i7, @m String str2, @l String str3, boolean z4) {
        this(j4, j5, str, j6, b5, i4, f4, f5, i5, i6, i7, str2, str3, z4, false, 16384, null);
        l0.p(str, ProtectedSandApp.s("ౙ"));
        l0.p(str3, ProtectedSandApp.s("ౚ"));
    }

    @j
    public DoodleDataBean(long j4, long j5, @l String str, long j6, byte b5, int i4, float f4, float f5, int i5, int i6, int i7, @m String str2, @l String str3, boolean z4, boolean z5) {
        l0.p(str, ProtectedSandApp.s("ౙ"));
        l0.p(str3, ProtectedSandApp.s("ౚ"));
        this.id = j4;
        this.pageId = j5;
        this.userId = str;
        this.timestamp = j6;
        this.step = b5;
        this.no = i4;
        this.x = f4;
        this.y = f5;
        this.paintColor = i5;
        this.paintSize = i6;
        this.actionType = i7;
        this.imageBase64 = str2;
        this.targetIds = str3;
        this.isForwardConfirmed = z4;
        this.isSentRemote = z5;
    }

    public /* synthetic */ DoodleDataBean(long j4, long j5, String str, long j6, byte b5, int i4, float f4, float f5, int i5, int i6, int i7, String str2, String str3, boolean z4, boolean z5, int i10, w wVar) {
        this((i10 & 1) != 0 ? 0L : j4, (i10 & 2) != 0 ? 0L : j5, (i10 & 4) != 0 ? "" : str, (i10 & 8) == 0 ? j6 : 0L, (i10 & 16) != 0 ? (byte) 1 : b5, (i10 & 32) != 0 ? -1 : i4, (i10 & 64) != 0 ? 0.0f : f4, (i10 & 128) == 0 ? f5 : 0.0f, (i10 & 256) != 0 ? 0 : i5, (i10 & 512) != 0 ? 5 : i6, (i10 & 1024) != 0 ? 0 : i7, (i10 & 2048) != 0 ? "" : str2, (i10 & 4096) != 0 ? "" : str3, (i10 & 8192) != 0 ? false : z4, (i10 & 16384) != 0 ? false : z5);
    }
}
