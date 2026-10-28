package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.c;
import com.google.firebase.components.d;
import com.google.firebase.components.r;
import com.google.firebase.platforminfo.h;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes6.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = ProtectedSandApp.s("歹");

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a lambda$getComponents$0(d dVar) {
        return new a((Context) dVar.a(Context.class), dVar.i(com.google.firebase.analytics.connector.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        c.b h4 = c.h(a.class);
        String s4 = ProtectedSandApp.s("歹");
        return Arrays.asList(h4.h(s4).b(r.m(Context.class)).b(r.k(com.google.firebase.analytics.connector.a.class)).f(new b()).d(), h.b(s4, ProtectedSandApp.s("殺")));
    }
}
