package android.view.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class ActivityResult implements Parcelable {

    @o0
    public static final Parcelable.Creator<ActivityResult> CREATOR = new a();

    /* renamed from: o, reason: collision with root package name */
    private final int f100o;

    /* renamed from: p, reason: collision with root package name */
    @q0
    private final Intent f101p;

    class a implements Parcelable.Creator<ActivityResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ActivityResult createFromParcel(@o0 Parcel parcel) {
            return new ActivityResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ActivityResult[] newArray(int i5) {
            return new ActivityResult[i5];
        }
    }

    public ActivityResult(int i5, @q0 Intent intent) {
        this.f100o = i5;
        this.f101p = intent;
    }

    @o0
    public static String c(int i5) {
        return i5 != -1 ? i5 != 0 ? String.valueOf(i5) : "RESULT_CANCELED" : "RESULT_OK";
    }

    @q0
    public Intent a() {
        return this.f101p;
    }

    public int b() {
        return this.f100o;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + c(this.f100o) + ", data=" + this.f101p + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i5) {
        parcel.writeInt(this.f100o);
        parcel.writeInt(this.f101p == null ? 0 : 1);
        Intent intent = this.f101p;
        if (intent != null) {
            intent.writeToParcel(parcel, i5);
        }
    }

    ActivityResult(Parcel parcel) {
        this.f100o = parcel.readInt();
        this.f101p = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
