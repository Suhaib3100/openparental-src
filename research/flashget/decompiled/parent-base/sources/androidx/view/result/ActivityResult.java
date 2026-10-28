package androidx.view.result;

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

    /* renamed from: b, reason: collision with root package name */
    private final int f575b;

    /* renamed from: c, reason: collision with root package name */
    @q0
    private final Intent f576c;

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
        public ActivityResult[] newArray(int i4) {
            return new ActivityResult[i4];
        }
    }

    public ActivityResult(int i4, @q0 Intent intent) {
        this.f575b = i4;
        this.f576c = intent;
    }

    @o0
    public static String c(int i4) {
        return i4 != -1 ? i4 != 0 ? String.valueOf(i4) : "RESULT_CANCELED" : "RESULT_OK";
    }

    @q0
    public Intent a() {
        return this.f576c;
    }

    public int b() {
        return this.f575b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + c(this.f575b) + ", data=" + this.f576c + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        parcel.writeInt(this.f575b);
        parcel.writeInt(this.f576c == null ? 0 : 1);
        Intent intent = this.f576c;
        if (intent != null) {
            intent.writeToParcel(parcel, i4);
        }
    }

    ActivityResult(Parcel parcel) {
        this.f575b = parcel.readInt();
        this.f576c = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
