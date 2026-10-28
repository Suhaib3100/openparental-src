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
import androidx.annotation.x0;
import androidx.compose.material3.j4;
import androidx.core.util.u;
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
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f26775a = new String[0];

    /* renamed from: b, reason: collision with root package name */
    private static final Comparator<b> f26776b = new androidx.core.text.util.b();

    /* compiled from: LinkifyCompat.java */
    @x0(24)
    static class a {
        private a() {
        }

        static void a(TextView textView, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
            Linkify.addLinks(textView, pattern, str, strArr, matchFilter, transformFilter);
        }

        static boolean b(Spannable spannable, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
            return Linkify.addLinks(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LinkifyCompat.java */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        URLSpan f26777a;

        /* renamed from: b, reason: collision with root package name */
        String f26778b;

        /* renamed from: c, reason: collision with root package name */
        int f26779c;

        /* renamed from: d, reason: collision with root package name */
        int f26780d;

        b() {
        }
    }

    /* compiled from: LinkifyCompat.java */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.text.util.c$c, reason: collision with other inner class name */
    public @interface InterfaceC0433c {
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
            Linkify.addLinks(textView, pattern, str, strArr, matchFilter, transformFilter);
            return;
        }
        SpannableString valueOf = SpannableString.valueOf(textView.getText());
        if (i(valueOf, pattern, str, strArr, matchFilter, transformFilter)) {
            textView.setText(valueOf);
            b(textView);
        }
    }

    public static boolean f(@o0 Spannable spannable, int i4) {
        if (r()) {
            return Linkify.addLinks(spannable, i4);
        }
        if (i4 == 0) {
            return false;
        }
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int length = uRLSpanArr.length - 1; length >= 0; length--) {
            spannable.removeSpan(uRLSpanArr[length]);
        }
        if ((i4 & 4) != 0) {
            Linkify.addLinks(spannable, 4);
        }
        ArrayList arrayList = new ArrayList();
        if ((i4 & 1) != 0) {
            m(arrayList, spannable, u.f26905w, new String[]{"http://", "https://", "rtsp://"}, Linkify.sUrlMatchFilter, null);
        }
        if ((i4 & 2) != 0) {
            m(arrayList, spannable, u.A, new String[]{"mailto:"}, null, null);
        }
        if ((i4 & 8) != 0) {
            n(arrayList, spannable);
        }
        q(arrayList, spannable);
        if (arrayList.size() == 0) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f26777a == null) {
                k(bVar.f26778b, bVar.f26779c, bVar.f26780d, spannable);
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
            return Linkify.addLinks(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }
        if (str == null) {
            str = "";
        }
        if (strArr == null || strArr.length < 1) {
            strArr = f26775a;
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = str.toLowerCase(Locale.ROOT);
        int i4 = 0;
        while (i4 < strArr.length) {
            String str2 = strArr[i4];
            i4++;
            strArr2[i4] = str2 == null ? "" : str2.toLowerCase(Locale.ROOT);
        }
        Matcher matcher = pattern.matcher(spannable);
        boolean z4 = false;
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group(0);
            if ((matchFilter != null ? matchFilter.acceptMatch(spannable, start, end) : true) && group != null) {
                k(p(group, strArr2, matcher, transformFilter), start, end, spannable);
                z4 = true;
            }
        }
        return z4;
    }

    public static boolean j(@o0 TextView textView, int i4) {
        if (r()) {
            return Linkify.addLinks(textView, i4);
        }
        if (i4 == 0) {
            return false;
        }
        CharSequence text = textView.getText();
        if (!(text instanceof Spannable)) {
            SpannableString valueOf = SpannableString.valueOf(text);
            if (f(valueOf, i4)) {
                b(textView);
                textView.setText(valueOf);
                return true;
            }
        } else if (f((Spannable) text, i4)) {
            b(textView);
            return true;
        }
        return false;
    }

    private static void k(String str, int i4, int i5, Spannable spannable) {
        spannable.setSpan(new URLSpan(str), i4, i5, 33);
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
                    bVar.f26778b = p(group, strArr, matcher, transformFilter);
                    bVar.f26779c = start;
                    bVar.f26780d = end;
                    arrayList.add(bVar);
                }
            }
        }
    }

    private static void n(ArrayList<b> arrayList, Spannable spannable) {
        int indexOf;
        String obj = spannable.toString();
        int i4 = 0;
        while (true) {
            try {
                String l4 = l(obj);
                if (l4 != null && (indexOf = obj.indexOf(l4)) >= 0) {
                    b bVar = new b();
                    int length = l4.length() + indexOf;
                    bVar.f26779c = indexOf + i4;
                    i4 += length;
                    bVar.f26780d = i4;
                    obj = obj.substring(length);
                    try {
                        bVar.f26778b = "geo:0,0?q=" + URLEncoder.encode(l4, "UTF-8");
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
        int i4 = bVar.f26779c;
        int i5 = bVar2.f26779c;
        if (i4 < i5) {
            return -1;
        }
        if (i4 > i5) {
            return 1;
        }
        return Integer.compare(bVar2.f26780d, bVar.f26780d);
    }

    private static String p(@o0 String str, @o0 String[] strArr, Matcher matcher, @q0 Linkify.TransformFilter transformFilter) {
        boolean z4;
        if (transformFilter != null) {
            str = transformFilter.transformUrl(matcher, str);
        }
        int length = strArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                z4 = false;
                break;
            }
            String str2 = strArr[i4];
            if (str.regionMatches(true, 0, str2, 0, str2.length())) {
                z4 = true;
                if (!str.regionMatches(false, 0, str2, 0, str2.length())) {
                    StringBuilder a5 = j4.a(str2);
                    a5.append(str.substring(str2.length()));
                    str = a5.toString();
                }
            } else {
                i4++;
            }
        }
        return (z4 || strArr.length <= 0) ? str : android.support.v4.media.c.a(new StringBuilder(), strArr[0], str);
    }

    private static void q(ArrayList<b> arrayList, Spannable spannable) {
        int i4;
        int i5 = 0;
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            b bVar = new b();
            bVar.f26777a = uRLSpan;
            bVar.f26779c = spannable.getSpanStart(uRLSpan);
            bVar.f26780d = spannable.getSpanEnd(uRLSpan);
            arrayList.add(bVar);
        }
        Collections.sort(arrayList, f26776b);
        int size = arrayList.size();
        while (i5 < size - 1) {
            b bVar2 = arrayList.get(i5);
            int i6 = i5 + 1;
            b bVar3 = arrayList.get(i6);
            int i7 = bVar2.f26779c;
            int i10 = bVar3.f26779c;
            if (i7 <= i10 && (i4 = bVar2.f26780d) > i10) {
                int i11 = bVar3.f26780d;
                int i12 = (i11 > i4 && i4 - i7 <= i11 - i10) ? i4 - i7 < i11 - i10 ? i5 : -1 : i6;
                if (i12 != -1) {
                    Object obj = arrayList.get(i12).f26777a;
                    if (obj != null) {
                        spannable.removeSpan(obj);
                    }
                    arrayList.remove(i12);
                    size--;
                }
            }
            i5 = i6;
        }
    }

    private static boolean r() {
        return Build.VERSION.SDK_INT >= 28;
    }
}
