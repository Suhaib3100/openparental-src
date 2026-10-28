package com.google.common.io;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* compiled from: LineBuffer.java */
@p
@d9.c
/* loaded from: classes6.dex */
abstract class v {

    /* renamed from: a, reason: collision with root package name */
    private StringBuilder f57168a = new StringBuilder();

    /* renamed from: b, reason: collision with root package name */
    private boolean f57169b;

    v() {
    }

    @f9.a
    private boolean c(boolean z4) throws IOException {
        d(this.f57168a.toString(), this.f57169b ? z4 ? ProtectedSandApp.s("\uf6d7") : ProtectedSandApp.s("\uf6d8") : z4 ? ProtectedSandApp.s("\uf6d9") : "");
        this.f57168a = new StringBuilder();
        this.f57169b = false;
        return z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void a(char[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            boolean r0 = r6.f57169b
            r1 = 0
            r2 = 10
            r3 = 1
            if (r0 == 0) goto L1a
            if (r9 <= 0) goto L1a
            char r0 = r7[r8]
            if (r0 != r2) goto L10
            r0 = r3
            goto L11
        L10:
            r0 = r1
        L11:
            boolean r0 = r6.c(r0)
            if (r0 == 0) goto L1a
            int r0 = r8 + 1
            goto L1b
        L1a:
            r0 = r8
        L1b:
            int r8 = r8 + r9
            r9 = r0
        L1d:
            if (r0 >= r8) goto L53
            char r4 = r7[r0]
            if (r4 == r2) goto L46
            r5 = 13
            if (r4 == r5) goto L28
            goto L51
        L28:
            java.lang.StringBuilder r4 = r6.f57168a
            int r5 = r0 - r9
            r4.append(r7, r9, r5)
            r6.f57169b = r3
            int r9 = r0 + 1
            if (r9 >= r8) goto L43
            char r4 = r7[r9]
            if (r4 != r2) goto L3b
            r4 = r3
            goto L3c
        L3b:
            r4 = r1
        L3c:
            boolean r4 = r6.c(r4)
            if (r4 == 0) goto L43
            r0 = r9
        L43:
            int r9 = r0 + 1
            goto L51
        L46:
            java.lang.StringBuilder r4 = r6.f57168a
            int r5 = r0 - r9
            r4.append(r7, r9, r5)
            r6.c(r3)
            goto L43
        L51:
            int r0 = r0 + r3
            goto L1d
        L53:
            java.lang.StringBuilder r0 = r6.f57168a
            int r8 = r8 - r9
            r0.append(r7, r9, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.io.v.a(char[], int, int):void");
    }

    protected void b() throws IOException {
        if (this.f57169b || this.f57168a.length() > 0) {
            c(false);
        }
    }

    protected abstract void d(String str, String str2) throws IOException;
}
