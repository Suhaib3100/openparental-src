package com.github.gzuliyujiang.oaid.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.gzuliyujiang.oaid.OAIDException;
import java.util.Objects;

/* compiled from: MeizuImpl.java */
/* loaded from: classes5.dex */
class i implements com.github.gzuliyujiang.oaid.h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f50150a;

    public i(Context context) {
        this.f50150a = context;
    }

    @Override // com.github.gzuliyujiang.oaid.h
    public boolean a() {
        Context context = this.f50150a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().resolveContentProvider(ProtectedSandApp.s("쎓"), 0) != null;
        } catch (Exception e4) {
            com.github.gzuliyujiang.oaid.i.b(e4);
            return false;
        }
    }

    @Override // com.github.gzuliyujiang.oaid.h
    public void b(final com.github.gzuliyujiang.oaid.g getter) {
        String s4 = ProtectedSandApp.s("쎔");
        if (this.f50150a == null || getter == null) {
            return;
        }
        try {
            Cursor query = this.f50150a.getContentResolver().query(Uri.parse(ProtectedSandApp.s("쎕")), null, null, new String[]{ProtectedSandApp.s("쎖")}, null);
            try {
                Objects.requireNonNull(query);
                query.moveToFirst();
                String string = query.getString(query.getColumnIndex(ProtectedSandApp.s("쎗")));
                if (string == null || string.length() == 0) {
                    throw new OAIDException(ProtectedSandApp.s("쎘"));
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
