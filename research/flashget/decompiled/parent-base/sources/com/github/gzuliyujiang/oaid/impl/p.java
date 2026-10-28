package com.github.gzuliyujiang.oaid.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.gzuliyujiang.oaid.OAIDException;
import java.util.Objects;

/* compiled from: VivoImpl.java */
/* loaded from: classes5.dex */
class p implements com.github.gzuliyujiang.oaid.h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f50163a;

    public p(Context context) {
        this.f50163a = context;
    }

    @Override // com.github.gzuliyujiang.oaid.h
    public boolean a() {
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        return com.github.gzuliyujiang.oaid.j.t(ProtectedSandApp.s("쎾"), ProtectedSandApp.s("쎿")).equals(ProtectedSandApp.s("쏀"));
    }

    @Override // com.github.gzuliyujiang.oaid.h
    public void b(final com.github.gzuliyujiang.oaid.g getter) {
        String s4 = ProtectedSandApp.s("쏁");
        if (this.f50163a == null || getter == null) {
            return;
        }
        try {
            Cursor query = this.f50163a.getContentResolver().query(Uri.parse(ProtectedSandApp.s("쏂")), null, null, null, null);
            try {
                Objects.requireNonNull(query);
                query.moveToFirst();
                String string = query.getString(query.getColumnIndex(ProtectedSandApp.s("쏃")));
                if (string == null || string.length() == 0) {
                    throw new OAIDException(ProtectedSandApp.s("쏄"));
                }
                com.github.gzuliyujiang.oaid.i.b(s4.concat(string));
                getter.a(string);
                query.close();
            } finally {
            }
        } catch (Exception e4) {
            com.github.gzuliyujiang.oaid.i.b(e4);
            getter.b(e4);
        }
    }
}
