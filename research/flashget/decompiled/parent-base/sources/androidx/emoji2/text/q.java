package androidx.emoji2.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Trace;
import android.util.SparseArray;
import androidx.annotation.c1;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.x0;
import androidx.core.os.p0;
import androidx.core.util.w;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: MetadataRepo.java */
@androidx.annotation.d
@x0(19)
/* loaded from: classes3.dex */
public final class q {

    /* renamed from: e, reason: collision with root package name */
    private static final int f29506e = 1024;

    /* renamed from: f, reason: collision with root package name */
    private static final String f29507f = "EmojiCompat.MetadataRepo.create";

    /* renamed from: a, reason: collision with root package name */
    @o0
    private final androidx.emoji2.text.flatbuffer.o f29508a;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final char[] f29509b;

    /* renamed from: c, reason: collision with root package name */
    @o0
    private final a f29510c = new a(1024);

    /* renamed from: d, reason: collision with root package name */
    @o0
    private final Typeface f29511d;

    /* compiled from: MetadataRepo.java */
    @c1({c1.a.LIBRARY})
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final SparseArray<a> f29512a;

        /* renamed from: b, reason: collision with root package name */
        private s f29513b;

        private a() {
            this(1);
        }

        a a(int i4) {
            SparseArray<a> sparseArray = this.f29512a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i4);
        }

        final s b() {
            return this.f29513b;
        }

        void c(@o0 s sVar, int i4, int i5) {
            a a5 = a(sVar.b(i4));
            if (a5 == null) {
                a5 = new a();
                this.f29512a.put(sVar.b(i4), a5);
            }
            if (i5 > i4) {
                a5.c(sVar, i4 + 1, i5);
            } else {
                a5.f29513b = sVar;
            }
        }

        a(int i4) {
            this.f29512a = new SparseArray<>(i4);
        }
    }

    private q(@o0 Typeface typeface, @o0 androidx.emoji2.text.flatbuffer.o oVar) {
        this.f29511d = typeface;
        this.f29508a = oVar;
        this.f29509b = new char[oVar.K() * 2];
        a(oVar);
    }

    private void a(androidx.emoji2.text.flatbuffer.o oVar) {
        int K = oVar.K();
        for (int i4 = 0; i4 < K; i4++) {
            s sVar = new s(this, i4);
            Character.toChars(sVar.g(), this.f29509b, i4 * 2);
            k(sVar);
        }
    }

    @o0
    public static q b(@o0 AssetManager assetManager, @o0 String str) throws IOException {
        try {
            p0.b("EmojiCompat.MetadataRepo.create");
            q qVar = new q(Typeface.createFromAsset(assetManager, str), p.b(assetManager, str));
            Trace.endSection();
            return qVar;
        } catch (Throwable th) {
            p0.d();
            throw th;
        }
    }

    @c1({c1.a.TESTS})
    @o0
    public static q c(@o0 Typeface typeface) {
        try {
            p0.b("EmojiCompat.MetadataRepo.create");
            q qVar = new q(typeface, new androidx.emoji2.text.flatbuffer.o());
            Trace.endSection();
            return qVar;
        } catch (Throwable th) {
            p0.d();
            throw th;
        }
    }

    @o0
    public static q d(@o0 Typeface typeface, @o0 InputStream inputStream) throws IOException {
        try {
            p0.b("EmojiCompat.MetadataRepo.create");
            q qVar = new q(typeface, p.c(inputStream));
            Trace.endSection();
            return qVar;
        } catch (Throwable th) {
            p0.d();
            throw th;
        }
    }

    @o0
    public static q e(@o0 Typeface typeface, @o0 ByteBuffer byteBuffer) throws IOException {
        try {
            p0.b("EmojiCompat.MetadataRepo.create");
            q qVar = new q(typeface, p.d(byteBuffer));
            Trace.endSection();
            return qVar;
        } catch (Throwable th) {
            p0.d();
            throw th;
        }
    }

    @c1({c1.a.LIBRARY})
    @o0
    public char[] f() {
        return this.f29509b;
    }

    @c1({c1.a.LIBRARY})
    @o0
    public androidx.emoji2.text.flatbuffer.o g() {
        return this.f29508a;
    }

    @c1({c1.a.LIBRARY})
    int h() {
        return this.f29508a.S();
    }

    @c1({c1.a.LIBRARY})
    @o0
    a i() {
        return this.f29510c;
    }

    @c1({c1.a.LIBRARY})
    @o0
    Typeface j() {
        return this.f29511d;
    }

    @c1({c1.a.LIBRARY})
    @m1
    void k(@o0 s sVar) {
        w.m(sVar, "emoji metadata cannot be null");
        w.b(sVar.c() > 0, "invalid metadata codepoint length");
        this.f29510c.c(sVar, 0, sVar.c() - 1);
    }
}
