package com.google.android.datatransport.cct.internal;

import androidx.annotation.o0;
import com.google.auto.value.AutoValue;
import j2.a;
import java.util.List;

/* compiled from: BatchedLogRequest.java */
@j2.a
@AutoValue
/* loaded from: classes2.dex */
public abstract class j {
    @o0
    public static j a(@o0 List<m> list) {
        return new d(list);
    }

    @o0
    public static com.google.firebase.encoders.a b() {
        com.google.firebase.encoders.json.e eVar = new com.google.firebase.encoders.json.e();
        b.f12296b.a(eVar);
        return eVar.l(true).j();
    }

    @o0
    @a.InterfaceC0250a(name = "logRequest")
    public abstract List<m> c();
}
