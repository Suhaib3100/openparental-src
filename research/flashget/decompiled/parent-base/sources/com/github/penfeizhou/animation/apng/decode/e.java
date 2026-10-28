package com.github.penfeizhou.animation.apng.decode;

import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* compiled from: Chunk.java */
/* loaded from: classes5.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    int f50723a;

    /* renamed from: b, reason: collision with root package name */
    int f50724b;

    /* renamed from: c, reason: collision with root package name */
    int f50725c;

    /* renamed from: d, reason: collision with root package name */
    int f50726d;

    e() {
    }

    static int a(String str) {
        if (TextUtils.isEmpty(str) || str.length() != 4) {
            return -1159790593;
        }
        return ((str.charAt(3) & 255) << 24) | (str.charAt(0) & 255) | ((str.charAt(1) & 255) << 8) | ((str.charAt(2) & 255) << 16);
    }

    void b(com.github.penfeizhou.animation.apng.io.a aVar) throws IOException {
    }

    void c(com.github.penfeizhou.animation.apng.io.a aVar) throws IOException {
        int available = aVar.available();
        b(aVar);
        int available2 = available - aVar.available();
        int i4 = this.f50723a;
        if (available2 > i4) {
            throw new IOException(ProtectedSandApp.s("쑨"));
        }
        if (available2 < i4) {
            aVar.skip(i4 - available2);
        }
    }
}
