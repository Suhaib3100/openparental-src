package com.google.firebase.remoteconfig.interop.rollouts;

import androidx.annotation.o0;
import com.google.auto.value.AutoValue;
import java.util.Set;

/* compiled from: RolloutsState.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class e {
    @o0
    public static e a(@o0 Set<d> set) {
        return new c(set);
    }

    @o0
    public abstract Set<d> b();
}
