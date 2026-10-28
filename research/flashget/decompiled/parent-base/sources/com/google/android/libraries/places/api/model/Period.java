package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.annotation.q0;
import b9.c;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
@c
/* loaded from: classes5.dex */
public abstract class Period implements Parcelable {

    /* compiled from: com.google.android.libraries.places:places@@2.6.0 */
    @c.a
    public static abstract class Builder {
        @RecentlyNonNull
        public abstract Period build();

        @RecentlyNullable
        public abstract TimeOfWeek getClose();

        @RecentlyNullable
        public abstract TimeOfWeek getOpen();

        @RecentlyNonNull
        public abstract Builder setClose(@q0 TimeOfWeek timeOfWeek);

        @RecentlyNonNull
        public abstract Builder setOpen(@q0 TimeOfWeek timeOfWeek);
    }

    @RecentlyNonNull
    public static Builder builder() {
        return new zzm();
    }

    @RecentlyNullable
    public abstract TimeOfWeek getClose();

    @RecentlyNullable
    public abstract TimeOfWeek getOpen();
}
