package com.google.firebase.platforminfo;

import com.google.auto.value.AutoValue;
import javax.annotation.Nonnull;

/* compiled from: LibraryVersion.java */
@AutoValue
/* loaded from: classes2.dex */
abstract class f {
    f() {
    }

    static f a(String str, String str2) {
        return new a(str, str2);
    }

    @Nonnull
    public abstract String b();

    @Nonnull
    public abstract String c();
}
