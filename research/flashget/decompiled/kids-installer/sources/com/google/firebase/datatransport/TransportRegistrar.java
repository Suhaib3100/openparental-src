package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.datatransport.cct.a;
import com.google.android.datatransport.i;
import com.google.android.datatransport.runtime.x;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.c;
import com.google.firebase.components.d;
import com.google.firebase.components.g;
import com.google.firebase.components.r;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.platforminfo.h;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes3.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = ProtectedSandApp.s("⩯");

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i lambda$getComponents$0(d dVar) {
        x.f((Context) dVar.a(Context.class));
        return x.c().g(a.f12259k);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        c.b h5 = c.h(i.class);
        String s5 = ProtectedSandApp.s("⩭");
        return Arrays.asList(h5.h(s5).b(r.m(Context.class)).f(new g() { // from class: g2.c
            @Override // com.google.firebase.components.g
            public final Object a(d dVar) {
                i lambda$getComponents$0;
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(dVar);
                return lambda$getComponents$0;
            }
        }).d(), h.b(s5, ProtectedSandApp.s("⩮")));
    }
}
