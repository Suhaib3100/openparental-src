package androidx.core.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.c1;
import androidx.annotation.g0;
import androidx.annotation.l1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* compiled from: PrecomputedTextCompat.java */
/* loaded from: classes.dex */
public class w implements Spannable {

    /* renamed from: s, reason: collision with root package name */
    private static final char f5195s = '\n';

    /* renamed from: t, reason: collision with root package name */
    private static final Object f5196t = new Object();

    /* renamed from: u, reason: collision with root package name */
    @androidx.annotation.b0("sLock")
    @o0
    private static Executor f5197u;

    /* renamed from: o, reason: collision with root package name */
    @o0
    private final Spannable f5198o;

    /* renamed from: p, reason: collision with root package name */
    @o0
    private final a f5199p;

    /* renamed from: q, reason: collision with root package name */
    @o0
    private final int[] f5200q;

    /* renamed from: r, reason: collision with root package name */
    @q0
    private final PrecomputedText f5201r;

    /* compiled from: PrecomputedTextCompat.java */
    private static class b extends FutureTask<w> {

        /* compiled from: PrecomputedTextCompat.java */
        private static class a implements Callable<w> {

            /* renamed from: a, reason: collision with root package name */
            private a f5211a;

            /* renamed from: b, reason: collision with root package name */
            private CharSequence f5212b;

            a(@o0 a aVar, @o0 CharSequence charSequence) {
                this.f5211a = aVar;
                this.f5212b = charSequence;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public w call() throws Exception {
                return w.a(this.f5212b, this.f5211a);
            }
        }

        b(@o0 a aVar, @o0 CharSequence charSequence) {
            super(new a(aVar, charSequence));
        }
    }

    private w(@o0 CharSequence charSequence, @o0 a aVar, @o0 int[] iArr) {
        this.f5198o = new SpannableString(charSequence);
        this.f5199p = aVar;
        this.f5200q = iArr;
        this.f5201r = null;
    }

    @SuppressLint({"WrongConstant"})
    public static w a(@o0 CharSequence charSequence, @o0 a aVar) {
        PrecomputedText.Params params;
        PrecomputedText create;
        charSequence.getClass();
        aVar.getClass();
        try {
            androidx.core.os.v.b("PrecomputedText");
            if (Build.VERSION.SDK_INT >= 29 && (params = aVar.f5206e) != null) {
                create = PrecomputedText.create(charSequence, params);
                return new w(create, aVar);
            }
            ArrayList arrayList = new ArrayList();
            int length = charSequence.length();
            int i5 = 0;
            while (i5 < length) {
                int indexOf = TextUtils.indexOf(charSequence, f5195s, i5, length);
                i5 = indexOf < 0 ? length : indexOf + 1;
                arrayList.add(Integer.valueOf(i5));
            }
            int[] iArr = new int[arrayList.size()];
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                iArr[i6] = ((Integer) arrayList.get(i6)).intValue();
            }
            StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), aVar.e(), Integer.MAX_VALUE).setBreakStrategy(aVar.b()).setHyphenationFrequency(aVar.c()).setTextDirection(aVar.d()).build();
            return new w(charSequence, aVar, iArr);
        } finally {
            androidx.core.os.v.d();
        }
    }

    @l1
    public static Future<w> g(@o0 CharSequence charSequence, @o0 a aVar, @q0 Executor executor) {
        b bVar = new b(aVar, charSequence);
        if (executor == null) {
            synchronized (f5196t) {
                if (f5197u == null) {
                    f5197u = Executors.newFixedThreadPool(1);
                }
                executor = f5197u;
            }
        }
        executor.execute(bVar);
        return bVar;
    }

    @g0(from = 0)
    public int b() {
        int paragraphCount;
        if (Build.VERSION.SDK_INT < 29) {
            return this.f5200q.length;
        }
        paragraphCount = this.f5201r.getParagraphCount();
        return paragraphCount;
    }

    @g0(from = 0)
    public int c(@g0(from = 0) int i5) {
        int paragraphEnd;
        androidx.core.util.q.g(i5, 0, b(), "paraIndex");
        if (Build.VERSION.SDK_INT < 29) {
            return this.f5200q[i5];
        }
        paragraphEnd = this.f5201r.getParagraphEnd(i5);
        return paragraphEnd;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i5) {
        return this.f5198o.charAt(i5);
    }

    @g0(from = 0)
    public int d(@g0(from = 0) int i5) {
        int paragraphStart;
        androidx.core.util.q.g(i5, 0, b(), "paraIndex");
        if (Build.VERSION.SDK_INT >= 29) {
            paragraphStart = this.f5201r.getParagraphStart(i5);
            return paragraphStart;
        }
        if (i5 == 0) {
            return 0;
        }
        return this.f5200q[i5 - 1];
    }

    @o0
    public a e() {
        return this.f5199p;
    }

    @q0
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @x0(28)
    public PrecomputedText f() {
        Spannable spannable = this.f5198o;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f5198o.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f5198o.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f5198o.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i5, int i6, Class<T> cls) {
        Object[] spans;
        if (Build.VERSION.SDK_INT < 29) {
            return (T[]) this.f5198o.getSpans(i5, i6, cls);
        }
        spans = this.f5201r.getSpans(i5, i6, cls);
        return (T[]) spans;
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f5198o.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i5, int i6, Class cls) {
        return this.f5198o.nextSpanTransition(i5, i6, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f5201r.removeSpan(obj);
        } else {
            this.f5198o.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i5, int i6, int i7) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f5201r.setSpan(obj, i5, i6, i7);
        } else {
            this.f5198o.setSpan(obj, i5, i6, i7);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i5, int i6) {
        return this.f5198o.subSequence(i5, i6);
    }

    @Override // java.lang.CharSequence
    @o0
    public String toString() {
        return this.f5198o.toString();
    }

    @x0(28)
    private w(@o0 PrecomputedText precomputedText, @o0 a aVar) {
        this.f5198o = precomputedText;
        this.f5199p = aVar;
        this.f5200q = null;
        this.f5201r = Build.VERSION.SDK_INT < 29 ? null : precomputedText;
    }

    /* compiled from: PrecomputedTextCompat.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @o0
        private final TextPaint f5202a;

        /* renamed from: b, reason: collision with root package name */
        @q0
        private final TextDirectionHeuristic f5203b;

        /* renamed from: c, reason: collision with root package name */
        private final int f5204c;

        /* renamed from: d, reason: collision with root package name */
        private final int f5205d;

        /* renamed from: e, reason: collision with root package name */
        final PrecomputedText.Params f5206e;

        /* compiled from: PrecomputedTextCompat.java */
        /* renamed from: androidx.core.text.w$a$a, reason: collision with other inner class name */
        public static class C0051a {

            /* renamed from: a, reason: collision with root package name */
            @o0
            private final TextPaint f5207a;

            /* renamed from: c, reason: collision with root package name */
            private int f5209c = 1;

            /* renamed from: d, reason: collision with root package name */
            private int f5210d = 1;

            /* renamed from: b, reason: collision with root package name */
            private TextDirectionHeuristic f5208b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C0051a(@o0 TextPaint textPaint) {
                this.f5207a = textPaint;
            }

            @o0
            public a a() {
                return new a(this.f5207a, this.f5208b, this.f5209c, this.f5210d);
            }

            @x0(23)
            public C0051a b(int i5) {
                this.f5209c = i5;
                return this;
            }

            @x0(23)
            public C0051a c(int i5) {
                this.f5210d = i5;
                return this;
            }

            @x0(18)
            public C0051a d(@o0 TextDirectionHeuristic textDirectionHeuristic) {
                this.f5208b = textDirectionHeuristic;
                return this;
            }
        }

        a(@o0 TextPaint textPaint, @o0 TextDirectionHeuristic textDirectionHeuristic, int i5, int i6) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f5206e = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i5).setHyphenationFrequency(i6).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f5206e = null;
            }
            this.f5202a = textPaint;
            this.f5203b = textDirectionHeuristic;
            this.f5204c = i5;
            this.f5205d = i6;
        }

        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public boolean a(@o0 a aVar) {
            if (this.f5204c == aVar.f5204c && this.f5205d == aVar.f5205d && this.f5202a.getTextSize() == aVar.f5202a.getTextSize() && this.f5202a.getTextScaleX() == aVar.f5202a.getTextScaleX() && this.f5202a.getTextSkewX() == aVar.f5202a.getTextSkewX() && this.f5202a.getLetterSpacing() == aVar.f5202a.getLetterSpacing() && TextUtils.equals(this.f5202a.getFontFeatureSettings(), aVar.f5202a.getFontFeatureSettings()) && this.f5202a.getFlags() == aVar.f5202a.getFlags() && this.f5202a.getTextLocales().equals(aVar.f5202a.getTextLocales())) {
                return this.f5202a.getTypeface() == null ? aVar.f5202a.getTypeface() == null : this.f5202a.getTypeface().equals(aVar.f5202a.getTypeface());
            }
            return false;
        }

        @x0(23)
        public int b() {
            return this.f5204c;
        }

        @x0(23)
        public int c() {
            return this.f5205d;
        }

        @q0
        @x0(18)
        public TextDirectionHeuristic d() {
            return this.f5203b;
        }

        @o0
        public TextPaint e() {
            return this.f5202a;
        }

        public boolean equals(@q0 Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f5203b == aVar.f5203b;
        }

        public int hashCode() {
            return androidx.core.util.l.b(Float.valueOf(this.f5202a.getTextSize()), Float.valueOf(this.f5202a.getTextScaleX()), Float.valueOf(this.f5202a.getTextSkewX()), Float.valueOf(this.f5202a.getLetterSpacing()), Integer.valueOf(this.f5202a.getFlags()), this.f5202a.getTextLocales(), this.f5202a.getTypeface(), Boolean.valueOf(this.f5202a.isElegantTextHeight()), this.f5203b, Integer.valueOf(this.f5204c), Integer.valueOf(this.f5205d));
        }

        public String toString() {
            String fontVariationSettings;
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f5202a.getTextSize());
            sb.append(", textScaleX=" + this.f5202a.getTextScaleX());
            sb.append(", textSkewX=" + this.f5202a.getTextSkewX());
            int i5 = Build.VERSION.SDK_INT;
            sb.append(", letterSpacing=" + this.f5202a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f5202a.isElegantTextHeight());
            sb.append(", textLocale=" + this.f5202a.getTextLocales());
            sb.append(", typeface=" + this.f5202a.getTypeface());
            if (i5 >= 26) {
                StringBuilder sb2 = new StringBuilder(", variationSettings=");
                fontVariationSettings = this.f5202a.getFontVariationSettings();
                sb2.append(fontVariationSettings);
                sb.append(sb2.toString());
            }
            sb.append(", textDir=" + this.f5203b);
            sb.append(", breakStrategy=" + this.f5204c);
            sb.append(", hyphenationFrequency=" + this.f5205d);
            sb.append("}");
            return sb.toString();
        }

        @x0(28)
        public a(@o0 PrecomputedText.Params params) {
            TextPaint textPaint;
            TextDirectionHeuristic textDirection;
            int breakStrategy;
            int hyphenationFrequency;
            textPaint = params.getTextPaint();
            this.f5202a = textPaint;
            textDirection = params.getTextDirection();
            this.f5203b = textDirection;
            breakStrategy = params.getBreakStrategy();
            this.f5204c = breakStrategy;
            hyphenationFrequency = params.getHyphenationFrequency();
            this.f5205d = hyphenationFrequency;
            this.f5206e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
