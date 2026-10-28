package com.android.volley.toolbox;

import android.content.Context;
import androidx.annotation.o0;
import com.android.volley.toolbox.j;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;

/* compiled from: Volley.java */
/* loaded from: classes3.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f40980a = ProtectedSandApp.s("ڶ");

    /* compiled from: Volley.java */
    class a implements j.d {

        /* renamed from: a, reason: collision with root package name */
        private File f40981a = null;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f40982b;

        a(Context context) {
            this.f40982b = context;
        }

        @Override // com.android.volley.toolbox.j.d
        public File get() {
            if (this.f40981a == null) {
                this.f40981a = new File(this.f40982b.getCacheDir(), ProtectedSandApp.s("ڵ"));
            }
            return this.f40981a;
        }
    }

    @o0
    public static com.android.volley.o a(Context context) {
        return c(context, null);
    }

    @o0
    private static com.android.volley.o b(Context context, com.android.volley.j jVar) {
        com.android.volley.o oVar = new com.android.volley.o(new j(new a(context.getApplicationContext())), jVar, 4);
        oVar.o();
        return oVar;
    }

    @o0
    public static com.android.volley.o c(Context context, e eVar) {
        return b(context, eVar == null ? new g((e) new p()) : new g(eVar));
    }

    @o0
    @Deprecated
    public static com.android.volley.o d(Context context, o oVar) {
        return oVar == null ? c(context, null) : b(context, new g(oVar));
    }
}
