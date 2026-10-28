package org.apache.commons.text.similarity;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.b1;
import org.apache.commons.lang3.k1;

/* compiled from: RegexTokenizer.java */
/* loaded from: classes3.dex */
class s implements v<CharSequence> {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f86667a = Pattern.compile("(\\w)+");

    s() {
    }

    @Override // org.apache.commons.text.similarity.v
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CharSequence[] a(CharSequence charSequence) {
        k1.B(b1.K0(charSequence), "Invalid text", new Object[0]);
        Matcher matcher = f86667a.matcher(charSequence);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            arrayList.add(matcher.group(0));
        }
        return (CharSequence[]) arrayList.toArray(new String[0]);
    }
}
