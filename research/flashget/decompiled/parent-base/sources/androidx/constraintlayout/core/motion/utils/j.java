package androidx.constraintlayout.core.motion.utils;

import java.io.PrintStream;
import java.util.Arrays;

/* compiled from: KeyFrameArray.java */
/* loaded from: classes.dex */
public class j {

    /* compiled from: KeyFrameArray.java */
    public static class a {

        /* renamed from: d, reason: collision with root package name */
        private static final int f22262d = 999;

        /* renamed from: a, reason: collision with root package name */
        int[] f22263a = new int[101];

        /* renamed from: b, reason: collision with root package name */
        androidx.constraintlayout.core.motion.a[] f22264b = new androidx.constraintlayout.core.motion.a[101];

        /* renamed from: c, reason: collision with root package name */
        int f22265c;

        public a() {
            b();
        }

        public void a(int i4, androidx.constraintlayout.core.motion.a aVar) {
            if (this.f22264b[i4] != null) {
                e(i4);
            }
            this.f22264b[i4] = aVar;
            int[] iArr = this.f22263a;
            int i5 = this.f22265c;
            this.f22265c = i5 + 1;
            iArr[i5] = i4;
            Arrays.sort(iArr);
        }

        public void b() {
            Arrays.fill(this.f22263a, 999);
            Arrays.fill(this.f22264b, (Object) null);
            this.f22265c = 0;
        }

        public void c() {
            PrintStream printStream = System.out;
            printStream.println("V: " + Arrays.toString(Arrays.copyOf(this.f22263a, this.f22265c)));
            printStream.print("K: [");
            int i4 = 0;
            while (i4 < this.f22265c) {
                PrintStream printStream2 = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append(i4 == 0 ? "" : ", ");
                sb.append(g(i4));
                printStream2.print(sb.toString());
                i4++;
            }
            System.out.println("]");
        }

        public int d(int i4) {
            return this.f22263a[i4];
        }

        public void e(int i4) {
            this.f22264b[i4] = null;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int i7 = this.f22265c;
                if (i5 >= i7) {
                    this.f22265c = i7 - 1;
                    return;
                }
                int[] iArr = this.f22263a;
                if (i4 == iArr[i5]) {
                    iArr[i5] = 999;
                    i6++;
                }
                if (i5 != i6) {
                    iArr[i5] = iArr[i6];
                }
                i6++;
                i5++;
            }
        }

        public int f() {
            return this.f22265c;
        }

        public androidx.constraintlayout.core.motion.a g(int i4) {
            return this.f22264b[this.f22263a[i4]];
        }
    }

    /* compiled from: KeyFrameArray.java */
    public static class b {

        /* renamed from: d, reason: collision with root package name */
        private static final int f22266d = 999;

        /* renamed from: a, reason: collision with root package name */
        int[] f22267a = new int[101];

        /* renamed from: b, reason: collision with root package name */
        androidx.constraintlayout.core.motion.b[] f22268b = new androidx.constraintlayout.core.motion.b[101];

        /* renamed from: c, reason: collision with root package name */
        int f22269c;

        public b() {
            b();
        }

        public void a(int i4, androidx.constraintlayout.core.motion.b bVar) {
            if (this.f22268b[i4] != null) {
                e(i4);
            }
            this.f22268b[i4] = bVar;
            int[] iArr = this.f22267a;
            int i5 = this.f22269c;
            this.f22269c = i5 + 1;
            iArr[i5] = i4;
            Arrays.sort(iArr);
        }

        public void b() {
            Arrays.fill(this.f22267a, 999);
            Arrays.fill(this.f22268b, (Object) null);
            this.f22269c = 0;
        }

        public void c() {
            PrintStream printStream = System.out;
            printStream.println("V: " + Arrays.toString(Arrays.copyOf(this.f22267a, this.f22269c)));
            printStream.print("K: [");
            int i4 = 0;
            while (i4 < this.f22269c) {
                PrintStream printStream2 = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append(i4 == 0 ? "" : ", ");
                sb.append(g(i4));
                printStream2.print(sb.toString());
                i4++;
            }
            System.out.println("]");
        }

        public int d(int i4) {
            return this.f22267a[i4];
        }

        public void e(int i4) {
            this.f22268b[i4] = null;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int i7 = this.f22269c;
                if (i5 >= i7) {
                    this.f22269c = i7 - 1;
                    return;
                }
                int[] iArr = this.f22267a;
                if (i4 == iArr[i5]) {
                    iArr[i5] = 999;
                    i6++;
                }
                if (i5 != i6) {
                    iArr[i5] = iArr[i6];
                }
                i6++;
                i5++;
            }
        }

        public int f() {
            return this.f22269c;
        }

        public androidx.constraintlayout.core.motion.b g(int i4) {
            return this.f22268b[this.f22267a[i4]];
        }
    }

    /* compiled from: KeyFrameArray.java */
    static class c {

        /* renamed from: d, reason: collision with root package name */
        private static final int f22270d = 999;

        /* renamed from: a, reason: collision with root package name */
        int[] f22271a = new int[101];

        /* renamed from: b, reason: collision with root package name */
        float[][] f22272b = new float[101][];

        /* renamed from: c, reason: collision with root package name */
        int f22273c;

        public c() {
            b();
        }

        public void a(int i4, float[] fArr) {
            if (this.f22272b[i4] != null) {
                e(i4);
            }
            this.f22272b[i4] = fArr;
            int[] iArr = this.f22271a;
            int i5 = this.f22273c;
            this.f22273c = i5 + 1;
            iArr[i5] = i4;
            Arrays.sort(iArr);
        }

        public void b() {
            Arrays.fill(this.f22271a, 999);
            Arrays.fill(this.f22272b, (Object) null);
            this.f22273c = 0;
        }

        public void c() {
            PrintStream printStream = System.out;
            printStream.println("V: " + Arrays.toString(Arrays.copyOf(this.f22271a, this.f22273c)));
            printStream.print("K: [");
            int i4 = 0;
            while (i4 < this.f22273c) {
                PrintStream printStream2 = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append(i4 == 0 ? "" : ", ");
                sb.append(Arrays.toString(g(i4)));
                printStream2.print(sb.toString());
                i4++;
            }
            System.out.println("]");
        }

        public int d(int i4) {
            return this.f22271a[i4];
        }

        public void e(int i4) {
            this.f22272b[i4] = null;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int i7 = this.f22273c;
                if (i5 >= i7) {
                    this.f22273c = i7 - 1;
                    return;
                }
                int[] iArr = this.f22271a;
                if (i4 == iArr[i5]) {
                    iArr[i5] = 999;
                    i6++;
                }
                if (i5 != i6) {
                    iArr[i5] = iArr[i6];
                }
                i6++;
                i5++;
            }
        }

        public int f() {
            return this.f22273c;
        }

        public float[] g(int i4) {
            return this.f22272b[this.f22271a[i4]];
        }
    }
}
