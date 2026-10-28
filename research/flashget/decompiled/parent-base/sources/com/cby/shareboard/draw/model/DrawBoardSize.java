package com.cby.shareboard.draw.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.Objects;
import kd.n;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import oe.d;

/* compiled from: DrawBoardSize.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\nJ\r\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\nJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\nJ\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\nJ \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0016\u0010\u0004\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010 R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010 ¨\u0006\""}, d2 = {"Lcom/cby/shareboard/draw/model/DrawBoardSize;", "Landroid/os/Parcelable;", "", "maxWidth", "maxHeight", "displayWidth", "displayHeight", "<init>", "(IIII)V", "getMaxWidth", "()I", "getMaxHeight", "getDisplayWidth", "getDisplayHeight", "", "aspectRatio", "()F", "", "hasZero", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/k2;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "Companion", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes3.dex */
public final class DrawBoardSize implements Parcelable {
    private int displayHeight;
    private int displayWidth;
    private int maxHeight;
    private int maxWidth;

    /* renamed from: Companion, reason: from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion(null);

    @l
    public static final Parcelable.Creator<DrawBoardSize> CREATOR = new Creator();

    @l
    private static final DrawBoardSize ZERO = new DrawBoardSize(0, 0, 0, 0);

    /* compiled from: DrawBoardSize.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/cby/shareboard/draw/model/DrawBoardSize$Companion;", "", "()V", "ZERO", "Lcom/cby/shareboard/draw/model/DrawBoardSize;", "getZERO$annotations", "getZERO", "()Lcom/cby/shareboard/draw/model/DrawBoardSize;", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @n
        public static /* synthetic */ void getZERO$annotations() {
        }

        @l
        public final DrawBoardSize getZERO() {
            return DrawBoardSize.ZERO;
        }

        private Companion() {
        }
    }

    /* compiled from: DrawBoardSize.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DrawBoardSize> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @l
        public final DrawBoardSize createFromParcel(@l Parcel parcel) {
            l0.p(parcel, ProtectedSandApp.s("ୟ"));
            return new DrawBoardSize(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @l
        public final DrawBoardSize[] newArray(int i4) {
            return new DrawBoardSize[i4];
        }
    }

    public DrawBoardSize() {
        this(0, 0, 0, 0, 15, null);
    }

    @l
    public static final DrawBoardSize getZERO() {
        return INSTANCE.getZERO();
    }

    public final float aspectRatio() {
        int i4 = this.displayWidth;
        int i5 = this.displayHeight;
        if (i4 * i5 == 0) {
            return 1.0f;
        }
        return i4 / i5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@m Object other) {
        if (this == other) {
            return true;
        }
        if (!l0.g(DrawBoardSize.class, other != null ? other.getClass() : null)) {
            return false;
        }
        l0.n(other, ProtectedSandApp.s("ୠ"));
        DrawBoardSize drawBoardSize = (DrawBoardSize) other;
        return this.maxWidth == drawBoardSize.getMaxWidth() && this.maxHeight == drawBoardSize.getMaxHeight() && this.displayWidth == drawBoardSize.getDisplayWidth() && this.displayHeight == drawBoardSize.getDisplayHeight();
    }

    public final int getDisplayHeight() {
        return this.displayHeight;
    }

    public final int getDisplayWidth() {
        return this.displayWidth;
    }

    public final int getMaxHeight() {
        return this.maxHeight;
    }

    public final int getMaxWidth() {
        return this.maxWidth;
    }

    public final boolean hasZero() {
        return this.maxWidth == 0 || this.maxHeight == 0 || this.displayWidth == 0 || this.displayHeight == 0;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.maxWidth), Integer.valueOf(this.maxHeight), Integer.valueOf(this.displayWidth), Integer.valueOf(this.displayHeight));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel, int flags) {
        l0.p(parcel, ProtectedSandApp.s("ୡ"));
        parcel.writeInt(this.maxWidth);
        parcel.writeInt(this.maxHeight);
        parcel.writeInt(this.displayWidth);
        parcel.writeInt(this.displayHeight);
    }

    public DrawBoardSize(int i4, int i5, int i6, int i7) {
        this.maxWidth = i4;
        this.maxHeight = i5;
        this.displayWidth = i6;
        this.displayHeight = i7;
    }

    public /* synthetic */ DrawBoardSize(int i4, int i5, int i6, int i7, int i10, w wVar) {
        this((i10 & 1) != 0 ? 0 : i4, (i10 & 2) != 0 ? 0 : i5, (i10 & 4) != 0 ? 0 : i6, (i10 & 8) != 0 ? 0 : i7);
    }
}
