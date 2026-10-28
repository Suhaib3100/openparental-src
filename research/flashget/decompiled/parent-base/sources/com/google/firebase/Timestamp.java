package com.google.firebase;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.x0;
import androidx.collection.p0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.time.Instant;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.q0;

/* compiled from: Timestamp.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001&B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bB\u0011\b\u0017\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0013\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010\u001bJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0005H\u0016¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b&\u0010\u001b¨\u0006,"}, d2 = {"Lcom/google/firebase/Timestamp;", "", "Landroid/os/Parcelable;", "", "seconds", "", "nanoseconds", "<init>", "(JI)V", "Ljava/util/Date;", "date", "(Ljava/util/Date;)V", "Ljava/time/Instant;", "time", "(Ljava/time/Instant;)V", "e", "()Ljava/util/Date;", "f", "()Ljava/time/Instant;", "other", "a", "(Lcom/google/firebase/Timestamp;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "Lkotlin/k2;", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "J", "c", "()J", "I", "d", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Timestamp implements Comparable<Timestamp>, Parcelable {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long seconds;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int nanoseconds;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    @fg.l
    @kd.f
    public static final Parcelable.Creator<Timestamp> CREATOR = new a();

    /* compiled from: Timestamp.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/google/firebase/Timestamp$a", "Landroid/os/Parcelable$Creator;", "Lcom/google/firebase/Timestamp;", "Landroid/os/Parcel;", "source", "a", "(Landroid/os/Parcel;)Lcom/google/firebase/Timestamp;", "", "size", "", "b", "(I)[Lcom/google/firebase/Timestamp;", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Timestamp> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Timestamp createFromParcel(@fg.l Parcel source) {
            l0.p(source, ProtectedSandApp.s("\ufa6f"));
            return new Timestamp(source.readLong(), source.readInt());
        }

        @fg.l
        public Timestamp[] b(int size) {
            return new Timestamp[size];
        }

        @Override // android.os.Parcelable.Creator
        public Timestamp[] newArray(int i4) {
            return new Timestamp[i4];
        }
    }

    /* compiled from: Timestamp.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/google/firebase/Timestamp$b;", "", "<init>", "()V", "Ljava/util/Date;", "Lkotlin/q0;", "", "", "d", "(Ljava/util/Date;)Lkotlin/q0;", "seconds", "nanoseconds", "Lkotlin/k2;", "e", "(JI)V", "Lcom/google/firebase/Timestamp;", "c", "()Lcom/google/firebase/Timestamp;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.google.firebase.Timestamp$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final q0<Long, Integer> d(Date date) {
            long j4 = 1000;
            long time = date.getTime() / j4;
            int time2 = (int) ((date.getTime() % j4) * 1000000);
            return time2 < 0 ? new q0<>(Long.valueOf(time - 1), Integer.valueOf(time2 + 1000000000)) : new q0<>(Long.valueOf(time), Integer.valueOf(time2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(long seconds, int nanoseconds) {
            if (nanoseconds < 0 || nanoseconds >= 1000000000) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("况"), nanoseconds).toString());
            }
            if (-62135596800L > seconds || seconds >= 253402300800L) {
                throw new IllegalArgumentException(p0.a(ProtectedSandApp.s("並"), seconds).toString());
            }
        }

        @fg.l
        @kd.n
        public final Timestamp c() {
            return new Timestamp(new Date());
        }

        public Companion(w wVar) {
        }
    }

    public Timestamp(long j4, int i4) {
        INSTANCE.e(j4, i4);
        this.seconds = j4;
        this.nanoseconds = i4;
    }

    @fg.l
    @kd.n
    public static final Timestamp d() {
        return INSTANCE.c();
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@fg.l Timestamp other) {
        l0.p(other, ProtectedSandApp.s("喝"));
        return kotlin.comparisons.a.o(this, other, new g1() { // from class: com.google.firebase.Timestamp.c
            {
                ProtectedSandApp.s("全");
                ProtectedSandApp.s("侀");
            }

            @Override // kotlin.jvm.internal.g1, kotlin.reflect.q
            @fg.m
            public Object get(@fg.m Object obj) {
                return Long.valueOf(((Timestamp) obj).getSeconds());
            }
        }, new g1() { // from class: com.google.firebase.Timestamp.d
            {
                ProtectedSandApp.s("充");
                ProtectedSandApp.s("冀");
            }

            @Override // kotlin.jvm.internal.g1, kotlin.reflect.q
            @fg.m
            public Object get(@fg.m Object obj) {
                return Integer.valueOf(((Timestamp) obj).getNanoseconds());
            }
        });
    }

    /* renamed from: b, reason: from getter */
    public final int getNanoseconds() {
        return this.nanoseconds;
    }

    /* renamed from: c, reason: from getter */
    public final long getSeconds() {
        return this.seconds;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @fg.l
    public final Date e() {
        return new Date((this.seconds * 1000) + (this.nanoseconds / 1000000));
    }

    public boolean equals(@fg.m Object other) {
        return other == this || ((other instanceof Timestamp) && compareTo((Timestamp) other) == 0);
    }

    @fg.l
    @x0(26)
    public final Instant f() {
        Instant ofEpochSecond;
        ofEpochSecond = Instant.ofEpochSecond(this.seconds, this.nanoseconds);
        l0.o(ofEpochSecond, ProtectedSandApp.s("啕"));
        return ofEpochSecond;
    }

    public int hashCode() {
        long j4 = this.seconds;
        return (((((int) j4) * 1369) + ((int) (j4 >> 32))) * 37) + this.nanoseconds;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("喙"));
        sb.append(this.seconds);
        sb.append(ProtectedSandApp.s("嗢"));
        return androidx.view.e.a(sb, this.nanoseconds, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@fg.l Parcel dest, int flags) {
        l0.p(dest, ProtectedSandApp.s("塚"));
        dest.writeLong(this.seconds);
        dest.writeInt(this.nanoseconds);
    }

    public Timestamp(@fg.l Date date) {
        l0.p(date, ProtectedSandApp.s("勺"));
        Companion companion = INSTANCE;
        q0 d5 = companion.d(date);
        long longValue = ((Number) d5.a()).longValue();
        int intValue = ((Number) d5.b()).intValue();
        companion.e(longValue, intValue);
        this.seconds = longValue;
        this.nanoseconds = intValue;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @androidx.annotation.x0(26)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Timestamp(@fg.l java.time.Instant r3) {
        /*
            r2 = this;
            java.lang.String r0 = "勇"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r3, r0)
            long r0 = com.google.firebase.t.a(r3)
            int r3 = com.google.firebase.u.a(r3)
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.Timestamp.<init>(java.time.Instant):void");
    }
}
