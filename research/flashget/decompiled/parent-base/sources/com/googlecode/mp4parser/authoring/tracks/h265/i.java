package com.googlecode.mp4parser.authoring.tracks.h265;

import androidx.collection.q2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;

/* compiled from: VideoParameterSet.java */
/* loaded from: classes6.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    ByteBuffer f63692a;

    /* renamed from: b, reason: collision with root package name */
    int f63693b;

    public i(ByteBuffer byteBuffer) throws IOException {
        String s4;
        this.f63692a = byteBuffer;
        com.googlecode.mp4parser.h264.read.b bVar = new com.googlecode.mp4parser.h264.read.b(Channels.newInputStream(new com.googlecode.mp4parser.util.b((ByteBuffer) byteBuffer.position(0))));
        this.f63693b = (int) bVar.s(4, ProtectedSandApp.s("ฬ\u0001"));
        bVar.s(2, ProtectedSandApp.s("อ\u0001"));
        bVar.s(6, ProtectedSandApp.s("ฮ\u0001"));
        int s5 = (int) bVar.s(3, ProtectedSandApp.s("ฯ\u0001"));
        bVar.p(ProtectedSandApp.s("ะ\u0001"));
        bVar.s(16, ProtectedSandApp.s("ั\u0001"));
        b(s5, bVar);
        boolean p4 = bVar.p(ProtectedSandApp.s("า\u0001"));
        int[] iArr = new int[p4 ? 1 : s5 + 1];
        int[] iArr2 = new int[p4 ? 1 : s5 + 1];
        int[] iArr3 = new int[p4 ? 1 : s5 + 1];
        int i4 = p4 ? 0 : s5;
        while (true) {
            s4 = ProtectedSandApp.s("ำ\u0001");
            if (i4 > s5) {
                break;
            }
            String s6 = ProtectedSandApp.s("โ\u0001");
            iArr[i4] = d.a(s6, i4, s4, bVar);
            iArr2[i4] = d.a(s6, i4, s4, bVar);
            iArr3[i4] = d.a(s6, i4, s4, bVar);
            i4++;
        }
        int s7 = (int) bVar.s(6, ProtectedSandApp.s("ิ\u0001"));
        int y4 = bVar.y(ProtectedSandApp.s("ี\u0001"));
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, y4, s7);
        for (int i5 = 1; i5 <= y4; i5++) {
            for (int i6 = 0; i6 <= s7; i6++) {
                zArr[i5][i6] = bVar.p(q2.a(ProtectedSandApp.s("เ\u0001"), i5, ProtectedSandApp.s("แ\u0001"), i6, s4));
            }
        }
        if (bVar.p(ProtectedSandApp.s("ึ\u0001"))) {
            bVar.s(32, ProtectedSandApp.s("ื\u0001"));
            bVar.s(32, ProtectedSandApp.s("ุ\u0001"));
            if (bVar.p(ProtectedSandApp.s("ู\u0001"))) {
                bVar.y(ProtectedSandApp.s("ฺ\u0001"));
            }
            int y5 = bVar.y(ProtectedSandApp.s("\u0e3b\u0001"));
            int[] iArr4 = new int[y5];
            boolean[] zArr2 = new boolean[y5];
            for (int i7 = 0; i7 < y5; i7++) {
                iArr4[i7] = d.a(ProtectedSandApp.s("\u0e3c\u0001"), i7, s4, bVar);
                if (i7 > 0) {
                    zArr2[i7] = com.googlecode.mp4parser.authoring.tracks.h264.d.a(ProtectedSandApp.s("\u0e3d\u0001"), i7, s4, bVar);
                } else {
                    zArr2[0] = true;
                }
                a(zArr2[i7], s5, bVar);
            }
        }
        if (bVar.p(ProtectedSandApp.s("\u0e3e\u0001"))) {
            while (bVar.f()) {
                bVar.p(ProtectedSandApp.s("฿\u0001"));
            }
        }
        bVar.v();
    }

    private void a(boolean z4, int i4, com.googlecode.mp4parser.h264.read.b bVar) throws IOException {
        boolean z5;
        boolean z6;
        boolean z7;
        if (z4) {
            z5 = bVar.p(ProtectedSandApp.s("ใ\u0001"));
            z6 = bVar.p(ProtectedSandApp.s("ไ\u0001"));
            if (z5 || z6) {
                z7 = bVar.p(ProtectedSandApp.s("ๅ\u0001"));
                if (z7) {
                    bVar.w(8, ProtectedSandApp.s("ๆ\u0001"));
                    bVar.w(5, ProtectedSandApp.s("็\u0001"));
                    bVar.p(ProtectedSandApp.s("่\u0001"));
                    bVar.w(5, ProtectedSandApp.s("้\u0001"));
                }
                bVar.w(4, ProtectedSandApp.s("๊\u0001"));
                bVar.w(4, ProtectedSandApp.s("๋\u0001"));
                if (z7) {
                    bVar.w(4, ProtectedSandApp.s("์\u0001"));
                }
                bVar.w(5, ProtectedSandApp.s("ํ\u0001"));
                bVar.w(5, ProtectedSandApp.s("๎\u0001"));
                bVar.w(5, ProtectedSandApp.s("๏\u0001"));
            } else {
                z7 = false;
            }
        } else {
            z5 = false;
            z6 = false;
            z7 = false;
        }
        boolean[] zArr = new boolean[i4];
        boolean[] zArr2 = new boolean[i4];
        boolean[] zArr3 = new boolean[i4];
        int[] iArr = new int[i4];
        int[] iArr2 = new int[i4];
        for (int i5 = 0; i5 <= i4; i5++) {
            String s4 = ProtectedSandApp.s("๐\u0001");
            String s5 = ProtectedSandApp.s("ำ\u0001");
            boolean a5 = com.googlecode.mp4parser.authoring.tracks.h264.d.a(s4, i5, s5, bVar);
            zArr[i5] = a5;
            if (!a5) {
                zArr2[i5] = com.googlecode.mp4parser.authoring.tracks.h264.d.a(ProtectedSandApp.s("๑\u0001"), i5, s5, bVar);
            }
            if (zArr2[i5]) {
                iArr2[i5] = d.a(ProtectedSandApp.s("๒\u0001"), i5, s5, bVar);
            } else {
                zArr3[i5] = com.googlecode.mp4parser.authoring.tracks.h264.d.a(ProtectedSandApp.s("๓\u0001"), i5, s5, bVar);
            }
            if (!zArr3[i5]) {
                iArr[i5] = d.a(ProtectedSandApp.s("๔\u0001"), i5, s5, bVar);
            }
            if (z5) {
                c(i5, iArr[i5], z7, bVar);
            }
            if (z6) {
                c(i5, iArr[i5], z7, bVar);
            }
        }
    }

    public void b(int i4, com.googlecode.mp4parser.h264.read.b bVar) throws IOException {
        String s4;
        int i5 = i4;
        int i6 = 2;
        bVar.w(2, ProtectedSandApp.s("๕\u0001"));
        bVar.p(ProtectedSandApp.s("๖\u0001"));
        bVar.w(5, ProtectedSandApp.s("๗\u0001"));
        int i7 = 32;
        boolean[] zArr = new boolean[32];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            s4 = ProtectedSandApp.s("ำ\u0001");
            if (i11 >= i7) {
                break;
            }
            zArr[i11] = com.googlecode.mp4parser.authoring.tracks.h264.d.a(ProtectedSandApp.s("\u0e6b\u0001"), i11, s4, bVar);
            i11++;
            i5 = i4;
            i7 = 32;
            i6 = 2;
            i10 = 0;
        }
        bVar.p(ProtectedSandApp.s("๘\u0001"));
        bVar.p(ProtectedSandApp.s("๙\u0001"));
        bVar.p(ProtectedSandApp.s("๚\u0001"));
        bVar.p(ProtectedSandApp.s("๛\u0001"));
        bVar.w(44, ProtectedSandApp.s("\u0e5c\u0001"));
        bVar.w(8, ProtectedSandApp.s("\u0e5d\u0001"));
        boolean[] zArr2 = new boolean[i5];
        boolean[] zArr3 = new boolean[i5];
        int i12 = i10;
        while (i12 < i5) {
            zArr2[i12] = com.googlecode.mp4parser.authoring.tracks.h264.d.a(ProtectedSandApp.s("\u0e69\u0001"), i12, s4, bVar);
            zArr3[i12] = com.googlecode.mp4parser.authoring.tracks.h264.d.a(ProtectedSandApp.s("\u0e6a\u0001"), i12, s4, bVar);
            i12++;
            i5 = i4;
            i7 = 32;
            i6 = 2;
            i10 = 0;
        }
        if (i5 > 0) {
            for (int i13 = i5; i13 < 8; i13++) {
                bVar.w(i6, ProtectedSandApp.s("\u0e5e\u0001"));
            }
        }
        int[] iArr = new int[i5];
        boolean[] zArr4 = new boolean[i5];
        int[] iArr2 = new int[i5];
        int[] iArr3 = new int[i6];
        iArr3[1] = i7;
        iArr3[i10] = i5;
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, iArr3);
        boolean[] zArr6 = new boolean[i5];
        boolean[] zArr7 = new boolean[i5];
        boolean[] zArr8 = new boolean[i5];
        boolean[] zArr9 = new boolean[i5];
        int[] iArr4 = new int[i5];
        int i14 = 0;
        while (i14 < i5) {
            if (zArr2[i14]) {
                iArr[i14] = bVar.w(2, ProtectedSandApp.s("\u0e5f\u0001") + i14 + s4);
                zArr4[i14] = com.googlecode.mp4parser.authoring.tracks.h264.d.a(ProtectedSandApp.s("\u0e60\u0001"), i14, s4, bVar);
                iArr2[i14] = bVar.w(5, ProtectedSandApp.s("\u0e61\u0001") + i14 + s4);
                int i15 = 0;
                for (int i16 = 32; i15 < i16; i16 = 32) {
                    zArr5[i14][i15] = bVar.p(q2.a(ProtectedSandApp.s("\u0e67\u0001"), i14, ProtectedSandApp.s("แ\u0001"), i15, s4));
                    i15++;
                    zArr6 = zArr6;
                }
                zArr6[i14] = com.googlecode.mp4parser.authoring.tracks.h264.d.a(ProtectedSandApp.s("\u0e62\u0001"), i14, s4, bVar);
                zArr7[i14] = com.googlecode.mp4parser.authoring.tracks.h264.d.a(ProtectedSandApp.s("\u0e63\u0001"), i14, s4, bVar);
                zArr8[i14] = com.googlecode.mp4parser.authoring.tracks.h264.d.a(ProtectedSandApp.s("\u0e64\u0001"), i14, s4, bVar);
                zArr9[i14] = com.googlecode.mp4parser.authoring.tracks.h264.d.a(ProtectedSandApp.s("\u0e65\u0001"), i14, s4, bVar);
                bVar.s(44, ProtectedSandApp.s("\u0e66\u0001"));
            }
            boolean[] zArr10 = zArr6;
            if (zArr3[i14]) {
                iArr4[i14] = bVar.w(8, ProtectedSandApp.s("\u0e68\u0001"));
            }
            i14++;
            i5 = i4;
            zArr6 = zArr10;
        }
    }

    void c(int i4, int i5, boolean z4, com.googlecode.mp4parser.h264.read.b bVar) throws IOException {
        int[] iArr = new int[i5];
        int[] iArr2 = new int[i5];
        int[] iArr3 = new int[i5];
        int[] iArr4 = new int[i5];
        boolean[] zArr = new boolean[i5];
        for (int i6 = 0; i6 <= i5; i6++) {
            String s4 = ProtectedSandApp.s("\u0e6c\u0001");
            String s5 = ProtectedSandApp.s("ำ\u0001");
            iArr[i6] = d.a(s4, i6, s5, bVar);
            iArr2[i6] = d.a(ProtectedSandApp.s("\u0e6d\u0001"), i6, s5, bVar);
            if (z4) {
                iArr3[i6] = d.a(ProtectedSandApp.s("\u0e6e\u0001"), i6, s5, bVar);
                iArr4[i6] = d.a(ProtectedSandApp.s("\u0e6f\u0001"), i6, s5, bVar);
            }
            zArr[i6] = com.googlecode.mp4parser.authoring.tracks.h264.d.a(ProtectedSandApp.s("\u0e70\u0001"), i6, s5, bVar);
        }
    }

    public ByteBuffer d() {
        return this.f63692a;
    }
}
