package com.mp4parser.streaming.rawformats;

import androidx.collection.s;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.authoring.f;
import com.googlecode.mp4parser.authoring.tracks.h264.c;
import com.mp4parser.streaming.MultiTrackFragmentedMp4Writer;
import com.mp4parser.streaming.d;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

/* compiled from: H264TrackAdapter.java */
/* loaded from: classes6.dex */
public class a extends com.mp4parser.streaming.a {

    /* renamed from: e, reason: collision with root package name */
    c f70150e;

    /* compiled from: H264TrackAdapter.java */
    /* renamed from: com.mp4parser.streaming.rawformats.a$a, reason: collision with other inner class name */
    class C0983a extends Thread {
        C0983a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                a.this.i();
            } catch (InterruptedException e4) {
                e4.printStackTrace();
            }
        }
    }

    /* compiled from: H264TrackAdapter.java */
    class b implements d {

        /* renamed from: b, reason: collision with root package name */
        private final /* synthetic */ f f70153b;

        /* renamed from: c, reason: collision with root package name */
        private final /* synthetic */ long f70154c;

        b(f fVar, long j4) {
            this.f70153b = fVar;
            this.f70154c = j4;
        }

        @Override // com.mp4parser.streaming.d
        public com.mp4parser.streaming.b[] a() {
            return new com.mp4parser.streaming.b[0];
        }

        @Override // com.mp4parser.streaming.d
        public ByteBuffer getContent() {
            return this.f70153b.a().duplicate();
        }

        @Override // com.mp4parser.streaming.d
        public long getDuration() {
            return this.f70154c;
        }
    }

    public a(c cVar) throws InterruptedException {
        this.f70150e = cVar;
        this.f70146a = new ArrayBlockingQueue(100, true);
        new C0983a().start();
        this.f70148c = cVar.getSampleDescriptionBox();
    }

    public static void h(String[] strArr) throws IOException, InterruptedException {
        new MultiTrackFragmentedMp4Writer(new com.mp4parser.streaming.f[]{new a(new c(new com.googlecode.mp4parser.c(ProtectedSandApp.s("᧾\u0001"))))}, new FileOutputStream(ProtectedSandApp.s("᧿\u0001"))).w();
    }

    @Override // com.mp4parser.streaming.f
    public String a() {
        return this.f70150e.u2().e();
    }

    @Override // com.mp4parser.streaming.f
    public long d() {
        return this.f70150e.u2().k();
    }

    @Override // com.mp4parser.streaming.f
    public String getHandler() {
        return this.f70150e.getHandler();
    }

    public void i() throws InterruptedException {
        List<f> A = this.f70150e.A();
        for (int i4 = 0; i4 < A.size(); i4++) {
            PrintStream printStream = System.err;
            StringBuilder a5 = s.a(ProtectedSandApp.s("ᨁ\u0001"), i4, ProtectedSandApp.s("ᨂ\u0001"));
            a5.append(A.size());
            printStream.println(a5.toString());
            long j4 = this.f70150e.S2()[i4];
            this.f70146a.put(new b(A.get(i4), j4));
        }
        System.err.println(ProtectedSandApp.s("ᨀ\u0001"));
    }
}
