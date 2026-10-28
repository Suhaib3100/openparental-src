package com.github.gzuliyujiang.oaid.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.github.gzuliyujiang.oaid.OAIDException;
import java.util.Objects;

/* compiled from: VivoImpl.java */
/* loaded from: classes3.dex */
class p implements com.github.gzuliyujiang.oaid.f {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12237a;

    public p(Context context) {
        this.f12237a = context;
    }

    @Override // com.github.gzuliyujiang.oaid.f
    public boolean a() {
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        return com.github.gzuliyujiang.oaid.h.t(ProtectedSandApp.s("Ἲ"), ProtectedSandApp.s("Ἳ")).equals(ProtectedSandApp.s("Ἴ"));
    }

    @Override // com.github.gzuliyujiang.oaid.f
    public void b(final com.github.gzuliyujiang.oaid.e getter) {
        String s5 = ProtectedSandApp.s("Ἵ");
        if (this.f12237a == null || getter == null) {
            return;
        }
        try {
            Cursor query = this.f12237a.getContentResolver().query(Uri.parse(ProtectedSandApp.s("Ἶ")), null, null, null, null);
            try {
                Objects.requireNonNull(query);
                query.moveToFirst();
                String string = query.getString(query.getColumnIndex(ProtectedSandApp.s("Ἷ")));
                if (string == null || string.length() == 0) {
                    throw new OAIDException(ProtectedSandApp.s("ὀ"));
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
