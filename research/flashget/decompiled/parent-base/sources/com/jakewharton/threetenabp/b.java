package com.jakewharton.threetenabp;

import android.content.Context;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InputStream;
import org.threeten.bp.zone.h;
import org.threeten.bp.zone.i;

/* compiled from: AssetsZoneRulesInitializer.java */
/* loaded from: classes6.dex */
final class b extends h {

    /* renamed from: d, reason: collision with root package name */
    private final Context f64827d;

    /* renamed from: e, reason: collision with root package name */
    private final String f64828e;

    b(Context context, String str) {
        this.f64827d = context;
        this.f64828e = str;
    }

    @Override // org.threeten.bp.zone.h
    protected void b() {
        InputStream inputStream = null;
        try {
            try {
                inputStream = this.f64827d.getAssets().open(this.f64828e);
                org.threeten.bp.zone.c cVar = new org.threeten.bp.zone.c(inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                i.j(cVar);
            } catch (IOException e4) {
                throw new IllegalStateException(this.f64828e + ProtectedSandApp.s("ᑨ\u0001"), e4);
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }
}
