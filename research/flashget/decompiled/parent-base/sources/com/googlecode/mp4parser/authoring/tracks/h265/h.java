package com.googlecode.mp4parser.authoring.tracks.h265;

import androidx.collection.q2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;

/* compiled from: SequenceParameterSetRbsp.java */
/* loaded from: classes6.dex */
public class h {
    public h(InputStream inputStream) throws IOException {
        com.googlecode.mp4parser.h264.read.b bVar = new com.googlecode.mp4parser.h264.read.b(inputStream);
        bVar.s(4, ProtectedSandApp.s("ෲ\u0001"));
        int s4 = (int) bVar.s(3, ProtectedSandApp.s("ෳ\u0001"));
        bVar.p(ProtectedSandApp.s("෴\u0001"));
        a(s4, bVar);
        bVar.y(ProtectedSandApp.s("\u0df5\u0001"));
        if (bVar.y(ProtectedSandApp.s("\u0df6\u0001")) == 3) {
            bVar.h();
            String s5 = ProtectedSandApp.s("\u0df7\u0001");
            bVar.y(s5);
            bVar.y(s5);
            if (bVar.p(ProtectedSandApp.s("\u0df8\u0001"))) {
                bVar.y(ProtectedSandApp.s("\u0df9\u0001"));
                bVar.y(ProtectedSandApp.s("\u0dfa\u0001"));
                bVar.y(ProtectedSandApp.s("\u0dfb\u0001"));
                bVar.y(ProtectedSandApp.s("\u0dfc\u0001"));
            }
        }
        bVar.y(ProtectedSandApp.s("\u0dfd\u0001"));
        bVar.y(ProtectedSandApp.s("\u0dfe\u0001"));
        bVar.y(ProtectedSandApp.s("\u0dff\u0001"));
        boolean p4 = bVar.p(ProtectedSandApp.s("\u0e00\u0001"));
        int i4 = (s4 - (p4 ? 0 : s4)) + 1;
        int[] iArr = new int[i4];
        int[] iArr2 = new int[i4];
        int[] iArr3 = new int[i4];
        for (int i5 = p4 ? 0 : s4; i5 <= s4; i5++) {
            String s6 = ProtectedSandApp.s("ฏ\u0001");
            String s7 = ProtectedSandApp.s("ฐ\u0001");
            iArr[i5] = d.a(s6, i5, s7, bVar);
            iArr2[i5] = d.a(ProtectedSandApp.s("ฑ\u0001"), i5, s7, bVar);
            iArr3[i5] = d.a(ProtectedSandApp.s("ฒ\u0001"), i5, s7, bVar);
        }
        bVar.y(ProtectedSandApp.s("ก\u0001"));
        bVar.y(ProtectedSandApp.s("ข\u0001"));
        bVar.y(ProtectedSandApp.s("ฃ\u0001"));
        bVar.y(ProtectedSandApp.s("ค\u0001"));
        bVar.y(ProtectedSandApp.s("ฅ\u0001"));
        bVar.y(ProtectedSandApp.s("ฆ\u0001"));
        if (bVar.p(ProtectedSandApp.s("ง\u0001")) && bVar.p(ProtectedSandApp.s("จ\u0001"))) {
            b(bVar);
        }
        bVar.p(ProtectedSandApp.s("ฉ\u0001"));
        bVar.p(ProtectedSandApp.s("ช\u0001"));
        if (bVar.p(ProtectedSandApp.s("ซ\u0001"))) {
            bVar.s(4, ProtectedSandApp.s("ฌ\u0001"));
            bVar.s(4, ProtectedSandApp.s("ญ\u0001"));
            bVar.y(ProtectedSandApp.s("ฎ\u0001"));
        }
    }

    private void a(int i4, com.googlecode.mp4parser.h264.read.b bVar) throws IOException {
        String s4;
        long[] jArr;
        boolean[] zArr;
        int i5 = i4;
        int i6 = 2;
        bVar.w(2, ProtectedSandApp.s("ณ\u0001"));
        bVar.p(ProtectedSandApp.s("ด\u0001"));
        bVar.w(5, ProtectedSandApp.s("ต\u0001"));
        int i7 = 32;
        boolean[] zArr2 = new boolean[32];
        int i10 = 0;
        int i11 = 0;
        while (i11 < i7) {
            zArr2[i11] = bVar.i();
            i11++;
            i5 = i4;
            i7 = 32;
            i6 = 2;
            i10 = 0;
        }
        bVar.p(ProtectedSandApp.s("ถ\u0001"));
        bVar.p(ProtectedSandApp.s("ท\u0001"));
        bVar.p(ProtectedSandApp.s("ธ\u0001"));
        bVar.p(ProtectedSandApp.s("น\u0001"));
        bVar.s(44, ProtectedSandApp.s("บ\u0001"));
        bVar.j();
        boolean[] zArr3 = new boolean[i5];
        boolean[] zArr4 = new boolean[i5];
        int i12 = i10;
        while (true) {
            s4 = ProtectedSandApp.s("ฐ\u0001");
            if (i12 >= i5) {
                break;
            }
            zArr3[i12] = com.googlecode.mp4parser.authoring.tracks.h264.d.a(ProtectedSandApp.s("ฦ\u0001"), i12, s4, bVar);
            zArr4[i12] = com.googlecode.mp4parser.authoring.tracks.h264.d.a(ProtectedSandApp.s("ว\u0001"), i12, s4, bVar);
            i12++;
            i5 = i4;
            i7 = 32;
            i6 = 2;
            i10 = 0;
        }
        if (i5 > 0) {
            int[] iArr = new int[8];
            for (int i13 = i5; i13 < 8; i13++) {
                iArr[i13] = bVar.w(i6, ProtectedSandApp.s("ป\u0001") + i13 + s4);
            }
        }
        int[] iArr2 = new int[i5];
        boolean[] zArr5 = new boolean[i5];
        int[] iArr3 = new int[i5];
        int[] iArr4 = new int[i6];
        iArr4[1] = i7;
        iArr4[i10] = i5;
        boolean[][] zArr6 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, iArr4);
        boolean[] zArr7 = new boolean[i5];
        boolean[] zArr8 = new boolean[i5];
        boolean[] zArr9 = new boolean[i5];
        boolean[] zArr10 = new boolean[i5];
        long[] jArr2 = new long[i5];
        int[] iArr5 = new int[i5];
        int i14 = 0;
        while (i14 < i5) {
            if (zArr3[i14]) {
                zArr = zArr3;
                iArr2[i14] = bVar.w(2, ProtectedSandApp.s("ผ\u0001") + i14 + s4);
                zArr5[i14] = com.googlecode.mp4parser.authoring.tracks.h264.d.a(ProtectedSandApp.s("ฝ\u0001"), i14, s4, bVar);
                iArr3[i14] = bVar.w(5, ProtectedSandApp.s("พ\u0001") + i14 + s4);
                int i15 = 0;
                for (int i16 = 32; i15 < i16; i16 = 32) {
                    zArr6[i14][i15] = bVar.p(q2.a(ProtectedSandApp.s("ร\u0001"), i14, ProtectedSandApp.s("ฤ\u0001"), i15, s4));
                    i15++;
                    jArr2 = jArr2;
                }
                zArr7[i14] = com.googlecode.mp4parser.authoring.tracks.h264.d.a(ProtectedSandApp.s("ฟ\u0001"), i14, s4, bVar);
                zArr8[i14] = com.googlecode.mp4parser.authoring.tracks.h264.d.a(ProtectedSandApp.s("ภ\u0001"), i14, s4, bVar);
                zArr9[i14] = com.googlecode.mp4parser.authoring.tracks.h264.d.a(ProtectedSandApp.s("ม\u0001"), i14, s4, bVar);
                zArr10[i14] = com.googlecode.mp4parser.authoring.tracks.h264.d.a(ProtectedSandApp.s("ย\u0001"), i14, s4, bVar);
                jArr2[i14] = bVar.k(44);
                jArr = jArr2;
            } else {
                jArr = jArr2;
                zArr = zArr3;
            }
            if (zArr4[i14]) {
                iArr5[i14] = bVar.w(8, ProtectedSandApp.s("ล\u0001") + i14 + s4);
            }
            i14++;
            i5 = i4;
            zArr3 = zArr;
            jArr2 = jArr;
        }
    }

    private void b(com.googlecode.mp4parser.h264.read.b bVar) throws IOException {
        int i4 = 4;
        boolean[][] zArr = new boolean[4][];
        int[][] iArr = new int[4][];
        int[][] iArr2 = new int[2][];
        int[][][] iArr3 = new int[4][][];
        int i5 = 0;
        while (i5 < i4) {
            int i6 = 0;
            while (true) {
                if (i6 >= (i5 == 3 ? 2 : 6)) {
                    break;
                }
                zArr[i5] = new boolean[i5 == 3 ? 2 : 6];
                iArr[i5] = new int[i5 == 3 ? 2 : 6];
                iArr3[i5] = new int[i5 == 3 ? 2 : 6][];
                zArr[i5][i6] = bVar.i();
                boolean z4 = zArr[i5][i6];
                String s4 = ProtectedSandApp.s("ฐ\u0001");
                if (z4) {
                    int min = Math.min(64, 1 << ((i5 << 1) + i4));
                    int i7 = 8;
                    if (i5 > 1) {
                        int i10 = i5 - 2;
                        iArr2[i10][i6] = bVar.t(q2.a(ProtectedSandApp.s("ษ\u0001"), i5, ProtectedSandApp.s("ส\u0001"), i6, s4));
                        i7 = 8 + iArr2[i10][i6];
                    }
                    iArr3[i5][i6] = new int[min];
                    for (int i11 = 0; i11 < min; i11++) {
                        i7 = ((bVar.t(ProtectedSandApp.s("ห\u0001")) + i7) + 256) % 256;
                        iArr3[i5][i6][i11] = i7;
                    }
                } else {
                    iArr[i5][i6] = bVar.y(q2.a(ProtectedSandApp.s("ศ\u0001"), i5, ProtectedSandApp.s("ฤ\u0001"), i6, s4));
                }
                i6++;
                i4 = 4;
            }
            i5++;
        }
    }
}
