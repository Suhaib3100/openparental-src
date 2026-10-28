package com.google.firebase.remoteconfig;

import androidx.annotation.o0;
import com.google.auto.value.AutoValue;
import java.util.Set;

/* compiled from: ConfigUpdate.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class c {
    @o0
    public static c a(@o0 Set<String> set) {
        return new a(set);
    }

    @o0
    public abstract Set<String> b();
}
