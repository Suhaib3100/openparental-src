package com.squareup.picasso;

import androidx.collection.y0;
import java.io.PrintWriter;
import java.io.StringWriter;

/* compiled from: StatsSnapshot.java */
/* loaded from: classes6.dex */
public class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f70866a;

    /* renamed from: b, reason: collision with root package name */
    public final int f70867b;

    /* renamed from: c, reason: collision with root package name */
    public final long f70868c;

    /* renamed from: d, reason: collision with root package name */
    public final long f70869d;

    /* renamed from: e, reason: collision with root package name */
    public final long f70870e;

    /* renamed from: f, reason: collision with root package name */
    public final long f70871f;

    /* renamed from: g, reason: collision with root package name */
    public final long f70872g;

    /* renamed from: h, reason: collision with root package name */
    public final long f70873h;

    /* renamed from: i, reason: collision with root package name */
    public final long f70874i;

    /* renamed from: j, reason: collision with root package name */
    public final long f70875j;

    /* renamed from: k, reason: collision with root package name */
    public final int f70876k;

    /* renamed from: l, reason: collision with root package name */
    public final int f70877l;

    /* renamed from: m, reason: collision with root package name */
    public final int f70878m;

    /* renamed from: n, reason: collision with root package name */
    public final long f70879n;

    public g0(int i4, int i5, long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, int i6, int i7, int i10, long j14) {
        this.f70866a = i4;
        this.f70867b = i5;
        this.f70868c = j4;
        this.f70869d = j5;
        this.f70870e = j6;
        this.f70871f = j7;
        this.f70872g = j10;
        this.f70873h = j11;
        this.f70874i = j12;
        this.f70875j = j13;
        this.f70876k = i6;
        this.f70877l = i7;
        this.f70878m = i10;
        this.f70879n = j14;
    }

    public void a() {
        StringWriter stringWriter = new StringWriter();
        b(new PrintWriter(stringWriter));
        stringWriter.toString();
    }

    public void b(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.f70866a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.f70867b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((this.f70867b / this.f70866a) * 100.0f));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f70868c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f70869d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f70876k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f70870e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f70873h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f70877l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f70871f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f70878m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f70872g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f70874i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f70875j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StatsSnapshot{maxSize=");
        sb.append(this.f70866a);
        sb.append(", size=");
        sb.append(this.f70867b);
        sb.append(", cacheHits=");
        sb.append(this.f70868c);
        sb.append(", cacheMisses=");
        sb.append(this.f70869d);
        sb.append(", downloadCount=");
        sb.append(this.f70876k);
        sb.append(", totalDownloadSize=");
        sb.append(this.f70870e);
        sb.append(", averageDownloadSize=");
        sb.append(this.f70873h);
        sb.append(", totalOriginalBitmapSize=");
        sb.append(this.f70871f);
        sb.append(", totalTransformedBitmapSize=");
        sb.append(this.f70872g);
        sb.append(", averageOriginalBitmapSize=");
        sb.append(this.f70874i);
        sb.append(", averageTransformedBitmapSize=");
        sb.append(this.f70875j);
        sb.append(", originalBitmapCount=");
        sb.append(this.f70877l);
        sb.append(", transformedBitmapCount=");
        sb.append(this.f70878m);
        sb.append(", timeStamp=");
        return y0.a(sb, this.f70879n, '}');
    }
}
