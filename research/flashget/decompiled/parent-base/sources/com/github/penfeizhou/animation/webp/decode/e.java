package com.github.penfeizhou.animation.webp.decode;

import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* compiled from: BaseChunk.java */
/* loaded from: classes5.dex */
public class e {

    /* renamed from: d, reason: collision with root package name */
    public static final int f50882d = 8;

    /* renamed from: a, reason: collision with root package name */
    public int f50883a;

    /* renamed from: b, reason: collision with root package name */
    public int f50884b;

    /* renamed from: c, reason: collision with root package name */
    public int f50885c;

    public static int a(String str) {
        if (TextUtils.isEmpty(str) || str.length() != 4) {
            return -1159790593;
        }
        return ((str.charAt(3) & 255) << 24) | (str.charAt(0) & 255) | ((str.charAt(1) & 255) << 8) | ((str.charAt(2) & 255) << 16);
    }

    void b(com.github.penfeizhou.animation.webp.io.a aVar) throws IOException {
    }

    final void c(com.github.penfeizhou.animation.webp.io.a aVar) throws IOException {
        int available = aVar.available();
        b(aVar);
        int available2 = available - aVar.available();
        int i4 = this.f50884b;
        int i5 = i4 + (i4 & 1);
        if (available2 > i5) {
            throw new IOException(ProtectedSandApp.s("쒆"));
        }
        if (available2 < i5) {
            aVar.skip(i5 - available2);
        }
    }
}
