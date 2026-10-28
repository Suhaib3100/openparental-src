package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.datatransport.cct.a;
import com.google.android.datatransport.m;
import com.google.android.datatransport.runtime.x;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.b0;
import com.google.firebase.components.c;
import com.google.firebase.components.d;
import com.google.firebase.components.r;
import com.google.firebase.platforminfo.h;
import java.util.Arrays;
import java.util.List;
import q9.b;
import q9.e;
import q9.f;
import q9.g;

@Keep
/* loaded from: classes6.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = ProtectedSandApp.s("A\u0001");

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ m lambda$getComponents$0(d dVar) {
        x.f((Context) dVar.a(Context.class));
        return x.c().g(a.f51766k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ m lambda$getComponents$1(d dVar) {
        x.f((Context) dVar.a(Context.class));
        return x.c().g(a.f51766k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ m lambda$getComponents$2(d dVar) {
        x.f((Context) dVar.a(Context.class));
        return x.c().g(a.f51765j);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @o0
    public List<c<?>> getComponents() {
        c.b h4 = c.h(m.class);
        String s4 = ProtectedSandApp.s("A\u0001");
        return Arrays.asList(h4.h(s4).b(r.m(Context.class)).f(new e()).d(), c.f(new b0(b.class, m.class)).b(r.m(Context.class)).f(new f()).d(), c.f(new b0(q9.d.class, m.class)).b(r.m(Context.class)).f(new g()).d(), h.b(s4, ProtectedSandApp.s("B\u0001")));
    }
}
