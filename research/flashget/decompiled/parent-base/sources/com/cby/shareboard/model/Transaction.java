package com.cby.shareboard.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.f0;
import androidx.multidex.c;
import com.cby.shareboard.DrawConfigs;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.gson.annotations.SerializedName;
import fg.l;
import fg.m;
import java.net.URLEncoder;
import java.util.List;
import kd.j;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import oe.d;

/* compiled from: Transaction.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b,\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u008d\u0001\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001dJ-\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001f\u0010\u001dJ=\u0010$\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u0006¢\u0006\u0004\b$\u0010%J\u001b\u0010(\u001a\u00020\u00002\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030&¢\u0006\u0004\b(\u0010)J\u001b\u0010*\u001a\u00020\u00002\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030&¢\u0006\u0004\b*\u0010)J\r\u0010+\u001a\u00020\u0000¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0000¢\u0006\u0004\b-\u0010,J\u001d\u00100\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r¢\u0006\u0004\b0\u00101J\u001d\u00104\u001a\u00020\u00002\u0006\u00102\u001a\u00020\r2\u0006\u00103\u001a\u00020\r¢\u0006\u0004\b4\u00101J\u0015\u00106\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u000b¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u000b¢\u0006\u0004\b8\u00107J\r\u0010:\u001a\u000209¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u000209¢\u0006\u0004\b<\u0010;J\r\u0010=\u001a\u000209¢\u0006\u0004\b=\u0010;J\r\u0010>\u001a\u000209¢\u0006\u0004\b>\u0010;J\r\u0010?\u001a\u000209¢\u0006\u0004\b?\u0010;J\r\u0010@\u001a\u000209¢\u0006\u0004\b@\u0010;J\r\u0010A\u001a\u000209¢\u0006\u0004\bA\u0010;J\r\u0010B\u001a\u000209¢\u0006\u0004\bB\u0010;J\u000f\u0010C\u001a\u00020\u0000H\u0016¢\u0006\u0004\bC\u0010,J\u000f\u0010D\u001a\u00020\u0006H\u0016¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\bF\u0010GJ \u0010K\u001a\u00020\u00172\u0006\u0010I\u001a\u00020H2\u0006\u0010J\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\bK\u0010LR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010M\u001a\u0004\bR\u0010O\"\u0004\bS\u0010QR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010T\u001a\u0004\bU\u0010E\"\u0004\bV\u0010WR\"\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010M\u001a\u0004\bX\u0010O\"\u0004\bY\u0010QR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010_\u001a\u0004\b`\u0010G\"\u0004\ba\u0010bR\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010\u000f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010c\u001a\u0004\bh\u0010e\"\u0004\bi\u0010gR\"\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010_\u001a\u0004\bj\u0010G\"\u0004\bk\u0010bR\"\u0010\u0011\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010_\u001a\u0004\bl\u0010G\"\u0004\bm\u0010bR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010_\u001a\u0004\bn\u0010G\"\u0004\bo\u0010bR$\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010T\u001a\u0004\bp\u0010E\"\u0004\bq\u0010WR\"\u0010\u0014\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010T\u001a\u0004\br\u0010E\"\u0004\bs\u0010W¨\u0006t"}, d2 = {"Lcom/cby/shareboard/model/Transaction;", "Landroid/os/Parcelable;", "", "", "id", "pageId", "", "userId", "timestamp", "", "step", "", "no", "", "x", "y", "paintColor", "paintSize", "actionType", "imageBase64", "targetIds", "<init>", "(JJLjava/lang/String;JBIFFIIILjava/lang/String;Ljava/lang/String;)V", "Lkotlin/k2;", "make", "(BFF)V", "size", "color", "makeStartTransaction", "(FFII)Lcom/cby/shareboard/model/Transaction;", "makeMoveTransaction", "makeEndTransaction", "width", "height", "scale", "image", "makeImageTransaction", "(FFIIFLjava/lang/String;)Lcom/cby/shareboard/model/Transaction;", "", "ids", "makeRevokeTransaction", "(Ljava/util/List;)Lcom/cby/shareboard/model/Transaction;", "makeRedoTransaction", "makeClearSelfTransaction", "()Lcom/cby/shareboard/model/Transaction;", "makeClearAckTransaction", "tx", "ty", "makeTranslateTransaction", "(FF)Lcom/cby/shareboard/model/Transaction;", "sx", "sy", "makeScaleTransaction", "index", "makePreviousTransaction", "(I)Lcom/cby/shareboard/model/Transaction;", "makeNextTransaction", "", "isPaint", "()Z", "isRevoke", "isRedo", "isNext", "isPrevious", "isClearSelf", "isClearAck", "isNotEndFrameStep", "clone", "toString", "()Ljava/lang/String;", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getId", "()J", "setId", "(J)V", "getPageId", "setPageId", "Ljava/lang/String;", "getUserId", "setUserId", "(Ljava/lang/String;)V", "getTimestamp", "setTimestamp", "B", "getStep", "()B", "setStep", "(B)V", "I", "getNo", "setNo", "(I)V", "F", "getX", "()F", "setX", "(F)V", "getY", "setY", "getPaintColor", "setPaintColor", "getPaintSize", "setPaintSize", "getActionType", "setActionType", "getImageBase64", "setImageBase64", "getTargetIds", "setTargetIds", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes3.dex */
public final class Transaction implements Parcelable, Cloneable {

    @l
    public static final Parcelable.Creator<Transaction> CREATOR = new Creator();

    @SerializedName("Type")
    private int actionType;

    @SerializedName("Id")
    private long id;

    @SerializedName("ImageBase64")
    @m
    private String imageBase64;

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

    /* compiled from: Transaction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Transaction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @l
        public final Transaction createFromParcel(@l Parcel parcel) {
            l0.p(parcel, ProtectedSandApp.s("ౝ"));
            return new Transaction(parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readByte(), parcel.readInt(), parcel.readFloat(), parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @l
        public final Transaction[] newArray(int i4) {
            return new Transaction[i4];
        }
    }

    @j
    public Transaction() {
        this(0L, 0L, null, 0L, (byte) 0, 0, 0.0f, 0.0f, 0, 0, 0, null, null, 8191, null);
    }

    private final void make(byte step, float x4, float y4) {
        this.timestamp = System.currentTimeMillis();
        this.step = step;
        this.x = x4;
        this.y = y4;
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

    public final boolean isClearAck() {
        return this.step == 7;
    }

    public final boolean isClearSelf() {
        return this.step == 6;
    }

    public final boolean isNext() {
        return this.step == 11;
    }

    public final boolean isNotEndFrameStep() {
        byte b5 = this.step;
        return b5 == 1 || b5 == 2;
    }

    public final boolean isPaint() {
        return (isRevoke() || isClearSelf() || isClearAck()) ? false : true;
    }

    public final boolean isPrevious() {
        return this.step == 10;
    }

    public final boolean isRedo() {
        return this.step == 5;
    }

    public final boolean isRevoke() {
        return this.step == 4;
    }

    @l
    public final Transaction makeClearAckTransaction() {
        make((byte) 7, 0.0f, 0.0f);
        return this;
    }

    @l
    public final Transaction makeClearSelfTransaction() {
        make((byte) 6, 0.0f, 0.0f);
        return this;
    }

    @l
    public final Transaction makeEndTransaction(float x4, float y4, int size, int color) {
        make((byte) 3, x4, y4);
        this.paintSize = size;
        this.paintColor = color;
        return this;
    }

    @l
    public final Transaction makeImageTransaction(float x4, float y4, int width, int height, float scale, @l String image) {
        String str;
        l0.p(image, ProtectedSandApp.s("ౡ"));
        make((byte) 12, x4, y4);
        boolean isImageDataNeedUrlEncode = DrawConfigs.INSTANCE.isImageDataNeedUrlEncode();
        String s4 = ProtectedSandApp.s("ౢ");
        if (isImageDataNeedUrlEncode) {
            str = URLEncoder.encode(image, ProtectedSandApp.s("ౣ")) + s4 + width + s4 + height + s4 + scale;
        } else {
            str = image + s4 + width + s4 + height + s4 + scale;
        }
        this.imageBase64 = str;
        return this;
    }

    @l
    public final Transaction makeMoveTransaction(float x4, float y4, int size, int color) {
        make((byte) 2, x4, y4);
        this.paintSize = size;
        this.paintColor = color;
        return this;
    }

    @l
    public final Transaction makeNextTransaction(int index) {
        make((byte) 11, 0.0f, 0.0f);
        return this;
    }

    @l
    public final Transaction makePreviousTransaction(int index) {
        make((byte) 10, 0.0f, 0.0f);
        return this;
    }

    @l
    public final Transaction makeRedoTransaction(@l List<Long> ids) {
        l0.p(ids, ProtectedSandApp.s("\u0c64"));
        make((byte) 5, 0.0f, 0.0f);
        this.targetIds = w.m3(ids, ProtectedSandApp.s("ౢ"), null, null, 0, null, Transaction$makeRedoTransaction$1.INSTANCE, 30, null);
        return this;
    }

    @l
    public final Transaction makeRevokeTransaction(@l List<Long> ids) {
        l0.p(ids, ProtectedSandApp.s("\u0c64"));
        make((byte) 4, 0.0f, 0.0f);
        this.targetIds = w.m3(ids, ProtectedSandApp.s("ౢ"), null, null, 0, null, Transaction$makeRevokeTransaction$1.INSTANCE, 30, null);
        return this;
    }

    @l
    public final Transaction makeScaleTransaction(float sx, float sy) {
        make((byte) 9, sx, sy);
        return this;
    }

    @l
    public final Transaction makeStartTransaction(float x4, float y4, int size, int color) {
        make((byte) 1, x4, y4);
        this.paintSize = size;
        this.paintColor = color;
        return this;
    }

    @l
    public final Transaction makeTranslateTransaction(float tx, float ty) {
        make((byte) 8, tx, ty);
        return this;
    }

    public final void setActionType(int i4) {
        this.actionType = i4;
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

    public final void setStep(byte b5) {
        this.step = b5;
    }

    public final void setTargetIds(@l String str) {
        l0.p(str, ProtectedSandApp.s("\u0c65"));
        this.targetIds = str;
    }

    public final void setTimestamp(long j4) {
        this.timestamp = j4;
    }

    public final void setUserId(@l String str) {
        l0.p(str, ProtectedSandApp.s("\u0c65"));
        this.userId = str;
    }

    public final void setX(float f4) {
        this.x = f4;
    }

    public final void setY(float f4) {
        this.y = f4;
    }

    @l
    public String toString() {
        long j4 = this.id;
        long j5 = this.pageId;
        String str = this.userId;
        long j6 = this.timestamp;
        byte b5 = this.step;
        int i4 = this.no;
        float f4 = this.x;
        float f5 = this.y;
        int i5 = this.paintColor;
        int i6 = this.paintSize;
        int i7 = this.actionType;
        String str2 = this.imageBase64;
        String str3 = this.targetIds;
        StringBuilder a5 = f0.a(ProtectedSandApp.s("౦"), j4, ProtectedSandApp.s("౧"));
        a5.append(j5);
        a5.append(ProtectedSandApp.s("౨"));
        a5.append(str);
        c.a(a5, ProtectedSandApp.s("౩"), j6, ProtectedSandApp.s("౪"));
        androidx.paging.l.a(a5, b5, ProtectedSandApp.s("౫"), i4, ProtectedSandApp.s("౬"));
        a5.append(f4);
        a5.append(ProtectedSandApp.s("౭"));
        a5.append(f5);
        a5.append(ProtectedSandApp.s("౮"));
        androidx.paging.l.a(a5, i5, ProtectedSandApp.s("౯"), i6, ProtectedSandApp.s("\u0c70"));
        androidx.compose.runtime.changelist.c.a(a5, i7, ProtectedSandApp.s("\u0c71"), str2, ProtectedSandApp.s("\u0c72"));
        return android.support.v4.media.c.a(a5, str3, ProtectedSandApp.s("\u0c73"));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel, int flags) {
        l0.p(parcel, ProtectedSandApp.s("\u0c74"));
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
    }

    @j
    public Transaction(long j4) {
        this(j4, 0L, null, 0L, (byte) 0, 0, 0.0f, 0.0f, 0, 0, 0, null, null, 8190, null);
    }

    @l
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Transaction m7clone() {
        try {
            Object clone = super.clone();
            l0.n(clone, ProtectedSandApp.s("ౠ"));
            return (Transaction) clone;
        } catch (Exception e4) {
            e4.printStackTrace();
            return new Transaction(0L, 0L, null, 0L, (byte) 0, 0, 0.0f, 0.0f, 0, 0, 0, null, null, 8191, null);
        }
    }

    @j
    public Transaction(long j4, long j5) {
        this(j4, j5, null, 0L, (byte) 0, 0, 0.0f, 0.0f, 0, 0, 0, null, null, 8188, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public Transaction(long j4, long j5, @l String str) {
        this(j4, j5, str, 0L, (byte) 0, 0, 0.0f, 0.0f, 0, 0, 0, null, null, 8184, null);
        l0.p(str, ProtectedSandApp.s("\u0c5e"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public Transaction(long j4, long j5, @l String str, long j6) {
        this(j4, j5, str, j6, (byte) 0, 0, 0.0f, 0.0f, 0, 0, 0, null, null, 8176, null);
        l0.p(str, ProtectedSandApp.s("\u0c5e"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public Transaction(long j4, long j5, @l String str, long j6, byte b5) {
        this(j4, j5, str, j6, b5, 0, 0.0f, 0.0f, 0, 0, 0, null, null, 8160, null);
        l0.p(str, ProtectedSandApp.s("\u0c5e"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public Transaction(long j4, long j5, @l String str, long j6, byte b5, int i4) {
        this(j4, j5, str, j6, b5, i4, 0.0f, 0.0f, 0, 0, 0, null, null, 8128, null);
        l0.p(str, ProtectedSandApp.s("\u0c5e"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public Transaction(long j4, long j5, @l String str, long j6, byte b5, int i4, float f4) {
        this(j4, j5, str, j6, b5, i4, f4, 0.0f, 0, 0, 0, null, null, 8064, null);
        l0.p(str, ProtectedSandApp.s("\u0c5e"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public Transaction(long j4, long j5, @l String str, long j6, byte b5, int i4, float f4, float f5) {
        this(j4, j5, str, j6, b5, i4, f4, f5, 0, 0, 0, null, null, 7936, null);
        l0.p(str, ProtectedSandApp.s("\u0c5e"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public Transaction(long j4, long j5, @l String str, long j6, byte b5, int i4, float f4, float f5, int i5) {
        this(j4, j5, str, j6, b5, i4, f4, f5, i5, 0, 0, null, null, 7680, null);
        l0.p(str, ProtectedSandApp.s("\u0c5e"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public Transaction(long j4, long j5, @l String str, long j6, byte b5, int i4, float f4, float f5, int i5, int i6) {
        this(j4, j5, str, j6, b5, i4, f4, f5, i5, i6, 0, null, null, 7168, null);
        l0.p(str, ProtectedSandApp.s("\u0c5e"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public Transaction(long j4, long j5, @l String str, long j6, byte b5, int i4, float f4, float f5, int i5, int i6, int i7) {
        this(j4, j5, str, j6, b5, i4, f4, f5, i5, i6, i7, null, null, 6144, null);
        l0.p(str, ProtectedSandApp.s("\u0c5e"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public Transaction(long j4, long j5, @l String str, long j6, byte b5, int i4, float f4, float f5, int i5, int i6, int i7, @m String str2) {
        this(j4, j5, str, j6, b5, i4, f4, f5, i5, i6, i7, str2, null, 4096, null);
        l0.p(str, ProtectedSandApp.s("\u0c5e"));
    }

    @j
    public Transaction(long j4, long j5, @l String str, long j6, byte b5, int i4, float f4, float f5, int i5, int i6, int i7, @m String str2, @l String str3) {
        l0.p(str, ProtectedSandApp.s("\u0c5e"));
        l0.p(str3, ProtectedSandApp.s("\u0c5f"));
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
    }

    public /* synthetic */ Transaction(long j4, long j5, String str, long j6, byte b5, int i4, float f4, float f5, int i5, int i6, int i7, String str2, String str3, int i10, kotlin.jvm.internal.w wVar) {
        this((i10 & 1) != 0 ? 0L : j4, (i10 & 2) != 0 ? 0L : j5, (i10 & 4) != 0 ? "" : str, (i10 & 8) == 0 ? j6 : 0L, (i10 & 16) != 0 ? (byte) 1 : b5, (i10 & 32) != 0 ? -1 : i4, (i10 & 64) != 0 ? 0.0f : f4, (i10 & 128) == 0 ? f5 : 0.0f, (i10 & 256) != 0 ? 0 : i5, (i10 & 512) != 0 ? 5 : i6, (i10 & 1024) != 0 ? 0 : i7, (i10 & 2048) != 0 ? "" : str2, (i10 & 4096) != 0 ? "" : str3);
    }
}
