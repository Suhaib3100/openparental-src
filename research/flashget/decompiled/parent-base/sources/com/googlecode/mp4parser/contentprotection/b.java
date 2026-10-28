package com.googlecode.mp4parser.contentprotection;

import androidx.compose.ui.graphics.l6;
import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: PlayReadyHeader.java */
/* loaded from: classes6.dex */
public class b extends com.googlecode.mp4parser.boxes.piff.a {

    /* renamed from: d, reason: collision with root package name */
    public static UUID f64058d;

    /* renamed from: b, reason: collision with root package name */
    private long f64059b;

    /* renamed from: c, reason: collision with root package name */
    private List<a> f64060c;

    /* compiled from: PlayReadyHeader.java */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        int f64061a;

        /* compiled from: PlayReadyHeader.java */
        /* renamed from: com.googlecode.mp4parser.contentprotection.b$a$a, reason: collision with other inner class name */
        public static class C0970a extends a {

            /* renamed from: b, reason: collision with root package name */
            ByteBuffer f64062b;

            public C0970a(int i4) {
                super(i4);
            }

            @Override // com.googlecode.mp4parser.contentprotection.b.a
            public ByteBuffer b() {
                return this.f64062b;
            }

            @Override // com.googlecode.mp4parser.contentprotection.b.a
            public void c(ByteBuffer byteBuffer) {
                this.f64062b = byteBuffer.duplicate();
            }
        }

        /* compiled from: PlayReadyHeader.java */
        /* renamed from: com.googlecode.mp4parser.contentprotection.b$a$b, reason: collision with other inner class name */
        public static class C0971b extends a {

            /* renamed from: b, reason: collision with root package name */
            ByteBuffer f64063b;

            public C0971b() {
                super(3);
            }

            @Override // com.googlecode.mp4parser.contentprotection.b.a
            public ByteBuffer b() {
                return this.f64063b;
            }

            @Override // com.googlecode.mp4parser.contentprotection.b.a
            public void c(ByteBuffer byteBuffer) {
                this.f64063b = byteBuffer.duplicate();
            }

            @Override // com.googlecode.mp4parser.contentprotection.b.a
            public String toString() {
                return ProtectedSandApp.s("ᐫ\u0001") + b().limit() + '}';
            }
        }

        /* compiled from: PlayReadyHeader.java */
        public static class c extends a {

            /* renamed from: b, reason: collision with root package name */
            String f64064b;

            public c() {
                super(1);
            }

            @Override // com.googlecode.mp4parser.contentprotection.b.a
            public ByteBuffer b() {
                try {
                    return ByteBuffer.wrap(this.f64064b.getBytes(ProtectedSandApp.s("ᐬ\u0001")));
                } catch (UnsupportedEncodingException e4) {
                    throw new RuntimeException(e4);
                }
            }

            @Override // com.googlecode.mp4parser.contentprotection.b.a
            public void c(ByteBuffer byteBuffer) {
                try {
                    byte[] bArr = new byte[byteBuffer.slice().limit()];
                    byteBuffer.get(bArr);
                    this.f64064b = new String(bArr, ProtectedSandApp.s("ᐬ\u0001"));
                } catch (UnsupportedEncodingException e4) {
                    throw new RuntimeException(e4);
                }
            }

            public String d() {
                return this.f64064b;
            }

            public void e(String str) {
                this.f64064b = str;
            }

            @Override // com.googlecode.mp4parser.contentprotection.b.a
            public String toString() {
                StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ᐭ\u0001"));
                sb.append(b().limit());
                sb.append(ProtectedSandApp.s("ᐮ\u0001"));
                return android.support.v4.media.c.a(sb, this.f64064b, ProtectedSandApp.s("ᐯ\u0001"));
            }
        }

        public a(int i4) {
            this.f64061a = i4;
        }

        public static List<a> a(ByteBuffer byteBuffer, int i4) {
            a aVar;
            a aVar2;
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                int j4 = g.j(byteBuffer);
                int j5 = g.j(byteBuffer);
                if (j4 == 1) {
                    aVar = new c(1);
                } else if (j4 == 2) {
                    aVar = new C0970a(2);
                } else if (j4 != 3) {
                    aVar2 = new C0970a(j4);
                    aVar2.c((ByteBuffer) byteBuffer.slice().limit(j5));
                    byteBuffer.position(byteBuffer.position() + j5);
                    arrayList.add(aVar2);
                } else {
                    aVar = new C0971b(3);
                }
                aVar2 = aVar;
                aVar2.c((ByteBuffer) byteBuffer.slice().limit(j5));
                byteBuffer.position(byteBuffer.position() + j5);
                arrayList.add(aVar2);
            }
            return arrayList;
        }

        public abstract ByteBuffer b();

        public abstract void c(ByteBuffer byteBuffer);

        public String toString() {
            return ProtectedSandApp.s("ᐩ\u0001") + this.f64061a + ProtectedSandApp.s("ᐪ\u0001") + b().limit() + '}';
        }
    }

    static {
        UUID fromString = UUID.fromString(ProtectedSandApp.s("ᐰ\u0001"));
        f64058d = fromString;
        com.googlecode.mp4parser.boxes.piff.a.f64044a.put(fromString, b.class);
    }

    @Override // com.googlecode.mp4parser.boxes.piff.a
    public ByteBuffer b() {
        Iterator<a> it = this.f64060c.iterator();
        int i4 = 6;
        while (it.hasNext()) {
            i4 = i4 + 4 + it.next().b().rewind().limit();
        }
        ByteBuffer allocate = ByteBuffer.allocate(i4);
        i.j(allocate, i4);
        i.g(allocate, this.f64060c.size());
        for (a aVar : this.f64060c) {
            i.g(allocate, aVar.f64061a);
            i.g(allocate, aVar.b().limit());
            allocate.put(aVar.b());
        }
        return allocate;
    }

    @Override // com.googlecode.mp4parser.boxes.piff.a
    public UUID c() {
        return f64058d;
    }

    @Override // com.googlecode.mp4parser.boxes.piff.a
    public void d(ByteBuffer byteBuffer) {
        this.f64059b = g.m(byteBuffer);
        this.f64060c = a.a(byteBuffer, g.j(byteBuffer));
    }

    public List<a> e() {
        return Collections.unmodifiableList(this.f64060c);
    }

    public void f(List<a> list) {
        this.f64060c = list;
    }

    @Override // com.googlecode.mp4parser.boxes.piff.a
    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ᐱ\u0001"));
        sb.append(this.f64059b);
        sb.append(ProtectedSandApp.s("ᐲ\u0001"));
        sb.append(this.f64060c.size());
        sb.append(ProtectedSandApp.s("ᐳ\u0001"));
        return l6.a(sb, this.f64060c, '}');
    }
}
