package androidx.core.text.util;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.u;
import androidx.annotation.x0;
import androidx.constraintlayout.motion.widget.r;
import androidx.core.text.util.c;
import androidx.core.util.o;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: LinkifyCompat.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f5189a = new String[0];

    /* renamed from: b, reason: collision with root package name */
    private static final Comparator<b> f5190b = new Comparator() { // from class: androidx.core.text.util.b
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int o5;
            o5 = c.o((c.b) obj, (c.b) obj2);
            return o5;
        }
    };

    /* compiled from: LinkifyCompat.java */
    @x0(24)
    static class a {
        private a() {
        }

        @u
        static void a(TextView textView, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
            Linkify.addLinks(textView, pattern, str, strArr, matchFilter, transformFilter);
        }

        @u
        static boolean b(Spannable spannable, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
            return Linkify.addLinks(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LinkifyCompat.java */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        URLSpan f5191a;

        /* renamed from: b, reason: collision with root package name */
        String f5192b;

        /* renamed from: c, reason: collision with root package name */
        int f5193c;

        /* renamed from: d, reason: collision with root package name */
        int f5194d;

        b() {
        }
    }

    /* compiled from: LinkifyCompat.java */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.text.util.c$c, reason: collision with other inner class name */
    public @interface InterfaceC0050c {
    }

    private c() {
    }

    private static void b(@o0 TextView textView) {
        if ((textView.getMovementMethod() instanceof LinkMovementMethod) || !textView.getLinksClickable()) {
            return;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static void c(@o0 TextView textView, @o0 Pattern pattern, @q0 String str) {
        if (r()) {
            Linkify.addLinks(textView, pattern, str);
        } else {
            e(textView, pattern, str, null, null, null);
        }
    }

    public static void d(@o0 TextView textView, @o0 Pattern pattern, @q0 String str, @q0 Linkify.MatchFilter matchFilter, @q0 Linkify.TransformFilter transformFilter) {
        if (r()) {
            Linkify.addLinks(textView, pattern, str, matchFilter, transformFilter);
        } else {
            e(textView, pattern, str, null, matchFilter, transformFilter);
        }
    }

    public static void e(@o0 TextView textView, @o0 Pattern pattern, @q0 String str, @q0 String[] strArr, @q0 Linkify.MatchFilter matchFilter, @q0 Linkify.TransformFilter transformFilter) {
        if (r()) {
            a.a(textView, pattern, str, strArr, matchFilter, transformFilter);
            return;
        }
        SpannableString valueOf = SpannableString.valueOf(textView.getText());
        if (i(valueOf, pattern, str, strArr, matchFilter, transformFilter)) {
            textView.setText(valueOf);
            b(textView);
        }
    }

    public static boolean f(@o0 Spannable spannable, int i5) {
        if (r()) {
            return Linkify.addLinks(spannable, i5);
        }
        if (i5 == 0) {
            return false;
        }
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int length = uRLSpanArr.length - 1; length >= 0; length--) {
            spannable.removeSpan(uRLSpanArr[length]);
        }
        if ((i5 & 4) != 0) {
            Linkify.addLinks(spannable, 4);
        }
        ArrayList arrayList = new ArrayList();
        if ((i5 & 1) != 0) {
            m(arrayList, spannable, o.f5275w, new String[]{"http://", "https://", "rtsp://"}, Linkify.sUrlMatchFilter, null);
        }
        if ((i5 & 2) != 0) {
            m(arrayList, spannable, o.A, new String[]{"mailto:"}, null, null);
        }
        if ((i5 & 8) != 0) {
            n(arrayList, spannable);
        }
        q(arrayList, spannable);
        if (arrayList.size() == 0) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f5191a == null) {
                k(bVar.f5192b, bVar.f5193c, bVar.f5194d, spannable);
            }
        }
        return true;
    }

    public static boolean g(@o0 Spannable spannable, @o0 Pattern pattern, @q0 String str) {
        return r() ? Linkify.addLinks(spannable, pattern, str) : i(spannable, pattern, str, null, null, null);
    }

    public static boolean h(@o0 Spannable spannable, @o0 Pattern pattern, @q0 String str, @q0 Linkify.MatchFilter matchFilter, @q0 Linkify.TransformFilter transformFilter) {
        return r() ? Linkify.addLinks(spannable, pattern, str, matchFilter, transformFilter) : i(spannable, pattern, str, null, matchFilter, transformFilter);
    }

    public static boolean i(@o0 Spannable spannable, @o0 Pattern pattern, @q0 String str, @q0 String[] strArr, @q0 Linkify.MatchFilter matchFilter, @q0 Linkify.TransformFilter transformFilter) {
        if (r()) {
            return a.b(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }
        if (str == null) {
            str = "";
        }
        if (strArr == null || strArr.length < 1) {
            strArr = f5189a;
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = str.toLowerCase(Locale.ROOT);
        int i5 = 0;
        while (i5 < strArr.length) {
            String str2 = strArr[i5];
            i5++;
            strArr2[i5] = str2 == null ? "" : str2.toLowerCase(Locale.ROOT);
        }
        Matcher matcher = pattern.matcher(spannable);
        boolean z5 = false;
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group(0);
            if ((matchFilter != null ? matchFilter.acceptMatch(spannable, start, end) : true) && group != null) {
                k(p(group, strArr2, matcher, transformFilter), start, end, spannable);
                z5 = true;
            }
        }
        return z5;
    }

    public static boolean j(@o0 TextView textView, int i5) {
        if (r()) {
            return Linkify.addLinks(textView, i5);
        }
        if (i5 == 0) {
            return false;
        }
        CharSequence text = textView.getText();
        if (!(text instanceof Spannable)) {
            SpannableString valueOf = SpannableString.valueOf(text);
            if (f(valueOf, i5)) {
                b(textView);
                textView.setText(valueOf);
                return true;
            }
        } else if (f((Spannable) text, i5)) {
            b(textView);
            return true;
        }
        return false;
    }

    private static void k(String str, int i5, int i6, Spannable spannable) {
        spannable.setSpan(new URLSpan(str), i5, i6, 33);
    }

    private static String l(String str) {
        return Build.VERSION.SDK_INT >= 28 ? WebView.findAddress(str) : androidx.core.text.util.a.c(str);
    }

    private static void m(ArrayList<b> arrayList, Spannable spannable, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group(0);
            if (matchFilter == null || matchFilter.acceptMatch(spannable, start, end)) {
                if (group != null) {
                    b bVar = new b();
                    bVar.f5192b = p(group, strArr, matcher, transformFilter);
                    bVar.f5193c = start;
                    bVar.f5194d = end;
                    arrayList.add(bVar);
                }
            }
        }
    }

    private static void n(ArrayList<b> arrayList, Spannable spannable) {
        int indexOf;
        String obj = spannable.toString();
        int i5 = 0;
        while (true) {
            try {
                String l5 = l(obj);
                if (l5 != null && (indexOf = obj.indexOf(l5)) >= 0) {
                    b bVar = new b();
                    int length = l5.length() + indexOf;
                    bVar.f5193c = indexOf + i5;
                    i5 += length;
                    bVar.f5194d = i5;
                    obj = obj.substring(length);
                    try {
                        bVar.f5192b = "geo:0,0?q=" + URLEncoder.encode(l5, "UTF-8");
                        arrayList.add(bVar);
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
                return;
            } catch (UnsupportedOperationException unused2) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int o(b bVar, b bVar2) {
        int i5 = bVar.f5193c;
        int i6 = bVar2.f5193c;
        if (i5 < i6) {
            return -1;
        }
        if (i5 > i6) {
            return 1;
        }
        return Integer.compare(bVar2.f5194d, bVar.f5194d);
    }

    private static String p(@o0 String str, @o0 String[] strArr, Matcher matcher, @q0 Linkify.TransformFilter transformFilter) {
        boolean z5;
        if (transformFilter != null) {
            str = transformFilter.transformUrl(matcher, str);
        }
        int length = strArr.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                z5 = false;
                break;
            }
            String str2 = strArr[i5];
            if (str.regionMatches(true, 0, str2, 0, str2.length())) {
                z5 = true;
                if (!str.regionMatches(false, 0, str2, 0, str2.length())) {
                    StringBuilder a6 = r.a(str2);
                    a6.append(str.substring(str2.length()));
                    str = a6.toString();
                }
            } else {
                i5++;
            }
        }
        return (z5 || strArr.length <= 0) ? str : androidx.concurrent.futures.a.a(new StringBuilder(), strArr[0], str);
    }

    private static void q(ArrayList<b> arrayList, Spannable spannable) {
        int i5;
        int i6 = 0;
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            b bVar = new b();
            bVar.f5191a = uRLSpan;
            bVar.f5193c = spannable.getSpanStart(uRLSpan);
            bVar.f5194d = spannable.getSpanEnd(uRLSpan);
            arrayList.add(bVar);
        }
        Collections.sort(arrayList, f5190b);
        int size = arrayList.size();
        while (i6 < size - 1) {
            b bVar2 = arrayList.get(i6);
            int i7 = i6 + 1;
            b bVar3 = arrayList.get(i7);
            int i8 = bVar2.f5193c;
            int i9 = bVar3.f5193c;
            if (i8 <= i9 && (i5 = bVar2.f5194d) > i9) {
                int i10 = bVar3.f5194d;
                int i11 = (i10 > i5 && i5 - i8 <= i10 - i9) ? i5 - i8 < i10 - i9 ? i6 : -1 : i7;
                if (i11 != -1) {
                    Object obj = arrayList.get(i11).f5191a;
                    if (obj != null) {
                        spannable.removeSpan(obj);
                    }
                    arrayList.remove(i11);
                    size--;
                }
            }
            i6 = i7;
        }
    }

    private static boolean r() {
        return Build.VERSION.SDK_INT >= 28;
    }
}
