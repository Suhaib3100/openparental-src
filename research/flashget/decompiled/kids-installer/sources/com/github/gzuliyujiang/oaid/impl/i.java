package com.github.gzuliyujiang.oaid.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.github.gzuliyujiang.oaid.OAIDException;
import java.util.Objects;

/* compiled from: MeizuImpl.java */
/* loaded from: classes3.dex */
class i implements com.github.gzuliyujiang.oaid.f {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12224a;

    public i(Context context) {
        this.f12224a = context;
    }

    @Override // com.github.gzuliyujiang.oaid.f
    public boolean a() {
        Context context = this.f12224a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().resolveContentProvider(ProtectedSandApp.s("ἕ"), 0) != null;
        } catch (Exception e6) {
            com.github.gzuliyujiang.oaid.g.b(e6);
            return false;
        }
    }

    @Override // com.github.gzuliyujiang.oaid.f
    public void b(final com.github.gzuliyujiang.oaid.e getter) {
        String s5 = ProtectedSandApp.s("\u1f16");
        if (this.f12224a == null || getter == null) {
            return;
        }
        try {
            Cursor query = this.f12224a.getContentResolver().query(Uri.parse(ProtectedSandApp.s("\u1f17")), null, null, new String[]{ProtectedSandApp.s("Ἐ")}, null);
            try {
                Objects.requireNonNull(query);
                query.moveToFirst();
                String string = query.getString(query.getColumnIndex(ProtectedSandApp.s("Ἑ")));
                if (string == null || string.length() == 0) {
                    throw new OAIDException(ProtectedSandApp.s("Ἒ"));
                }
                com.github.gzuliyujiang.oaid.g.b(s5.concat(string));
                getter.a(string);
                query.close();
            } finally {
            }
        } catch (Exception e6) {
            com.github.gzuliyujiang.oaid.g.b(e6);
            getter.b(e6);
        }
    }
}
