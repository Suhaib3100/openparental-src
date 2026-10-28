package android.view.result;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class IntentSenderRequest implements Parcelable {

    @o0
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new a();

    /* renamed from: o, reason: collision with root package name */
    @o0
    private final IntentSender f131o;

    /* renamed from: p, reason: collision with root package name */
    @q0
    private final Intent f132p;

    /* renamed from: q, reason: collision with root package name */
    private final int f133q;

    /* renamed from: r, reason: collision with root package name */
    private final int f134r;

    class a implements Parcelable.Creator<IntentSenderRequest> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public IntentSenderRequest createFromParcel(Parcel parcel) {
            return new IntentSenderRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public IntentSenderRequest[] newArray(int i5) {
            return new IntentSenderRequest[i5];
        }
    }

    IntentSenderRequest(@o0 IntentSender intentSender, @q0 Intent intent, int i5, int i6) {
        this.f131o = intentSender;
        this.f132p = intent;
        this.f133q = i5;
        this.f134r = i6;
    }

    @q0
    public Intent a() {
        return this.f132p;
    }

    public int b() {
        return this.f133q;
    }

    public int c() {
        return this.f134r;
    }

    @o0
    public IntentSender d() {
        return this.f131o;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i5) {
        parcel.writeParcelable(this.f131o, i5);
        parcel.writeParcelable(this.f132p, i5);
        parcel.writeInt(this.f133q);
        parcel.writeInt(this.f134r);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private IntentSender f135a;

        /* renamed from: b, reason: collision with root package name */
        private Intent f136b;

        /* renamed from: c, reason: collision with root package name */
        private int f137c;

        /* renamed from: d, reason: collision with root package name */
        private int f138d;

        public b(@o0 IntentSender intentSender) {
            this.f135a = intentSender;
        }

        @o0
        public IntentSenderRequest a() {
            return new IntentSenderRequest(this.f135a, this.f136b, this.f137c, this.f138d);
        }

        @o0
        public b b(@q0 Intent intent) {
            this.f136b = intent;
            return this;
        }

        @o0
        public b c(int i5, int i6) {
            this.f138d = i5;
            this.f137c = i6;
            return this;
        }

        public b(@o0 PendingIntent pendingIntent) {
            this(pendingIntent.getIntentSender());
        }
    }

    IntentSenderRequest(@o0 Parcel parcel) {
        this.f131o = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f132p = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f133q = parcel.readInt();
        this.f134r = parcel.readInt();
    }
}
