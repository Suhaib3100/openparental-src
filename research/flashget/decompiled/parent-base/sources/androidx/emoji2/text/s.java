package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.annotation.c1;
import androidx.annotation.g0;
import androidx.annotation.o0;
import androidx.annotation.x0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: TypefaceEmojiRasterizer.java */
@androidx.annotation.d
@x0(19)
/* loaded from: classes3.dex */
public class s {

    /* renamed from: d, reason: collision with root package name */
    @c1({c1.a.LIBRARY})
    static final int f29518d = 0;

    /* renamed from: e, reason: collision with root package name */
    @c1({c1.a.LIBRARY})
    static final int f29519e = 1;

    /* renamed from: f, reason: collision with root package name */
    @c1({c1.a.LIBRARY})
    static final int f29520f = 2;

    /* renamed from: g, reason: collision with root package name */
    private static final ThreadLocal<androidx.emoji2.text.flatbuffer.n> f29521g = new ThreadLocal<>();

    /* renamed from: a, reason: collision with root package name */
    private final int f29522a;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final q f29523b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f29524c = 0;

    /* compiled from: TypefaceEmojiRasterizer.java */
    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @c1({c1.a.LIBRARY})
    s(@o0 q qVar, @g0(from = 0) int i4) {
        this.f29523b = qVar;
        this.f29522a = i4;
    }

    private androidx.emoji2.text.flatbuffer.n h() {
        ThreadLocal<androidx.emoji2.text.flatbuffer.n> threadLocal = f29521g;
        androidx.emoji2.text.flatbuffer.n nVar = threadLocal.get();
        if (nVar == null) {
            nVar = new androidx.emoji2.text.flatbuffer.n();
            threadLocal.set(nVar);
        }
        this.f29523b.g().J(nVar, this.f29522a);
        return nVar;
    }

    public void a(@o0 Canvas canvas, float f4, float f5, @o0 Paint paint) {
        Typeface j4 = this.f29523b.j();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(j4);
        canvas.drawText(this.f29523b.f(), this.f29522a * 2, 2, f4, f5, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i4) {
        return h().F(i4);
    }

    public int c() {
        return h().I();
    }

    @c1({c1.a.LIBRARY})
    public short d() {
        return h().L();
    }

    @c1({c1.a.LIBRARY})
    @SuppressLint({"KotlinPropertyAccess"})
    public int e() {
        return this.f29524c & 3;
    }

    public int f() {
        return h().S();
    }

    @c1({c1.a.LIBRARY})
    public int g() {
        return h().T();
    }

    @c1({c1.a.LIBRARY})
    public short i() {
        return h().U();
    }

    @o0
    public Typeface j() {
        return this.f29523b.j();
    }

    public int k() {
        return h().X();
    }

    public boolean l() {
        return h().O();
    }

    public boolean m() {
        return (this.f29524c & 4) > 0;
    }

    @c1({c1.a.TESTS})
    public void n() {
        if (m()) {
            this.f29524c = 4;
        } else {
            this.f29524c = 0;
        }
    }

    @c1({c1.a.LIBRARY})
    public void o(boolean z4) {
        int e4 = e();
        if (z4) {
            this.f29524c = e4 | 4;
        } else {
            this.f29524c = e4;
        }
    }

    @c1({c1.a.LIBRARY})
    @SuppressLint({"KotlinPropertyAccess"})
    public void p(boolean z4) {
        int i4 = this.f29524c & 4;
        this.f29524c = z4 ? i4 | 2 : i4 | 1;
    }

    @o0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(g()));
        sb.append(", codepoints:");
        int c5 = c();
        for (int i4 = 0; i4 < c5; i4++) {
            sb.append(Integer.toHexString(b(i4)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
