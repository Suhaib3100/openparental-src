package androidx.core.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Trace;
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
import androidx.annotation.l1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* compiled from: PrecomputedTextCompat.java */
/* loaded from: classes3.dex */
public class p implements Spannable {

    /* renamed from: f, reason: collision with root package name */
    private static final char f26732f = '\n';

    /* renamed from: g, reason: collision with root package name */
    private static final Object f26733g = new Object();

    /* renamed from: h, reason: collision with root package name */
    @androidx.annotation.b0("sLock")
    @o0
    private static Executor f26734h;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final Spannable f26735b;

    /* renamed from: c, reason: collision with root package name */
    @o0
    private final b f26736c;

    /* renamed from: d, reason: collision with root package name */
    @o0
    private final int[] f26737d;

    /* renamed from: e, reason: collision with root package name */
    @q0
    private final PrecomputedText f26738e;

    /* compiled from: PrecomputedTextCompat.java */
    @x0(28)
    static class a {
        private a() {
        }

        static Spannable a(PrecomputedText precomputedText) {
            return precomputedText;
        }
    }

    /* compiled from: PrecomputedTextCompat.java */
    private static class c extends FutureTask<p> {

        /* compiled from: PrecomputedTextCompat.java */
        private static class a implements Callable<p> {

            /* renamed from: a, reason: collision with root package name */
            private b f26748a;

            /* renamed from: b, reason: collision with root package name */
            private CharSequence f26749b;

            a(@o0 b bVar, @o0 CharSequence charSequence) {
                this.f26748a = bVar;
                this.f26749b = charSequence;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public p call() throws Exception {
                return p.a(this.f26749b, this.f26748a);
            }
        }

        c(@o0 b bVar, @o0 CharSequence charSequence) {
            super(new a(bVar, charSequence));
        }
    }

    private p(@o0 CharSequence charSequence, @o0 b bVar, @o0 int[] iArr) {
        this.f26735b = new SpannableString(charSequence);
        this.f26736c = bVar;
        this.f26737d = iArr;
        this.f26738e = null;
    }

    @SuppressLint({"WrongConstant"})
    public static p a(@o0 CharSequence charSequence, @o0 b bVar) {
        PrecomputedText.Params params;
        PrecomputedText create;
        charSequence.getClass();
        bVar.getClass();
        try {
            Trace.beginSection("PrecomputedText");
            if (Build.VERSION.SDK_INT >= 29 && (params = bVar.f26743e) != null) {
                create = PrecomputedText.create(charSequence, params);
                return new p(create, bVar);
            }
            ArrayList arrayList = new ArrayList();
            int length = charSequence.length();
            int i4 = 0;
            while (i4 < length) {
                int indexOf = TextUtils.indexOf(charSequence, '\n', i4, length);
                i4 = indexOf < 0 ? length : indexOf + 1;
                arrayList.add(Integer.valueOf(i4));
            }
            int[] iArr = new int[arrayList.size()];
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                iArr[i5] = ((Integer) arrayList.get(i5)).intValue();
            }
            StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), bVar.e(), Integer.MAX_VALUE).setBreakStrategy(bVar.b()).setHyphenationFrequency(bVar.c()).setTextDirection(bVar.d()).build();
            return new p(charSequence, bVar, iArr);
        } finally {
            Trace.endSection();
        }
    }

    @l1
    public static Future<p> j(@o0 CharSequence charSequence, @o0 b bVar, @q0 Executor executor) {
        c cVar = new c(bVar, charSequence);
        if (executor == null) {
            synchronized (f26733g) {
                try {
                    if (f26734h == null) {
                        f26734h = Executors.newFixedThreadPool(1);
                    }
                    executor = f26734h;
                } finally {
                }
            }
        }
        executor.execute(cVar);
        return cVar;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i4) {
        return this.f26735b.charAt(i4);
    }

    @androidx.annotation.g0(from = 0)
    public int e() {
        int paragraphCount;
        if (Build.VERSION.SDK_INT < 29) {
            return this.f26737d.length;
        }
        paragraphCount = this.f26738e.getParagraphCount();
        return paragraphCount;
    }

    @androidx.annotation.g0(from = 0)
    public int f(@androidx.annotation.g0(from = 0) int i4) {
        int paragraphEnd;
        androidx.core.util.w.g(i4, 0, e(), "paraIndex");
        if (Build.VERSION.SDK_INT < 29) {
            return this.f26737d[i4];
        }
        paragraphEnd = this.f26738e.getParagraphEnd(i4);
        return paragraphEnd;
    }

    @androidx.annotation.g0(from = 0)
    public int g(@androidx.annotation.g0(from = 0) int i4) {
        int paragraphStart;
        androidx.core.util.w.g(i4, 0, e(), "paraIndex");
        if (Build.VERSION.SDK_INT >= 29) {
            paragraphStart = this.f26738e.getParagraphStart(i4);
            return paragraphStart;
        }
        if (i4 == 0) {
            return 0;
        }
        return this.f26737d[i4 - 1];
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f26735b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f26735b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f26735b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i4, int i5, Class<T> cls) {
        Object[] spans;
        if (Build.VERSION.SDK_INT < 29) {
            return (T[]) this.f26735b.getSpans(i4, i5, cls);
        }
        spans = this.f26738e.getSpans(i4, i5, cls);
        return (T[]) spans;
    }

    @o0
    public b h() {
        return this.f26736c;
    }

    @q0
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @x0(28)
    public PrecomputedText i() {
        if (h.a(this.f26735b)) {
            return i.a(this.f26735b);
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f26735b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i4, int i5, Class cls) {
        return this.f26735b.nextSpanTransition(i4, i5, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f26738e.removeSpan(obj);
        } else {
            this.f26735b.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i4, int i5, int i6) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f26738e.setSpan(obj, i4, i5, i6);
        } else {
            this.f26735b.setSpan(obj, i4, i5, i6);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i4, int i5) {
        return this.f26735b.subSequence(i4, i5);
    }

    @Override // java.lang.CharSequence
    @o0
    public String toString() {
        return this.f26735b.toString();
    }

    @x0(28)
    private p(@o0 PrecomputedText precomputedText, @o0 b bVar) {
        this.f26735b = precomputedText;
        this.f26736c = bVar;
        this.f26737d = null;
        this.f26738e = Build.VERSION.SDK_INT < 29 ? null : precomputedText;
    }

    /* compiled from: PrecomputedTextCompat.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @o0
        private final TextPaint f26739a;

        /* renamed from: b, reason: collision with root package name */
        @q0
        private final TextDirectionHeuristic f26740b;

        /* renamed from: c, reason: collision with root package name */
        private final int f26741c;

        /* renamed from: d, reason: collision with root package name */
        private final int f26742d;

        /* renamed from: e, reason: collision with root package name */
        final PrecomputedText.Params f26743e;

        /* compiled from: PrecomputedTextCompat.java */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            @o0
            private final TextPaint f26744a;

            /* renamed from: c, reason: collision with root package name */
            private int f26746c = 1;

            /* renamed from: d, reason: collision with root package name */
            private int f26747d = 1;

            /* renamed from: b, reason: collision with root package name */
            private TextDirectionHeuristic f26745b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public a(@o0 TextPaint textPaint) {
                this.f26744a = textPaint;
            }

            @o0
            public b a() {
                return new b(this.f26744a, this.f26745b, this.f26746c, this.f26747d);
            }

            @x0(23)
            public a b(int i4) {
                this.f26746c = i4;
                return this;
            }

            @x0(23)
            public a c(int i4) {
                this.f26747d = i4;
                return this;
            }

            public a d(@o0 TextDirectionHeuristic textDirectionHeuristic) {
                this.f26745b = textDirectionHeuristic;
                return this;
            }
        }

        b(@o0 TextPaint textPaint, @o0 TextDirectionHeuristic textDirectionHeuristic, int i4, int i5) {
            PrecomputedText.Params.Builder breakStrategy;
            PrecomputedText.Params.Builder hyphenationFrequency;
            PrecomputedText.Params.Builder textDirection;
            PrecomputedText.Params build;
            if (Build.VERSION.SDK_INT >= 29) {
                breakStrategy = z.a(textPaint).setBreakStrategy(i4);
                hyphenationFrequency = breakStrategy.setHyphenationFrequency(i5);
                textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
                build = textDirection.build();
                this.f26743e = build;
            } else {
                this.f26743e = null;
            }
            this.f26739a = textPaint;
            this.f26740b = textDirectionHeuristic;
            this.f26741c = i4;
            this.f26742d = i5;
        }

        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public boolean a(@o0 b bVar) {
            if (this.f26741c == bVar.f26741c && this.f26742d == bVar.f26742d && this.f26739a.getTextSize() == bVar.f26739a.getTextSize() && this.f26739a.getTextScaleX() == bVar.f26739a.getTextScaleX() && this.f26739a.getTextSkewX() == bVar.f26739a.getTextSkewX() && this.f26739a.getLetterSpacing() == bVar.f26739a.getLetterSpacing() && TextUtils.equals(this.f26739a.getFontFeatureSettings(), bVar.f26739a.getFontFeatureSettings()) && this.f26739a.getFlags() == bVar.f26739a.getFlags() && this.f26739a.getTextLocales().equals(bVar.f26739a.getTextLocales())) {
                return this.f26739a.getTypeface() == null ? bVar.f26739a.getTypeface() == null : this.f26739a.getTypeface().equals(bVar.f26739a.getTypeface());
            }
            return false;
        }

        @x0(23)
        public int b() {
            return this.f26741c;
        }

        @x0(23)
        public int c() {
            return this.f26742d;
        }

        @q0
        public TextDirectionHeuristic d() {
            return this.f26740b;
        }

        @o0
        public TextPaint e() {
            return this.f26739a;
        }

        public boolean equals(@q0 Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return a(bVar) && this.f26740b == bVar.f26740b;
        }

        public int hashCode() {
            return Objects.hash(Float.valueOf(this.f26739a.getTextSize()), Float.valueOf(this.f26739a.getTextScaleX()), Float.valueOf(this.f26739a.getTextSkewX()), Float.valueOf(this.f26739a.getLetterSpacing()), Integer.valueOf(this.f26739a.getFlags()), this.f26739a.getTextLocales(), this.f26739a.getTypeface(), Boolean.valueOf(this.f26739a.isElegantTextHeight()), this.f26740b, Integer.valueOf(this.f26741c), Integer.valueOf(this.f26742d));
        }

        public String toString() {
            String fontVariationSettings;
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f26739a.getTextSize());
            sb.append(", textScaleX=" + this.f26739a.getTextScaleX());
            sb.append(", textSkewX=" + this.f26739a.getTextSkewX());
            int i4 = Build.VERSION.SDK_INT;
            sb.append(", letterSpacing=" + this.f26739a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f26739a.isElegantTextHeight());
            sb.append(", textLocale=" + this.f26739a.getTextLocales());
            sb.append(", typeface=" + this.f26739a.getTypeface());
            if (i4 >= 26) {
                StringBuilder sb2 = new StringBuilder(", variationSettings=");
                fontVariationSettings = this.f26739a.getFontVariationSettings();
                sb2.append(fontVariationSettings);
                sb.append(sb2.toString());
            }
            sb.append(", textDir=" + this.f26740b);
            sb.append(", breakStrategy=" + this.f26741c);
            sb.append(", hyphenationFrequency=" + this.f26742d);
            sb.append("}");
            return sb.toString();
        }

        @x0(28)
        public b(@o0 PrecomputedText.Params params) {
            TextPaint textPaint;
            TextDirectionHeuristic textDirection;
            int breakStrategy;
            int hyphenationFrequency;
            textPaint = params.getTextPaint();
            this.f26739a = textPaint;
            textDirection = params.getTextDirection();
            this.f26740b = textDirection;
            breakStrategy = params.getBreakStrategy();
            this.f26741c = breakStrategy;
            hyphenationFrequency = params.getHyphenationFrequency();
            this.f26742d = hyphenationFrequency;
            this.f26743e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
