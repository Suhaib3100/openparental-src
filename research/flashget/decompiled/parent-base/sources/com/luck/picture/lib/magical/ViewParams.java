package com.luck.picture.lib.magical;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public class ViewParams implements Parcelable {
    public static final Parcelable.Creator<ViewParams> CREATOR = new Parcelable.Creator<ViewParams>() { // from class: com.luck.picture.lib.magical.ViewParams.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ViewParams createFromParcel(Parcel parcel) {
            return new ViewParams(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ViewParams[] newArray(int i4) {
            return new ViewParams[i4];
        }
    };
    public int height;
    public int left;

    /* renamed from: top, reason: collision with root package name */
    public int f67067top;
    public int width;

    public ViewParams() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getHeight() {
        return this.height;
    }

    public int getLeft() {
        return this.left;
    }

    public int getTop() {
        return this.f67067top;
    }

    public int getWidth() {
        return this.width;
    }

    public void setHeight(int i4) {
        this.height = i4;
    }

    public void setLeft(int i4) {
        this.left = i4;
    }

    public void setTop(int i4) {
        this.f67067top = i4;
    }

    public void setWidth(int i4) {
        this.width = i4;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.left);
        parcel.writeInt(this.f67067top);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }

    protected ViewParams(Parcel parcel) {
        this.left = parcel.readInt();
        this.f67067top = parcel.readInt();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
    }
}
