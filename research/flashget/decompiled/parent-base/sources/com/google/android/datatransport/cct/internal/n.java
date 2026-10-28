package com.google.android.datatransport.cct.internal;

import androidx.annotation.o0;
import java.util.List;
import t9.a;

/* compiled from: BatchedLogRequest.java */
@t9.a
@b9.c
/* loaded from: classes5.dex */
public abstract class n {
    @o0
    public static n a(@o0 List<u> list) {
        return new d(list);
    }

    @o0
    public static com.google.firebase.encoders.a b() {
        com.google.firebase.encoders.json.e eVar = new com.google.firebase.encoders.json.e();
        b.f51803b.a(eVar);
        return eVar.l(true).j();
    }

    @a.InterfaceC1396a(name = "logRequest")
    @o0
    public abstract List<u> c();
}
